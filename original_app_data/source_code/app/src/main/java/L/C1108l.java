package L;

import L.d1;

/* JADX INFO: renamed from: L.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1108l extends d1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f8111a;

    public C1108l(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.f8111a = th;
    }

    @Override // L.d1.a
    public Throwable a() {
        return this.f8111a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d1.a) {
            return this.f8111a.equals(((d1.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f8111a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f8111a + "}";
    }
}
