package com.finobank.pta.setsinglenullGLcode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetSingleNullGLCodeRequest {
    private static final Logger logger = LoggerFactory.getLogger(SetSingleNullGLCodeRequest.class);

    private String flagDebitCredit;
    private String tranType;
    private String appId;
    private String userClass;
    private String accountOrGLCode;
    private Map<String, String> apiResponse;

    public SetSingleNullGLCodeRequest() {

    }

    // public SetSingleNullGLCodeRequest(final String userclass, final String appid,
    // final String trantype, final String flagdebitcredit) {
    // this.flagDebitCredit = flagdebitcredit;
    // this.appId = appid;
    // this.userClass = userclass;
    // this.tranType = trantype;
    // }

    public String getFlagDebitCredit() {
        return flagDebitCredit;
    }

    public void setFlagDebitCredit(String flagDebitCredit) {
        this.flagDebitCredit = flagDebitCredit;
    }

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
     * @return the accountOrGLCode
     */
    public String getAccountOrGLCode() {
        return accountOrGLCode;
    }

    /**
     * @param accountOrGLCode the accountOrGLCode to set
     */
    public void setAccountOrGLCode(String accountOrGLCode) {
        this.accountOrGLCode = accountOrGLCode;
        this.apiResponse = new HashMap<String, String>();
        this.apiResponse.put("accountOrGLCode", this.accountOrGLCode);
    }

    /**
     * @return the apiResponse
     */
    public Map<String, String> getApiResponse() {
        return apiResponse;
    }

    /**
     * @param apiResponse the apiResponse to set
     */
    public void setApiResponse(Map<String, String> apiResponse) {
        this.apiResponse = apiResponse;
    }

    // public int compareCurrentDate(String inputDate)
    //         throws ParseException {
    //     logger.info("InputDate = " + inputDate);
    //     SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
    //     String currdate = sdformat.format(new Date());
    //     logger.info("currdate = " + currdate);
    //     Date tranDate = sdformat.parse(currdate);
    //     logger.info("tranDate = " + tranDate);
    //     Date ruleDate = sdformat.parse(inputDate);
    //     logger.info("ruleDate = " + ruleDate);
    //     int compare = tranDate.compareTo(ruleDate);
    //     logger.info("compare = " + compare);
    //     return compare;
    // }

}
