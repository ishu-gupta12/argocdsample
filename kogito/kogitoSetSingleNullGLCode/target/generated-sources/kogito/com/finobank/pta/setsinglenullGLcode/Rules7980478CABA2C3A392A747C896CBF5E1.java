package com.finobank.pta.setsinglenullGLcode;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.setsinglenullGLcode.SetSingleNullGLCodeRequest;

public abstract class Rules7980478CABA2C3A392A747C896CBF5E1 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.core.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "com.finobank.pta.setsinglenullGLcode";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("singleCodeRequest"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.SingletonStore> var_singleCodeRequest = D.globalOf(org.kie.kogito.rules.SingletonStore.class,
                                                                                                                        "com.finobank.pta.setsinglenullGLcode",
                                                                                                                        "singleCodeRequest");

    public static final org.drools.model.Query0Def queryDef_getsingleglnum = D.query("com.finobank.pta.setsinglenullGLcode",
                                                                                     "getsingleglnum");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    {
        globals.add(var_singleCodeRequest);
    }
}
