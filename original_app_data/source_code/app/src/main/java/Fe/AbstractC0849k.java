package Fe;

import Fe.A;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fe.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0849k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4137a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0849k f4138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f4139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC0849k f4140d;

    /* JADX INFO: renamed from: Fe.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    static {
        AbstractC0849k tVar;
        try {
            Class.forName("java.nio.file.Files");
            tVar = new u();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        f4138b = tVar;
        A.a aVar = A.f4048b;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC4862t.d(property, "getProperty(...)");
        f4139c = A.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = Ge.h.class.getClassLoader();
        AbstractC4862t.d(classLoader, "getClassLoader(...)");
        f4140d = new Ge.h(classLoader, false, null, 4, null);
    }

    public final H a(A file) {
        AbstractC4862t.e(file, "file");
        return b(file, false);
    }

    public abstract H b(A a10, boolean z10);

    public abstract void c(A a10, A a11);

    public final void d(A dir) {
        AbstractC4862t.e(dir, "dir");
        e(dir, false);
    }

    public final void e(A dir, boolean z10) {
        AbstractC4862t.e(dir, "dir");
        Ge.c.a(this, dir, z10);
    }

    public final void f(A dir) {
        AbstractC4862t.e(dir, "dir");
        g(dir, false);
    }

    public abstract void g(A a10, boolean z10);

    public final void h(A path) {
        AbstractC4862t.e(path, "path");
        i(path, false);
    }

    public abstract void i(A a10, boolean z10);

    public final boolean j(A path) {
        AbstractC4862t.e(path, "path");
        return Ge.c.b(this, path);
    }

    public abstract List k(A a10);

    public final C0848j l(A path) {
        AbstractC4862t.e(path, "path");
        return Ge.c.c(this, path);
    }

    public abstract C0848j m(A a10);

    public abstract AbstractC0847i n(A a10);

    public final H o(A file) {
        AbstractC4862t.e(file, "file");
        return p(file, false);
    }

    public abstract H p(A a10, boolean z10);

    public abstract J q(A a10);
}
