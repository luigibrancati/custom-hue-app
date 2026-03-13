package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import c9.h;
import com.google.firebase.perf.util.l;
import e9.f;
import h9.k;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfHttpClient {
    public static Object a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = e9.h.a(httpRequest);
            if (lA != null) {
                hVarC.m(lA.longValue());
            }
            lVar.g();
            hVarC.n(lVar.e());
            return httpClient.execute(httpHost, httpRequest, new f(responseHandler, lVar, hVarC));
        } catch (IOException e10) {
            hVarC.t(lVar.c());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    public static Object b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = e9.h.a(httpRequest);
            if (lA != null) {
                hVarC.m(lA.longValue());
            }
            lVar.g();
            hVarC.n(lVar.e());
            return httpClient.execute(httpHost, httpRequest, new f(responseHandler, lVar, hVarC), httpContext);
        } catch (IOException e10) {
            hVarC.t(lVar.c());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    public static Object c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.v(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = e9.h.a(httpUriRequest);
            if (lA != null) {
                hVarC.m(lA.longValue());
            }
            lVar.g();
            hVarC.n(lVar.e());
            return httpClient.execute(httpUriRequest, new f(responseHandler, lVar, hVarC));
        } catch (IOException e10) {
            hVarC.t(lVar.c());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    public static Object d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.v(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = e9.h.a(httpUriRequest);
            if (lA != null) {
                hVarC.m(lA.longValue());
            }
            lVar.g();
            hVarC.n(lVar.e());
            return httpClient.execute(httpUriRequest, new f(responseHandler, lVar, hVarC), httpContext);
        } catch (IOException e10) {
            hVarC.t(lVar.c());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    public static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = e9.h.a(httpRequest);
            if (lA != null) {
                hVarC.m(lA.longValue());
            }
            lVar.g();
            hVarC.n(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            hVarC.t(lVar.c());
            hVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = e9.h.a(httpResponseExecute);
            if (lA2 != null) {
                hVarC.q(lA2.longValue());
            }
            String strB = e9.h.b(httpResponseExecute);
            if (strB != null) {
                hVarC.o(strB);
            }
            hVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            hVarC.t(lVar.c());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new l(), k.k());
    }

    public static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.v(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = e9.h.a(httpRequest);
            if (lA != null) {
                hVarC.m(lA.longValue());
            }
            lVar.g();
            hVarC.n(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            hVarC.t(lVar.c());
            hVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = e9.h.a(httpResponseExecute);
            if (lA2 != null) {
                hVarC.q(lA2.longValue());
            }
            String strB = e9.h.b(httpResponseExecute);
            if (strB != null) {
                hVarC.o(strB);
            }
            hVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            hVarC.t(lVar.c());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    public static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.v(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = e9.h.a(httpUriRequest);
            if (lA != null) {
                hVarC.m(lA.longValue());
            }
            lVar.g();
            hVarC.n(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            hVarC.t(lVar.c());
            hVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = e9.h.a(httpResponseExecute);
            if (lA2 != null) {
                hVarC.q(lA2.longValue());
            }
            String strB = e9.h.b(httpResponseExecute);
            if (strB != null) {
                hVarC.o(strB);
            }
            hVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            hVarC.t(lVar.c());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    public static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, l lVar, k kVar) throws IOException {
        h hVarC = h.c(kVar);
        try {
            hVarC.v(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = e9.h.a(httpUriRequest);
            if (lA != null) {
                hVarC.m(lA.longValue());
            }
            lVar.g();
            hVarC.n(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            hVarC.t(lVar.c());
            hVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = e9.h.a(httpResponseExecute);
            if (lA2 != null) {
                hVarC.q(lA2.longValue());
            }
            String strB = e9.h.b(httpResponseExecute);
            if (strB != null) {
                hVarC.o(strB);
            }
            hVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            hVarC.t(lVar.c());
            e9.h.d(hVarC);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return (T) c(httpClient, httpUriRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), k.k());
    }
}
