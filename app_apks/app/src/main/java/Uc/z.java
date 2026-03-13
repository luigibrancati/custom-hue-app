package Uc;

import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4205s;
import gc.Q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f16963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f16964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f16965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f16966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16967e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            z zVar = z.this;
            List listC = C4205s.c();
            listC.add(zVar.a().b());
            G gB = zVar.b();
            if (gB != null) {
                listC.add("under-migration:" + gB.b());
            }
            for (Map.Entry entry : zVar.c().entrySet()) {
                listC.add('@' + entry.getKey() + ':' + ((G) entry.getValue()).b());
            }
            return (String[]) C4205s.a(listC).toArray(new String[0]);
        }
    }

    public z(G globalLevel, G g10, Map userDefinedLevelForSpecificAnnotation) {
        AbstractC4862t.e(globalLevel, "globalLevel");
        AbstractC4862t.e(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f16963a = globalLevel;
        this.f16964b = g10;
        this.f16965c = userDefinedLevelForSpecificAnnotation;
        this.f16966d = C4029l.b(new a());
        G g11 = G.IGNORE;
        this.f16967e = globalLevel == g11 && g10 == g11 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public final G a() {
        return this.f16963a;
    }

    public final G b() {
        return this.f16964b;
    }

    public final Map c() {
        return this.f16965c;
    }

    public final boolean d() {
        return this.f16967e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f16963a == zVar.f16963a && this.f16964b == zVar.f16964b && AbstractC4862t.a(this.f16965c, zVar.f16965c);
    }

    public int hashCode() {
        int iHashCode = this.f16963a.hashCode() * 31;
        G g10 = this.f16964b;
        return ((iHashCode + (g10 == null ? 0 : g10.hashCode())) * 31) + this.f16965c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f16963a + ", migrationLevel=" + this.f16964b + ", userDefinedLevelForSpecificAnnotation=" + this.f16965c + ')';
    }

    public /* synthetic */ z(G g10, G g11, Map map, int i10, AbstractC4854k abstractC4854k) {
        this(g10, (i10 & 2) != 0 ? null : g11, (i10 & 4) != 0 ? Q.i() : map);
    }
}
