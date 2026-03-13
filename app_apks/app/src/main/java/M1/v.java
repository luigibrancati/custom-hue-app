package M1;

import E1.e;
import G1.AbstractC0853a;
import G1.M;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v extends E1.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f9212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f9213j;

    @Override // E1.e
    public void f(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC0853a.e(this.f9213j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f3199b.f3197d) * this.f3200c.f3197d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int iQ = (M.Q(this.f3199b.f3196c) * i10) + iPosition;
                int i11 = this.f3199b.f3196c;
                if (i11 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iQ));
                } else if (i11 == 3) {
                    byteBufferL.put(byteBuffer.get(iQ));
                } else if (i11 == 4) {
                    byteBufferL.putFloat(byteBuffer.getFloat(iQ));
                } else if (i11 == 21) {
                    M.X0(byteBufferL, M.d0(byteBuffer, iQ));
                } else {
                    if (i11 != 22) {
                        if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 != 1610612736) {
                                    throw new IllegalStateException("Unexpected encoding: " + this.f3199b.f3196c);
                                }
                            }
                            M.X0(byteBufferL, M.d0(byteBuffer, iQ));
                        }
                        byteBufferL.putShort(byteBuffer.getShort(iQ));
                    }
                    byteBufferL.putInt(byteBuffer.getInt(iQ));
                }
            }
            iPosition += this.f3199b.f3197d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // E1.g
    public e.a h(e.a aVar) throws e.b {
        int[] iArr = this.f9212i;
        if (iArr == null) {
            return e.a.f3193e;
        }
        if (!M.D0(aVar.f3196c)) {
            throw new e.b(aVar);
        }
        boolean z10 = aVar.f3195b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f3195b) {
                throw new e.b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new e.a(aVar.f3194a, iArr.length, aVar.f3196c) : e.a.f3193e;
    }

    @Override // E1.g
    public void i() {
        this.f9213j = this.f9212i;
    }

    @Override // E1.g
    public void k() {
        this.f9213j = null;
        this.f9212i = null;
    }

    public void m(int[] iArr) {
        this.f9212i = iArr;
    }
}
