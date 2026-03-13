package X6;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S3 f18556c = new S3(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f18557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18558b;

    public S3(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(R3.class);
        this.f18557a = enumMap;
        enumMap.put(R3.AD_STORAGE, h(null));
        enumMap.put(R3.ANALYTICS_STORAGE, h(null));
        this.f18558b = i10;
    }

    public static S3 a(P3 p32, P3 p33, int i10) {
        EnumMap enumMap = new EnumMap(R3.class);
        enumMap.put(R3.AD_STORAGE, p32);
        enumMap.put(R3.ANALYTICS_STORAGE, p33);
        return new S3(enumMap, -10);
    }

    public static String d(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static S3 e(Bundle bundle, int i10) {
        if (bundle == null) {
            return new S3(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(R3.class);
        for (R3 r32 : Q3.STORAGE.b()) {
            enumMap.put(r32, g(bundle.getString(r32.zze)));
        }
        return new S3(enumMap, i10);
    }

    public static S3 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(R3.class);
        R3[] r3ArrA = Q3.STORAGE.a();
        for (int i11 = 0; i11 < r3ArrA.length; i11++) {
            String str2 = str == null ? "" : str;
            R3 r32 = r3ArrA[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(r32, j(str2.charAt(i12)));
            } else {
                enumMap.put(r32, P3.UNINITIALIZED);
            }
        }
        return new S3(enumMap, i10);
    }

    public static P3 g(String str) {
        return str == null ? P3.UNINITIALIZED : str.equals("granted") ? P3.GRANTED : str.equals("denied") ? P3.DENIED : P3.UNINITIALIZED;
    }

    public static P3 h(Boolean bool) {
        return bool == null ? P3.UNINITIALIZED : bool.booleanValue() ? P3.GRANTED : P3.DENIED;
    }

    public static String i(P3 p32) {
        int iOrdinal = p32.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static P3 j(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? P3.UNINITIALIZED : P3.GRANTED : P3.DENIED : P3.POLICY;
    }

    public static char m(P3 p32) {
        if (p32 == null) {
            return '-';
        }
        int iOrdinal = p32.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final int b() {
        return this.f18558b;
    }

    public final boolean c() {
        Iterator it = this.f18557a.values().iterator();
        while (it.hasNext()) {
            if (((P3) it.next()) != P3.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S3)) {
            return false;
        }
        S3 s32 = (S3) obj;
        for (R3 r32 : Q3.STORAGE.b()) {
            if (this.f18557a.get(r32) != s32.f18557a.get(r32)) {
                return false;
            }
        }
        return this.f18558b == s32.f18558b;
    }

    public final int hashCode() {
        Iterator it = this.f18557a.values().iterator();
        int iHashCode = this.f18558b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((P3) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            X6.Q3 r1 = X6.Q3.STORAGE
            X6.R3[] r1 = r1.a()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f18557a
            java.lang.Object r4 = r5.get(r4)
            X6.P3 r4 = (X6.P3) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.S3.k():java.lang.String");
    }

    public final String l() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (R3 r32 : Q3.STORAGE.a()) {
            sb2.append(m((P3) this.f18557a.get(r32)));
        }
        return sb2.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f18557a.entrySet()) {
            String strI = i((P3) entry.getValue());
            if (strI != null) {
                bundle.putString(((R3) entry.getKey()).zze, strI);
            }
        }
        return bundle;
    }

    public final boolean o(R3 r32) {
        return ((P3) this.f18557a.get(r32)) != P3.DENIED;
    }

    public final P3 p() {
        P3 p32 = (P3) this.f18557a.get(R3.AD_STORAGE);
        return p32 == null ? P3.UNINITIALIZED : p32;
    }

    public final P3 q() {
        P3 p32 = (P3) this.f18557a.get(R3.ANALYTICS_STORAGE);
        return p32 == null ? P3.UNINITIALIZED : p32;
    }

    public final boolean r(S3 s32) {
        EnumMap enumMap = this.f18557a;
        for (R3 r32 : (R3[]) enumMap.keySet().toArray(new R3[0])) {
            P3 p32 = (P3) enumMap.get(r32);
            P3 p33 = (P3) s32.f18557a.get(r32);
            P3 p34 = P3.DENIED;
            if (p32 == p34 && p33 != p34) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X6.S3 s(X6.S3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<X6.R3> r1 = X6.R3.class
            r0.<init>(r1)
            X6.Q3 r1 = X6.Q3.STORAGE
            X6.R3[] r1 = r1.b()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f18557a
            java.lang.Object r5 = r5.get(r4)
            X6.P3 r5 = (X6.P3) r5
            java.util.EnumMap r6 = r9.f18557a
            java.lang.Object r6 = r6.get(r4)
            X6.P3 r6 = (X6.P3) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            X6.P3 r7 = X6.P3.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            X6.P3 r7 = X6.P3.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            X6.P3 r7 = X6.P3.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            X6.P3 r5 = X6.P3.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            X6.S3 r8 = new X6.S3
            r9 = 100
            r8.<init>(r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.S3.s(X6.S3):X6.S3");
    }

    public final S3 t(S3 s32) {
        EnumMap enumMap = new EnumMap(R3.class);
        for (R3 r32 : Q3.STORAGE.b()) {
            P3 p32 = (P3) this.f18557a.get(r32);
            if (p32 == P3.UNINITIALIZED) {
                p32 = (P3) s32.f18557a.get(r32);
            }
            if (p32 != null) {
                enumMap.put(r32, p32);
            }
        }
        return new S3(enumMap, this.f18558b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d(this.f18558b));
        for (R3 r32 : Q3.STORAGE.b()) {
            sb2.append(",");
            sb2.append(r32.zze);
            sb2.append("=");
            P3 p32 = (P3) this.f18557a.get(r32);
            if (p32 == null) {
                p32 = P3.UNINITIALIZED;
            }
            sb2.append(p32);
        }
        return sb2.toString();
    }

    public S3(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(R3.class);
        this.f18557a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f18558b = i10;
    }
}
