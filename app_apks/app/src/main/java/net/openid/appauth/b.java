package net.openid.appauth;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Map;
import ke.C4840b;
import ke.InterfaceC4842d;
import ke.i;
import ke.k;
import ke.m;
import ke.o;
import ke.p;
import ke.q;
import ke.r;
import ke.s;
import le.C4997b;
import me.InterfaceC5054a;
import ne.AbstractC5177b;
import ne.C5176a;
import net.openid.appauth.a;
import net.openid.appauth.e;
import net.openid.appauth.g;
import org.apache.tika.metadata.HttpHeaders;
import org.json.JSONException;
import org.json.JSONObject;
import u.C5889d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f40913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4840b f40914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le.e f40915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4997b f40916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40917e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f40918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f40919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC5054a f40920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC0545b f40921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public k f40922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f40923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public net.openid.appauth.a f40924g;

        public a(r rVar, i iVar, InterfaceC5054a interfaceC5054a, k kVar, InterfaceC0545b interfaceC0545b, Boolean bool) {
            this.f40918a = rVar;
            this.f40919b = iVar;
            this.f40920c = interfaceC5054a;
            this.f40922e = kVar;
            this.f40921d = interfaceC0545b;
            this.f40923f = bool.booleanValue();
        }

        public final void a(URLConnection uRLConnection) {
            if (TextUtils.isEmpty(uRLConnection.getRequestProperty("Accept"))) {
                uRLConnection.setRequestProperty("Accept", "application/json");
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStream;
            InputStream inputStream2 = null;
            try {
                try {
                    HttpURLConnection httpURLConnectionA = this.f40920c.a(this.f40918a.f39750a.f40926b);
                    httpURLConnectionA.setRequestMethod("POST");
                    httpURLConnectionA.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
                    a(httpURLConnectionA);
                    httpURLConnectionA.setDoOutput(true);
                    Map mapA = this.f40919b.a(this.f40918a.f39752c);
                    if (mapA != null) {
                        for (Map.Entry entry : mapA.entrySet()) {
                            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    Map mapB = this.f40918a.b();
                    Map mapB2 = this.f40919b.b(this.f40918a.f39752c);
                    if (mapB2 != null) {
                        mapB.putAll(mapB2);
                    }
                    String strB = AbstractC5177b.b(mapB);
                    httpURLConnectionA.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(strB.length()));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnectionA.getOutputStream());
                    outputStreamWriter.write(strB);
                    outputStreamWriter.flush();
                    InputStream errorStream = (httpURLConnectionA.getResponseCode() < 200 || httpURLConnectionA.getResponseCode() >= 300) ? httpURLConnectionA.getErrorStream() : httpURLConnectionA.getInputStream();
                    try {
                        JSONObject jSONObject = new JSONObject(s.b(errorStream));
                        s.a(errorStream);
                        return jSONObject;
                    } catch (IOException e10) {
                        inputStream = errorStream;
                        e = e10;
                        C5176a.b(e, "Failed to complete exchange request", new Object[0]);
                        this.f40924g = net.openid.appauth.a.l(a.b.f40897d, e);
                        s.a(inputStream);
                        return null;
                    } catch (JSONException e11) {
                        inputStream = errorStream;
                        e = e11;
                        C5176a.b(e, "Failed to complete exchange request", new Object[0]);
                        this.f40924g = net.openid.appauth.a.l(a.b.f40899f, e);
                        s.a(inputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = errorStream;
                        s.a(inputStream2);
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                    inputStream = null;
                } catch (JSONException e13) {
                    e = e13;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(JSONObject jSONObject) {
            net.openid.appauth.a aVarL;
            net.openid.appauth.a aVar = this.f40924g;
            if (aVar != null) {
                this.f40921d.a(null, aVar);
                return;
            }
            if (jSONObject.has("error")) {
                try {
                    String string = jSONObject.getString("error");
                    aVarL = net.openid.appauth.a.k(a.c.a(string), string, jSONObject.optString("error_description", null), AbstractC5177b.e(jSONObject.optString("error_uri")));
                } catch (JSONException e10) {
                    aVarL = net.openid.appauth.a.l(a.b.f40899f, e10);
                }
                this.f40921d.a(null, aVarL);
                return;
            }
            try {
                g gVarA = new g.a(this.f40918a).b(jSONObject).a();
                String str = gVarA.f40993e;
                if (str != null) {
                    try {
                        try {
                            e.a(str).c(this.f40918a, this.f40922e, this.f40923f);
                        } catch (net.openid.appauth.a e11) {
                            this.f40921d.a(null, e11);
                            return;
                        }
                    } catch (e.a | JSONException e12) {
                        this.f40921d.a(null, net.openid.appauth.a.l(a.b.f40902i, e12));
                        return;
                    }
                }
                C5176a.a("Token exchange with %s completed", this.f40918a.f39750a.f40926b);
                this.f40921d.a(gVarA, null);
            } catch (JSONException e13) {
                this.f40921d.a(null, net.openid.appauth.a.l(a.b.f40899f, e13));
            }
        }
    }

    /* JADX INFO: renamed from: net.openid.appauth.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0545b {
        void a(g gVar, net.openid.appauth.a aVar);
    }

    public b(Context context) {
        this(context, C4840b.f39665d);
    }

    public final void a() {
        if (this.f40917e) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    public C5889d.e b(Uri... uriArr) {
        a();
        return this.f40915c.e(uriArr);
    }

    public void c() {
        if (this.f40917e) {
            return;
        }
        this.f40915c.f();
        this.f40917e = true;
    }

    public Intent d(ke.g gVar) {
        return e(gVar, b(new Uri[0]).a());
    }

    public Intent e(ke.g gVar, C5889d c5889d) {
        return AuthorizationManagementActivity.d0(this.f40913a, gVar, j(gVar, c5889d));
    }

    public Intent f(m mVar) {
        return g(mVar, b(new Uri[0]).a());
    }

    public Intent g(m mVar, C5889d c5889d) {
        return AuthorizationManagementActivity.d0(this.f40913a, mVar, j(mVar, c5889d));
    }

    public void h(r rVar, i iVar, InterfaceC0545b interfaceC0545b) {
        a();
        C5176a.a("Initiating code exchange request to %s", rVar.f39750a.f40926b);
        new a(rVar, iVar, this.f40914b.b(), q.f39748a, interfaceC0545b, Boolean.valueOf(this.f40914b.c())).execute(new Void[0]);
    }

    public void i(r rVar, InterfaceC0545b interfaceC0545b) {
        h(rVar, o.f39747a, interfaceC0545b);
    }

    public final Intent j(InterfaceC4842d interfaceC4842d, C5889d c5889d) {
        a();
        if (this.f40916d == null) {
            throw new ActivityNotFoundException();
        }
        Uri uri = interfaceC4842d.toUri();
        Intent intent = this.f40916d.f40096d.booleanValue() ? c5889d.f45000a : new Intent("android.intent.action.VIEW");
        intent.setPackage(this.f40916d.f40093a);
        intent.setData(uri);
        C5176a.a("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.f40916d.f40096d.toString());
        return intent;
    }

    public b(Context context, C4840b c4840b) {
        this(context, c4840b, le.d.d(context, c4840b.a()), new le.e(context));
    }

    public b(Context context, C4840b c4840b, C4997b c4997b, le.e eVar) {
        this.f40917e = false;
        this.f40913a = (Context) p.d(context);
        this.f40914b = c4840b;
        this.f40915c = eVar;
        this.f40916d = c4997b;
        if (c4997b == null || !c4997b.f40096d.booleanValue()) {
            return;
        }
        eVar.c(c4997b.f40093a);
    }
}
