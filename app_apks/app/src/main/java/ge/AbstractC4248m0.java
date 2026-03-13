package ge;

/* JADX INFO: renamed from: ge.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4248m0 {
    public static /* synthetic */ void c(AbstractC4248m0 abstractC4248m0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC4248m0.d() + 1;
        }
        abstractC4248m0.b(i10);
    }

    public abstract Object a();

    public abstract void b(int i10);

    public abstract int d();
}
