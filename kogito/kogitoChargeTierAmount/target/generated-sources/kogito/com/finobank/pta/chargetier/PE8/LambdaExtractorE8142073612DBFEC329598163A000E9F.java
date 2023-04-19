package com.finobank.pta.chargetier.PE8;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorE8142073612DBFEC329598163A000E9F implements org.drools.model.functions.Function1<com.finobank.pta.chargetier.ChargeTierRequest, com.finobank.pta.chargetier.ChargeTierResponse>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "5A04ADDC4ADDF1008B9EA90CCA96A0E6";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public com.finobank.pta.chargetier.ChargeTierResponse apply(com.finobank.pta.chargetier.ChargeTierRequest _this) {
        return _this.getApiResponse();
    }
}
