package M1;

import D1.C0744b;
import D1.C0745c;
import D1.o;
import G1.AbstractC0853a;
import G1.AbstractC0861i;
import G1.M;
import K1.C0;
import K1.C1005k;
import K1.C1030x;
import K1.G0;
import K1.e1;
import K1.f1;
import K7.AbstractC1081v;
import M1.r;
import M1.s;
import T1.m;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.S;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class G extends T1.r implements G0 {

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public final Context f9037Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final r.a f9038a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final s f9039b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final T1.k f9040c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f9041d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f9042e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f9043f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public D1.o f9044g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public D1.o f9045h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public long f9046i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f9047j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f9048k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f9049l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f9050m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f9051n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public long f9052o1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public static void a(s sVar, Object obj) {
            sVar.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements s.d {
        public c() {
        }

        @Override // M1.s.d
        public void a(Exception exc) {
            G1.t.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            G.this.f9038a1.p(exc);
        }

        @Override // M1.s.d
        public void b(s.a aVar) {
            G.this.f9038a1.q(aVar);
        }

        @Override // M1.s.d
        public void c(s.a aVar) {
            G.this.f9038a1.r(aVar);
        }

        @Override // M1.s.d
        public void d(long j10) {
            G.this.f9038a1.x(j10);
        }

        @Override // M1.s.d
        public void e() {
            G.this.f9049l1 = true;
        }

        @Override // M1.s.d
        public void f() {
            e1.a aVarB1 = G.this.b1();
            if (aVarB1 != null) {
                aVarB1.a();
            }
        }

        @Override // M1.s.d
        public void g(int i10, long j10, long j11) {
            G.this.f9038a1.z(i10, j10, j11);
        }

        @Override // M1.s.d
        public void h() {
            G.this.i0();
        }

        @Override // M1.s.d
        public void i() {
            G.this.u2();
        }

        @Override // M1.s.d
        public void j() {
            e1.a aVarB1 = G.this.b1();
            if (aVarB1 != null) {
                aVarB1.b();
            }
        }

        @Override // M1.s.d
        public void onAudioSessionIdChanged(int i10) {
            if (Build.VERSION.SDK_INT >= 35 && G.this.f9040c1 != null) {
                G.this.f9040c1.e(i10);
            }
            G.this.f9038a1.o(i10);
        }

        @Override // M1.s.d
        public void onSkipSilenceEnabledChanged(boolean z10) {
            G.this.f9038a1.y(z10);
        }
    }

    public G(Context context, m.b bVar, T1.u uVar, boolean z10, Handler handler, r rVar, s sVar) {
        this(context, bVar, uVar, z10, handler, rVar, sVar, Build.VERSION.SDK_INT >= 35 ? new T1.k() : null);
    }

    public static boolean m2(String str) {
        return false;
    }

    public static boolean n2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    public static boolean o2() {
        return false;
    }

    private int q2(T1.p pVar, D1.o oVar) {
        "OMX.google.raw.decoder".equals(pVar.f15959a);
        return oVar.f1806p;
    }

    public static List s2(T1.u uVar, D1.o oVar, boolean z10, s sVar) {
        T1.p pVarP;
        return oVar.f1805o == null ? AbstractC1081v.z() : (!sVar.a(oVar) || (pVarP = T1.z.p()) == null) ? T1.z.m(uVar, oVar, z10, false) : AbstractC1081v.A(pVarP);
    }

    @Override // T1.r
    public boolean B1(long j10, long j11, T1.m mVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, D1.o oVar) throws C1030x {
        AbstractC0853a.e(byteBuffer);
        this.f9052o1 = -9223372036854775807L;
        if (this.f9045h1 != null && (i11 & 2) != 0) {
            ((T1.m) AbstractC0853a.e(mVar)).releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            if (mVar != null) {
                mVar.releaseOutputBuffer(i10, false);
            }
            this.f16004Q0.f7100f += i12;
            this.f9039b1.w();
            return true;
        }
        try {
            if (!this.f9039b1.o(byteBuffer, j12, i12)) {
                this.f9052o1 = j12;
                return false;
            }
            if (mVar != null) {
                mVar.releaseOutputBuffer(i10, false);
            }
            this.f16004Q0.f7099e += i12;
            return true;
        } catch (s.c e10) {
            throw S(e10, this.f9044g1, e10.f9154b, (!j1() || U().f7058a == 0) ? 5001 : 5004);
        } catch (s.f e11) {
            throw S(e11, oVar, e11.f9159b, (!j1() || U().f7058a == 0) ? 5002 : 5003);
        }
    }

    @Override // T1.r
    public void G1() throws C1030x {
        try {
            this.f9039b1.p();
            if (W0() != -9223372036854775807L) {
                this.f9052o1 = W0();
            }
        } catch (s.f e10) {
            throw S(e10, e10.f9160c, e10.f9159b, j1() ? 5003 : 5002);
        }
    }

    @Override // K1.G0
    public long H() {
        if (getState() == 2) {
            x2();
        }
        return this.f9046i1;
    }

    @Override // T1.r
    public float S0(float f10, D1.o oVar, D1.o[] oVarArr) {
        int iMax = -1;
        for (D1.o oVar2 : oVarArr) {
            int i10 = oVar2.f1781H;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // T1.r
    public List U0(T1.u uVar, D1.o oVar, boolean z10) {
        return T1.z.n(s2(uVar, oVar, z10, this.f9039b1), oVar);
    }

    @Override // T1.r
    public long V0(long j10, long j11, boolean z10) {
        boolean z11 = this.f9052o1 != -9223372036854775807L;
        if (!this.f9051n1) {
            return (z11 || super.b()) ? 1000000L : 10000L;
        }
        long jH = this.f9039b1.h();
        if (!z11 || jH == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(jH, this.f9052o1 - j10) / (e() != null ? e().f2119a : 1.0f)) / 2.0f)) - (M.M0(T().c()) - j11));
    }

    @Override // T1.r
    public m.a X0(T1.p pVar, D1.o oVar, MediaCrypto mediaCrypto, float f10) {
        this.f9041d1 = r2(pVar, oVar, Z());
        this.f9042e1 = m2(pVar.f15959a);
        this.f9043f1 = n2(pVar.f15959a);
        MediaFormat mediaFormatT2 = t2(oVar, pVar.f15961c, this.f9041d1, f10);
        this.f9045h1 = (!"audio/raw".equals(pVar.f15960b) || "audio/raw".equals(oVar.f1805o)) ? null : oVar;
        return m.a.a(pVar, mediaFormatT2, oVar, mediaCrypto, this.f9040c1);
    }

    @Override // T1.r
    public boolean Z1(D1.o oVar) {
        if (U().f7058a != 0) {
            int iP2 = p2(oVar);
            if ((iP2 & 512) != 0) {
                if (U().f7058a == 2 || (iP2 & RecognitionOptions.UPC_E) != 0) {
                    return true;
                }
                if (oVar.f1783J == 0 && oVar.f1784K == 0) {
                    return true;
                }
            }
        }
        return this.f9039b1.a(oVar);
    }

    @Override // T1.r
    public int a2(T1.u uVar, D1.o oVar) {
        int iP2;
        boolean z10;
        if (!D1.v.o(oVar.f1805o)) {
            return f1.u(0);
        }
        boolean z11 = true;
        boolean z12 = oVar.f1789P != 0;
        boolean zB2 = T1.r.b2(oVar);
        int i10 = 8;
        if (!zB2 || (z12 && T1.z.p() == null)) {
            iP2 = 0;
        } else {
            iP2 = p2(oVar);
            if (this.f9039b1.a(oVar)) {
                return f1.p(4, 8, 32, iP2);
            }
        }
        if ("audio/raw".equals(oVar.f1805o) && !this.f9039b1.a(oVar)) {
            return f1.u(1);
        }
        if (!this.f9039b1.a(M.k0(2, oVar.f1780G, oVar.f1781H))) {
            return f1.u(1);
        }
        List listS2 = s2(uVar, oVar, false, this.f9039b1);
        if (listS2.isEmpty()) {
            return f1.u(1);
        }
        if (!zB2) {
            return f1.u(2);
        }
        T1.p pVar = (T1.p) listS2.get(0);
        boolean zP = pVar.p(oVar);
        if (zP) {
            z10 = true;
            z11 = zP;
        } else {
            for (int i11 = 1; i11 < listS2.size(); i11++) {
                T1.p pVar2 = (T1.p) listS2.get(i11);
                if (pVar2.p(oVar)) {
                    z10 = false;
                    pVar = pVar2;
                    break;
                }
            }
            z10 = true;
            z11 = zP;
        }
        int i12 = z11 ? 4 : 3;
        if (z11 && pVar.s(oVar)) {
            i10 = 16;
        }
        return f1.D(i12, i10, 32, pVar.f15966h ? 64 : 0, z10 ? 128 : 0, iP2);
    }

    @Override // T1.r, K1.e1
    public boolean b() {
        return super.b() && this.f9039b1.b();
    }

    @Override // T1.r
    public void c1(J1.f fVar) {
        D1.o oVar = fVar.f5876b;
        if (oVar != null && Objects.equals(oVar.f1805o, "audio/opus") && j1()) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC0853a.e(fVar.f5881g);
            int i10 = ((D1.o) AbstractC0853a.e(fVar.f5876b)).f1783J;
            if (byteBuffer.remaining() == 8) {
                this.f9039b1.r(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    @Override // K1.G0
    public void d(D1.y yVar) {
        this.f9039b1.d(yVar);
    }

    @Override // T1.r, K1.AbstractC1001i
    public void d0() {
        this.f9048k1 = true;
        this.f9044g1 = null;
        this.f9052o1 = -9223372036854775807L;
        try {
            this.f9039b1.flush();
            try {
                super.d0();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.d0();
                throw th;
            } finally {
            }
        }
    }

    @Override // K1.G0
    public D1.y e() {
        return this.f9039b1.e();
    }

    @Override // T1.r, K1.AbstractC1001i
    public void e0(boolean z10, boolean z11) {
        super.e0(z10, z11);
        this.f9038a1.v(this.f16004Q0);
        if (U().f7059b) {
            this.f9039b1.x();
        } else {
            this.f9039b1.k();
        }
        this.f9039b1.m(Y());
        this.f9039b1.t(T());
    }

    @Override // T1.r, K1.AbstractC1001i
    public void g0(long j10, boolean z10) {
        super.g0(j10, z10);
        this.f9039b1.flush();
        this.f9046i1 = j10;
        this.f9052o1 = -9223372036854775807L;
        this.f9049l1 = false;
        this.f9047j1 = true;
    }

    @Override // K1.e1, K1.f1
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // K1.AbstractC1001i
    public void h0() {
        T1.k kVar;
        this.f9039b1.release();
        if (Build.VERSION.SDK_INT < 35 || (kVar = this.f9040c1) == null) {
            return;
        }
        kVar.c();
    }

    @Override // T1.r, K1.e1
    public boolean isReady() {
        return this.f9039b1.f() || super.isReady();
    }

    @Override // T1.r, K1.AbstractC1001i
    public void j0() {
        this.f9049l1 = false;
        this.f9052o1 = -9223372036854775807L;
        try {
            super.j0();
        } finally {
            if (this.f9048k1) {
                this.f9048k1 = false;
                this.f9039b1.reset();
            }
        }
    }

    @Override // T1.r, K1.AbstractC1001i
    public void k0() {
        super.k0();
        this.f9039b1.play();
        this.f9051n1 = true;
    }

    @Override // T1.r, K1.AbstractC1001i
    public void l0() {
        x2();
        this.f9051n1 = false;
        this.f9039b1.pause();
        super.l0();
    }

    public final int p2(D1.o oVar) {
        C1201d c1201dN = this.f9039b1.n(oVar);
        if (!c1201dN.f9107a) {
            return 0;
        }
        int i10 = c1201dN.f9108b ? 1536 : 512;
        return c1201dN.f9109c ? i10 | RecognitionOptions.PDF417 : i10;
    }

    @Override // T1.r
    public void q1(Exception exc) {
        G1.t.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f9038a1.n(exc);
    }

    @Override // T1.r
    public void r1(String str, m.a aVar, long j10, long j11) {
        this.f9038a1.s(str, j10, j11);
    }

    public int r2(T1.p pVar, D1.o oVar, D1.o[] oVarArr) {
        int iQ2 = q2(pVar, oVar);
        if (oVarArr.length == 1) {
            return iQ2;
        }
        for (D1.o oVar2 : oVarArr) {
            if (pVar.e(oVar, oVar2).f7210d != 0) {
                iQ2 = Math.max(iQ2, q2(pVar, oVar2));
            }
        }
        return iQ2;
    }

    @Override // T1.r
    public void s1(String str) {
        this.f9038a1.t(str);
    }

    @Override // T1.r
    public C1005k t1(C0 c02) {
        D1.o oVar = (D1.o) AbstractC0853a.e(c02.f6835b);
        this.f9044g1 = oVar;
        C1005k c1005kT1 = super.t1(c02);
        this.f9038a1.w(oVar, c1005kT1);
        return c1005kT1;
    }

    public MediaFormat t2(D1.o oVar, String str, int i10, float f10) {
        Pair pairS;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", oVar.f1780G);
        mediaFormat.setInteger("sample-rate", oVar.f1781H);
        G1.w.e(mediaFormat, oVar.f1808r);
        G1.w.d(mediaFormat, "max-input-size", i10);
        int i11 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f && !o2()) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if ("audio/ac4".equals(oVar.f1805o) && (pairS = AbstractC0861i.s(oVar)) != null) {
            G1.w.d(mediaFormat, "profile", ((Integer) pairS.first).intValue());
            G1.w.d(mediaFormat, "level", ((Integer) pairS.second).intValue());
        }
        if (this.f9039b1.i(M.k0(4, oVar.f1780G, oVar.f1781H)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f9050m1));
        }
        return mediaFormat;
    }

    @Override // T1.r
    public C1005k u0(T1.p pVar, D1.o oVar, D1.o oVar2) {
        C1005k c1005kE = pVar.e(oVar, oVar2);
        int i10 = c1005kE.f7211e;
        if (k1(oVar2)) {
            i10 |= 32768;
        }
        if (q2(pVar, oVar2) > this.f9041d1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C1005k(pVar.f15959a, oVar, oVar2, i11 != 0 ? 0 : c1005kE.f7210d, i11);
    }

    @Override // T1.r
    public void u1(D1.o oVar, MediaFormat mediaFormat) throws C1030x {
        int i10;
        D1.o oVar2 = this.f9045h1;
        int[] iArrA = null;
        if (oVar2 != null) {
            oVar = oVar2;
        } else if (N0() != null) {
            AbstractC0853a.e(mediaFormat);
            D1.o oVarP = new o.b().y0("audio/raw").s0("audio/raw".equals(oVar.f1805o) ? oVar.f1782I : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? M.i0(mediaFormat.getInteger("v-bits-per-sample")) : 2).d0(oVar.f1783J).e0(oVar.f1784K).r0(oVar.f1802l).Z(oVar.f1803m).j0(oVar.f1791a).l0(oVar.f1792b).m0(oVar.f1793c).n0(oVar.f1794d).A0(oVar.f1795e).w0(oVar.f1796f).T(mediaFormat.getInteger("channel-count")).z0(mediaFormat.getInteger("sample-rate")).P();
            if (this.f9042e1 && oVarP.f1780G == 6 && (i10 = oVar.f1780G) < 6) {
                iArrA = new int[i10];
                for (int i11 = 0; i11 < oVar.f1780G; i11++) {
                    iArrA[i11] = i11;
                }
            } else if (this.f9043f1) {
                iArrA = S.a(oVarP.f1780G);
            }
            oVar = oVarP;
        }
        try {
            if (!j1() || U().f7058a == 0) {
                this.f9039b1.j(0);
            } else {
                this.f9039b1.j(U().f7058a);
            }
            this.f9039b1.l(oVar, 0, iArrA);
        } catch (s.b e10) {
            throw R(e10, e10.f9152a, 5001);
        }
    }

    public void u2() {
        this.f9047j1 = true;
    }

    @Override // K1.G0
    public boolean v() {
        boolean z10 = this.f9049l1;
        this.f9049l1 = false;
        return z10;
    }

    @Override // T1.r
    public void v1(long j10) {
        this.f9039b1.u(j10);
    }

    public final void v2(int i10) {
        T1.k kVar;
        this.f9039b1.g(i10);
        if (Build.VERSION.SDK_INT < 35 || (kVar = this.f9040c1) == null) {
            return;
        }
        kVar.e(i10);
    }

    @Override // T1.r, K1.AbstractC1001i, K1.c1.b
    public void w(int i10, Object obj) {
        if (i10 == 2) {
            this.f9039b1.v(((Float) AbstractC0853a.e(obj)).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f9039b1.q((C0744b) AbstractC0853a.e((C0744b) obj));
            return;
        }
        if (i10 == 6) {
            this.f9039b1.c((C0745c) AbstractC0853a.e((C0745c) obj));
            return;
        }
        if (i10 == 12) {
            b.a(this.f9039b1, obj);
            return;
        }
        if (i10 == 16) {
            this.f9050m1 = ((Integer) AbstractC0853a.e(obj)).intValue();
            w2();
        } else if (i10 == 9) {
            this.f9039b1.z(((Boolean) AbstractC0853a.e(obj)).booleanValue());
        } else if (i10 != 10) {
            super.w(i10, obj);
        } else {
            v2(((Integer) AbstractC0853a.e(obj)).intValue());
        }
    }

    public final void w2() {
        T1.m mVarN0 = N0();
        if (mVarN0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f9050m1));
            mVarN0.setParameters(bundle);
        }
    }

    @Override // T1.r
    public void x1() {
        super.x1();
        this.f9039b1.w();
    }

    public final void x2() {
        long jS = this.f9039b1.s(b());
        if (jS != Long.MIN_VALUE) {
            if (!this.f9047j1) {
                jS = Math.max(this.f9046i1, jS);
            }
            this.f9046i1 = jS;
            this.f9047j1 = false;
        }
    }

    public G(Context context, m.b bVar, T1.u uVar, boolean z10, Handler handler, r rVar, s sVar, T1.k kVar) {
        super(1, bVar, uVar, z10, 44100.0f);
        this.f9037Z0 = context.getApplicationContext();
        this.f9039b1 = sVar;
        this.f9040c1 = kVar;
        this.f9050m1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f9038a1 = new r.a(handler, rVar);
        this.f9052o1 = -9223372036854775807L;
        sVar.y(new c());
    }

    @Override // K1.AbstractC1001i, K1.e1
    public G0 N() {
        return this;
    }
}
