package E;

import E.AbstractC0819w;

/* JADX INFO: renamed from: E.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0786f extends AbstractC0819w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f2976b;

    public C0786f(int i10, Throwable th) {
        this.f2975a = i10;
        this.f2976b = th;
    }

    @Override // E.AbstractC0819w.a
    public Throwable c() {
        return this.f2976b;
    }

    @Override // E.AbstractC0819w.a
    public int d() {
        return this.f2975a;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0819w.a) {
            AbstractC0819w.a aVar = (AbstractC0819w.a) obj;
            if (this.f2975a == aVar.d() && ((th = this.f2976b) != null ? th.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f2975a ^ 1000003) * 1000003;
        Throwable th = this.f2976b;
        return (th == null ? 0 : th.hashCode()) ^ i10;
    }

    public String toString() {
        return "StateError{code=" + this.f2975a + ", cause=" + this.f2976b + "}";
    }
}
