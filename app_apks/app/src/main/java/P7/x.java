package P7;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f13166a = new x();

    public static x a() {
        return f13166a;
    }

    public static x b(x xVar) throws GeneralSecurityException {
        if (xVar != null) {
            return xVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
