package com.finobank.pta.chargetier;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;

public class ChargeTierRequest {
    private static final Logger logger = LoggerFactory.getLogger(ChargeTierRequest.class);

    private String uniqueTransactionId;
    private String chargeID;
    private double transactionAmount;
    private ChargeTierResponse apiResponse = new ChargeTierResponse();

    public ChargeTierRequest() {

    }

    public String getUniqueTransactionId() {
        return uniqueTransactionId;
    }

    public void setUniqueTransactionId(String uniqueTransactionId) {
        this.uniqueTransactionId = uniqueTransactionId;
    }

    public String getChargeID() {
        return chargeID;
    }

    public void setChargeID(String chargeID) {
        this.chargeID = chargeID;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * @return the apiResponse
     */
    public ChargeTierResponse getApiResponse() {
        return apiResponse;
    }

    /**
     * @param apiResponse the apiResponse to set
     */
    public void setApiResponse(ChargeTierResponse apiResponse) {
        this.apiResponse = apiResponse;
    }

    public void setChargeDetails(String chargetype) {
        this.apiResponse.setUniqueTransactionId(this.getUniqueTransactionId());
        this.apiResponse.setChargeID(this.getChargeID());
        this.apiResponse.setChargeType(chargetype);
        this.apiResponse.setTransactionAmount(transactionAmount);
    }

    public void setRealChargeValue(final double chargevalue) {
        this.apiResponse.setRealChargeValue(chargevalue);
    }


}
