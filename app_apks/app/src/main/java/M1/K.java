package M1;

import E1.e;
import G1.M;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class K extends E1.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f9073i = Float.floatToIntBits(Float.NaN);

    public static void m(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f9073i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // E1.e
    public void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f3199b.f3196c;
        if (i11 == 21) {
            byteBufferL = l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 24), byteBufferL);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferL = l(i10);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition) & ForkServer.ERROR) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition + 3) & ForkServer.ERROR) << 24), byteBufferL);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferL = l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition) & ForkServer.ERROR) << 24), byteBufferL);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferL = l(i10);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition + 3) & ForkServer.ERROR) | ((byteBuffer.get(iPosition + 2) & ForkServer.ERROR) << 8) | ((byteBuffer.get(iPosition + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(iPosition) & ForkServer.ERROR) << 24), byteBufferL);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    @Override // E1.g
    public e.a h(e.a aVar) throws e.b {
        int i10 = aVar.f3196c;
        if (M.C0(i10)) {
            return i10 != 4 ? new e.a(aVar.f3194a, aVar.f3195b, 4) : e.a.f3193e;
        }
        throw new e.b(aVar);
    }
}
