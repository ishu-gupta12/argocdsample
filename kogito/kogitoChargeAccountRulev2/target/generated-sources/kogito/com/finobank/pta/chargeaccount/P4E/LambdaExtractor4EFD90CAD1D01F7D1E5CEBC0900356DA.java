package com.finobank.pta.chargeaccount.P4E;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor4EFD90CAD1D01F7D1E5CEBC0900356DA implements org.drools.model.functions.Function1<com.finobank.pta.chargeaccount.ChargeAccountRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "084163303E39D020F4331D01D64C4F7C";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.chargeaccount.ChargeAccountRequest _this) {
        return _this.getTrantype();
    }
}
