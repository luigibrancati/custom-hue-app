package w4;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import q4.C5488d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f46182a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f46183b = new LinkedHashMap();

    public final String a(String str) {
        String lowerCase;
        if (str != null) {
            Locale locale = Locale.getDefault();
            AbstractC4862t.d(locale, "getDefault(...)");
            lowerCase = str.toLowerCase(locale);
            AbstractC4862t.d(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase == null || lowerCase.length() == 0 || AbstractC4862t.a(lowerCase, "$default_instance")) {
            return "com.amplitude.api";
        }
        return "com.amplitude.api_" + lowerCase;
    }

    public final c b(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        D4.b bVarL = amplitude.l();
        AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        C5488d c5488d = (C5488d) bVarL;
        String strA = a(c5488d.l());
        Map map = f46183b;
        c cVar = (c) map.get(strA);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(c5488d.C(), strA, c5488d.m().a(amplitude));
        map.put(strA, cVar2);
        return cVar2;
    }
}
