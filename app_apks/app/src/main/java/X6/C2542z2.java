package X6;

import android.text.TextUtils;
import android.util.Log;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.z2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2542z2 extends M3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f19331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f19333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2526x2 f19334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2526x2 f19335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2526x2 f19336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2526x2 f19337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2526x2 f19338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2526x2 f19339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2526x2 f19340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2526x2 f19341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C2526x2 f19342n;

    public C2542z2(C2416j3 c2416j3) {
        super(c2416j3);
        this.f19331c = (char) 0;
        this.f19332d = -1L;
        this.f19334f = new C2526x2(this, 6, false, false);
        this.f19335g = new C2526x2(this, 6, true, false);
        this.f19336h = new C2526x2(this, 6, false, true);
        this.f19337i = new C2526x2(this, 5, false, false);
        this.f19338j = new C2526x2(this, 5, true, false);
        this.f19339k = new C2526x2(this, 5, false, true);
        this.f19340l = new C2526x2(this, 4, false, false);
        this.f19341m = new C2526x2(this, 3, false, false);
        this.f19342n = new C2526x2(this, 2, false, false);
    }

    public static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(z10, obj);
        String strB2 = B(z10, obj2);
        String strB3 = B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb2.append(str2);
            sb2.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb2.append(str3);
            sb2.append(strB3);
        }
        return sb2.toString();
    }

    public static String B(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C2534y2 ? ((C2534y2) obj).a() : z10 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String strC = C(C2416j3.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(strC)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb3.toString();
    }

    public static String C(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    public static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new C2534y2(str);
    }

    public final /* synthetic */ char D() {
        return this.f19331c;
    }

    public final /* synthetic */ void E(char c10) {
        this.f19331c = c10;
    }

    public final /* synthetic */ long F() {
        return this.f19332d;
    }

    public final /* synthetic */ void G(long j10) {
        this.f19332d = 133005L;
    }

    @Override // X6.M3
    public final boolean i() {
        return false;
    }

    public final C2526x2 o() {
        return this.f19334f;
    }

    public final C2526x2 p() {
        return this.f19335g;
    }

    public final C2526x2 q() {
        return this.f19336h;
    }

    public final C2526x2 r() {
        return this.f19337i;
    }

    public final C2526x2 s() {
        return this.f19338j;
    }

    public final C2526x2 t() {
        return this.f19339k;
    }

    public final C2526x2 u() {
        return this.f19340l;
    }

    public final C2526x2 v() {
        return this.f19341m;
    }

    public final C2526x2 w() {
        return this.f19342n;
    }

    public final void y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        AbstractC6056k.l(str);
        C2384f3 c2384f3A = this.f18400a.A();
        if (c2384f3A == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c2384f3A.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            c2384f3A.t(new RunnableC2518w2(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f19333e == null) {
                    this.f19333e = this.f18400a.w().u();
                }
                AbstractC6056k.l(this.f19333e);
                str = this.f19333e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
