package com.finobank.pta.chargeaccount.P15;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor157F113A73B1C897192708EA16A95990 implements org.drools.model.functions.Function1<com.finobank.pta.chargeaccount.ChargeAccountRequest, com.finobank.pta.chargeaccount.ChargeAccountResponse>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "2F1A62340B907C4E094354797F772D53";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public com.finobank.pta.chargeaccount.ChargeAccountResponse apply(com.finobank.pta.chargeaccount.ChargeAccountRequest _this) {
        return _this.getApiResponse();
    }
}
