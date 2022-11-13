package com.gcp.copilotdemo.api;

import com.gcp.copilotdemo.data.entity.Settlement;
import com.gcp.copilotdemo.model.APIResponseModel;
import com.gcp.copilotdemo.model.OptionalIdentifiersModel;
import com.gcp.copilotdemo.model.SettlementModel;
import com.gcp.copilotdemo.service.SettlementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping()
public class SettlementsApiController implements SettlementsApi {

    private final SettlementsApiDelegate delegate;

    // autowire SettlementsServiceImpl
    @Autowired
    SettlementServiceImpl settlementsServiceImpl;

    public SettlementsApiController(@Autowired(required = false) SettlementsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new SettlementsApiDelegate() {});
    }

    @Override
    public SettlementsApiDelegate getDelegate() {
        return delegate;
    }

    // override createSettlement method
    @Override
    public APIResponseModel createSettlement(SettlementModel settlementModel)
    {
        Settlement stl = settlementsServiceImpl.createSettlement(settlementModel);

        APIResponseModel response = new APIResponseModel();
        response.setSettlementId(settlementModel.getId());
        response.setMessage("Settlement created successfully");
        response.setCode(HttpStatus.OK.toString());

        return response;
    }

    // override getSettlement method
    @Override
    public APIResponseModel getSettlementById(UUID settlementId) {
        Settlement stl = settlementsServiceImpl.getSettlementById(settlementId.toString());

        APIResponseModel response = new APIResponseModel();
        response.setSettlementId(stl.getSettlement_id());
        //response.setMessage("getSettlement By Id completed successfully");
        response.setMessage(stl.getSettlement_details());
        response.setCode(HttpStatus.OK.toString());

        return response;
    }

    // override markSettlement method
    @Override
    public APIResponseModel markSettlement(UUID settlementId, OptionalIdentifiersModel optionalIdentifiersModel) {

        APIResponseModel response = new APIResponseModel();
        response.setSettlementId(settlementId.toString());

        try {
            Settlement settlement = settlementsServiceImpl.updateSettlement(settlementId.toString(), optionalIdentifiersModel);
            response.setMessage("Settlement updated to " + settlement.getStatus());
            response.setCode(HttpStatus.OK.toString());
        }
        catch (Exception e) {
            response.setMessage(e.getMessage());
            response.setCode(HttpStatus.BAD_REQUEST.toString());
        }

        return response;
    }
}
