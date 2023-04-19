package com.finobank.pta.allowedtransaction.PED;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorEDBB7DA1F2257FF3FFEAABAAB091DF34 implements org.drools.model.functions.Function1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A690F2063449E9DEC81553ACA52D45F2";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest _this) {
        return _this.getUserClass();
    }
}
