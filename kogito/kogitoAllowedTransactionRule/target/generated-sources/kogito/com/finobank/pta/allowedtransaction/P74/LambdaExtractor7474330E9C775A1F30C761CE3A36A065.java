package com.finobank.pta.allowedtransaction.P74;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor7474330E9C775A1F30C761CE3A36A065 implements org.drools.model.functions.Function1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest, com.finobank.pta.allowedtransaction.CheckAllowedTransactionResponse>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "98CDFDA34C961A0FB6196A2A93BDDCE4";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public com.finobank.pta.allowedtransaction.CheckAllowedTransactionResponse apply(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest _this) {
        return _this.getApiResponse();
    }
}
