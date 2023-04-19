package com.finobank.pta.taxescalculator.P7D;

import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;
import com.finobank.pta.taxescalculator.*;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate7D04CD4255264ED46197794AB00E7045 implements org.drools.model.functions.Predicate1<com.finobank.pta.taxescalculator.TaxCalculationRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "FE65FE2CA8EC8F8162A04ABD5D9D5BD3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.taxescalculator.TaxCalculationRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNumbersNullSafeEquals(_this.getPartnerStateCode(), 26);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("partnerStateCode == 26", "Rule1", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoTaxRule/src/main/resources/com/finobank/pta/taxescalculator/TaxRule.xlsx");
    }
}
