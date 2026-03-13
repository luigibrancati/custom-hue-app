package kd;

import Od.C;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: kd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4838a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0517a f39541e = new C0517a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f39542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f39543g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f39544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f39545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f39546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f39547d;

    /* JADX INFO: renamed from: kd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0517a {
        public /* synthetic */ C0517a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0517a() {
        }
    }

    static {
        f fVar = h.f39578m;
        f39542f = fVar;
        c cVarK = c.k(fVar);
        AbstractC4862t.d(cVarK, "topLevel(LOCAL_NAME)");
        f39543g = cVarK;
    }

    public C4838a(c packageName, c cVar, f callableName, c cVar2) {
        AbstractC4862t.e(packageName, "packageName");
        AbstractC4862t.e(callableName, "callableName");
        this.f39544a = packageName;
        this.f39545b = cVar;
        this.f39546c = callableName;
        this.f39547d = cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4838a)) {
            return false;
        }
        C4838a c4838a = (C4838a) obj;
        return AbstractC4862t.a(this.f39544a, c4838a.f39544a) && AbstractC4862t.a(this.f39545b, c4838a.f39545b) && AbstractC4862t.a(this.f39546c, c4838a.f39546c) && AbstractC4862t.a(this.f39547d, c4838a.f39547d);
    }

    public int hashCode() {
        int iHashCode = this.f39544a.hashCode() * 31;
        c cVar = this.f39545b;
        int iHashCode2 = (((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f39546c.hashCode()) * 31;
        c cVar2 = this.f39547d;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strB = this.f39544a.b();
        AbstractC4862t.d(strB, "packageName.asString()");
        sb2.append(C.K(strB, '.', JsonPointer.SEPARATOR, false, 4, null));
        sb2.append("/");
        c cVar = this.f39545b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f39546c);
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ C4838a(c cVar, c cVar2, f fVar, c cVar3, int i10, AbstractC4854k abstractC4854k) {
        this(cVar, cVar2, fVar, (i10 & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4838a(c packageName, f callableName) {
        this(packageName, null, callableName, null, 8, null);
        AbstractC4862t.e(packageName, "packageName");
        AbstractC4862t.e(callableName, "callableName");
    }
}
