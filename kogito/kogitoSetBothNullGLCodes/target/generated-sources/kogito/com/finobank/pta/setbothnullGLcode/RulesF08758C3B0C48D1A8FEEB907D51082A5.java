package com.finobank.pta.setbothnullGLcode;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.finobank.pta.setbothnullGLcode.SetBothNullGLCodeRequest;

public abstract class RulesF08758C3B0C48D1A8FEEB907D51082A5 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.core.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "com.finobank.pta.setbothnullGLcode";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("bothCodeRequest"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.SingletonStore> var_bothCodeRequest = D.globalOf(org.kie.kogito.rules.SingletonStore.class,
                                                                                                                      "com.finobank.pta.setbothnullGLcode",
                                                                                                                      "bothCodeRequest");

    public static final org.drools.model.Query0Def queryDef_getbothglnum = D.query("com.finobank.pta.setbothnullGLcode",
                                                                                   "getbothglnum");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    {
        globals.add(var_bothCodeRequest);
    }
}
