package com.finobank.pta.allowedtransaction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Deprecated
public class CheckAllowedTransactionRequest {

    private String appId;
    private String userClass;
    private String tranType;
    private String productCode;
    private CheckAllowedTransactionResponse apiResponse = new CheckAllowedTransactionResponse();
    private static final Logger logger = LoggerFactory.getLogger(CheckAllowedTransactionRequest.class);

    public CheckAllowedTransactionRequest() {

    }

    // public CheckAllowedTransactionRequest(final String appid, final String
    // userclass,
    // final String trantype, final String productcode) {
    // this.appId = appid;
    // this.userClass = userclass;
    // this.tranType = trantype;
    // this.productCode = productcode;
    // }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * @return the apiResponse
     */
    public CheckAllowedTransactionResponse getApiResponse() {
        return apiResponse;
    }

    /**
     * @param apiResponse the apiResponse to set
     */
    public void setApiResponse(CheckAllowedTransactionResponse apiResponse) {
        this.apiResponse = apiResponse;
    }

    public void setAllowed(boolean allowed) {
        this.apiResponse.setAllowed(allowed);
    }
}
