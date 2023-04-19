package com.finobank.pta.allowedtransaction.P96;

import static com.finobank.pta.allowedtransaction.RulesFB20537E64034E3BED15CADAABACC7D4.*;
import com.finobank.pta.allowedtransaction.*;
import com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor963DFBAF5C138E801D0B5FEE38A89390 implements org.drools.model.functions.Function1<com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "C5E5BE96ACE081953C0FFA799E7C7C90";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.allowedtransaction.CheckAllowedTransactionRequest _this) {
        return _this.getAppId();
    }
}
