package P7;

import Z7.C2602l;
import Z7.H;
import com.google.crypto.tink.shaded.protobuf.C3669p;
import e8.C3950A;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static v a(byte[] bArr) throws GeneralSecurityException {
        try {
            return Z7.x.c().i(H.b(C3950A.Y(bArr, C3669p.b())));
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] b(v vVar) {
        return vVar instanceof C2602l ? ((C2602l) vVar).b().d().g() : ((H) Z7.x.c().o(vVar, H.class)).d().g();
    }
}
