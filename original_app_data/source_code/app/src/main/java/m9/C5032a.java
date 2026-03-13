package m9;

import android.util.Log;
import java.util.HashSet;
import k9.p;
import o9.AbstractC5240d;
import o9.AbstractC5241e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: m9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5032a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l9.e f40217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l9.e f40218b;

    public C5032a(l9.e eVar, l9.e eVar2) {
        this.f40217a = eVar;
        this.f40218b = eVar2;
    }

    public static C5032a a(l9.e eVar, l9.e eVar2) {
        return new C5032a(eVar, eVar2);
    }

    public static String d(l9.e eVar, String str) {
        com.google.firebase.remoteconfig.internal.b bVarF = eVar.f();
        if (bVarF == null) {
            return null;
        }
        try {
            return bVarF.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public AbstractC5241e b(com.google.firebase.remoteconfig.internal.b bVar) throws p {
        JSONArray jSONArrayJ = bVar.j();
        long jK = bVar.k();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArrayJ.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArrayJ.getJSONObject(i10);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(AbstractC5240d.a().d(string).f(jSONObject.getString("variantId")).b(strOptString).c(c(strOptString)).e(jK).a());
            } catch (JSONException e10) {
                throw new p("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return AbstractC5241e.a(hashSet);
    }

    public final String c(String str) {
        String strD = d(this.f40217a, str);
        if (strD != null) {
            return strD;
        }
        String strD2 = d(this.f40218b, str);
        return strD2 != null ? strD2 : "";
    }
}
