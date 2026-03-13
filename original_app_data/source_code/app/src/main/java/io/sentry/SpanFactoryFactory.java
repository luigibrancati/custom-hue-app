package io.sentry;

import io.sentry.util.LoadClass;
import io.sentry.util.Platform;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SpanFactoryFactory {
    private static final String OTEL_SPAN_FACTORY = "io.sentry.opentelemetry.OtelSpanFactory";

    public static ISpanFactory create(LoadClass loadClass, ILogger iLogger) {
        Class<?> clsLoadClass;
        if (Platform.isJvm() && loadClass.isClassAvailable(OTEL_SPAN_FACTORY, iLogger) && (clsLoadClass = loadClass.loadClass(OTEL_SPAN_FACTORY, iLogger)) != null) {
            try {
                Object objNewInstance = clsLoadClass.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof ISpanFactory)) {
                    return (ISpanFactory) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new DefaultSpanFactory();
    }
}
