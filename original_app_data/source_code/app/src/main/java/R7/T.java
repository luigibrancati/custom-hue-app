package R7;

import Q7.q0;
import U7.b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T implements P7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b.EnumC0207b f14864d = b.EnumC0207b.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f14865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f14867c;

    public T(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f14864d.b()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f14865a = bArr;
        this.f14866b = bArr2;
        this.f14867c = provider;
    }

    public static P7.a c(q0 q0Var) throws GeneralSecurityException {
        return new T(q0Var.f().d(P7.f.a()), q0Var.c().d(), C2100w.e().getProvider());
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    public static boolean e() {
        return C2100w.f();
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = f8.p.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(C.a(this.f14865a, bArrA), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArrA));
        Cipher cipherD = C2100w.d(this.f14867c);
        cipherD.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        int outputSize = cipherD.getOutputSize(bArr.length);
        byte[] bArr3 = this.f14866b;
        if (outputSize > 2147483623 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 24 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f14866b.length, 24);
        if (cipherD.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f14866b.length + 24) == outputSize) {
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
        byte[] bArr3 = this.f14866b;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Z7.N.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.f14866b.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(C.a(this.f14865a, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArr4));
        Cipher cipherD = C2100w.d(this.f14867c);
        cipherD.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        byte[] bArr5 = this.f14866b;
        return cipherD.doFinal(bArr, bArr5.length + 24, (bArr.length - bArr5.length) - 24);
    }
}
