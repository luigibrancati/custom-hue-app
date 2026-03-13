package s3;

import android.os.Trace;

/* JADX INFO: renamed from: s3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5714c {
    public static void a(String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
