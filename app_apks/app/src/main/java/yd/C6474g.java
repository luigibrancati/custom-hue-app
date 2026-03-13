package yd;

import Lc.a0;
import hd.AbstractC4297a;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: yd.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6474g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd.c f48554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd.c f48555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC4297a f48556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f48557d;

    public C6474g(hd.c nameResolver, fd.c classProto, AbstractC4297a metadataVersion, a0 sourceElement) {
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(classProto, "classProto");
        AbstractC4862t.e(metadataVersion, "metadataVersion");
        AbstractC4862t.e(sourceElement, "sourceElement");
        this.f48554a = nameResolver;
        this.f48555b = classProto;
        this.f48556c = metadataVersion;
        this.f48557d = sourceElement;
    }

    public final hd.c a() {
        return this.f48554a;
    }

    public final fd.c b() {
        return this.f48555b;
    }

    public final AbstractC4297a c() {
        return this.f48556c;
    }

    public final a0 d() {
        return this.f48557d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6474g)) {
            return false;
        }
        C6474g c6474g = (C6474g) obj;
        return AbstractC4862t.a(this.f48554a, c6474g.f48554a) && AbstractC4862t.a(this.f48555b, c6474g.f48555b) && AbstractC4862t.a(this.f48556c, c6474g.f48556c) && AbstractC4862t.a(this.f48557d, c6474g.f48557d);
    }

    public int hashCode() {
        return (((((this.f48554a.hashCode() * 31) + this.f48555b.hashCode()) * 31) + this.f48556c.hashCode()) * 31) + this.f48557d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f48554a + ", classProto=" + this.f48555b + ", metadataVersion=" + this.f48556c + ", sourceElement=" + this.f48557d + ')';
    }
}
