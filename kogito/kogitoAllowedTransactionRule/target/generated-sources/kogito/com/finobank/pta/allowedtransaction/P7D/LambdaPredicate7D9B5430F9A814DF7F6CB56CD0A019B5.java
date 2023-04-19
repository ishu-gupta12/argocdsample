package com.finobank.pta.allowedtransaction.P7D;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate7D9B5430F9A814DF7F6CB56CD0A019B5 implements org.drools.model.functions.Predicate1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "17CB47CEB75212F4A421B85F45EF3444";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTranType(), "BHPLBENE");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("tranType == \"BHPLBENE\"", "Rule For PARTNER BHOOPALAM  – ALLOWED – BENE – 1003", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoAllowedTransactionRule/src/main/resources/com/finobank/pta/allowedtransaction/CheckAllowedTransaction.xlsx");
    }
}
