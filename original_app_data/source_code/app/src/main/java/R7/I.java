package R7;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class I extends F {
    public I(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // R7.F
    public int[] b(int[] iArr, int i10) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        C.e(iArr2, C.b(this.f14847a, iArr));
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // R7.F
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    @Override // R7.F
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.d(byteBuffer, bArr, bArr2);
    }

    @Override // R7.F
    public int e() {
        return 24;
    }
}
