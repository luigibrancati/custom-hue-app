package o2;

import G1.C;
import i2.C4334n;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5200d extends AbstractC5201e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f41140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f41141d;

    public C5200d() {
        super(new C4334n());
        this.f41139b = -9223372036854775807L;
        this.f41140c = new long[0];
        this.f41141d = new long[0];
    }

    public static Boolean g(C c10) {
        return Boolean.valueOf(c10.L() == 1);
    }

    public static Object h(C c10, int i10) {
        if (i10 == 0) {
            return j(c10);
        }
        if (i10 == 1) {
            return g(c10);
        }
        if (i10 == 2) {
            return n(c10);
        }
        if (i10 == 3) {
            return l(c10);
        }
        if (i10 == 8) {
            return k(c10);
        }
        if (i10 == 10) {
            return m(c10);
        }
        if (i10 != 11) {
            return null;
        }
        return i(c10);
    }

    public static Date i(C c10) {
        Date date = new Date((long) j(c10).doubleValue());
        c10.b0(2);
        return date;
    }

    public static Double j(C c10) {
        return Double.valueOf(Double.longBitsToDouble(c10.E()));
    }

    public static HashMap k(C c10) {
        int iP = c10.P();
        HashMap map = new HashMap(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            String strN = n(c10);
            Object objH = h(c10, o(c10));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    public static HashMap l(C c10) {
        HashMap map = new HashMap();
        while (true) {
            String strN = n(c10);
            int iO = o(c10);
            if (iO == 9) {
                return map;
            }
            Object objH = h(c10, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    public static ArrayList m(C c10) {
        int iP = c10.P();
        ArrayList arrayList = new ArrayList(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            Object objH = h(c10, o(c10));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    public static String n(C c10) {
        int iT = c10.T();
        int iG = c10.g();
        c10.b0(iT);
        return new String(c10.f(), iG, iT);
    }

    public static int o(C c10) {
        return c10.L();
    }

    @Override // o2.AbstractC5201e
    public boolean b(C c10) {
        return true;
    }

    @Override // o2.AbstractC5201e
    public boolean c(C c10, long j10) {
        if (o(c10) != 2 || !"onMetaData".equals(n(c10)) || c10.a() == 0 || o(c10) != 8) {
            return false;
        }
        HashMap mapK = k(c10);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f41139b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f41140c = new long[size];
                this.f41141d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f41140c = new long[0];
                        this.f41141d = new long[0];
                        break;
                    }
                    this.f41140c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f41141d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f41139b;
    }

    public long[] e() {
        return this.f41141d;
    }

    public long[] f() {
        return this.f41140c;
    }
}
