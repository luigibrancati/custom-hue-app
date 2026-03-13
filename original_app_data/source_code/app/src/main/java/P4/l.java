package P4;

import P4.a;
import P4.n;
import P4.p;
import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f13112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f13113d;

    public l(Context context, a aVar, n nVar, p pVar) {
        this.f13110a = context;
        this.f13111b = aVar;
        this.f13112c = nVar;
        this.f13113d = pVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "checkServiceStatus":
                int i10 = Integer.parseInt(methodCall.arguments.toString());
                p pVar = this.f13113d;
                Context context = this.f13110a;
                Objects.requireNonNull(result);
                pVar.a(i10, context, new p.a() { // from class: P4.c
                    @Override // P4.p.a
                    public final void onSuccess(int i11) {
                        result.success(Integer.valueOf(i11));
                    }
                }, new b() { // from class: P4.d
                    @Override // P4.b
                    public final void a(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            case "shouldShowRequestPermissionRationale":
                int i11 = Integer.parseInt(methodCall.arguments.toString());
                n nVar = this.f13112c;
                Objects.requireNonNull(result);
                nVar.i(i11, new n.c() { // from class: P4.h
                    @Override // P4.n.c
                    public final void a(boolean z10) {
                        result.success(Boolean.valueOf(z10));
                    }
                }, new b() { // from class: P4.i
                    @Override // P4.b
                    public final void a(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            case "checkPermissionStatus":
                int i12 = Integer.parseInt(methodCall.arguments.toString());
                n nVar2 = this.f13112c;
                Objects.requireNonNull(result);
                nVar2.c(i12, new n.a() { // from class: P4.e
                    @Override // P4.n.a
                    public final void onSuccess(int i13) {
                        result.success(Integer.valueOf(i13));
                    }
                });
                break;
            case "openAppSettings":
                a aVar = this.f13111b;
                Context context2 = this.f13110a;
                Objects.requireNonNull(result);
                aVar.a(context2, new a.InterfaceC0167a() { // from class: P4.j
                    @Override // P4.a.InterfaceC0167a
                    public final void a(boolean z10) {
                        result.success(Boolean.valueOf(z10));
                    }
                }, new b() { // from class: P4.k
                    @Override // P4.b
                    public final void a(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            case "requestPermissions":
                List list = (List) methodCall.arguments();
                n nVar3 = this.f13112c;
                Objects.requireNonNull(result);
                nVar3.g(list, new n.b() { // from class: P4.f
                    @Override // P4.n.b
                    public final void a(Map map) {
                        result.success(map);
                    }
                }, new b() { // from class: P4.g
                    @Override // P4.b
                    public final void a(String str2, String str3) {
                        result.error(str2, str3, null);
                    }
                });
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
