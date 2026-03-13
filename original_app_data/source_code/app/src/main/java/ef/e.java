package ef;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.SystemClock;
import ef.a;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34004c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f34009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AudioRecord f34010i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f34002a = {1, 10, 0, 0, 9, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 22, 0, 0, 0, 22};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioTrack f34003b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34005d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f34006e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f34007f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34008g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34011j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34012k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f34013l = null;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Thread {
        public a() {
        }

        public void a(byte[] bArr, int i10) {
            if (e.this.f34003b.write(bArr, 0, i10, 1) != i10) {
                System.out.println("feed error: some audio data are lost");
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte[] bArr = new byte[e.this.f34008g];
            while (e.this.f34012k) {
                try {
                    e eVar = e.this;
                    int i10 = eVar.f34010i.read(bArr, 0, eVar.f34008g, 0);
                    if (i10 > 0) {
                        try {
                            a(bArr, i10);
                        } catch (Exception e10) {
                            e.this.f34009h.m("feed error" + e10.getMessage());
                        }
                    } else {
                        e.this.f34009h.m("feed error: ln = 0");
                    }
                } catch (Exception e11) {
                    System.out.println(e11);
                }
            }
            e.this.f34013l = null;
        }
    }

    public e(b bVar) {
        this.f34004c = 0;
        this.f34009h = bVar;
        this.f34004c = ((AudioManager) ef.a.f33975a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).generateAudioSessionId();
    }

    @Override // ef.f
    public long a() {
        return 0L;
    }

    @Override // ef.f
    public long b() {
        return 0L;
    }

    @Override // ef.f
    public boolean c() {
        return this.f34003b.getPlayState() == 3;
    }

    @Override // ef.f
    public void d() {
        this.f34006e = SystemClock.elapsedRealtime();
        this.f34003b.pause();
    }

    @Override // ef.f
    public void e() {
        this.f34003b.play();
    }

    @Override // ef.f
    public void f() {
        if (this.f34006e >= 0) {
            this.f34005d += SystemClock.elapsedRealtime() - this.f34006e;
        }
        this.f34006e = -1L;
        this.f34003b.play();
    }

    @Override // ef.f
    public void g(long j10) {
        this.f34009h.m("seekTo: not implemented");
    }

    @Override // ef.f
    public void h(double d10) {
        this.f34009h.m("setSpeed: not implemented");
    }

    @Override // ef.f
    public void i(double d10) {
        this.f34009h.m("setVolume: not implemented");
    }

    @Override // ef.f
    public void j(double d10, double d11) {
        this.f34009h.m("setVolumePan: not implemented");
    }

    @Override // ef.f
    public void k(a.b bVar, String str, int i10, int i11, boolean z10, int i12, boolean z11, b bVar2) throws Exception {
        r(i10, Integer.valueOf(i11), i12, z11);
        s(a.b.pcm16, Integer.valueOf(i10), Integer.valueOf(i11), i12, Boolean.valueOf(z11));
        this.f34009h = bVar2;
    }

    @Override // ef.f
    public void l() {
        AudioRecord audioRecord = this.f34010i;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                this.f34012k = false;
                this.f34010i.release();
            } catch (Exception unused2) {
            }
            this.f34010i = null;
        }
        AudioTrack audioTrack = this.f34003b;
        if (audioTrack != null) {
            audioTrack.stop();
            this.f34003b.release();
            this.f34003b = null;
        }
    }

    @Override // ef.f
    public int m(byte[] bArr) {
        this.f34009h.m("feed error: not implemented");
        return -1;
    }

    @Override // ef.f
    public int n(ArrayList arrayList) {
        this.f34009h.m("feed error: not implemented");
        return -1;
    }

    @Override // ef.f
    public int o(ArrayList arrayList) {
        this.f34009h.m("feedInt16error: not implemented");
        return -1;
    }

    public boolean q() {
        return L0.a.a(ef.a.f33975a, "android.permission.RECORD_AUDIO") == 0;
    }

    public void r(int i10, Integer num, int i11, boolean z10) {
        this.f34003b = new AudioTrack(new AudioAttributes.Builder().setLegacyStreamType(3).setUsage(1).setContentType(2).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(num.intValue() == 1 ? 4 : 12).build(), i11, 1, this.f34004c);
        this.f34005d = 0L;
        this.f34006e = -1L;
        this.f34007f = SystemClock.elapsedRealtime();
        this.f34009h.o();
    }

    public void s(a.b bVar, Integer num, Integer num2, int i10, Boolean bool) throws Exception {
        if (!q()) {
            throw new Exception("Permission not granted");
        }
        int i11 = num2.intValue() == 1 ? 16 : 12;
        int i12 = this.f34002a[bVar.ordinal()];
        int minBufferSize = AudioRecord.getMinBufferSize(num.intValue(), i11, this.f34002a[bVar.ordinal()]);
        this.f34008g = minBufferSize;
        this.f34008g = Math.max(minBufferSize, i10);
        AudioRecord audioRecord = new AudioRecord(1, num.intValue(), i11, i12, this.f34008g);
        this.f34010i = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new Exception("Cannot initialize the AudioRecord");
        }
        this.f34010i.startRecording();
        this.f34012k = true;
        a aVar = new a();
        this.f34013l = aVar;
        aVar.start();
    }
}
