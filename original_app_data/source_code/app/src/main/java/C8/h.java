package C8;

import org.json.JSONObject;
import u8.G;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f1195a;

    public h(G g10) {
        this.f1195a = g10;
    }

    public static i a(int i10) {
        if (i10 == 3) {
            return new m();
        }
        r8.g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f1195a, jSONObject);
    }
}
