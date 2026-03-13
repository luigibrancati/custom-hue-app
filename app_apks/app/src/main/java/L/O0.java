package L;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class O0 extends k1 {
    public O0(Map map) {
        super(map);
    }

    public static O0 g() {
        return new O0(new ArrayMap());
    }

    public static O0 h(k1 k1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : k1Var.e()) {
            arrayMap.put(str, k1Var.d(str));
        }
        return new O0(arrayMap);
    }

    public void f(k1 k1Var) {
        Map map;
        Map map2 = this.f8110a;
        if (map2 == null || (map = k1Var.f8110a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void i(String str, Object obj) {
        this.f8110a.put(str, obj);
    }
}
