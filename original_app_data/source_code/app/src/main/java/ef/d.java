package ef;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import ef.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33995b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioTrack f33994a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f33996c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f33997d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f33998e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f33999f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.b f34000g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34001h = true;

    public d() {
        this.f33995b = 0;
        this.f33995b = ((AudioManager) a.f33975a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).generateAudioSessionId();
    }

    @Override // ef.f
    public long a() {
        long jElapsedRealtime;
        long j10;
        long j11 = this.f33997d;
        if (j11 >= 0) {
            jElapsedRealtime = j11 - this.f33998e;
            j10 = this.f33996c;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime() - this.f33998e;
            j10 = this.f33996c;
        }
        return jElapsedRealtime - j10;
    }

    @Override // ef.f
    public long b() {
        return a();
    }

    @Override // ef.f
    public boolean c() {
        return this.f33994a.getPlayState() == 3;
    }

    @Override // ef.f
    public void d() {
        this.f33997d = SystemClock.elapsedRealtime();
        this.f33994a.pause();
    }

    @Override // ef.f
    public void e() {
        this.f33994a.play();
    }

    @Override // ef.f
    public void f() {
        if (this.f33997d >= 0) {
            this.f33996c += SystemClock.elapsedRealtime() - this.f33997d;
        }
        this.f33997d = -1L;
        this.f33994a.play();
    }

    @Override // ef.f
    public void h(double d10) {
        float f10 = (float) d10;
        try {
            PlaybackParams playbackParams = this.f33994a.getPlaybackParams();
            playbackParams.setSpeed(f10);
            this.f33994a.setPlaybackParams(playbackParams);
        } catch (Exception e10) {
            this.f33999f.m("setSpeed: error " + e10.getMessage());
            this.f33999f.m("setSpeed: not supported");
        }
    }

    @Override // ef.f
    public void i(double d10) {
        this.f33994a.setVolume((float) d10);
    }

    @Override // ef.f
    public void j(double d10, double d11) {
        float f10;
        float f11;
        double dMax = Math.max(-1.0f, Math.min(1.0f, (float) d11));
        if (dMax < 0.0d) {
            float f12 = (float) d10;
            f10 = f12 * 1.0f;
            f11 = f12 * (((float) dMax) + 1.0f);
        } else if (dMax > 0.0d) {
            float f13 = (float) d10;
            f10 = (1.0f - ((float) dMax)) * f13;
            f11 = f13 * 1.0f;
        } else {
            f10 = ((float) d10) * 1.0f;
            f11 = f10;
        }
        this.f33994a.setStereoVolume(f10, f11);
    }

    @Override // ef.f
    public void k(a.b bVar, String str, int i10, int i11, boolean z10, int i12, boolean z11, b bVar2) {
        AudioFormat audioFormatBuild;
        this.f34000g = bVar;
        this.f34001h = z10;
        this.f33999f = bVar2;
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setLegacyStreamType(3).setUsage(1).setContentType(2).build();
        if (bVar == a.b.pcmFloat32) {
            audioFormatBuild = new AudioFormat.Builder().setEncoding(4).setSampleRate(i10).setChannelMask(i11 == 1 ? 4 : 12).build();
        } else {
            audioFormatBuild = new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11 == 1 ? 4 : 12).build();
        }
        this.f33994a = new AudioTrack(audioAttributesBuild, audioFormatBuild, i12, 1, this.f33995b);
        this.f33996c = 0L;
        this.f33997d = -1L;
        this.f33998e = SystemClock.elapsedRealtime();
        bVar2.o();
    }

    @Override // ef.f
    public void l() {
        AudioTrack audioTrack = this.f33994a;
        if (audioTrack != null) {
            audioTrack.stop();
            this.f33994a.release();
            this.f33994a = null;
        }
    }

    @Override // ef.f
    public int m(byte[] bArr) {
        if (this.f34000g != a.b.pcmFloat32) {
            this.f33994a.write(bArr, 0, bArr.length, 0);
            return 1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferWrap.asFloatBuffer();
        float[] fArr = new float[bArr.length / 4];
        floatBufferAsFloatBuffer.get(fArr);
        this.f33994a.write(fArr, 0, bArr.length / 4, 0);
        return 1;
    }

    @Override // ef.f
    public int n(ArrayList arrayList) {
        int size = arrayList.size();
        int length = ((float[]) arrayList.get(0)).length;
        int i10 = size * length;
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < size; i11++) {
            float[] fArr2 = (float[]) arrayList.get(i11);
            for (int i12 = 0; i12 < length; i12++) {
                fArr[(i12 * size) + i11] = fArr2[i12];
            }
        }
        return this.f33994a.write(fArr, 0, i10, 0);
    }

    @Override // ef.f
    public int o(ArrayList arrayList) {
        int size = arrayList.size();
        int length = ((byte[]) arrayList.get(0)).length;
        int i10 = size * length;
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < size; i11++) {
            byte[] bArr2 = (byte[]) arrayList.get(i11);
            if (bArr2.length != length) {
                return 0;
            }
            for (int i12 = 0; i12 < length / 2; i12++) {
                int i13 = ((i12 * size) + i11) * 2;
                int i14 = i12 * 2;
                bArr[i13] = bArr2[i14];
                bArr[i13 + 1] = bArr2[i14 + 1];
            }
        }
        this.f33994a.write(bArr, 0, i10, 0);
        return 1;
    }

    @Override // ef.f
    public void g(long j10) {
    }
}
