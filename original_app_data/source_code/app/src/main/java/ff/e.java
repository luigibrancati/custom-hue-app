package ff;

import ef.a;
import ef.k;
import ef.l;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class e extends g implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean[] f34765c = {false, false, false, false, false, false, true, true, false, false, false, false, false, false};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f34766b = new k(this);

    public e(MethodCall methodCall) {
    }

    public void A(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(this.f34766b.e((String) methodCall.argument("path"))));
    }

    public void B(MethodCall methodCall, MethodChannel.Result result) {
        result.success(this.f34766b.v((String) methodCall.argument("path")));
    }

    public void C(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(this.f34766b.g(a.b.values()[((Integer) methodCall.argument("codec")).intValue()])));
    }

    public void D(MethodCall methodCall, MethodChannel.Result result) {
        if (this.f34766b.k()) {
            result.success("openRecorder");
        } else {
            result.error("ERR_UNKNOWN", "ERR_UNKNOWN", "Failure to open session");
        }
    }

    public void E(MethodCall methodCall, MethodChannel.Result result) {
        this.f34766b.l();
        result.success("Recorder is paused");
    }

    public void F(MethodCall methodCall, MethodChannel.Result result) {
        this.f34766b.p();
        result.success("Recorder is resumed");
    }

    public void H(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.argument("duration") == null) {
            return;
        }
        int iIntValue = ((Integer) methodCall.argument("duration")).intValue();
        this.f34766b.q(iIntValue);
        result.success("setSubscriptionDuration: " + iIntValue);
    }

    public void I(MethodCall methodCall, MethodChannel.Result result) {
        Integer num = (Integer) methodCall.argument("sampleRate");
        Integer num2 = (Integer) methodCall.argument("numChannels");
        Integer num3 = (Integer) methodCall.argument("bitRate");
        Integer num4 = (Integer) methodCall.argument("bufferSize");
        a.b bVar = a.b.values()[((Integer) methodCall.argument("codec")).intValue()];
        String str = (String) methodCall.argument("path");
        a.EnumC0435a enumC0435a = a.EnumC0435a.values()[((Integer) methodCall.argument("audioSource")).intValue()];
        boolean zBooleanValue = ((Boolean) methodCall.argument("toStream")).booleanValue();
        Boolean bool = (Boolean) methodCall.argument("interleaved");
        bool.booleanValue();
        if (this.f34766b.s(bVar, num, num2, bool, num3, num4, str, enumC0435a, zBooleanValue)) {
            result.success("Media Recorder is started");
        } else {
            result.error("startRecorder", "startRecorder", "Failure to start recorder");
        }
    }

    public void J(MethodCall methodCall, MethodChannel.Result result) {
        this.f34766b.u();
        result.success("Media Recorder is closed");
    }

    @Override // ef.l
    public void d(double d10, long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("dbPeakLevel", Double.valueOf(d10));
        w("updateRecorderProgress", true, map);
    }

    @Override // ef.l
    public void g(ArrayList arrayList) {
        HashMap map = new HashMap();
        map.put("data", arrayList);
        w("recordingDataFloat32", true, map);
    }

    @Override // ef.l
    public void i(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("data", bArr);
        w("recordingData", true, map);
    }

    @Override // ef.l
    public void j(boolean z10) {
        u("startRecorderCompleted", z10, z10);
    }

    @Override // ef.l
    public void k(boolean z10) {
        u("openRecorderCompleted", z10, z10);
    }

    @Override // ef.l
    public void l(boolean z10) {
        u("resumeRecorderCompleted", z10, z10);
    }

    @Override // ef.l
    public void m(boolean z10) {
        u("pauseRecorderCompleted", z10, z10);
    }

    @Override // ef.l
    public void n(ArrayList arrayList) {
        HashMap map = new HashMap();
        map.put("data", arrayList);
        w("recordingDataInt16", true, map);
    }

    @Override // ef.l
    public void o(boolean z10, String str) {
        x("stopRecorderCompleted", z10, str);
    }

    @Override // ff.g
    public b r() {
        return f.f34768d;
    }

    @Override // ff.g
    public int s() {
        return this.f34766b.f().ordinal();
    }

    @Override // ff.g
    public void y(MethodCall methodCall, MethodChannel.Result result) {
        this.f34766b.d();
    }

    public void z(MethodCall methodCall, MethodChannel.Result result) {
        this.f34766b.d();
        result.success("closeRecorder");
    }

    public void G(MethodCall methodCall, MethodChannel.Result result) {
    }
}
