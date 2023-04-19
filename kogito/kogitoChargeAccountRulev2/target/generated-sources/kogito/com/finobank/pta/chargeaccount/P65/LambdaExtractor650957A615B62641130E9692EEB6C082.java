package com.finobank.pta.chargeaccount.P65;

import static com.finobank.pta.chargeaccount.RulesC7DF8C050BB15943859DD690572C5AE9.*;
import com.finobank.pta.chargeaccount.*;
import com.finobank.pta.chargeaccount.ChargeAccountRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor650957A615B62641130E9692EEB6C082 implements org.drools.model.functions.Function1<com.finobank.pta.chargeaccount.ChargeAccountRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "72CC863EBDDF8AD0EF7BD19C36C04417";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.chargeaccount.ChargeAccountRequest _this) {
        return _this.getAppid();
    }
}
