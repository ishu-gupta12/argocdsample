package com.finobank.pta.setbothnullGLcode.PB4;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceB4CAC5B323AE32AB27A673443D6E5CA0 implements org.drools.model.functions.Block1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "F4EB46A1395BC2977195AA29402CA545";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest $request) throws java.lang.Exception {
        $request.setDrAccountOrGLCode("G234567");
        $request.setCrAccountOrGLCode("33333003333");
    }
}
