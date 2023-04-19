package com.finobank.pta.setbothnullGLcode.P9E;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor9E21893D8A8174E1CC882FC97D35C342 implements org.drools.model.functions.Function1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "2AA5EF7015ECE8AE5A9E6F3AFD489F6E";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest _this) {
        return _this.getAppId();
    }
}
