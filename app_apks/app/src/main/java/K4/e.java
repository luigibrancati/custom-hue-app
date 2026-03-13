package K4;

import Od.C1823c;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fc.AbstractC4040w;
import gc.C4206t;
import gc.Q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import org.apache.tika.metadata.HttpHeaders;
import sc.o;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.b f7458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A4.a f7459b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f7470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7471d;

        public b(int i10, String str, Map headers, String str2) {
            AbstractC4862t.e(headers, "headers");
            this.f7468a = i10;
            this.f7469b = str;
            this.f7470c = headers;
            this.f7471d = str2;
        }

        public final String a() {
            return this.f7469b;
        }

        public final int b() {
            return this.f7468a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7468a == bVar.f7468a && AbstractC4862t.a(this.f7469b, bVar.f7469b) && AbstractC4862t.a(this.f7470c, bVar.f7470c) && AbstractC4862t.a(this.f7471d, bVar.f7471d);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f7468a) * 31;
            String str = this.f7469b;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f7470c.hashCode()) * 31;
            String str2 = this.f7471d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Response(statusCode=" + this.f7468a + ", body=" + this.f7469b + ", headers=" + this.f7470c + ", statusMessage=" + this.f7471d + ')';
        }
    }

    public e(D4.b configuration, A4.a logger) {
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(logger, "logger");
        this.f7458a = configuration;
        this.f7459b = logger;
    }

    @Override // K4.f
    public K4.b a(String events, String str) {
        AbstractC4862t.e(events, "events");
        Map map = null;
        b bVarD = d(new a(this.f7458a.a(), a.b.POST, map, new K4.a(b(), events, this.f7458a.n(), str, 0L, 16, null).a(), 0, 0, 52, null));
        return K4.b.f7450b.a(bVarD.b(), bVarD.a());
    }

    public final String b() {
        return this.f7458a.b();
    }

    public final InputStream c(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            AbstractC4862t.b(inputStream);
            return inputStream;
        } catch (IOException e10) {
            this.f7459b.c("Failed to get input stream, falling back to error stream: " + e10.getMessage());
            InputStream errorStream = httpURLConnection.getErrorStream();
            AbstractC4862t.b(errorStream);
            return errorStream;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [K4.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    public final b d(a request) {
        InputStream inputStreamC;
        AbstractC4862t.e(request, "request");
        try {
            ?? url = new URL(request.g());
            try {
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    AbstractC4862t.c(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    url = (HttpURLConnection) uRLConnection;
                    try {
                        url.setRequestMethod(request.e().name());
                        url.setConnectTimeout(request.c());
                        url.setReadTimeout(request.f());
                        url.setDoInput(true);
                        for (Map.Entry entry : a.f7460g.a().entrySet()) {
                            url.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        Iterator it = request.d().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            url.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                        String strB = request.b();
                        ?? r52 = it;
                        if (strB != null) {
                            url.setDoOutput(true);
                            byte[] bytes = strB.getBytes(C1823c.f12394b);
                            AbstractC4862t.d(bytes, "getBytes(...)");
                            OutputStream outputStream = url.getOutputStream();
                            int length = bytes.length;
                            outputStream.write(bytes, 0, length);
                            url.getOutputStream().close();
                            r52 = length;
                        }
                        try {
                            int responseCode = url.getResponseCode();
                            String responseMessage = url.getResponseMessage();
                            try {
                                inputStreamC = c(url);
                            } catch (IOException e10) {
                                e = e10;
                                inputStreamC = null;
                            } catch (Throwable th) {
                                th = th;
                                r52 = 0;
                                if (r52 != 0) {
                                    r52.close();
                                }
                                throw th;
                            }
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamC, C1823c.f12394b), 8192);
                                try {
                                    String strD = o.d(bufferedReader);
                                    sc.c.a(bufferedReader, null);
                                    if (inputStreamC != null) {
                                        inputStreamC.close();
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    Map<String, List<String>> headerFields = url.getHeaderFields();
                                    AbstractC4862t.d(headerFields, "getHeaderFields(...)");
                                    for (Map.Entry<String, List<String>> entry3 : headerFields.entrySet()) {
                                        String key = entry3.getKey();
                                        List<String> value = entry3.getValue();
                                        if (key != null) {
                                            if (value == null) {
                                                value = C4206t.k();
                                            }
                                            linkedHashMap.put(key, value);
                                        }
                                    }
                                    b bVar = new b(responseCode, strD, linkedHashMap, responseMessage);
                                    url.disconnect();
                                    return bVar;
                                } finally {
                                }
                            } catch (IOException e11) {
                                e = e11;
                                this.f7459b.d("Failed to read response from server: " + e.getMessage());
                                b bVar2 = new b(408, null, Q.i(), "Request timeout");
                                if (inputStreamC != null) {
                                    inputStreamC.close();
                                }
                                url.disconnect();
                                return bVar2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e12) {
                        this.f7459b.d("Request failed: " + e12.getClass().getName() + ": " + e12.getMessage());
                        Map mapI = Q.i();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Request failed: ");
                        sb2.append(e12.getMessage());
                        b bVar3 = new b(500, null, mapI, sb2.toString());
                        url.disconnect();
                        return bVar3;
                    }
                } catch (Throwable th3) {
                    url.disconnect();
                    throw th3;
                }
            } catch (IOException e13) {
                this.f7459b.d("Failed to open connection: " + e13.getMessage());
                return new b(500, null, Q.i(), "Connection failed");
            }
        } catch (MalformedURLException e14) {
            this.f7459b.d("Attempted to use malformed url: " + request.g() + ", error: " + e14.getMessage());
            return new b(400, null, Q.i(), "Malformed URL");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C0114a f7460g = new C0114a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Map f7461h = Q.l(AbstractC4040w.a(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8"), AbstractC4040w.a("Accept", "application/json"));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f7463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f7464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7467f;

        /* JADX INFO: renamed from: K4.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0114a {
            public /* synthetic */ C0114a(AbstractC4854k abstractC4854k) {
                this();
            }

            public final Map a() {
                return a.f7461h;
            }

            public C0114a() {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b {
            private static final /* synthetic */ InterfaceC5276a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;
            public static final b GET = new b("GET", 0);
            public static final b POST = new b("POST", 1);
            public static final b PUT = new b("PUT", 2);
            public static final b DELETE = new b("DELETE", 3);
            public static final b PATCH = new b("PATCH", 4);

            static {
                b[] bVarArrA = a();
                $VALUES = bVarArrA;
                $ENTRIES = AbstractC5277b.a(bVarArrA);
            }

            public b(String str, int i10) {
            }

            public static final /* synthetic */ b[] a() {
                return new b[]{GET, POST, PUT, DELETE, PATCH};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public a(String url, b method, Map headers, String str, int i10, int i11) {
            AbstractC4862t.e(url, "url");
            AbstractC4862t.e(method, "method");
            AbstractC4862t.e(headers, "headers");
            this.f7462a = url;
            this.f7463b = method;
            this.f7464c = headers;
            this.f7465d = str;
            this.f7466e = i10;
            this.f7467f = i11;
        }

        public final String b() {
            return this.f7465d;
        }

        public final int c() {
            return this.f7466e;
        }

        public final Map d() {
            return this.f7464c;
        }

        public final b e() {
            return this.f7463b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(this.f7462a, aVar.f7462a) && this.f7463b == aVar.f7463b && AbstractC4862t.a(this.f7464c, aVar.f7464c) && AbstractC4862t.a(this.f7465d, aVar.f7465d) && this.f7466e == aVar.f7466e && this.f7467f == aVar.f7467f;
        }

        public final int f() {
            return this.f7467f;
        }

        public final String g() {
            return this.f7462a;
        }

        public int hashCode() {
            int iHashCode = ((((this.f7462a.hashCode() * 31) + this.f7463b.hashCode()) * 31) + this.f7464c.hashCode()) * 31;
            String str = this.f7465d;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f7466e)) * 31) + Integer.hashCode(this.f7467f);
        }

        public String toString() {
            return "Request(url=" + this.f7462a + ", method=" + this.f7463b + ", headers=" + this.f7464c + ", body=" + this.f7465d + ", connectTimeoutMs=" + this.f7466e + ", readTimeoutMs=" + this.f7467f + ')';
        }

        public /* synthetic */ a(String str, b bVar, Map map, String str2, int i10, int i11, int i12, AbstractC4854k abstractC4854k) {
            this(str, bVar, (i12 & 4) != 0 ? Q.i() : map, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? 15000 : i10, (i12 & 32) != 0 ? 20000 : i11);
        }
    }
}
