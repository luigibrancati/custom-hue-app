package E;

import L.k1;
import M.h;
import android.graphics.Matrix;

/* JADX INFO: renamed from: E.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0801m0 implements InterfaceC0787f0 {
    public static InterfaceC0787f0 e(k1 k1Var, long j10, int i10, Matrix matrix, int i11) {
        return new C0788g(k1Var, j10, i10, matrix, i11);
    }

    @Override // E.InterfaceC0787f0
    public void a(h.b bVar) {
        bVar.m(d());
    }

    @Override // E.InterfaceC0787f0
    public abstract int b();

    @Override // E.InterfaceC0787f0
    public abstract k1 c();

    @Override // E.InterfaceC0787f0
    public abstract int d();

    public abstract Matrix f();

    @Override // E.InterfaceC0787f0
    public abstract long getTimestamp();
}
