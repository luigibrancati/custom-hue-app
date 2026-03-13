package P1;

import G1.M;
import I1.j;
import P1.C1837h;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static byte[] a(I1.f fVar, String str, byte[] bArr, Map map) throws I {
        I1.w wVar = new I1.w(fVar);
        I1.j jVarA = new j.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        I1.j jVarA2 = jVarA;
        while (true) {
            try {
                I1.h hVar = new I1.h(wVar, jVarA2);
                try {
                    try {
                        byte[] bArrB = L7.a.b(hVar);
                        M.m(hVar);
                        return bArrB;
                    } catch (I1.s e10) {
                        String strC = c(e10, i10);
                        if (strC == null) {
                            throw e10;
                        }
                        i10++;
                        jVarA2 = jVarA2.a().j(strC).a();
                        M.m(hVar);
                    }
                } catch (Throwable th) {
                    M.m(hVar);
                    throw th;
                }
            } catch (Exception e11) {
                throw new I(jVarA, wVar.t(), wVar.g(), wVar.l(), e11);
            }
        }
    }

    public static int b(Throwable th, int i10) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            return M.a0(M.b0(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (a.a(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || d(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof J) {
            return 6001;
        }
        if (th instanceof C1837h.e) {
            return 6003;
        }
        if (th instanceof G) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    public static String c(I1.s sVar, int i10) {
        Map map;
        List list;
        int i11 = sVar.f5505d;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = sVar.f5507f) == null || (list = (List) map.get(HttpHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public static boolean d(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
