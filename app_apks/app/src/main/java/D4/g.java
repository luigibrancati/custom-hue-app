package D4;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface g {
    static /* synthetic */ f b(g gVar, a aVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStorage");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return gVar.a(aVar, str);
    }

    f a(a aVar, String str);
}
