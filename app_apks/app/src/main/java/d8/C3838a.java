package d8;

import P7.f;
import U7.b;
import c8.C3080a;
import c8.InterfaceC3082c;
import f8.i;
import f8.r;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: d8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3838a implements InterfaceC3082c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b.EnumC0207b f33158d = b.EnumC0207b.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f33159e = new C0400a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f33160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f33161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f33162c;

    /* JADX INFO: renamed from: d8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0400a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f34202b.a("AES/ECB/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C3838a(byte[] bArr) throws GeneralSecurityException {
        r.a(bArr.length);
        this.f33160a = new SecretKeySpec(bArr, "AES");
        d();
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return ((i10 - 1) / 16) + 1;
    }

    public static InterfaceC3082c c(C3080a c3080a) {
        return new C3838a(c3080a.e().d(f.a()));
    }

    public static Cipher e() throws GeneralSecurityException {
        if (f33158d.b()) {
            return (Cipher) f33159e.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public static void f(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // c8.InterfaceC3082c
    public byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherE = e();
        cipherE.init(1, this.f33160a);
        int iB = b(bArr.length);
        byte[] bArrD = iB * 16 == bArr.length ? f8.f.d(bArr, (iB - 1) * 16, this.f33161b, 0, 16) : f8.f.e(b8.f.a(Arrays.copyOfRange(bArr, (iB - 1) * 16, bArr.length)), this.f33162c);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i11 = 0; i11 < iB - 1; i11++) {
            f(bArr2, bArr, i11 * 16, bArr3);
            if (cipherE.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        f(bArr2, bArrD, 0, bArr3);
        if (cipherE.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i10 ? bArr2 : Arrays.copyOf(bArr2, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }

    public final void d() throws GeneralSecurityException {
        Cipher cipherE = e();
        cipherE.init(1, this.f33160a);
        byte[] bArrB = b8.f.b(cipherE.doFinal(new byte[16]));
        this.f33161b = bArrB;
        this.f33162c = b8.f.b(bArrB);
    }
}
