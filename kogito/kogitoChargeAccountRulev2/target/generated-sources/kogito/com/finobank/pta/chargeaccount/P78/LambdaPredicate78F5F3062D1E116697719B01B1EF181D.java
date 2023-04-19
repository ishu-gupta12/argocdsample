package com.finobank.pta.chargeaccount.P78;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate78F5F3062D1E116697719B01B1EF181D implements org.drools.model.functions.Predicate1<com.finobank.pta.chargeaccount.ChargeAccountRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "FEF977B0DC28750242785D4A8087F544";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.chargeaccount.ChargeAccountRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTrantype(), "DHAPNEFT");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("trantype == \"DHAPNEFT\"", "Rule1 For PARTNER DHANUPAY – NEFTCHARGED", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoChargeAccountRulev2/src/main/resources/com/finobank/pta/chargeaccount/ChargeAccountRule.xlsx");
    }
}
