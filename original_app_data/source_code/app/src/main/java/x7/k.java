package x7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f47495b;

    public k(q qVar) {
        this.f47495b = qVar;
    }

    @Override // x7.g
    public final void a() {
        synchronized (this.f47495b.f47506f) {
            try {
                if (this.f47495b.f47511k.get() > 0 && this.f47495b.f47511k.decrementAndGet() > 0) {
                    this.f47495b.f47502b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                q qVar = this.f47495b;
                if (qVar.f47513m != null) {
                    qVar.f47502b.c("Unbind from service.", new Object[0]);
                    q qVar2 = this.f47495b;
                    qVar2.f47501a.unbindService(qVar2.f47512l);
                    this.f47495b.f47507g = false;
                    this.f47495b.f47513m = null;
                    this.f47495b.f47512l = null;
                }
                this.f47495b.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
