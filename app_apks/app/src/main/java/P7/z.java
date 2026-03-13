package P7;

import e8.C3952C;
import e8.C3953D;
import e8.I;
import e8.y;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f13167a = Charset.forName("UTF-8");

    public static C3953D.c a(C3952C.c cVar) {
        return (C3953D.c) C3953D.c.T().w(cVar.T().U()).v(cVar.W()).u(cVar.V()).t(cVar.U()).i();
    }

    public static C3953D b(C3952C c3952c) {
        C3953D.b bVarU = C3953D.T().u(c3952c.W());
        Iterator it = c3952c.V().iterator();
        while (it.hasNext()) {
            bVarU.t(a((C3952C.c) it.next()));
        }
        return (C3953D) bVarU.i();
    }

    public static void c(C3952C.c cVar) throws GeneralSecurityException {
        if (!cVar.X()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.U())));
        }
        if (cVar.V() == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.U())));
        }
        if (cVar.W() == e8.z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.U())));
        }
    }

    public static void d(C3952C c3952c) {
        int iW = c3952c.W();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C3952C.c cVar : c3952c.V()) {
            if (cVar.W() == e8.z.ENABLED) {
                c(cVar);
                if (cVar.U() == iW) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (cVar.T().T() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
