package com.finobank.pta.taxescalculator.P80;

import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;
import com.finobank.pta.taxescalculator.*;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor8002DAF9FA8D45386B79E4885C6E4316 implements org.drools.model.functions.Function1<com.finobank.pta.taxescalculator.TaxCalculationRequest, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9974090DC82AA1D6C5DC85975F680A7C";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(com.finobank.pta.taxescalculator.TaxCalculationRequest _this) {
        return _this.getFinoBranchStateCode();
    }
}
