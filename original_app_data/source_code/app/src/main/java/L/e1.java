package L;

import L.C1110m;
import android.util.Range;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range f8057a = new Range(0, 0);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public abstract e1 a();

        public abstract a b(E.J j10);

        public abstract a c(Range range);

        public abstract a d(InterfaceC1099g0 interfaceC1099g0);

        public abstract a e(Size size);

        public abstract a f(Size size);

        public abstract a g(int i10);

        public abstract a h(boolean z10);
    }

    public static a a(Size size) {
        return new C1110m.b().f(size).e(size).g(0).c(f8057a).b(E.J.f2794d).h(false);
    }

    public abstract E.J b();

    public abstract Range c();

    public abstract InterfaceC1099g0 d();

    public abstract Size e();

    public abstract Size f();

    public abstract int g();

    public abstract boolean h();

    public abstract a i();
}
