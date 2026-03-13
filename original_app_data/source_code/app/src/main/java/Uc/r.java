package Uc;

import cd.C3105i;
import cd.EnumC3104h;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3105i f16936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f16937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16938c;

    public r(C3105i nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        AbstractC4862t.e(nullabilityQualifier, "nullabilityQualifier");
        AbstractC4862t.e(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f16936a = nullabilityQualifier;
        this.f16937b = qualifierApplicabilityTypes;
        this.f16938c = z10;
    }

    public static /* synthetic */ r b(r rVar, C3105i c3105i, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3105i = rVar.f16936a;
        }
        if ((i10 & 2) != 0) {
            collection = rVar.f16937b;
        }
        if ((i10 & 4) != 0) {
            z10 = rVar.f16938c;
        }
        return rVar.a(c3105i, collection, z10);
    }

    public final r a(C3105i nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        AbstractC4862t.e(nullabilityQualifier, "nullabilityQualifier");
        AbstractC4862t.e(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new r(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public final boolean c() {
        return this.f16938c;
    }

    public final C3105i d() {
        return this.f16936a;
    }

    public final Collection e() {
        return this.f16937b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC4862t.a(this.f16936a, rVar.f16936a) && AbstractC4862t.a(this.f16937b, rVar.f16937b) && this.f16938c == rVar.f16938c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((this.f16936a.hashCode() * 31) + this.f16937b.hashCode()) * 31;
        boolean z10 = this.f16938c;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        return iHashCode + r22;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f16936a + ", qualifierApplicabilityTypes=" + this.f16937b + ", definitelyNotNull=" + this.f16938c + ')';
    }

    public /* synthetic */ r(C3105i c3105i, Collection collection, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(c3105i, collection, (i10 & 4) != 0 ? c3105i.c() == EnumC3104h.NOT_NULL : z10);
    }
}
