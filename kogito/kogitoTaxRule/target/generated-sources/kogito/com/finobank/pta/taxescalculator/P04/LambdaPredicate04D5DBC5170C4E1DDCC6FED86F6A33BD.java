package com.finobank.pta.taxescalculator.P04;

import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;
import com.finobank.pta.taxescalculator.*;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate04D5DBC5170C4E1DDCC6FED86F6A33BD implements org.drools.model.functions.Predicate1<com.finobank.pta.taxescalculator.TaxCalculationRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "F08C212605BAE9E23CEB61523D9C42AF";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.taxescalculator.TaxCalculationRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNumbersNullSafeEquals(_this.getFinoBranchStateCode(), 26);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("finoBranchStateCode == 26", "Rule2", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoTaxRule/src/main/resources/com/finobank/pta/taxescalculator/TaxRule.xlsx");
    }
}
