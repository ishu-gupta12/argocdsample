package com.finobank.pta.chargetier;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.chargetier.ChargeTierRequest;
import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;

public class Rules72E9FCBA65B08233BFEA940168E38FFB_ChargeTierCalculatorUnitRuleMethods7 {

    /**
     * Rule name: TIER-6303
     */
    public static org.drools.model.Rule rule_TIER_456303() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6303").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_E81FABC2FE2F7381BCB833A83BAA5ACE",
                                                                                            com.finobank.pta.chargetier.P4D.LambdaPredicate4D1D5006823A3C229765D6B940AF318C.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "306"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_641C5F79AF77B675135A439371F1C186",
                                                                                                                        com.finobank.pta.chargetier.PF4.LambdaPredicateF4AEB65F489B91EE35A82250F12A88F3.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4300.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_44BA6588CE3762166FCA5639EABCA9F0",
                                                                                                                                                             com.finobank.pta.chargetier.PDC.LambdaPredicateDC69BDAFFF929DAACE9FC695CD130DB6.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4400.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P9D.LambdaConsequence9D3F1DA0631BAE80FC9B60F5C9863E94.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6304
     */
    public static org.drools.model.Rule rule_TIER_456304() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6304").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_E81FABC2FE2F7381BCB833A83BAA5ACE",
                                                                                            com.finobank.pta.chargetier.P4D.LambdaPredicate4D1D5006823A3C229765D6B940AF318C.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "306"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_C9D4E3ECD090D70C4D0CA2F0F90E7D40",
                                                                                                                        com.finobank.pta.chargetier.PBF.LambdaPredicateBF1C8D30F8804F740B586DE327C94C41.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4400.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_B01099C9AA04E3B9807184856BDE8F68",
                                                                                                                                                             com.finobank.pta.chargetier.P6F.LambdaPredicate6F9E43218FD5A15A7C8BD4D18F64A1F8.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4500.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P5B.LambdaConsequence5BF61E9B90350766326567986774B6A3.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6305
     */
    public static org.drools.model.Rule rule_TIER_456305() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6305").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_E81FABC2FE2F7381BCB833A83BAA5ACE",
                                                                                            com.finobank.pta.chargetier.P4D.LambdaPredicate4D1D5006823A3C229765D6B940AF318C.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "306"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_31D92B2F389C46B5D995CF51305475D2",
                                                                                                                        com.finobank.pta.chargetier.PA9.LambdaPredicateA9C75708853FF9C489E0377D5CF0F239.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4500.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_BAAA8AC5B8346E14EFF97AF8AC392B66",
                                                                                                                                                             com.finobank.pta.chargetier.P73.LambdaPredicate7384BC44D0ED2AA16DF147A161A15B4F.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4600.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P24.LambdaConsequence2438CBAFC10C77B77263BF71920E3A58.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6306
     */
    public static org.drools.model.Rule rule_TIER_456306() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6306").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_E81FABC2FE2F7381BCB833A83BAA5ACE",
                                                                                            com.finobank.pta.chargetier.P4D.LambdaPredicate4D1D5006823A3C229765D6B940AF318C.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "306"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_50B3108BF8CEC30344FF4E1E753C0B68",
                                                                                                                        com.finobank.pta.chargetier.P30.LambdaPredicate30F2BE8E2484EF35C70DF64A4CAD8391.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4600.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_47DBEB661A1CE06BE19CBEC24D3377F4",
                                                                                                                                                             com.finobank.pta.chargetier.P07.LambdaPredicate07A7DF614A0F56F9929F10FF54C27551.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4700.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PED.LambdaConsequenceED7A71681C05E3B8F775895B6EEB52B8.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6307
     */
    public static org.drools.model.Rule rule_TIER_456307() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6307").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_E81FABC2FE2F7381BCB833A83BAA5ACE",
                                                                                            com.finobank.pta.chargetier.P4D.LambdaPredicate4D1D5006823A3C229765D6B940AF318C.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "306"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_C490D6333F99ACB1BB099E65D6E10DAE",
                                                                                                                        com.finobank.pta.chargetier.P72.LambdaPredicate72013630426C7F5EB868CEBC6A08ECB4.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4700.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_D6091EF01F1A0F79E36E0D919C7F7FFE",
                                                                                                                                                             com.finobank.pta.chargetier.P68.LambdaPredicate68042367101983DD4629727901B76C7A.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4800.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P41.LambdaConsequence412AB6B3AAAE5BDCF30EC50CDF3336EB.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6308
     */
    public static org.drools.model.Rule rule_TIER_456308() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6308").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_E81FABC2FE2F7381BCB833A83BAA5ACE",
                                                                                            com.finobank.pta.chargetier.P4D.LambdaPredicate4D1D5006823A3C229765D6B940AF318C.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "306"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_0DE3C289F2B5ED78D20A2ABC53175BDE",
                                                                                                                        com.finobank.pta.chargetier.PD8.LambdaPredicateD8123197B9AE4D9C90075FBDEE5756E9.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4800.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_9AD93DE482E54FE496D37E4970C7F2E4",
                                                                                                                                                             com.finobank.pta.chargetier.P2F.LambdaPredicate2F95558B4354EE9F75AB65D7D340D29E.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4900.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P23.LambdaConsequence23DEAB179CB3EE8E9647374E47F3C9AE.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6309
     */
    public static org.drools.model.Rule rule_TIER_456309() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6309").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_E81FABC2FE2F7381BCB833A83BAA5ACE",
                                                                                            com.finobank.pta.chargetier.P4D.LambdaPredicate4D1D5006823A3C229765D6B940AF318C.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "306"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_18BFB15E04D9C26526B2D8B1D3F48DCE",
                                                                                                                        com.finobank.pta.chargetier.P71.LambdaPredicate71DBF79A6517EE3768FC56479721DCB2.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4900.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_D50A62065A699547A329F80AC839E501",
                                                                                                                                                             com.finobank.pta.chargetier.P44.LambdaPredicate444E4F916FAF55EFA49BB15BC48FBB8C.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              9.99999999E8),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PAE.LambdaConsequenceAE9EE5D0EC416781AF14E1AC1CC26D9C.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6310
     */
    public static org.drools.model.Rule rule_TIER_456310() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6310").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_E4DC1ADE38D79A7BDAEA611416F2DE52",
                                                                                                                        com.finobank.pta.chargetier.P16.LambdaPredicate16D790B65FEF388FF38E1560F408538A.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         0.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_6D1502DE95328E501A9C9A1E1F8CB611",
                                                                                                                                                             com.finobank.pta.chargetier.P52.LambdaPredicate527BF6D19E0F851F55646DD9E58D0104.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1000.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P71.LambdaConsequence71DDD30367D24337C5AF8FB0437BC7C0.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6311
     */
    public static org.drools.model.Rule rule_TIER_456311() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6311").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_84F14175513CE7FA68D94C3A30C8424C",
                                                                                                                        com.finobank.pta.chargetier.PAA.LambdaPredicateAA1C75462AA64D29AFA7139921447434.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1000.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_754815B75E5C45171EA43259A13D939F",
                                                                                                                                                             com.finobank.pta.chargetier.P54.LambdaPredicate546B6C1857A294751C75D1CE969410B8.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1100.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P4F.LambdaConsequence4F2C6CB253E3DE9A0BC6B7E5419B342F.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6312
     */
    public static org.drools.model.Rule rule_TIER_456312() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6312").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_744569AAD793A5FD8976E310D87AF025",
                                                                                                                        com.finobank.pta.chargetier.P3F.LambdaPredicate3F40A0DCF6613F09221A48348F21C7F1.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1100.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_4150752FAE5706212FC4C7A16EB55CCA",
                                                                                                                                                             com.finobank.pta.chargetier.P44.LambdaPredicate440B2CD62F1E24A148C2B5220C457770.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1200.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P05.LambdaConsequence0573B28DF217AFABBAFB3580E0FFDF16.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6313
     */
    public static org.drools.model.Rule rule_TIER_456313() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6313").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_3A2C7E88FA01FBEDD7FF068E18CF1C4A",
                                                                                                                        com.finobank.pta.chargetier.P2E.LambdaPredicate2E01E33DCFD633FAF20FFFC183855215.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1200.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_2772A937433A347DE81DC013F0960470",
                                                                                                                                                             com.finobank.pta.chargetier.P4E.LambdaPredicate4EBD7F6A3F02BBEBB02C4E3A47C389DB.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1300.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PDD.LambdaConsequenceDDA67B71CCB6BAD13823BAB33B6C021D.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6314
     */
    public static org.drools.model.Rule rule_TIER_456314() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6314").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_B0A68012D674C4DC4797512768CD6D48",
                                                                                                                        com.finobank.pta.chargetier.PAF.LambdaPredicateAF608247F7E8BFF5C17C19BEDEDA1B78.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1300.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_ACBF3B768926A6886639D7605DB66D94",
                                                                                                                                                             com.finobank.pta.chargetier.P4A.LambdaPredicate4AA03A91051F40F86051044E49CEA10A.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1400.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P19.LambdaConsequence19487621A3725D98E80B5289F8322E58.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6315
     */
    public static org.drools.model.Rule rule_TIER_456315() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6315").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_9ED3BEB8933A883D61A9397D6C75CA81",
                                                                                                                        com.finobank.pta.chargetier.P00.LambdaPredicate00DEBAF09FB4CFF6CFA17ECE7565742D.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1400.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_D1C5AE19AAFE49389FC6D628A4AB4B1F",
                                                                                                                                                             com.finobank.pta.chargetier.P06.LambdaPredicate06377066683FEC043370ECD4B915C68C.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1500.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P87.LambdaConsequence87C9E9CCE638B1367BBE3B90721015F2.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6316
     */
    public static org.drools.model.Rule rule_TIER_456316() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6316").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_422BC5E2C2160DCE93E711EBE71BD94C",
                                                                                                                        com.finobank.pta.chargetier.PCC.LambdaPredicateCC6E88FEFB2BB4AE220322F3ED2A0CE2.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1500.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_376D6E602E2D1B7E00FE6E31D9F64D4C",
                                                                                                                                                             com.finobank.pta.chargetier.P44.LambdaPredicate44E040B059444E49D32F962C20B1A7C2.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1600.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P77.LambdaConsequence77092290D1F695FC15E4BBC0F2C03800.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6317
     */
    public static org.drools.model.Rule rule_TIER_456317() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6317").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_CB83BFA832353555E247097C499EA41A",
                                                                                                                        com.finobank.pta.chargetier.PCF.LambdaPredicateCFB3F05E9B807C8489059D8E06C286E1.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1600.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_BFC84E95E2DC8046ED3439E994CE3ED5",
                                                                                                                                                             com.finobank.pta.chargetier.P6E.LambdaPredicate6E1F4760A3E3F67F235676D24CFFF72A.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1700.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P1F.LambdaConsequence1F7738D835493F4F9FD911A64ED22936.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6318
     */
    public static org.drools.model.Rule rule_TIER_456318() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6318").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_C64FA9A247AC19BD6C63DB7608817497",
                                                                                                                        com.finobank.pta.chargetier.P7D.LambdaPredicate7DD6E29E9DD1AB0223AFF88AB0D59E53.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1700.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_3E6CF396742E17DC29D28C809DE0519B",
                                                                                                                                                             com.finobank.pta.chargetier.P32.LambdaPredicate329AE71F2384F62B0CBEFAB314848231.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1800.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P94.LambdaConsequence946BB945674EDEC1E1C56D559FC46DEE.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6319
     */
    public static org.drools.model.Rule rule_TIER_456319() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6319").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_F5B32C7F2B3129DC703B27A1378662D5",
                                                                                            com.finobank.pta.chargetier.P80.LambdaPredicate80E63B48CF9E914E29AF652289045C96.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "305"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_9A1DEFA168F3005590C348EC4262CDE3",
                                                                                                                        com.finobank.pta.chargetier.PFD.LambdaPredicateFD1E9F2E5FB6B3941F457EBFA6BF2143.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1800.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_65F0951CBC49F040471B3D3EEA27F19A",
                                                                                                                                                             com.finobank.pta.chargetier.P46.LambdaPredicate46803A466F4A1E2DE362C8DB091282E4.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              1900.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P83.LambdaConsequence834ADA0CAF2B60232EAEFC1741DB0D27.INSTANCE));
        return rule;
    }
}
