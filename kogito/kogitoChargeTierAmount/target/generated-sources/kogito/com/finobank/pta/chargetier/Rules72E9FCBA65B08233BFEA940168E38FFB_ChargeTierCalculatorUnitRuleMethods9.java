package com.finobank.pta.chargetier;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.chargetier.ChargeTierRequest;
import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;

public class Rules72E9FCBA65B08233BFEA940168E38FFB_ChargeTierCalculatorUnitRuleMethods9 {

    /**
     * Rule name: TIER-6337
     */
    public static org.drools.model.Rule rule_TIER_456337() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6337").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_280614476F0751B68A6A498FED29B813",
                                                                                                                        com.finobank.pta.chargetier.P86.LambdaPredicate8600986C90B20C9800251D394FCC52DB.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         3600.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_D72B48EA03F60040BCAB78B3B2535759",
                                                                                                                                                             com.finobank.pta.chargetier.PD5.LambdaPredicateD5EB49F0572F853152BC4198E217F736.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              3700.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PDB.LambdaConsequenceDBB2F9772AAD6BB39FAAAD92E286844E.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6338
     */
    public static org.drools.model.Rule rule_TIER_456338() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6338").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_BBB1D5FB11446229B07FE159D834EA80",
                                                                                                                        com.finobank.pta.chargetier.P66.LambdaPredicate663C3467736C1D075420D04508B11571.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         3700.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_B0567491AD2370C3EE6544B29862B74A",
                                                                                                                                                             com.finobank.pta.chargetier.PF3.LambdaPredicateF32276D4CB3BBB7C69970F5B826B7271.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              3800.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P19.LambdaConsequence19B3C722CDAC06E0851DCFB8218A4128.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6339
     */
    public static org.drools.model.Rule rule_TIER_456339() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6339").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_B18FB7425AA898E11521375EADEED3CC",
                                                                                                                        com.finobank.pta.chargetier.PA3.LambdaPredicateA3257D8F1443735307B0557FCB290055.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         3800.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_0E7CA29F8E106048324BB31E127F1142",
                                                                                                                                                             com.finobank.pta.chargetier.P65.LambdaPredicate65FBDB7313EF3CD1DB49C15B772A234A.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              3900.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P1E.LambdaConsequence1ECA2E1D1F97631E70DDFB73DDDF4D01.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6340
     */
    public static org.drools.model.Rule rule_TIER_456340() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6340").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_CE52695F721E93B1B09DEAB099B198CB",
                                                                                                                        com.finobank.pta.chargetier.P35.LambdaPredicate35D4E54CD6031ADFB3520AB640F59191.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         3900.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_15B480316F044D3D39CE66F53A798151",
                                                                                                                                                             com.finobank.pta.chargetier.PD4.LambdaPredicateD423FAC0510FB59BBC981815E21F82D8.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4000.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P7A.LambdaConsequence7A39185E412A657853BB937FB100B2BB.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6341
     */
    public static org.drools.model.Rule rule_TIER_456341() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6341").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_7DD3D3A90D5944586A2CFAE36F500DDF",
                                                                                                                        com.finobank.pta.chargetier.P0D.LambdaPredicate0D87A8A491095652BF7C0DA9301FBDC3.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4000.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_7AADB5BAFF0C5DCB4AA97BB4096294D5",
                                                                                                                                                             com.finobank.pta.chargetier.P33.LambdaPredicate33BF2450F16A00F4681237D6C3FC4729.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4100.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PEC.LambdaConsequenceEC25B1DF82BB4DAC238A0CC8E67C0B0C.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6342
     */
    public static org.drools.model.Rule rule_TIER_456342() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6342").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_D11B8F1BA58BCB949D833B4B05346596",
                                                                                                                        com.finobank.pta.chargetier.PA7.LambdaPredicateA74A129ECD7A229C1F162E6AA44B1DD1.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4100.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_2178EE441B4F84E8B1949D2E9C9188E0",
                                                                                                                                                             com.finobank.pta.chargetier.P3B.LambdaPredicate3B38B43F733C7077FDB68F2E47295499.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4200.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.PCD.LambdaConsequenceCDB4B2078F97FE95CCDE3F2BEF5E6F6C.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6343
     */
    public static org.drools.model.Rule rule_TIER_456343() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6343").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
                                                                                            D.reactOn("chargeID")).expr("GENERATED_75125D260C7D88A2A856759652E0C66B",
                                                                                                                        com.finobank.pta.chargetier.P90.LambdaPredicate907E95F2DCD63082DBD7162452BBCF93.INSTANCE,
                                                                                                                        D.alphaIndexedBy(double.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                         com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                         4200.01),
                                                                                                                        D.reactOn("transactionAmount")).expr("GENERATED_8BC8E039BEA36F768B35051A7C1B0793",
                                                                                                                                                             com.finobank.pta.chargetier.PA4.LambdaPredicateA4A74A65AAB06D26BFB5CE05E7DE350D.INSTANCE,
                                                                                                                                                             D.alphaIndexedBy(double.class,
                                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                              DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE.getPropertyIndex("transactionAmount"),
                                                                                                                                                                              com.finobank.pta.chargetier.P45.LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6.INSTANCE,
                                                                                                                                                                              4300.0),
                                                                                                                                                             D.reactOn("transactionAmount")),
                                                               D.on(var_$request).execute(com.finobank.pta.chargetier.P7F.LambdaConsequence7F8FCAAB848F30B8A79154DF8B63CEF9.INSTANCE));
        return rule;
    }

    /**
     * Rule name: TIER-6344
     */
    public static org.drools.model.Rule rule_TIER_456344() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6344").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6345
     */
    public static org.drools.model.Rule rule_TIER_456345() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6345").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6346
     */
    public static org.drools.model.Rule rule_TIER_456346() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6346").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6347
     */
    public static org.drools.model.Rule rule_TIER_456347() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6347").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6348
     */
    public static org.drools.model.Rule rule_TIER_456348() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6348").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6349
     */
    public static org.drools.model.Rule rule_TIER_456349() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6349").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
     * Rule name: TIER-6350
     */
    public static org.drools.model.Rule rule_TIER_456350() {
        final org.drools.model.Variable<com.finobank.pta.chargetier.ChargeTierRequest> var_$request = D.declarationOf(com.finobank.pta.chargetier.ChargeTierRequest.class,
                                                                                                                      DomainClassesMetadata72E9FCBA65B08233BFEA940168E38FFB.com_finobank_pta_chargetier_ChargeTierRequest_Metadata_INSTANCE,
                                                                                                                      "$request",
                                                                                                                      D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargetier",
                                            "TIER-6350").unit(com.finobank.pta.chargetier.ChargeTierCalculatorUnit.class)
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
}
