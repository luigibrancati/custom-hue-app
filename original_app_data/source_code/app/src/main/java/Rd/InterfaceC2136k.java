package Rd;

/* JADX INFO: renamed from: Rd.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2136k extends N0 {

    /* JADX INFO: renamed from: Rd.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2136k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final vc.l f15183a;

        public a(vc.l lVar) {
            this.f15183a = lVar;
        }

        @Override // Rd.InterfaceC2136k
        public void a(Throwable th) {
            this.f15183a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + Q.a(this.f15183a) + '@' + Q.b(this) + ']';
        }
    }

    void a(Throwable th);
}
