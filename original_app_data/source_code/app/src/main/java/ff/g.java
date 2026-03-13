package ff;

import ef.a;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.SentryThread;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34769a;

    public void a(a.c cVar, String str) {
        HashMap map = new HashMap();
        map.put("slotNo", Integer.valueOf(this.f34769a));
        map.put(SentryThread.JsonKeys.STATE, Integer.valueOf(s()));
        map.put("level", Integer.valueOf(new int[]{999, 2000, 3000, 4000, 5000, 5999, 9999}[cVar.ordinal()]));
        map.put("msg", "[android]: " + str);
        map.put("success", Boolean.TRUE);
        r().d("log", map);
    }

    public abstract b r();

    public abstract int s();

    public void t(int i10) {
        this.f34769a = i10;
    }

    public void u(String str, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        map.put("slotNo", Integer.valueOf(this.f34769a));
        map.put(SentryThread.JsonKeys.STATE, Integer.valueOf(s()));
        map.put("arg", Boolean.valueOf(z11));
        map.put("success", Boolean.valueOf(z10));
        r().d(str, map);
    }

    public void v(String str, boolean z10, int i10) {
        HashMap map = new HashMap();
        map.put("slotNo", Integer.valueOf(this.f34769a));
        map.put(SentryThread.JsonKeys.STATE, Integer.valueOf(s()));
        map.put("arg", Integer.valueOf(i10));
        map.put("success", Boolean.valueOf(z10));
        r().d(str, map);
    }

    public void w(String str, boolean z10, Map map) {
        map.put("slotNo", Integer.valueOf(this.f34769a));
        map.put(SentryThread.JsonKeys.STATE, Integer.valueOf(s()));
        map.put("success", Boolean.valueOf(z10));
        r().d(str, map);
    }

    public void x(String str, boolean z10, String str2) {
        HashMap map = new HashMap();
        map.put("slotNo", Integer.valueOf(this.f34769a));
        map.put(SentryThread.JsonKeys.STATE, Integer.valueOf(s()));
        map.put("arg", str2);
        map.put("success", Boolean.valueOf(z10));
        r().d(str, map);
    }

    public abstract void y(MethodCall methodCall, MethodChannel.Result result);
}
