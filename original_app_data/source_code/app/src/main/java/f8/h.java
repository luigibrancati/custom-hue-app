package f8;

import P7.u;
import Q7.C1911f;
import Z7.N;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f34198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f34199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f34201d;

    public h(l lVar, u uVar, int i10, byte[] bArr) {
        this.f34198a = lVar;
        this.f34199b = uVar;
        this.f34200c = i10;
        this.f34201d = bArr;
    }

    public static P7.a c(C1911f c1911f) {
        return new h(new C3998a(c1911f.f().d(P7.f.a()), c1911f.b().f()), new o(new n("HMAC" + c1911f.b().d(), new SecretKeySpec(c1911f.g().d(P7.f.a()), "HMAC")), c1911f.b().g()), c1911f.b().g(), c1911f.c().d());
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f34198a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(this.f34201d, bArrA, this.f34199b.b(f.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f34200c;
        byte[] bArr3 = this.f34201d;
        if (length < i10 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!N.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f34201d.length, bArr.length - this.f34200c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f34200c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f34199b.a(bArrCopyOfRange2, f.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f34198a.b(bArrCopyOfRange);
    }
}
