package com.finobank.pta.chargetier.P4F;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence4F9CA5325D5F7BB6103D71AFFE6E5F51 implements org.drools.model.functions.Block1<com.finobank.pta.chargetier.ChargeTierRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "3AE30EB81115B1B533998C6082DEDBAF";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargetier.ChargeTierRequest $request) throws java.lang.Exception {
        $request.setChargeDetails("F");
        $request.setRealChargeValue(27);
    }
}
