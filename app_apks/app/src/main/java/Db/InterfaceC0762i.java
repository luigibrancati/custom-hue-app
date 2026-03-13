package Db;

/* JADX INFO: renamed from: Db.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0762i {

    /* JADX INFO: renamed from: Db.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC0763j {
        public a I(String str) {
            return H(W.valueOf(str));
        }

        @Override // Db.AbstractC0763j
        public /* bridge */ /* synthetic */ InterfaceC0762i u() {
            return super.u();
        }
    }

    static a builder() {
        return new a();
    }
}
