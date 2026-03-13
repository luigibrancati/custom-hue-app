package v0;

import e0.C3921a;
import l0.InterfaceC4869e;

/* JADX INFO: renamed from: v0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6029d {
    public static final boolean b(InterfaceC6028c interfaceC6028c, int i10) {
        return (interfaceC6028c.a().b() & i10) != 0;
    }

    public static final InterfaceC4869e.c c(C3921a c3921a) {
        if (c3921a == null || c3921a.o() == 0) {
            return null;
        }
        return (InterfaceC4869e.c) c3921a.u(c3921a.o() - 1);
    }
}
