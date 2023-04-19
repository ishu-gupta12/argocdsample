package com.finobank.pta.setbothnullGLcode.P08;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor08D3FA6AECCAF0FE250985193E569C37 implements org.drools.model.functions.Function1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "8CAF66EBCA2B17663ACD83B0AD2ADCBA";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest _this) {
        return _this.getTranType();
    }
}
