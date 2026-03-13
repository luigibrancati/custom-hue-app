package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.lifecycle.AbstractC2754j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ServiceControlSurface {
    void attachToService(Service service, AbstractC2754j abstractC2754j, boolean z10);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
