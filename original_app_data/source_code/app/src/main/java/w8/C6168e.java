package w8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u8.C5992i;

/* JADX INFO: renamed from: w8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6168e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f46338a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46340c;

    public C6168e(int i10, int i11) {
        this.f46339b = i10;
        this.f46340c = i11;
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f46338a));
    }

    public final String b(String str) {
        if (str != null) {
            return c(str, this.f46340c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f46338a.size() >= this.f46339b && !this.f46338a.containsKey(strB)) {
            r8.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f46339b);
            return false;
        }
        String strC = c(str2, this.f46340c);
        if (C5992i.z((String) this.f46338a.get(strB), strC)) {
            return false;
        }
        Map map = this.f46338a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = b((String) entry.getKey());
                if (this.f46338a.size() < this.f46339b || this.f46338a.containsKey(strB)) {
                    String str = (String) entry.getValue();
                    this.f46338a.put(strB, str == null ? "" : c(str, this.f46340c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                r8.g.f().k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f46339b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
