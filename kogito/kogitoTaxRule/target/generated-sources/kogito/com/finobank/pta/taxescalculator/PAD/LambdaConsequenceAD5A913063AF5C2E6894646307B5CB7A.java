package com.finobank.pta.taxescalculator.PAD;

import static com.finobank.pta.taxescalculator.Rules124468C2FDDEC2D953291DFF095CD58B.*;
import com.finobank.pta.taxescalculator.*;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceAD5A913063AF5C2E6894646307B5CB7A implements org.drools.model.functions.Block1<com.finobank.pta.taxescalculator.TaxCalculationRequest>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "703F370AD061D52D9A1C73B063B72E61";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.finobank.pta.taxescalculator.TaxCalculationRequest $request) throws java.lang.Exception {
        $request.setIGSTPercent(0);
        $request.setCSGSTPercent(9, 9);
        $request.setTaxIGSTTranType("IGSTTran");
        $request.setTaxCGSTTranType("CGSTTran");
        $request.setTaxSGSTTranType("SGSTTran");
    }
}
