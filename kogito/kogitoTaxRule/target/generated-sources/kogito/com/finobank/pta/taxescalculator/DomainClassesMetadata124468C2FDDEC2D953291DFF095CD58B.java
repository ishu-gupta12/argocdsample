package com.finobank.pta.taxescalculator;
public class DomainClassesMetadata124468C2FDDEC2D953291DFF095CD58B {

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata_INSTANCE = new com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata();
    private static class com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.taxescalculator.TaxCalculationRequest.class;
        }

        @Override
        public int getPropertiesSize() {
            return 5;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "apiResponse": return 0;
                case "chargeAmount": return 1;
                case "finoBranchStateCode": return 2;
                case "inclusive": return 3;
                case "partnerStateCode": return 4;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.taxescalculator.TaxCalculationRequest");
        }
    }

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_taxescalculator_TaxCalculationResponse_Metadata_INSTANCE = new com_finobank_pta_taxescalculator_TaxCalculationResponse_Metadata();
    private static class com_finobank_pta_taxescalculator_TaxCalculationResponse_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.taxescalculator.TaxCalculationResponse.class;
        }

        @Override
        public int getPropertiesSize() {
            return 6;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "taxCGSTAmount": return 0;
                case "taxCGSTTranType": return 1;
                case "taxIGSTAmount": return 2;
                case "taxIGSTTranType": return 3;
                case "taxSGSTAmount": return 4;
                case "taxSGSTTranType": return 5;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.taxescalculator.TaxCalculationResponse");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_rules_SingletonStore_Metadata_INSTANCE = new org_kie_kogito_rules_SingletonStore_Metadata();
    private static class org_kie_kogito_rules_SingletonStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.rules.SingletonStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 0;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.kie.kogito.rules.SingletonStore");
        }
    }

}