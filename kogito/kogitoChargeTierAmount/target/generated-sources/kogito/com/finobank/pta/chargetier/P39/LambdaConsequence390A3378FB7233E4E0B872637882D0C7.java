package com.finobank.pta.chargetier.P39;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence390A3378FB7233E4E0B872637882D0C7 implements org.drools.model.functions.Block1<com.finobank.pta.chargetier.ChargeTierRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "662D3F0E2DB6EB4B936B8D87E57FEBA4";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargetier.ChargeTierRequest $request) throws java.lang.Exception {
        $request.setChargeDetails("F");
        $request.setRealChargeValue(1.18);
    }
}
