package com.gcp.copilotdemo.api;

import com.gcp.copilotdemo.model.ProblemFormatItemModel;
import com.gcp.copilotdemo.model.SettlementModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RestController
@RequestMapping()
public class settlementsApiController implements SettlementsApi {

    private final SettlementsApiDelegate delegate;

    public settlementsApiController(@Autowired(required = false) SettlementsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new SettlementsApiDelegate() {});
    }

    @Override
    public SettlementsApiDelegate getDelegate() {
        return delegate;
    }
}
