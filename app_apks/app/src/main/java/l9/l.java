package l9;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import k9.v;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f39960e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f39961f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f39962g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f39963a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f39964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f39965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f39966d;

    public l(Executor executor, e eVar, e eVar2) {
        this.f39964b = executor;
        this.f39965c = eVar;
        this.f39966d = eVar2;
    }

    public static com.google.firebase.remoteconfig.internal.b e(e eVar) {
        return eVar.f();
    }

    public static Set f(e eVar) {
        HashSet hashSet = new HashSet();
        com.google.firebase.remoteconfig.internal.b bVarE = e(eVar);
        if (bVarE != null) {
            Iterator<String> itKeys = bVarE.g().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public static String g(e eVar, String str) {
        com.google.firebase.remoteconfig.internal.b bVarE = e(eVar);
        if (bVarE == null) {
            return null;
        }
        try {
            return bVarE.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void i(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(B6.d dVar) {
        synchronized (this.f39963a) {
            this.f39963a.add(dVar);
        }
    }

    public final void c(final String str, final com.google.firebase.remoteconfig.internal.b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.f39963a) {
            try {
                for (final B6.d dVar : this.f39963a) {
                    this.f39964b.execute(new Runnable() { // from class: l9.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVar.accept(str, bVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f39965c));
        hashSet.addAll(f(this.f39966d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, h(str));
        }
        return map;
    }

    public v h(String str) {
        String strG = g(this.f39965c, str);
        if (strG != null) {
            c(str, e(this.f39965c));
            return new q(strG, 2);
        }
        String strG2 = g(this.f39966d, str);
        if (strG2 != null) {
            return new q(strG2, 1);
        }
        i(str, "FirebaseRemoteConfigValue");
        return new q("", 0);
    }
}
