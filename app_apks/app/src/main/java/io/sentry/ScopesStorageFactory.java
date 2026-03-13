package io.sentry;

import io.sentry.util.LoadClass;
import io.sentry.util.Platform;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ScopesStorageFactory {
    private static final String OTEL_SCOPES_STORAGE = "io.sentry.opentelemetry.OtelContextScopesStorage";

    public static IScopesStorage create(LoadClass loadClass, ILogger iLogger) {
        IScopesStorage iScopesStorageCreateInternal = createInternal(loadClass, iLogger);
        iScopesStorageCreateInternal.init();
        return iScopesStorageCreateInternal;
    }

    private static IScopesStorage createInternal(LoadClass loadClass, ILogger iLogger) {
        Class<?> clsLoadClass;
        if (Platform.isJvm() && loadClass.isClassAvailable(OTEL_SCOPES_STORAGE, iLogger) && (clsLoadClass = loadClass.loadClass(OTEL_SCOPES_STORAGE, iLogger)) != null) {
            try {
                Object objNewInstance = clsLoadClass.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof IScopesStorage)) {
                    return (IScopesStorage) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new DefaultScopesStorage();
    }
}
