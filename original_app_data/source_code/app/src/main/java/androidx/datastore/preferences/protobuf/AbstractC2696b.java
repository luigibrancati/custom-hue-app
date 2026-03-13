package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2696b implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2707m f22766a = C2707m.b();

    public final K c(K k10) throws C2715v {
        if (k10 == null || k10.isInitialized()) {
            return k10;
        }
        throw d(k10).a().k(k10);
    }

    public final f0 d(K k10) {
        return k10 instanceof AbstractC2695a ? ((AbstractC2695a) k10).f() : new f0(k10);
    }

    @Override // androidx.datastore.preferences.protobuf.T
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public K a(AbstractC2700f abstractC2700f, C2707m c2707m) {
        return c(f(abstractC2700f, c2707m));
    }

    public K f(AbstractC2700f abstractC2700f, C2707m c2707m) throws C2715v {
        AbstractC2701g abstractC2701gT = abstractC2700f.t();
        K k10 = (K) b(abstractC2701gT, c2707m);
        try {
            abstractC2701gT.a(0);
            return k10;
        } catch (C2715v e10) {
            throw e10.k(k10);
        }
    }
}
