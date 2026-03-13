package T5;

import kotlin.jvm.internal.AbstractC4862t;
import pb.C5454b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5454b f16246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ab.f f16247b;

    public p(C5454b anchor, Ab.f entity) {
        AbstractC4862t.e(anchor, "anchor");
        AbstractC4862t.e(entity, "entity");
        this.f16246a = anchor;
        this.f16247b = entity;
    }

    public final C5454b a() {
        return this.f16246a;
    }

    public final Ab.f b() {
        return this.f16247b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC4862t.a(this.f16246a, pVar.f16246a) && AbstractC4862t.a(this.f16247b, pVar.f16247b);
    }

    public int hashCode() {
        return (this.f16246a.hashCode() * 31) + this.f16247b.hashCode();
    }

    public String toString() {
        return "HitPoint(anchor=" + this.f16246a + ", entity=" + this.f16247b + ")";
    }
}
