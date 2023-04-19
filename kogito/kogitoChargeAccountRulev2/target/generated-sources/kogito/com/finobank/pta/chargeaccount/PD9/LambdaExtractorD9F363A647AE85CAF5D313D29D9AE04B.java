package com.finobank.pta.chargeaccount.PD9;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorD9F363A647AE85CAF5D313D29D9AE04B implements org.drools.model.functions.Function1<com.finobank.pta.chargeaccount.ChargeAccountRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "5CA228808CE91FB58CEDA4B9CDFE82E9";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.chargeaccount.ChargeAccountRequest _this) {
        return _this.getProductid();
    }
}
