package io.sentry.internal.modules;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpModulesLoader implements IModulesLoader {
    private static final NoOpModulesLoader instance = new NoOpModulesLoader();

    private NoOpModulesLoader() {
    }

    public static NoOpModulesLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.internal.modules.IModulesLoader
    public Map<String, String> getOrLoadModules() {
        return null;
    }
}
