package com.finobank.pta.chargeaccount;
public class DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9 {

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

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_chargeaccount_ChargeAccountResponse_Metadata_INSTANCE = new com_finobank_pta_chargeaccount_ChargeAccountResponse_Metadata();
    private static class com_finobank_pta_chargeaccount_ChargeAccountResponse_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.chargeaccount.ChargeAccountResponse.class;
        }

        @Override
        public int getPropertiesSize() {
            return 7;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "chargeAccount": return 0;
                case "chargeID": return 1;
                case "chargeTranType": return 2;
                case "chargeType": return 3;
                case "chargeValue": return 4;
                case "taxInclusiveInCharge": return 5;
                case "tieredCharge": return 6;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.chargeaccount.ChargeAccountResponse");
        }
    }

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE = new com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata();
    private static class com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.chargeaccount.ChargeAccountRequest.class;
        }

        @Override
        public int getPropertiesSize() {
            return 5;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "apiResponse": return 0;
                case "appid": return 1;
                case "productid": return 2;
                case "transactionamt": return 3;
                case "trantype": return 4;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.chargeaccount.ChargeAccountRequest");
        }
    }

}