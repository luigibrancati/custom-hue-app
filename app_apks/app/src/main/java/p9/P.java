package p9;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5429e f42366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f42367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f42368g;

    public P(String sessionId, String firstSessionId, int i10, long j10, C5429e dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC4862t.e(sessionId, "sessionId");
        AbstractC4862t.e(firstSessionId, "firstSessionId");
        AbstractC4862t.e(dataCollectionStatus, "dataCollectionStatus");
        AbstractC4862t.e(firebaseInstallationId, "firebaseInstallationId");
        AbstractC4862t.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f42362a = sessionId;
        this.f42363b = firstSessionId;
        this.f42364c = i10;
        this.f42365d = j10;
        this.f42366e = dataCollectionStatus;
        this.f42367f = firebaseInstallationId;
        this.f42368g = firebaseAuthenticationToken;
    }

    public final C5429e a() {
        return this.f42366e;
    }

    public final long b() {
        return this.f42365d;
    }

    public final String c() {
        return this.f42368g;
    }

    public final String d() {
        return this.f42367f;
    }

    public final String e() {
        return this.f42363b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return AbstractC4862t.a(this.f42362a, p10.f42362a) && AbstractC4862t.a(this.f42363b, p10.f42363b) && this.f42364c == p10.f42364c && this.f42365d == p10.f42365d && AbstractC4862t.a(this.f42366e, p10.f42366e) && AbstractC4862t.a(this.f42367f, p10.f42367f) && AbstractC4862t.a(this.f42368g, p10.f42368g);
    }

    public final String f() {
        return this.f42362a;
    }

    public final int g() {
        return this.f42364c;
    }

    public int hashCode() {
        return (((((((((((this.f42362a.hashCode() * 31) + this.f42363b.hashCode()) * 31) + Integer.hashCode(this.f42364c)) * 31) + Long.hashCode(this.f42365d)) * 31) + this.f42366e.hashCode()) * 31) + this.f42367f.hashCode()) * 31) + this.f42368g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f42362a + ", firstSessionId=" + this.f42363b + ", sessionIndex=" + this.f42364c + ", eventTimestampUs=" + this.f42365d + ", dataCollectionStatus=" + this.f42366e + ", firebaseInstallationId=" + this.f42367f + ", firebaseAuthenticationToken=" + this.f42368g + ')';
    }
}
