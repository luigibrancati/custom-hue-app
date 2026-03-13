package ef;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import ef.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class b implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean[] f33976n = {true, true, true, false, true, true, true, true, true, false, true, true, true, true, false, false, false, true, true, true};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f33977o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f33980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Timer f33981d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f33984g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f33978a = {".aac", ".aac", ".opus", "_opus.caf", ".mp3", ".ogg", ".pcm", ".wav", ".aiff", "._pcm.caf", ".flac", ".mp4", ".amr", ".amr", ".pcm", ".pcm", ".webm", ".opus", ".vorbis", ".wav"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f33979b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f33982e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.d f33985h = a.d.PLAYER_IS_STOPPED;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f33986i = -1.0d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f33987j = -2.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f33988k = -1.0d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f33989l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f33990m = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jB;
            try {
                jB = b.this.f33980c.b();
            } catch (Exception e10) {
                System.out.println(e10.toString());
                jB = 0;
            }
            b bVar = b.this;
            bVar.f33985h = a.d.PLAYER_IS_PLAYING;
            bVar.f33984g.c(true, jB);
        }
    }

    /* JADX INFO: renamed from: ef.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0436b extends TimerTask {

        /* JADX INFO: renamed from: ef.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    f fVar = b.this.f33980c;
                    if (fVar != null) {
                        long jA = fVar.a();
                        long jB = b.this.f33980c.b();
                        if (jA > jB) {
                            jA = jB;
                        }
                        b.this.f33984g.h(jA, jB);
                    }
                } catch (Exception e10) {
                    b.this.l("Exception: " + e10.toString());
                    b.this.C();
                }
            }
        }

        public C0436b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b.this.f33982e.post(new a());
        }
    }

    public b(c cVar) {
        this.f33984g = cVar;
    }

    public boolean A(a.b bVar, int i10, boolean z10, int i11, int i12, boolean z11) {
        b bVar2;
        e eVar;
        B();
        try {
            eVar = new e(this);
            this.f33980c = eVar;
            bVar2 = this;
        } catch (Exception unused) {
            bVar2 = this;
        }
        try {
            eVar.k(bVar, null, i11, i10, z10, i12, z11, bVar2);
            bVar2.r();
            return true;
        } catch (Exception unused2) {
            bVar2.m("startPlayer() exception");
            return false;
        }
    }

    public void B() {
        d();
        b();
        this.f33983f = false;
        f fVar = this.f33980c;
        if (fVar != null) {
            fVar.l();
        }
        this.f33980c = null;
    }

    public void C() {
        B();
        this.f33985h = a.d.PLAYER_IS_STOPPED;
        this.f33984g.b(true);
    }

    public void b() {
        Timer timer = this.f33981d;
        if (timer != null) {
            timer.cancel();
        }
        this.f33981d = null;
    }

    public void c() {
        B();
        this.f33985h = a.d.PLAYER_IS_STOPPED;
    }

    public final void d() {
        String strJ = j();
        try {
            File file = new File(strJ);
            if (file.exists()) {
                if (file.delete()) {
                    l("file Deleted :" + strJ);
                    return;
                }
                m("Cannot delete file " + strJ);
            }
        } catch (Exception unused) {
        }
    }

    public int e(byte[] bArr) throws Exception {
        f fVar = this.f33980c;
        if (fVar == null) {
            throw new Exception("feed() : player is null");
        }
        try {
            return fVar.m(bArr);
        } catch (Exception e10) {
            this.m("feed() exception");
            throw e10;
        }
    }

    public int f(ArrayList arrayList) throws Exception {
        f fVar = this.f33980c;
        if (fVar == null) {
            throw new Exception("feed() : player is null");
        }
        try {
            return fVar.n(arrayList);
        } catch (Exception e10) {
            this.m("feed() exception");
            throw e10;
        }
    }

    public int g(ArrayList arrayList) throws Exception {
        f fVar = this.f33980c;
        if (fVar == null) {
            throw new Exception("feed() : player is null");
        }
        try {
            return fVar.o(arrayList);
        } catch (Exception e10) {
            this.m("feed() exception");
            throw e10;
        }
    }

    public a.d h() {
        f fVar = this.f33980c;
        if (fVar == null) {
            return a.d.PLAYER_IS_STOPPED;
        }
        if (!fVar.c()) {
            return this.f33983f ? a.d.PLAYER_IS_PAUSED : a.d.PLAYER_IS_STOPPED;
        }
        if (this.f33983f) {
            throw new RuntimeException();
        }
        return a.d.PLAYER_IS_PLAYING;
    }

    public Map i() {
        long jA;
        long jB;
        f fVar = this.f33980c;
        if (fVar != null) {
            jA = fVar.a();
            jB = this.f33980c.b();
        } else {
            jA = 0;
            jB = 0;
        }
        if (jA > jB) {
            jA = jB;
        }
        HashMap map = new HashMap();
        map.put("position", Long.valueOf(jA));
        map.put("duration", Long.valueOf(jB));
        map.put("playerStatus", Integer.valueOf(h().ordinal()));
        return map;
    }

    public final String j() {
        return ef.a.f33975a.getCacheDir().getPath() + "/flutter_sound_" + this.f33990m;
    }

    public boolean k(a.b bVar) {
        return f33976n[bVar.ordinal()];
    }

    public void l(String str) {
        this.f33984g.a(a.c.DBG, str);
    }

    public void m(String str) {
        this.f33984g.a(a.c.ERROR, str);
    }

    public void n() {
        l("Playback completed.");
        this.f33985h = a.d.PLAYER_IS_PAUSED;
        this.f33984g.q(true);
    }

    public void o() {
        l("mediaPlayer prepared and started");
        this.f33982e.post(new a());
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        return false;
    }

    public boolean p() {
        int i10 = f33977o + 1;
        f33977o = i10;
        this.f33990m = i10;
        this.f33986i = -1.0d;
        this.f33988k = -1.0d;
        this.f33989l = -1L;
        this.f33985h = a.d.PLAYER_IS_STOPPED;
        this.f33984g.f(true);
        return true;
    }

    public boolean q() {
        try {
            b();
            f fVar = this.f33980c;
            if (fVar == null) {
                this.f33984g.p(false);
                return false;
            }
            fVar.d();
            this.f33983f = true;
            this.f33985h = a.d.PLAYER_IS_PAUSED;
            this.f33984g.e(true);
            return true;
        } catch (Exception e10) {
            m("pausePlay exception: " + e10.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r() {
        /*
            r8 = this;
            ef.f r0 = r8.f33980c
            if (r0 != 0) goto L6
            r8 = 0
            return r8
        L6:
            double r0 = r8.f33986i     // Catch: java.lang.Exception -> L3e
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1a
            double r4 = r8.f33987j     // Catch: java.lang.Exception -> L3e
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L1a
            r8.y(r0, r4)     // Catch: java.lang.Exception -> L3e
            goto L21
        L1a:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L21
            r8.x(r0)     // Catch: java.lang.Exception -> L3e
        L21:
            double r0 = r8.f33988k     // Catch: java.lang.Exception -> L3e
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L2a
            r8.u(r0)     // Catch: java.lang.Exception -> L3e
        L2a:
            long r0 = r8.f33979b     // Catch: java.lang.Exception -> L3e
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L35
            r8.w(r0)     // Catch: java.lang.Exception -> L3e
        L35:
            long r0 = r8.f33989l     // Catch: java.lang.Exception -> L3e
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L3e
            r8.t(r0)     // Catch: java.lang.Exception -> L3e
        L3e:
            ef.f r8 = r8.f33980c
            r8.e()
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.b.r():boolean");
    }

    public boolean s() {
        try {
            f fVar = this.f33980c;
            if (fVar == null) {
                return false;
            }
            fVar.f();
            this.f33983f = false;
            this.f33985h = a.d.PLAYER_IS_PLAYING;
            w(this.f33979b);
            this.f33984g.p(true);
            return true;
        } catch (Exception e10) {
            m("mediaPlayer resume: " + e10.getMessage());
            return false;
        }
    }

    public boolean t(long j10) {
        if (this.f33980c == null) {
            this.f33989l = j10;
            return false;
        }
        l("seekTo: " + j10);
        this.f33989l = -1L;
        this.f33980c.g(j10);
        return true;
    }

    public boolean u(double d10) {
        try {
            this.f33988k = d10;
            f fVar = this.f33980c;
            if (fVar == null) {
                return false;
            }
            fVar.h(d10);
            return true;
        } catch (Exception e10) {
            m("setSpeed: " + e10.getMessage());
            return false;
        }
    }

    public void v(long j10) {
        this.f33979b = j10;
        if (this.f33980c != null) {
            w(j10);
        }
    }

    public void w(long j10) {
        b();
        this.f33979b = j10;
        if (this.f33980c == null || j10 == 0 || j10 <= 0) {
            return;
        }
        C0436b c0436b = new C0436b();
        Timer timer = new Timer();
        this.f33981d = timer;
        timer.schedule(c0436b, 0L, j10);
    }

    public boolean x(double d10) {
        try {
            this.f33986i = d10;
            f fVar = this.f33980c;
            if (fVar == null) {
                return false;
            }
            fVar.i(d10);
            return true;
        } catch (Exception e10) {
            m("setVolume: " + e10.getMessage());
            return false;
        }
    }

    public boolean y(double d10, double d11) {
        try {
            this.f33986i = d10;
            this.f33987j = d11;
            f fVar = this.f33980c;
            if (fVar == null) {
                return false;
            }
            fVar.j(d10, d11);
            return true;
        } catch (Exception e10) {
            m("setVolume: " + e10.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean z(ef.a.b r13, java.lang.String r14, byte[] r15, int r16, boolean r17, int r18, int r19) {
        /*
            r12 = this;
            r12.B()
            r0 = 0
            if (r15 == 0) goto L20
            java.lang.String r14 = r12.j()     // Catch: java.lang.Exception -> L1f
            r12.d()     // Catch: java.lang.Exception -> L1f
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L1f
            r1.<init>(r14)     // Catch: java.lang.Exception -> L1f
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L1f
            r14.<init>(r1)     // Catch: java.lang.Exception -> L1f
            r14.write(r15)     // Catch: java.lang.Exception -> L1f
            java.lang.String r14 = r1.getPath()     // Catch: java.lang.Exception -> L1f
            goto L20
        L1f:
            return r0
        L20:
            r15 = 1
            if (r14 != 0) goto L2d
            ef.a$b r1 = ef.a.b.pcm16     // Catch: java.lang.Exception -> L59
            if (r13 == r1) goto L2b
            ef.a$b r1 = ef.a.b.pcmFloat32     // Catch: java.lang.Exception -> L59
            if (r13 != r1) goto L2d
        L2b:
            r1 = r15
            goto L2e
        L2d:
            r1 = r0
        L2e:
            if (r1 == 0) goto L38
            ef.d r2 = new ef.d     // Catch: java.lang.Exception -> L59
            r2.<init>()     // Catch: java.lang.Exception -> L59
            r12.f33980c = r2     // Catch: java.lang.Exception -> L59
            goto L3f
        L38:
            ef.i r2 = new ef.i     // Catch: java.lang.Exception -> L59
            r2.<init>(r12)     // Catch: java.lang.Exception -> L59
            r12.f33980c = r2     // Catch: java.lang.Exception -> L59
        L3f:
            java.lang.String r5 = ef.a.a(r14)     // Catch: java.lang.Exception -> L59
            ef.f r3 = r12.f33980c     // Catch: java.lang.Exception -> L59
            r10 = 0
            r11 = r12
            r4 = r13
            r7 = r16
            r8 = r17
            r6 = r18
            r9 = r19
            r3.k(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L59
            if (r1 == 0) goto L58
            r12.r()     // Catch: java.lang.Exception -> L59
        L58:
            return r15
        L59:
            java.lang.String r13 = "startPlayer() exception"
            r12.m(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.b.z(ef.a$b, java.lang.String, byte[], int, boolean, int, int):boolean");
    }
}
