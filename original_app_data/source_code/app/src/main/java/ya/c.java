package ya;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48506c;

    public c(String clientId, String callbackUrl, String scope) {
        AbstractC4862t.e(clientId, "clientId");
        AbstractC4862t.e(callbackUrl, "callbackUrl");
        AbstractC4862t.e(scope, "scope");
        this.f48504a = clientId;
        this.f48505b = callbackUrl;
        this.f48506c = scope;
    }

    public final String a() {
        return this.f48505b;
    }

    public final String b() {
        return this.f48504a;
    }

    public final String c() {
        return this.f48506c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC4862t.a(this.f48504a, cVar.f48504a) && AbstractC4862t.a(this.f48505b, cVar.f48505b) && AbstractC4862t.a(this.f48506c, cVar.f48506c);
    }

    public int hashCode() {
        return (((this.f48504a.hashCode() * 31) + this.f48505b.hashCode()) * 31) + this.f48506c.hashCode();
    }

    public String toString() {
        return "AuthenticationRequestInput(clientId=" + this.f48504a + ", callbackUrl=" + this.f48505b + ", scope=" + this.f48506c + ')';
    }
}
