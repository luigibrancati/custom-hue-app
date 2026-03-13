package M1;

import D1.C0744b;
import G1.AbstractC0853a;
import G1.M;
import M1.B;
import M1.C1201d;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w implements B.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f9215b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static C1201d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return C1201d.f9106d;
            }
            return new C1201d.b().e(true).f(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).g(z10).d();
        }
    }

    public w() {
        this(null);
    }

    @Override // M1.B.d
    public C1201d a(D1.o oVar, C0744b c0744b) {
        AbstractC0853a.e(oVar);
        AbstractC0853a.e(c0744b);
        int i10 = Build.VERSION.SDK_INT;
        if (oVar.f1781H == -1) {
            return C1201d.f9106d;
        }
        boolean zB = b(this.f9214a);
        int iF = D1.v.f((String) AbstractC0853a.e(oVar.f1805o), oVar.f1801k);
        if (iF == 0 || i10 < M.K(iF)) {
            return C1201d.f9106d;
        }
        int iM = M.M(oVar.f1780G);
        if (iM == 0) {
            return C1201d.f9106d;
        }
        try {
            return a.a(M.L(oVar.f1781H, iM, iF), c0744b.a().f1674a, zB);
        } catch (IllegalArgumentException unused) {
            return C1201d.f9106d;
        }
    }

    public final boolean b(Context context) {
        Boolean bool = this.f9215b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = E1.c.c(context).getParameters("offloadVariableRateSupported");
            this.f9215b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f9215b = Boolean.FALSE;
        }
        return this.f9215b.booleanValue();
    }

    public w(Context context) {
        this.f9214a = context == null ? null : context.getApplicationContext();
    }
}
