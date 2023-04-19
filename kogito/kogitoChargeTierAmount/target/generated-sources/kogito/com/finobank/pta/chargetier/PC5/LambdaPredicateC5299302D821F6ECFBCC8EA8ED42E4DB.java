package com.finobank.pta.chargetier.PC5;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateC5299302D821F6ECFBCC8EA8ED42E4DB implements org.drools.model.functions.Predicate1<com.finobank.pta.chargetier.ChargeTierRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "77E604BE58C7A1AA38BF57A660DFF7F3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.chargetier.ChargeTierRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessOrEqualNumbers(_this.getTransactionAmount(), 3300.0);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("transactionAmount <= 3300.00", "TIER-6250", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoChargeTierAmount/src/main/resources/com/finobank/pta/chargetier/ChargeTierRule.xlsx");
    }
}
