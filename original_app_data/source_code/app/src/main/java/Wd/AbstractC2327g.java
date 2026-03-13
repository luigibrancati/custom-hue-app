package Wd;

import fc.C4022e;
import java.util.Iterator;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Wd.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2327g {
    public static final void a(InterfaceC4992i interfaceC4992i, Throwable th) {
        Iterator it = AbstractC2326f.a().iterator();
        while (it.hasNext()) {
            try {
                ((Rd.J) it.next()).handleException(interfaceC4992i, th);
            } catch (Throwable th2) {
                AbstractC2326f.b(Rd.K.b(th, th2));
            }
        }
        try {
            C4022e.a(th, new C2328h(interfaceC4992i));
        } catch (Throwable unused) {
        }
        AbstractC2326f.b(th);
    }
}
