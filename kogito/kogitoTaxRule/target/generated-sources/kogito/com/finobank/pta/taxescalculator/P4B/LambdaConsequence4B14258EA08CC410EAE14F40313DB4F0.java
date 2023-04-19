package com.finobank.pta.taxescalculator.P4B;

import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;
import com.finobank.pta.taxescalculator.*;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence4B14258EA08CC410EAE14F40313DB4F0 implements org.drools.model.functions.Block1<com.finobank.pta.taxescalculator.TaxCalculationRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A1A81B0A5A7E6E4A1FA1ED4B7516BB04";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.taxescalculator.TaxCalculationRequest $request) throws java.lang.Exception {
        $request.setIGSTPercent(18);
        $request.setCSGSTPercent(0, 0);
        $request.setTaxIGSTTranType("IGSTTran");
        $request.setTaxCGSTTranType("CGSTTran");
        $request.setTaxSGSTTranType("SGSTTran");
    }
}
