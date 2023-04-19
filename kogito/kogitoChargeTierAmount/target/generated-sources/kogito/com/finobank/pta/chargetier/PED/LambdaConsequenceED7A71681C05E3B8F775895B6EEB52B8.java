package com.finobank.pta.chargetier.PED;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceED7A71681C05E3B8F775895B6EEB52B8 implements org.drools.model.functions.Block1<com.finobank.pta.chargetier.ChargeTierRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "EA8E444DBE116F9D9FB3C06D7B0173A0";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargetier.ChargeTierRequest $request) throws java.lang.Exception {
        $request.setChargeDetails("F");
        $request.setRealChargeValue(47);
    }
}
