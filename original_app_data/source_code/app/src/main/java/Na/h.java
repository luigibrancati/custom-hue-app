package Na;

import La.C;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class h {
    public static Map a(e eVar) {
        C cE = eVar.e();
        if (cE == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("sql", cE.c());
        map.put("arguments", cE.b());
        return map;
    }
}
