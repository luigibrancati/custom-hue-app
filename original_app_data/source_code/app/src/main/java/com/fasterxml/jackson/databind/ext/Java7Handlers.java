package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Java7Handlers {
    private static final Java7Handlers IMPL;

    static {
        Java7Handlers java7Handlers;
        try {
            java7Handlers = (Java7Handlers) ClassUtil.createInstance(Java7HandlersImpl.class, false);
        } catch (Throwable unused) {
            Logger.getLogger(Java7Handlers.class.getName()).warning("Unable to load JDK7 types (java.nio.file.Path): no Java7 type support added");
            java7Handlers = null;
        }
        IMPL = java7Handlers;
    }

    public static Java7Handlers instance() {
        return IMPL;
    }

    public abstract Class<?> getClassJavaNioFilePath();

    public abstract JsonDeserializer<?> getDeserializerForJavaNioFilePath(Class<?> cls);

    public abstract JsonSerializer<?> getSerializerForJavaNioFilePath(Class<?> cls);
}
