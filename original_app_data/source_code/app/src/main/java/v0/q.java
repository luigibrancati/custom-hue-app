package v0;

import b0.AbstractC2774E;
import b0.C2770A;
import l0.AbstractC4865a;
import l0.InterfaceC4869e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2770A f45734a = AbstractC2774E.a();

    public static final int a(InterfaceC4869e.c cVar) {
        if (cVar.e() != 0) {
            return cVar.e();
        }
        C2770A c2770a = f45734a;
        Object objA = AbstractC4865a.a(cVar);
        int iA = c2770a.a(objA);
        if (iA >= 0) {
            return c2770a.f24834c[iA];
        }
        int iA2 = p.a(1);
        c2770a.o(objA, iA2);
        return iA2;
    }

    public static final boolean b(int i10) {
        return ((p.a(128) & i10) != 0) | ((i10 & p.a(4194304)) != 0);
    }
}
