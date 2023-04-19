package com.finobank.pta.chargeaccount;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChargeAccountRequest {

    private String trantype;
    private String appid;
    private String productid;
    private double transactionamt;
    private ChargeAccountResponse apiResponse = new ChargeAccountResponse();
    private static final Logger logger = LoggerFactory.getLogger(ChargeAccountRequest.class);
    public ChargeAccountRequest() {

    }

    // public ChargeAccountRequest(String tranType, String appId, String productId,
    // double transactionAmt) {
    // this.trantype = tranType;
    // this.appid = appId;
    // this.productid = productId;
    // this.transactionamt = transactionAmt;
    // }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public double getTransactionamt() {
        return transactionamt;
    }

    public void setTransactionamt(double transactionamt) {
        this.transactionamt = transactionamt;
    }

    /**
     * @return the apiResponse
     */
    public ChargeAccountResponse getApiResponse() {
        return apiResponse;
    }

    /**
     * @param apiResponse the apiResponse to set
     */
    public void setApiResponse(ChargeAccountResponse apiResponse) {
        this.apiResponse = apiResponse;
    }

    public void setChargeID(String chargeID) {
        this.apiResponse.setChargeID(chargeID);
    }

    public void setChargeType(String chargeType) {
        this.apiResponse.setChargeType(chargeType);
    }

    public void setTaxInclusiveInCharge(boolean taxInclusiveInCharge) {
        this.apiResponse.setTaxInclusiveInCharge(taxInclusiveInCharge);
    }

    public void setChargeAccount(String chargeAccount) {
        this.apiResponse.setChargeAccount(chargeAccount);
    }

    public void setTieredCharge(boolean tieredCharge) {
        this.apiResponse.setTieredCharge(tieredCharge);
    }

    public void setChargeTranType(String chargeTranType) {
        this.apiResponse.setChargeTranType(chargeTranType);
    }

    public void setRealChargeValue(double chargeValue) {
        this.apiResponse.setRealChargeValue(chargeValue, this.getTransactionamt());
    }
}
