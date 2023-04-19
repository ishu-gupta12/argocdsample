package com.finobank.pta.chargeaccount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ChargeAccountResponse {
       
    private String chargeID;
    private String chargeAccount;
    private boolean tieredCharge;
    private String chargeType;
    private double chargeValue;
    private String chargeTranType;
    private boolean taxInclusiveInCharge;

    public ChargeAccountResponse() {

    }

    public String getChargeID() {
        return chargeID;
    }
    public void setChargeID(String chargeID) {
        this.chargeID = chargeID;
    }
    public String getChargeAccount() {
        return chargeAccount;
    }
    public void setChargeAccount(String chargeAccount) {
        this.chargeAccount = chargeAccount;
    }
    public boolean isTieredCharge() {
        return tieredCharge;
    }
    public void setTieredCharge(boolean tieredCharge) {
        this.tieredCharge = tieredCharge;
    }
    public String getChargeType() {
        return chargeType;
    }
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    public double getChargeValue() {
        return chargeValue;
    }
    public void setChargeValue(double chargeValue) {
        this.chargeValue = chargeValue;
    }

    public String getChargeTranType() {
        return chargeTranType;
    }

    public void setChargeTranType(String chargeTranType) {
        this.chargeTranType = chargeTranType;
    }

    public void setRealChargeValue(double chargeValue, double transactionamount) {
        if (this.getChargeType().equals("P")) {
            this.chargeValue = round(transactionamount * (chargeValue/100),2);
        }
        if (this.getChargeType().equals("F")) {
            this.chargeValue = chargeValue;
        }
        if (this.getChargeType().equals("NA")) {
            this.chargeValue = 0;
        }
    }


    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public boolean isTaxInclusiveInCharge() {
        return taxInclusiveInCharge;
    }

    public void setTaxInclusiveInCharge(boolean taxInclusiveInCharge) {
        this.taxInclusiveInCharge = taxInclusiveInCharge;
    }
    
}
