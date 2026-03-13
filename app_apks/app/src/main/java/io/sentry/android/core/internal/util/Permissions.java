package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;
import io.sentry.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Permissions {
    private Permissions() {
    }

    public static boolean hasPermission(Context context, String str) {
        Objects.requireNonNull(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
