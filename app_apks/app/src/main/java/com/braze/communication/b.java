package com.braze.communication;

import Od.C1823c;
import android.net.TrafficStats;
import com.braze.support.BrazeLogger;
import com.braze.support.q;
import fc.C4015H;
import gc.Q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import sc.o;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f27518b = (int) TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27519a;

    public b(int i10) {
        this.f27519a = i10;
    }

    public final d a(final com.braze.requests.util.d requestTarget, HashMap requestHeaders, JSONObject payload) {
        AbstractC4862t.e(requestTarget, "requestTarget");
        AbstractC4862t.e(requestHeaders, "requestHeaders");
        AbstractC4862t.e(payload, "payload");
        TrafficStats.setThreadStatsTag(1337);
        URL url = requestTarget.f28349c;
        Map mapI = Q.i();
        int responseCode = -1;
        try {
            HttpURLConnection httpURLConnectionA = a(url, payload, requestHeaders);
            responseCode = httpURLConnectionA.getResponseCode();
            Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
            AbstractC4862t.d(headerFields, "getHeaderFields(...)");
            mapI = q.a(headerFields);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.a(httpURLConnectionA), C1823c.f12394b), 8192);
            try {
                String strD = o.d(bufferedReader);
                sc.c.a(bufferedReader, null);
                return new d(responseCode, mapI, new JSONObject(strD));
            } finally {
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: T4.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.communication.b.a(requestTarget);
                }
            }, 4, (Object) null);
            return new d(responseCode, mapI, 4);
        }
    }

    public static final String a(com.braze.requests.util.d dVar) {
        return "Failed request to [" + dVar + "]";
    }

    public final HttpURLConnection a(URL url, JSONObject payload, HashMap headers) throws IOException {
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(payload, "payload");
        AbstractC4862t.e(headers, "headers");
        String string = payload.toString();
        AbstractC4862t.d(string, "toString(...)");
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC4862t.d(charsetForName, "forName(...)");
        byte[] bytes = string.getBytes(charsetForName);
        AbstractC4862t.d(bytes, "getBytes(...)");
        HttpURLConnection httpURLConnectionA = g.f27565a.a(url);
        for (Map.Entry entry : headers.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnectionA.setConnectTimeout(f27518b);
        httpURLConnectionA.setReadTimeout(this.f27519a);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setInstanceFollowRedirects(false);
        httpURLConnectionA.setRequestMethod("POST");
        httpURLConnectionA.setDoOutput(true);
        httpURLConnectionA.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = httpURLConnectionA.getOutputStream();
        try {
            outputStream.write(bytes);
            C4015H c4015h = C4015H.f34254a;
            sc.c.a(outputStream, null);
            return httpURLConnectionA;
        } finally {
        }
    }
}
