package Wd;

/* JADX INFO: renamed from: Wd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2322b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f17918a = new E("CLOSED");

    public static final AbstractC2323c b(AbstractC2323c abstractC2323c) {
        while (true) {
            Object objG = abstractC2323c.g();
            if (objG == f17918a) {
                return abstractC2323c;
            }
            AbstractC2323c abstractC2323c2 = (AbstractC2323c) objG;
            if (abstractC2323c2 != null) {
                abstractC2323c = abstractC2323c2;
            } else if (abstractC2323c.m()) {
                return abstractC2323c;
            }
        }
    }

    public static final Object c(B b10, long j10, vc.p pVar) {
        while (true) {
            if (b10.f17897c >= j10 && !b10.k()) {
                return C.a(b10);
            }
            Object objG = b10.g();
            if (objG == f17918a) {
                return C.a(f17918a);
            }
            B b11 = (B) ((AbstractC2323c) objG);
            if (b11 == null) {
                b11 = (B) pVar.invoke(Long.valueOf(b10.f17897c + 1), b10);
                if (b10.o(b11)) {
                    if (b10.k()) {
                        b10.n();
                    }
                }
            }
            b10 = b11;
        }
    }
}
