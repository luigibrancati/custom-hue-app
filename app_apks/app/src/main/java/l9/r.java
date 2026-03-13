package l9;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l8.InterfaceC4964a;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8.b f39989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39990b = Collections.synchronizedMap(new HashMap());

    public r(O8.b bVar) {
        this.f39989a = bVar;
    }

    public void a(String str, com.google.firebase.remoteconfig.internal.b bVar) {
        JSONObject jSONObjectOptJSONObject;
        InterfaceC4964a interfaceC4964a = (InterfaceC4964a) this.f39989a.get();
        if (interfaceC4964a == null) {
            return;
        }
        JSONObject jSONObjectI = bVar.i();
        if (jSONObjectI.length() < 1) {
            return;
        }
        JSONObject jSONObjectG = bVar.g();
        if (jSONObjectG.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectI.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.f39990b) {
                try {
                    if (strOptString.equals(this.f39990b.get(str))) {
                        return;
                    }
                    this.f39990b.put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectG.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    interfaceC4964a.a("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    interfaceC4964a.a("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
