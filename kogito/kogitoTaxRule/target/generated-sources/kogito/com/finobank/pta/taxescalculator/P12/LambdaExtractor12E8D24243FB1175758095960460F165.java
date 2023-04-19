package com.finobank.pta.taxescalculator.P12;

import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;
import com.finobank.pta.taxescalculator.*;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor12E8D24243FB1175758095960460F165 implements org.drools.model.functions.Function1<com.finobank.pta.taxescalculator.TaxCalculationRequest, com.finobank.pta.taxescalculator.TaxCalculationResponse>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "25860D1D898308B19EB1CC525A1E1D81";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public com.finobank.pta.taxescalculator.TaxCalculationResponse apply(com.finobank.pta.taxescalculator.TaxCalculationRequest _this) {
        return _this.getApiResponse();
    }
}
