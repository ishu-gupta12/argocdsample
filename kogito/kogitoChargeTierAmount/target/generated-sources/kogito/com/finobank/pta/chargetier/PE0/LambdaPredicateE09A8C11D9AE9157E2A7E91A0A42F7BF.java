package com.finobank.pta.chargetier.PE0;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateE09A8C11D9AE9157E2A7E91A0A42F7BF implements org.drools.model.functions.Predicate1<com.finobank.pta.chargetier.ChargeTierRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "68E27B4436C7C831942161B04B7F5951";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.chargetier.ChargeTierRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getTransactionAmount(), 2400.01);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("transactionAmount >= 2400.01", "TIER-6284", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoChargeTierAmount/src/main/resources/com/finobank/pta/chargetier/ChargeTierRule.xlsx");
    }
}
