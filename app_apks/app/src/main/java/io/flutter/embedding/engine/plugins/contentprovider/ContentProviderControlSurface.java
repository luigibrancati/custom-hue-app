package io.flutter.embedding.engine.plugins.contentprovider;

import android.content.ContentProvider;
import androidx.lifecycle.AbstractC2754j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ContentProviderControlSurface {
    void attachToContentProvider(ContentProvider contentProvider, AbstractC2754j abstractC2754j);

    void detachFromContentProvider();
}
