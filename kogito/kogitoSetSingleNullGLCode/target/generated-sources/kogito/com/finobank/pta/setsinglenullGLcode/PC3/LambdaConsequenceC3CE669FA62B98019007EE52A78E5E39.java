package com.finobank.pta.setsinglenullGLcode.PC3;

import static com.finobank.pta.setsinglenullGLcode.Rules7980478CABA2C3A392A747C896CBF5E1.*;
import com.finobank.pta.setsinglenullGLcode.*;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceC3CE669FA62B98019007EE52A78E5E39 implements org.drools.model.functions.Block1<com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "E662973242484FC335073033DEE355A8";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest $request) throws java.lang.Exception {
        $request.setAccountOrGLCode("3210000101");
    }
}
