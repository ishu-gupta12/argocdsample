package com.finobank.pta.setbothnullGLcode.P2B;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence2B21DD0C3828D700670B5D882F1ACB0B implements org.drools.model.functions.Block1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "53AC46F0C0ECF675A490080B7C283D78";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest $request) throws java.lang.Exception {
        $request.setDrAccountOrGLCode("3210000101");
        $request.setCrAccountOrGLCode("87654321");
    }
}
