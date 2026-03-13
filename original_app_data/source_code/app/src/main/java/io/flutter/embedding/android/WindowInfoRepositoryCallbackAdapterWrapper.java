package io.flutter.embedding.android;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WindowInfoRepositoryCallbackAdapterWrapper {
    final B3.a adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(B3.a aVar) {
        this.adapter = aVar;
    }

    public void addWindowLayoutInfoListener(Activity activity, Executor executor, X0.a aVar) {
        this.adapter.b(activity, executor, aVar);
    }

    public void removeWindowLayoutInfoListener(X0.a aVar) {
        this.adapter.c(aVar);
    }
}
