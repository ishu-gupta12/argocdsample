package com.finobank.pta.chargetier;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ChargeTierResponse {

    private String uniqueTransactionId;
    private String chargeID;
    private double transactionAmount;
    private double chargeAmount;
    private String chargeType;
    

    public ChargeTierResponse() {

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


    public double getChargeAmount() {
        return chargeAmount;
    }


    public void setChargeAmount(double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getChargeType() {
        return chargeType;
    }


    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }


    // public void setChargeDetails(final ChargeTierRequest request, String chargetype) {
    //     this.uniqueTransactionId = request.getUniqueTransactionId();
    //     this.chargeID = request.getChargeID();
    //     this.chargeType = chargetype;
    //     this.transactionAmount = request.getTransactionAmount();
    // }


    public void setRealChargeValue(final double chargevalue) {
        if (this.chargeType.equals("P")) {
            this.chargeAmount = round(this.transactionAmount * (chargevalue/100),2);
        } else {
            this.chargeAmount = chargevalue;
        }
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
