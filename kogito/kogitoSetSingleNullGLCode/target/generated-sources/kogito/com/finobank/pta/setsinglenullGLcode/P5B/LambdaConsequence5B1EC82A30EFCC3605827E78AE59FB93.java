package com.finobank.pta.setsinglenullGLcode.P5B;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence5B1EC82A30EFCC3605827E78AE59FB93 implements org.drools.model.functions.Block1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "C1726D000251F785F21E9CE03748E30C";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest $request) throws java.lang.Exception {
        $request.setAccountOrGLCode("3233000104");
    }
}
