package com.finobank.pta.setbothnullGLcode;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;

public class RulesF08758C3B0C48D1A8FEEB907D51082A5_BothNullGLCodeSetterUnitRuleMethods0 {

    /**
     * Rule name: Rule1
     */
    public static org.drools.model.Rule rule_Rule1() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule1").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("18-aug-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_2EDD8DB84E29DD29873ABCBBFE2647BB",
                                                                                        com.finobank.pta.setbothnullGLcode.PE9.LambdaPredicateE9BA3754050A52A6B53C933703FE6954.INSTANCE,
                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                         com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                         "SYSTEMUSER4"),
                                                                                        D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                     com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                      com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                      "FINOTLR"),
                                                                                                                     D.reactOn("appId")).expr("GENERATED_17563F763BB7962DEAA9D7DC5599C2CE",
                                                                                                                                              com.finobank.pta.setbothnullGLcode.PD5.LambdaPredicateD5AAC352FB730D84716E349CA9584CAB.INSTANCE,
                                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                               DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                               com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                               "SPCMIMPS"),
                                                                                                                                              D.reactOn("tranType")),
                                                           D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.P2A.LambdaConsequence2A36AF297AFA207FDAA0CEA062899565.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule2
     */
    public static org.drools.model.Rule rule_Rule2() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule2").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("18-aug-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_2EDD8DB84E29DD29873ABCBBFE2647BB",
                                                                                        com.finobank.pta.setbothnullGLcode.PE9.LambdaPredicateE9BA3754050A52A6B53C933703FE6954.INSTANCE,
                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                         com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                         "SYSTEMUSER4"),
                                                                                        D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                     com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                      com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                      "FINOTLR"),
                                                                                                                     D.reactOn("appId")).expr("GENERATED_F17CDCFACAFE0C4A3A3974F2EED92575",
                                                                                                                                              com.finobank.pta.setbothnullGLcode.P53.LambdaPredicate53916ADF4D56AA7F6DE93D869799E396.INSTANCE,
                                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                               DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                               com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                               "EKOIMPS"),
                                                                                                                                              D.reactOn("tranType")),
                                                           D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.PB4.LambdaConsequenceB4CAC5B323AE32AB27A673443D6E5CA0.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule3
     */
    public static org.drools.model.Rule rule_Rule3() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule3").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("18-aug-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_AFC42673CB978D4CB3D29488A5250F83",
                                                                                        com.finobank.pta.setbothnullGLcode.PDB.LambdaPredicateDBDCA2328F5CB16CF690205A4AECFACE.INSTANCE,
                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                         com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                         "SYSTEMUSR4"),
                                                                                        D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                     com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                      com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                      "FINOTLR"),
                                                                                                                     D.reactOn("appId")).expr("GENERATED_307189F1CDCD79AB48278E9A52682B1A",
                                                                                                                                              com.finobank.pta.setbothnullGLcode.P9B.LambdaPredicate9BDB8D39CB84FAC8151E857681558918.INSTANCE,
                                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                               DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                               com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                               "DHAPNEFT"),
                                                                                                                                              D.reactOn("tranType")),
                                                           D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.P85.LambdaConsequence85EAD78BE5C2DED440E08A348EDAF5AC.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule4
     */
    public static org.drools.model.Rule rule_Rule4() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule4").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("18-aug-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_2EDD8DB84E29DD29873ABCBBFE2647BB",
                                                                                        com.finobank.pta.setbothnullGLcode.PE9.LambdaPredicateE9BA3754050A52A6B53C933703FE6954.INSTANCE,
                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                         com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                         "SYSTEMUSER4"),
                                                                                        D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                     com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                      com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                      "FINOTLR"),
                                                                                                                     D.reactOn("appId")).expr("GENERATED_75112ECF90B64B3F6B2AC149A857D99B",
                                                                                                                                              com.finobank.pta.setbothnullGLcode.P3D.LambdaPredicate3D21BDC72C4A415A8961CD33B5544756.INSTANCE,
                                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                               DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                               com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                               "DHAPIMPS"),
                                                                                                                                              D.reactOn("tranType")),
                                                           D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.P2B.LambdaConsequence2B21DD0C3828D700670B5D882F1ACB0B.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule5
     */
    public static org.drools.model.Rule rule_Rule5() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule5").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("18-aug-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_AFC42673CB978D4CB3D29488A5250F83",
                                                                                        com.finobank.pta.setbothnullGLcode.PDB.LambdaPredicateDBDCA2328F5CB16CF690205A4AECFACE.INSTANCE,
                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                         com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                         "SYSTEMUSR4"),
                                                                                        D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                     com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                      com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                      "FINOTLR"),
                                                                                                                     D.reactOn("appId")).expr("GENERATED_75112ECF90B64B3F6B2AC149A857D99B",
                                                                                                                                              com.finobank.pta.setbothnullGLcode.P3D.LambdaPredicate3D21BDC72C4A415A8961CD33B5544756.INSTANCE,
                                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                               DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                               com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                               "DHAPIMPS"),
                                                                                                                                              D.reactOn("tranType")),
                                                           D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.PC6.LambdaConsequenceC65EF6BA1CB44516E8DAD6D2BE8AFFB5.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule6
     */
    public static org.drools.model.Rule rule_Rule6() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule6").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_2EDD8DB84E29DD29873ABCBBFE2647BB",
                                                                                        com.finobank.pta.setbothnullGLcode.PE9.LambdaPredicateE9BA3754050A52A6B53C933703FE6954.INSTANCE,
                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                         com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                         "SYSTEMUSER4"),
                                                                                        D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                     com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                      com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                      "FINOTLR"),
                                                                                                                     D.reactOn("appId")).expr("GENERATED_17563F763BB7962DEAA9D7DC5599C2CE",
                                                                                                                                              com.finobank.pta.setbothnullGLcode.PD5.LambdaPredicateD5AAC352FB730D84716E349CA9584CAB.INSTANCE,
                                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                               DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                               com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                               "SPCMIMPS"),
                                                                                                                                              D.reactOn("tranType")),
                                                           D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.P2A.LambdaConsequence2A36AF297AFA207FDAA0CEA062899565.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule7
     */
    public static org.drools.model.Rule rule_Rule7() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule7").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_2EDD8DB84E29DD29873ABCBBFE2647BB",
                                                                                        com.finobank.pta.setbothnullGLcode.PE9.LambdaPredicateE9BA3754050A52A6B53C933703FE6954.INSTANCE,
                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                         com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                         "SYSTEMUSER4"),
                                                                                        D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                     com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                      com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                      "FINOTLR"),
                                                                                                                     D.reactOn("appId")).expr("GENERATED_F17CDCFACAFE0C4A3A3974F2EED92575",
                                                                                                                                              com.finobank.pta.setbothnullGLcode.P53.LambdaPredicate53916ADF4D56AA7F6DE93D869799E396.INSTANCE,
                                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                               DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                               com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                               "EKOIMPS"),
                                                                                                                                              D.reactOn("tranType")),
                                                           D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.PB4.LambdaConsequenceB4CAC5B323AE32AB27A673443D6E5CA0.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule8
     */
    public static org.drools.model.Rule rule_Rule8() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule8").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_AFC42673CB978D4CB3D29488A5250F83",
                                                                                        com.finobank.pta.setbothnullGLcode.PDB.LambdaPredicateDBDCA2328F5CB16CF690205A4AECFACE.INSTANCE,
                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                         com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                         "SYSTEMUSR4"),
                                                                                        D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                     com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                      com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                      "FINOTLR"),
                                                                                                                     D.reactOn("appId")).expr("GENERATED_307189F1CDCD79AB48278E9A52682B1A",
                                                                                                                                              com.finobank.pta.setbothnullGLcode.P9B.LambdaPredicate9BDB8D39CB84FAC8151E857681558918.INSTANCE,
                                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                               DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                               com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                               "DHAPNEFT"),
                                                                                                                                              D.reactOn("tranType")),
                                                           D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.P85.LambdaConsequence85EAD78BE5C2DED440E08A348EDAF5AC.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule9
     */
    public static org.drools.model.Rule rule_Rule9() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule9").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_2EDD8DB84E29DD29873ABCBBFE2647BB",
                                                                                        com.finobank.pta.setbothnullGLcode.PE9.LambdaPredicateE9BA3754050A52A6B53C933703FE6954.INSTANCE,
                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                         com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                         "SYSTEMUSER4"),
                                                                                        D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                     com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                      DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                      com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                      "FINOTLR"),
                                                                                                                     D.reactOn("appId")).expr("GENERATED_75112ECF90B64B3F6B2AC149A857D99B",
                                                                                                                                              com.finobank.pta.setbothnullGLcode.P3D.LambdaPredicate3D21BDC72C4A415A8961CD33B5544756.INSTANCE,
                                                                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                               DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                               com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                               "DHAPIMPS"),
                                                                                                                                              D.reactOn("tranType")),
                                                           D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.P2B.LambdaConsequence2B21DD0C3828D700670B5D882F1ACB0B.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule10
     */
    public static org.drools.model.Rule rule_Rule10() {
        final org.drools.model.Variable<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest> var_$request = D.declarationOf(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest.class,
                                                                                                                                    DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE,
                                                                                                                                    "$request",
                                                                                                                                    D.entryPoint("bothCodeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.setbothnullGLcode",
                                            "Rule10").unit(com.finobank.pta.setbothnullGLcode.BothNullGLCodeSetterUnit.class)
                                                     .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                           DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                     .build(D.pattern(var_$request).expr("GENERATED_AFC42673CB978D4CB3D29488A5250F83",
                                                                                         com.finobank.pta.setbothnullGLcode.PDB.LambdaPredicateDBDCA2328F5CB16CF690205A4AECFACE.INSTANCE,
                                                                                         D.alphaIndexedBy(java.lang.String.class,
                                                                                                          org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                          DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("userClass"),
                                                                                                          com.finobank.pta.setbothnullGLcode.P48.LambdaExtractor48A607997E5ED69949819A3ABE710D9F.INSTANCE,
                                                                                                          "SYSTEMUSR4"),
                                                                                         D.reactOn("userClass")).expr("GENERATED_78F0E141AFC2652D04917D06BDF33A20",
                                                                                                                      com.finobank.pta.setbothnullGLcode.PDA.LambdaPredicateDAFA972BCC782EC769E9EB3C596D8345.INSTANCE,
                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                       DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("appId"),
                                                                                                                                       com.finobank.pta.setbothnullGLcode.P9E.LambdaExtractor9E21893D8A8174E1CC882FC97D35C342.INSTANCE,
                                                                                                                                       "FINOTLR"),
                                                                                                                      D.reactOn("appId")).expr("GENERATED_75112ECF90B64B3F6B2AC149A857D99B",
                                                                                                                                               com.finobank.pta.setbothnullGLcode.P3D.LambdaPredicate3D21BDC72C4A415A8961CD33B5544756.INSTANCE,
                                                                                                                                               D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                DomainClassesMetadataF08758C3B0C48D1A8FEEB907D51082A5.com_finobank_pta_setbothnullGLcode_SetBothNullGLCodeRequest_Metadata_INSTANCE.getPropertyIndex("tranType"),
                                                                                                                                                                com.finobank.pta.setbothnullGLcode.P08.LambdaExtractor08D3FA6AECCAF0FE250985193E569C37.INSTANCE,
                                                                                                                                                                "DHAPIMPS"),
                                                                                                                                               D.reactOn("tranType")),
                                                            D.on(var_$request).execute(com.finobank.pta.setbothnullGLcode.PC6.LambdaConsequenceC65EF6BA1CB44516E8DAD6D2BE8AFFB5.INSTANCE));
        return rule;
    }
}
