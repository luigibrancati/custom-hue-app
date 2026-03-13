package h3;

import Od.F;
import gc.C4179C;
import gc.C4205s;
import gc.C4207u;
import gc.P;
import gc.Q;
import gc.T;
import h3.p;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jc.C4757a;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;
import tc.AbstractC5877a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f36221a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4757a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4757a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
        }
    }

    public static final int a(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC4862t.d(upperCase, "toUpperCase(...)");
        if (F.V(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (F.V(upperCase, "CHAR", false, 2, null) || F.V(upperCase, "CLOB", false, 2, null) || F.V(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (F.V(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (F.V(upperCase, "REAL", false, 2, null) || F.V(upperCase, "FLOA", false, 2, null) || F.V(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    public static final Map b(InterfaceC4792b interfaceC4792b, String str) throws Exception {
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("PRAGMA table_info(`" + str + "`)");
        try {
            if (!interfaceC4794dA1.X0()) {
                Map mapI = Q.i();
                AbstractC5877a.a(interfaceC4794dA1, null);
                return mapI;
            }
            int iA = k.a(interfaceC4794dA1, "name");
            int iA2 = k.a(interfaceC4794dA1, "type");
            int iA3 = k.a(interfaceC4794dA1, "notnull");
            int iA4 = k.a(interfaceC4794dA1, "pk");
            int iA5 = k.a(interfaceC4794dA1, "dflt_value");
            Map mapC = P.c();
            do {
                String strK0 = interfaceC4794dA1.K0(iA);
                mapC.put(strK0, new p.a(strK0, interfaceC4794dA1.K0(iA2), interfaceC4794dA1.getLong(iA3) != 0, (int) interfaceC4794dA1.getLong(iA4), interfaceC4794dA1.isNull(iA5) ? null : interfaceC4794dA1.K0(iA5), 2));
            } while (interfaceC4794dA1.X0());
            Map mapB = P.b(mapC);
            AbstractC5877a.a(interfaceC4794dA1, null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC5877a.a(interfaceC4794dA1, th);
                throw th2;
            }
        }
    }

    public static final List c(InterfaceC4794d interfaceC4794d) {
        int iA = k.a(interfaceC4794d, "id");
        int iA2 = k.a(interfaceC4794d, Session.JsonKeys.SEQ);
        int iA3 = k.a(interfaceC4794d, "from");
        int iA4 = k.a(interfaceC4794d, "to");
        List listC = C4205s.c();
        while (interfaceC4794d.X0()) {
            listC.add(new e((int) interfaceC4794d.getLong(iA), (int) interfaceC4794d.getLong(iA2), interfaceC4794d.K0(iA3), interfaceC4794d.K0(iA4)));
        }
        return C4179C.I0(C4205s.a(listC));
    }

    public static final Set d(InterfaceC4792b interfaceC4792b, String str) throws Exception {
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iA = k.a(interfaceC4794dA1, "id");
            int iA2 = k.a(interfaceC4794dA1, Session.JsonKeys.SEQ);
            int iA3 = k.a(interfaceC4794dA1, "table");
            int iA4 = k.a(interfaceC4794dA1, "on_delete");
            int iA5 = k.a(interfaceC4794dA1, "on_update");
            List listC = c(interfaceC4794dA1);
            interfaceC4794dA1.reset();
            Set setB = T.b();
            while (interfaceC4794dA1.X0()) {
                if (interfaceC4794dA1.getLong(iA2) == 0) {
                    int i10 = (int) interfaceC4794dA1.getLong(iA);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e> arrayList3 = new ArrayList();
                    for (Object obj : listC) {
                        if (((e) obj).j() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (e eVar : arrayList3) {
                        arrayList.add(eVar.b());
                        arrayList2.add(eVar.p());
                    }
                    setB.add(new p.c(interfaceC4794dA1.K0(iA3), interfaceC4794dA1.K0(iA4), interfaceC4794dA1.K0(iA5), arrayList, arrayList2));
                }
            }
            Set setA = T.a(setB);
            AbstractC5877a.a(interfaceC4794dA1, null);
            return setA;
        } finally {
        }
    }

    public static final p.d e(InterfaceC4792b interfaceC4792b, String str, boolean z10) throws Exception {
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = k.a(interfaceC4794dA1, "seqno");
            int iA2 = k.a(interfaceC4794dA1, "cid");
            int iA3 = k.a(interfaceC4794dA1, "name");
            int iA4 = k.a(interfaceC4794dA1, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (interfaceC4794dA1.X0()) {
                    if (((int) interfaceC4794dA1.getLong(iA2)) >= 0) {
                        int i10 = (int) interfaceC4794dA1.getLong(iA);
                        String strK0 = interfaceC4794dA1.K0(iA3);
                        String str2 = interfaceC4794dA1.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), strK0);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listJ0 = C4179C.J0(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(C4207u.v(listJ0, 10));
                Iterator it = listJ0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listV0 = C4179C.V0(arrayList);
                List listJ02 = C4179C.J0(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(C4207u.v(listJ02, 10));
                Iterator it2 = listJ02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                p.d dVar = new p.d(str, z10, listV0, C4179C.V0(arrayList2));
                AbstractC5877a.a(interfaceC4794dA1, null);
                return dVar;
            }
            AbstractC5877a.a(interfaceC4794dA1, null);
            return null;
        } finally {
        }
    }

    public static final Set f(InterfaceC4792b interfaceC4792b, String str) throws Exception {
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1("PRAGMA index_list(`" + str + "`)");
        try {
            int iA = k.a(interfaceC4794dA1, "name");
            int iA2 = k.a(interfaceC4794dA1, "origin");
            int iA3 = k.a(interfaceC4794dA1, "unique");
            if (iA != -1 && iA2 != -1 && iA3 != -1) {
                Set setB = T.b();
                while (interfaceC4794dA1.X0()) {
                    if (AbstractC4862t.a("c", interfaceC4794dA1.K0(iA2))) {
                        p.d dVarE = e(interfaceC4792b, interfaceC4794dA1.K0(iA), interfaceC4794dA1.getLong(iA3) == 1);
                        if (dVarE == null) {
                            AbstractC5877a.a(interfaceC4794dA1, null);
                            return null;
                        }
                        setB.add(dVarE);
                    }
                }
                Set setA = T.a(setB);
                AbstractC5877a.a(interfaceC4794dA1, null);
                return setA;
            }
            AbstractC5877a.a(interfaceC4794dA1, null);
            return null;
        } finally {
        }
    }

    public static final p g(InterfaceC4792b connection, String tableName) {
        AbstractC4862t.e(connection, "connection");
        AbstractC4862t.e(tableName, "tableName");
        return new p(tableName, b(connection, tableName), d(connection, tableName), f(connection, tableName));
    }
}
