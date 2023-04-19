package com.finobank.pta.allowedtransaction.P5E;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate5EFB9B5DBD8C0D71869BBAFC45428386 implements org.drools.model.functions.Predicate1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A75A90294454529CA9BB270F0D24F14B";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getTranType(), "SHGPNEFT");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("tranType == \"SHGPNEFT\"", "Rule For PARTNER SHIGHRAPAY  – ALLOWED – NEFT – 1003", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoAllowedTransactionRule/src/main/resources/com/finobank/pta/allowedtransaction/CheckAllowedTransaction.xlsx");
    }
}
