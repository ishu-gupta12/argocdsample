package com.finobank.pta.chargetier.P84;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor84BD48C26006537CD8B077A631AF2907 implements org.drools.model.functions.Function1<com.finobank.pta.chargetier.ChargeTierRequest, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4F93EFE0301AB1B403C41E8C7B834257";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(com.finobank.pta.chargetier.ChargeTierRequest _this) {
        return _this.getChargeID();
    }
}
