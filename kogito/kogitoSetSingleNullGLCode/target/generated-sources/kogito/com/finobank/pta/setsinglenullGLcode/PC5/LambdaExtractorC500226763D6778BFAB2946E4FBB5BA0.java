package com.finobank.pta.setsinglenullGLcode.PC5;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorC500226763D6778BFAB2946E4FBB5BA0 implements org.drools.model.functions.Function1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "E5E877B32DBF1608EFD08570ACA42303";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest _this) {
        return _this.getFlagDebitCredit();
    }
}
