package L1;

import D1.AbstractC0747e;
import D1.C0753k;
import D1.D;
import D1.G;
import D1.r;
import D1.z;
import G1.AbstractC0853a;
import G1.AbstractC0854b;
import I1.o;
import I1.y;
import K1.C1003j;
import K1.C1030x;
import K7.AbstractC1081v;
import L1.A0;
import L1.InterfaceC1139b;
import M1.s;
import P1.C1837h;
import P1.m;
import T1.r;
import a2.C2609B;
import a2.C2638y;
import a2.InterfaceC2611D;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements InterfaceC1139b, A0.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f8443A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f8444B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8445a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0 f8447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PlaybackSession f8448d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f8455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8456l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public D1.x f8459o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f8460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f8461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f8462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D1.o f8463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public D1.o f8464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public D1.o f8465u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8466v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8468x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8469y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8470z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f8446b = AbstractC0854b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D.c f8450f = new D.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D.b f8451g = new D.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f8453i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f8452h = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8449e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8457m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8458n = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8472b;

        public a(int i10, int i11) {
            this.f8471a = i10;
            this.f8472b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.o f8473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8475c;

        public b(D1.o oVar, int i10, String str) {
            this.f8473a = oVar;
            this.f8474b = i10;
            this.f8475c = str;
        }
    }

    public z0(Context context, PlaybackSession playbackSession) {
        this.f8445a = context.getApplicationContext();
        this.f8448d = playbackSession;
        t0 t0Var = new t0();
        this.f8447c = t0Var;
        t0Var.e(this);
    }

    public static z0 D0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new z0(context, mediaMetricsManager.createPlaybackSession());
    }

    public static int F0(int i10) {
        switch (G1.M.a0(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static C0753k G0(AbstractC1081v abstractC1081v) {
        C0753k c0753k;
        K7.Y it = abstractC1081v.iterator();
        while (it.hasNext()) {
            G.a aVar = (G.a) it.next();
            for (int i10 = 0; i10 < aVar.f1611a; i10++) {
                if (aVar.d(i10) && (c0753k = aVar.a(i10).f1809s) != null) {
                    return c0753k;
                }
            }
        }
        return null;
    }

    public static int H0(C0753k c0753k) {
        for (int i10 = 0; i10 < c0753k.f1727d; i10++) {
            UUID uuid = c0753k.e(i10).f1729b;
            if (uuid.equals(AbstractC0747e.f1687d)) {
                return 3;
            }
            if (uuid.equals(AbstractC0747e.f1688e)) {
                return 2;
            }
            if (uuid.equals(AbstractC0747e.f1686c)) {
                return 6;
            }
        }
        return 1;
    }

    public static a I0(D1.x xVar, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (xVar.f2113a == 1001) {
            return new a(20, 0);
        }
        if (xVar instanceof C1030x) {
            C1030x c1030x = (C1030x) xVar;
            z11 = c1030x.f7345j == 1;
            i10 = c1030x.f7349n;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th = (Throwable) AbstractC0853a.e(xVar.getCause());
        if (!(th instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th instanceof r.c) {
                return new a(13, G1.M.b0(((r.c) th).f16047d));
            }
            if (th instanceof T1.o) {
                return new a(14, ((T1.o) th).f15958c);
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof s.c) {
                return new a(17, ((s.c) th).f9153a);
            }
            if (th instanceof s.f) {
                return new a(18, ((s.f) th).f9158a);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(F0(errorCode), errorCode);
        }
        if (th instanceof I1.s) {
            return new a(5, ((I1.s) th).f5505d);
        }
        if ((th instanceof I1.r) || (th instanceof D1.w)) {
            return new a(z10 ? 10 : 11, 0);
        }
        boolean z12 = th instanceof I1.q;
        if (z12 || (th instanceof y.a)) {
            if (G1.y.e(context).g() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z12 && ((I1.q) th).f5503c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (xVar.f2113a == 1002) {
            return new a(21, 0);
        }
        if (th instanceof m.a) {
            Throwable th2 = (Throwable) AbstractC0853a.e(th.getCause());
            if (!(th2 instanceof MediaDrm.MediaDrmStateException)) {
                return th2 instanceof MediaDrmResetException ? new a(27, 0) : th2 instanceof NotProvisionedException ? new a(24, 0) : th2 instanceof DeniedByServerException ? new a(29, 0) : th2 instanceof P1.J ? new a(23, 0) : th2 instanceof C1837h.e ? new a(28, 0) : new a(30, 0);
            }
            int iB0 = G1.M.b0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
            return new a(F0(iB0), iB0);
        }
        if (!(th instanceof o.a) || !(th.getCause() instanceof FileNotFoundException)) {
            return new a(9, 0);
        }
        Throwable cause2 = ((Throwable) AbstractC0853a.e(th.getCause())).getCause();
        return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
    }

    public static Pair J0(String str) {
        String[] strArrH1 = G1.M.h1(str, "-");
        return Pair.create(strArrH1[0], strArrH1.length >= 2 ? strArrH1[1] : null);
    }

    public static int L0(Context context) {
        switch (G1.y.e(context).g()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int M0(D1.r rVar) {
        r.h hVar = rVar.f1873b;
        if (hVar == null) {
            return 0;
        }
        int iX0 = G1.M.x0(hVar.f1968a, hVar.f1969b);
        if (iX0 == 0) {
            return 3;
        }
        if (iX0 != 1) {
            return iX0 != 2 ? 1 : 4;
        }
        return 5;
    }

    public static int N0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    public final boolean C0(b bVar) {
        return bVar != null && bVar.f8475c.equals(this.f8447c.b());
    }

    public final void E0() {
        PlaybackMetrics.Builder builder = this.f8455k;
        if (builder != null && this.f8444B) {
            builder.setAudioUnderrunCount(this.f8443A);
            this.f8455k.setVideoFramesDropped(this.f8469y);
            this.f8455k.setVideoFramesPlayed(this.f8470z);
            Long l10 = (Long) this.f8452h.get(this.f8454j);
            this.f8455k.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f8453i.get(this.f8454j);
            this.f8455k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f8455k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f8455k.build();
            this.f8446b.execute(new Runnable() { // from class: L1.x0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8435a.f8448d.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.f8455k = null;
        this.f8454j = null;
        this.f8443A = 0;
        this.f8469y = 0;
        this.f8470z = 0;
        this.f8463s = null;
        this.f8464t = null;
        this.f8465u = null;
        this.f8444B = false;
    }

    @Override // L1.InterfaceC1139b
    public void K(InterfaceC1139b.a aVar, C2609B c2609b) {
        if (aVar.f8309d == null) {
            return;
        }
        b bVar = new b((D1.o) AbstractC0853a.e(c2609b.f20516c), c2609b.f20517d, this.f8447c.f(aVar.f8307b, (InterfaceC2611D.b) AbstractC0853a.e(aVar.f8309d)));
        int i10 = c2609b.f20515b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f8461q = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f8462r = bVar;
                return;
            }
        }
        this.f8460p = bVar;
    }

    public LogSessionId K0() {
        return this.f8448d.getSessionId();
    }

    public final void O0(InterfaceC1139b.C0128b c0128b) {
        for (int i10 = 0; i10 < c0128b.d(); i10++) {
            int iB = c0128b.b(i10);
            InterfaceC1139b.a aVarC = c0128b.c(iB);
            if (iB == 0) {
                this.f8447c.c(aVarC);
            } else if (iB == 11) {
                this.f8447c.g(aVarC, this.f8456l);
            } else {
                this.f8447c.a(aVarC);
            }
        }
    }

    public final void P0(long j10) {
        int iL0 = L0(this.f8445a);
        if (iL0 != this.f8458n) {
            this.f8458n = iL0;
            final NetworkEvent networkEventBuild = new NetworkEvent.Builder().setNetworkType(iL0).setTimeSinceCreatedMillis(j10 - this.f8449e).build();
            this.f8446b.execute(new Runnable() { // from class: L1.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8428a.f8448d.reportNetworkEvent(networkEventBuild);
                }
            });
        }
    }

    public final void Q0(long j10) {
        D1.x xVar = this.f8459o;
        if (xVar == null) {
            return;
        }
        a aVarI0 = I0(xVar, this.f8445a, this.f8467w == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f8449e).setErrorCode(aVarI0.f8471a).setSubErrorCode(aVarI0.f8472b).setException(xVar).build();
        this.f8446b.execute(new Runnable() { // from class: L1.w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8431a.f8448d.reportPlaybackErrorEvent(playbackErrorEventBuild);
            }
        });
        this.f8444B = true;
        this.f8459o = null;
    }

    @Override // L1.InterfaceC1139b
    public void R(InterfaceC1139b.a aVar, D1.x xVar) {
        this.f8459o = xVar;
    }

    public final void R0(D1.z zVar, InterfaceC1139b.C0128b c0128b, long j10) {
        if (zVar.W() != 2) {
            this.f8466v = false;
        }
        if (zVar.m0() == null) {
            this.f8468x = false;
        } else if (c0128b.a(10)) {
            this.f8468x = true;
        }
        int iZ0 = Z0(zVar);
        if (this.f8457m != iZ0) {
            this.f8457m = iZ0;
            this.f8444B = true;
            final PlaybackStateEvent playbackStateEventBuild = new PlaybackStateEvent.Builder().setState(this.f8457m).setTimeSinceCreatedMillis(j10 - this.f8449e).build();
            this.f8446b.execute(new Runnable() { // from class: L1.y0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8439a.f8448d.reportPlaybackStateEvent(playbackStateEventBuild);
                }
            });
        }
    }

    public final void S0(D1.z zVar, InterfaceC1139b.C0128b c0128b, long j10) {
        if (c0128b.a(2)) {
            D1.G gP0 = zVar.p0();
            boolean zB = gP0.b(2);
            boolean zB2 = gP0.b(1);
            boolean zB3 = gP0.b(3);
            if (zB || zB2 || zB3) {
                if (!zB) {
                    X0(j10, null, 0);
                }
                if (!zB2) {
                    T0(j10, null, 0);
                }
                if (!zB3) {
                    V0(j10, null, 0);
                }
            }
        }
        if (C0(this.f8460p)) {
            b bVar = this.f8460p;
            D1.o oVar = bVar.f8473a;
            if (oVar.f1813w != -1) {
                X0(j10, oVar, bVar.f8474b);
                this.f8460p = null;
            }
        }
        if (C0(this.f8461q)) {
            b bVar2 = this.f8461q;
            T0(j10, bVar2.f8473a, bVar2.f8474b);
            this.f8461q = null;
        }
        if (C0(this.f8462r)) {
            b bVar3 = this.f8462r;
            V0(j10, bVar3.f8473a, bVar3.f8474b);
            this.f8462r = null;
        }
    }

    public final void T0(long j10, D1.o oVar, int i10) {
        if (Objects.equals(this.f8464t, oVar)) {
            return;
        }
        if (this.f8464t == null && i10 == 0) {
            i10 = 1;
        }
        this.f8464t = oVar;
        Y0(0, j10, oVar, i10);
    }

    public final void U0(D1.z zVar, InterfaceC1139b.C0128b c0128b) {
        C0753k c0753kG0;
        if (c0128b.a(0)) {
            InterfaceC1139b.a aVarC = c0128b.c(0);
            if (this.f8455k != null) {
                W0(aVarC.f8307b, aVarC.f8309d);
            }
        }
        if (c0128b.a(2) && this.f8455k != null && (c0753kG0 = G0(zVar.p0().a())) != null) {
            ((PlaybackMetrics.Builder) G1.M.i(this.f8455k)).setDrmType(H0(c0753kG0));
        }
        if (c0128b.a(1011)) {
            this.f8443A++;
        }
    }

    public final void V0(long j10, D1.o oVar, int i10) {
        if (Objects.equals(this.f8465u, oVar)) {
            return;
        }
        if (this.f8465u == null && i10 == 0) {
            i10 = 1;
        }
        this.f8465u = oVar;
        Y0(2, j10, oVar, i10);
    }

    @Override // L1.InterfaceC1139b
    public void W(InterfaceC1139b.a aVar, D1.K k10) {
        b bVar = this.f8460p;
        if (bVar != null) {
            D1.o oVar = bVar.f8473a;
            if (oVar.f1813w == -1) {
                this.f8460p = new b(oVar.b().F0(k10.f1622a).h0(k10.f1623b).P(), bVar.f8474b, bVar.f8475c);
            }
        }
    }

    public final void W0(D1.D d10, InterfaceC2611D.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.f8455k;
        if (bVar == null || (iB = d10.b(bVar.f20522a)) == -1) {
            return;
        }
        d10.f(iB, this.f8451g);
        d10.n(this.f8451g.f1452c, this.f8450f);
        builder.setStreamType(M0(this.f8450f.f1475c));
        D.c cVar = this.f8450f;
        if (cVar.f1485m != -9223372036854775807L && !cVar.f1483k && !cVar.f1481i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f8450f.d());
        }
        builder.setPlaybackType(this.f8450f.f() ? 2 : 1);
        this.f8444B = true;
    }

    public final void X0(long j10, D1.o oVar, int i10) {
        if (Objects.equals(this.f8463s, oVar)) {
            return;
        }
        if (this.f8463s == null && i10 == 0) {
            i10 = 1;
        }
        this.f8463s = oVar;
        Y0(1, j10, oVar, i10);
    }

    public final void Y0(int i10, long j10, D1.o oVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f8449e);
        if (oVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(N0(i11));
            String str = oVar.f1804n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = oVar.f1805o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = oVar.f1801k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = oVar.f1800j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = oVar.f1812v;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = oVar.f1813w;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = oVar.f1780G;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = oVar.f1781H;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = oVar.f1794d;
            if (str4 != null) {
                Pair pairJ0 = J0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairJ0.first);
                Object obj = pairJ0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = oVar.f1816z;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f8444B = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f8446b.execute(new Runnable() { // from class: L1.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8422a.f8448d.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    public final int Z0(D1.z zVar) {
        int iW = zVar.W();
        if (this.f8466v) {
            return 5;
        }
        if (this.f8468x) {
            return 13;
        }
        if (iW == 4) {
            return 11;
        }
        if (iW == 2) {
            int i10 = this.f8457m;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (zVar.v0()) {
                return zVar.t0() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iW == 3) {
            if (zVar.v0()) {
                return zVar.t0() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iW != 1 || this.f8457m == 0) {
            return this.f8457m;
        }
        return 12;
    }

    @Override // L1.InterfaceC1139b
    public void a(D1.z zVar, InterfaceC1139b.C0128b c0128b) {
        if (c0128b.d() == 0) {
            return;
        }
        O0(c0128b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        U0(zVar, c0128b);
        Q0(jElapsedRealtime);
        S0(zVar, c0128b, jElapsedRealtime);
        P0(jElapsedRealtime);
        R0(zVar, c0128b, jElapsedRealtime);
        if (c0128b.a(1028)) {
            this.f8447c.d(c0128b.c(1028));
        }
    }

    @Override // L1.A0.a
    public void b(InterfaceC1139b.a aVar, String str, boolean z10) {
        InterfaceC2611D.b bVar = aVar.f8309d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f8454j)) {
            E0();
        }
        this.f8452h.remove(str);
        this.f8453i.remove(str);
    }

    @Override // L1.InterfaceC1139b
    public void c(InterfaceC1139b.a aVar, int i10, long j10, long j11) {
        InterfaceC2611D.b bVar = aVar.f8309d;
        if (bVar != null) {
            String strF = this.f8447c.f(aVar.f8307b, (InterfaceC2611D.b) AbstractC0853a.e(bVar));
            Long l10 = (Long) this.f8453i.get(strF);
            Long l11 = (Long) this.f8452h.get(strF);
            this.f8453i.put(strF, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f8452h.put(strF, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // L1.InterfaceC1139b
    public void k0(InterfaceC1139b.a aVar, z.e eVar, z.e eVar2, int i10) {
        if (i10 == 1) {
            this.f8466v = true;
        }
        this.f8456l = i10;
    }

    @Override // L1.InterfaceC1139b
    public void o(InterfaceC1139b.a aVar, C2638y c2638y, C2609B c2609b, IOException iOException, boolean z10) {
        this.f8467w = c2609b.f20514a;
    }

    @Override // L1.InterfaceC1139b
    public void s(InterfaceC1139b.a aVar, C1003j c1003j) {
        this.f8469y += c1003j.f7101g;
        this.f8470z += c1003j.f7099e;
    }

    @Override // L1.A0.a
    public void v0(InterfaceC1139b.a aVar, String str) {
        InterfaceC2611D.b bVar = aVar.f8309d;
        if (bVar == null || !bVar.b()) {
            E0();
            this.f8454j = str;
            this.f8455k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            W0(aVar.f8307b, aVar.f8309d);
        }
    }

    @Override // L1.A0.a
    public void T(InterfaceC1139b.a aVar, String str) {
    }

    @Override // L1.A0.a
    public void D(InterfaceC1139b.a aVar, String str, String str2) {
    }
}
