package com.finobank.pta.chargetier.PDB;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceDBB2F9772AAD6BB39FAAAD92E286844E implements org.drools.model.functions.Block1<com.finobank.pta.chargetier.ChargeTierRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "2B82E6C10DF6868046858226AF138322";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.chargetier.ChargeTierRequest $request) throws java.lang.Exception {
        $request.setChargeDetails("F");
        $request.setRealChargeValue(37);
    }
}
