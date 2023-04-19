package com.finobank.pta.setsinglenullGLcode.P87;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor8715BA029050C049B0752423081DFA15 implements org.drools.model.functions.Function1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "481A2C00E542E336A37CDBFF4704B078";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest _this) {
        return _this.getUserClass();
    }
}
