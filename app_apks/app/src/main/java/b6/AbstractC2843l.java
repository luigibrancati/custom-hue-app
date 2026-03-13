package b6;

import f6.AbstractC3996a;

/* JADX INFO: renamed from: b6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2843l {
    public static void a(Y5.i iVar, Y5.f fVar) {
        if (!(iVar instanceof C2850s)) {
            AbstractC3996a.f("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", iVar);
        } else {
            u.c().e().l(((C2850s) iVar).d().f(fVar), 1);
        }
    }
}
