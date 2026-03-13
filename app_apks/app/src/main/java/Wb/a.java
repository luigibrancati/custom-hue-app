package Wb;

import Eb.g;
import Ze.b;
import Ze.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class a extends AtomicInteger implements g, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f17877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Yb.b f17878b = new Yb.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f17879c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f17880d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f17881e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f17882f;

    public a(b bVar) {
        this.f17877a = bVar;
    }

    @Override // Ze.b
    public void a() {
        this.f17882f = true;
        Yb.g.b(this.f17877a, this, this.f17878b);
    }

    @Override // Ze.b
    public void c(Object obj) {
        Yb.g.f(this.f17877a, obj, this, this.f17878b);
    }

    @Override // Ze.c
    public void cancel() {
        if (this.f17882f) {
            return;
        }
        Xb.g.a(this.f17880d);
    }

    @Override // Ze.b
    public void d(c cVar) {
        if (this.f17881e.compareAndSet(false, true)) {
            this.f17877a.d(this);
            Xb.g.j(this.f17880d, this.f17879c, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // Ze.b
    public void onError(Throwable th) {
        this.f17882f = true;
        Yb.g.d(this.f17877a, th, this, this.f17878b);
    }

    @Override // Ze.c
    public void p(long j10) {
        if (j10 > 0) {
            Xb.g.b(this.f17880d, this.f17879c, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }
}
