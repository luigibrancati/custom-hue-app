package Y7;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements P7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19819b = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P7.a f19820a;

    public c(String str) {
        this.f19820a = b.c(str);
    }

    public static void c() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return this.f19820a.a(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w(f19819b, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            c();
            return this.f19820a.a(bArr, bArr2);
        }
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws BadPaddingException {
        try {
            return this.f19820a.b(bArr, bArr2);
        } catch (BadPaddingException e10) {
            throw e10;
        } catch (GeneralSecurityException | ProviderException e11) {
            Log.w(f19819b, "encountered a potentially transient KeyStore error, will wait and retry", e11);
            c();
            return this.f19820a.b(bArr, bArr2);
        }
    }
}
