package com.finobank.pta.setsinglenullGLcode.P87;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor87B1C12B3B6B09BFBEA9146EA9F757CE implements org.drools.model.functions.Function1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9A97488DAACDF39502B3E2044C5A2880";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest _this) {
        return _this.getAppId();
    }
}
