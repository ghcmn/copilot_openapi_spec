package com.gcp.copilotdemo.service;

import com.gcp.copilotdemo.data.entity.Settlement;
import com.gcp.copilotdemo.data.repository.SettlementRepository;
import com.gcp.copilotdemo.exception.BadRequestException;
import com.gcp.copilotdemo.model.OptionalIdentifiersModel;
import com.gcp.copilotdemo.model.SettlementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SettlementServiceImpl implements SettlementService {
    @Autowired
    private SettlementRepository settlementRepository;

    @Override
    public Settlement createSettlement(SettlementModel settlementModel) {
        Settlement settlement = new Settlement();
        settlement.setSettlement_id(settlementModel.getId());
        settlement.setSettlement_details(settlementModel.toString());
        settlement.setStatus("CREATED");
        settlement.setCreated_date(new Date());
        settlement.setUpdated_date(new Date());

        return settlementRepository.save(settlement);
    }

    @Override
    public Settlement getSettlementById(String settlementId) {
        return settlementRepository.findById(settlementId).get();
    }

    @Override
    public Settlement updateSettlement(String settlementId, OptionalIdentifiersModel optionalIdentifiersModel) throws Exception{
        Settlement settlement = settlementRepository.findById(settlementId).get();

        int idCheck = 0;
        if (optionalIdentifiersModel.getNetSettlementId() != null)
            idCheck++;
        if (optionalIdentifiersModel.getPaymentId() != null)
            idCheck++;
        if (optionalIdentifiersModel.getCancellationId() != null)
            idCheck++;

        if (idCheck > 1)
            throw new BadRequestException("ERROR: All 3 ids cannot be provided at the same time");
        else if (idCheck == 1) {
            // If optionalIdentifiersModel.netSettlementId is not null then update the id and set status as AGGREGATED
            // Or If optionalIdentifiersModel.paymentId is not null then update the id and set status as PAID
            // Or If optionalIdentifiersModel.cancellationId is not null then update the id and set status as CANCELLED

            if (optionalIdentifiersModel.getNetSettlementId() != null) {
                settlement.setNet_settlement_id(optionalIdentifiersModel.getNetSettlementId().toString());
                settlement.setStatus("AGGREGATED");
            }
            else if (optionalIdentifiersModel.getPaymentId() != null) {
                settlement.setPayment_id(optionalIdentifiersModel.getPaymentId().toString());
                settlement.setStatus("PAID");
            }
            else if (optionalIdentifiersModel.getCancellationId() != null) {
                settlement.setCancellation_id(optionalIdentifiersModel.getCancellationId().toString());
                settlement.setStatus("CANCELLED");
            }
            settlement.setUpdated_date(new Date());

            System.out.println("SettlementsService - markSettlement: " + settlement.getStatus());
        }

        return settlementRepository.save(settlement);
    }

    @Override
    public void deleteSettlement(String settlementId) {
        //settlementRepository.deleteById(settlementId);
        Settlement settlement = settlementRepository.findById(settlementId).get();
        settlement.setStatus("DELETED");
        settlement.setUpdated_date(new Date());
    }
}
