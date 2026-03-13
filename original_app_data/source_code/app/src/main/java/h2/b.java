package h2;

import D1.o;
import G1.C;
import G1.M;
import J1.f;
import K1.AbstractC1001i;
import K1.f1;
import java.nio.ByteBuffer;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1001i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f36177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C f36178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC4269a f36179u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f36180v;

    public b() {
        super(6);
        this.f36177s = new f(1);
        this.f36178t = new C();
    }

    @Override // K1.f1
    public int a(o oVar) {
        return "application/x-camera-motion".equals(oVar.f1805o) ? f1.u(4) : f1.u(0);
    }

    @Override // K1.e1
    public boolean b() {
        return j();
    }

    @Override // K1.AbstractC1001i
    public void d0() {
        s0();
    }

    @Override // K1.e1
    public void g(long j10, long j11) {
        while (!j() && this.f36180v < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + j10) {
            this.f36177s.s();
            if (o0(V(), this.f36177s, 0) != -4 || this.f36177s.w()) {
                return;
            }
            long j12 = this.f36177s.f5880f;
            this.f36180v = j12;
            boolean z10 = j12 < X();
            if (this.f36179u != null && !z10) {
                this.f36177s.E();
                float[] fArrR0 = r0((ByteBuffer) M.i(this.f36177s.f5878d));
                if (fArrR0 != null) {
                    ((InterfaceC4269a) M.i(this.f36179u)).a(this.f36180v - a0(), fArrR0);
                }
            }
        }
    }

    @Override // K1.AbstractC1001i
    public void g0(long j10, boolean z10) {
        this.f36180v = Long.MIN_VALUE;
        s0();
    }

    @Override // K1.e1, K1.f1
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // K1.e1
    public boolean isReady() {
        return true;
    }

    public final float[] r0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f36178t.Y(byteBuffer.array(), byteBuffer.limit());
        this.f36178t.a0(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f36178t.y());
        }
        return fArr;
    }

    public final void s0() {
        InterfaceC4269a interfaceC4269a = this.f36179u;
        if (interfaceC4269a != null) {
            interfaceC4269a.d();
        }
    }

    @Override // K1.AbstractC1001i, K1.c1.b
    public void w(int i10, Object obj) {
        if (i10 == 8) {
            this.f36179u = (InterfaceC4269a) obj;
        } else {
            super.w(i10, obj);
        }
    }
}
