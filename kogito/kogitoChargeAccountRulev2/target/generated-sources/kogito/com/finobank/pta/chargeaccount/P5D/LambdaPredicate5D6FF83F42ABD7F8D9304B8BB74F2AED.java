package com.finobank.pta.chargeaccount.P5D;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate5D6FF83F42ABD7F8D9304B8BB74F2AED implements org.drools.model.functions.Predicate1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "33A52F003BFF5C40BBB18964D8BB3B94";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.chargeaccount.ChargeAccountRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTrantype(), "SHGPBENE");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("trantype == \"SHGPBENE\"", "Rule1 For PARTNER SHIGHRAPAY – BENECHARGED", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoChargeAccountRulev2/src/main/resources/com/finobank/pta/chargeaccount/ChargeAccountRule.xlsx");
    }
}
