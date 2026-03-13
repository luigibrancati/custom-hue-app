package f8;

import Q7.q0;
import R7.J;
import Z7.N;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f34228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f34229b;

    public s(byte[] bArr, byte[] bArr2) {
        this.f34228a = new J(bArr);
        this.f34229b = bArr2;
    }

    public static P7.a c(q0 q0Var) {
        return new s(q0Var.f().d(P7.f.a()), q0Var.c().d());
    }

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f34228a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    private byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrA = p.a(24);
        byteBufferAllocate.put(bArrA);
        this.f34228a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // P7.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrE = e(bArr, bArr2);
        byte[] bArr3 = this.f34229b;
        return bArr3.length == 0 ? bArrE : f.a(bArr3, bArrE);
    }

    @Override // P7.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f34229b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (N.e(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, this.f34229b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
