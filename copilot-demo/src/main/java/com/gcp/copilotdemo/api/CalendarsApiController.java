package com.gcp.copilotdemo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
//@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
@Controller
@RequestMapping()
//@RequestMapping("${openapi.settlement.base-path:/stl/settlement/1.1.0}")
public class CalendarsApiController implements CalendarsApi {

    private final CalendarsApiDelegate delegate;

    public CalendarsApiController(@Autowired(required = false) CalendarsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CalendarsApiDelegate() {});
    }

    @Override
    public CalendarsApiDelegate getDelegate() {
        return delegate;
    }

}
