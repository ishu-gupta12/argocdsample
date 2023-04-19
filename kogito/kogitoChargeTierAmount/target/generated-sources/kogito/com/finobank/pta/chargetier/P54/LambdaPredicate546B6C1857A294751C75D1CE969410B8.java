package com.finobank.pta.chargetier.P54;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate546B6C1857A294751C75D1CE969410B8 implements org.drools.model.functions.Predicate1<com.finobank.pta.chargetier.ChargeTierRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "2DB52093A809B29FCAB0A5D2CD8D9621";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.chargetier.ChargeTierRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessOrEqualNumbers(_this.getTransactionAmount(), 1100.0);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("transactionAmount <= 1100.00", "TIER-6186", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoChargeTierAmount/src/main/resources/com/finobank/pta/chargetier/ChargeTierRule.xlsx");
    }
}
