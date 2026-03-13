package i1;

import android.content.SharedPreferences;
import gc.C4179C;
import gc.P;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: i1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4319d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f36830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f36831b;

    public C4319d(SharedPreferences prefs, Set set) {
        AbstractC4862t.e(prefs, "prefs");
        this.f36830a = prefs;
        this.f36831b = set;
    }

    public final String a(String str) {
        Set set = this.f36831b;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(("Can't access key outside migration: " + str).toString());
    }

    public final Map b() {
        Map<String, ?> all = this.f36830a.getAll();
        AbstractC4862t.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.f36831b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = C4179C.Z0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final long c(String key, long j10) {
        AbstractC4862t.e(key, "key");
        return this.f36830a.getLong(a(key), j10);
    }

    public final String d(String key, String str) {
        AbstractC4862t.e(key, "key");
        return this.f36830a.getString(a(key), str);
    }

    public final Set e(String key, Set set) {
        AbstractC4862t.e(key, "key");
        Set<String> stringSet = this.f36830a.getStringSet(a(key), set);
        if (stringSet != null) {
            return C4179C.Y0(stringSet);
        }
        return null;
    }
}
