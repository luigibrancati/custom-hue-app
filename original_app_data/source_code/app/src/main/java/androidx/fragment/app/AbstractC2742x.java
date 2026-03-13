package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2742x {
    public ComponentCallbacksC2736q b(Context context, String str, Bundle bundle) {
        return ComponentCallbacksC2736q.instantiate(context, str, bundle);
    }

    public abstract View c(int i10);

    public abstract boolean d();
}
