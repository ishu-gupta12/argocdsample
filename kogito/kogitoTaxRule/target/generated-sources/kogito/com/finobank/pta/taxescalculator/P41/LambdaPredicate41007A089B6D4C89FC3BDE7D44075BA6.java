package com.finobank.pta.taxescalculator.P41;

import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;
import com.finobank.pta.taxescalculator.*;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate41007A089B6D4C89FC3BDE7D44075BA6 implements org.drools.model.functions.Predicate1<com.finobank.pta.taxescalculator.TaxCalculationRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "7C9873D5D519D93DFED795B884FF9508";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.taxescalculator.TaxCalculationRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNumbersNullSafeEquals(_this.getPartnerStateCode(), 20);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("partnerStateCode == 20", "Rule2", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoTaxRule/src/main/resources/com/finobank/pta/taxescalculator/TaxRule.xlsx");
    }
}
