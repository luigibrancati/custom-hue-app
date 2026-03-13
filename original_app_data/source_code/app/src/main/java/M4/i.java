package M4;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        a a(String str);

        a b(String str);

        void commit();
    }

    static /* synthetic */ void d(i iVar, e eVar, m mVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIdentity");
        }
        if ((i10 & 2) != 0) {
            mVar = m.Updated;
        }
        iVar.b(eVar, mVar);
    }

    a a();

    void b(e eVar, m mVar);

    e c();

    void e(h hVar);

    boolean isInitialized();
}
