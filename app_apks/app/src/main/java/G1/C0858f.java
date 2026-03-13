package G1;

import android.os.Looper;

/* JADX INFO: renamed from: G1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0858f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f4287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4291f;

    /* JADX INFO: renamed from: G1.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(Object obj, Object obj2);
    }

    public C0858f(Object obj, Looper looper, Looper looper2, InterfaceC0860h interfaceC0860h, a aVar) {
        this.f4286a = interfaceC0860h.e(looper, null);
        this.f4287b = interfaceC0860h.e(looper2, null);
        this.f4289d = obj;
        this.f4290e = obj;
        this.f4288c = aVar;
    }

    public static /* synthetic */ void a(final C0858f c0858f, J7.f fVar) {
        final Object objApply = fVar.apply(c0858f.f4290e);
        c0858f.f4290e = objApply;
        c0858f.f(new Runnable() { // from class: G1.e
            @Override // java.lang.Runnable
            public final void run() {
                C0858f.c(this.f4284a, objApply);
            }
        });
    }

    public static /* synthetic */ void b(C0858f c0858f, Object obj) {
        if (c0858f.f4291f == 0) {
            c0858f.i(obj);
        }
    }

    public static /* synthetic */ void c(C0858f c0858f, Object obj) {
        int i10 = c0858f.f4291f - 1;
        c0858f.f4291f = i10;
        if (i10 == 0) {
            c0858f.i(obj);
        }
    }

    public Object d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f4287b.g()) {
            return this.f4289d;
        }
        AbstractC0853a.g(looperMyLooper == this.f4286a.g());
        return this.f4290e;
    }

    public void e(Runnable runnable) {
        if (this.f4286a.g().getThread().isAlive()) {
            this.f4286a.i(runnable);
        }
    }

    public final void f(Runnable runnable) {
        if (this.f4287b.g().getThread().isAlive()) {
            this.f4287b.i(runnable);
        }
    }

    public void g(final Object obj) {
        this.f4290e = obj;
        f(new Runnable() { // from class: G1.c
            @Override // java.lang.Runnable
            public final void run() {
                C0858f.b(this.f4280a, obj);
            }
        });
    }

    public void h(J7.f fVar, final J7.f fVar2) {
        AbstractC0853a.g(Looper.myLooper() == this.f4287b.g());
        this.f4291f++;
        e(new Runnable() { // from class: G1.d
            @Override // java.lang.Runnable
            public final void run() {
                C0858f.a(this.f4282a, fVar2);
            }
        });
        i(fVar.apply(this.f4289d));
    }

    public final void i(Object obj) {
        Object obj2 = this.f4289d;
        this.f4289d = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f4288c.a(obj2, obj);
    }
}
