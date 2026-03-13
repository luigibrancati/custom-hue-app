package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X0 f29820d = new X0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3432m2 f29821a = new C3397f2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29823c;

    public X0() {
    }

    public static int a(W0 w02, Object obj) {
        int iF;
        int iA;
        D2 d2C = w02.c();
        int iZza = w02.zza();
        w02.i();
        int iA2 = O0.a(iZza << 3);
        if (d2C == D2.zzj) {
            Charset charset = AbstractC3446p1.f29896a;
            if (((J1) obj) instanceof AbstractC3459s0) {
                throw null;
            }
            iA2 += iA2;
        }
        E2 e22 = E2.INT;
        int iB = 4;
        switch (d2C.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 1:
                ((Float) obj).getClass();
                return iA2 + iB;
            case 2:
                iB = O0.b(((Long) obj).longValue());
                return iA2 + iB;
            case 3:
                iB = O0.b(((Long) obj).longValue());
                return iA2 + iB;
            case 4:
                iB = O0.b(((Integer) obj).intValue());
                return iA2 + iB;
            case 5:
                ((Long) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 6:
                ((Integer) obj).getClass();
                return iA2 + iB;
            case 7:
                ((Boolean) obj).getClass();
                iB = 1;
                return iA2 + iB;
            case 8:
                if (!(obj instanceof G0)) {
                    iB = O0.C((String) obj);
                    return iA2 + iB;
                }
                iF = ((G0) obj).f();
                iA = O0.a(iF);
                iB = iA + iF;
                return iA2 + iB;
            case 9:
                iB = ((J1) obj).a();
                return iA2 + iB;
            case 10:
                iB = O0.A((J1) obj);
                return iA2 + iB;
            case 11:
                if (obj instanceof G0) {
                    iF = ((G0) obj).f();
                    iA = O0.a(iF);
                } else {
                    iF = ((byte[]) obj).length;
                    iA = O0.a(iF);
                }
                iB = iA + iF;
                return iA2 + iB;
            case 12:
                iB = O0.a(((Integer) obj).intValue());
                return iA2 + iB;
            case 13:
                iB = obj instanceof InterfaceC3416j1 ? O0.b(((InterfaceC3416j1) obj).zza()) : O0.b(((Integer) obj).intValue());
                return iA2 + iB;
            case 14:
                ((Integer) obj).getClass();
                return iA2 + iB;
            case 15:
                ((Long) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iB = O0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iA2 + iB;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iB = O0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iA2 + iB;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static X0 d() {
        return f29820d;
    }

    public static Object l(Object obj) {
        if (obj instanceof O1) {
            return ((O1) obj).b();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static boolean n(Map.Entry entry) {
        W0 w02 = (W0) entry.getKey();
        if (w02.d() != E2.MESSAGE) {
            return true;
        }
        w02.i();
        Object value = entry.getValue();
        if (value instanceof K1) {
            return ((K1) value).v();
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static final int o(Map.Entry entry) {
        W0 w02 = (W0) entry.getKey();
        Object value = entry.getValue();
        if (w02.d() != E2.MESSAGE) {
            return a(w02, value);
        }
        w02.i();
        w02.e();
        int iZza = ((W0) entry.getKey()).zza();
        int iA = O0.a(8);
        return iA + iA + O0.a(16) + O0.a(iZza) + O0.a(24) + O0.A((J1) value);
    }

    public final int b() {
        int iC = this.f29821a.c();
        int iO = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iO += o(this.f29821a.g(i10));
        }
        Iterator it = this.f29821a.d().iterator();
        while (it.hasNext()) {
            iO += o((Map.Entry) it.next());
        }
        return iO;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final X0 clone() {
        X0 x02 = new X0();
        int iC = this.f29821a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryG = this.f29821a.g(i10);
            x02.i((W0) ((C3402g2) entryG).a(), entryG.getValue());
        }
        for (Map.Entry entry : this.f29821a.d()) {
            x02.i((W0) entry.getKey(), entry.getValue());
        }
        x02.f29823c = this.f29823c;
        return x02;
    }

    public final Object e(W0 w02) {
        return this.f29821a.get(w02);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X0) {
            return this.f29821a.equals(((X0) obj).f29821a);
        }
        return false;
    }

    public final Iterator f() {
        return this.f29821a.isEmpty() ? Collections.emptyIterator() : this.f29823c ? new C3470u1(this.f29821a.entrySet().iterator()) : this.f29821a.entrySet().iterator();
    }

    public final void g() {
        if (this.f29822b) {
            return;
        }
        int iC = this.f29821a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryG = this.f29821a.g(i10);
            if (entryG.getValue() instanceof AbstractC3406h1) {
                ((AbstractC3406h1) entryG.getValue()).A();
            }
        }
        this.f29821a.a();
        this.f29822b = true;
    }

    public final void h(X0 x02) {
        int iC = x02.f29821a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            m(x02.f29821a.g(i10));
        }
        Iterator it = x02.f29821a.d().iterator();
        while (it.hasNext()) {
            m((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f29821a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3416j1) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0 r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.i()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.D2 r0 = r3.c()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3446p1.f29896a
            r4.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.D2 r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.D2.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.E2 r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.E2.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.E2 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L42;
                case 1: goto L3f;
                case 2: goto L3c;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L2a;
                case 7: goto L21;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L4c
        L1c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
            if (r0 == 0) goto L4c
            goto L46
        L21:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3416j1
            if (r0 == 0) goto L4c
            goto L46
        L2a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L4c
            goto L46
        L33:
            boolean r0 = r4 instanceof java.lang.String
            goto L44
        L36:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r0 = r4 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r0 = r4 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r0 = r4 instanceof java.lang.Long
            goto L44
        L42:
            boolean r0 = r4 instanceof java.lang.Integer
        L44:
            if (r0 == 0) goto L4c
        L46:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.m2 r2 = r2.f29821a
            r2.put(r3, r4)
            return
        L4c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            int r0 = r3.zza()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.D2 r3 = r3.c()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.E2 r3 = r3.a()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.X0.i(com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0, java.lang.Object):void");
    }

    public final boolean j() {
        return this.f29822b;
    }

    public final boolean k() {
        int iC = this.f29821a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!n(this.f29821a.g(i10))) {
                return false;
            }
        }
        Iterator it = this.f29821a.d().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void m(Map.Entry entry) {
        W0 w02 = (W0) entry.getKey();
        Object value = entry.getValue();
        w02.i();
        if (w02.d() != E2.MESSAGE) {
            this.f29821a.put(w02, l(value));
            return;
        }
        Object objE = e(w02);
        if (objE == null) {
            this.f29821a.put(w02, l(value));
        } else {
            this.f29821a.put(w02, objE instanceof O1 ? w02.t((O1) objE, (O1) value) : w02.r(((J1) objE).x(), (J1) value).k());
        }
    }

    public X0(boolean z10) {
        g();
        g();
    }
}
