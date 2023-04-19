package com.finobank.pta.taxescalculator;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.taxescalculator.TaxCalculationRequest;

public abstract class Rules124468C2FDDEC2D953291DFF095CD58B implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.core.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "com.finobank.pta.taxescalculator";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("taxRequest"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.SingletonStore> var_taxRequest = D.globalOf(org.kie.kogito.rules.SingletonStore.class,
                                                                                                                 "com.finobank.pta.taxescalculator",
                                                                                                                 "taxRequest");

    public static final org.drools.model.Query0Def queryDef_gettaxdetails = D.query("com.finobank.pta.taxescalculator",
                                                                                    "gettaxdetails");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    {
        globals.add(var_taxRequest);
    }
}
