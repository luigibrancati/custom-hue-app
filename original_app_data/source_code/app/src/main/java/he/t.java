package he;

import ie.M;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends AbstractC4300C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee.e f36613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36614c;

    public /* synthetic */ t(Object obj, boolean z10, ee.e eVar, int i10, AbstractC4854k abstractC4854k) {
        this(obj, z10, (i10 & 4) != 0 ? null : eVar);
    }

    @Override // he.AbstractC4300C
    public String c() {
        return this.f36614c;
    }

    public final ee.e d() {
        return this.f36613b;
    }

    public boolean e() {
        return this.f36612a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return e() == tVar.e() && AbstractC4862t.a(c(), tVar.c());
    }

    public int hashCode() {
        return (Boolean.hashCode(e()) * 31) + c().hashCode();
    }

    @Override // he.AbstractC4300C
    public String toString() {
        if (!e()) {
            return c();
        }
        StringBuilder sb2 = new StringBuilder();
        M.c(sb2, c());
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Object body, boolean z10, ee.e eVar) {
        super(null);
        AbstractC4862t.e(body, "body");
        this.f36612a = z10;
        this.f36613b = eVar;
        this.f36614c = body.toString();
        if (eVar != null && !eVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
