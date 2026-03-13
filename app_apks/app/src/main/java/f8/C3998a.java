package f8;

import U7.b;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: f8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3998a implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b.EnumC0207b f34158d = b.EnumC0207b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f34159e = new C0440a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f34160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34162c;

    /* JADX INFO: renamed from: f8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0440a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f34202b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C3998a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!f34158d.b()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f34160a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f34159e.get()).getBlockSize();
        this.f34162c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f34161b = i10;
    }

    @Override // f8.l
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f34161b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f34161b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrA = p.a(i10);
        System.arraycopy(bArrA, 0, bArr2, 0, this.f34161b);
        c(bArr, 0, bArr.length, bArr2, this.f34161b, bArrA, true);
        return bArr2;
    }

    @Override // f8.l
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f34161b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f34161b;
        byte[] bArr3 = new byte[length2 - i11];
        c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f34159e.get();
        byte[] bArr4 = new byte[this.f34162c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f34161b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f34160a, ivParameterSpec);
        } else {
            cipher.init(2, this.f34160a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
