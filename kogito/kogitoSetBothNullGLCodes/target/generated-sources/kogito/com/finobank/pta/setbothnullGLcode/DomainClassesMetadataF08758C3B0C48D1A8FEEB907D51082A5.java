package com.finobank.pta.setbothnullGLcode;
public class DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5 {

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

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE = new com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata();
    private static class com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class;
        }

        @Override
        public int getPropertiesSize() {
            return 4;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "apiResponse": return 0;
                case "appId": return 1;
                case "tranType": return 2;
                case "userClass": return 3;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest");
        }
    }

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeResponse_Metadata_INSTANCE = new com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeResponse_Metadata();
    private static class com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeResponse_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse.class;
        }

        @Override
        public int getPropertiesSize() {
            return 2;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "crAccountOrGLCode": return 0;
                case "drAccountOrGLCode": return 1;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse");
        }
    }

}