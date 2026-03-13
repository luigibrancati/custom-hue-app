package Na;

import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class c extends Na.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10593b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10594c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f10597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f10598d;

        public a() {
        }

        @Override // Na.f
        public void error(String str, String str2, Object obj) {
            this.f10596b = str;
            this.f10597c = str2;
            this.f10598d = obj;
        }

        @Override // Na.f
        public void success(Object obj) {
            this.f10595a = obj;
        }
    }

    public c(Map map, boolean z10) {
        this.f10592a = map;
        this.f10594c = z10;
    }

    @Override // Na.e
    public Object a(String str) {
        return this.f10592a.get(str);
    }

    @Override // Na.e
    public boolean c(String str) {
        return this.f10592a.containsKey(str);
    }

    @Override // Na.b, Na.e
    public boolean f() {
        return this.f10594c;
    }

    @Override // Na.e
    public String getMethod() {
        return (String) this.f10592a.get("method");
    }

    @Override // Na.a
    public f l() {
        return this.f10593b;
    }

    public Map m() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("code", this.f10593b.f10596b);
        map2.put("message", this.f10593b.f10597c);
        map2.put("data", this.f10593b.f10598d);
        map.put("error", map2);
        return map;
    }

    public Map n() {
        HashMap map = new HashMap();
        map.put(FeatureFlag.JsonKeys.RESULT, this.f10593b.f10595a);
        return map;
    }

    public void o(MethodChannel.Result result) {
        a aVar = this.f10593b;
        result.error(aVar.f10596b, aVar.f10597c, aVar.f10598d);
    }

    public void p(List list) {
        if (f()) {
            return;
        }
        list.add(m());
    }

    public void q(List list) {
        if (f()) {
            return;
        }
        list.add(n());
    }
}
