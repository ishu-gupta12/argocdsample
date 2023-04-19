package com.finobank.pta.chargeaccount;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;

public class RulesC7DF8C050BB15943859DD690572C5AE9_ChargeAccountCalculatorUnitRuleMethods1 {

    /**
     * Rule name: Rule1 For PARTNER BHOOPALAM – IMPSCHARGED
     */
    public static org.drools.model.Rule rule_Rule1_32For_32PARTNER_32BHOOPALAM_32_8211_32IMPSCHARGED() {
        final org.drools.model.Variable<com.finobank.pta.chargeaccount.ChargeAccountRequest> var_$request = D.declarationOf(com.finobank.pta.chargeaccount.ChargeAccountRequest.class,
                                                                                                                            DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE,
                                                                                                                            "$request",
                                                                                                                            D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargeaccount",
                                            "Rule1 For PARTNER BHOOPALAM – IMPSCHARGED").unit(com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit.class)
                                                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                        .build(D.pattern(var_$request).expr("GENERATED_8B92FD484008E62C94BFEA4EBABDCE46",
                                                                                                                            com.finobank.pta.chargeaccount.P86.LambdaPredicate863C226716DCE8062CEF3B823100BB7D.INSTANCE,
                                                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                             DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("trantype"),
                                                                                                                                             com.finobank.pta.chargeaccount.P4E.LambdaExtractor4EFD90CAD1D01F7D1E5CEBC0900356DA.INSTANCE,
                                                                                                                                             "BHPLIMPS"),
                                                                                                                            D.reactOn("trantype")).expr("GENERATED_F4773D2D71B3A4D33BCD6DA8900A105D",
                                                                                                                                                        com.finobank.pta.chargeaccount.P80.LambdaPredicate80F47B75A0C7AB43515ED6378E28502A.INSTANCE,
                                                                                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                         DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("appid"),
                                                                                                                                                                         com.finobank.pta.chargeaccount.P65.LambdaExtractor650957A615B62641130E9692EEB6C082.INSTANCE,
                                                                                                                                                                         "FINOTLR"),
                                                                                                                                                        D.reactOn("appid")).expr("GENERATED_D6BA3B0791B0243F3857D6225C519891",
                                                                                                                                                                                 com.finobank.pta.chargeaccount.PF8.LambdaPredicateF8F0CEFE10DBD087D0B86A06CF5635EF.INSTANCE,
                                                                                                                                                                                 D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                  org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                  DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("productid"),
                                                                                                                                                                                                  com.finobank.pta.chargeaccount.PD9.LambdaExtractorD9F363A647AE85CAF5D313D29D9AE04B.INSTANCE,
                                                                                                                                                                                                  "1003"),
                                                                                                                                                                                 D.reactOn("productid")),
                                                                                               D.on(var_$request).execute(com.finobank.pta.chargeaccount.P1D.LambdaConsequence1DEC0F718E72D1BC54F3236CD573EA18.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule1 For PARTNER BHOOPALAM – NEFTCHARGED
     */
    public static org.drools.model.Rule rule_Rule1_32For_32PARTNER_32BHOOPALAM_32_8211_32NEFTCHARGED() {
        final org.drools.model.Variable<com.finobank.pta.chargeaccount.ChargeAccountRequest> var_$request = D.declarationOf(com.finobank.pta.chargeaccount.ChargeAccountRequest.class,
                                                                                                                            DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE,
                                                                                                                            "$request",
                                                                                                                            D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargeaccount",
                                            "Rule1 For PARTNER BHOOPALAM – NEFTCHARGED").unit(com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit.class)
                                                                                        .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                                   java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                              DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                        .build(D.pattern(var_$request).expr("GENERATED_A819582666F182DFCDEE41628F8DECE7",
                                                                                                                            com.finobank.pta.chargeaccount.PBF.LambdaPredicateBFF373F6B1AC601CC66954954F9A5846.INSTANCE,
                                                                                                                            D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                             DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("trantype"),
                                                                                                                                             com.finobank.pta.chargeaccount.P4E.LambdaExtractor4EFD90CAD1D01F7D1E5CEBC0900356DA.INSTANCE,
                                                                                                                                             "BHPLNEFT"),
                                                                                                                            D.reactOn("trantype")).expr("GENERATED_F4773D2D71B3A4D33BCD6DA8900A105D",
                                                                                                                                                        com.finobank.pta.chargeaccount.P80.LambdaPredicate80F47B75A0C7AB43515ED6378E28502A.INSTANCE,
                                                                                                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                         DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("appid"),
                                                                                                                                                                         com.finobank.pta.chargeaccount.P65.LambdaExtractor650957A615B62641130E9692EEB6C082.INSTANCE,
                                                                                                                                                                         "FINOTLR"),
                                                                                                                                                        D.reactOn("appid")).expr("GENERATED_D6BA3B0791B0243F3857D6225C519891",
                                                                                                                                                                                 com.finobank.pta.chargeaccount.PF8.LambdaPredicateF8F0CEFE10DBD087D0B86A06CF5635EF.INSTANCE,
                                                                                                                                                                                 D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                  org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                  DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("productid"),
                                                                                                                                                                                                  com.finobank.pta.chargeaccount.PD9.LambdaExtractorD9F363A647AE85CAF5D313D29D9AE04B.INSTANCE,
                                                                                                                                                                                                  "1003"),
                                                                                                                                                                                 D.reactOn("productid")),
                                                                                               D.on(var_$request).execute(com.finobank.pta.chargeaccount.PE3.LambdaConsequenceE38B445F8A0CDB6FF08EF1472BA256E0.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule1 For PARTNER PAY EASSY RETAIL  – BENECHARGED
     */
    public static org.drools.model.Rule rule_Rule1_32For_32PARTNER_32PAY_32EASSY_32RETAIL_32_32_8211_32BENECHARGED() {
        final org.drools.model.Variable<com.finobank.pta.chargeaccount.ChargeAccountRequest> var_$request = D.declarationOf(com.finobank.pta.chargeaccount.ChargeAccountRequest.class,
                                                                                                                            DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE,
                                                                                                                            "$request",
                                                                                                                            D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargeaccount",
                                            "Rule1 For PARTNER PAY EASSY RETAIL  – BENECHARGED").unit(com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit.class)
                                                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                                .build(D.pattern(var_$request).expr("GENERATED_C51D63CFC5DDA53EB67FA4D33F5027EB",
                                                                                                                                    com.finobank.pta.chargeaccount.PBA.LambdaPredicateBA7A7682E444B76C80FD4B92D39A0029.INSTANCE,
                                                                                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                     DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("trantype"),
                                                                                                                                                     com.finobank.pta.chargeaccount.P4E.LambdaExtractor4EFD90CAD1D01F7D1E5CEBC0900356DA.INSTANCE,
                                                                                                                                                     "PYESBENE"),
                                                                                                                                    D.reactOn("trantype")).expr("GENERATED_F4773D2D71B3A4D33BCD6DA8900A105D",
                                                                                                                                                                com.finobank.pta.chargeaccount.P80.LambdaPredicate80F47B75A0C7AB43515ED6378E28502A.INSTANCE,
                                                                                                                                                                D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                 org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                 DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("appid"),
                                                                                                                                                                                 com.finobank.pta.chargeaccount.P65.LambdaExtractor650957A615B62641130E9692EEB6C082.INSTANCE,
                                                                                                                                                                                 "FINOTLR"),
                                                                                                                                                                D.reactOn("appid")).expr("GENERATED_D6BA3B0791B0243F3857D6225C519891",
                                                                                                                                                                                         com.finobank.pta.chargeaccount.PF8.LambdaPredicateF8F0CEFE10DBD087D0B86A06CF5635EF.INSTANCE,
                                                                                                                                                                                         D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                          org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                          DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("productid"),
                                                                                                                                                                                                          com.finobank.pta.chargeaccount.PD9.LambdaExtractorD9F363A647AE85CAF5D313D29D9AE04B.INSTANCE,
                                                                                                                                                                                                          "1003"),
                                                                                                                                                                                         D.reactOn("productid")),
                                                                                                       D.on(var_$request).execute(com.finobank.pta.chargeaccount.P4C.LambdaConsequence4C23FA4F84CBA1FC00DA7EC3ACEFD3D7.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule1 For PARTNER PAY EASSY RETAIL  – IMPSCHARGED
     */
    public static org.drools.model.Rule rule_Rule1_32For_32PARTNER_32PAY_32EASSY_32RETAIL_32_32_8211_32IMPSCHARGED() {
        final org.drools.model.Variable<com.finobank.pta.chargeaccount.ChargeAccountRequest> var_$request = D.declarationOf(com.finobank.pta.chargeaccount.ChargeAccountRequest.class,
                                                                                                                            DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE,
                                                                                                                            "$request",
                                                                                                                            D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargeaccount",
                                            "Rule1 For PARTNER PAY EASSY RETAIL  – IMPSCHARGED").unit(com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit.class)
                                                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                                .build(D.pattern(var_$request).expr("GENERATED_7BE2FA72B5A32581E5E4153A35363CC3",
                                                                                                                                    com.finobank.pta.chargeaccount.PB5.LambdaPredicateB588F9CDFBA2172FAD98B7B6E756A15E.INSTANCE,
                                                                                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                     DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("trantype"),
                                                                                                                                                     com.finobank.pta.chargeaccount.P4E.LambdaExtractor4EFD90CAD1D01F7D1E5CEBC0900356DA.INSTANCE,
                                                                                                                                                     "PYESIMPS"),
                                                                                                                                    D.reactOn("trantype")).expr("GENERATED_F4773D2D71B3A4D33BCD6DA8900A105D",
                                                                                                                                                                com.finobank.pta.chargeaccount.P80.LambdaPredicate80F47B75A0C7AB43515ED6378E28502A.INSTANCE,
                                                                                                                                                                D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                 org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                 DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("appid"),
                                                                                                                                                                                 com.finobank.pta.chargeaccount.P65.LambdaExtractor650957A615B62641130E9692EEB6C082.INSTANCE,
                                                                                                                                                                                 "FINOTLR"),
                                                                                                                                                                D.reactOn("appid")).expr("GENERATED_D6BA3B0791B0243F3857D6225C519891",
                                                                                                                                                                                         com.finobank.pta.chargeaccount.PF8.LambdaPredicateF8F0CEFE10DBD087D0B86A06CF5635EF.INSTANCE,
                                                                                                                                                                                         D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                          org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                          DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("productid"),
                                                                                                                                                                                                          com.finobank.pta.chargeaccount.PD9.LambdaExtractorD9F363A647AE85CAF5D313D29D9AE04B.INSTANCE,
                                                                                                                                                                                                          "1003"),
                                                                                                                                                                                         D.reactOn("productid")),
                                                                                                       D.on(var_$request).execute(com.finobank.pta.chargeaccount.PA0.LambdaConsequenceA05F11379D26059E4A2C8684DD97AFFA.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule1 For PARTNER PAY EASSY RETAIL  – NEFTCHARGED
     */
    public static org.drools.model.Rule rule_Rule1_32For_32PARTNER_32PAY_32EASSY_32RETAIL_32_32_8211_32NEFTCHARGED() {
        final org.drools.model.Variable<com.finobank.pta.chargeaccount.ChargeAccountRequest> var_$request = D.declarationOf(com.finobank.pta.chargeaccount.ChargeAccountRequest.class,
                                                                                                                            DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE,
                                                                                                                            "$request",
                                                                                                                            D.entryPoint("chargeRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.chargeaccount",
                                            "Rule1 For PARTNER PAY EASSY RETAIL  – NEFTCHARGED").unit(com.finobank.pta.chargeaccount.ChargeAccountCalculatorUnit.class)
                                                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                                                .build(D.pattern(var_$request).expr("GENERATED_A0695AA137FDC589728EFDB10D818385",
                                                                                                                                    com.finobank.pta.chargeaccount.PF1.LambdaPredicateF1BE4F785181AE989978BC6F4E528899.INSTANCE,
                                                                                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                     DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("trantype"),
                                                                                                                                                     com.finobank.pta.chargeaccount.P4E.LambdaExtractor4EFD90CAD1D01F7D1E5CEBC0900356DA.INSTANCE,
                                                                                                                                                     "PYESNEFT"),
                                                                                                                                    D.reactOn("trantype")).expr("GENERATED_F4773D2D71B3A4D33BCD6DA8900A105D",
                                                                                                                                                                com.finobank.pta.chargeaccount.P80.LambdaPredicate80F47B75A0C7AB43515ED6378E28502A.INSTANCE,
                                                                                                                                                                D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                 org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                 DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("appid"),
                                                                                                                                                                                 com.finobank.pta.chargeaccount.P65.LambdaExtractor650957A615B62641130E9692EEB6C082.INSTANCE,
                                                                                                                                                                                 "FINOTLR"),
                                                                                                                                                                D.reactOn("appid")).expr("GENERATED_D6BA3B0791B0243F3857D6225C519891",
                                                                                                                                                                                         com.finobank.pta.chargeaccount.PF8.LambdaPredicateF8F0CEFE10DBD087D0B86A06CF5635EF.INSTANCE,
                                                                                                                                                                                         D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                                                                          org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                                                          DomainClassesMetadataC7DF8C050BB15943859DD690572C5AE9.com_finobank_pta_chargeaccount_ChargeAccountRequest_Metadata_INSTANCE.getPropertyIndex("productid"),
                                                                                                                                                                                                          com.finobank.pta.chargeaccount.PD9.LambdaExtractorD9F363A647AE85CAF5D313D29D9AE04B.INSTANCE,
                                                                                                                                                                                                          "1003"),
                                                                                                                                                                                         D.reactOn("productid")),
                                                                                                       D.on(var_$request).execute(com.finobank.pta.chargeaccount.P42.LambdaConsequence425BC883052E6EBFF3AB0B86AB2B3D0A.INSTANCE));
        return rule;
    }
}
