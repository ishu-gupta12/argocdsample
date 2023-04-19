package com.finobank.pta.taxescalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculationResponse {
       
    private double taxIGSTAmount;
    private String taxIGSTTranType;
    private double taxCGSTAmount;
    private String taxCGSTTranType;
    private double taxSGSTAmount;
    private String taxSGSTTranType;

    public TaxCalculationResponse() {

    }

    
    public double getTaxIGSTAmount() {
        return taxIGSTAmount;
    }


    public void setTaxIGSTAmount(double taxIGSTAmount) {
        this.taxIGSTAmount = taxIGSTAmount;
    }


    public double getTaxCGSTAmount() {
        return taxCGSTAmount;
    }


    public void setTaxCGSTAmount(double taxCGSTAmount) {
        this.taxCGSTAmount = taxCGSTAmount;
    }


    public double getTaxSGSTAmount() {
        return taxSGSTAmount;
    }


    public void setTaxSGSTAmount(double taxSGSTAmount) {
        this.taxSGSTAmount = taxSGSTAmount;
    }


    
    public String getTaxIGSTTranType() {
        return taxIGSTTranType;
    }


    public void setTaxIGSTTranType(String taxIGSTTranType) {
        this.taxIGSTTranType = taxIGSTTranType;
    }


    public String getTaxCGSTTranType() {
        return taxCGSTTranType;
    }


    public void setTaxCGSTTranType(String taxCGSTTranType) {
        this.taxCGSTTranType = taxCGSTTranType;
    }


    public String getTaxSGSTTranType() {
        return taxSGSTTranType;
    }


    public void setTaxSGSTTranType(String taxSGSTTranType) {
        this.taxSGSTTranType = taxSGSTTranType;
    }


    public void setIGSTPercent(double igstPercent, double chargeamount, boolean inclusive) {
        if (inclusive) {
            this.taxIGSTAmount = round(chargeamount - (chargeamount / (100 + igstPercent) * 100),2);
        } else {
            this.taxIGSTAmount = round(chargeamount * igstPercent / 100,2);
        }
    }

    public void setCSGSTPercent(double cgstPercent, double sgstPercent,
                               double chargeamount, boolean inclusive) {
    
        if (inclusive) {
            double totalInclusiveTaxPercent = cgstPercent + sgstPercent;
            double totalInclusiveTaxAmount = round(chargeamount - (chargeamount / (100 + totalInclusiveTaxPercent) * 100),2);
            if (totalInclusiveTaxAmount == 0) {
                this.taxCGSTAmount = 0;
                this.taxCGSTAmount = 0;
            } else {
                this.taxCGSTAmount = round(cgstPercent / totalInclusiveTaxPercent * totalInclusiveTaxAmount,2);
                this.taxSGSTAmount = round(sgstPercent / totalInclusiveTaxPercent * totalInclusiveTaxAmount,2);
            }
        } else {
            this.taxCGSTAmount = round(chargeamount * cgstPercent / 100,2);
            this.taxSGSTAmount = round(chargeamount * sgstPercent / 100,2);
        }
    }


    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
}
