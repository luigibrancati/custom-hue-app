package L;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: L.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1096f {
    public static AbstractC1096f a(h1 h1Var, int i10, Size size, E.J j10, List list, InterfaceC1099g0 interfaceC1099g0, int i11, Range range, boolean z10) {
        return new C1098g(h1Var, i10, size, j10, list, interfaceC1099g0, i11, range, z10);
    }

    public abstract List b();

    public abstract E.J c();

    public abstract int d();

    public abstract InterfaceC1099g0 e();

    public abstract int f();

    public abstract Size g();

    public abstract h1 h();

    public abstract Range i();

    public abstract boolean j();

    public e1 k(InterfaceC1099g0 interfaceC1099g0) {
        return e1.a(g()).g(f()).c(i()).b(c()).d(interfaceC1099g0).a();
    }
}
