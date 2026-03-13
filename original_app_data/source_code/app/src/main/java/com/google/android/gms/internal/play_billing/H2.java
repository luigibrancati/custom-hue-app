package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H2 f30035d = new H2(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F3 f30036a = new A3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30038c;

    public H2() {
    }

    public static int a(T3 t32, int i10, Object obj) {
        AbstractC3638x2.B(i10 << 3);
        if (T3.zzj == null) {
            Charset charset = T2.f30091a;
            if (((InterfaceC3568l3) obj) instanceof AbstractC3513c2) {
                throw null;
            }
        }
        U3 u32 = U3.INT;
        throw null;
    }

    public static int b(G2 g22, Object obj) {
        T3 t3Zzb = g22.zzb();
        int iZza = g22.zza();
        if (!g22.d()) {
            return a(t3Zzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!g22.c()) {
            int iA = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iA += a(t3Zzb, iZza, list.get(i10));
            }
            return iA;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return AbstractC3638x2.B(iZza << 3) + AbstractC3638x2.B(0);
        }
        list.get(0);
        T3 t32 = T3.zza;
        U3 u32 = U3.INT;
        throw null;
    }

    public static H2 d() {
        return f30035d;
    }

    public static boolean i(Map.Entry entry) {
        android.support.v4.media.session.a.a(entry.getKey());
        throw null;
    }

    public static final int j(Map.Entry entry) {
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
    public static final void k(com.google.android.gms.internal.play_billing.G2 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.play_billing.T3 r0 = r2.zzb()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.play_billing.T2.f30091a
            r3.getClass()
            com.google.android.gms.internal.play_billing.T3 r1 = com.google.android.gms.internal.play_billing.T3.zza
            com.google.android.gms.internal.play_billing.U3 r1 = com.google.android.gms.internal.play_billing.U3.INT
            com.google.android.gms.internal.play_billing.U3 r0 = r0.a()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.InterfaceC3568l3
            if (r0 == 0) goto L44
            return
        L1e:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L26
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.EnumC3581n4
            if (r0 == 0) goto L44
        L26:
            return
        L27:
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.AbstractC3597q2
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
            com.google.android.gms.internal.play_billing.T3 r2 = r2.zzb()
            com.google.android.gms.internal.play_billing.U3 r2 = r2.a()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.H2.k(com.google.android.gms.internal.play_billing.G2, java.lang.Object):void");
    }

    public final int c() {
        int iC = this.f30036a.c();
        int iJ = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iJ += j(this.f30036a.g(i10));
        }
        Iterator it = this.f30036a.d().iterator();
        while (it.hasNext()) {
            iJ += j((Map.Entry) it.next());
        }
        return iJ;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        H2 h22 = new H2();
        int iC = this.f30036a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryG = this.f30036a.g(i10);
            android.support.v4.media.session.a.a(((B3) entryG).a());
            h22.g(null, entryG.getValue());
        }
        for (Map.Entry entry : this.f30036a.d()) {
            android.support.v4.media.session.a.a(entry.getKey());
            h22.g(null, entry.getValue());
        }
        h22.f30038c = this.f30038c;
        return h22;
    }

    public final Iterator e() {
        return this.f30036a.isEmpty() ? Collections.emptyIterator() : this.f30038c ? new X2(this.f30036a.entrySet().iterator()) : this.f30036a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H2) {
            return this.f30036a.equals(((H2) obj).f30036a);
        }
        return false;
    }

    public final void f() {
        if (this.f30037b) {
            return;
        }
        int iC = this.f30036a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = this.f30036a.g(i10).getValue();
            if (value instanceof O2) {
                ((O2) value).x();
            }
        }
        Iterator it = this.f30036a.d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof O2) {
                ((O2) value2).x();
            }
        }
        this.f30036a.a();
        this.f30037b = true;
    }

    public final void g(G2 g22, Object obj) {
        if (!g22.d()) {
            k(g22, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                k(g22, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f30036a.put(g22, obj);
    }

    public final boolean h() {
        int iC = this.f30036a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!i(this.f30036a.g(i10))) {
                return false;
            }
        }
        Iterator it = this.f30036a.d().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f30036a.hashCode();
    }

    public H2(boolean z10) {
        f();
        f();
    }
}
