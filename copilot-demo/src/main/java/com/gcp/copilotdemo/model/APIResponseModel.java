package com.gcp.copilotdemo.model;

public class APIResponseModel {
    private String message;
    private String code;
    private String settlementId;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
    }

    @Override
    public String toString() {
        return "APIResponseModel{" +
                " message='" + message +
                ", code='" + code +
                ", settlementId='" + settlementId + " }";
    }
}

