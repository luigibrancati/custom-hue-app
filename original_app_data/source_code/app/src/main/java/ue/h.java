package ue;

import fc.C4022e;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import te.AbstractC5884a;
import ue.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f45606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te.d f45607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f45610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f45611f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5884a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r.b f45612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ h f45613f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, r.b bVar, h hVar) {
            super(str, false, 2, null);
            this.f45612e = bVar;
            this.f45613f = hVar;
        }

        @Override // te.AbstractC5884a
        public long f() throws InterruptedException {
            r.a aVar;
            try {
                aVar = this.f45612e.g();
            } catch (Throwable th) {
                aVar = new r.a(this.f45612e, null, th, 2, null);
            }
            if (!this.f45613f.f45610e.contains(this.f45612e)) {
                return -1L;
            }
            this.f45613f.f45611f.put(aVar);
            return -1L;
        }
    }

    public h(r routePlanner, te.d taskRunner) {
        AbstractC4862t.e(routePlanner, "routePlanner");
        AbstractC4862t.e(taskRunner, "taskRunner");
        this.f45606a = routePlanner;
        this.f45607b = taskRunner;
        this.f45608c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f45609d = Long.MIN_VALUE;
        this.f45610e = new CopyOnWriteArrayList();
        this.f45611f = taskRunner.f().c(new LinkedBlockingDeque());
    }

    @Override // ue.f
    public l a() throws IOException {
        r.a aVarG;
        long j10;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f45610e.isEmpty() && !r.f(b(), null, 1, null)) {
                    f();
                    AbstractC4862t.b(iOException);
                    throw iOException;
                }
                if (b().c()) {
                    throw new IOException("Canceled");
                }
                long jB = this.f45607b.f().b();
                long j11 = this.f45609d - jB;
                if (this.f45610e.isEmpty() || j11 <= 0) {
                    aVarG = g();
                    j10 = this.f45608c;
                    this.f45609d = jB + j10;
                } else {
                    j10 = j11;
                    aVarG = null;
                }
                if (aVarG != null || (aVarG = e(j10, TimeUnit.NANOSECONDS)) != null) {
                    if (aVarG.f()) {
                        f();
                        if (!aVarG.d().isReady()) {
                            aVarG = aVarG.d().d();
                        }
                        if (aVarG.f()) {
                            return aVarG.d().a();
                        }
                    }
                    Throwable thE = aVarG.e();
                    if (thE != null) {
                        if (!(thE instanceof IOException)) {
                            throw thE;
                        }
                        if (iOException == null) {
                            iOException = (IOException) thE;
                        } else {
                            C4022e.a(iOException, thE);
                        }
                    }
                    r.b bVarC = aVarG.c();
                    if (bVarC != null) {
                        b().b().addFirst(bVarC);
                    }
                }
            } finally {
                f();
            }
        }
    }

    @Override // ue.f
    public r b() {
        return this.f45606a;
    }

    public final r.a e(long j10, TimeUnit timeUnit) {
        r.a aVar;
        if (this.f45610e.isEmpty() || (aVar = (r.a) this.f45611f.poll(j10, timeUnit)) == null) {
            return null;
        }
        this.f45610e.remove(aVar.d());
        return aVar;
    }

    public final void f() {
        for (r.b bVar : this.f45610e) {
            bVar.cancel();
            r.b bVarF = bVar.f();
            if (bVarF != null) {
                b().b().addLast(bVarF);
            }
        }
        this.f45610e.clear();
    }

    public final r.a g() {
        r.b gVar;
        if (r.f(b(), null, 1, null)) {
            try {
                gVar = b().d();
            } catch (Throwable th) {
                gVar = new g(th);
            }
            if (gVar.isReady()) {
                return new r.a(gVar, null, null, 6, null);
            }
            if (gVar instanceof g) {
                return ((g) gVar).c();
            }
            this.f45610e.add(gVar);
            te.c.m(this.f45607b.k(), new a(qe.p.f43483f + " connect " + b().getAddress().l().o(), gVar, this), 0L, 2, null);
        }
        return null;
    }
}
