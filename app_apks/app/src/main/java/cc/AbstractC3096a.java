package cc;

import Eb.q;
import Vb.n;
import Vb.o;
import bc.AbstractC2904a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: cc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3096a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f26483a = AbstractC2904a.h(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f26484b = AbstractC2904a.e(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f26485c = AbstractC2904a.f(new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f26486d = o.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f26487e = AbstractC2904a.g(new f());

    /* JADX INFO: renamed from: cc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0337a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f26488a = new Vb.b();
    }

    /* JADX INFO: renamed from: cc.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Callable {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q call() {
            return C0337a.f26488a;
        }
    }

    /* JADX INFO: renamed from: cc.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Callable {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q call() {
            return d.f26489a;
        }
    }

    /* JADX INFO: renamed from: cc.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f26489a = new Vb.f();
    }

    /* JADX INFO: renamed from: cc.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f26490a = new Vb.g();
    }

    /* JADX INFO: renamed from: cc.a$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f implements Callable {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q call() {
            return e.f26490a;
        }
    }

    /* JADX INFO: renamed from: cc.a$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f26491a = new n();
    }

    /* JADX INFO: renamed from: cc.a$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h implements Callable {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q call() {
            return g.f26491a;
        }
    }

    public static q a() {
        return AbstractC2904a.p(f26484b);
    }

    public static q b(Executor executor) {
        return new Vb.d(executor, false);
    }

    public static q c() {
        return AbstractC2904a.s(f26483a);
    }

    public static q d() {
        return f26486d;
    }
}
