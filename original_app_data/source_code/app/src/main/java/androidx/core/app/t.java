package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static int a(boolean z10, int i10) {
        return (z10 ? 33554432 : 67108864) | i10;
    }

    public static PendingIntent b(Context context, int i10, Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11));
    }
}
