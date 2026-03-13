package ef;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.util.Log;
import ef.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaPlayer f34017a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f34018b;

    public i(b bVar) {
        this.f34018b = bVar;
    }

    @Override // ef.f
    public long a() {
        return this.f34017a.getCurrentPosition();
    }

    @Override // ef.f
    public long b() {
        return this.f34017a.getDuration();
    }

    @Override // ef.f
    public boolean c() {
        return this.f34017a.isPlaying();
    }

    @Override // ef.f
    public void d() throws Exception {
        MediaPlayer mediaPlayer = this.f34017a;
        if (mediaPlayer == null) {
            throw new Exception("pausePlayer()");
        }
        mediaPlayer.pause();
    }

    @Override // ef.f
    public void e() {
        this.f34017a.start();
    }

    @Override // ef.f
    public void f() throws Exception {
        MediaPlayer mediaPlayer = this.f34017a;
        if (mediaPlayer == null) {
            throw new Exception("resumePlayer");
        }
        if (mediaPlayer.isPlaying()) {
            throw new Exception("resumePlayer");
        }
        this.f34017a.start();
    }

    @Override // ef.f
    public void g(long j10) {
        this.f34017a.seekTo((int) j10);
    }

    @Override // ef.f
    public void h(double d10) {
        float f10 = (float) d10;
        try {
            PlaybackParams playbackParams = this.f34017a.getPlaybackParams();
            playbackParams.setSpeed(f10);
            this.f34017a.setPlaybackParams(playbackParams);
        } catch (Exception e10) {
            Log.e("_setSpeed", "_setSpeed: ", e10);
        }
    }

    @Override // ef.f
    public void i(double d10) {
        float f10 = (float) d10;
        this.f34017a.setVolume(f10, f10);
    }

    @Override // ef.f
    public void j(double d10, double d11) {
        double dMax = Math.max(0.0d, Math.min(d10, 1.0d));
        double dMax2 = Math.max(-1.0d, Math.min(d11, 1.0d));
        this.f34017a.setVolume((float) ((dMax2 <= 0.0d ? 1.0d : 1.0d - dMax2) * dMax), (float) (dMax * (dMax2 < 0.0d ? 1.0d + dMax2 : 1.0d)));
    }

    @Override // ef.f
    public void k(a.b bVar, String str, int i10, int i11, boolean z10, int i12, boolean z11, b bVar2) throws Exception {
        this.f34018b = bVar2;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f34017a = mediaPlayer;
        if (str == null) {
            throw new Exception("path is NULL");
        }
        mediaPlayer.setDataSource(str);
        this.f34017a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: ef.g
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                this.f34015a.r(mediaPlayer2);
            }
        });
        this.f34017a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ef.h
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                this.f34016a.s(mediaPlayer2);
            }
        });
        this.f34017a.setOnErrorListener(this.f34018b);
        this.f34017a.prepareAsync();
    }

    @Override // ef.f
    public void l() {
        MediaPlayer mediaPlayer = this.f34017a;
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.stop();
        } catch (Exception unused) {
        }
        try {
            this.f34017a.reset();
        } catch (Exception unused2) {
        }
        try {
            this.f34017a.release();
        } catch (Exception unused3) {
        }
        this.f34017a = null;
    }

    @Override // ef.f
    public int m(byte[] bArr) throws Exception {
        throw new Exception("Cannot feed a Media Player");
    }

    @Override // ef.f
    public int n(ArrayList arrayList) throws Exception {
        throw new Exception("Cannot feed a Media Player");
    }

    @Override // ef.f
    public int o(ArrayList arrayList) throws Exception {
        throw new Exception("Cannot feed a Media Player");
    }

    public final /* synthetic */ void r(MediaPlayer mediaPlayer) {
        this.f34018b.r();
        this.f34018b.o();
    }

    public final /* synthetic */ void s(MediaPlayer mediaPlayer) {
        this.f34018b.n();
    }
}
