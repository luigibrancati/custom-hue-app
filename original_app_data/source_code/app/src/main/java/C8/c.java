package C8;

import android.text.TextUtils;
import io.sentry.ProfileChunk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import u8.C5983B;
import z8.C6551a;
import z8.C6552b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6552b f1168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r8.g f1169c;

    public c(String str, C6552b c6552b) {
        this(str, c6552b, r8.g.f());
    }

    @Override // C8.l
    public JSONObject a(k kVar, boolean z10) {
        v8.i.d();
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapF = f(kVar);
            C6551a c6551aB = b(d(mapF), kVar);
            this.f1169c.b("Requesting settings from " + this.f1167a);
            this.f1169c.i("Settings query params were: " + mapF);
            return g(c6551aB.c());
        } catch (IOException e10) {
            this.f1169c.e("Settings request failed.", e10);
            return null;
        }
    }

    public final C6551a b(C6551a c6551a, k kVar) {
        c(c6551a, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f1196a);
        c(c6551a, "X-CRASHLYTICS-API-CLIENT-TYPE", ProfileChunk.PLATFORM_ANDROID);
        c(c6551a, "X-CRASHLYTICS-API-CLIENT-VERSION", C5983B.s());
        c(c6551a, "Accept", "application/json");
        c(c6551a, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f1197b);
        c(c6551a, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f1198c);
        c(c6551a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f1199d);
        c(c6551a, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f1200e.a().c());
        return c6551a;
    }

    public final void c(C6551a c6551a, String str, String str2) {
        if (str2 != null) {
            c6551a.d(str, str2);
        }
    }

    public C6551a d(Map map) {
        return this.f1168b.a(this.f1167a, map).d("User-Agent", "Crashlytics Android SDK/" + C5983B.s()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f1169c.l("Failed to parse settings JSON from " + this.f1167a, e10);
            this.f1169c.k("Settings response " + str);
            return null;
        }
    }

    public final Map f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f1203h);
        map.put("display_version", kVar.f1202g);
        map.put("source", Integer.toString(kVar.f1204i));
        String str = kVar.f1201f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject g(z8.c cVar) {
        int iB = cVar.b();
        this.f1169c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f1169c.d("Settings request failed; (status: " + iB + ") from " + this.f1167a);
        return null;
    }

    public boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    public c(String str, C6552b c6552b, r8.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f1169c = gVar;
        this.f1168b = c6552b;
        this.f1167a = str;
    }
}
