package com.finobank.pta.setbothnullGLcode.P2A;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence2A36AF297AFA207FDAA0CEA062899565 implements org.drools.model.functions.Block1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "09BE5C8E6B3AE7CAFED2FAD104A05FCB";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest $request) throws java.lang.Exception {
        $request.setDrAccountOrGLCode("2346");
        $request.setCrAccountOrGLCode("2222220022");
    }
}
