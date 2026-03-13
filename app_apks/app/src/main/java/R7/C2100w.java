package R7;

import U7.b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: R7.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2100w implements P7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b.EnumC0207b f14908d = b.EnumC0207b.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f14909e = f8.k.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f14910f = f8.k.a("070000004041424344454647");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f14911g = f8.k.a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f14912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f14914c;

    public C2100w(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f14908d.b()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f14912a = new SecretKeySpec(bArr, "ChaCha20");
        this.f14913b = bArr2;
        this.f14914c = provider;
    }

    public static P7.a c(Q7.A a10) throws GeneralSecurityException {
        return new C2100w(a10.f().d(P7.f.a()), a10.c().d(), e().getProvider());
    }

    public static Cipher d(Provider provider) {
        return Cipher.getInstance("ChaCha20-Poly1305", provider);
    }

    public static Cipher e() throws GeneralSecurityException {
        Cipher cipher = (Cipher) f8.i.f34202b.a("ChaCha20-Poly1305");
        if (g(cipher)) {
            return cipher;
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    public static boolean f() {
        try {
            e();
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static boolean g(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f14910f);
            byte[] bArr = f14909e;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f14911g;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = f8.p.a(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrA);
        Cipher cipherD = d(this.f14914c);
        cipherD.init(1, this.f14912a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        int outputSize = cipherD.getOutputSize(bArr.length);
        byte[] bArr3 = this.f14913b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f14913b.length, 12);
        if (cipherD.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f14913b.length + 12) == outputSize) {
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
        byte[] bArr3 = this.f14913b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Z7.N.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f14913b.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipherD = d(this.f14914c);
        cipherD.init(2, this.f14912a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        byte[] bArr5 = this.f14913b;
        return cipherD.doFinal(bArr, bArr5.length + 12, (bArr.length - bArr5.length) - 12);
    }
}
