package e9;

import b9.C2898a;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2898a f33854f = C2898a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f33855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.h f33856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f33857c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f33858d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f33859e;

    public e(HttpURLConnection httpURLConnection, l lVar, c9.h hVar) {
        this.f33855a = httpURLConnection;
        this.f33856b = hVar;
        this.f33859e = lVar;
        hVar.v(httpURLConnection.getURL().toString());
    }

    public boolean A() {
        return this.f33855a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f33855a.getLastModified();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream = this.f33855a.getOutputStream();
            return outputStream != null ? new C3970b(outputStream, this.f33856b, this.f33859e) : outputStream;
        } catch (IOException e10) {
            this.f33856b.t(this.f33859e.c());
            h.d(this.f33856b);
            throw e10;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.f33855a.getPermission();
        } catch (IOException e10) {
            this.f33856b.t(this.f33859e.c());
            h.d(this.f33856b);
            throw e10;
        }
    }

    public int E() {
        return this.f33855a.getReadTimeout();
    }

    public String F() {
        return this.f33855a.getRequestMethod();
    }

    public Map G() {
        return this.f33855a.getRequestProperties();
    }

    public String H(String str) {
        return this.f33855a.getRequestProperty(str);
    }

    public int I() throws IOException {
        a0();
        if (this.f33858d == -1) {
            long jC = this.f33859e.c();
            this.f33858d = jC;
            this.f33856b.u(jC);
        }
        try {
            int responseCode = this.f33855a.getResponseCode();
            this.f33856b.k(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f33856b.t(this.f33859e.c());
            h.d(this.f33856b);
            throw e10;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.f33858d == -1) {
            long jC = this.f33859e.c();
            this.f33858d = jC;
            this.f33856b.u(jC);
        }
        try {
            String responseMessage = this.f33855a.getResponseMessage();
            this.f33856b.k(this.f33855a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f33856b.t(this.f33859e.c());
            h.d(this.f33856b);
            throw e10;
        }
    }

    public URL K() {
        return this.f33855a.getURL();
    }

    public boolean L() {
        return this.f33855a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f33855a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f33855a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f33855a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f33855a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f33855a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f33855a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f33855a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f33855a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f33855a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f33855a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f33855a.setReadTimeout(i10);
    }

    public void X(String str) {
        this.f33855a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f33856b.w(str2);
        }
        this.f33855a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f33855a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f33855a.addRequestProperty(str, str2);
    }

    public final void a0() {
        if (this.f33857c == -1) {
            this.f33859e.g();
            long jE = this.f33859e.e();
            this.f33857c = jE;
            this.f33856b.n(jE);
        }
        String strF = F();
        if (strF != null) {
            this.f33856b.j(strF);
        } else if (o()) {
            this.f33856b.j("POST");
        } else {
            this.f33856b.j("GET");
        }
    }

    public void b() {
        if (this.f33857c == -1) {
            this.f33859e.g();
            long jE = this.f33859e.e();
            this.f33857c = jE;
            this.f33856b.n(jE);
        }
        try {
            this.f33855a.connect();
        } catch (IOException e10) {
            this.f33856b.t(this.f33859e.c());
            h.d(this.f33856b);
            throw e10;
        }
    }

    public boolean b0() {
        return this.f33855a.usingProxy();
    }

    public void c() {
        this.f33856b.t(this.f33859e.c());
        this.f33856b.b();
        this.f33855a.disconnect();
    }

    public boolean d() {
        return this.f33855a.getAllowUserInteraction();
    }

    public int e() {
        return this.f33855a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f33855a.equals(obj);
    }

    public Object f() throws IOException {
        a0();
        this.f33856b.k(this.f33855a.getResponseCode());
        try {
            Object content = this.f33855a.getContent();
            if (content instanceof InputStream) {
                this.f33856b.o(this.f33855a.getContentType());
                return new C3969a((InputStream) content, this.f33856b, this.f33859e);
            }
            this.f33856b.o(this.f33855a.getContentType());
            this.f33856b.q(this.f33855a.getContentLength());
            this.f33856b.t(this.f33859e.c());
            this.f33856b.b();
            return content;
        } catch (IOException e10) {
            this.f33856b.t(this.f33859e.c());
            h.d(this.f33856b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.f33856b.k(this.f33855a.getResponseCode());
        try {
            Object content = this.f33855a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f33856b.o(this.f33855a.getContentType());
                return new C3969a((InputStream) content, this.f33856b, this.f33859e);
            }
            this.f33856b.o(this.f33855a.getContentType());
            this.f33856b.q(this.f33855a.getContentLength());
            this.f33856b.t(this.f33859e.c());
            this.f33856b.b();
            return content;
        } catch (IOException e10) {
            this.f33856b.t(this.f33859e.c());
            h.d(this.f33856b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f33855a.getContentEncoding();
    }

    public int hashCode() {
        return this.f33855a.hashCode();
    }

    public int i() {
        a0();
        return this.f33855a.getContentLength();
    }

    public long j() {
        a0();
        return this.f33855a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f33855a.getContentType();
    }

    public long l() {
        a0();
        return this.f33855a.getDate();
    }

    public boolean m() {
        return this.f33855a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f33855a.getDoInput();
    }

    public boolean o() {
        return this.f33855a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f33856b.k(this.f33855a.getResponseCode());
        } catch (IOException unused) {
            f33854f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f33855a.getErrorStream();
        return errorStream != null ? new C3969a(errorStream, this.f33856b, this.f33859e) : errorStream;
    }

    public long q() {
        a0();
        return this.f33855a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f33855a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f33855a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f33855a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f33855a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f33855a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f33855a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        return this.f33855a.getHeaderFieldLong(str, j10);
    }

    public Map x() {
        a0();
        return this.f33855a.getHeaderFields();
    }

    public long y() {
        return this.f33855a.getIfModifiedSince();
    }

    public InputStream z() throws IOException {
        a0();
        this.f33856b.k(this.f33855a.getResponseCode());
        this.f33856b.o(this.f33855a.getContentType());
        try {
            InputStream inputStream = this.f33855a.getInputStream();
            return inputStream != null ? new C3969a(inputStream, this.f33856b, this.f33859e) : inputStream;
        } catch (IOException e10) {
            this.f33856b.t(this.f33859e.c());
            h.d(this.f33856b);
            throw e10;
        }
    }
}
