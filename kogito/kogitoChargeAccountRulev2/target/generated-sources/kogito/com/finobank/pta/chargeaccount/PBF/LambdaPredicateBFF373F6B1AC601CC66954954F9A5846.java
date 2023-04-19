package com.finobank.pta.chargeaccount.PBF;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateBFF373F6B1AC601CC66954954F9A5846 implements org.drools.model.functions.Predicate1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9FE99DDD9C5E74B14BDF760F84181906";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.chargeaccount.ChargeAccountRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTrantype(), "BHPLNEFT");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("trantype == \"BHPLNEFT\"", "Rule1 For PARTNER BHOOPALAM – NEFTCHARGED", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoChargeAccountRulev2/src/main/resources/com/finobank/pta/chargeaccount/ChargeAccountRule.xlsx");
    }
}
