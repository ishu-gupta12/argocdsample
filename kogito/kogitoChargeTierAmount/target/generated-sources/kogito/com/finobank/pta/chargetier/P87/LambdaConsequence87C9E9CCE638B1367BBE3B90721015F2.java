package com.finobank.pta.chargetier.P87;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence87C9E9CCE638B1367BBE3B90721015F2 implements org.drools.model.functions.Block1<com.finobank.pta.chargetier.ChargeTierRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "D9881DD74F9254B990F4F5A2B69986CA";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargetier.ChargeTierRequest $request) throws java.lang.Exception {
        $request.setChargeDetails("F");
        $request.setRealChargeValue(15);
    }
}
