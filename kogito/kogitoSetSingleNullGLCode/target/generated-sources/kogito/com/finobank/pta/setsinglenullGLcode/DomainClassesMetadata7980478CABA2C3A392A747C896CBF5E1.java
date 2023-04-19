package com.finobank.pta.setsinglenullGLcode;
public class DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1 {

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

    public static final org.drools.model.DomainClassMetadata java_util_Map_Metadata_INSTANCE = new java_util_Map_Metadata();
    private static class java_util_Map_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return java.util.Map.class;
        }

        @Override
        public int getPropertiesSize() {
            return 1;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "empty": return 0;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface java.util.Map");
        }
    }

    public static final org.drools.model.DomainClassMetadata com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE = new com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata();
    private static class com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class;
        }

        @Override
        public int getPropertiesSize() {
            return 6;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "accountOrGLCode": return 0;
                case "apiResponse": return 1;
                case "appId": return 2;
                case "flagDebitCredit": return 3;
                case "tranType": return 4;
                case "userClass": return 5;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest");
        }
    }

}