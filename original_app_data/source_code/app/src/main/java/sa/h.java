package sa;

import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f44433a = new PriorityBlockingQueue();

    public void a(g gVar) {
        this.f44433a.add(gVar);
    }

    public boolean b() {
        return this.f44433a.isEmpty();
    }

    public boolean c(g gVar) {
        for (g gVar2 : this.f44433a) {
            if (gVar2 == gVar) {
                return this.f44433a.remove(gVar2);
            }
        }
        return false;
    }

    public g d() {
        return (g) this.f44433a.take();
    }

    public g e() {
        return (g) this.f44433a.poll();
    }
}
