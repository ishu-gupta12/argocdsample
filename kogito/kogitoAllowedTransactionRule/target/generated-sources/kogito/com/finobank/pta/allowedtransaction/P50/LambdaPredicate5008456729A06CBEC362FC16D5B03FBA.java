package com.finobank.pta.allowedtransaction.P50;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate5008456729A06CBEC362FC16D5B03FBA implements org.drools.model.functions.Predicate1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "D287285839CD5CA9A37D8341D945851B";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getAppId(), "FINOTLR");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("appId == \"FINOTLR\"", "Rule For PARTNER PTACASHOUT – ALLOWED – PWTDF  1003", "/home/user/Documents/dockerimage/vbg-fino-final/transactions/rules/kogito/v3/kogitoAllowedTransactionRule/src/main/resources/com/finobank/pta/allowedtransaction/CheckAllowedTransaction.xlsx");
    }
}
