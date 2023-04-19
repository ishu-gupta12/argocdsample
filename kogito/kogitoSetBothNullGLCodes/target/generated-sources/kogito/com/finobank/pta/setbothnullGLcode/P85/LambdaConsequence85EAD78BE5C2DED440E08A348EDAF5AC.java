package com.finobank.pta.setbothnullGLcode.P85;

import static com.finobank.pta.setbothnullGLcode.RulesF08758C3B0C48D1A8FEEB907D51082A5.*;
import com.finobank.pta.setbothnullGLcode.*;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence85EAD78BE5C2DED440E08A348EDAF5AC implements org.drools.model.functions.Block1<com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "B2BCA1405588D3D4126F49A069C01965";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest $request) throws java.lang.Exception {
        $request.setDrAccountOrGLCode("3233000104");
        $request.setCrAccountOrGLCode("12345678");
    }
}
