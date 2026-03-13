package m4;

import fc.C4015H;
import i4.f;
import i4.j;
import i4.n;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: m4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5020a implements InterfaceC5021b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5020a f40195c = new C5020a();

    @Override // m4.InterfaceC5021b
    public Object a(InterfaceC5022c interfaceC5022c, j jVar, InterfaceC4988e interfaceC4988e) {
        if (jVar instanceof n) {
            interfaceC5022c.onSuccess(((n) jVar).a());
        } else if (jVar instanceof f) {
            interfaceC5022c.onError(jVar.a());
        }
        return C4015H.f34254a;
    }

    public String toString() {
        return "coil.transition.NoneTransition";
    }
}
