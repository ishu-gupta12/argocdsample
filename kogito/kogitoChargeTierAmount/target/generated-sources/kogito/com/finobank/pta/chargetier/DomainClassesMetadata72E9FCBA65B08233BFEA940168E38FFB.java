package com.finobank.pta.chargetier;
public class DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB {

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE = new com_finobank_pta_chargetier_ChargeTierRequest_Metadata();
    private static class com_finobank_pta_chargetier_ChargeTierRequest_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.chargetier.ChargeTierRequest.class;
        }

        @Override
        public int getPropertiesSize() {
            return 4;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "apiResponse": return 0;
                case "chargeID": return 1;
                case "transactionAmount": return 2;
                case "uniqueTransactionId": return 3;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.chargetier.ChargeTierRequest");
        }
    }

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_chargetier_ChargeTierResponse_Metadata_INSTANCE = new com_finobank_pta_chargetier_ChargeTierResponse_Metadata();
    private static class com_finobank_pta_chargetier_ChargeTierResponse_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.chargetier.ChargeTierResponse.class;
        }

        @Override
        public int getPropertiesSize() {
            return 5;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "chargeAmount": return 0;
                case "chargeID": return 1;
                case "chargeType": return 2;
                case "transactionAmount": return 3;
                case "uniqueTransactionId": return 4;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.chargetier.ChargeTierResponse");
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