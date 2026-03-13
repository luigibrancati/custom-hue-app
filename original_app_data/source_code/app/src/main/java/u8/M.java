package u8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import u8.N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class M implements N {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f45288g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f45289h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f45290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f45291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P8.h f45293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H f45294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public N.a f45295f;

    public M(Context context, String str, P8.h hVar, H h10) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f45291b = context;
        this.f45292c = str;
        this.f45293d = hVar;
        this.f45294e = h10;
        this.f45290a = new O();
    }

    public static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public static String e(String str) {
        return f45288g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @Override // u8.N
    public synchronized N.a a() {
        if (!n()) {
            return this.f45295f;
        }
        r8.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = C5992i.q(this.f45291b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        r8.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f45294e.d()) {
            L lD = d(false);
            r8.g.f().i("Fetched Firebase Installation ID: " + lD.b());
            if (lD.b() == null) {
                lD = new L(string == null ? c() : string, null);
            }
            if (Objects.equals(lD.b(), string)) {
                this.f45295f = N.a.a(l(sharedPreferencesQ), lD);
            } else {
                this.f45295f = N.a.a(b(lD.b(), sharedPreferencesQ), lD);
            }
        } else if (k(string)) {
            this.f45295f = N.a.b(l(sharedPreferencesQ));
        } else {
            this.f45295f = N.a.b(b(c(), sharedPreferencesQ));
        }
        r8.g.f().i("Install IDs: " + this.f45295f);
        return this.f45295f;
    }

    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        r8.g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    public L d(boolean z10) {
        String strB;
        v8.i.e();
        String str = null;
        if (z10) {
            try {
                strB = ((P8.m) Tasks.a(this.f45293d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                r8.g.f().l("Error getting Firebase authentication token.", e10);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) Tasks.a(this.f45293d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            r8.g.f().l("Error getting Firebase installation id.", e11);
        }
        return new L(str, strB);
    }

    public String f() {
        return this.f45292c;
    }

    public String g() {
        return this.f45290a.a(this.f45291b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String str) {
        return str.replaceAll(f45289h, "");
    }

    public final boolean n() {
        N.a aVar = this.f45295f;
        if (aVar != null) {
            return aVar.e() == null && this.f45294e.d();
        }
        return true;
    }
}
