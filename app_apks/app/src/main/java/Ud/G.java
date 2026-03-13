package Ud;

import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wd.E f17002a = new Wd.E("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Wd.E f17003b = new Wd.E("PENDING");

    public static final w a(Object obj) {
        if (obj == null) {
            obj = Vd.t.f17583a;
        }
        return new F(obj);
    }

    public static final InterfaceC2313e d(E e10, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != Td.a.DROP_OLDEST) ? C.d(e10, interfaceC4992i, i10, aVar) : e10;
    }
}
