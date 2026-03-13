package R7;

import Q7.C1926v;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: R7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2095q implements P7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f14894d = f8.k.a("7a806c");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f14895e = f8.k.a("46bb91c3c5");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f14896f = f8.k.a("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f14897g = f8.k.a("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f14898h = f8.k.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretKey f14900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f14901c;

    /* JADX INFO: renamed from: R7.q$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        Object get();
    }

    public C2095q(byte[] bArr, byte[] bArr2, a aVar) throws InvalidAlgorithmParameterException {
        this.f14901c = bArr2;
        f8.r.a(bArr.length);
        this.f14900b = new SecretKeySpec(bArr, "AES");
        this.f14899a = aVar;
    }

    public static P7.a c(C1926v c1926v, a aVar) {
        if (f((Cipher) aVar.get())) {
            return new C2095q(c1926v.f().d(P7.f.a()), c1926v.c().d(), aVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    public static AlgorithmParameterSpec d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec e(byte[] bArr, int i10, int i11) {
        return new GCMParameterSpec(128, bArr, i10, i11);
    }

    public static boolean f(Cipher cipher) {
        try {
            cipher.init(2, new SecretKeySpec(f14896f, "AES"), d(f14897g));
            cipher.updateAAD(f14895e);
            byte[] bArr = f14898h;
            return f8.f.b(cipher.doFinal(bArr, 0, bArr.length), f14894d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) this.f14899a.get();
        int length = bArr.length;
        byte[] bArr3 = this.f14901c;
        if (length > 2147483619 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] bArrA = f8.p.a(12);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f14901c.length, 12);
        cipher.init(1, this.f14900b, d(bArrA));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int iDoFinal = cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f14901c.length + 12);
        if (iDoFinal == bArr.length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(String.format("encryption failed; AES-GCM-SIV tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f14901c;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Z7.N.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) this.f14899a.get();
        cipher.init(2, this.f14900b, e(bArr, this.f14901c.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr4 = this.f14901c;
        return cipher.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }
}
