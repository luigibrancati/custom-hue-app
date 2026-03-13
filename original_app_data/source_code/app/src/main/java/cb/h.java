package cb;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3091b f26481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3091b f26482b;

    public h(C3091b origin, C3091b direction) {
        AbstractC4862t.e(origin, "origin");
        AbstractC4862t.e(direction, "direction");
        this.f26481a = origin;
        this.f26482b = direction;
    }

    public final C3091b a() {
        return this.f26482b;
    }

    public final C3091b b() {
        return this.f26481a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC4862t.a(this.f26481a, hVar.f26481a) && AbstractC4862t.a(this.f26482b, hVar.f26482b);
    }

    public int hashCode() {
        return (this.f26481a.hashCode() * 31) + this.f26482b.hashCode();
    }

    public String toString() {
        return "Ray(origin=" + this.f26481a + ", direction=" + this.f26482b + ')';
    }
}
