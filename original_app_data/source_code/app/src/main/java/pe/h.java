package pe;

import Od.C1823c;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f42680b;

    public h(String scheme, Map authParams) {
        String lowerCase;
        AbstractC4862t.e(scheme, "scheme");
        AbstractC4862t.e(authParams, "authParams");
        this.f42679a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                AbstractC4862t.d(US, "US");
                lowerCase = str.toLowerCase(US);
                AbstractC4862t.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC4862t.d(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f42680b = mapUnmodifiableMap;
    }

    public final Map a() {
        return this.f42680b;
    }

    public final Charset b() {
        String str = (String) this.f42680b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                AbstractC4862t.d(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return C1823c.f12399g;
    }

    public final String c() {
        return (String) this.f42680b.get("realm");
    }

    public final String d() {
        return this.f42679a;
    }

    public boolean equals(Object obj) {
        return qe.d.a(this, obj);
    }

    public int hashCode() {
        return qe.d.b(this);
    }

    public String toString() {
        return qe.d.c(this);
    }
}
