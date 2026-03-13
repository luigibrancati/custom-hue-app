package f8;

import Q7.A;
import R7.G;
import Z7.N;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f34196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f34197b;

    public g(byte[] bArr, byte[] bArr2) {
        this.f34196a = new G(bArr);
        this.f34197b = bArr2;
    }

    public static P7.a c(A a10) {
        return new g(a10.f().d(P7.f.a()), a10.c().d());
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrE = e(bArr, bArr2);
        byte[] bArr3 = this.f34197b;
        return bArr3.length == 0 ? bArrE : f.a(bArr3, bArrE);
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f34197b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (N.e(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, this.f34197b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f34196a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrA = p.a(12);
        byteBufferAllocate.put(bArrA);
        this.f34196a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }
}
