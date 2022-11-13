package com.gcp.copilotdemo.service;

import com.gcp.copilotdemo.data.entity.Settlement;
import com.gcp.copilotdemo.model.OptionalIdentifiersModel;
import com.gcp.copilotdemo.model.SettlementModel;

public interface SettlementService {
    // create settlement
    Settlement createSettlement(SettlementModel settlementModel);

    // get settlement by id
    Settlement getSettlementById(String settlementId);

    // update settlement
    Settlement updateSettlement(String settlementId, OptionalIdentifiersModel optionalIdentifiersModel) throws Exception;

    // delete settlement
    void deleteSettlement(String settlementId);
}


