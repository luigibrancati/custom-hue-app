package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class CompositePropertiesProvider implements PropertiesProvider {
    private final List<PropertiesProvider> providers;

    public CompositePropertiesProvider(List<PropertiesProvider> list) {
        this.providers = list;
    }

    @Override // io.sentry.config.PropertiesProvider
    public Map<String, String> getMap(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator<PropertiesProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(it.next().getMap(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.PropertiesProvider
    public String getProperty(String str) {
        Iterator<PropertiesProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            String property = it.next().getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
