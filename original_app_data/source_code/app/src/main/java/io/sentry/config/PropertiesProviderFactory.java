package io.sentry.config;

import io.sentry.SystemOutLogger;
import java.util.ArrayList;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class PropertiesProviderFactory {
    public static PropertiesProvider create() {
        Properties propertiesLoad;
        Properties propertiesLoad2;
        SystemOutLogger systemOutLogger = new SystemOutLogger();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SystemPropertyPropertiesProvider());
        arrayList.add(new EnvironmentVariablePropertiesProvider());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesLoad2 = new FilesystemPropertiesLoader(property, systemOutLogger).load()) != null) {
            arrayList.add(new SimplePropertiesProvider(propertiesLoad2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesLoad = new FilesystemPropertiesLoader(str, systemOutLogger).load()) != null) {
            arrayList.add(new SimplePropertiesProvider(propertiesLoad));
        }
        Properties propertiesLoad3 = new ClasspathPropertiesLoader(systemOutLogger).load();
        if (propertiesLoad3 != null) {
            arrayList.add(new SimplePropertiesProvider(propertiesLoad3));
        }
        Properties propertiesLoad4 = new FilesystemPropertiesLoader("sentry.properties", systemOutLogger, false).load();
        if (propertiesLoad4 != null) {
            arrayList.add(new SimplePropertiesProvider(propertiesLoad4));
        }
        return new CompositePropertiesProvider(arrayList);
    }
}
