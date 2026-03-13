package Lb;

import bc.AbstractC2904a;
import java.util.Comparator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Jb.e f8700a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f8701b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Jb.a f8702c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Jb.d f8703d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Jb.d f8704e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Jb.d f8705f = new n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Jb.f f8706g = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Jb.g f8707h = new o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Jb.g f8708i = new h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Callable f8709j = new m();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Comparator f8710k = new l();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Jb.d f8711l = new k();

    /* JADX INFO: renamed from: Lb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0131a implements Jb.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Jb.a f8712a;

        public C0131a(Jb.a aVar) {
            this.f8712a = aVar;
        }

        @Override // Jb.d
        public void accept(Object obj) {
            this.f8712a.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Jb.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f8713a;

        public b(Class cls) {
            this.f8713a = cls;
        }

        @Override // Jb.e
        public Object apply(Object obj) {
            return this.f8713a.cast(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements Jb.f {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g implements Jb.d {
        @Override // Jb.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            AbstractC2904a.q(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h implements Jb.g {
        @Override // Jb.g
        public boolean test(Object obj) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j implements Callable, Jb.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f8714a;

        public j(Object obj) {
            this.f8714a = obj;
        }

        @Override // Jb.e
        public Object apply(Object obj) {
            return this.f8714a;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return this.f8714a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k implements Jb.d {
        @Override // Jb.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Ze.c cVar) {
            cVar.p(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class l implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class m implements Callable {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class n implements Jb.d {
        @Override // Jb.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            AbstractC2904a.q(new Ib.d(th));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class o implements Jb.g {
        @Override // Jb.g
        public boolean test(Object obj) {
            return true;
        }
    }

    public static Jb.d a(Jb.a aVar) {
        return new C0131a(aVar);
    }

    public static Jb.g b() {
        return f8707h;
    }

    public static Jb.e c(Class cls) {
        return new b(cls);
    }

    public static Jb.d d() {
        return f8703d;
    }

    public static Jb.e e() {
        return f8700a;
    }

    public static Callable f(Object obj) {
        return new j(obj);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Jb.a {
        public String toString() {
            return "EmptyAction";
        }

        @Override // Jb.a
        public void run() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f implements Runnable {
        public String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements Jb.d {
        public String toString() {
            return "EmptyConsumer";
        }

        @Override // Jb.d
        public void accept(Object obj) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i implements Jb.e {
        public String toString() {
            return "IdentityFunction";
        }

        @Override // Jb.e
        public Object apply(Object obj) {
            return obj;
        }
    }
}
