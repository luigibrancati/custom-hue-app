package ta;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ac.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Eb.s f44891b;

        public a(Eb.s sVar) {
            this.f44891b = sVar;
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            this.f44891b.d(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            this.f44891b.onSuccess(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends ac.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Eb.l f44892b;

        public b(Eb.l lVar) {
            this.f44892b = lVar;
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            this.f44892b.d(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            this.f44892b.c(obj);
            this.f44892b.a();
        }
    }

    public static ac.b a(Eb.l lVar) {
        return new b(lVar);
    }

    public static ac.b b(Eb.s sVar) {
        return new a(sVar);
    }
}
