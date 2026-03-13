package P7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    public static m a(p pVar, a aVar, byte[] bArr) {
        return m.D(pVar, aVar, bArr);
    }

    public static m b(p pVar, x xVar) {
        if (xVar != null) {
            return c.a(pVar);
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void c(m mVar, q qVar, a aVar, byte[] bArr) {
        mVar.K(qVar, aVar, bArr);
    }

    public static void d(m mVar, q qVar, x xVar) {
        if (xVar == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        c.b(mVar, qVar);
    }
}
