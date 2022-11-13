package com.gcp.copilotdemo.service;

import com.gcp.copilotdemo.model.APIResponseModel;
import com.gcp.copilotdemo.model.OptionalIdentifiersModel;
import com.gcp.copilotdemo.model.SettlementModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

// add service annotation
@Service
public class SettlementsService {
    public SettlementsService() {
    }

    // implement createSettlement method from SettlementsApi
    public ResponseEntity<SettlementModel> createSettlement(SettlementModel settlementModel) {
        System.out.println("SettlementsService - createSettlement: " + settlementModel.getId());
        return new ResponseEntity<>(settlementModel, HttpStatus.OK);
    }

    // implement getSettlement & markSettlement methods from SettlementsApi
    public ResponseEntity<SettlementModel> getSettlementById(UUID settlementId) {
        System.out.println("SettlementsService - getSettlementById: " + settlementId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public APIResponseModel markSettlement(UUID settlementId, OptionalIdentifiersModel optionalIdentifiersModel) {
        System.out.println("SettlementsService - markSettlement_1: " + settlementId);
        System.out.println("SettlementsService - markSettlement_2: " + optionalIdentifiersModel.toString());

        String settlementStatus = new String();
        APIResponseModel response = new APIResponseModel();

        // If all 3 ids are available then return an error
        if (optionalIdentifiersModel.getNetSettlementId() != null
                && optionalIdentifiersModel.getPaymentId() != null
                && optionalIdentifiersModel.getCancellationId() != null) {
            response.setSettlementId(settlementId.toString());
            response.setMessage("ERROR: All 3 ids cannot be provided at the same time");
            response.setCode(HttpStatus.BAD_REQUEST.toString());

            System.out.println("SettlementsService - markSettlement: " + response);
            return response;
        }
        // else return Success response
        else {
            // If optionalIdentifiersModel.netSettlementId is not null the status is AGGREGATED
            // Or If optionalIdentifiersModel.paymentId is not null the status is PAID
            // Or If optionalIdentifiersModel.cancellationId is not null the status is CANCELLED

            if (optionalIdentifiersModel.getNetSettlementId() != null) {
                settlementStatus = "AGGREGATED";
            } else if (optionalIdentifiersModel.getPaymentId() != null) {
                settlementStatus = "PAID";
            } else if (optionalIdentifiersModel.getCancellationId() != null) {
                settlementStatus = "CANCELLED";
            } else {
                settlementStatus = "UNKNOWN";
            }

            // Print the status
            System.out.println("SettlementsService - markSettlement_3: " + settlementStatus);

            response.setSettlementId(settlementId.toString());
            response.setMessage("Settlement status updated to " + settlementStatus);
            response.setCode(HttpStatus.OK.toString());

            return response;
        }
    }
}


