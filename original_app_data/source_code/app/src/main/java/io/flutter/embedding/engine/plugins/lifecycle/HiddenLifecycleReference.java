package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC2754j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class HiddenLifecycleReference {
    private final AbstractC2754j lifecycle;

    public HiddenLifecycleReference(AbstractC2754j abstractC2754j) {
        this.lifecycle = abstractC2754j;
    }

    public AbstractC2754j getLifecycle() {
        return this.lifecycle;
    }
}
