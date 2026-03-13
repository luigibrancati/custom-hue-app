package ae;

import Wd.E;

/* JADX INFO: renamed from: ae.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2693g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f21239a = new E("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f21240b = new E("ALREADY_LOCKED_BY_OWNER");

    public static final InterfaceC2687a a(boolean z10) {
        return new C2692f(z10);
    }

    public static /* synthetic */ InterfaceC2687a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
