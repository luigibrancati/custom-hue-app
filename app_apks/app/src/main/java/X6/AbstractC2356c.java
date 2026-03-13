package X6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2356c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f18721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f18722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f18723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f18724f;

    public AbstractC2356c(String str, int i10) {
        this.f18719a = str;
        this.f18720b = i10;
    }

    public static Boolean d(String str, int i10, boolean z10, String str2, List list, String str3, C2542z2 c2542z2) {
        if (i10 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 != null) {
                    try {
                    } catch (PatternSyntaxException unused) {
                        if (c2542z2 != null) {
                            c2542z2.r().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                    break;
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    public static Boolean e(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public static Boolean f(String str, com.google.android.gms.internal.measurement.K1 k12, C2542z2 c2542z2) {
        List list;
        AbstractC6056k.l(k12);
        if (str == null || !k12.D() || k12.M() == 1 || (k12.M() != 7 ? !k12.E() : k12.J() == 0)) {
            return null;
        }
        int iM = k12.M();
        boolean zH = k12.H();
        String strF = (zH || iM == 2 || iM == 7) ? k12.F() : k12.F().toUpperCase(Locale.ENGLISH);
        if (k12.J() == 0) {
            list = null;
        } else {
            List listI = k12.I();
            if (!zH) {
                ArrayList arrayList = new ArrayList(listI.size());
                Iterator it = listI.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listI = Collections.unmodifiableList(arrayList);
            }
            list = listI;
        }
        return d(str, iM, zH, strF, list, iM == 2 ? strF : null, c2542z2);
    }

    public static Boolean g(long j10, com.google.android.gms.internal.measurement.E1 e12) {
        try {
            return j(new BigDecimal(j10), e12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(double d10, com.google.android.gms.internal.measurement.E1 e12) {
        try {
            return j(new BigDecimal(d10), e12, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean i(String str, com.google.android.gms.internal.measurement.E1 e12) {
        if (!V6.O(str)) {
            return null;
        }
        try {
            return j(new BigDecimal(str), e12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean j(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.E1 e12, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC6056k.l(e12);
        if (e12.D()) {
            if (e12.O() != 1) {
                if (e12.O() == 5) {
                    if (!e12.I() || !e12.K()) {
                        return null;
                    }
                } else if (!e12.G()) {
                    return null;
                }
                int iO = e12.O();
                if (e12.O() == 5) {
                    if (V6.O(e12.J()) && V6.O(e12.L())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(e12.J());
                            bigDecimal4 = new BigDecimal(e12.L());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!V6.O(e12.H())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(e12.H());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iO == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = iO - 1;
                if (i10 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i10 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i10 != 3) {
                    if (i10 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d10 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
