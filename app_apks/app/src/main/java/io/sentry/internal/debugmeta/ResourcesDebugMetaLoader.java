package io.sentry.internal.debugmeta;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import io.sentry.util.DebugMetaPropertiesApplier;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ResourcesDebugMetaLoader implements IDebugMetaLoader {
    private final ClassLoader classLoader;
    private final ILogger logger;

    public ResourcesDebugMetaLoader(ILogger iLogger) {
        this(iLogger, ResourcesDebugMetaLoader.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    public List<Properties> loadDebugMeta() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.classLoader.getResources(DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(urlNextElement);
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.logger.log(SentryLevel.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e10) {
                    this.logger.log(SentryLevel.ERROR, e10, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e11) {
            this.logger.log(SentryLevel.ERROR, e11, "Failed to load %s", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.logger.log(SentryLevel.INFO, "No %s file was found.", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
        return null;
    }

    public ResourcesDebugMetaLoader(ILogger iLogger, ClassLoader classLoader) {
        this.logger = iLogger;
        this.classLoader = ClassLoaderUtils.classLoaderOrDefault(classLoader);
    }
}
