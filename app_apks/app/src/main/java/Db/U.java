package Db;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface U {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends V {
        public a O(String str) {
            return N(W.valueOf(str));
        }

        @Override // Db.V
        public /* bridge */ /* synthetic */ U y() {
            return super.y();
        }
    }

    static a builder() {
        return new a();
    }

    String a();
}
