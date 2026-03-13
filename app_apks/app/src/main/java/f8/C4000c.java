package f8;

import Q7.C1922q;
import R7.AbstractC2089k;
import U7.b;
import Z7.N;
import g8.C4160a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: f8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4000c implements P7.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b.EnumC0207b f34169c = b.EnumC0207b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f34170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f34171b;

    public C4000c(byte[] bArr, C4160a c4160a) throws GeneralSecurityException {
        if (!f34169c.b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f34170a = AbstractC2089k.c(bArr);
        this.f34171b = c4160a.d();
    }

    public static P7.a c(C1922q c1922q) throws GeneralSecurityException {
        if (c1922q.b().c() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + c1922q.b().c());
        }
        if (c1922q.b().e() == 16) {
            return new C4000c(c1922q.f().d(P7.f.a()), c1922q.c());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + c1922q.b().e());
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = p.a(12);
        AlgorithmParameterSpec algorithmParameterSpecA = AbstractC2089k.a(bArrA);
        Cipher cipherD = AbstractC2089k.d();
        cipherD.init(1, this.f34170a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        int outputSize = cipherD.getOutputSize(bArr.length);
        byte[] bArr3 = this.f34171b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f34171b.length, 12);
        if (cipherD.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f34171b.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f34171b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!N.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecB = AbstractC2089k.b(bArr, this.f34171b.length, 12);
        Cipher cipherD = AbstractC2089k.d();
        cipherD.init(2, this.f34170a, algorithmParameterSpecB);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        byte[] bArr4 = this.f34171b;
        return cipherD.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }
}
