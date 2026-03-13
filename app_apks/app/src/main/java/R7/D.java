package R7;

import U7.b;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.EnumC0207b f14845b = b.EnumC0207b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f14846a;

    public D(byte[] bArr) throws GeneralSecurityException {
        if (!f14845b.b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f14846a = AbstractC2089k.c(bArr);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i10 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = AbstractC2089k.a(bArr);
        Cipher cipherD = AbstractC2089k.d();
        cipherD.init(2, this.f14846a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            cipherD.updateAAD(bArr3);
        }
        return cipherD.doFinal(bArr2, i10, bArr2.length - i10);
    }

    public byte[] b(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = AbstractC2089k.a(bArr);
        Cipher cipherD = AbstractC2089k.d();
        cipherD.init(1, this.f14846a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            cipherD.updateAAD(bArr3);
        }
        int outputSize = cipherD.getOutputSize(bArr2.length);
        if (outputSize > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i10 + outputSize];
        if (cipherD.doFinal(bArr2, 0, bArr2.length, bArr4, i10) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
