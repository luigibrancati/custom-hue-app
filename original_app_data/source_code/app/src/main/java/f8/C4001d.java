package f8;

import U7.b;
import Z7.N;
import c8.C3080a;
import c8.C3081b;
import c8.InterfaceC3082c;
import g8.C4160a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: f8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4001d implements P7.e, X7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b.EnumC0207b f34172d = b.EnumC0207b.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f34173e = new byte[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f34174f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f34175g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3082c f34176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f34177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f34178c;

    /* JADX INFO: renamed from: f8.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ThreadLocal {
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

    public C4001d(byte[] bArr, C4160a c4160a) throws GeneralSecurityException {
        if (!f34172d.b()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (bArr.length == 32 || bArr.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f34177b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f34176a = d(bArrCopyOfRange);
            this.f34178c = c4160a.d();
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 32 or 64 bytes");
    }

    public static X7.a c(V7.a aVar) {
        return new C4001d(i(aVar.f().d(P7.f.a())), aVar.c());
    }

    public static InterfaceC3082c d(byte[] bArr) {
        return m.b(C3080a.d(C3081b.b(bArr.length), g8.b.a(bArr, P7.f.a())));
    }

    public static byte[] i(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 64) {
            return bArr;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    @Override // P7.e
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return f(bArr, bArr2);
    }

    @Override // P7.e
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return e(bArr, bArr2);
    }

    public final byte[] e(byte[] bArr, byte[]... bArr2) throws GeneralSecurityException {
        h(bArr2.length);
        int length = bArr.length;
        byte[] bArr3 = this.f34178c;
        if (length < bArr3.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!N.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f34175g.get();
        byte[] bArr4 = this.f34178c;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) bArrCopyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & 127);
        bArr5[12] = (byte) (bArr5[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f34177b, "AES"), new IvParameterSpec(bArr5));
        int length2 = this.f34178c.length + 16;
        int length3 = bArr.length - length2;
        byte[] bArrDoFinal = cipher.doFinal(bArr, length2, length3);
        if (length3 == 0 && bArrDoFinal == null && q.a()) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr2, bArr2.length + 1);
        bArr6[bArr2.length] = bArrDoFinal;
        if (f.b(bArrCopyOfRange, g(bArr6))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] f(byte[] bArr, byte[]... bArr2) throws GeneralSecurityException {
        h(bArr2.length);
        if (bArr.length > 2147483631 - this.f34178c.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) f34175g.get();
        byte[][] bArr3 = (byte[][]) Arrays.copyOf(bArr2, bArr2.length + 1);
        bArr3[bArr2.length] = bArr;
        byte[] bArrG = g(bArr3);
        byte[] bArr4 = (byte[]) bArrG.clone();
        bArr4[8] = (byte) (bArr4[8] & 127);
        bArr4[12] = (byte) (bArr4[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f34177b, "AES"), new IvParameterSpec(bArr4));
        byte[] bArr5 = this.f34178c;
        byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + bArrG.length + bArr.length);
        System.arraycopy(bArrG, 0, bArrCopyOf, this.f34178c.length, bArrG.length);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f34178c.length + bArrG.length) == bArr.length) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public final byte[] g(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.f34176a.a(f34174f, 16);
        }
        byte[] bArrA = this.f34176a.a(f34173e, 16);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = f.e(b8.f.b(bArrA), this.f34176a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f34176a.a(bArr3.length >= 16 ? f.f(bArr3, bArrA) : f.e(b8.f.a(bArr3), b8.f.b(bArrA)), 16);
    }

    public final void h(int i10) throws GeneralSecurityException {
        if (i10 <= 126) {
            return;
        }
        throw new GeneralSecurityException("Too many associated datas: " + i10 + " > 126");
    }
}
