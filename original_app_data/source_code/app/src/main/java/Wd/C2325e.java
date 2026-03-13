package Wd;

import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Wd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2325e implements Rd.M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4992i f17921a;

    public C2325e(InterfaceC4992i interfaceC4992i) {
        this.f17921a = interfaceC4992i;
    }

    @Override // Rd.M
    public InterfaceC4992i getCoroutineContext() {
        return this.f17921a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
