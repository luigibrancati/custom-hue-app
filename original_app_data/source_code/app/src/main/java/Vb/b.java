package Vb;

import Eb.q;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0223b f17372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f17373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17374f = g(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f17375g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f17376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f17377c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Kb.e f17378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Hb.b f17379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Kb.e f17380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f17381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f17382e;

        public a(c cVar) {
            this.f17381d = cVar;
            Kb.e eVar = new Kb.e();
            this.f17378a = eVar;
            Hb.b bVar = new Hb.b();
            this.f17379b = bVar;
            Kb.e eVar2 = new Kb.e();
            this.f17380c = eVar2;
            eVar2.a(eVar);
            eVar2.a(bVar);
        }

        @Override // Eb.q.c
        public Hb.c b(Runnable runnable) {
            return this.f17382e ? Kb.d.INSTANCE : this.f17381d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f17378a);
        }

        @Override // Eb.q.c
        public Hb.c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f17382e ? Kb.d.INSTANCE : this.f17381d.e(runnable, j10, timeUnit, this.f17379b);
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f17382e) {
                return;
            }
            this.f17382e = true;
            this.f17380c.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f17382e;
        }
    }

    /* JADX INFO: renamed from: Vb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0223b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f17384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f17385c;

        public C0223b(int i10, ThreadFactory threadFactory) {
            this.f17383a = i10;
            this.f17384b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f17384b[i11] = new c(threadFactory);
            }
        }

        public c a() {
            int i10 = this.f17383a;
            if (i10 == 0) {
                return b.f17375g;
            }
            c[] cVarArr = this.f17384b;
            long j10 = this.f17385c;
            this.f17385c = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }

        public void b() {
            for (c cVar : this.f17384b) {
                cVar.dispose();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends h {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new i("RxComputationShutdown"));
        f17375g = cVar;
        cVar.dispose();
        i iVar = new i("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f17373e = iVar;
        C0223b c0223b = new C0223b(0, iVar);
        f17372d = c0223b;
        c0223b.b();
    }

    public b() {
        this(f17373e);
    }

    public static int g(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // Eb.q
    public q.c a() {
        return new a(((C0223b) this.f17377c.get()).a());
    }

    @Override // Eb.q
    public Hb.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        return ((C0223b) this.f17377c.get()).a().f(runnable, j10, timeUnit);
    }

    @Override // Eb.q
    public Hb.c e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return ((C0223b) this.f17377c.get()).a().g(runnable, j10, j11, timeUnit);
    }

    @Override // Eb.q
    public void f() {
        C0223b c0223b;
        C0223b c0223b2;
        do {
            c0223b = (C0223b) this.f17377c.get();
            c0223b2 = f17372d;
            if (c0223b == c0223b2) {
                return;
            }
        } while (!T1.e.a(this.f17377c, c0223b, c0223b2));
        c0223b.b();
    }

    public void h() {
        C0223b c0223b = new C0223b(f17374f, this.f17376b);
        if (T1.e.a(this.f17377c, f17372d, c0223b)) {
            return;
        }
        c0223b.b();
    }

    public b(ThreadFactory threadFactory) {
        this.f17376b = threadFactory;
        this.f17377c = new AtomicReference(f17372d);
        h();
    }
}
