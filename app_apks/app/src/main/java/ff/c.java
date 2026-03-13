package ff;

import ef.a;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class c extends g implements ef.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ef.b f34762b = new ef.b(this);

    public c(MethodCall methodCall) {
    }

    public void A(MethodCall methodCall, MethodChannel.Result result) {
        try {
            result.success(Integer.valueOf(this.f34762b.e((byte[]) methodCall.argument("data"))));
        } catch (Exception e10) {
            a(a.c.ERROR, "feed() exception");
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public void B(MethodCall methodCall, MethodChannel.Result result) {
        try {
            result.success(Integer.valueOf(this.f34762b.f((ArrayList) methodCall.argument("data"))));
        } catch (Exception e10) {
            a(a.c.ERROR, "feed() exception");
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public void C(MethodCall methodCall, MethodChannel.Result result) {
        try {
            result.success(Integer.valueOf(this.f34762b.g((ArrayList) methodCall.argument("data"))));
        } catch (Exception e10) {
            a(a.c.ERROR, "feed() exception");
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public int D() {
        return this.f34762b.h().ordinal();
    }

    public void E(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Integer.valueOf(D()));
    }

    public void F(MethodCall methodCall, MethodChannel.Result result) {
        Map mapI = this.f34762b.i();
        mapI.put("slotNo", Integer.valueOf(this.f34769a));
        result.success(mapI);
    }

    public void G(MethodCall methodCall, MethodChannel.Result result) {
        result.success("");
    }

    public void H(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(this.f34762b.k(a.b.values()[((Integer) methodCall.argument("codec")).intValue()])));
    }

    public void I(MethodCall methodCall, MethodChannel.Result result) {
        if (this.f34762b.p()) {
            result.success(Integer.valueOf(D()));
        } else {
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", "Failure to open session");
        }
    }

    public void J(MethodCall methodCall, MethodChannel.Result result) {
        try {
            if (this.f34762b.q()) {
                result.success(Integer.valueOf(D()));
            } else {
                result.error("ERR_UNKNOWN", "ERR_UNKNOWN", "Pause failure");
            }
        } catch (Exception e10) {
            a(a.c.ERROR, "pausePlay exception: " + e10.getMessage());
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public void K(MethodCall methodCall, MethodChannel.Result result) {
        try {
            if (this.f34762b.s()) {
                result.success(Integer.valueOf(D()));
            } else {
                result.error("ERR_UNKNOWN", "ERR_UNKNOWN", "Resume failure");
            }
        } catch (Exception e10) {
            a(a.c.ERROR, "mediaPlayer resume: " + e10.getMessage());
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public void L(MethodCall methodCall, MethodChannel.Result result) {
        this.f34762b.t(((Integer) methodCall.argument("duration")).intValue());
        result.success(Integer.valueOf(D()));
    }

    public void N(MethodCall methodCall, MethodChannel.Result result) {
        try {
            this.f34762b.u(((Double) methodCall.argument("speed")).doubleValue());
            result.success(Integer.valueOf(D()));
        } catch (Exception e10) {
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public void O(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.argument("duration") != null) {
            this.f34762b.v(((Integer) methodCall.argument("duration")).intValue());
        }
        result.success(Integer.valueOf(D()));
    }

    public void P(MethodCall methodCall, MethodChannel.Result result) {
        try {
            this.f34762b.x(((Double) methodCall.argument("volume")).doubleValue());
            result.success(Integer.valueOf(D()));
        } catch (Exception e10) {
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public void Q(MethodCall methodCall, MethodChannel.Result result) {
        try {
            this.f34762b.y(((Double) methodCall.argument("volume")).doubleValue(), ((Double) methodCall.argument("pan")).doubleValue());
            result.success(Integer.valueOf(D()));
        } catch (Exception e10) {
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public void R(MethodCall methodCall, MethodChannel.Result result) {
        Integer num = (Integer) methodCall.argument("codec");
        a.b bVar = a.b.values()[num != null ? num.intValue() : 0];
        byte[] bArr = (byte[]) methodCall.argument("fromDataBuffer");
        Integer num2 = methodCall.argument("bufferSize") != null ? (Integer) methodCall.argument("bufferSize") : 8192;
        String str = (String) methodCall.argument("fromURI");
        Integer num3 = methodCall.argument("sampleRate") != null ? (Integer) methodCall.argument("sampleRate") : 16000;
        Boolean bool = Boolean.TRUE;
        if (methodCall.argument("interleaved") != null) {
            bool = (Boolean) methodCall.argument("interleaved");
        }
        try {
            if (this.f34762b.z(bVar, str, bArr, (methodCall.argument("numChannels") != null ? (Integer) methodCall.argument("numChannels") : 1).intValue(), bool.booleanValue(), num3.intValue(), num2.intValue())) {
                result.success(Integer.valueOf(D()));
            } else {
                result.error("ERR_UNKNOWN", "ERR_UNKNOWN", "startPlayer() error");
            }
        } catch (Exception e10) {
            a(a.c.ERROR, "startPlayer() exception");
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public void S(MethodCall methodCall, MethodChannel.Result result) {
        boolean z10;
        Integer num = methodCall.argument("bufferSize") != null ? (Integer) methodCall.argument("bufferSize") : 8192;
        Integer num2 = methodCall.argument("sampleRate") != null ? (Integer) methodCall.argument("sampleRate") : 48000;
        Integer num3 = methodCall.argument("numChannels") != null ? (Integer) methodCall.argument("numChannels") : 1;
        if (methodCall.argument("enableVoiceProcessing") != null) {
            z10 = ((Integer) methodCall.argument("enableVoiceProcessing")).intValue() != 0;
        } else {
            z10 = false;
        }
        try {
            if (this.f34762b.A(a.b.pcm16, num3.intValue(), true, num2.intValue(), num.intValue(), z10)) {
                result.success(Integer.valueOf(D()));
            } else {
                result.error("ERR_UNKNOWN", "ERR_UNKNOWN", "startPlayer() error");
            }
        } catch (Exception e10) {
            a(a.c.ERROR, "startPlayerFromMic() exception");
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", e10.getMessage());
        }
    }

    public void T(MethodCall methodCall, MethodChannel.Result result) {
        this.f34762b.C();
        result.success(Integer.valueOf(D()));
    }

    @Override // ef.c
    public void b(boolean z10) {
        u("stopPlayerCompleted", z10, z10);
    }

    @Override // ef.c
    public void c(boolean z10, long j10) {
        HashMap map = new HashMap();
        map.put("duration", Integer.valueOf((int) j10));
        map.put(SentryThread.JsonKeys.STATE, Integer.valueOf(D()));
        w("startPlayerCompleted", z10, map);
    }

    @Override // ef.c
    public void e(boolean z10) {
        u("pausePlayerCompleted", z10, z10);
    }

    @Override // ef.c
    public void f(boolean z10) {
        u("openPlayerCompleted", z10, z10);
    }

    @Override // ef.c
    public void h(long j10, long j11) {
        HashMap map = new HashMap();
        map.put("position", Long.valueOf(j10));
        map.put("duration", Long.valueOf(j11));
        map.put("playerStatus", Integer.valueOf(D()));
        w("updateProgress", true, map);
    }

    @Override // ef.c
    public void p(boolean z10) {
        u("resumePlayerCompleted", z10, z10);
    }

    @Override // ef.c
    public void q(boolean z10) {
        v("audioPlayerFinishedPlaying", true, D());
    }

    @Override // ff.g
    public b r() {
        return d.f34764d;
    }

    @Override // ff.g
    public int s() {
        return D();
    }

    @Override // ff.g
    public void y(MethodCall methodCall, MethodChannel.Result result) {
        this.f34762b.c();
    }

    public void z(MethodCall methodCall, MethodChannel.Result result) {
        this.f34762b.c();
        result.success(Integer.valueOf(D()));
    }

    public void M(MethodCall methodCall, MethodChannel.Result result) {
    }
}
