package Z7;

import g8.C4160a;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f20350a = Charset.forName("UTF-8");

    public static final byte a(char c10) throws GeneralSecurityException {
        if (c10 >= '!' && c10 <= '~') {
            return (byte) c10;
        }
        throw new GeneralSecurityException("Not a printable ASCII character: " + c10);
    }

    public static final C4160a b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = a(str.charAt(i10));
        }
        return C4160a.a(bArr);
    }

    public static Integer c() {
        if (d()) {
            return AbstractC2591a.a();
        }
        return null;
    }

    public static boolean d() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int f() {
        int i10 = 0;
        while (i10 == 0) {
            byte[] bArrD = I.d(4);
            i10 = (bArrD[3] & ForkServer.ERROR) | ((bArrD[0] & ForkServer.ERROR) << 24) | ((bArrD[1] & ForkServer.ERROR) << 16) | ((bArrD[2] & ForkServer.ERROR) << 8);
        }
        return i10;
    }

    public static final byte g(char c10) {
        if (c10 >= '!' && c10 <= '~') {
            return (byte) c10;
        }
        throw new M("Not a printable ASCII character: " + c10);
    }

    public static final C4160a h(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = g(str.charAt(i10));
        }
        return C4160a.a(bArr);
    }
}
