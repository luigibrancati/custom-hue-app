package Xd;

import Rd.Y;
import Wd.AbstractC2330j;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import lc.InterfaceC4988e;
import mc.C5045b;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(InterfaceC4988e interfaceC4988e, Throwable th) throws Throwable {
        if (th instanceof Y) {
            th = ((Y) th).getCause();
        }
        C4035r.a aVar = C4035r.f34274b;
        interfaceC4988e.resumeWith(C4035r.b(AbstractC4036s.a(th)));
        throw th;
    }

    public static final void b(InterfaceC4988e interfaceC4988e, InterfaceC4988e interfaceC4988e2) throws Throwable {
        try {
            InterfaceC4988e interfaceC4988eC = C5045b.c(interfaceC4988e);
            C4035r.a aVar = C4035r.f34274b;
            AbstractC2330j.b(interfaceC4988eC, C4035r.b(C4015H.f34254a));
        } catch (Throwable th) {
            a(interfaceC4988e2, th);
        }
    }

    public static final void c(p pVar, Object obj, InterfaceC4988e interfaceC4988e) {
        try {
            InterfaceC4988e interfaceC4988eC = C5045b.c(C5045b.a(pVar, obj, interfaceC4988e));
            C4035r.a aVar = C4035r.f34274b;
            AbstractC2330j.b(interfaceC4988eC, C4035r.b(C4015H.f34254a));
        } catch (Throwable th) {
            a(interfaceC4988e, th);
        }
    }
}
