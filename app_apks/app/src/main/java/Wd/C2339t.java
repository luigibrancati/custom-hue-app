package Wd;

import Rd.J0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: Wd.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2339t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2339t f17954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J0 f17955b;

    static {
        C2339t c2339t = new C2339t();
        f17954a = c2339t;
        F.f("kotlinx.coroutines.fast.service.loader", true);
        f17955b = c2339t.a();
    }

    public final J0 a() {
        Object next;
        J0 j0E;
        try {
            List listO = Nd.t.O(Nd.q.g(ServiceLoader.load(InterfaceC2338s.class, InterfaceC2338s.class.getClassLoader()).iterator()));
            Iterator it = listO.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((InterfaceC2338s) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((InterfaceC2338s) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC2338s interfaceC2338s = (InterfaceC2338s) next;
            if (interfaceC2338s != null && (j0E = u.e(interfaceC2338s, listO)) != null) {
                return j0E;
            }
            return u.b(null, null, 3, null);
        } catch (Throwable th) {
            return u.b(th, null, 2, null);
        }
    }
}
