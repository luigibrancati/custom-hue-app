package io.sentry.android.core;

import io.sentry.protocol.DebugImage;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class NoOpDebugImagesLoader implements IDebugImagesLoader {
    private static final NoOpDebugImagesLoader instance = new NoOpDebugImagesLoader();

    private NoOpDebugImagesLoader() {
    }

    public static NoOpDebugImagesLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public List<DebugImage> loadDebugImages() {
        return null;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public Set<DebugImage> loadDebugImagesForAddresses(Set<String> set) {
        return null;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public void clearDebugImages() {
    }
}
