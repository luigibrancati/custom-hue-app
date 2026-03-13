package e9;

import com.google.firebase.perf.util.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: renamed from: e9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3971c extends HttpURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f33851a;

    public C3971c(HttpURLConnection httpURLConnection, l lVar, c9.h hVar) {
        super(httpURLConnection.getURL());
        this.f33851a = new e(httpURLConnection, lVar, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f33851a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f33851a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f33851a.c();
    }

    public boolean equals(Object obj) {
        return this.f33851a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f33851a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f33851a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f33851a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f33851a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f33851a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f33851a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f33851a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f33851a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f33851a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f33851a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f33851a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f33851a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f33851a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f33851a.r(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f33851a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f33851a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f33851a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f33851a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f33851a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f33851a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f33851a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f33851a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f33851a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f33851a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f33851a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f33851a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f33851a.F();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f33851a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f33851a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f33851a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f33851a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f33851a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f33851a.L();
    }

    public int hashCode() {
        return this.f33851a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f33851a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f33851a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f33851a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f33851a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f33851a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f33851a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f33851a.S(i10);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f33851a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f33851a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f33851a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f33851a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f33851a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f33851a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f33851a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f33851a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f33851a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f33851a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f33851a.T(j10);
    }
}
