package com.finobank.pta.allowedtransaction;
public class DomainClassesMetadataFB20537E64034E3BED15CADAABACC7D4 {

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_allowedtransaction_CheckAllowedTransactionRequest_Metadata_INSTANCE = new com_finobank_pta_allowedtransaction_CheckAllowedTransactionRequest_Metadata();
    private static class com_finobank_pta_allowedtransaction_CheckAllowedTransactionRequest_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest.class;
        }

        @Override
        public int getPropertiesSize() {
            return 5;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "apiResponse": return 0;
                case "appId": return 1;
                case "productCode": return 2;
                case "tranType": return 3;
                case "userClass": return 4;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest");
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

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_allowedtransaction_CheckAllowedTransactionResponse_Metadata_INSTANCE = new com_finobank_pta_allowedtransaction_CheckAllowedTransactionResponse_Metadata();
    private static class com_finobank_pta_allowedtransaction_CheckAllowedTransactionResponse_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.allowedtransaction.CheckAllowedTransactionResponse.class;
        }

        @Override
        public int getPropertiesSize() {
            return 1;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "allowed": return 0;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.allowedtransaction.CheckAllowedTransactionResponse");
        }
    }

}