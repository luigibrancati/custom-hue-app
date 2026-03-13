package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class CompositeModulesLoader extends ModulesLoader {
    private final List<IModulesLoader> loaders;

    public CompositeModulesLoader(List<IModulesLoader> list, ILogger iLogger) {
        super(iLogger);
        this.loaders = list;
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public Map<String, String> loadModules() {
        TreeMap treeMap = new TreeMap();
        Iterator<IModulesLoader> it = this.loaders.iterator();
        while (it.hasNext()) {
            Map<String, String> orLoadModules = it.next().getOrLoadModules();
            if (orLoadModules != null) {
                treeMap.putAll(orLoadModules);
            }
        }
        return treeMap;
    }
}
