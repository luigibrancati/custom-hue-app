package ff;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MethodChannel f34760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f34761b;

    public g a(MethodCall methodCall) {
        int iIntValue = ((Integer) methodCall.argument("slotNo")).intValue();
        if (iIntValue < 0 || iIntValue > this.f34761b.size()) {
            throw new RuntimeException();
        }
        if (iIntValue == this.f34761b.size()) {
            this.f34761b.add(iIntValue, null);
        }
        return (g) this.f34761b.get(iIntValue);
    }

    public void b(MethodChannel methodChannel) {
        if (this.f34761b == null) {
            this.f34761b = new ArrayList();
        }
        this.f34760a = methodChannel;
    }

    public void c(MethodCall methodCall, g gVar) {
        int iIntValue = ((Integer) methodCall.argument("slotNo")).intValue();
        this.f34761b.set(iIntValue, gVar);
        gVar.t(iIntValue);
    }

    public void d(String str, Map map) {
        this.f34760a.invokeMethod(str, map);
    }

    public void e(MethodCall methodCall, MethodChannel.Result result) {
        for (int i10 = 0; i10 < this.f34761b.size(); i10++) {
            if (this.f34761b.get(i10) != null) {
                ((g) this.f34761b.get(i10)).y(methodCall, result);
            }
            this.f34761b = new ArrayList();
        }
        result.success(0);
    }
}
