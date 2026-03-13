package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import c9.h;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.util.n;
import e9.C3971c;
import e9.C3972d;
import h9.k;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    public static Object a(n nVar, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        h hVarC = h.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            return uRLConnectionA instanceof HttpsURLConnection ? new C3972d((HttpsURLConnection) uRLConnectionA, lVar, hVarC).getContent() : uRLConnectionA instanceof HttpURLConnection ? new C3971c((HttpURLConnection) uRLConnectionA, lVar, hVarC).getContent() : uRLConnectionA.getContent();
        } catch (IOException e10) {
            hVarC.n(jE);
            hVarC.t(lVar.c());
            hVarC.v(nVar.toString());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    public static Object b(n nVar, Class[] clsArr, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        h hVarC = h.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            return uRLConnectionA instanceof HttpsURLConnection ? new C3972d((HttpsURLConnection) uRLConnectionA, lVar, hVarC).getContent(clsArr) : uRLConnectionA instanceof HttpURLConnection ? new C3971c((HttpURLConnection) uRLConnectionA, lVar, hVarC).getContent(clsArr) : uRLConnectionA.getContent(clsArr);
        } catch (IOException e10) {
            hVarC.n(jE);
            hVarC.t(lVar.c());
            hVarC.v(nVar.toString());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    public static InputStream c(n nVar, k kVar, l lVar) throws IOException {
        if (!k.k().u()) {
            return nVar.a().getInputStream();
        }
        lVar.g();
        long jE = lVar.e();
        h hVarC = h.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            return uRLConnectionA instanceof HttpsURLConnection ? new C3972d((HttpsURLConnection) uRLConnectionA, lVar, hVarC).getInputStream() : uRLConnectionA instanceof HttpURLConnection ? new C3971c((HttpURLConnection) uRLConnectionA, lVar, hVarC).getInputStream() : uRLConnectionA.getInputStream();
        } catch (IOException e10) {
            hVarC.n(jE);
            hVarC.t(lVar.c());
            hVarC.v(nVar.toString());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return a(new n(url), k.k(), new l());
    }

    @Keep
    public static Object instrument(Object obj) {
        return obj instanceof HttpsURLConnection ? new C3972d((HttpsURLConnection) obj, new l(), h.c(k.k())) : obj instanceof HttpURLConnection ? new C3971c((HttpURLConnection) obj, new l(), h.c(k.k())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return c(new n(url), k.k(), new l());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return b(new n(url), clsArr, k.k(), new l());
    }
}
