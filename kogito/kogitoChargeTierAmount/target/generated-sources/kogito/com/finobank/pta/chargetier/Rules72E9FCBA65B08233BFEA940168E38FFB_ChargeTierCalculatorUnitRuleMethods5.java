package com.finobank.pta.chargetier;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.chargetier.ChargeTierRequest;
import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;

public class Rules72E9FCBA65B08233BFEA940168E38FFB_ChargeTierCalculatorUnitRuleMethods5 {

    /**
     * Rule name: TIER-6269
     */
    public static org.drools.model.Rule rule_TIER_456269() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6269").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_0CBBE735263F5E9D54F8ADAD111F0798",
                                                                                                                        com.finobank.pta.chargetier.PB4.LambdaPredicateB448215112EC045BA250B3AF7DC64CB8.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1.01),
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
     * Rule name: TIER-6270
     */
    public static org.drools.model.Rule rule_TIER_456270() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6270").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6271
     */
    public static org.drools.model.Rule rule_TIER_456271() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6271").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6272
     */
    public static org.drools.model.Rule rule_TIER_456272() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6272").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6273
     */
    public static org.drools.model.Rule rule_TIER_456273() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6273").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6274
     */
    public static org.drools.model.Rule rule_TIER_456274() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6274").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6275
     */
    public static org.drools.model.Rule rule_TIER_456275() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6275").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6276
     */
    public static org.drools.model.Rule rule_TIER_456276() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6276").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6277
     */
    public static org.drools.model.Rule rule_TIER_456277() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6277").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6278
     */
    public static org.drools.model.Rule rule_TIER_456278() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6278").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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

    /**
     * Rule name: TIER-6279
     */
    public static org.drools.model.Rule rule_TIER_456279() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6279").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_F2AAC15333B9D421328C2D35F59BF0FF",
                                                                                                                        com.finobank.pta.chargetier.P9F.LambdaPredicate9F7FAAC28A53CD87D784BC434C6EBEA8.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         1900.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_8F5D765FCF04C446282DEAEBFC26C231",
                                                                                                                                                             com.finobank.pta.chargetier.PE8.LambdaPredicateE8F121923F81CD3A11E928C1C29BB953.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2000.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PF1.LambdaConsequenceF1D63DE56E6A6E95276701B391597BE4.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6280
     */
    public static org.drools.model.Rule rule_TIER_456280() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6280").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_FE1FE978472F3EC3A3F7B599A1088C8A",
                                                                                                                        com.finobank.pta.chargetier.P6D.LambdaPredicate6D8CCB45072DEDF2FBFA5A1C424092FE.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2000.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_5B3B4C29998CEBDE2E4E282F8218CE21",
                                                                                                                                                             com.finobank.pta.chargetier.P89.LambdaPredicate893030ACE42F7DA5B2DBC0D2D473816F.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2100.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PF0.LambdaConsequenceF0F30C69B96E513837E861333606FC7B.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6281
     */
    public static org.drools.model.Rule rule_TIER_456281() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6281").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_20740376C849AC69F327110B2C813F55",
                                                                                                                        com.finobank.pta.chargetier.P39.LambdaPredicate3900A948E8DBBA56F54D3079EB76FDFB.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2100.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_3ECD3305706CB9B412CFC3595D581C63",
                                                                                                                                                             com.finobank.pta.chargetier.P21.LambdaPredicate218CBDCC80F251B6FF0F607564CB7CC0.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2200.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PCC.LambdaConsequenceCCC14A83638C1F20A521F5B98121D28D.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6282
     */
    public static org.drools.model.Rule rule_TIER_456282() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6282").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_7A9F8200345A691F8264E8AC3DE938D5",
                                                                                                                        com.finobank.pta.chargetier.P14.LambdaPredicate14D2BC31DDBF67ADA971E3593B1E5DAC.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2200.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_2EE547F0EDAF41E8EA4E438741DCD3A8",
                                                                                                                                                             com.finobank.pta.chargetier.P8A.LambdaPredicate8AE3B47F3FDC72CD7E427A84865AC454.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2300.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P13.LambdaConsequence1374E9881FE0C1D8DD50E78632A2437F.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6283
     */
    public static org.drools.model.Rule rule_TIER_456283() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6283").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_75CC1E079194D21DAAD38C309FE0E432",
                                                                                                                        com.finobank.pta.chargetier.PA9.LambdaPredicateA90D50BA344968A4067064251770C984.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2300.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_FFD872C59FE637679A0C814BD11F9707",
                                                                                                                                                             com.finobank.pta.chargetier.PC0.LambdaPredicateC06215CE3370345DBD385E735A84D81E.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2400.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P67.LambdaConsequence6789BB80D39608ADF8FC6D46036D268B.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6284
     */
    public static org.drools.model.Rule rule_TIER_456284() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6284").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_47A03A6C3092D324AF1BEBEF8D295CD8",
                                                                                                                        com.finobank.pta.chargetier.PF7.LambdaPredicateF76C6D875F6573E79A618EEC6D24664C.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2400.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_912184898EF80FAFA6FDC22E1E924BAF",
                                                                                                                                                             com.finobank.pta.chargetier.P4D.LambdaPredicate4DADD2B3CF348A1652838E603003926A.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2500.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PBB.LambdaConsequenceBB70FEC57F207D93638AD2FA72B0F024.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6285
     */
    public static org.drools.model.Rule rule_TIER_456285() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6285").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_9F6B9A489F920C66D1508332BA1E4BD9",
                                                                                                                        com.finobank.pta.chargetier.P2B.LambdaPredicate2BCD17F968680D267AB320DDA4C4747B.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2500.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_6EAD8D15CCE1582F997FBD791347618E",
                                                                                                                                                             com.finobank.pta.chargetier.PE0.LambdaPredicateE0BEB5B8F5338046BE813E1447F7B967.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2600.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P6D.LambdaConsequence6D181651757F3BE50262377BA881F438.INSTANCE));
        return rule;
    }
}
