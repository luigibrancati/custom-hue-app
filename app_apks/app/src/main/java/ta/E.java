package ta;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class E implements Eb.p, Jb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f44836a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.l f44837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa.i f44838c;

    public E(Eb.l lVar, sa.i iVar) {
        this.f44837b = lVar;
        this.f44838c = iVar;
        lVar.k(this);
    }

    @Override // Eb.p
    public void a() {
        this.f44838c.release();
        this.f44837b.a();
    }

    @Override // Eb.p
    public void c(Object obj) {
        this.f44837b.c(obj);
    }

    @Override // Jb.c
    public synchronized void cancel() {
        this.f44836a.set(true);
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        this.f44838c.release();
        this.f44837b.d(th);
    }

    @Override // Eb.p
    public void b(Hb.c cVar) {
    }
}
