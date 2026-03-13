package M1;

import D1.C0744b;
import G1.M;
import M1.B;
import M1.s;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class F implements B.f {
    @Override // M1.B.f
    public final AudioTrack a(s.a aVar, C0744b c0744b, int i10, Context context) {
        return c(aVar, c0744b, i10, context);
    }

    public final AudioTrack c(s.a aVar, C0744b c0744b, int i10, Context context) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(c0744b, aVar.f9149d)).setAudioFormat(M.L(aVar.f9147b, aVar.f9148c, aVar.f9146a)).setTransferMode(1).setBufferSizeInBytes(aVar.f9151f).setSessionId(i10);
        int i11 = Build.VERSION.SDK_INT;
        g(sessionId, aVar.f9150e);
        if (i11 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return d(sessionId).build();
    }

    public final AudioAttributes e(C0744b c0744b, boolean z10) {
        return z10 ? f() : c0744b.a().f1674a;
    }

    public final AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public final void g(AudioTrack.Builder builder, boolean z10) {
        builder.setOffloadedPlayback(z10);
    }

    public AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }
}
