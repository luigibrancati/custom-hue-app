package io.sentry.internal.debugmeta;

import java.util.List;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpDebugMetaLoader implements IDebugMetaLoader {
    private static final NoOpDebugMetaLoader instance = new NoOpDebugMetaLoader();

    private NoOpDebugMetaLoader() {
    }

    public static NoOpDebugMetaLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    public List<Properties> loadDebugMeta() {
        return null;
    }
}
