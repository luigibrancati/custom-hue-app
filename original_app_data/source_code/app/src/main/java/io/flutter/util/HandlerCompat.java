package io.flutter.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerCompat {
    public static Handler createAsyncHandler(Looper looper) {
        return Handler.createAsync(looper);
    }
}
