package tc;

import d.AbstractC3782A;
import fc.C4022e;

/* JADX INFO: renamed from: tc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5877a {
    public static final void a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                AbstractC3782A.a(autoCloseable);
                return;
            }
            try {
                AbstractC3782A.a(autoCloseable);
            } catch (Throwable th2) {
                C4022e.a(th, th2);
            }
        }
    }
}
