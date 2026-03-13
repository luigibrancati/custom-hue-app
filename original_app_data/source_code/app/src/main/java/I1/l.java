package I1;

import G1.M;
import I1.f;
import I1.l;
import K7.AbstractC1077q;
import K7.AbstractC1083x;
import K7.U;
import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l extends I1.b implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f5477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f5478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J7.o f5479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f5480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f5481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HttpURLConnection f5482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InputStream f5483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5487t;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements f.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x f5489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public J7.o f5490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f5491d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f5494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f5495h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f5496i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f5488a = new t();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5492e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5493f = 8000;

        @Override // I1.f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a() {
            l lVar = new l(this.f5491d, this.f5492e, this.f5493f, this.f5494g, this.f5495h, this.f5488a, this.f5490c, this.f5496i);
            x xVar = this.f5489b;
            if (xVar != null) {
                lVar.h(xVar);
            }
            return lVar;
        }

        public b c(boolean z10) {
            this.f5494g = z10;
            return this;
        }

        public b d(Map map) {
            this.f5488a.a(map);
            return this;
        }

        public b e(String str) {
            this.f5491d = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends AbstractC1077q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f5497a;

        public c(Map map) {
            this.f5497a = map;
        }

        public static /* synthetic */ boolean f(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean g(String str) {
            return str != null;
        }

        @Override // K7.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map a() {
            return this.f5497a;
        }

        @Override // K7.AbstractC1077q, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override // K7.AbstractC1077q, java.util.Map
        public Set entrySet() {
            return U.b(super.entrySet(), new J7.o() { // from class: I1.m
                @Override // J7.o
                public final boolean apply(Object obj) {
                    return l.c.f((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        @Override // K7.AbstractC1077q, java.util.Map
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.e();
        }

        @Override // K7.AbstractC1077q, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // K7.AbstractC1077q, java.util.Map
        public Set keySet() {
            return U.b(super.keySet(), new J7.o() { // from class: I1.n
                @Override // J7.o
                public final boolean apply(Object obj) {
                    return l.c.g((String) obj);
                }
            });
        }

        @Override // K7.AbstractC1077q, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public static boolean z(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
    }

    public final HttpURLConnection A(j jVar) throws IOException {
        HttpURLConnection httpURLConnectionB;
        URL url = new URL(jVar.f5437a.toString());
        int i10 = jVar.f5439c;
        byte[] bArr = jVar.f5440d;
        long j10 = jVar.f5443g;
        long j11 = jVar.f5444h;
        int i11 = 1;
        boolean zD = jVar.d(1);
        if (!this.f5472e && !this.f5473f && !this.f5480m) {
            return B(url, i10, bArr, j10, j11, zD, true, jVar.f5441e);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new q(new NoRouteToHostException("Too many redirects: " + i13), jVar, 2001, 1);
            }
            httpURLConnectionB = B(url, i10, bArr, j10, j11, zD, false, jVar.f5441e);
            int responseCode = httpURLConnectionB.getResponseCode();
            String headerField = httpURLConnectionB.getHeaderField(HttpHeaders.LOCATION);
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionB.disconnect();
                url = y(url, headerField, jVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionB.disconnect();
                if (!this.f5480m || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = y(url, headerField, jVar);
            }
            i12 = i13;
            i11 = 1;
        }
        return httpURLConnectionB;
    }

    public final HttpURLConnection B(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        HttpURLConnection httpURLConnectionC = C(url);
        httpURLConnectionC.setConnectTimeout(this.f5474g);
        httpURLConnectionC.setReadTimeout(this.f5475h);
        HashMap map2 = new HashMap();
        t tVar = this.f5477j;
        if (tVar != null) {
            map2.putAll(tVar.b());
        }
        map2.putAll(this.f5478k.b());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionC.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = u.a(j10, j11);
        if (strA != null) {
            httpURLConnectionC.setRequestProperty("Range", strA);
        }
        String str = this.f5476i;
        if (str != null) {
            httpURLConnectionC.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionC.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionC.setInstanceFollowRedirects(z11);
        httpURLConnectionC.setDoOutput(bArr != null);
        httpURLConnectionC.setRequestMethod(j.c(i10));
        if (bArr == null) {
            httpURLConnectionC.connect();
            return httpURLConnectionC;
        }
        httpURLConnectionC.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionC.connect();
        OutputStream outputStream = httpURLConnectionC.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionC;
    }

    public HttpURLConnection C(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    public final int D(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5486s;
        if (j10 != -1) {
            long j11 = j10 - this.f5487t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) M.i(this.f5483p)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f5487t += (long) i12;
        t(i12);
        return i12;
    }

    public final void E(long j10, j jVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        while (j10 > 0) {
            int i10 = ((InputStream) M.i(this.f5483p)).read(bArr, 0, (int) Math.min(j10, RecognitionOptions.AZTEC));
            if (Thread.currentThread().isInterrupted()) {
                throw new q(new InterruptedIOException(), jVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new q(jVar, 2008, 1);
            }
            j10 -= (long) i10;
            t(i10);
        }
    }

    @Override // I1.f
    public void close() {
        try {
            InputStream inputStream = this.f5483p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new q(e10, (j) M.i(this.f5481n), 2000, 3);
                }
            }
        } finally {
            this.f5483p = null;
            x();
            if (this.f5484q) {
                this.f5484q = false;
                u();
            }
            this.f5482o = null;
            this.f5481n = null;
        }
    }

    @Override // I1.f
    public long f(j jVar) throws q {
        byte[] bArrB;
        this.f5481n = jVar;
        long j10 = 0;
        this.f5487t = 0L;
        this.f5486s = 0L;
        v(jVar);
        try {
            HttpURLConnection httpURLConnectionA = A(jVar);
            this.f5482o = httpURLConnectionA;
            this.f5485r = httpURLConnectionA.getResponseCode();
            String responseMessage = httpURLConnectionA.getResponseMessage();
            int i10 = this.f5485r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                if (this.f5485r == 416) {
                    if (jVar.f5443g == u.c(httpURLConnectionA.getHeaderField("Content-Range"))) {
                        this.f5484q = true;
                        w(jVar);
                        long j11 = jVar.f5444h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionA.getErrorStream();
                try {
                    bArrB = errorStream != null ? L7.a.b(errorStream) : M.f4267f;
                } catch (IOException unused) {
                    bArrB = M.f4267f;
                }
                byte[] bArr = bArrB;
                x();
                throw new s(this.f5485r, responseMessage, this.f5485r == 416 ? new g(2008) : null, headerFields, jVar, bArr);
            }
            String contentType = httpURLConnectionA.getContentType();
            J7.o oVar = this.f5479l;
            if (oVar != null && !oVar.apply(contentType)) {
                x();
                throw new r(contentType, jVar);
            }
            if (this.f5485r == 200) {
                long j12 = jVar.f5443g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean z10 = z(httpURLConnectionA);
            if (z10) {
                this.f5486s = jVar.f5444h;
            } else {
                long j13 = jVar.f5444h;
                if (j13 != -1) {
                    this.f5486s = j13;
                } else {
                    long jB = u.b(httpURLConnectionA.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnectionA.getHeaderField("Content-Range"));
                    this.f5486s = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f5483p = httpURLConnectionA.getInputStream();
                if (z10) {
                    this.f5483p = new GZIPInputStream(this.f5483p);
                }
                this.f5484q = true;
                w(jVar);
                try {
                    E(j10, jVar);
                    return this.f5486s;
                } catch (IOException e10) {
                    x();
                    if (e10 instanceof q) {
                        throw ((q) e10);
                    }
                    throw new q(e10, jVar, 2000, 1);
                }
            } catch (IOException e11) {
                x();
                throw new q(e11, jVar, 2000, 1);
            }
        } catch (IOException e12) {
            x();
            throw q.c(e12, jVar, 1);
        }
    }

    @Override // I1.f
    public Map g() {
        HttpURLConnection httpURLConnection = this.f5482o;
        return httpURLConnection == null ? AbstractC1083x.j() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // I1.f
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f5482o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        j jVar = this.f5481n;
        if (jVar != null) {
            return jVar.f5437a;
        }
        return null;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) throws q {
        try {
            return D(bArr, i10, i11);
        } catch (IOException e10) {
            throw q.c(e10, (j) M.i(this.f5481n), 2);
        }
    }

    public final void x() {
        HttpURLConnection httpURLConnection = this.f5482o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                G1.t.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    public final URL y(URL url, String str, j jVar) throws q {
        if (str == null) {
            throw new q("Null location redirect", jVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new q("Unsupported protocol redirect: " + protocol, jVar, 2001, 1);
            }
            if (this.f5472e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f5473f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new q(e10, jVar, 2001, 1);
                }
            }
            throw new q("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", jVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new q(e11, jVar, 2001, 1);
        }
    }

    public l(String str, int i10, int i11, boolean z10, boolean z11, t tVar, J7.o oVar, boolean z12) {
        super(true);
        this.f5476i = str;
        this.f5474g = i10;
        this.f5475h = i11;
        this.f5472e = z10;
        this.f5473f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f5477j = tVar;
        this.f5479l = oVar;
        this.f5478k = new t();
        this.f5480m = z12;
    }
}
