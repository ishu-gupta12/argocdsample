package com.finobank.pta.taxescalculator.P1C;

import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;
import com.finobank.pta.taxescalculator.*;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor1CFA8AF107640544CBB390B0FA88116B implements org.drools.model.functions.Function1<com.finobank.pta.taxescalculator.TaxCalculationRequest, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "027C3DE9A259DC96401C1E7329CA50C9";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(com.finobank.pta.taxescalculator.TaxCalculationRequest _this) {
        return _this.getPartnerStateCode();
    }
}
