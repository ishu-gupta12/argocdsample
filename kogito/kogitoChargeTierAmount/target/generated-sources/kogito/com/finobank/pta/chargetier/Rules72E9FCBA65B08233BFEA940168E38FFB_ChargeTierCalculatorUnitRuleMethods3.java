package com.finobank.pta.chargetier;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.chargetier.ChargeTierRequest;
import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;

public class Rules72E9FCBA65B08233BFEA940168E38FFB_ChargeTierCalculatorUnitRuleMethods3 {

    /**
     * Rule name: TIER-6235
     */
    public static org.drools.model.Rule rule_TIER_456235() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6235").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
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
     * Rule name: TIER-6236
     */
    public static org.drools.model.Rule rule_TIER_456236() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6236").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
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
     * Rule name: TIER-6237
     */
    public static org.drools.model.Rule rule_TIER_456237() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6237").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
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
     * Rule name: TIER-6238
     */
    public static org.drools.model.Rule rule_TIER_456238() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6238").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
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
     * Rule name: TIER-6239
     */
    public static org.drools.model.Rule rule_TIER_456239() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6239").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
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
     * Rule name: TIER-6240
     */
    public static org.drools.model.Rule rule_TIER_456240() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6240").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
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
     * Rule name: TIER-6241
     */
    public static org.drools.model.Rule rule_TIER_456241() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6241").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
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
     * Rule name: TIER-6242
     */
    public static org.drools.model.Rule rule_TIER_456242() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6242").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
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
     * Rule name: TIER-6243
     */
    public static org.drools.model.Rule rule_TIER_456243() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6243").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
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

    /**
     * Rule name: TIER-6244
     */
    public static org.drools.model.Rule rule_TIER_456244() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6244").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_E1CB7C9CA86CECBAEEB60AC2FA55EE2C",
                                                                                                                        com.finobank.pta.chargetier.P8B.LambdaPredicate8B1D4D4521230507FD2732493400E6D2.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2600.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_786ED728837727B38267602F7A6BF3B7",
                                                                                                                                                             com.finobank.pta.chargetier.PDD.LambdaPredicateDDCF8A8361DB009089D7F53E9ED86658.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2700.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P4F.LambdaConsequence4F9CA5325D5F7BB6103D71AFFE6E5F51.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6245
     */
    public static org.drools.model.Rule rule_TIER_456245() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6245").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_4ED0501ACBC8EB52352F07FA80F66C47",
                                                                                                                        com.finobank.pta.chargetier.PE7.LambdaPredicateE74B7358C54E1B46E793F3359607076A.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2700.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_170DDE9066CA3D0F95D4CFF68A2270C8",
                                                                                                                                                             com.finobank.pta.chargetier.PF5.LambdaPredicateF5665A397A8AD6DCF88DF63D578F28A4.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2800.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P15.LambdaConsequence1556C06E55FD98CB8EBFB72C7358BAD7.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6246
     */
    public static org.drools.model.Rule rule_TIER_456246() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6246").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_7EB8CB77CEC5C25D6A8BA13F5F2B3E45",
                                                                                                                        com.finobank.pta.chargetier.P12.LambdaPredicate12C21C1AE3634C961E091B7C3E75AD5A.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2800.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_FD17D351067E59D28862C3687FE9A2A6",
                                                                                                                                                             com.finobank.pta.chargetier.P5C.LambdaPredicate5C8D5A0C41A139CE1B5BA247B5236EFD.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              2900.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P26.LambdaConsequence26CE255CCF9E3456739EDE3BA1A15C6C.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6247
     */
    public static org.drools.model.Rule rule_TIER_456247() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6247").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_1D5D15C8236C73FC905CF6A614A3A9B9",
                                                                                                                        com.finobank.pta.chargetier.P59.LambdaPredicate59E6850BB535AE612EC8CC592E0D9323.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         2900.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_3C558273ADD4A83A586B9BCF72E06762",
                                                                                                                                                             com.finobank.pta.chargetier.PE7.LambdaPredicateE73599DE9C4B0A490A24A4127E55FBD8.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              3000.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PA1.LambdaConsequenceA11EC6537BA6824210E11EDAA7EAAD1B.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6248
     */
    public static org.drools.model.Rule rule_TIER_456248() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6248").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_DF24F3666E6455387872F9AED92D3671",
                                                                                                                        com.finobank.pta.chargetier.P26.LambdaPredicate266E929509BCCCC28A0A3EE68F598C8D.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         3000.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_01929EE457AE40362A57DAE20EA673F1",
                                                                                                                                                             com.finobank.pta.chargetier.P2C.LambdaPredicate2C0D721221E2CA906B080910E4DD1D0D.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              3100.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P39.LambdaConsequence392FDB3EBC29ADBC736FFE377D642F89.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6249
     */
    public static org.drools.model.Rule rule_TIER_456249() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6249").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_E8607245845FD2731738A98D57663201",
                                                                                                                        com.finobank.pta.chargetier.P7C.LambdaPredicate7CDEC9627771F098B5FDCC54A6ACDFB7.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         3100.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_9E39B6980F4A9094A1008F7968CFDBFB",
                                                                                                                                                             com.finobank.pta.chargetier.P17.LambdaPredicate17C7C01EA710514654D5146E19E4FDD9.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              3200.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P10.LambdaConsequence1039988F1D24CF79489DD4762C1CD59C.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6250
     */
    public static org.drools.model.Rule rule_TIER_456250() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6250").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_676FC07A61BA62EDE953A039603F673F",
                                                                                                                        com.finobank.pta.chargetier.PE0.LambdaPredicateE053495BC3D4668FFCF046F1573892BB.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         3200.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_D3438335B49C77612710393D2437486C",
                                                                                                                                                             com.finobank.pta.chargetier.PC5.LambdaPredicateC5299302D821F6ECFBCC8EA8ED42E4DB.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              3300.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P8A.LambdaConsequence8A12A25CE7E1972D78CD374D10902DDB.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6251
     */
    public static org.drools.model.Rule rule_TIER_456251() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6251").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                        .build(D.pattern(var_$request).expr("GENERATED_A8D431B4D6F89961E3FC470C3429DDFB",
                                                                                            com.finobank.pta.chargetier.PA2.LambdaPredicateA296E8A5C90095AED5EC251CDEA8BD51.INSTANCE,
                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                             DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("chargeID"),
                                                                                                             com.finobank.pta.chargetier.P84.LambdaExtractor84BD48C26006537CD8B077A631AF2907.INSTANCE,
                                                                                                             "520"),
                                                                                            D.reactOn("chargeID")).expr("GENERATED_2CA6DC751BA332A604DA153C3115C4D5",
                                                                                                                        com.finobank.pta.chargetier.PD6.LambdaPredicateD6D0F12EEC02AA5E213929C09773A971.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         3300.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_0E5E93EABEA7308D6F7F5EEBF879632C",
                                                                                                                                                             com.finobank.pta.chargetier.PC7.LambdaPredicateC7D43C534569EE21AB4D74DFE4E9703C.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              3400.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P30.LambdaConsequence30948459D69BDC3F44839D4D16794C8B.INSTANCE));
        return rule;
    }
}
