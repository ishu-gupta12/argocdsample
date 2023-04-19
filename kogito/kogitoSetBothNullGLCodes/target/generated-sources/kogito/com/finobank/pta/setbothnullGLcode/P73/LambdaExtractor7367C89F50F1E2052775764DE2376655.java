package com.finobank.pta.setbothnullGLcode.P73;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor7367C89F50F1E2052775764DE2376655 implements org.drools.model.functions.Function1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest, com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "F7C2B1E213BE8A9C385556764783AA3F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeResponse apply(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest _this) {
        return _this.getApiResponse();
    }
}
