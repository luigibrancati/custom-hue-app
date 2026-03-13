package f8;

import Q7.C1917l;
import U7.b;
import Z7.N;
import c8.C3080a;
import c8.C3081b;
import c8.InterfaceC3082c;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: f8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3999b implements P7.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b.EnumC0207b f34163e = b.EnumC0207b.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f34164f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f34165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3082c f34166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f34167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34168d;

    /* JADX INFO: renamed from: f8.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f34202b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C3999b(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!f34163e.b()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f34168d = i10;
        r.a(bArr.length);
        this.f34167c = new SecretKeySpec(bArr, "AES");
        this.f34166b = d(bArr);
        this.f34165a = bArr2;
    }

    public static P7.a c(C1917l c1917l) throws GeneralSecurityException {
        if (!f34163e.b()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (c1917l.b().e() == 16) {
            return new C3999b(c1917l.f().d(P7.f.a()), c1917l.b().c(), c1917l.c().d());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + c1917l.b().e());
    }

    private static InterfaceC3082c d(byte[] bArr) {
        return m.b(C3080a.d(C3081b.b(bArr.length), g8.b.a(bArr, P7.f.a())));
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f34165a;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i10 = this.f34168d;
        if (length > (length2 - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i10 + bArr.length + 16);
        byte[] bArrA = p.a(this.f34168d);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f34165a.length, this.f34168d);
        byte[] bArrE = e(0, bArrA, 0, bArrA.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrE2 = e(1, bArr2, 0, bArr2.length);
        Cipher cipher = (Cipher) f34164f.get();
        cipher.init(1, this.f34167c, new IvParameterSpec(bArrE));
        cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f34165a.length + this.f34168d);
        byte[] bArrE3 = e(2, bArrCopyOf, this.f34165a.length + this.f34168d, bArr.length);
        int length3 = this.f34165a.length + bArr.length + this.f34168d;
        for (int i11 = 0; i11 < 16; i11++) {
            bArrCopyOf[length3 + i11] = (byte) ((bArrE2[i11] ^ bArrE[i11]) ^ bArrE3[i11]);
        }
        return bArrCopyOf;
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f34165a;
        int length2 = ((length - bArr3.length) - this.f34168d) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!N.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrE = e(0, bArr, this.f34165a.length, this.f34168d);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrE2 = e(1, bArr2, 0, bArr2.length);
        byte[] bArrE3 = e(2, bArr, this.f34165a.length + this.f34168d, length2);
        int length3 = bArr.length - 16;
        byte b10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b10 = (byte) (b10 | (((bArr[length3 + i10] ^ bArrE2[i10]) ^ bArrE[i10]) ^ bArrE3[i10]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f34164f.get();
        cipher.init(1, this.f34167c, new IvParameterSpec(bArrE));
        return cipher.doFinal(bArr, this.f34165a.length + this.f34168d, length2);
    }

    public final byte[] e(int i10, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12 + 16];
        bArr2[15] = (byte) i10;
        System.arraycopy(bArr, i11, bArr2, 16, i12);
        return this.f34166b.a(bArr2, 16);
    }
}
