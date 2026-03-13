package cd;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cd.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3105i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC3104h f26515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26516b;

    public C3105i(EnumC3104h qualifier, boolean z10) {
        AbstractC4862t.e(qualifier, "qualifier");
        this.f26515a = qualifier;
        this.f26516b = z10;
    }

    public static /* synthetic */ C3105i b(C3105i c3105i, EnumC3104h enumC3104h, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC3104h = c3105i.f26515a;
        }
        if ((i10 & 2) != 0) {
            z10 = c3105i.f26516b;
        }
        return c3105i.a(enumC3104h, z10);
    }

    public final C3105i a(EnumC3104h qualifier, boolean z10) {
        AbstractC4862t.e(qualifier, "qualifier");
        return new C3105i(qualifier, z10);
    }

    public final EnumC3104h c() {
        return this.f26515a;
    }

    public final boolean d() {
        return this.f26516b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3105i)) {
            return false;
        }
        C3105i c3105i = (C3105i) obj;
        return this.f26515a == c3105i.f26515a && this.f26516b == c3105i.f26516b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = this.f26515a.hashCode() * 31;
        boolean z10 = this.f26516b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f26515a + ", isForWarningOnly=" + this.f26516b + ')';
    }

    public /* synthetic */ C3105i(EnumC3104h enumC3104h, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(enumC3104h, (i10 & 2) != 0 ? false : z10);
    }
}
