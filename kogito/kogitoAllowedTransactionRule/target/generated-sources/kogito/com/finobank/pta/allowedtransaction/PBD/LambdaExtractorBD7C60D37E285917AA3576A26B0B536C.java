package com.finobank.pta.allowedtransaction.PBD;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorBD7C60D37E285917AA3576A26B0B536C implements org.drools.model.functions.Function1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "49F3C1C31FAFA440BE5747DBD9AF9D18";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest _this) {
        return _this.getTranType();
    }
}
