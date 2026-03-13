package C8;

import C8.d;
import org.json.JSONObject;
import u8.G;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b implements i {
    public static d b(G g10) {
        return new d(g10.getCurrentTimeMillis() + ((long) 3600000), new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // C8.i
    public d a(G g10, JSONObject jSONObject) {
        return b(g10);
    }
}
