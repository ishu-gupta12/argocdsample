package com.finobank.pta.allowedtransaction.PA3;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateA33B13DA651E10CD89D8CFCBB54A94C8 implements org.drools.model.functions.Predicate1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "5EAB9745CFBC8F8D9F0E1A347E8AD18F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTranType(), "BHPLIMPS");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("tranType == \"BHPLIMPS\"", "Rule For PARTNER BHOOPALAM – ALLOWED – IMPS – 1003", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoAllowedTransactionRule/src/main/resources/com/finobank/pta/allowedtransaction/CheckAllowedTransaction.xlsx");
    }
}
