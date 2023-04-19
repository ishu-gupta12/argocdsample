package com.finobank.pta.chargetier.P45;

import static com.finobank.pta.chargetier.Rules72E9FCBA65B08233BFEA940168E38FFB.*;
import com.finobank.pta.chargetier.ChargeTierRequest;
import com.finobank.pta.chargetier.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor45C0AF0FA93A93004DDD759F82640ED6 implements org.drools.model.functions.Function1<com.finobank.pta.chargetier.ChargeTierRequest, Double>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "59EE0D45C53E15E7238954A96DF48BBB";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Double apply(com.finobank.pta.chargetier.ChargeTierRequest _this) {
        return _this.getTransactionAmount();
    }
}
