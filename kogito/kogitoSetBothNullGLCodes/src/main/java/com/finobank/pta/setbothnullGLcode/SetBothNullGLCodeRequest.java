package com.finobank.pta.setbothnullGLcode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetBothNullGLCodeRequest {
    private static final Logger logger = LoggerFactory.getLogger(SetBothNullGLCodeRequest.class);

    private String tranType;
    private String appId;
    private String userClass;
    private SetBothNullGLCodeResponse apiResponse;

    public SetBothNullGLCodeRequest() {
        this.apiResponse = new SetBothNullGLCodeResponse();
    }

    // public SetBothNullGLCodeRequest(final String userclass, final String appid,
    // final String trantype) {
    // this.appId = appid;
    // this.userClass = userclass;
    // this.tranType = trantype;
    // }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

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

    /**
     * @return the apiResponse
     */
    public SetBothNullGLCodeResponse getApiResponse() {
        return apiResponse;
    }

    /**
     * @param apiResponse the apiResponse to set
     */
    public void setApiResponse(SetBothNullGLCodeResponse apiResponse) {
        this.apiResponse = apiResponse;
    }

    public void setDrAccountOrGLCode(String drAccountOrGLCode) {
        this.apiResponse.setDrAccountOrGLCode(drAccountOrGLCode);
    }

    public void setCrAccountOrGLCode(String crAccountOrGLCode) {
        this.apiResponse.setCrAccountOrGLCode(crAccountOrGLCode);
    }

  
}
