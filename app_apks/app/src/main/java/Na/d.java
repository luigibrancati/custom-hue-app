package Na;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d extends Na.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MethodCall f10601b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MethodChannel.Result f10602a;

        public a(MethodChannel.Result result) {
            this.f10602a = result;
        }

        @Override // Na.f
        public void error(String str, String str2, Object obj) {
            this.f10602a.error(str, str2, obj);
        }

        @Override // Na.f
        public void success(Object obj) {
            this.f10602a.success(obj);
        }
    }

    public d(MethodCall methodCall, MethodChannel.Result result) {
        this.f10601b = methodCall;
        this.f10600a = new a(result);
    }

    @Override // Na.e
    public Object a(String str) {
        return this.f10601b.argument(str);
    }

    @Override // Na.e
    public boolean c(String str) {
        return this.f10601b.hasArgument(str);
    }

    @Override // Na.e
    public String getMethod() {
        return this.f10601b.method;
    }

    @Override // Na.a
    public f l() {
        return this.f10600a;
    }
}
