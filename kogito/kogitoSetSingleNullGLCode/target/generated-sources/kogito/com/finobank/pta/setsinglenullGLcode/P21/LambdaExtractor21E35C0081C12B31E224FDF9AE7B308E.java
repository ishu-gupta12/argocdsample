package com.finobank.pta.setsinglenullGLcode.P21;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor21E35C0081C12B31E224FDF9AE7B308E implements org.drools.model.functions.Function1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "03C523BB41AA7AF995768F61E42BDDF8";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest _this) {
        return _this.getTranType();
    }
}
