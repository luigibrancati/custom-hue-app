package J4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final Object a(Object obj) {
        if (obj instanceof JSONObject) {
            return g((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return f((JSONArray) obj);
        }
        if (obj instanceof BigDecimal) {
            return Double.valueOf(((BigDecimal) obj).doubleValue());
        }
        if (AbstractC4862t.a(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    public static final Object b(Object obj) {
        return obj instanceof Map ? e((Map) obj) : obj instanceof Collection ? c((Collection) obj) : obj instanceof Object[] ? d((Object[]) obj) : obj;
    }

    public static final JSONArray c(Collection collection) {
        if (collection == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(b(it.next()));
        }
        return jSONArray;
    }

    public static final JSONArray d(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator itA = AbstractC4846c.a(objArr);
        while (itA.hasNext()) {
            jSONArray.put(b(itA.next()));
        }
        return jSONArray;
    }

    public static final JSONObject e(Map map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                jSONObject.put(str, b(entry.getValue()));
            }
        }
        return jSONObject;
    }

    public static final List f(JSONArray jSONArray) {
        AbstractC4862t.e(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public static final Map g(JSONObject jSONObject) {
        AbstractC4862t.e(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC4862t.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            AbstractC4862t.b(next);
            linkedHashMap.put(next, a(jSONObject.get(next)));
        }
        return linkedHashMap;
    }
}
