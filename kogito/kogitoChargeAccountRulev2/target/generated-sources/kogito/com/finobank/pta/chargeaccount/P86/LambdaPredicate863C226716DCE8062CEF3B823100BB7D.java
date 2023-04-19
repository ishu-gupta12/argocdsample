package com.finobank.pta.chargeaccount.P86;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate863C226716DCE8062CEF3B823100BB7D implements org.drools.model.functions.Predicate1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "E63417753E451C62327B4A3C84BACDEC";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.chargeaccount.ChargeAccountRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTrantype(), "BHPLIMPS");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("trantype == \"BHPLIMPS\"", "Rule1 For PARTNER BHOOPALAM – IMPSCHARGED", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoChargeAccountRulev2/src/main/resources/com/finobank/pta/chargeaccount/ChargeAccountRule.xlsx");
    }
}
