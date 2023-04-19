package com.finobank.pta.setbothnullGLcode.PC6;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceC65EF6BA1CB44516E8DAD6D2BE8AFFB5 implements org.drools.model.functions.Block1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "B3659DEE545DECA6A5232D4B21F0F40A";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest $request) throws java.lang.Exception {
        $request.setDrAccountOrGLCode("20020845341");
        $request.setCrAccountOrGLCode("2346");
    }
}
