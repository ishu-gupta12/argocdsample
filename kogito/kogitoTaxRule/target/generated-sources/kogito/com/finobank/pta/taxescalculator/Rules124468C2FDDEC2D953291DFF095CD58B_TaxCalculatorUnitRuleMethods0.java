package com.finobank.pta.taxescalculator;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;

public class Rules124468C2FDDEC2D953291DFF095CD58B_TaxCalculatorUnitRuleMethods0 {

    /**
     * Rule name: Rule1
     */
    public static org.drools.model.Rule rule_Rule1() {
        final org.drools.model.Variable<com.finobank.pta.taxescalculator.TaxCalculationRequest> var_$request = D.declarationOf(com.finobank.pta.taxescalculator.TaxCalculationRequest.class,
                                                                                                                               DomainClassesMetadata124468C2FDDEC2D953291DFF095CD58B.com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata_INSTANCE,
                                                                                                                               "$request",
                                                                                                                               D.entryPoint("taxRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.taxescalculator",
                                            "Rule1").unit(com.finobank.pta.taxescalculator.TaxCalculatorUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_B5A3DD37FB0410C4C0CB4F182786DB9D",
                                                                                        com.finobank.pta.taxescalculator.P7D.LambdaPredicate7D04CD4255264ED46197794AB00E7045.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadata124468C2FDDEC2D953291DFF095CD58B.com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata_INSTANCE.getPropertyIndex("partnerStateCode"),
                                                                                                         com.finobank.pta.taxescalculator.P1C.LambdaExtractor1CFA8AF107640544CBB390B0FA88116B.INSTANCE,
                                                                                                         26),
                                                                                        D.reactOn("partnerStateCode")).expr("GENERATED_1EA7A81E6DBE45FCD95BE5D46A4E2BE1",
                                                                                                                            com.finobank.pta.taxescalculator.P04.LambdaPredicate04D5DBC5170C4E1DDCC6FED86F6A33BD.INSTANCE,
                                                                                                                            D.alphaIndexedBy(int.class,
                                                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                             DomainClassesMetadata124468C2FDDEC2D953291DFF095CD58B.com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata_INSTANCE.getPropertyIndex("finoBranchStateCode"),
                                                                                                                                             com.finobank.pta.taxescalculator.P80.LambdaExtractor8002DAF9FA8D45386B79E4885C6E4316.INSTANCE,
                                                                                                                                             26),
                                                                                                                            D.reactOn("finoBranchStateCode")),
                                                           D.on(var_$request).execute(com.finobank.pta.taxescalculator.PAD.LambdaConsequenceAD5A913063AF5C2E6894646307B5CB7A.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Rule2
     */
    public static org.drools.model.Rule rule_Rule2() {
        final org.drools.model.Variable<com.finobank.pta.taxescalculator.TaxCalculationRequest> var_$request = D.declarationOf(com.finobank.pta.taxescalculator.TaxCalculationRequest.class,
                                                                                                                               DomainClassesMetadata124468C2FDDEC2D953291DFF095CD58B.com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata_INSTANCE,
                                                                                                                               "$request",
                                                                                                                               D.entryPoint("taxRequest"));
        org.drools.model.Rule rule = D.rule("com.finobank.pta.taxescalculator",
                                            "Rule2").unit(com.finobank.pta.taxescalculator.TaxCalculatorUnit.class)
                                                    .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                               java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-jan-2022",
                                                                                                                          DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                    .build(D.pattern(var_$request).expr("GENERATED_78703CDE482D638324813D1D6927E199",
                                                                                        com.finobank.pta.taxescalculator.P41.LambdaPredicate41007A089B6D4C89FC3BDE7D44075BA6.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                         DomainClassesMetadata124468C2FDDEC2D953291DFF095CD58B.com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata_INSTANCE.getPropertyIndex("partnerStateCode"),
                                                                                                         com.finobank.pta.taxescalculator.P1C.LambdaExtractor1CFA8AF107640544CBB390B0FA88116B.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("partnerStateCode")).expr("GENERATED_1EA7A81E6DBE45FCD95BE5D46A4E2BE1",
                                                                                                                            com.finobank.pta.taxescalculator.P04.LambdaPredicate04D5DBC5170C4E1DDCC6FED86F6A33BD.INSTANCE,
                                                                                                                            D.alphaIndexedBy(int.class,
                                                                                                                                             org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                             DomainClassesMetadata124468C2FDDEC2D953291DFF095CD58B.com_finobank_pta_taxescalculator_TaxCalculationRequest_Metadata_INSTANCE.getPropertyIndex("finoBranchStateCode"),
                                                                                                                                             com.finobank.pta.taxescalculator.P80.LambdaExtractor8002DAF9FA8D45386B79E4885C6E4316.INSTANCE,
                                                                                                                                             26),
                                                                                                                            D.reactOn("finoBranchStateCode")),
                                                           D.on(var_$request).execute(com.finobank.pta.taxescalculator.P4B.LambdaConsequence4B14258EA08CC410EAE14F40313DB4F0.INSTANCE));
        return rule;
    }
}
