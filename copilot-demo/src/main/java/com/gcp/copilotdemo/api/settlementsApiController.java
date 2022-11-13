package com.gcp.copilotdemo.api;

import com.gcp.copilotdemo.model.APIResponseModel;
import com.gcp.copilotdemo.model.OptionalIdentifiersModel;
import com.gcp.copilotdemo.model.SettlementModel;
import com.gcp.copilotdemo.service.SettlementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping()
public class settlementsApiController implements SettlementsApi {

    private final SettlementsApiDelegate delegate;

    // autowire SettlementsService
    @Autowired
    SettlementsService settlementsService;

    public settlementsApiController(@Autowired(required = false) SettlementsApiDelegate delegate) {
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
        ResponseEntity<SettlementModel> stl = settlementsService.createSettlement(settlementModel);

        APIResponseModel response = new APIResponseModel();
        response.setSettlementId(settlementModel.getId());
        response.setMessage("Settlement created successfully");
        response.setCode(HttpStatus.OK.toString());

        return response;
    }

    // override getSettlement method
    @Override
    public APIResponseModel getSettlementById(UUID settlementId) {
        ResponseEntity<SettlementModel> stl = settlementsService.getSettlementById(settlementId);

        APIResponseModel response = new APIResponseModel();
        response.setSettlementId(settlementId.toString());
        response.setMessage("getSettlement By Id completed successfully");
        response.setCode(HttpStatus.OK.toString());

        return response;
    }

    // override markSettlement method
    @Override
    public APIResponseModel markSettlement(UUID settlementId, OptionalIdentifiersModel optionalIdentifiersModel) {
        APIResponseModel response = settlementsService.markSettlement(settlementId, optionalIdentifiersModel);

        return response;
        //return ResponseEntity.status(response.getCode()).body(response.getMessage());
    }
}
