package h3;

import Od.C;
import Od.F;
import Od.v;
import fc.C4015H;
import gc.C4179C;
import gc.C4206t;
import h3.p;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4757a.a(((p.a) obj).f36229a, ((p.a) obj2).f36229a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4757a.a(((p.d) obj).f36242a, ((p.d) obj2).f36242a);
        }
    }

    public static final boolean a(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i13 = i12 + 1;
            if (i12 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i11++;
            } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                return false;
            }
            i10++;
            i12 = i13;
        }
        return i11 == 0;
    }

    public static final boolean b(String current, String str) {
        AbstractC4862t.e(current, "current");
        if (AbstractC4862t.a(current, str)) {
            return true;
        }
        if (!a(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return AbstractC4862t.a(F.e1(strSubstring).toString(), str);
    }

    public static final boolean c(p.a aVar, Object obj) {
        AbstractC4862t.e(aVar, "<this>");
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof p.a)) {
            return false;
        }
        p.a aVar2 = (p.a) obj;
        if (aVar.a() != aVar2.a() || !AbstractC4862t.a(aVar.f36229a, aVar2.f36229a) || aVar.f36231c != aVar2.f36231c) {
            return false;
        }
        String str = aVar.f36233e;
        String str2 = aVar2.f36233e;
        if (aVar.f36234f == 1 && aVar2.f36234f == 2 && str != null && !b(str, str2)) {
            return false;
        }
        if (aVar.f36234f == 2 && aVar2.f36234f == 1 && str2 != null && !b(str2, str)) {
            return false;
        }
        int i10 = aVar.f36234f;
        return (i10 == 0 || i10 != aVar2.f36234f || (str == null ? str2 == null : b(str, str2))) && aVar.f36235g == aVar2.f36235g;
    }

    public static final boolean d(p.c cVar, Object obj) {
        AbstractC4862t.e(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof p.c)) {
            return false;
        }
        p.c cVar2 = (p.c) obj;
        if (AbstractC4862t.a(cVar.f36236a, cVar2.f36236a) && AbstractC4862t.a(cVar.f36237b, cVar2.f36237b) && AbstractC4862t.a(cVar.f36238c, cVar2.f36238c) && AbstractC4862t.a(cVar.f36239d, cVar2.f36239d)) {
            return AbstractC4862t.a(cVar.f36240e, cVar2.f36240e);
        }
        return false;
    }

    public static final boolean e(p.d dVar, Object obj) {
        AbstractC4862t.e(dVar, "<this>");
        if (dVar == obj) {
            return true;
        }
        if (!(obj instanceof p.d)) {
            return false;
        }
        p.d dVar2 = (p.d) obj;
        if (dVar.f36243b == dVar2.f36243b && AbstractC4862t.a(dVar.f36244c, dVar2.f36244c) && AbstractC4862t.a(dVar.f36245d, dVar2.f36245d)) {
            return C.P(dVar.f36242a, "index_", false, 2, null) ? C.P(dVar2.f36242a, "index_", false, 2, null) : AbstractC4862t.a(dVar.f36242a, dVar2.f36242a);
        }
        return false;
    }

    public static final boolean f(p pVar, Object obj) {
        Set set;
        AbstractC4862t.e(pVar, "<this>");
        if (pVar == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar2 = (p) obj;
        if (!AbstractC4862t.a(pVar.f36224a, pVar2.f36224a) || !AbstractC4862t.a(pVar.f36225b, pVar2.f36225b) || !AbstractC4862t.a(pVar.f36226c, pVar2.f36226c)) {
            return false;
        }
        Set set2 = pVar.f36227d;
        if (set2 == null || (set = pVar2.f36227d) == null) {
            return true;
        }
        return AbstractC4862t.a(set2, set);
    }

    public static final String g(Collection collection) {
        AbstractC4862t.e(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return v.j(C4179C.q0(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int h(p.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        return (((((aVar.f36229a.hashCode() * 31) + aVar.f36235g) * 31) + (aVar.f36231c ? 1231 : 1237)) * 31) + aVar.f36232d;
    }

    public static final int i(p.c cVar) {
        AbstractC4862t.e(cVar, "<this>");
        return (((((((cVar.f36236a.hashCode() * 31) + cVar.f36237b.hashCode()) * 31) + cVar.f36238c.hashCode()) * 31) + cVar.f36239d.hashCode()) * 31) + cVar.f36240e.hashCode();
    }

    public static final int j(p.d dVar) {
        AbstractC4862t.e(dVar, "<this>");
        return ((((((C.P(dVar.f36242a, "index_", false, 2, null) ? -1184239155 : dVar.f36242a.hashCode()) * 31) + (dVar.f36243b ? 1 : 0)) * 31) + dVar.f36244c.hashCode()) * 31) + dVar.f36245d.hashCode();
    }

    public static final int k(p pVar) {
        AbstractC4862t.e(pVar, "<this>");
        return (((pVar.f36224a.hashCode() * 31) + pVar.f36225b.hashCode()) * 31) + pVar.f36226c.hashCode();
    }

    public static final void l(Collection collection) {
        v.j(C4179C.q0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        v.j(" }", null, 1, null);
    }

    public static final void m(Collection collection) {
        v.j(C4179C.q0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        v.j("},", null, 1, null);
    }

    public static final String n(p.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Column {\n            |   name = '");
        sb2.append(aVar.f36229a);
        sb2.append("',\n            |   type = '");
        sb2.append(aVar.f36230b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(aVar.f36235g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(aVar.f36231c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(aVar.f36232d);
        sb2.append("',\n            |   defaultValue = '");
        String str = aVar.f36233e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return v.j(v.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String o(p.c cVar) {
        AbstractC4862t.e(cVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(cVar.f36236a);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(cVar.f36237b);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(cVar.f36238c);
        sb2.append("',\n            |   columnNames = {");
        m(C4179C.I0(cVar.f36239d));
        C4015H c4015h = C4015H.f34254a;
        sb2.append(c4015h);
        sb2.append("\n            |   referenceColumnNames = {");
        l(C4179C.I0(cVar.f36240e));
        sb2.append(c4015h);
        sb2.append("\n            |}\n        ");
        return v.j(v.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String p(p.d dVar) {
        AbstractC4862t.e(dVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Index {\n            |   name = '");
        sb2.append(dVar.f36242a);
        sb2.append("',\n            |   unique = '");
        sb2.append(dVar.f36243b);
        sb2.append("',\n            |   columns = {");
        m(dVar.f36244c);
        C4015H c4015h = C4015H.f34254a;
        sb2.append(c4015h);
        sb2.append("\n            |   orders = {");
        l(dVar.f36245d);
        sb2.append(c4015h);
        sb2.append("\n            |}\n        ");
        return v.j(v.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String q(p pVar) {
        List listK;
        AbstractC4862t.e(pVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |TableInfo {\n            |    name = '");
        sb2.append(pVar.f36224a);
        sb2.append("',\n            |    columns = {");
        sb2.append(g(C4179C.J0(pVar.f36225b.values(), new a())));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(g(pVar.f36226c));
        sb2.append("\n            |    indices = {");
        Set set = pVar.f36227d;
        if (set == null || (listK = C4179C.J0(set, new b())) == null) {
            listK = C4206t.k();
        }
        sb2.append(g(listK));
        sb2.append("\n            |}\n        ");
        return v.p(sb2.toString(), null, 1, null);
    }
}
