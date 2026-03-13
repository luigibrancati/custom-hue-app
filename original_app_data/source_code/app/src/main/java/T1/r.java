package T1;

import D1.AbstractC0747e;
import G1.AbstractC0853a;
import G1.G;
import G1.I;
import G1.M;
import J1.f;
import K1.AbstractC1001i;
import K1.C0;
import K1.C1003j;
import K1.C1005k;
import K1.C1030x;
import K1.e1;
import L1.B0;
import M1.H;
import P1.m;
import T1.m;
import T1.z;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends AbstractC1001i {

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final byte[] f15975Y0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, ByteSourceJsonBootstrapper.UTF8_BOM_3, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final MediaCodec.BufferInfo f15976A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f15977A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayDeque f15978B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f15979B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final H f15980C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f15981C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public D1.o f15982D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f15983D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public D1.o f15984E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f15985E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public P1.m f15986F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f15987F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public P1.m f15988G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f15989G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public e1.a f15990H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f15991H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public MediaCrypto f15992I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f15993I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f15994J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public long f15995J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public long f15996K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f15997L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f15998M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f15999N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f16000O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f16001P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public C1030x f16002P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f16003Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public C1003j f16004Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public m f16005R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public e f16006R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public D1.o f16007S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public long f16008S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public MediaFormat f16009T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f16010T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f16011U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f16012V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public boolean f16013V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f16014W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public long f16015W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ArrayDeque f16016X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public long f16017X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public c f16018Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public p f16019Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f16020k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f16021l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f16022m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f16023n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f16024o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f16025p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f16026q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f16027r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m.b f16028s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f16029s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f16030t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f16031t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f16032u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f16033u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f16034v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f16035v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final J1.f f16036w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ByteBuffer f16037w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final J1.f f16038x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f16039x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final J1.f f16040y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f16041y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i f16042z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f16043z0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public static void a(m.a aVar, B0 b02) {
            LogSessionId logSessionIdA = b02.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f15950b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d implements m.c {
        public d() {
        }

        @Override // T1.m.c
        public void a() {
            if (r.this.f15990H != null) {
                r.this.f15990H.b();
            }
        }

        @Override // T1.m.c
        public void b() {
            if (r.this.f15990H != null) {
                r.this.f15990H.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f16050e = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f16051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f16052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f16053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final G f16054d = new G();

        public e(long j10, long j11, long j12) {
            this.f16051a = j10;
            this.f16052b = j11;
            this.f16053c = j12;
        }
    }

    public r(int i10, m.b bVar, u uVar, boolean z10, float f10) {
        super(i10);
        this.f16028s = bVar;
        this.f16030t = (u) AbstractC0853a.e(uVar);
        this.f16032u = z10;
        this.f16034v = f10;
        this.f16036w = J1.f.G();
        this.f16038x = new J1.f(0);
        this.f16040y = new J1.f(2);
        i iVar = new i();
        this.f16042z = iVar;
        this.f15976A = new MediaCodec.BufferInfo();
        this.f16001P = 1.0f;
        this.f16003Q = 1.0f;
        this.f15994J = -9223372036854775807L;
        this.f15978B = new ArrayDeque();
        this.f16006R0 = e.f16050e;
        iVar.D(0);
        iVar.f5878d.order(ByteOrder.nativeOrder());
        this.f15980C = new H();
        this.f16014W = -1.0f;
        this.f16020k0 = 0;
        this.f15983D0 = 0;
        this.f16033u0 = -1;
        this.f16035v0 = -1;
        this.f16031t0 = -9223372036854775807L;
        this.f15995J0 = -9223372036854775807L;
        this.f15996K0 = -9223372036854775807L;
        this.f16008S0 = -9223372036854775807L;
        this.f16027r0 = -9223372036854775807L;
        this.f15985E0 = 0;
        this.f15987F0 = 0;
        this.f16004Q0 = new C1003j();
        this.f16015W0 = -9223372036854775807L;
        this.f16017X0 = -9223372036854775807L;
    }

    public static boolean b2(D1.o oVar) {
        int i10 = oVar.f1789P;
        return i10 == 0 || i10 == 2;
    }

    public static boolean m1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean w0(String str) {
        return false;
    }

    public static boolean x0(String str) {
        return false;
    }

    public static boolean y0(p pVar) {
        String str = pVar.f15959a;
        return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && pVar.f15965g;
    }

    public static boolean z0(String str) {
        return false;
    }

    public o A0(Throwable th, p pVar) {
        return new o(th, pVar);
    }

    public final void A1() throws C1030x {
        int i10 = this.f15987F0;
        if (i10 == 1) {
            J0();
            return;
        }
        if (i10 == 2) {
            J0();
            e2();
        } else if (i10 == 3) {
            E1();
        } else {
            this.f15998M0 = true;
            G1();
        }
    }

    public final void B0() {
        this.f16043z0 = false;
        H1();
    }

    public abstract boolean B1(long j10, long j11, m mVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, D1.o oVar);

    public final boolean C0() {
        if (this.f15989G0) {
            this.f15985E0 = 1;
            if (this.f16022m0) {
                this.f15987F0 = 3;
                return false;
            }
            this.f15987F0 = 1;
        }
        return true;
    }

    public final void C1() {
        this.f15993I0 = true;
        MediaFormat outputFormat = ((m) AbstractC0853a.e(this.f16005R)).getOutputFormat();
        if (this.f16020k0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f16025p0 = true;
        } else {
            this.f16009T = outputFormat;
            this.f16012V = true;
        }
    }

    public final void D0() {
        if (!this.f15989G0) {
            E1();
        } else {
            this.f15985E0 = 1;
            this.f15987F0 = 3;
        }
    }

    public final boolean D1(int i10) throws C1030x {
        C0 c0V = V();
        this.f16036w.s();
        int iO0 = o0(c0V, this.f16036w, i10 | 4);
        if (iO0 == -5) {
            t1(c0V);
            return true;
        }
        if (iO0 != -4 || !this.f16036w.w()) {
            return false;
        }
        this.f15997L0 = true;
        A1();
        return false;
    }

    @Override // K1.e1
    public final long E(long j10, long j11) {
        return V0(j10, j11, this.f16029s0);
    }

    public final boolean E0() throws C1030x {
        if (this.f15989G0) {
            this.f15985E0 = 1;
            if (this.f16022m0) {
                this.f15987F0 = 3;
                return false;
            }
            this.f15987F0 = 2;
        } else {
            e2();
        }
        return true;
    }

    public final void E1() {
        F1();
        n1();
    }

    public final boolean F0(long j10, long j11) throws C1030x {
        boolean z10;
        boolean zB1;
        int iJ;
        m mVar = (m) AbstractC0853a.e(this.f16005R);
        if (!d1()) {
            if (this.f16023n0 && this.f15991H0) {
                try {
                    iJ = mVar.j(this.f15976A);
                } catch (IllegalStateException unused) {
                    A1();
                    if (this.f15998M0) {
                        F1();
                    }
                    return false;
                }
            } else {
                iJ = mVar.j(this.f15976A);
            }
            if (iJ < 0) {
                if (iJ == -2) {
                    C1();
                    return true;
                }
                if (this.f16026q0 && (this.f15997L0 || this.f15985E0 == 2)) {
                    A1();
                }
                long j12 = this.f16027r0;
                if (j12 != -9223372036854775807L && j12 + 100 < T().a()) {
                    A1();
                }
                return false;
            }
            if (this.f16025p0) {
                this.f16025p0 = false;
                mVar.releaseOutputBuffer(iJ, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f15976A;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                A1();
                return false;
            }
            this.f16035v0 = iJ;
            ByteBuffer outputBuffer = mVar.getOutputBuffer(iJ);
            this.f16037w0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f15976A.offset);
                ByteBuffer byteBuffer = this.f16037w0;
                MediaCodec.BufferInfo bufferInfo2 = this.f15976A;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            f2(this.f15976A.presentationTimeUs);
        }
        this.f16039x0 = this.f15976A.presentationTimeUs < X();
        long j13 = this.f15996K0;
        this.f16041y0 = j13 != -9223372036854775807L && j13 <= this.f15976A.presentationTimeUs;
        if (this.f16013V0) {
            long j14 = this.f16015W0;
            if (j14 == -9223372036854775807L || this.f15976A.presentationTimeUs > j14) {
                this.f16015W0 = this.f15976A.presentationTimeUs;
                this.f16039x0 = true;
                this.f16041y0 = false;
            } else {
                this.f16013V0 = false;
                this.f16015W0 = -9223372036854775807L;
            }
        }
        if (this.f16023n0 && this.f15991H0) {
            try {
                ByteBuffer byteBuffer2 = this.f16037w0;
                int i10 = this.f16035v0;
                MediaCodec.BufferInfo bufferInfo3 = this.f15976A;
                z10 = false;
                try {
                    zB1 = B1(j10, j11, mVar, byteBuffer2, i10, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.f16039x0, this.f16041y0, (D1.o) AbstractC0853a.e(this.f15984E));
                } catch (IllegalStateException unused2) {
                    A1();
                    if (this.f15998M0) {
                        F1();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.f16037w0;
            int i11 = this.f16035v0;
            MediaCodec.BufferInfo bufferInfo4 = this.f15976A;
            zB1 = B1(j10, j11, mVar, byteBuffer3, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f16039x0, this.f16041y0, (D1.o) AbstractC0853a.e(this.f15984E));
        }
        if (zB1) {
            w1(this.f15976A.presentationTimeUs);
            boolean z11 = (this.f15976A.flags & 4) != 0 ? true : z10;
            if (!z11 && this.f15991H0 && this.f16041y0) {
                this.f16027r0 = T().a();
            }
            M1();
            if (!z11) {
                return true;
            }
            A1();
        }
        return z10;
    }

    public void F1() {
        try {
            m mVar = this.f16005R;
            if (mVar != null) {
                mVar.release();
                this.f16004Q0.f7096b++;
                s1(((p) AbstractC0853a.e(this.f16019Z)).f15959a);
            }
            this.f16005R = null;
            try {
                MediaCrypto mediaCrypto = this.f15992I;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f16005R = null;
            try {
                MediaCrypto mediaCrypto2 = this.f15992I;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public final boolean G0(p pVar, D1.o oVar, P1.m mVar, P1.m mVar2) {
        J1.b bVarF;
        J1.b bVarF2;
        if (mVar == mVar2) {
            return false;
        }
        if (mVar2 != null && mVar != null && (bVarF = mVar2.f()) != null && (bVarF2 = mVar.f()) != null && bVarF.getClass().equals(bVarF2.getClass())) {
            if (!(bVarF instanceof P1.B)) {
                return false;
            }
            if (!mVar2.a().equals(mVar.a())) {
                return true;
            }
            UUID uuid = AbstractC0747e.f1688e;
            if (!uuid.equals(mVar.a()) && !uuid.equals(mVar2.a())) {
                return !pVar.f15965g && (mVar2.getState() == 2 || ((mVar2.getState() == 3 || mVar2.getState() == 4) && mVar2.i((String) AbstractC0853a.e(oVar.f1805o))));
            }
        }
        return true;
    }

    public abstract void G1();

    public void H0() {
        this.f16011U0 = true;
    }

    public final void H1() {
        K1();
        this.f15979B0 = false;
        this.f16042z.s();
        this.f16040y.s();
        this.f15977A0 = false;
        this.f15980C.d();
    }

    @Override // K1.e1
    public void I(float f10, float f11) {
        this.f16001P = f10;
        this.f16003Q = f11;
        d2(this.f16007S);
    }

    public final boolean I0() throws C1030x {
        int i10;
        if (this.f16005R == null || (i10 = this.f15985E0) == 2 || this.f15997L0) {
            return false;
        }
        if (i10 == 0 && W1()) {
            D0();
        }
        m mVar = (m) AbstractC0853a.e(this.f16005R);
        if (this.f16033u0 < 0) {
            int i11 = mVar.i();
            this.f16033u0 = i11;
            if (i11 < 0) {
                return false;
            }
            this.f16038x.f5878d = mVar.getInputBuffer(i11);
            this.f16038x.s();
        }
        if (this.f15985E0 == 1) {
            if (!this.f16026q0) {
                this.f15991H0 = true;
                mVar.queueInputBuffer(this.f16033u0, 0, 0, 0L, 4);
                L1();
            }
            this.f15985E0 = 2;
            return false;
        }
        if (this.f16024o0) {
            this.f16024o0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC0853a.e(this.f16038x.f5878d);
            byte[] bArr = f15975Y0;
            byteBuffer.put(bArr);
            mVar.queueInputBuffer(this.f16033u0, 0, bArr.length, 0L, 0);
            L1();
            this.f15989G0 = true;
            return true;
        }
        if (this.f15983D0 == 1) {
            for (int i12 = 0; i12 < ((D1.o) AbstractC0853a.e(this.f16007S)).f1808r.size(); i12++) {
                ((ByteBuffer) AbstractC0853a.e(this.f16038x.f5878d)).put((byte[]) this.f16007S.f1808r.get(i12));
            }
            this.f15983D0 = 2;
        }
        int iPosition = ((ByteBuffer) AbstractC0853a.e(this.f16038x.f5878d)).position();
        C0 c0V = V();
        try {
            int iO0 = o0(c0V, this.f16038x, 0);
            if (iO0 == -3) {
                if (j()) {
                    this.f15996K0 = this.f15995J0;
                }
                return false;
            }
            if (iO0 == -5) {
                if (this.f15983D0 == 2) {
                    this.f16038x.s();
                    this.f15983D0 = 1;
                }
                t1(c0V);
                return true;
            }
            if (this.f16038x.w()) {
                this.f15996K0 = this.f15995J0;
                if (this.f15983D0 == 2) {
                    this.f16038x.s();
                    this.f15983D0 = 1;
                }
                this.f15997L0 = true;
                if (!this.f15989G0) {
                    A1();
                    return false;
                }
                if (!this.f16026q0) {
                    this.f15991H0 = true;
                    mVar.queueInputBuffer(this.f16033u0, 0, 0, 0L, 4);
                    L1();
                }
                return false;
            }
            if (!this.f15989G0 && !this.f16038x.y()) {
                this.f16038x.s();
                if (this.f15983D0 == 2) {
                    this.f15983D0 = 1;
                }
                return true;
            }
            if (T1(this.f16038x)) {
                return true;
            }
            boolean zF = this.f16038x.F();
            if (zF) {
                this.f16038x.f5877c.b(iPosition);
            }
            long j10 = this.f16038x.f5880f;
            if (this.f15999N0) {
                if (this.f15978B.isEmpty()) {
                    this.f16006R0.f16054d.a(j10, (D1.o) AbstractC0853a.e(this.f15982D));
                } else {
                    ((e) this.f15978B.peekLast()).f16054d.a(j10, (D1.o) AbstractC0853a.e(this.f15982D));
                }
                this.f15999N0 = false;
            }
            this.f15995J0 = Math.max(this.f15995J0, j10);
            if (j() || this.f16038x.z()) {
                this.f15996K0 = this.f15995J0;
            }
            this.f16038x.E();
            if (this.f16038x.v()) {
                c1(this.f16038x);
            }
            y1(this.f16038x);
            int iO02 = O0(this.f16038x);
            if ((Build.VERSION.SDK_INT < 34 || (iO02 & 32) == 0) && !U().f7059b) {
                this.f16017X0 = Math.max(this.f16017X0, this.f16038x.f5880f);
            }
            if (zF) {
                ((m) AbstractC0853a.e(mVar)).a(this.f16033u0, 0, this.f16038x.f5877c, j10, iO02);
            } else {
                ((m) AbstractC0853a.e(mVar)).queueInputBuffer(this.f16033u0, 0, ((ByteBuffer) AbstractC0853a.e(this.f16038x.f5878d)).limit(), j10, iO02);
            }
            L1();
            this.f15989G0 = true;
            this.f15983D0 = 0;
            this.f16004Q0.f7097c++;
            return true;
        } catch (f.a e10) {
            q1(e10);
            D1(0);
            J0();
            return true;
        }
    }

    public void I1() {
        L1();
        M1();
        K1();
        this.f16031t0 = -9223372036854775807L;
        this.f15991H0 = false;
        this.f16027r0 = -9223372036854775807L;
        this.f15989G0 = false;
        this.f16024o0 = false;
        this.f16025p0 = false;
        this.f16039x0 = false;
        this.f16041y0 = false;
        this.f15985E0 = 0;
        this.f15987F0 = 0;
        this.f15983D0 = this.f15981C0 ? 1 : 0;
        this.f16013V0 = false;
        this.f16015W0 = -9223372036854775807L;
        this.f16017X0 = -9223372036854775807L;
    }

    public final void J0() {
        try {
            ((m) AbstractC0853a.i(this.f16005R)).flush();
        } finally {
            I1();
        }
    }

    public void J1() {
        I1();
        this.f16002P0 = null;
        this.f16016X = null;
        this.f16019Z = null;
        this.f16007S = null;
        this.f16009T = null;
        this.f16012V = false;
        this.f15993I0 = false;
        this.f16014W = -1.0f;
        this.f16020k0 = 0;
        this.f16021l0 = false;
        this.f16022m0 = false;
        this.f16023n0 = false;
        this.f16026q0 = false;
        this.f16029s0 = false;
        this.f15981C0 = false;
        this.f15983D0 = 0;
    }

    @Override // K1.AbstractC1001i, K1.f1
    public final int K() {
        return 8;
    }

    public final boolean K0() {
        boolean zL0 = L0();
        if (zL0) {
            n1();
        }
        return zL0;
    }

    public final void K1() {
        this.f15995J0 = -9223372036854775807L;
        this.f15996K0 = -9223372036854775807L;
        this.f16008S0 = -9223372036854775807L;
    }

    public final boolean L0() {
        if (this.f16005R == null) {
            return false;
        }
        if (X1()) {
            F1();
            return true;
        }
        if (U1()) {
            J0();
        } else {
            z1();
        }
        return false;
    }

    public final void L1() {
        this.f16033u0 = -1;
        this.f16038x.f5878d = null;
    }

    public final List M0(boolean z10) {
        D1.o oVar = (D1.o) AbstractC0853a.e(this.f15982D);
        List listU0 = U0(this.f16030t, oVar, z10);
        if (!listU0.isEmpty() || !z10) {
            return listU0;
        }
        List listU02 = U0(this.f16030t, oVar, false);
        if (!listU02.isEmpty()) {
            G1.t.h("MediaCodecRenderer", "Drm session requires secure decoder for " + oVar.f1805o + ", but no secure decoder available. Trying to proceed with " + listU02 + ".");
        }
        return listU02;
    }

    public final void M1() {
        this.f16035v0 = -1;
        this.f16037w0 = null;
    }

    public final m N0() {
        return this.f16005R;
    }

    public final void N1(P1.m mVar) {
        P1.m.g(this.f15986F, mVar);
        this.f15986F = mVar;
    }

    public int O0(J1.f fVar) {
        return 0;
    }

    public final void O1(e eVar) {
        this.f16006R0 = eVar;
        long j10 = eVar.f16053c;
        if (j10 != -9223372036854775807L) {
            this.f16010T0 = true;
            v1(j10);
        }
    }

    public final p P0() {
        return this.f16019Z;
    }

    public final void P1() {
        this.f16000O0 = true;
    }

    public final D1.o Q0() {
        return this.f16007S;
    }

    public final void Q1(C1030x c1030x) {
        this.f16002P0 = c1030x;
    }

    public boolean R0() {
        return false;
    }

    public final void R1(P1.m mVar) {
        P1.m.g(this.f15988G, mVar);
        this.f15988G = mVar;
    }

    public abstract float S0(float f10, D1.o oVar, D1.o[] oVarArr);

    public final boolean S1(long j10) {
        return this.f15994J == -9223372036854775807L || T().c() - j10 < this.f15994J;
    }

    public final MediaFormat T0() {
        return this.f16009T;
    }

    public boolean T1(J1.f fVar) {
        if (!Y1(fVar)) {
            return false;
        }
        fVar.s();
        this.f16004Q0.f7098d++;
        return true;
    }

    public abstract List U0(u uVar, D1.o oVar, boolean z10);

    public boolean U1() {
        return true;
    }

    public long V0(long j10, long j11, boolean z10) {
        return super.E(j10, j11);
    }

    public boolean V1(p pVar) {
        return true;
    }

    public long W0() {
        return this.f15996K0;
    }

    public boolean W1() {
        return false;
    }

    public abstract m.a X0(p pVar, D1.o oVar, MediaCrypto mediaCrypto, float f10);

    public boolean X1() {
        int i10 = this.f15987F0;
        if (i10 == 3 || ((this.f16021l0 && !this.f15993I0) || (this.f16022m0 && this.f15991H0))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        AbstractC0853a.g(true);
        try {
            e2();
            return false;
        } catch (C1030x e10) {
            G1.t.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    public final long Y0() {
        return this.f16006R0.f16053c;
    }

    public boolean Y1(J1.f fVar) {
        return false;
    }

    public final long Z0() {
        return this.f16006R0.f16052b;
    }

    public boolean Z1(D1.o oVar) {
        return false;
    }

    @Override // K1.f1
    public final int a(D1.o oVar) throws C1030x {
        try {
            return a2(this.f16030t, oVar);
        } catch (z.c e10) {
            throw this.R(e10, oVar, 4002);
        }
    }

    public float a1() {
        return this.f16001P;
    }

    public abstract int a2(u uVar, D1.o oVar);

    @Override // K1.e1
    public boolean b() {
        return this.f15998M0;
    }

    public final e1.a b1() {
        return this.f15990H;
    }

    public abstract void c1(J1.f fVar);

    public final boolean c2() {
        return d2(this.f16007S);
    }

    @Override // K1.AbstractC1001i
    public void d0() {
        this.f15982D = null;
        O1(e.f16050e);
        this.f15978B.clear();
        if (this.f16043z0) {
            B0();
        } else {
            L0();
        }
    }

    public final boolean d1() {
        return this.f16035v0 >= 0;
    }

    public final boolean d2(D1.o oVar) {
        if (this.f16005R != null && this.f15987F0 != 3 && getState() != 0) {
            float fS0 = S0(this.f16003Q, (D1.o) AbstractC0853a.e(oVar), Z());
            float f10 = this.f16014W;
            if (f10 == fS0) {
                return true;
            }
            if (fS0 == -1.0f) {
                D0();
                return false;
            }
            if (f10 == -1.0f && fS0 <= this.f16034v) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fS0);
            ((m) AbstractC0853a.e(this.f16005R)).setParameters(bundle);
            this.f16014W = fS0;
        }
        return true;
    }

    @Override // K1.AbstractC1001i
    public void e0(boolean z10, boolean z11) {
        this.f16004Q0 = new C1003j();
    }

    public boolean e1() {
        return this.f16013V0;
    }

    public final void e2() throws C1030x {
        J1.b bVarF = ((P1.m) AbstractC0853a.e(this.f15988G)).f();
        if (bVarF instanceof P1.B) {
            try {
                ((MediaCrypto) AbstractC0853a.e(this.f15992I)).setMediaDrmSession(((P1.B) bVarF).f12551b);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f15982D, 6006);
            }
        }
        N1(this.f15988G);
        this.f15985E0 = 0;
        this.f15987F0 = 0;
    }

    public final boolean f1() {
        if (!this.f16042z.N()) {
            return true;
        }
        long jX = X();
        return l1(jX, this.f16042z.L()) == l1(jX, this.f16040y.f5880f);
    }

    public final void f2(long j10) {
        D1.o oVar = (D1.o) this.f16006R0.f16054d.i(j10);
        if (oVar == null && this.f16010T0 && this.f16009T != null) {
            oVar = (D1.o) this.f16006R0.f16054d.h();
        }
        if (oVar != null) {
            this.f15984E = oVar;
        } else if (!this.f16012V || this.f15984E == null) {
            return;
        }
        u1((D1.o) AbstractC0853a.e(this.f15984E), this.f16009T);
        this.f16012V = false;
        this.f16010T0 = false;
    }

    @Override // K1.e1
    public void g(long j10, long j11) {
        boolean z10 = false;
        if (this.f16000O0) {
            this.f16000O0 = false;
            A1();
        }
        C1030x c1030x = this.f16002P0;
        if (c1030x != null) {
            this.f16002P0 = null;
            throw c1030x;
        }
        try {
            if (this.f15998M0) {
                G1();
                return;
            }
            if (this.f15982D != null || D1(2)) {
                n1();
                if (this.f16043z0) {
                    I.a("bypassRender");
                    while (t0(j10, j11)) {
                    }
                    I.b();
                } else if (this.f16005R != null) {
                    long jC = T().c();
                    I.a("drainAndFeed");
                    while (F0(j10, j11) && S1(jC)) {
                    }
                    while (I0() && S1(jC)) {
                    }
                    I.b();
                } else {
                    this.f16004Q0.f7098d += q0(j10);
                    D1(1);
                }
                this.f16004Q0.c();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw R(e10, this.f15982D, M.a0(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            if (!m1(e11)) {
                throw e11;
            }
            q1(e11);
            if ((e11 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                F1();
            }
            o oVarA0 = A0(e11, P0());
            throw S(oVarA0, this.f15982D, z10, oVarA0.f15958c == 1101 ? 4006 : 4003);
        }
    }

    @Override // K1.AbstractC1001i
    public void g0(long j10, boolean z10) {
        this.f15997L0 = false;
        this.f15998M0 = false;
        this.f16000O0 = false;
        if (this.f16043z0) {
            H1();
        } else {
            K0();
        }
        if (this.f16006R0.f16054d.k() > 0) {
            this.f15999N0 = true;
        }
        this.f16006R0.f16054d.c();
        this.f15978B.clear();
    }

    public final void g1(D1.o oVar) {
        B0();
        String str = oVar.f1805o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f16042z.O(32);
        } else {
            this.f16042z.O(1);
        }
        this.f16043z0 = true;
    }

    public final void h1(p pVar, MediaCrypto mediaCrypto) {
        this.f16019Z = pVar;
        D1.o oVar = (D1.o) AbstractC0853a.e(this.f15982D);
        String str = pVar.f15959a;
        float fS0 = S0(this.f16003Q, oVar, Z());
        if (fS0 <= this.f16034v) {
            fS0 = -1.0f;
        }
        long jC = T().c();
        m.a aVarX0 = X0(pVar, oVar, mediaCrypto, fS0);
        b.a(aVarX0, Y());
        try {
            I.a("createCodec:" + str);
            m mVarB = this.f16028s.b(aVarX0);
            this.f16005R = mVarB;
            this.f16029s0 = mVarB.c(new d());
            I.b();
            long jC2 = T().c();
            if (!pVar.p(oVar)) {
                G1.t.h("MediaCodecRenderer", M.G("Format exceeds selected codec's capabilities [%s, %s]", D1.o.h(oVar), str));
            }
            this.f16014W = fS0;
            this.f16007S = oVar;
            this.f16020k0 = v0(str);
            this.f16021l0 = z0(str);
            this.f16022m0 = w0(str);
            this.f16023n0 = x0(str);
            this.f16026q0 = y0(pVar) || R0();
            if (((m) AbstractC0853a.e(this.f16005R)).g()) {
                this.f15981C0 = true;
                this.f15983D0 = 1;
                this.f16024o0 = this.f16020k0 != 0;
            }
            if (getState() == 2) {
                this.f16031t0 = T().c() + 1000;
            }
            this.f16004Q0.f7095a++;
            r1(str, aVarX0, jC2, jC2 - jC);
        } catch (Throwable th) {
            I.b();
            throw th;
        }
    }

    public final boolean i1() throws C1030x {
        AbstractC0853a.g(this.f15992I == null);
        P1.m mVar = this.f15986F;
        J1.b bVarF = mVar.f();
        if (P1.B.f12549d && (bVarF instanceof P1.B)) {
            int state = mVar.getState();
            if (state == 1) {
                m.a aVar = (m.a) AbstractC0853a.e(mVar.e());
                throw R(aVar, this.f15982D, aVar.f12655a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (bVarF == null) {
            return mVar.e() != null;
        }
        if (bVarF instanceof P1.B) {
            P1.B b10 = (P1.B) bVarF;
            try {
                this.f15992I = new MediaCrypto(b10.f12550a, b10.f12551b);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f15982D, 6006);
            }
        }
        return true;
    }

    @Override // K1.e1
    public boolean isReady() {
        if (this.f15982D == null) {
            return false;
        }
        if (c0() || d1()) {
            return true;
        }
        return this.f16031t0 != -9223372036854775807L && T().c() < this.f16031t0;
    }

    @Override // K1.AbstractC1001i
    public void j0() {
        try {
            B0();
            F1();
        } finally {
            R1(null);
        }
    }

    public final boolean j1() {
        return this.f16043z0;
    }

    public final boolean k1(D1.o oVar) {
        return this.f15988G == null && Z1(oVar);
    }

    public final boolean l1(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        D1.o oVar = this.f15984E;
        return (oVar != null && Objects.equals(oVar.f1805o, "audio/opus") && i2.H.g(j10, j11)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // K1.AbstractC1001i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m0(D1.o[] r12, long r13, long r15, a2.InterfaceC2611D.b r17) {
        /*
            r11 = this;
            T1.r$e r12 = r11.f16006R0
            long r0 = r12.f16053c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            T1.r$e r4 = new T1.r$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.O1(r4)
            boolean r12 = r11.f16011U0
            if (r12 == 0) goto L56
            r11.x1()
            return
        L24:
            java.util.ArrayDeque r12 = r11.f15978B
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L57
            long r0 = r11.f15995J0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.f16008S0
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L57
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 < 0) goto L57
        L3c:
            T1.r$e r4 = new T1.r$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.O1(r4)
            T1.r$e r12 = r11.f16006R0
            long r12 = r12.f16053c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.x1()
        L56:
            return
        L57:
            java.util.ArrayDeque r12 = r11.f15978B
            T1.r$e r0 = new T1.r$e
            long r1 = r11.f15995J0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.r.m0(D1.o[], long, long, a2.D$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n1() {
        /*
            r3 = this;
            T1.m r0 = r3.f16005R
            if (r0 != 0) goto L6b
            boolean r0 = r3.f16043z0
            if (r0 != 0) goto L6b
            D1.o r0 = r3.f15982D
            if (r0 != 0) goto Ld
            goto L6b
        Ld:
            boolean r1 = r3.k1(r0)
            if (r1 == 0) goto L17
            r3.g1(r0)
            return
        L17:
            P1.m r1 = r3.f15988G
            r3.N1(r1)
            P1.m r1 = r3.f15986F
            if (r1 == 0) goto L26
            boolean r1 = r3.i1()
            if (r1 == 0) goto L55
        L26:
            P1.m r1 = r3.f15986F     // Catch: T1.r.c -> L3b
            if (r1 == 0) goto L4f
            int r1 = r1.getState()     // Catch: T1.r.c -> L3b
            r2 = 3
            if (r1 == r2) goto L3d
            P1.m r1 = r3.f15986F     // Catch: T1.r.c -> L3b
            int r1 = r1.getState()     // Catch: T1.r.c -> L3b
            r2 = 4
            if (r1 != r2) goto L4f
            goto L3d
        L3b:
            r1 = move-exception
            goto L64
        L3d:
            P1.m r1 = r3.f15986F     // Catch: T1.r.c -> L3b
            java.lang.String r2 = r0.f1805o     // Catch: T1.r.c -> L3b
            java.lang.Object r2 = G1.AbstractC0853a.i(r2)     // Catch: T1.r.c -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: T1.r.c -> L3b
            boolean r1 = r1.i(r2)     // Catch: T1.r.c -> L3b
            if (r1 == 0) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            android.media.MediaCrypto r2 = r3.f15992I     // Catch: T1.r.c -> L3b
            r3.o1(r2, r1)     // Catch: T1.r.c -> L3b
        L55:
            android.media.MediaCrypto r0 = r3.f15992I
            if (r0 == 0) goto L6b
            T1.m r1 = r3.f16005R
            if (r1 != 0) goto L6b
            r0.release()
            r0 = 0
            r3.f15992I = r0
            return
        L64:
            r2 = 4001(0xfa1, float:5.607E-42)
            K1.x r3 = r3.R(r1, r0, r2)
            throw r3
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.r.n1():void");
    }

    public final void o1(MediaCrypto mediaCrypto, boolean z10) throws c {
        D1.o oVar = (D1.o) AbstractC0853a.e(this.f15982D);
        if (this.f16016X == null) {
            try {
                List listM0 = M0(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f16016X = arrayDeque;
                if (this.f16032u) {
                    arrayDeque.addAll(listM0);
                } else if (!listM0.isEmpty()) {
                    this.f16016X.add((p) listM0.get(0));
                }
                this.f16018Y = null;
            } catch (z.c e10) {
                throw new c(oVar, e10, z10, -49998);
            }
        }
        if (this.f16016X.isEmpty()) {
            throw new c(oVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) AbstractC0853a.e(this.f16016X);
        while (this.f16005R == null) {
            p pVar = (p) AbstractC0853a.e((p) arrayDeque2.peekFirst());
            if (!p1(oVar) || !V1(pVar)) {
                return;
            }
            try {
                h1(pVar, mediaCrypto);
            } catch (Exception e11) {
                G1.t.i("MediaCodecRenderer", "Failed to initialize decoder: " + pVar, e11);
                arrayDeque2.removeFirst();
                c cVar = new c(oVar, e11, z10, pVar);
                q1(cVar);
                if (this.f16018Y == null) {
                    this.f16018Y = cVar;
                } else {
                    this.f16018Y = this.f16018Y.c(cVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f16018Y;
                }
            }
        }
        this.f16016X = null;
    }

    public boolean p1(D1.o oVar) {
        return true;
    }

    public abstract void q1(Exception exc);

    public abstract void r1(String str, m.a aVar, long j10, long j11);

    public final void s0() {
        AbstractC0853a.g(!this.f15997L0);
        C0 c0V = V();
        this.f16040y.s();
        do {
            this.f16040y.s();
            int iO0 = o0(c0V, this.f16040y, 0);
            if (iO0 == -5) {
                t1(c0V);
                return;
            }
            if (iO0 == -4) {
                if (!this.f16040y.w()) {
                    this.f15995J0 = Math.max(this.f15995J0, this.f16040y.f5880f);
                    if (j() || this.f16038x.z()) {
                        this.f15996K0 = this.f15995J0;
                    }
                    if (this.f15999N0) {
                        D1.o oVar = (D1.o) AbstractC0853a.e(this.f15982D);
                        this.f15984E = oVar;
                        if (Objects.equals(oVar.f1805o, "audio/opus") && !this.f15984E.f1808r.isEmpty()) {
                            this.f15984E = this.f15984E.b().d0(i2.H.f((byte[]) this.f15984E.f1808r.get(0))).P();
                        }
                        u1(this.f15984E, null);
                        this.f15999N0 = false;
                    }
                    this.f16040y.E();
                    D1.o oVar2 = this.f15984E;
                    if (oVar2 != null && Objects.equals(oVar2.f1805o, "audio/opus")) {
                        if (this.f16040y.v()) {
                            J1.f fVar = this.f16040y;
                            fVar.f5876b = this.f15984E;
                            c1(fVar);
                        }
                        if (i2.H.g(X(), this.f16040y.f5880f)) {
                            this.f15980C.a(this.f16040y, this.f15984E.f1808r);
                        }
                    }
                    if (!f1()) {
                        break;
                    }
                } else {
                    this.f15997L0 = true;
                    this.f15996K0 = this.f15995J0;
                    return;
                }
            } else {
                if (iO0 != -3) {
                    throw new IllegalStateException();
                }
                if (j()) {
                    this.f15996K0 = this.f15995J0;
                    return;
                }
                return;
            }
        } while (this.f16042z.I(this.f16040y));
        this.f15977A0 = true;
    }

    public abstract void s1(String str);

    public final boolean t0(long j10, long j11) {
        boolean z10;
        AbstractC0853a.g(!this.f15998M0);
        if (this.f16042z.N()) {
            i iVar = this.f16042z;
            z10 = false;
            if (!B1(j10, j11, null, iVar.f5878d, this.f16035v0, 0, iVar.M(), this.f16042z.K(), l1(X(), this.f16042z.L()), this.f16042z.w(), (D1.o) AbstractC0853a.e(this.f15984E))) {
                return false;
            }
            w1(this.f16042z.L());
            this.f16042z.s();
        } else {
            z10 = false;
        }
        if (this.f15997L0) {
            this.f15998M0 = true;
            return z10;
        }
        if (this.f15977A0) {
            AbstractC0853a.g(this.f16042z.I(this.f16040y));
            this.f15977A0 = z10;
        }
        if (this.f15979B0) {
            if (this.f16042z.N()) {
                return true;
            }
            B0();
            this.f15979B0 = z10;
            n1();
            if (!this.f16043z0) {
                return z10;
            }
        }
        s0();
        if (this.f16042z.N()) {
            this.f16042z.E();
        }
        if (this.f16042z.N() || this.f15997L0 || this.f15979B0) {
            return true;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public K1.C1005k t1(K1.C0 r12) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.r.t1(K1.C0):K1.k");
    }

    public abstract C1005k u0(p pVar, D1.o oVar, D1.o oVar2);

    public abstract void u1(D1.o oVar, MediaFormat mediaFormat);

    public final int v0(String str) {
        return 0;
    }

    @Override // K1.AbstractC1001i, K1.c1.b
    public void w(int i10, Object obj) {
        if (i10 == 11) {
            this.f15990H = (e1.a) AbstractC0853a.e((e1.a) obj);
        } else {
            super.w(i10, obj);
        }
    }

    public void w1(long j10) {
        this.f16008S0 = j10;
        while (!this.f15978B.isEmpty() && j10 >= ((e) this.f15978B.peek()).f16051a) {
            O1((e) AbstractC0853a.e((e) this.f15978B.poll()));
            x1();
        }
    }

    public final void z1() {
        if (this.f16017X0 != -9223372036854775807L) {
            long jX = X();
            long j10 = this.f16017X0;
            if (jX > j10 || this.f16008S0 >= j10) {
                return;
            }
            this.f16013V0 = true;
            this.f16017X0 = -9223372036854775807L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f16045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f16046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f16047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f16048e;

        public c(D1.o oVar, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + oVar, th, oVar.f1805o, z10, null, b(i10), null);
        }

        public static String b(int i10) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        public final c c(c cVar) {
            return new c(getMessage(), getCause(), this.f16044a, this.f16045b, this.f16046c, this.f16047d, cVar);
        }

        public c(D1.o oVar, Throwable th, boolean z10, p pVar) {
            this("Decoder init failed: " + pVar.f15959a + ", " + oVar, th, oVar.f1805o, z10, pVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        }

        public c(String str, Throwable th, String str2, boolean z10, p pVar, String str3, c cVar) {
            super(str, th);
            this.f16044a = str2;
            this.f16045b = z10;
            this.f16046c = pVar;
            this.f16047d = str3;
            this.f16048e = cVar;
        }
    }

    @Override // K1.AbstractC1001i
    public void k0() {
    }

    @Override // K1.AbstractC1001i
    public void l0() {
    }

    public void x1() {
    }

    public void v1(long j10) {
    }

    public void y1(J1.f fVar) {
    }
}
