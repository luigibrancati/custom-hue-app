package Ud;

import Rd.AbstractC2146p;
import Rd.C2142n;
import Rd.InterfaceC2127f0;
import Vd.AbstractC2320b;
import fc.C4015H;
import fc.C4032o;
import fc.C4035r;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class B extends AbstractC2320b implements v, InterfaceC2313e, Vd.q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Td.a f16971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f16972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16976k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2127f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B f16977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f16979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC4988e f16980d;

        public a(B b10, long j10, Object obj, InterfaceC4988e interfaceC4988e) {
            this.f16977a = b10;
            this.f16978b = j10;
            this.f16979c = obj;
            this.f16980d = interfaceC4988e;
        }

        @Override // Rd.InterfaceC2127f0
        public void dispose() {
            this.f16977a.v(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16981a;

        static {
            int[] iArr = new int[Td.a.values().length];
            try {
                iArr[Td.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Td.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Td.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16981a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f16982j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f16983k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f16984l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f16985m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f16986n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f16988p;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f16986n = obj;
            this.f16988p |= Integer.MIN_VALUE;
            return B.x(B.this, null, this);
        }
    }

    public B(int i10, int i11, Td.a aVar) {
        this.f16969d = i10;
        this.f16970e = i11;
        this.f16971f = aVar;
    }

    public static /* synthetic */ Object C(B b10, Object obj, InterfaceC4988e interfaceC4988e) throws Throwable {
        if (b10.N(obj)) {
            return C4015H.f34254a;
        }
        Object objD = b10.D(obj, interfaceC4988e);
        return objD == C5046c.f() ? objD : C4015H.f34254a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        Rd.C0.j(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        r0.f16982j = r5;
        r0.f16983k = r2;
        r0.f16984l = r9;
        r0.f16985m = r8;
        r0.f16988p = 3;
        r10 = r2.emit(r10, r0);
        r2 = r2;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r10 != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00ad, B:39:0x00b0, B:22:0x005d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab A[EDGE_INSN: B:52:0x00ab->B:37:0x00ab BREAK  A[LOOP:0: B:32:0x0092->B:55:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [Ud.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [Vd.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Ud.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Ud.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Vd.d] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [Ud.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [Ud.D] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00be -> B:16:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object x(Ud.B r8, Ud.InterfaceC2314f r9, lc.InterfaceC4988e r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof Ud.B.c
            if (r0 == 0) goto L13
            r0 = r10
            Ud.B$c r0 = (Ud.B.c) r0
            int r1 = r0.f16988p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16988p = r1
            goto L18
        L13:
            Ud.B$c r0 = new Ud.B$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16986n
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f16988p
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L77
            r8 = 1
            if (r2 == r8) goto L61
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.f16985m
            Rd.z0 r8 = (Rd.InterfaceC2166z0) r8
            java.lang.Object r9 = r0.f16984l
            Ud.D r9 = (Ud.D) r9
            java.lang.Object r2 = r0.f16983k
            Ud.f r2 = (Ud.InterfaceC2314f) r2
            java.lang.Object r5 = r0.f16982j
            Ud.B r5 = (Ud.B) r5
            fc.AbstractC4036s.b(r10)     // Catch: java.lang.Throwable -> L42
        L3e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L8f
        L42:
            r8 = move-exception
            goto Lc4
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.f16985m
            Rd.z0 r8 = (Rd.InterfaceC2166z0) r8
            java.lang.Object r9 = r0.f16984l
            Ud.D r9 = (Ud.D) r9
            java.lang.Object r2 = r0.f16983k
            Ud.f r2 = (Ud.InterfaceC2314f) r2
            java.lang.Object r5 = r0.f16982j
            Ud.B r5 = (Ud.B) r5
            fc.AbstractC4036s.b(r10)     // Catch: java.lang.Throwable -> L42
            goto L92
        L61:
            java.lang.Object r8 = r0.f16984l
            r9 = r8
            Ud.D r9 = (Ud.D) r9
            java.lang.Object r8 = r0.f16983k
            Ud.f r8 = (Ud.InterfaceC2314f) r8
            java.lang.Object r2 = r0.f16982j
            Ud.B r2 = (Ud.B) r2
            fc.AbstractC4036s.b(r10)     // Catch: java.lang.Throwable -> L74
            r10 = r8
            r8 = r2
            goto L83
        L74:
            r8 = move-exception
            r5 = r2
            goto Lc4
        L77:
            fc.AbstractC4036s.b(r10)
            Vd.d r10 = r8.e()
            Ud.D r10 = (Ud.D) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            lc.i r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lc1
            Rd.z0$b r5 = Rd.InterfaceC2166z0.f15218M     // Catch: java.lang.Throwable -> Lc1
            lc.i$b r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lc1
            Rd.z0 r2 = (Rd.InterfaceC2166z0) r2     // Catch: java.lang.Throwable -> Lc1
        L8f:
            r5 = r8
            r8 = r2
            r2 = r10
        L92:
            java.lang.Object r10 = r5.R(r9)     // Catch: java.lang.Throwable -> L42
            Wd.E r6 = Ud.C.f16989a     // Catch: java.lang.Throwable -> L42
            if (r10 != r6) goto Lab
            r0.f16982j = r5     // Catch: java.lang.Throwable -> L42
            r0.f16983k = r2     // Catch: java.lang.Throwable -> L42
            r0.f16984l = r9     // Catch: java.lang.Throwable -> L42
            r0.f16985m = r8     // Catch: java.lang.Throwable -> L42
            r0.f16988p = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r5.u(r9, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L92
            goto Lc0
        Lab:
            if (r8 == 0) goto Lb0
            Rd.C0.j(r8)     // Catch: java.lang.Throwable -> L42
        Lb0:
            r0.f16982j = r5     // Catch: java.lang.Throwable -> L42
            r0.f16983k = r2     // Catch: java.lang.Throwable -> L42
            r0.f16984l = r9     // Catch: java.lang.Throwable -> L42
            r0.f16985m = r8     // Catch: java.lang.Throwable -> L42
            r0.f16988p = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L3e
        Lc0:
            return r1
        Lc1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lc4:
            r5.h(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ud.B.x(Ud.B, Ud.f, lc.e):java.lang.Object");
    }

    @Override // Vd.AbstractC2320b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public D[] g(int i10) {
        return new D[i10];
    }

    public final void B() {
        Object[] objArr = this.f16972g;
        AbstractC4862t.b(objArr);
        C.f(objArr, H(), null);
        this.f16975j--;
        long jH = H() + 1;
        if (this.f16973h < jH) {
            this.f16973h = jH;
        }
        if (this.f16974i < jH) {
            y(jH);
        }
    }

    public final Object D(Object obj, InterfaceC4988e interfaceC4988e) throws Throwable {
        B b10;
        Throwable th;
        InterfaceC4988e[] interfaceC4988eArrF;
        a aVar;
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        InterfaceC4988e[] interfaceC4988eArrF2 = Vd.c.f17520a;
        synchronized (this) {
            try {
                if (O(obj)) {
                    try {
                        C4035r.a aVar2 = C4035r.f34274b;
                        c2142n.resumeWith(C4035r.b(C4015H.f34254a));
                        interfaceC4988eArrF = F(interfaceC4988eArrF2);
                        aVar = null;
                        b10 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        b10 = this;
                        throw th;
                    }
                } else {
                    b10 = this;
                    try {
                        aVar = new a(b10, H() + ((long) L()), obj, c2142n);
                        b10.E(aVar);
                        b10.f16976k++;
                        if (b10.f16970e == 0) {
                            interfaceC4988eArrF2 = b10.F(interfaceC4988eArrF2);
                        }
                        interfaceC4988eArrF = interfaceC4988eArrF2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    AbstractC2146p.a(c2142n, aVar);
                }
                for (InterfaceC4988e interfaceC4988e2 : interfaceC4988eArrF) {
                    if (interfaceC4988e2 != null) {
                        C4035r.a aVar3 = C4035r.f34274b;
                        interfaceC4988e2.resumeWith(C4035r.b(C4015H.f34254a));
                    }
                }
                Object objW = c2142n.w();
                if (objW == C5046c.f()) {
                    nc.h.c(interfaceC4988e);
                }
                return objW == C5046c.f() ? objW : C4015H.f34254a;
            } catch (Throwable th4) {
                th = th4;
                b10 = this;
            }
        }
    }

    public final void E(Object obj) {
        int iL = L();
        Object[] objArrM = this.f16972g;
        if (objArrM == null) {
            objArrM = M(null, 0, 2);
        } else if (iL >= objArrM.length) {
            objArrM = M(objArrM, iL, objArrM.length * 2);
        }
        C.f(objArrM, H() + ((long) iL), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [lc.e[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final InterfaceC4988e[] F(InterfaceC4988e[] interfaceC4988eArr) {
        Vd.d[] dVarArr;
        D d10;
        InterfaceC4988e interfaceC4988e;
        int length = interfaceC4988eArr.length;
        if (this.f17518b != 0 && (dVarArr = this.f17517a) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            interfaceC4988eArr = interfaceC4988eArr;
            while (i10 < length2) {
                Vd.d dVar = dVarArr[i10];
                if (dVar != null && (interfaceC4988e = (d10 = (D) dVar).f16991b) != null && Q(d10) >= 0) {
                    int length3 = interfaceC4988eArr.length;
                    interfaceC4988eArr = interfaceC4988eArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC4988eArr, Math.max(2, interfaceC4988eArr.length * 2));
                        AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
                        interfaceC4988eArr = objArrCopyOf;
                    }
                    ((InterfaceC4988e[]) interfaceC4988eArr)[length] = interfaceC4988e;
                    d10.f16991b = null;
                    length++;
                }
                i10++;
                interfaceC4988eArr = interfaceC4988eArr;
            }
        }
        return (InterfaceC4988e[]) interfaceC4988eArr;
    }

    public final long G() {
        return H() + ((long) this.f16975j);
    }

    public final long H() {
        return Math.min(this.f16974i, this.f16973h);
    }

    public final Object I(long j10) {
        Object[] objArr = this.f16972g;
        AbstractC4862t.b(objArr);
        Object objE = C.e(objArr, j10);
        return objE instanceof a ? ((a) objE).f16979c : objE;
    }

    public final long J() {
        return H() + ((long) this.f16975j) + ((long) this.f16976k);
    }

    public final int K() {
        return (int) ((H() + ((long) this.f16975j)) - this.f16973h);
    }

    public final int L() {
        return this.f16975j + this.f16976k;
    }

    public final Object[] M(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f16972g = objArr2;
        if (objArr != null) {
            long jH = H();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jH;
                C.f(objArr2, j10, C.e(objArr, j10));
            }
        }
        return objArr2;
    }

    public boolean N(Object obj) {
        int i10;
        boolean z10;
        InterfaceC4988e[] interfaceC4988eArrF = Vd.c.f17520a;
        synchronized (this) {
            if (O(obj)) {
                interfaceC4988eArrF = F(interfaceC4988eArrF);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (InterfaceC4988e interfaceC4988e : interfaceC4988eArrF) {
            if (interfaceC4988e != null) {
                C4035r.a aVar = C4035r.f34274b;
                interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
            }
        }
        return z10;
    }

    public final boolean O(Object obj) {
        if (i() == 0) {
            return P(obj);
        }
        if (this.f16975j >= this.f16970e && this.f16974i <= this.f16973h) {
            int i10 = b.f16981a[this.f16971f.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new C4032o();
            }
        }
        E(obj);
        int i11 = this.f16975j + 1;
        this.f16975j = i11;
        if (i11 > this.f16970e) {
            B();
        }
        if (K() > this.f16969d) {
            S(this.f16973h + 1, this.f16974i, G(), J());
        }
        return true;
    }

    public final boolean P(Object obj) {
        if (this.f16969d == 0) {
            return true;
        }
        E(obj);
        int i10 = this.f16975j + 1;
        this.f16975j = i10;
        if (i10 > this.f16969d) {
            B();
        }
        this.f16974i = H() + ((long) this.f16975j);
        return true;
    }

    public final long Q(D d10) {
        long j10 = d10.f16990a;
        if (j10 >= G() && (this.f16970e > 0 || j10 > H() || this.f16976k == 0)) {
            return -1L;
        }
        return j10;
    }

    public final Object R(D d10) {
        Object obj;
        InterfaceC4988e[] interfaceC4988eArrT = Vd.c.f17520a;
        synchronized (this) {
            try {
                long jQ = Q(d10);
                if (jQ < 0) {
                    obj = C.f16989a;
                } else {
                    long j10 = d10.f16990a;
                    Object objI = I(jQ);
                    d10.f16990a = jQ + 1;
                    interfaceC4988eArrT = T(j10);
                    obj = objI;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4988e interfaceC4988e : interfaceC4988eArrT) {
            if (interfaceC4988e != null) {
                C4035r.a aVar = C4035r.f34274b;
                interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
            }
        }
        return obj;
    }

    public final void S(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jH = H(); jH < jMin; jH++) {
            Object[] objArr = this.f16972g;
            AbstractC4862t.b(objArr);
            C.f(objArr, jH, null);
        }
        this.f16973h = j10;
        this.f16974i = j11;
        this.f16975j = (int) (j12 - jMin);
        this.f16976k = (int) (j13 - j12);
    }

    public final InterfaceC4988e[] T(long j10) {
        long j11;
        long j12;
        long j13;
        Vd.d[] dVarArr;
        if (j10 > this.f16974i) {
            return Vd.c.f17520a;
        }
        long jH = H();
        long j14 = ((long) this.f16975j) + jH;
        if (this.f16970e == 0 && this.f16976k > 0) {
            j14++;
        }
        if (this.f17518b != 0 && (dVarArr = this.f17517a) != null) {
            for (Vd.d dVar : dVarArr) {
                if (dVar != null) {
                    long j15 = ((D) dVar).f16990a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f16974i) {
            return Vd.c.f17520a;
        }
        long jG = G();
        int iMin = i() > 0 ? Math.min(this.f16976k, this.f16970e - ((int) (jG - j14))) : this.f16976k;
        InterfaceC4988e[] interfaceC4988eArr = Vd.c.f17520a;
        long j16 = ((long) this.f16976k) + jG;
        if (iMin > 0) {
            interfaceC4988eArr = new InterfaceC4988e[iMin];
            Object[] objArr = this.f16972g;
            AbstractC4862t.b(objArr);
            j13 = 1;
            long j17 = jG;
            int i10 = 0;
            while (true) {
                if (jG >= j16) {
                    j11 = jH;
                    j12 = j14;
                    jG = j17;
                    break;
                }
                Object objE = C.e(objArr, jG);
                j11 = jH;
                Wd.E e10 = C.f16989a;
                if (objE != e10) {
                    AbstractC4862t.c(objE, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objE;
                    int i11 = i10 + 1;
                    j12 = j14;
                    interfaceC4988eArr[i10] = aVar.f16980d;
                    C.f(objArr, jG, e10);
                    C.f(objArr, j17, aVar.f16979c);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        jG = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                jG++;
                jH = j11;
                j14 = j12;
            }
        } else {
            j11 = jH;
            j12 = j14;
            j13 = 1;
        }
        InterfaceC4988e[] interfaceC4988eArr2 = interfaceC4988eArr;
        int i12 = (int) (jG - j11);
        long j19 = i() == 0 ? jG : j12;
        long jMax = Math.max(this.f16973h, jG - ((long) Math.min(this.f16969d, i12)));
        if (this.f16970e == 0 && jMax < j16) {
            Object[] objArr2 = this.f16972g;
            AbstractC4862t.b(objArr2);
            if (AbstractC4862t.a(C.e(objArr2, jMax), C.f16989a)) {
                jG += j13;
                jMax += j13;
            }
        }
        S(jMax, j19, jG, j16);
        w();
        return !(interfaceC4988eArr2.length == 0) ? F(interfaceC4988eArr2) : interfaceC4988eArr2;
    }

    public final long U() {
        long j10 = this.f16973h;
        if (j10 < this.f16974i) {
            this.f16974i = j10;
        }
        return j10;
    }

    @Override // Vd.q
    public InterfaceC2313e a(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return C.d(this, interfaceC4992i, i10, aVar);
    }

    @Override // Ud.A, Ud.InterfaceC2313e
    public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        return x(this, interfaceC2314f, interfaceC4988e);
    }

    @Override // Ud.v, Ud.InterfaceC2314f
    public Object emit(Object obj, InterfaceC4988e interfaceC4988e) {
        return C(this, obj, interfaceC4988e);
    }

    public final Object u(D d10, InterfaceC4988e interfaceC4988e) {
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        synchronized (this) {
            try {
                if (Q(d10) < 0) {
                    d10.f16991b = c2142n;
                } else {
                    C4035r.a aVar = C4035r.f34274b;
                    c2142n.resumeWith(C4035r.b(C4015H.f34254a));
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objW = c2142n.w();
        if (objW == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objW == C5046c.f() ? objW : C4015H.f34254a;
    }

    public final void v(a aVar) {
        synchronized (this) {
            if (aVar.f16978b < H()) {
                return;
            }
            Object[] objArr = this.f16972g;
            AbstractC4862t.b(objArr);
            if (C.e(objArr, aVar.f16978b) != aVar) {
                return;
            }
            C.f(objArr, aVar.f16978b, C.f16989a);
            w();
            C4015H c4015h = C4015H.f34254a;
        }
    }

    public final void w() {
        if (this.f16970e != 0 || this.f16976k > 1) {
            Object[] objArr = this.f16972g;
            AbstractC4862t.b(objArr);
            while (this.f16976k > 0 && C.e(objArr, (H() + ((long) L())) - 1) == C.f16989a) {
                this.f16976k--;
                C.f(objArr, H() + ((long) L()), null);
            }
        }
    }

    public final void y(long j10) {
        Vd.d[] dVarArr;
        if (this.f17518b != 0 && (dVarArr = this.f17517a) != null) {
            for (Vd.d dVar : dVarArr) {
                if (dVar != null) {
                    D d10 = (D) dVar;
                    long j11 = d10.f16990a;
                    if (j11 >= 0 && j11 < j10) {
                        d10.f16990a = j10;
                    }
                }
            }
        }
        this.f16974i = j10;
    }

    @Override // Vd.AbstractC2320b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public D f() {
        return new D();
    }
}
