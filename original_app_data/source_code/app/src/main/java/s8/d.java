package s8;

import android.os.Bundle;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import r8.g;
import t8.InterfaceC5858a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d implements InterfaceC5811b, t8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC5858a f44325a;

    public static String b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(Constants.PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }

    @Override // t8.b
    public void a(InterfaceC5858a interfaceC5858a) {
        this.f44325a = interfaceC5858a;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // s8.InterfaceC5811b
    public void onEvent(String str, Bundle bundle) {
        InterfaceC5858a interfaceC5858a = this.f44325a;
        if (interfaceC5858a != null) {
            try {
                interfaceC5858a.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
