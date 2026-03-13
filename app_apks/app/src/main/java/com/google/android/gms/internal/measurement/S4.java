package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S4 f29326d = new S4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V5 f29327a = new R5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29329c;

    public S4() {
    }

    public static S4 a() {
        return f29326d;
    }

    public static void f(J4 j42, EnumC3230j6 enumC3230j6, int i10, Object obj) {
        if (enumC3230j6 == EnumC3230j6.zzj) {
            C5 c52 = (C5) obj;
            AbstractC3211h5.d(c52);
            j42.i(i10, 3);
            c52.g(j42);
            j42.i(i10, 4);
            return;
        }
        j42.i(i10, enumC3230j6.b());
        EnumC3239k6 enumC3239k6 = EnumC3239k6.INT;
        switch (enumC3230j6.ordinal()) {
            case 0:
                j42.C(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                j42.A(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                j42.B(((Long) obj).longValue());
                break;
            case 3:
                j42.B(((Long) obj).longValue());
                break;
            case 4:
                j42.y(((Integer) obj).intValue());
                break;
            case 5:
                j42.C(((Long) obj).longValue());
                break;
            case 6:
                j42.A(((Integer) obj).intValue());
                break;
            case 7:
                j42.x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof E4)) {
                    j42.E((String) obj);
                } else {
                    j42.r((E4) obj);
                }
                break;
            case 9:
                ((C5) obj).g(j42);
                break;
            case 10:
                j42.w((C5) obj);
                break;
            case 11:
                if (!(obj instanceof E4)) {
                    byte[] bArr = (byte[]) obj;
                    j42.s(bArr, 0, bArr.length);
                } else {
                    j42.r((E4) obj);
                }
                break;
            case 12:
                j42.z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC3166c5)) {
                    j42.y(((Integer) obj).intValue());
                } else {
                    j42.y(((InterfaceC3166c5) obj).zza());
                }
                break;
            case 14:
                j42.A(((Integer) obj).intValue());
                break;
            case 15:
                j42.C(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                j42.z((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                j42.B((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int h(EnumC3230j6 enumC3230j6, int i10, Object obj) {
        int iG = J4.G(i10 << 3);
        if (enumC3230j6 == EnumC3230j6.zzj) {
            AbstractC3211h5.d((C5) obj);
            iG += iG;
        }
        return iG + i(enumC3230j6, obj);
    }

    public static int i(EnumC3230j6 enumC3230j6, Object obj) {
        int iE;
        int iG;
        EnumC3230j6 enumC3230j62 = EnumC3230j6.zza;
        EnumC3239k6 enumC3239k6 = EnumC3239k6.INT;
        switch (enumC3230j6.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = J4.f29243b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = J4.f29243b;
                return 4;
            case 2:
                return J4.a(((Long) obj).longValue());
            case 3:
                return J4.a(((Long) obj).longValue());
            case 4:
                return J4.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = J4.f29243b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = J4.f29243b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = J4.f29243b;
                return 1;
            case 8:
                if (!(obj instanceof E4)) {
                    return J4.b((String) obj);
                }
                Logger logger6 = J4.f29243b;
                iE = ((E4) obj).e();
                iG = J4.G(iE);
                break;
                break;
            case 9:
                return ((C5) obj).a();
            case 10:
                return J4.c((C5) obj);
            case 11:
                if (!(obj instanceof E4)) {
                    Logger logger7 = J4.f29243b;
                    iE = ((byte[]) obj).length;
                    iG = J4.G(iE);
                } else {
                    Logger logger8 = J4.f29243b;
                    iE = ((E4) obj).e();
                    iG = J4.G(iE);
                }
                break;
            case 12:
                return J4.G(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC3166c5 ? J4.a(((InterfaceC3166c5) obj).zza()) : J4.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = J4.f29243b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = J4.f29243b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return J4.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return J4.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iG + iE;
    }

    public static int j(R4 r42, Object obj) {
        EnumC3230j6 enumC3230j6Zzb = r42.zzb();
        int iZza = r42.zza();
        if (!r42.c()) {
            return h(enumC3230j6Zzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!r42.d()) {
            int iH = 0;
            while (i10 < size) {
                iH += h(enumC3230j6Zzb, iZza, list.get(i10));
                i10++;
            }
            return iH;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i11 = 0;
        while (i10 < size) {
            i11 += i(enumC3230j6Zzb, list.get(i10));
            i10++;
        }
        return J4.G(iZza << 3) + i11 + J4.G(i11);
    }

    public static boolean k(Map.Entry entry) {
        android.support.v4.media.session.a.a(entry.getKey());
        throw null;
    }

    public static final int l(Map.Entry entry) {
        android.support.v4.media.session.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(com.google.android.gms.internal.measurement.R4 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.j6 r0 = r2.zzb()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.measurement.AbstractC3211h5.f29486a
            r3.getClass()
            com.google.android.gms.internal.measurement.j6 r1 = com.google.android.gms.internal.measurement.EnumC3230j6.zza
            com.google.android.gms.internal.measurement.k6 r1 = com.google.android.gms.internal.measurement.EnumC3239k6.INT
            com.google.android.gms.internal.measurement.k6 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.C5
            if (r0 == 0) goto L44
            return
        L1e:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L26
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.InterfaceC3166c5
            if (r0 == 0) goto L44
        L26:
            return
        L27:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.E4
            if (r0 != 0) goto L2f
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L44
        L2f:
            return
        L30:
            boolean r0 = r3 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r3 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r3 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r3 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r3 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.j6 r2 = r2.zzb()
            com.google.android.gms.internal.measurement.k6 r2 = r2.a()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.S4.m(com.google.android.gms.internal.measurement.R4, java.lang.Object):void");
    }

    public final void b() {
        if (this.f29328b) {
            return;
        }
        V5 v52 = this.f29327a;
        int iC = v52.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = v52.d(i10).getValue();
            if (value instanceof AbstractC3148a5) {
                ((AbstractC3148a5) value).o();
            }
        }
        Iterator it = v52.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC3148a5) {
                ((AbstractC3148a5) value2).o();
            }
        }
        v52.a();
        this.f29328b = true;
    }

    public final Iterator c() {
        V5 v52 = this.f29327a;
        return v52.isEmpty() ? Collections.emptyIterator() : this.f29329c ? new C3247l5(v52.entrySet().iterator()) : v52.entrySet().iterator();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        S4 s42 = new S4();
        V5 v52 = this.f29327a;
        int iC = v52.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryD = v52.d(i10);
            android.support.v4.media.session.a.a(((S5) entryD).a());
            s42.d(null, entryD.getValue());
        }
        for (Map.Entry entry : v52.e()) {
            android.support.v4.media.session.a.a(entry.getKey());
            s42.d(null, entry.getValue());
        }
        s42.f29329c = this.f29329c;
        return s42;
    }

    public final void d(R4 r42, Object obj) {
        if (!r42.c()) {
            m(r42, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                m(r42, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f29327a.put(r42, obj);
    }

    public final boolean e() {
        V5 v52 = this.f29327a;
        int iC = v52.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!k(v52.d(i10))) {
                return false;
            }
        }
        Iterator it = v52.e().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S4) {
            return this.f29327a.equals(((S4) obj).f29327a);
        }
        return false;
    }

    public final int g() {
        V5 v52 = this.f29327a;
        int iC = v52.c();
        int iL = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iL += l(v52.d(i10));
        }
        Iterator it = v52.e().iterator();
        while (it.hasNext()) {
            iL += l((Map.Entry) it.next());
        }
        return iL;
    }

    public final int hashCode() {
        return this.f29327a.hashCode();
    }

    public S4(boolean z10) {
        b();
        b();
    }
}
