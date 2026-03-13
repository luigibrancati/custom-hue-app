package com.google.firebase.remoteconfig.internal;

import B6.j;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import io.sentry.protocol.SentryThread;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.p;
import k9.q;
import k9.t;
import org.apache.tika.metadata.HttpHeaders;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f31893h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f31898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f31900g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        this.f31894a = context;
        this.f31895b = str;
        this.f31896c = str2;
        this.f31897d = f(str);
        this.f31898e = str3;
        this.f31899f = j10;
        this.f31900g = j11;
    }

    public static b e(JSONObject jSONObject, Date date) throws p {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            b.C0373b c0373bE = b.l().e(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                c0373bE = c0373bE.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                c0373bE = c0373bE.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                c0373bE = c0373bE.f(jSONObject3);
            }
            String string = jSONObject.has("templateVersion") ? jSONObject.getString("templateVersion") : null;
            if (string != null) {
                c0373bE.h(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray("rolloutMetadata");
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                c0373bE = c0373bE.g(jSONArray2);
            }
            return c0373bE.a();
        } catch (JSONException e10) {
            throw new p("Fetch failed: fetch response could not be parsed.", e10);
        }
    }

    public static String f(String str) {
        Matcher matcher = f31893h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public final boolean a(JSONObject jSONObject) {
        try {
            return true ^ jSONObject.get(SentryThread.JsonKeys.STATE).equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    public final String b(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j10));
    }

    public final JSONObject c(String str, String str2, Map map, Long l10, Map map2) throws p {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new p("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f31895b);
        Locale locale = this.f31894a.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i10 = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i10));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f31894a.getPackageManager().getPackageInfo(this.f31894a.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(M0.a.a(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", this.f31894a.getPackageName());
        map3.put("sdkVersion", "23.0.1");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l10 != null) {
            map3.put("firstOpenTime", b(l10.longValue()));
        }
        return new JSONObject(map3);
    }

    public HttpURLConnection d() {
        try {
            return (HttpURLConnection) new URL(h(this.f31897d, this.f31898e)).openConnection();
        } catch (IOException e10) {
            throw new q(e10.getMessage());
        }
    }

    @Keep
    public c.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date, Map<String, String> map3) {
        m(httpURLConnection, str3, str2, map2);
        try {
            try {
                l(httpURLConnection, c(str, str2, map, l10, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new t(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectG = g(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                b bVarE = e(jSONObjectG, date);
                return !a(jSONObjectG) ? c.a.a(date, bVarE) : c.a.b(bVarE, headerField);
            } catch (IOException | JSONException e10) {
                throw new p("The client had an error while calling the backend!", e10);
            }
        } finally {
        }
    }

    public final JSONObject g(URLConnection uRLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read();
            if (i10 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i10);
        }
    }

    public final String h(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    public final String i() {
        try {
            Context context = this.f31894a;
            byte[] bArrA = B6.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return j.b(bArrA, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f31894a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f31894a.getPackageName(), e10);
            return null;
        }
    }

    public final void j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f31896c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f31894a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final void k(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void l(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final void m(HttpURLConnection httpURLConnection, String str, String str2, Map map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f31899f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f31900g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        j(httpURLConnection, str2);
        k(httpURLConnection, map);
    }
}
