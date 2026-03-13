package s6;

import android.util.Log;

/* JADX INFO: renamed from: s6.J, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5780J {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C5780J f44138e = new C5780J(true, 3, 1, null, null, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f44141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44142d;

    public C5780J(boolean z10, int i10, int i11, String str, Throwable th, long j10) {
        this.f44139a = z10;
        this.f44142d = i10;
        this.f44140b = str;
        this.f44141c = th;
    }

    public static C5780J b() {
        return f44138e;
    }

    public static C5780J c(String str) {
        return new C5780J(false, 1, 5, str, null, -1L);
    }

    public static C5780J d(String str, Throwable th) {
        return new C5780J(false, 1, 5, str, th, -1L);
    }

    public static C5780J f(int i10, long j10) {
        return new C5780J(true, i10, 1, null, null, j10);
    }

    public static C5780J g(int i10, int i11, String str, Throwable th) {
        return new C5780J(false, i10, i11, str, th, -1L);
    }

    public String a() {
        return this.f44140b;
    }

    public final void e() {
        if (this.f44139a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.f44141c;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", a(), th);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }

    public /* synthetic */ C5780J(boolean z10, int i10, int i11, String str, Throwable th, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
