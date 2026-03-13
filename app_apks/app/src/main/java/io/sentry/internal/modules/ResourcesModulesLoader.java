package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ResourcesModulesLoader extends ModulesLoader {
    private final ClassLoader classLoader;

    public ResourcesModulesLoader(ILogger iLogger) {
        this(iLogger, ResourcesModulesLoader.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public Map<String, String> loadModules() {
        InputStream resourceAsStream;
        TreeMap treeMap = new TreeMap();
        try {
            resourceAsStream = this.classLoader.getResourceAsStream(ModulesLoader.EXTERNAL_MODULES_FILENAME);
        } catch (IOException e10) {
            this.logger.log(SentryLevel.INFO, "Access to resources failed.", e10);
        } catch (SecurityException e11) {
            this.logger.log(SentryLevel.INFO, "Access to resources denied.", e11);
        }
        try {
            if (resourceAsStream != null) {
                Map<String, String> stream = parseStream(resourceAsStream);
                resourceAsStream.close();
                return stream;
            }
            this.logger.log(SentryLevel.INFO, "%s file was not found.", ModulesLoader.EXTERNAL_MODULES_FILENAME);
            if (resourceAsStream != null) {
                resourceAsStream.close();
                return treeMap;
            }
            return treeMap;
        } catch (Throwable th) {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public ResourcesModulesLoader(ILogger iLogger, ClassLoader classLoader) {
        super(iLogger);
        this.classLoader = ClassLoaderUtils.classLoaderOrDefault(classLoader);
    }
}
