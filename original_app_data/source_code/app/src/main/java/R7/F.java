package R7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f14847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14848b;

    public F(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f14847a = C.h(bArr);
        this.f14848b = i10;
    }

    public ByteBuffer a(byte[] bArr, int i10) {
        int[] iArrB = b(C.h(bArr), i10);
        int[] iArr = (int[]) iArrB.clone();
        C.f(iArr);
        for (int i11 = 0; i11 < iArrB.length; i11++) {
            iArrB[i11] = iArrB[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] b(int[] iArr, int i10);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public abstract int e();

    public final void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferA = a(bArr, this.f14848b + i12);
            if (i12 == i10) {
                f8.f.c(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                f8.f.c(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }
}
