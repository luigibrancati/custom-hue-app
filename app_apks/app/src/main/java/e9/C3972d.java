package e9;

import com.google.firebase.perf.util.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: e9.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3972d extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f33852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpsURLConnection f33853b;

    public C3972d(HttpsURLConnection httpsURLConnection, l lVar, c9.h hVar) {
        super(httpsURLConnection.getURL());
        this.f33853b = httpsURLConnection;
        this.f33852a = new e(httpsURLConnection, lVar, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f33852a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f33852a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f33852a.c();
    }

    public boolean equals(Object obj) {
        return this.f33852a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f33852a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f33853b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f33852a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f33852a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f33852a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f33852a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f33852a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f33852a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f33852a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f33852a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f33852a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f33852a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f33852a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f33852a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f33852a.r(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f33852a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f33852a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f33852a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f33852a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f33852a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f33853b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f33852a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f33852a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f33852a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f33852a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f33853b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f33853b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f33852a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f33853b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f33852a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f33852a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f33852a.F();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f33852a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f33852a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f33852a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f33852a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f33853b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f33853b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f33852a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f33852a.L();
    }

    public int hashCode() {
        return this.f33852a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f33852a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f33852a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f33852a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f33852a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f33852a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f33852a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f33852a.S(i10);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f33853b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f33852a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f33852a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f33852a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f33852a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f33852a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f33853b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f33852a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f33852a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f33852a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f33852a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f33852a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f33852a.T(j10);
    }
}
