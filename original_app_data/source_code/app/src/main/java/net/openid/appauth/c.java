package net.openid.appauth;

import android.net.Uri;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import ke.p;
import ke.s;
import me.InterfaceC5054a;
import ne.C5176a;
import net.openid.appauth.a;
import net.openid.appauth.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f40925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f40926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f40927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f40928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f40929e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f40930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC5054a f40931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f40932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public net.openid.appauth.a f40933d = null;

        public a(Uri uri, InterfaceC5054a interfaceC5054a, b bVar) {
            this.f40930a = uri;
            this.f40931b = interfaceC5054a;
            this.f40932c = bVar;
        }

        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0032: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:51), block:B:8:0x0032 */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStream;
            InputStream inputStream2;
            InputStream inputStream3 = null;
            try {
                try {
                    HttpURLConnection httpURLConnectionA = this.f40931b.a(this.f40930a);
                    httpURLConnectionA.setRequestMethod("GET");
                    httpURLConnectionA.setDoInput(true);
                    httpURLConnectionA.connect();
                    inputStream = httpURLConnectionA.getInputStream();
                } catch (IOException e10) {
                    e = e10;
                    inputStream = null;
                } catch (d.a e11) {
                    e = e11;
                    inputStream = null;
                } catch (JSONException e12) {
                    e = e12;
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    s.a(inputStream3);
                    throw th;
                }
                try {
                    c cVar = new c(new d(new JSONObject(s.b(inputStream))));
                    s.a(inputStream);
                    return cVar;
                } catch (IOException e13) {
                    e = e13;
                    C5176a.d(e, "Network error when retrieving discovery document", new Object[0]);
                    this.f40933d = net.openid.appauth.a.l(a.b.f40897d, e);
                    s.a(inputStream);
                    return null;
                } catch (d.a e14) {
                    e = e14;
                    C5176a.d(e, "Malformed discovery document", new Object[0]);
                    this.f40933d = net.openid.appauth.a.l(a.b.f40894a, e);
                    s.a(inputStream);
                    return null;
                } catch (JSONException e15) {
                    e = e15;
                    C5176a.d(e, "Error parsing discovery document", new Object[0]);
                    this.f40933d = net.openid.appauth.a.l(a.b.f40899f, e);
                    s.a(inputStream);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream3 = inputStream2;
                s.a(inputStream3);
                throw th;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(c cVar) {
            net.openid.appauth.a aVar = this.f40933d;
            if (aVar != null) {
                this.f40932c.a(null, aVar);
            } else {
                this.f40932c.a(cVar, null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(c cVar, net.openid.appauth.a aVar);
    }

    public c(Uri uri, Uri uri2, Uri uri3, Uri uri4) {
        this.f40925a = (Uri) p.d(uri);
        this.f40926b = (Uri) p.d(uri2);
        this.f40928d = uri3;
        this.f40927c = uri4;
        this.f40929e = null;
    }

    public static Uri a(Uri uri) {
        return uri.buildUpon().appendPath(".well-known").appendPath("openid-configuration").build();
    }

    public static void b(Uri uri, b bVar, InterfaceC5054a interfaceC5054a) {
        c(a(uri), bVar, interfaceC5054a);
    }

    public static void c(Uri uri, b bVar, InterfaceC5054a interfaceC5054a) {
        p.e(uri, "openIDConnectDiscoveryUri cannot be null");
        p.e(bVar, "callback cannot be null");
        p.e(interfaceC5054a, "connectionBuilder must not be null");
        new a(uri, interfaceC5054a, bVar).execute(new Void[0]);
    }

    public static c d(JSONObject jSONObject) throws JSONException {
        p.e(jSONObject, "json object cannot be null");
        if (!jSONObject.has("discoveryDoc")) {
            p.a(jSONObject.has("authorizationEndpoint"), "missing authorizationEndpoint");
            p.a(jSONObject.has("tokenEndpoint"), "missing tokenEndpoint");
            return new c(f.h(jSONObject, "authorizationEndpoint"), f.h(jSONObject, "tokenEndpoint"), f.i(jSONObject, "registrationEndpoint"), f.i(jSONObject, "endSessionEndpoint"));
        }
        try {
            return new c(new d(jSONObject.optJSONObject("discoveryDoc")));
        } catch (d.a e10) {
            throw new JSONException("Missing required field in discovery doc: " + e10.a());
        }
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        f.l(jSONObject, "authorizationEndpoint", this.f40925a.toString());
        f.l(jSONObject, "tokenEndpoint", this.f40926b.toString());
        Uri uri = this.f40928d;
        if (uri != null) {
            f.l(jSONObject, "registrationEndpoint", uri.toString());
        }
        Uri uri2 = this.f40927c;
        if (uri2 != null) {
            f.l(jSONObject, "endSessionEndpoint", uri2.toString());
        }
        d dVar = this.f40929e;
        if (dVar != null) {
            f.m(jSONObject, "discoveryDoc", dVar.f40971a);
        }
        return jSONObject;
    }

    public c(d dVar) {
        p.e(dVar, "docJson cannot be null");
        this.f40929e = dVar;
        this.f40925a = dVar.c();
        this.f40926b = dVar.g();
        this.f40928d = dVar.f();
        this.f40927c = dVar.d();
    }
}
