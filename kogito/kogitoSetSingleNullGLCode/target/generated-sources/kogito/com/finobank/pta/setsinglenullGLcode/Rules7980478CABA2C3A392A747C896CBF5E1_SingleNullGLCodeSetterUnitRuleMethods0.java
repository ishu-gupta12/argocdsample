package com.finobank.pta.setsinglenullGLcode;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;

public class Rules7980478CABA2C3A392A747C896CBF5E1_SingleNullGLCodeSetterUnitRuleMethods0 {

    /**
     * Rule name: Rule For PARTNER DHANUPAY – IMPS
     */
    public static org.drools.model.Rule rule_Rule_32For_32PARTNER_32DHANUPAY_32_8211_32IMPS() {
        final org.drools.model.Variable<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class,
                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                        "$request",
                                                                                                                                        D.entryPoint("singleCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setsinglenullGLcode",
                                            "Rule For PARTNER DHANUPAY – IMPS").unit(com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit.class)
                                                                               .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                          java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                     DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                               .build(D.pattern(var_$request).expr("GENERATED_62DF77523A20D68623E499B7BDCB376E",
                                                                                                                   com.finobank.pta.setsinglenullGLcode.P31.LambdaPredicate31CEB964CCAA0D26C4051943260BE555.INSTANCE,
                                                                                                                   D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                    org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                    DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                                                    com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor8715BA029050C049B0752423081DFA15.INSTANCE,
                                                                                                                                    "SYSTEMUSR4"),
                                                                                                                   D.reactOn("userClass")).expr("GENERATED_87B9AFEABD6CEB01FDCB4035DFC53450",
                                                                                                                                                com.finobank.pta.setsinglenullGLcode.PA1.LambdaPredicateA1CB01EAB75CBF1DE661C673683B6FF2.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                 DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                                                 com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor87B1C12B3B6B09BFBEA9146EA9F757CE.INSTANCE,
                                                                                                                                                                 "FINOTLR"),
                                                                                                                                                D.reactOn("appId")).expr("GENERATED_6BDACE3A73346A51FDB0B809A796C5DB",
                                                                                                                                                                         com.finobank.pta.setsinglenullGLcode.P48.LambdaPredicate48840CE5FC9FD54BAC76DE57E3903C40.INSTANCE,
                                                                                                                                                                         D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                          org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                          DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                                                          com.finobank.pta.setsinglenullGLcode.P21.LambdaExtractor21E35C0081C12B31E224FDF9AE7B308E.INSTANCE,
                                                                                                                                                                                          "DHAPIMPS"),
                                                                                                                                                                         D.reactOn("tranType")).expr("GENERATED_388104B9F38A1E33E670FE833D345AA9",
                                                                                                                                                                                                     com.finobank.pta.setsinglenullGLcode.P4E.LambdaPredicate4E561F30A6F854280310E9B300E1CB44.INSTANCE,
                                                                                                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                                      DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("flagDebitCredit"),
                                                                                                                                                                                                                      com.finobank.pta.setsinglenullGLcode.PC5.LambdaExtractorC500226763D6778BFAB2946E4FBB5BA0.INSTANCE,
                                                                                                                                                                                                                      "C"),
                                                                                                                                                                                                     D.reactOn("flagDebitCredit")),
                                                                                      D.on(var_$request).execute(com.finobank.pta.setsinglenullGLcode.PC3.LambdaConsequenceC3CE669FA62B98019007EE52A78E5E39.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule For PARTNER DHANUPAY – NEFT
     */
    public static org.drools.model.Rule rule_Rule_32For_32PARTNER_32DHANUPAY_32_8211_32NEFT() {
        final org.drools.model.Variable<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class,
                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                        "$request",
                                                                                                                                        D.entryPoint("singleCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setsinglenullGLcode",
                                            "Rule For PARTNER DHANUPAY – NEFT").unit(com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit.class)
                                                                               .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                          java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                     DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                               .build(D.pattern(var_$request).expr("GENERATED_62DF77523A20D68623E499B7BDCB376E",
                                                                                                                   com.finobank.pta.setsinglenullGLcode.P31.LambdaPredicate31CEB964CCAA0D26C4051943260BE555.INSTANCE,
                                                                                                                   D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                    org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                    DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                                                    com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor8715BA029050C049B0752423081DFA15.INSTANCE,
                                                                                                                                    "SYSTEMUSR4"),
                                                                                                                   D.reactOn("userClass")).expr("GENERATED_87B9AFEABD6CEB01FDCB4035DFC53450",
                                                                                                                                                com.finobank.pta.setsinglenullGLcode.PA1.LambdaPredicateA1CB01EAB75CBF1DE661C673683B6FF2.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                 DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                                                 com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor87B1C12B3B6B09BFBEA9146EA9F757CE.INSTANCE,
                                                                                                                                                                 "FINOTLR"),
                                                                                                                                                D.reactOn("appId")).expr("GENERATED_FCA6AABB7889F3AC57512EF6B0830595",
                                                                                                                                                                         com.finobank.pta.setsinglenullGLcode.P3A.LambdaPredicate3A4CDBE5C9980C028712A61059905A10.INSTANCE,
                                                                                                                                                                         D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                          org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                          DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                                                          com.finobank.pta.setsinglenullGLcode.P21.LambdaExtractor21E35C0081C12B31E224FDF9AE7B308E.INSTANCE,
                                                                                                                                                                                          "DHAPNEFT"),
                                                                                                                                                                         D.reactOn("tranType")).expr("GENERATED_388104B9F38A1E33E670FE833D345AA9",
                                                                                                                                                                                                     com.finobank.pta.setsinglenullGLcode.P4E.LambdaPredicate4E561F30A6F854280310E9B300E1CB44.INSTANCE,
                                                                                                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                                      DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("flagDebitCredit"),
                                                                                                                                                                                                                      com.finobank.pta.setsinglenullGLcode.PC5.LambdaExtractorC500226763D6778BFAB2946E4FBB5BA0.INSTANCE,
                                                                                                                                                                                                                      "C"),
                                                                                                                                                                                                     D.reactOn("flagDebitCredit")),
                                                                                      D.on(var_$request).execute(com.finobank.pta.setsinglenullGLcode.P5B.LambdaConsequence5B1EC82A30EFCC3605827E78AE59FB93.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule For PARTNER DHANUPAY– BENEVERIFICATION
     */
    public static org.drools.model.Rule rule_Rule_32For_32PARTNER_32DHANUPAY_8211_32BENEVERIFICATION() {
        final org.drools.model.Variable<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class,
                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                        "$request",
                                                                                                                                        D.entryPoint("singleCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setsinglenullGLcode",
                                            "Rule For PARTNER DHANUPAY– BENEVERIFICATION").unit(com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit.class)
                                                                                          .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                                     java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                                DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                          .build(D.pattern(var_$request).expr("GENERATED_62DF77523A20D68623E499B7BDCB376E",
                                                                                                                              com.finobank.pta.setsinglenullGLcode.P31.LambdaPredicate31CEB964CCAA0D26C4051943260BE555.INSTANCE,
                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                               DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                                                               com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor8715BA029050C049B0752423081DFA15.INSTANCE,
                                                                                                                                               "SYSTEMUSR4"),
                                                                                                                              D.reactOn("userClass")).expr("GENERATED_87B9AFEABD6CEB01FDCB4035DFC53450",
                                                                                                                                                           com.finobank.pta.setsinglenullGLcode.PA1.LambdaPredicateA1CB01EAB75CBF1DE661C673683B6FF2.INSTANCE,
                                                                                                                                                           D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                            org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                            DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                                                            com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor87B1C12B3B6B09BFBEA9146EA9F757CE.INSTANCE,
                                                                                                                                                                            "FINOTLR"),
                                                                                                                                                           D.reactOn("appId")).expr("GENERATED_F777C505F7FF23187E98A6A49B07AD8F",
                                                                                                                                                                                    com.finobank.pta.setsinglenullGLcode.P5B.LambdaPredicate5BFA2D1DD635B764ABCB782F90B0BFB2.INSTANCE,
                                                                                                                                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                     DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                                                                     com.finobank.pta.setsinglenullGLcode.P21.LambdaExtractor21E35C0081C12B31E224FDF9AE7B308E.INSTANCE,
                                                                                                                                                                                                     "DHAPBENE"),
                                                                                                                                                                                    D.reactOn("tranType")).expr("GENERATED_388104B9F38A1E33E670FE833D345AA9",
                                                                                                                                                                                                                com.finobank.pta.setsinglenullGLcode.P4E.LambdaPredicate4E561F30A6F854280310E9B300E1CB44.INSTANCE,
                                                                                                                                                                                                                D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                                                 org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                                                 DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("flagDebitCredit"),
                                                                                                                                                                                                                                 com.finobank.pta.setsinglenullGLcode.PC5.LambdaExtractorC500226763D6778BFAB2946E4FBB5BA0.INSTANCE,
                                                                                                                                                                                                                                 "C"),
                                                                                                                                                                                                                D.reactOn("flagDebitCredit")),
                                                                                                 D.on(var_$request).execute(com.finobank.pta.setsinglenullGLcode.PC3.LambdaConsequenceC3CE669FA62B98019007EE52A78E5E39.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule For PARTNER CASHIN – CASHIN
     */
    public static org.drools.model.Rule rule_Rule_32For_32PARTNER_32CASHIN_32_8211_32CASHIN() {
        final org.drools.model.Variable<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class,
                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                        "$request",
                                                                                                                                        D.entryPoint("singleCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setsinglenullGLcode",
                                            "Rule For PARTNER CASHIN – CASHIN").unit(com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit.class)
                                                                               .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                          java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                     DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                               .build(D.pattern(var_$request).expr("GENERATED_62DF77523A20D68623E499B7BDCB376E",
                                                                                                                   com.finobank.pta.setsinglenullGLcode.P31.LambdaPredicate31CEB964CCAA0D26C4051943260BE555.INSTANCE,
                                                                                                                   D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                    org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                    DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                                                    com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor8715BA029050C049B0752423081DFA15.INSTANCE,
                                                                                                                                    "SYSTEMUSR4"),
                                                                                                                   D.reactOn("userClass")).expr("GENERATED_87B9AFEABD6CEB01FDCB4035DFC53450",
                                                                                                                                                com.finobank.pta.setsinglenullGLcode.PA1.LambdaPredicateA1CB01EAB75CBF1DE661C673683B6FF2.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                 DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                                                 com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor87B1C12B3B6B09BFBEA9146EA9F757CE.INSTANCE,
                                                                                                                                                                 "FINOTLR"),
                                                                                                                                                D.reactOn("appId")).expr("GENERATED_BD0396AB3F371B68EF2685D19FF0D18C",
                                                                                                                                                                         com.finobank.pta.setsinglenullGLcode.PD4.LambdaPredicateD41E2C7F8DF2CB15683C2A90DF92940D.INSTANCE,
                                                                                                                                                                         D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                          org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                          DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                                                          com.finobank.pta.setsinglenullGLcode.P21.LambdaExtractor21E35C0081C12B31E224FDF9AE7B308E.INSTANCE,
                                                                                                                                                                                          "PTACASHIN"),
                                                                                                                                                                         D.reactOn("tranType")).expr("GENERATED_95995B7691983320E8698F690D79674E",
                                                                                                                                                                                                     com.finobank.pta.setsinglenullGLcode.P6B.LambdaPredicate6BE3777DF8E8FCAC910B270032B6A236.INSTANCE,
                                                                                                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                                      DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("flagDebitCredit"),
                                                                                                                                                                                                                      com.finobank.pta.setsinglenullGLcode.PC5.LambdaExtractorC500226763D6778BFAB2946E4FBB5BA0.INSTANCE,
                                                                                                                                                                                                                      "D"),
                                                                                                                                                                                                     D.reactOn("flagDebitCredit")),
                                                                                      D.on(var_$request).execute(com.finobank.pta.setsinglenullGLcode.P5B.LambdaConsequence5B1EC82A30EFCC3605827E78AE59FB93.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule For PARTNER CASHOUT – CASHOUT
     */
    public static org.drools.model.Rule rule_Rule_32For_32PARTNER_32CASHOUT_32_8211_32CASHOUT() {
        final org.drools.model.Variable<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class,
                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                        "$request",
                                                                                                                                        D.entryPoint("singleCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setsinglenullGLcode",
                                            "Rule For PARTNER CASHOUT – CASHOUT").unit(com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit.class)
                                                                                 .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                            java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                       DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                 .build(D.pattern(var_$request).expr("GENERATED_62DF77523A20D68623E499B7BDCB376E",
                                                                                                                     com.finobank.pta.setsinglenullGLcode.P31.LambdaPredicate31CEB964CCAA0D26C4051943260BE555.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                                                      com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor8715BA029050C049B0752423081DFA15.INSTANCE,
                                                                                                                                      "SYSTEMUSR4"),
                                                                                                                     D.reactOn("userClass")).expr("GENERATED_87B9AFEABD6CEB01FDCB4035DFC53450",
                                                                                                                                                  com.finobank.pta.setsinglenullGLcode.PA1.LambdaPredicateA1CB01EAB75CBF1DE661C673683B6FF2.INSTANCE,
                                                                                                                                                  D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                   org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                   DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                                                   com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor87B1C12B3B6B09BFBEA9146EA9F757CE.INSTANCE,
                                                                                                                                                                   "FINOTLR"),
                                                                                                                                                  D.reactOn("appId")).expr("GENERATED_1487032003A44EB2D33F7D2FA0673816",
                                                                                                                                                                           com.finobank.pta.setsinglenullGLcode.P50.LambdaPredicate509DC316A0BC76E977C04CCAC9C13116.INSTANCE,
                                                                                                                                                                           D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                            org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                            DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                                                            com.finobank.pta.setsinglenullGLcode.P21.LambdaExtractor21E35C0081C12B31E224FDF9AE7B308E.INSTANCE,
                                                                                                                                                                                            "PTACASHOUT"),
                                                                                                                                                                           D.reactOn("tranType")).expr("GENERATED_388104B9F38A1E33E670FE833D345AA9",
                                                                                                                                                                                                       com.finobank.pta.setsinglenullGLcode.P4E.LambdaPredicate4E561F30A6F854280310E9B300E1CB44.INSTANCE,
                                                                                                                                                                                                       D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                                        org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("flagDebitCredit"),
                                                                                                                                                                                                                        com.finobank.pta.setsinglenullGLcode.PC5.LambdaExtractorC500226763D6778BFAB2946E4FBB5BA0.INSTANCE,
                                                                                                                                                                                                                        "C"),
                                                                                                                                                                                                       D.reactOn("flagDebitCredit")),
                                                                                        D.on(var_$request).execute(com.finobank.pta.setsinglenullGLcode.P5B.LambdaConsequence5B1EC82A30EFCC3605827E78AE59FB93.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule For PARTNER SHIGHRAPAY – IMPS
     */
    public static org.drools.model.Rule rule_Rule_32For_32PARTNER_32SHIGHRAPAY_32_8211_32IMPS() {
        final org.drools.model.Variable<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class,
                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                        "$request",
                                                                                                                                        D.entryPoint("singleCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setsinglenullGLcode",
                                            "Rule For PARTNER SHIGHRAPAY – IMPS").unit(com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit.class)
                                                                                 .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                            java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                       DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                 .build(D.pattern(var_$request).expr("GENERATED_62DF77523A20D68623E499B7BDCB376E",
                                                                                                                     com.finobank.pta.setsinglenullGLcode.P31.LambdaPredicate31CEB964CCAA0D26C4051943260BE555.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                                                      com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor8715BA029050C049B0752423081DFA15.INSTANCE,
                                                                                                                                      "SYSTEMUSR4"),
                                                                                                                     D.reactOn("userClass")).expr("GENERATED_87B9AFEABD6CEB01FDCB4035DFC53450",
                                                                                                                                                  com.finobank.pta.setsinglenullGLcode.PA1.LambdaPredicateA1CB01EAB75CBF1DE661C673683B6FF2.INSTANCE,
                                                                                                                                                  D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                   org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                   DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                                                   com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor87B1C12B3B6B09BFBEA9146EA9F757CE.INSTANCE,
                                                                                                                                                                   "FINOTLR"),
                                                                                                                                                  D.reactOn("appId")).expr("GENERATED_F0C29E3916C4F63512D44CCA9DD1B753",
                                                                                                                                                                           com.finobank.pta.setsinglenullGLcode.P3F.LambdaPredicate3F4ED4ED0F6D9F18AA616AD5EE7F975C.INSTANCE,
                                                                                                                                                                           D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                            org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                            DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                                                            com.finobank.pta.setsinglenullGLcode.P21.LambdaExtractor21E35C0081C12B31E224FDF9AE7B308E.INSTANCE,
                                                                                                                                                                                            "SHGPIMPS"),
                                                                                                                                                                           D.reactOn("tranType")).expr("GENERATED_388104B9F38A1E33E670FE833D345AA9",
                                                                                                                                                                                                       com.finobank.pta.setsinglenullGLcode.P4E.LambdaPredicate4E561F30A6F854280310E9B300E1CB44.INSTANCE,
                                                                                                                                                                                                       D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                                        org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("flagDebitCredit"),
                                                                                                                                                                                                                        com.finobank.pta.setsinglenullGLcode.PC5.LambdaExtractorC500226763D6778BFAB2946E4FBB5BA0.INSTANCE,
                                                                                                                                                                                                                        "C"),
                                                                                                                                                                                                       D.reactOn("flagDebitCredit")),
                                                                                        D.on(var_$request).execute(com.finobank.pta.setsinglenullGLcode.PC3.LambdaConsequenceC3CE669FA62B98019007EE52A78E5E39.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule For PARTNER SHIGHRAPAY – NEFT
     */
    public static org.drools.model.Rule rule_Rule_32For_32PARTNER_32SHIGHRAPAY_32_8211_32NEFT() {
        final org.drools.model.Variable<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class,
                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                        "$request",
                                                                                                                                        D.entryPoint("singleCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setsinglenullGLcode",
                                            "Rule For PARTNER SHIGHRAPAY – NEFT").unit(com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit.class)
                                                                                 .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                            java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                       DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                 .build(D.pattern(var_$request).expr("GENERATED_62DF77523A20D68623E499B7BDCB376E",
                                                                                                                     com.finobank.pta.setsinglenullGLcode.P31.LambdaPredicate31CEB964CCAA0D26C4051943260BE555.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                                                      com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor8715BA029050C049B0752423081DFA15.INSTANCE,
                                                                                                                                      "SYSTEMUSR4"),
                                                                                                                     D.reactOn("userClass")).expr("GENERATED_87B9AFEABD6CEB01FDCB4035DFC53450",
                                                                                                                                                  com.finobank.pta.setsinglenullGLcode.PA1.LambdaPredicateA1CB01EAB75CBF1DE661C673683B6FF2.INSTANCE,
                                                                                                                                                  D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                   org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                   DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                                                   com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor87B1C12B3B6B09BFBEA9146EA9F757CE.INSTANCE,
                                                                                                                                                                   "FINOTLR"),
                                                                                                                                                  D.reactOn("appId")).expr("GENERATED_63332195BC9C4AC02936E247DBFAB8CA",
                                                                                                                                                                           com.finobank.pta.setsinglenullGLcode.P9D.LambdaPredicate9D239DDAD89F0182EEB34ECF73F1B53A.INSTANCE,
                                                                                                                                                                           D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                            org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                            DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                                                            com.finobank.pta.setsinglenullGLcode.P21.LambdaExtractor21E35C0081C12B31E224FDF9AE7B308E.INSTANCE,
                                                                                                                                                                                            "SHGPNEFT"),
                                                                                                                                                                           D.reactOn("tranType")).expr("GENERATED_388104B9F38A1E33E670FE833D345AA9",
                                                                                                                                                                                                       com.finobank.pta.setsinglenullGLcode.P4E.LambdaPredicate4E561F30A6F854280310E9B300E1CB44.INSTANCE,
                                                                                                                                                                                                       D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                                        org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("flagDebitCredit"),
                                                                                                                                                                                                                        com.finobank.pta.setsinglenullGLcode.PC5.LambdaExtractorC500226763D6778BFAB2946E4FBB5BA0.INSTANCE,
                                                                                                                                                                                                                        "C"),
                                                                                                                                                                                                       D.reactOn("flagDebitCredit")),
                                                                                        D.on(var_$request).execute(com.finobank.pta.setsinglenullGLcode.P5B.LambdaConsequence5B1EC82A30EFCC3605827E78AE59FB93.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule For PARTNER SHIGHRAPAY– BENEVERIFICATION
     */
    public static org.drools.model.Rule rule_Rule_32For_32PARTNER_32SHIGHRAPAY_8211_32BENEVERIFICATION() {
        final org.drools.model.Variable<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest.class,
                                                                                                                                        DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                        "$request",
                                                                                                                                        D.entryPoint("singleCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setsinglenullGLcode",
                                            "Rule For PARTNER SHIGHRAPAY– BENEVERIFICATION").unit(com.finobank.pta.setsinglenullGLcode.SingleNullGLCodeSetterUnit.class)
                                                                                            .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                                       java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                                  DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                            .build(D.pattern(var_$request).expr("GENERATED_62DF77523A20D68623E499B7BDCB376E",
                                                                                                                                com.finobank.pta.setsinglenullGLcode.P31.LambdaPredicate31CEB964CCAA0D26C4051943260BE555.INSTANCE,
                                                                                                                                D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                 org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                 DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                                                                 com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor8715BA029050C049B0752423081DFA15.INSTANCE,
                                                                                                                                                 "SYSTEMUSR4"),
                                                                                                                                D.reactOn("userClass")).expr("GENERATED_87B9AFEABD6CEB01FDCB4035DFC53450",
                                                                                                                                                             com.finobank.pta.setsinglenullGLcode.PA1.LambdaPredicateA1CB01EAB75CBF1DE661C673683B6FF2.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                              DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                                                              com.finobank.pta.setsinglenullGLcode.P87.LambdaExtractor87B1C12B3B6B09BFBEA9146EA9F757CE.INSTANCE,
                                                                                                                                                                              "FINOTLR"),
                                                                                                                                                             D.reactOn("appId")).expr("GENERATED_0BDA591A31CFCBAAD1C87F8C80BFC619",
                                                                                                                                                                                      com.finobank.pta.setsinglenullGLcode.P10.LambdaPredicate10796852662E47299B64A77BC058336B.INSTANCE,
                                                                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                       DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                                                                       com.finobank.pta.setsinglenullGLcode.P21.LambdaExtractor21E35C0081C12B31E224FDF9AE7B308E.INSTANCE,
                                                                                                                                                                                                       "SHGPBENE"),
                                                                                                                                                                                      D.reactOn("tranType")).expr("GENERATED_388104B9F38A1E33E670FE833D345AA9",
                                                                                                                                                                                                                  com.finobank.pta.setsinglenullGLcode.P4E.LambdaPredicate4E561F30A6F854280310E9B300E1CB44.INSTANCE,
                                                                                                                                                                                                                  D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                                                   org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                                                   DomainClassesMetadata7980478CABA2C3A392A747C896CBF5E1.com_finobank_pta_setsinglenullGLcode_SetSingleNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("flagDebitCredit"),
                                                                                                                                                                                                                                   com.finobank.pta.setsinglenullGLcode.PC5.LambdaExtractorC500226763D6778BFAB2946E4FBB5BA0.INSTANCE,
                                                                                                                                                                                                                                   "C"),
                                                                                                                                                                                                                  D.reactOn("flagDebitCredit")),
                                                                                                   D.on(var_$request).execute(com.finobank.pta.setsinglenullGLcode.PC3.LambdaConsequenceC3CE669FA62B98019007EE52A78E5E39.INSTANCE));
        return rule;
    }
}
