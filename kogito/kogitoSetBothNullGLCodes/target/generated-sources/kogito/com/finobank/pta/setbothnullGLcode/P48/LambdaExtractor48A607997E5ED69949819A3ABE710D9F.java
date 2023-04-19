package com.finobank.pta.setbothnullGLcode.P48;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor48A607997E5ED69949819A3ABE710D9F implements org.drools.model.functions.Function1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "5EFA7BF12270313A7ED146F6C34D27FA";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest _this) {
        return _this.getUserClass();
    }
}
