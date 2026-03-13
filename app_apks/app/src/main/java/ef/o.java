package ef;

import android.media.MediaRecorder;
import ef.a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class o implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int[] f34062c = {0, 3, 7, 0, 0, 6, 7, 0, 0, 0, 0, 3, 1, 2, 0, 0, 0, 7, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f34063d = {0, 6, 11, 0, 0, 11, 0, 0, 0, 0, 0, 2, 3, 4, 0, 0, 9, 9, 9};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String[] f34064e = {"sound.fs", "sound.aac", "sound.opus", "sound_opus.caf", "sound.mp3", "sound.ogg", "sound.pcm", "sound.wav", "sound.aiff", "sound_pcm.caf", "sound.flac", "sound.mp4", "sound.amr", "sound.amr", "sound.pcm", "sound.pcm", "sound.webm", "sound.opus", "sound.vorbis"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f34065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaRecorder f34066b;

    public o(l lVar) {
        this.f34065a = lVar;
    }

    @Override // ef.n
    public double a() {
        return this.f34066b.getMaxAmplitude();
    }

    @Override // ef.n
    public void b() {
        MediaRecorder mediaRecorder = this.f34066b;
        if (mediaRecorder == null) {
            this.f34065a.a(a.c.DBG, "mediaRecorder is null");
            return;
        }
        try {
            mediaRecorder.resume();
        } catch (Exception unused) {
        }
        try {
            this.f34066b.stop();
            this.f34066b.reset();
            this.f34066b.release();
            this.f34066b = null;
        } catch (Exception unused2) {
            this.f34065a.a(a.c.ERROR, "Error Stop Recorder");
        }
    }

    @Override // ef.n
    public void c(Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, a.b bVar, String str, int i10, k kVar) throws Exception {
        MediaRecorder mediaRecorder = this.f34066b;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
        } else {
            this.f34066b = new MediaRecorder();
        }
        if (!f()) {
            throw new Exception("Check Permission: Recording permission is not granted");
        }
        try {
            this.f34066b.reset();
            this.f34066b.setAudioSource(i10);
            int i11 = f34062c[bVar.ordinal()];
            this.f34066b.setOutputFormat(f34063d[bVar.ordinal()]);
            if (str == null) {
                str = f34064e[bVar.ordinal()];
            }
            this.f34066b.setOutputFile(str);
            this.f34066b.setAudioEncoder(i11);
            if (num != null) {
                this.f34066b.setAudioChannels(num.intValue());
            }
            if (num2 != null) {
                this.f34066b.setAudioSamplingRate(num2.intValue());
            }
            if (num3 != null) {
                this.f34066b.setAudioEncodingBitRate(num3.intValue());
            }
            this.f34066b.prepare();
            this.f34066b.start();
        } catch (Exception e10) {
            this.f34065a.a(a.c.ERROR, "Exception: ");
            try {
                b();
            } catch (Exception unused) {
            }
            throw e10;
        }
    }

    @Override // ef.n
    public boolean d() {
        MediaRecorder mediaRecorder = this.f34066b;
        if (mediaRecorder == null) {
            this.f34065a.a(a.c.DBG, "mediaRecorder is null");
            return false;
        }
        mediaRecorder.resume();
        return true;
    }

    @Override // ef.n
    public boolean e() {
        MediaRecorder mediaRecorder = this.f34066b;
        if (mediaRecorder == null) {
            this.f34065a.a(a.c.DBG, "mediaRecorder is null");
            return false;
        }
        mediaRecorder.pause();
        return true;
    }

    public boolean f() {
        return L0.a.a(a.f33975a, "android.permission.RECORD_AUDIO") == 0;
    }
}
