package L;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f8109b = new k1(new ArrayMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8110a;

    public k1(Map map) {
        this.f8110a = map;
    }

    public static k1 a(Pair pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new k1(arrayMap);
    }

    public static k1 b() {
        return f8109b;
    }

    public static k1 c(k1 k1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : k1Var.e()) {
            arrayMap.put(str, k1Var.d(str));
        }
        return new k1(arrayMap);
    }

    public Object d(String str) {
        return this.f8110a.get(str);
    }

    public Set e() {
        return this.f8110a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
