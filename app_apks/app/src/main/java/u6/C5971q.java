package u6;

import b7.C2878l;
import com.google.android.gms.common.api.Status;
import v6.C6046a;

/* JADX INFO: renamed from: u6.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5971q {
    public static void a(Status status, C2878l c2878l) {
        b(status, null, c2878l);
    }

    public static void b(Status status, Object obj, C2878l c2878l) {
        if (status.k()) {
            c2878l.c(obj);
        } else {
            c2878l.b(C6046a.a(status));
        }
    }

    public static boolean c(Status status, Object obj, C2878l c2878l) {
        return status.k() ? c2878l.e(obj) : c2878l.d(C6046a.a(status));
    }
}
