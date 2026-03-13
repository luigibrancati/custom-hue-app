package q;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: q.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5473c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5473c f42965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Executor f42966d = new Executor() { // from class: q.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C5473c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f42967e = new Executor() { // from class: q.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C5473c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f42968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f42969b;

    public C5473c() {
        C5474d c5474d = new C5474d();
        this.f42969b = c5474d;
        this.f42968a = c5474d;
    }

    public static Executor f() {
        return f42967e;
    }

    public static C5473c g() {
        if (f42965c != null) {
            return f42965c;
        }
        synchronized (C5473c.class) {
            try {
                if (f42965c == null) {
                    f42965c = new C5473c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f42965c;
    }

    @Override // q.e
    public void a(Runnable runnable) {
        this.f42968a.a(runnable);
    }

    @Override // q.e
    public boolean b() {
        return this.f42968a.b();
    }

    @Override // q.e
    public void c(Runnable runnable) {
        this.f42968a.c(runnable);
    }
}
