package com.finobank.pta.taxescalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaxCalculationRequest {
    private static final Logger logger = LoggerFactory.getLogger(TaxCalculationRequest.class);

    private int partnerStateCode;
    private int finoBranchStateCode;
    private boolean inclusive;
    private double chargeAmount;
    private TaxCalculationResponse apiResponse = new TaxCalculationResponse();

    public TaxCalculationRequest() {
    }

    // public TaxCalculationRequest(final int partnerstate, final int finostate,
    // final double amount, final boolean isinclusive) {
    // this.partnerStateCode = partnerstate;
    // this.finoBranchStateCode = finostate;
    // this.chargeAmount = amount;
    // this.inclusive = isinclusive;
    // }

    public int getPartnerStateCode() {
        return partnerStateCode;
    }

    public void setPartnerStateCode(int partnerStateCode) {
        this.partnerStateCode = partnerStateCode;
    }

    public int getFinoBranchStateCode() {
        return finoBranchStateCode;
    }

    public void setFinoBranchStateCode(int finoBranchStateCode) {
        this.finoBranchStateCode = finoBranchStateCode;
    }

    public double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public boolean isInclusive() {
        return inclusive;
    }

    public void setInclusive(boolean inclusive) {
        this.inclusive = inclusive;
    }

    /**
     * @return the apiResponse
     */
    public TaxCalculationResponse getApiResponse() {
        return apiResponse;
    }

    /**
     * @param apiResponse the apiResponse to set
     */
    public void setApiResponse(TaxCalculationResponse apiResponse) {
        this.apiResponse = apiResponse;
    }

    public void setIGSTPercent(double igstPercent) {
        this.apiResponse.setIGSTPercent(igstPercent, this.getChargeAmount(), this.isInclusive());
    }

    public void setCSGSTPercent(double cgstPercent, double sgstPercent) {
        this.apiResponse.setCSGSTPercent(cgstPercent, sgstPercent, this.getChargeAmount(), this.isInclusive());
    }

    public void setTaxIGSTTranType(String taxIGSTTranType) {
        this.apiResponse.setTaxIGSTTranType(taxIGSTTranType);
        ;
    }

    public void setTaxCGSTTranType(String taxCGSTTranType) {
        this.apiResponse.setTaxCGSTTranType(taxCGSTTranType);
    }

    public void setTaxSGSTTranType(String taxSGSTTranType) {
        this.apiResponse.setTaxSGSTTranType(taxSGSTTranType);
    }

}
