package com.finobank.pta.allowedtransaction.P49;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor49F355FB29FB310CB200F021FE5DBFD1 implements org.drools.model.functions.Function1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9BA165772250F457D38EFA85FB581C09";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest _this) {
        return _this.getProductCode();
    }
}
