package Td;

import Rd.AbstractC2146p;
import Rd.C2142n;
import Rd.InterfaceC2138l;
import Rd.e1;
import Wd.AbstractC2322b;
import Wd.AbstractC2323c;
import Wd.AbstractC2331k;
import Wd.B;
import Wd.C;
import Wd.D;
import Wd.T;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4022e;
import fc.C4035r;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16360d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16361e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16362f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16363g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16364h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16365i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16366j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16367k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16368l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f16370b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.q f16371c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements i, e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f16372a = f.f16400p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C2142n f16373b;

        public a() {
        }

        @Override // Td.i
        public Object a(InterfaceC4988e interfaceC4988e) throws Throwable {
            m mVarX;
            boolean zG = true;
            if (this.f16372a == f.f16400p || this.f16372a == f.z()) {
                e eVar = e.this;
                m mVar = (m) e.g0().get(eVar);
                while (true) {
                    if (eVar.u0()) {
                        zG = g();
                        break;
                    }
                    long andIncrement = e.h0().getAndIncrement(eVar);
                    int i10 = f.f16386b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (mVar.f17897c != j10) {
                        mVarX = eVar.X(j10, mVar);
                        if (mVarX == null) {
                            continue;
                        }
                    } else {
                        mVarX = mVar;
                    }
                    Object objH1 = eVar.h1(mVarX, i11, andIncrement, null);
                    if (objH1 == f.f16397m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objH1 == f.f16399o) {
                        if (andIncrement < eVar.m0()) {
                            mVarX.c();
                        }
                        mVar = mVarX;
                    } else {
                        if (objH1 == f.f16398n) {
                            return f(mVarX, i11, andIncrement, interfaceC4988e);
                        }
                        mVarX.c();
                        this.f16372a = objH1;
                    }
                }
            }
            return AbstractC5158b.a(zG);
        }

        @Override // Rd.e1
        public void c(B b10, int i10) {
            C2142n c2142n = this.f16373b;
            if (c2142n != null) {
                c2142n.c(b10, i10);
            }
        }

        public final Object f(m mVar, int i10, long j10, InterfaceC4988e interfaceC4988e) {
            Boolean boolA;
            vc.l lVar;
            m mVar2;
            e eVar = e.this;
            C2142n c2142nB = AbstractC2146p.b(C5045b.c(interfaceC4988e));
            try {
                this.f16373b = c2142nB;
                Object objH1 = eVar.h1(mVar, i10, j10, this);
                if (objH1 == f.f16397m) {
                    eVar.P0(this, mVar, i10);
                } else {
                    vc.q qVarJ = null;
                    if (objH1 == f.f16399o) {
                        if (j10 < eVar.m0()) {
                            mVar.c();
                        }
                        m mVar3 = (m) e.g0().get(eVar);
                        while (true) {
                            if (eVar.u0()) {
                                h();
                                break;
                            }
                            long andIncrement = e.h0().getAndIncrement(eVar);
                            int i11 = f.f16386b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (mVar3.f17897c != j11) {
                                m mVarX = eVar.X(j11, mVar3);
                                if (mVarX != null) {
                                    mVar2 = mVarX;
                                }
                            } else {
                                mVar2 = mVar3;
                            }
                            objH1 = eVar.h1(mVar2, i12, andIncrement, this);
                            m mVar4 = mVar2;
                            if (objH1 == f.f16397m) {
                                eVar.P0(this, mVar4, i12);
                                break;
                            }
                            if (objH1 == f.f16399o) {
                                if (andIncrement < eVar.m0()) {
                                    mVar4.c();
                                }
                                mVar3 = mVar4;
                            } else {
                                if (objH1 == f.f16398n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVar4.c();
                                this.f16372a = objH1;
                                this.f16373b = null;
                                boolA = AbstractC5158b.a(true);
                                lVar = eVar.f16370b;
                                if (lVar != null) {
                                }
                            }
                        }
                        c2142nB.y(boolA, qVarJ);
                    } else {
                        mVar.c();
                        this.f16372a = objH1;
                        this.f16373b = null;
                        boolA = AbstractC5158b.a(true);
                        lVar = eVar.f16370b;
                        if (lVar != null) {
                            qVarJ = eVar.J(lVar, objH1);
                        }
                        c2142nB.y(boolA, qVarJ);
                    }
                }
                Object objW = c2142nB.w();
                if (objW == C5046c.f()) {
                    nc.h.c(interfaceC4988e);
                }
                return objW;
            } catch (Throwable th) {
                c2142nB.N();
                throw th;
            }
        }

        public final boolean g() throws Throwable {
            this.f16372a = f.z();
            Throwable thC0 = e.this.c0();
            if (thC0 == null) {
                return false;
            }
            throw D.a(thC0);
        }

        public final void h() {
            C2142n c2142n = this.f16373b;
            AbstractC4862t.b(c2142n);
            this.f16373b = null;
            this.f16372a = f.z();
            Throwable thC0 = e.this.c0();
            if (thC0 == null) {
                C4035r.a aVar = C4035r.f34274b;
                c2142n.resumeWith(C4035r.b(Boolean.FALSE));
            } else {
                C4035r.a aVar2 = C4035r.f34274b;
                c2142n.resumeWith(C4035r.b(AbstractC4036s.a(thC0)));
            }
        }

        public final boolean i(Object obj) {
            C2142n c2142n = this.f16373b;
            AbstractC4862t.b(c2142n);
            this.f16373b = null;
            this.f16372a = obj;
            Boolean bool = Boolean.TRUE;
            e eVar = e.this;
            vc.l lVar = eVar.f16370b;
            return f.B(c2142n, bool, lVar != null ? eVar.J(lVar, obj) : null);
        }

        public final void j() {
            C2142n c2142n = this.f16373b;
            AbstractC4862t.b(c2142n);
            this.f16373b = null;
            this.f16372a = f.z();
            Throwable thC0 = e.this.c0();
            if (thC0 == null) {
                C4035r.a aVar = C4035r.f34274b;
                c2142n.resumeWith(C4035r.b(Boolean.FALSE));
            } else {
                C4035r.a aVar2 = C4035r.f34274b;
                c2142n.resumeWith(C4035r.b(AbstractC4036s.a(thC0)));
            }
        }

        @Override // Td.i
        public Object next() throws Throwable {
            Object obj = this.f16372a;
            if (obj == f.f16400p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f16372a = f.f16400p;
            if (obj != f.z()) {
                return obj;
            }
            throw D.a(e.this.f0());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b extends AbstractC4860q implements vc.q {
        public b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void i(Throwable th, Object obj, InterfaceC4992i interfaceC4992i) {
            ((e) this.receiver).F0(th, obj, interfaceC4992i);
        }

        @Override // vc.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((Throwable) obj, obj2, (InterfaceC4992i) obj3);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c extends AbstractC4860q implements vc.q {
        public c(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void i(Throwable th, Object obj, InterfaceC4992i interfaceC4992i) {
            ((e) this.receiver).E0(th, obj, interfaceC4992i);
        }

        @Override // vc.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((Throwable) obj, ((k) obj2).l(), (InterfaceC4992i) obj3);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f16375j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f16377l;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16375j = obj;
            this.f16377l |= Integer.MIN_VALUE;
            Object objS0 = e.S0(e.this, this);
            return objS0 == C5046c.f() ? objS0 : k.b(objS0);
        }
    }

    /* JADX INFO: renamed from: Td.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0202e extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f16378j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f16379k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f16380l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f16381m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f16382n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f16384p;

        public C0202e(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16382n = obj;
            this.f16384p |= Integer.MIN_VALUE;
            Object objT0 = e.this.T0(null, 0, 0L, this);
            return objT0 == C5046c.f() ? objT0 : k.b(objT0);
        }
    }

    public e(int i10, vc.l lVar) {
        this.f16369a = i10;
        this.f16370b = lVar;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = a0();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (y0()) {
            mVar = f.f16385a;
            AbstractC4862t.c(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.f16371c = lVar != null ? new vc.q() { // from class: Td.b
            @Override // vc.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                e eVar = this.f16355a;
                android.support.v4.media.session.a.a(obj);
                return e.N0(eVar, null, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = f.f16403s;
    }

    public static final C4015H K(vc.l lVar, Object obj, Throwable th, Object obj2, InterfaceC4992i interfaceC4992i) {
        Wd.x.a(lVar, obj, interfaceC4992i);
        return C4015H.f34254a;
    }

    public static final vc.q N0(final e eVar, final Zd.a aVar, Object obj, final Object obj2) {
        return new vc.q(obj2, eVar, aVar) { // from class: Td.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f16358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f16359b;

            @Override // vc.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return e.O0(this.f16358a, this.f16359b, null, (Throwable) obj3, obj4, (InterfaceC4992i) obj5);
            }
        };
    }

    public static final C4015H O0(Object obj, e eVar, Zd.a aVar, Throwable th, Object obj2, InterfaceC4992i interfaceC4992i) {
        if (obj != f.z()) {
            Wd.x.a(eVar.f16370b, obj, aVar.getContext());
        }
        return C4015H.f34254a;
    }

    public static /* synthetic */ Object R0(e eVar, InterfaceC4988e interfaceC4988e) throws Throwable {
        m mVar;
        m mVar2 = (m) g0().get(eVar);
        while (!eVar.u0()) {
            long andIncrement = h0().getAndIncrement(eVar);
            int i10 = f.f16386b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (mVar2.f17897c != j10) {
                m mVarX = eVar.X(j10, mVar2);
                if (mVarX == null) {
                    continue;
                } else {
                    mVar = mVarX;
                }
            } else {
                mVar = mVar2;
            }
            e eVar2 = eVar;
            Object objH1 = eVar2.h1(mVar, i11, andIncrement, null);
            if (objH1 == f.f16397m) {
                throw new IllegalStateException("unexpected");
            }
            if (objH1 != f.f16399o) {
                if (objH1 == f.f16398n) {
                    return eVar2.U0(mVar, i11, andIncrement, interfaceC4988e);
                }
                mVar.c();
                return objH1;
            }
            if (andIncrement < eVar2.m0()) {
                mVar.c();
            }
            eVar = eVar2;
            mVar2 = mVar;
        }
        throw D.a(eVar.f0());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object S0(Td.e r13, lc.InterfaceC4988e r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof Td.e.d
            if (r0 == 0) goto L14
            r0 = r14
            Td.e$d r0 = (Td.e.d) r0
            int r1 = r0.f16377l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f16377l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            Td.e$d r0 = new Td.e$d
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f16375j
            java.lang.Object r0 = mc.C5046c.f()
            int r1 = r6.f16377l
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            fc.AbstractC4036s.b(r14)
            Td.k r14 = (Td.k) r14
            java.lang.Object r13 = r14.l()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            fc.AbstractC4036s.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = l()
            java.lang.Object r14 = r14.get(r13)
            Td.m r14 = (Td.m) r14
        L46:
            boolean r1 = r13.u0()
            if (r1 == 0) goto L57
            Td.k$b r14 = Td.k.f16409b
            java.lang.Throwable r13 = r13.c0()
            java.lang.Object r13 = r14.a(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m()
            long r4 = r1.getAndIncrement(r13)
            int r1 = Td.f.f16386b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f17897c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            Td.m r1 = h(r13, r7, r14)
            if (r1 != 0) goto L75
            goto L46
        L75:
            r8 = r1
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = G(r7, r8, r9, r10, r12)
            r1 = r7
            Wd.E r14 = Td.f.r()
            if (r13 == r14) goto Lb6
            Wd.E r14 = Td.f.h()
            if (r13 != r14) goto L9b
            long r13 = r1.m0()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L98
            r8.c()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            Wd.E r14 = Td.f.s()
            if (r13 != r14) goto Lac
            r6.f16377l = r2
            r2 = r8
            java.lang.Object r13 = r1.T0(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.c()
            Td.k$b r14 = Td.k.f16409b
            java.lang.Object r13 = r14.c(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.e.S0(Td.e, lc.e):java.lang.Object");
    }

    public static /* synthetic */ Object Z0(e eVar, Object obj, InterfaceC4988e interfaceC4988e) {
        m mVar;
        m mVar2 = (m) k0().get(eVar);
        while (true) {
            long andIncrement = l0().getAndIncrement(eVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zW0 = eVar.w0(andIncrement);
            int i10 = f.f16386b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (mVar2.f17897c != j11) {
                m mVarY = eVar.Y(j11, mVar2);
                if (mVarY != null) {
                    mVar = mVarY;
                } else if (zW0) {
                    Object objJ0 = eVar.J0(obj, interfaceC4988e);
                    if (objJ0 == C5046c.f()) {
                        return objJ0;
                    }
                }
            } else {
                mVar = mVar2;
            }
            e eVar2 = eVar;
            Object obj2 = obj;
            int iJ1 = eVar2.j1(mVar, i11, obj2, j10, null, zW0);
            if (iJ1 == 0) {
                mVar.c();
                break;
            }
            if (iJ1 == 1) {
                break;
            }
            if (iJ1 != 2) {
                if (iJ1 == 3) {
                    Object objA1 = eVar2.a1(mVar, i11, obj2, j10, interfaceC4988e);
                    if (objA1 == C5046c.f()) {
                        return objA1;
                    }
                } else if (iJ1 != 4) {
                    if (iJ1 == 5) {
                        mVar.c();
                    }
                    eVar = eVar2;
                    mVar2 = mVar;
                    obj = obj2;
                } else {
                    if (j10 < eVar2.i0()) {
                        mVar.c();
                    }
                    Object objJ02 = eVar2.J0(obj2, interfaceC4988e);
                    if (objJ02 == C5046c.f()) {
                        return objJ02;
                    }
                }
            } else if (zW0) {
                mVar.t();
                Object objJ03 = eVar2.J0(obj2, interfaceC4988e);
                if (objJ03 == C5046c.f()) {
                    return objJ03;
                }
            }
        }
        return C4015H.f34254a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater g0() {
        return f16365i;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater h0() {
        return f16361e;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater k0() {
        return f16364h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater l0() {
        return f16360d;
    }

    public static /* synthetic */ void q0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.p0(j10);
    }

    public final void A0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16360d;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
            e eVar = this;
            if (atomicLongFieldUpdater.compareAndSet(eVar, j10, f.w(1152921504606846975L & j10, 1))) {
                return;
            } else {
                this = eVar;
            }
        }
    }

    public final void B0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16360d;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            e eVar = this;
            if (atomicLongFieldUpdater.compareAndSet(eVar, j10, f.w(1152921504606846975L & j10, 3))) {
                return;
            } else {
                this = eVar;
            }
        }
    }

    public final void C0() {
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16360d;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = f.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = f.w(1152921504606846975L & j10, 3);
            }
            e eVar = this;
            if (atomicLongFieldUpdater.compareAndSet(eVar, j10, jW)) {
                return;
            } else {
                this = eVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D0(long r5, Td.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f17897c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            Wd.c r0 = r7.f()
            Td.m r0 = (Td.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            Wd.c r5 = r7.f()
            Td.m r5 = (Td.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = b0()
        L26:
            java.lang.Object r6 = r5.get(r4)
            Wd.B r6 = (Wd.B) r6
            long r0 = r6.f17897c
            long r2 = r7.f17897c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = B0.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r4 = r6.p()
            if (r4 == 0) goto L4b
            r6.n()
        L4b:
            return
        L4c:
            boolean r6 = r7.p()
            if (r6 == 0) goto L26
            r7.n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.e.D0(long, Td.m):void");
    }

    public final void E0(Throwable th, Object obj, InterfaceC4992i interfaceC4992i) {
        vc.l lVar = this.f16370b;
        AbstractC4862t.b(lVar);
        Object objF = k.f(obj);
        AbstractC4862t.b(objF);
        Wd.x.a(lVar, objF, interfaceC4992i);
    }

    public final void F0(Throwable th, Object obj, InterfaceC4992i interfaceC4992i) {
        vc.l lVar = this.f16370b;
        AbstractC4862t.b(lVar);
        Wd.x.a(lVar, obj, interfaceC4992i);
    }

    public final void H0(InterfaceC2138l interfaceC2138l) {
        C4035r.a aVar = C4035r.f34274b;
        interfaceC2138l.resumeWith(C4035r.b(k.b(k.f16409b.a(c0()))));
    }

    public final Cc.h I(vc.l lVar) {
        return new b(this);
    }

    public final void I0(InterfaceC2138l interfaceC2138l) {
        C4035r.a aVar = C4035r.f34274b;
        interfaceC2138l.resumeWith(C4035r.b(AbstractC4036s.a(f0())));
    }

    public final vc.q J(final vc.l lVar, final Object obj) {
        return new vc.q() { // from class: Td.c
            @Override // vc.q
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return e.K(lVar, obj, (Throwable) obj2, obj3, (InterfaceC4992i) obj4);
            }
        };
    }

    public final Object J0(Object obj, InterfaceC4988e interfaceC4988e) {
        T tC;
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        vc.l lVar = this.f16370b;
        if (lVar == null || (tC = Wd.x.c(lVar, obj, null, 2, null)) == null) {
            Throwable thJ0 = j0();
            C4035r.a aVar = C4035r.f34274b;
            c2142n.resumeWith(C4035r.b(AbstractC4036s.a(thJ0)));
        } else {
            C4022e.a(tC, j0());
            C4035r.a aVar2 = C4035r.f34274b;
            c2142n.resumeWith(C4035r.b(AbstractC4036s.a(tC)));
        }
        Object objW = c2142n.w();
        if (objW == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objW == C5046c.f() ? objW : C4015H.f34254a;
    }

    public final void K0(Object obj, InterfaceC2138l interfaceC2138l) {
        vc.l lVar = this.f16370b;
        if (lVar != null) {
            Wd.x.a(lVar, obj, interfaceC2138l.getContext());
        }
        Throwable thJ0 = j0();
        C4035r.a aVar = C4035r.f34274b;
        interfaceC2138l.resumeWith(C4035r.b(AbstractC4036s.a(thJ0)));
    }

    public final Cc.h L(vc.l lVar) {
        return new c(this);
    }

    public final boolean M(long j10) {
        return j10 < a0() || j10 < i0() + ((long) this.f16369a);
    }

    public boolean N(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return Q(th, true);
    }

    public final void O(m mVar, long j10) {
        Object objB = AbstractC2331k.b(null, 1, null);
        loop0: while (mVar != null) {
            for (int i10 = f.f16386b - 1; -1 < i10; i10--) {
                if ((mVar.f17897c * ((long) f.f16386b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = mVar.B(i10);
                    if (objB2 != null && objB2 != f.f16389e) {
                        if (!(objB2 instanceof z)) {
                            if (!(objB2 instanceof e1)) {
                                break;
                            }
                            if (mVar.v(i10, objB2, f.z())) {
                                objB = AbstractC2331k.c(objB, objB2);
                                mVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (mVar.v(i10, objB2, f.z())) {
                                objB = AbstractC2331k.c(objB, ((z) objB2).f16427a);
                                mVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar.v(i10, objB2, f.z())) {
                            mVar.t();
                            break;
                        }
                    }
                }
            }
            mVar = (m) mVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                W0((e1) objB);
                return;
            }
            AbstractC4862t.c(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                W0((e1) arrayList.get(size));
            }
        }
    }

    public final m P() {
        Object obj = f16366j.get(this);
        m mVar = (m) f16364h.get(this);
        if (mVar.f17897c > ((m) obj).f17897c) {
            obj = mVar;
        }
        m mVar2 = (m) f16365i.get(this);
        if (mVar2.f17897c > ((m) obj).f17897c) {
            obj = mVar2;
        }
        return (m) AbstractC2322b.b((AbstractC2323c) obj);
    }

    public final void P0(e1 e1Var, m mVar, int i10) {
        M0();
        e1Var.c(mVar, i10);
    }

    public boolean Q(Throwable th, boolean z10) {
        if (z10) {
            A0();
        }
        boolean zA = B0.b.a(f16367k, this, f.f16403s, th);
        if (z10) {
            B0();
        } else {
            C0();
        }
        T();
        G0();
        if (zA) {
            r0();
        }
        return zA;
    }

    public final void Q0(e1 e1Var, m mVar, int i10) {
        e1Var.c(mVar, i10 + f.f16386b);
    }

    public final void R(long j10) {
        V0(S(j10));
    }

    public final m S(long j10) {
        m mVarP = P();
        if (x0()) {
            long jZ0 = z0(mVarP);
            if (jZ0 != -1) {
                U(jZ0);
            }
        }
        O(mVarP, j10);
        return mVarP;
    }

    public final void T() {
        z();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T0(Td.m r11, int r12, long r13, lc.InterfaceC4988e r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.e.T0(Td.m, int, long, lc.e):java.lang.Object");
    }

    public final void U(long j10) {
        m mVar;
        T tC;
        m mVar2 = (m) f16365i.get(this);
        while (true) {
            long j11 = f16361e.get(this);
            if (j10 < Math.max(((long) this.f16369a) + j11, this.a0())) {
                return;
            }
            e eVar = this;
            if (f16361e.compareAndSet(eVar, j11, 1 + j11)) {
                int i10 = f.f16386b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (mVar2.f17897c != j12) {
                    m mVarX = eVar.X(j12, mVar2);
                    if (mVarX != null) {
                        mVar = mVarX;
                    }
                } else {
                    mVar = mVar2;
                }
                Object objH1 = eVar.h1(mVar, i11, j11, null);
                if (objH1 != f.f16399o) {
                    mVar.c();
                    vc.l lVar = eVar.f16370b;
                    if (lVar != null && (tC = Wd.x.c(lVar, objH1, null, 2, null)) != null) {
                        throw tC;
                    }
                } else if (j11 < eVar.m0()) {
                    mVar.c();
                }
                this = eVar;
                mVar2 = mVar;
            }
            this = eVar;
        }
    }

    public final Object U0(m mVar, int i10, long j10, InterfaceC4988e interfaceC4988e) {
        m mVar2;
        C2142n c2142nB = AbstractC2146p.b(C5045b.c(interfaceC4988e));
        try {
            Object objH1 = h1(mVar, i10, j10, c2142nB);
            if (objH1 == f.f16397m) {
                P0(c2142nB, mVar, i10);
            } else {
                Cc.h hVarI = null;
                hVarI = null;
                if (objH1 == f.f16399o) {
                    if (j10 < m0()) {
                        mVar.c();
                    }
                    m mVar3 = (m) g0().get(this);
                    while (true) {
                        if (u0()) {
                            I0(c2142nB);
                            break;
                        }
                        long andIncrement = h0().getAndIncrement(this);
                        int i11 = f.f16386b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (mVar3.f17897c != j11) {
                            m mVarX = X(j11, mVar3);
                            if (mVarX != null) {
                                mVar2 = mVarX;
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                        objH1 = h1(mVar2, i12, andIncrement, c2142nB);
                        m mVar4 = mVar2;
                        if (objH1 == f.f16397m) {
                            C2142n c2142n = c2142nB != null ? c2142nB : null;
                            if (c2142n != null) {
                                P0(c2142n, mVar4, i12);
                            }
                        } else if (objH1 == f.f16399o) {
                            if (andIncrement < m0()) {
                                mVar4.c();
                            }
                            mVar3 = mVar4;
                        } else {
                            if (objH1 == f.f16398n) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar4.c();
                            vc.l lVar = this.f16370b;
                            if (lVar != null) {
                                hVarI = I(lVar);
                            }
                        }
                    }
                } else {
                    mVar.c();
                    vc.l lVar2 = this.f16370b;
                    if (lVar2 != null) {
                        hVarI = I(lVar2);
                    }
                }
                c2142nB.y(objH1, (vc.q) hVarI);
            }
            Object objW = c2142nB.w();
            if (objW == C5046c.f()) {
                nc.h.c(interfaceC4988e);
            }
            return objW;
        } catch (Throwable th) {
            c2142nB.N();
            throw th;
        }
    }

    public final void V() {
        e eVar;
        if (y0()) {
            return;
        }
        m mVar = (m) f16366j.get(this);
        while (true) {
            long andIncrement = f16362f.getAndIncrement(this);
            int i10 = f.f16386b;
            long j10 = andIncrement / ((long) i10);
            if (this.m0() <= andIncrement) {
                if (mVar.f17897c < j10 && mVar.f() != null) {
                    this.D0(j10, mVar);
                }
                q0(this, 0L, 1, null);
                return;
            }
            if (mVar.f17897c != j10) {
                eVar = this;
                m mVarW = eVar.W(j10, mVar, andIncrement);
                if (mVarW == null) {
                    continue;
                    this = eVar;
                } else {
                    mVar = mVarW;
                }
            } else {
                eVar = this;
            }
            if (eVar.f1(mVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                q0(eVar, 0L, 1, null);
                return;
            } else {
                q0(eVar, 0L, 1, null);
                this = eVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (Td.m) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V0(Td.m r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.e.V0(Td.m):void");
    }

    public final m W(long j10, m mVar, long j11) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16366j;
        vc.p pVar = (vc.p) f.y();
        loop0: while (true) {
            objC = AbstractC2322b.c(mVar, j10, pVar);
            if (!C.c(objC)) {
                B b10 = C.b(objC);
                while (true) {
                    B b11 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b11.f17897c >= b10.f17897c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (B0.b.a(atomicReferenceFieldUpdater, this, b11, b10)) {
                        if (b11.p()) {
                            b11.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        if (C.c(objC)) {
            T();
            D0(j10, mVar);
            q0(this, 0L, 1, null);
            return null;
        }
        m mVar2 = (m) C.b(objC);
        if (mVar2.f17897c <= j10) {
            return mVar2;
        }
        long j12 = mVar2.f17897c;
        int i10 = f.f16386b;
        if (f16362f.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            p0((mVar2.f17897c * ((long) i10)) - j11);
        } else {
            q0(this, 0L, 1, null);
        }
        return null;
    }

    public final void W0(e1 e1Var) {
        Y0(e1Var, true);
    }

    public final m X(long j10, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16365i;
        vc.p pVar = (vc.p) f.y();
        loop0: while (true) {
            objC = AbstractC2322b.c(mVar, j10, pVar);
            if (!C.c(objC)) {
                B b10 = C.b(objC);
                while (true) {
                    B b11 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b11.f17897c >= b10.f17897c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (B0.b.a(atomicReferenceFieldUpdater, this, b11, b10)) {
                        if (b11.p()) {
                            b11.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        if (C.c(objC)) {
            T();
            if (mVar.f17897c * ((long) f.f16386b) < m0()) {
                mVar.c();
            }
            return null;
        }
        m mVar2 = (m) C.b(objC);
        if (!y0() && j10 <= a0() / ((long) f.f16386b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16366j;
            while (true) {
                B b12 = (B) atomicReferenceFieldUpdater2.get(this);
                if (b12.f17897c >= mVar2.f17897c || !mVar2.u()) {
                    break;
                }
                if (B0.b.a(atomicReferenceFieldUpdater2, this, b12, mVar2)) {
                    if (b12.p()) {
                        b12.n();
                    }
                } else if (mVar2.p()) {
                    mVar2.n();
                }
            }
        }
        long j11 = mVar2.f17897c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f16386b;
        l1(j11 * ((long) i10));
        if (mVar2.f17897c * ((long) i10) < m0()) {
            mVar2.c();
        }
        return null;
    }

    public final void X0(e1 e1Var) {
        Y0(e1Var, false);
    }

    public final m Y(long j10, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16364h;
        vc.p pVar = (vc.p) f.y();
        loop0: while (true) {
            objC = AbstractC2322b.c(mVar, j10, pVar);
            if (!C.c(objC)) {
                B b10 = C.b(objC);
                while (true) {
                    B b11 = (B) atomicReferenceFieldUpdater.get(this);
                    if (b11.f17897c >= b10.f17897c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (B0.b.a(atomicReferenceFieldUpdater, this, b11, b10)) {
                        if (b11.p()) {
                            b11.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        if (C.c(objC)) {
            T();
            if (mVar.f17897c * ((long) f.f16386b) < i0()) {
                mVar.c();
            }
            return null;
        }
        m mVar2 = (m) C.b(objC);
        long j11 = mVar2.f17897c;
        if (j11 <= j10) {
            return mVar2;
        }
        int i10 = f.f16386b;
        m1(j11 * ((long) i10));
        if (mVar2.f17897c * ((long) i10) < i0()) {
            mVar2.c();
        }
        return null;
    }

    public final void Y0(e1 e1Var, boolean z10) {
        if (e1Var instanceof InterfaceC2138l) {
            InterfaceC4988e interfaceC4988e = (InterfaceC4988e) e1Var;
            C4035r.a aVar = C4035r.f34274b;
            interfaceC4988e.resumeWith(C4035r.b(AbstractC4036s.a(z10 ? f0() : j0())));
        } else if (e1Var instanceof w) {
            C2142n c2142n = ((w) e1Var).f16426a;
            C4035r.a aVar2 = C4035r.f34274b;
            c2142n.resumeWith(C4035r.b(k.b(k.f16409b.a(c0()))));
        } else {
            if (e1Var instanceof a) {
                ((a) e1Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + e1Var).toString());
        }
    }

    @Override // Td.x
    public final void a(CancellationException cancellationException) {
        N(cancellationException);
    }

    public final long a0() {
        return f16362f.get(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a1(Td.m r16, int r17, java.lang.Object r18, long r19, lc.InterfaceC4988e r21) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.e.a1(Td.m, int, java.lang.Object, long, lc.e):java.lang.Object");
    }

    public final boolean b1(long j10) {
        if (w0(j10)) {
            return false;
        }
        return !M(j10 & 1152921504606846975L);
    }

    public final Throwable c0() {
        return (Throwable) f16367k.get(this);
    }

    public final boolean c1(Object obj, Object obj2) {
        if (obj instanceof w) {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C2142n c2142n = ((w) obj).f16426a;
            k kVarB = k.b(k.f16409b.c(obj2));
            vc.l lVar = this.f16370b;
            return f.B(c2142n, kVarB, (vc.q) (lVar != null ? L(lVar) : null));
        }
        if (obj instanceof a) {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC2138l) {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC2138l interfaceC2138l = (InterfaceC2138l) obj;
            vc.l lVar2 = this.f16370b;
            return f.B(interfaceC2138l, obj2, (vc.q) (lVar2 != null ? I(lVar2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final boolean d1(Object obj, m mVar, int i10) {
        if (obj instanceof InterfaceC2138l) {
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.C((InterfaceC2138l) obj, C4015H.f34254a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object e1(Object obj) {
        m mVarY;
        int i10;
        e eVar;
        Object obj2 = f.f16388d;
        m mVar = (m) k0().get(this);
        while (true) {
            long andIncrement = l0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zW0 = this.w0(andIncrement);
            int i11 = f.f16386b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (mVar.f17897c != j11) {
                mVarY = this.Y(j11, mVar);
                if (mVarY != null) {
                    eVar = this;
                    i10 = i12;
                } else if (zW0) {
                    return k.f16409b.a(this.j0());
                }
            } else {
                mVarY = mVar;
                i10 = i12;
                eVar = this;
            }
            Object obj3 = obj;
            int iJ1 = eVar.j1(mVarY, i10, obj3, j10, obj2, zW0);
            e eVar2 = eVar;
            mVar = mVarY;
            if (iJ1 == 0) {
                mVar.c();
                return k.f16409b.c(C4015H.f34254a);
            }
            if (iJ1 == 1) {
                return k.f16409b.c(C4015H.f34254a);
            }
            if (iJ1 == 2) {
                if (zW0) {
                    mVar.t();
                    return k.f16409b.a(eVar2.j0());
                }
                e1 e1Var = obj2 instanceof e1 ? (e1) obj2 : null;
                if (e1Var != null) {
                    eVar2.Q0(e1Var, mVar, i10);
                }
                eVar2.U((mVar.f17897c * ((long) i11)) + ((long) i10));
                return k.f16409b.c(C4015H.f34254a);
            }
            if (iJ1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iJ1 == 4) {
                if (j10 < eVar2.i0()) {
                    mVar.c();
                }
                return k.f16409b.a(eVar2.j0());
            }
            if (iJ1 == 5) {
                mVar.c();
            }
            this = eVar2;
            obj = obj3;
        }
    }

    public final Throwable f0() {
        Throwable thC0 = c0();
        return thC0 == null ? new q("Channel was closed") : thC0;
    }

    public final boolean f1(m mVar, int i10, long j10) {
        Object objB = mVar.B(i10);
        if (!(objB instanceof e1) || j10 < f16361e.get(this) || !mVar.v(i10, objB, f.f16391g)) {
            return g1(mVar, i10, j10);
        }
        if (d1(objB, mVar, i10)) {
            mVar.F(i10, f.f16388d);
            return true;
        }
        mVar.F(i10, f.f16394j);
        mVar.C(i10, false);
        return false;
    }

    public final boolean g1(m mVar, int i10, long j10) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB instanceof e1) {
                if (j10 < f16361e.get(this)) {
                    if (mVar.v(i10, objB, new z((e1) objB))) {
                        return true;
                    }
                } else if (mVar.v(i10, objB, f.f16391g)) {
                    if (d1(objB, mVar, i10)) {
                        mVar.F(i10, f.f16388d);
                        return true;
                    }
                    mVar.F(i10, f.f16394j);
                    mVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == f.f16394j) {
                    return false;
                }
                if (objB == null) {
                    if (mVar.v(i10, objB, f.f16389e)) {
                        return true;
                    }
                } else {
                    if (objB == f.f16388d || objB == f.f16392h || objB == f.f16393i || objB == f.f16395k || objB == f.z()) {
                        return true;
                    }
                    if (objB != f.f16390f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    public final Object h1(m mVar, int i10, long j10, Object obj) {
        Object objB = mVar.B(i10);
        if (objB == null) {
            if (j10 >= (f16360d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f16398n;
                }
                if (mVar.v(i10, objB, obj)) {
                    V();
                    return f.f16397m;
                }
            }
        } else if (objB == f.f16388d && mVar.v(i10, objB, f.f16393i)) {
            V();
            return mVar.D(i10);
        }
        return i1(mVar, i10, j10, obj);
    }

    public final long i0() {
        return f16361e.get(this);
    }

    public final Object i1(m mVar, int i10, long j10, Object obj) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB == null || objB == f.f16389e) {
                if (j10 < (f16360d.get(this) & 1152921504606846975L)) {
                    if (mVar.v(i10, objB, f.f16392h)) {
                        V();
                        return f.f16399o;
                    }
                } else {
                    if (obj == null) {
                        return f.f16398n;
                    }
                    if (mVar.v(i10, objB, obj)) {
                        V();
                        return f.f16397m;
                    }
                }
            } else {
                if (objB != f.f16388d) {
                    if (objB != f.f16394j && objB != f.f16392h) {
                        if (objB == f.z()) {
                            V();
                            return f.f16399o;
                        }
                        if (objB != f.f16391g && mVar.v(i10, objB, f.f16390f)) {
                            boolean z10 = objB instanceof z;
                            if (z10) {
                                objB = ((z) objB).f16427a;
                            }
                            if (d1(objB, mVar, i10)) {
                                mVar.F(i10, f.f16393i);
                                V();
                                return mVar.D(i10);
                            }
                            mVar.F(i10, f.f16394j);
                            mVar.C(i10, false);
                            if (z10) {
                                V();
                            }
                            return f.f16399o;
                        }
                    }
                    return f.f16399o;
                }
                if (mVar.v(i10, objB, f.f16393i)) {
                    V();
                    return mVar.D(i10);
                }
            }
        }
    }

    @Override // Td.x
    public i iterator() {
        return new a();
    }

    public final Throwable j0() {
        Throwable thC0 = c0();
        return thC0 == null ? new r("Channel was closed") : thC0;
    }

    public final int j1(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        mVar.G(i10, obj);
        if (z10) {
            return k1(mVar, i10, obj, j10, obj2, z10);
        }
        Object objB = mVar.B(i10);
        if (objB == null) {
            if (M(j10)) {
                if (mVar.v(i10, null, f.f16388d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof e1) {
            mVar.w(i10);
            if (c1(objB, obj)) {
                mVar.F(i10, f.f16393i);
                L0();
                return 0;
            }
            if (mVar.x(i10, f.f16395k) == f.f16395k) {
                return 5;
            }
            mVar.C(i10, true);
            return 5;
        }
        return k1(mVar, i10, obj, j10, obj2, z10);
    }

    public final int k1(m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objB = mVar.B(i10);
            if (objB == null) {
                if (!M(j10) || z10) {
                    if (z10) {
                        if (mVar.v(i10, null, f.f16394j)) {
                            mVar.C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.v(i10, null, f.f16388d)) {
                    return 1;
                }
            } else {
                if (objB != f.f16389e) {
                    if (objB == f.f16395k) {
                        mVar.w(i10);
                        return 5;
                    }
                    if (objB == f.f16392h) {
                        mVar.w(i10);
                        return 5;
                    }
                    if (objB == f.z()) {
                        mVar.w(i10);
                        T();
                        return 4;
                    }
                    mVar.w(i10);
                    if (objB instanceof z) {
                        objB = ((z) objB).f16427a;
                    }
                    if (c1(objB, obj)) {
                        mVar.F(i10, f.f16393i);
                        L0();
                        return 0;
                    }
                    if (mVar.x(i10, f.f16395k) != f.f16395k) {
                        mVar.C(i10, true);
                    }
                    return 5;
                }
                if (mVar.v(i10, objB, f.f16388d)) {
                    return 1;
                }
            }
        }
    }

    public final void l1(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16361e;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            e eVar = this;
            long j12 = j10;
            if (f16361e.compareAndSet(eVar, j11, j12)) {
                return;
            }
            this = eVar;
            j10 = j12;
        }
    }

    public final long m0() {
        return f16360d.get(this) & 1152921504606846975L;
    }

    public final void m1(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16360d;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            long j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
            e eVar = this;
            if (f16360d.compareAndSet(eVar, j11, f.w(j12, (int) (j11 >> 60)))) {
                return;
            } else {
                this = eVar;
            }
        }
    }

    @Override // Td.y
    public Object n(Object obj) {
        Object obj2;
        int i10;
        m mVar;
        e eVar;
        if (b1(f16360d.get(this))) {
            return k.f16409b.b();
        }
        Object obj3 = f.f16394j;
        m mVar2 = (m) k0().get(this);
        while (true) {
            long andIncrement = l0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zW0 = this.w0(andIncrement);
            int i11 = f.f16386b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (mVar2.f17897c != j11) {
                m mVarY = this.Y(j11, mVar2);
                if (mVarY != null) {
                    i10 = i12;
                    mVar = mVarY;
                    eVar = this;
                    obj2 = obj;
                } else if (zW0) {
                    return k.f16409b.a(this.j0());
                }
            } else {
                obj2 = obj;
                i10 = i12;
                mVar = mVar2;
                eVar = this;
            }
            int iJ1 = eVar.j1(mVar, i10, obj2, j10, obj3, zW0);
            e eVar2 = eVar;
            mVar2 = mVar;
            if (iJ1 == 0) {
                mVar2.c();
                return k.f16409b.c(C4015H.f34254a);
            }
            if (iJ1 == 1) {
                return k.f16409b.c(C4015H.f34254a);
            }
            if (iJ1 == 2) {
                if (zW0) {
                    mVar2.t();
                    return k.f16409b.a(eVar2.j0());
                }
                e1 e1Var = obj3 instanceof e1 ? (e1) obj3 : null;
                if (e1Var != null) {
                    eVar2.Q0(e1Var, mVar2, i10);
                }
                mVar2.t();
                return k.f16409b.b();
            }
            if (iJ1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iJ1 == 4) {
                if (j10 < eVar2.i0()) {
                    mVar2.c();
                }
                return k.f16409b.a(eVar2.j0());
            }
            if (iJ1 == 5) {
                mVar2.c();
            }
            this = eVar2;
            obj = obj2;
        }
    }

    public final void n1(long j10) {
        e eVar = this;
        if (eVar.y0()) {
            return;
        }
        while (eVar.a0() <= j10) {
            eVar = this;
        }
        int i10 = f.f16387c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jA0 = eVar.a0();
            if (jA0 == (4611686018427387903L & f16363g.get(eVar)) && jA0 == eVar.a0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16363g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j11, f.v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jA02 = eVar.a0();
            long j12 = f16363g.get(eVar);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (jA02 == j13 && jA02 == eVar.a0()) {
                break;
            }
            if (z10) {
                eVar = this;
            } else {
                eVar = this;
                f16363g.compareAndSet(eVar, j12, f.v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16363g;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j14, f.v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }

    public final boolean o0() {
        while (true) {
            m mVarX = (m) f16365i.get(this);
            long jI0 = i0();
            if (m0() <= jI0) {
                return false;
            }
            int i10 = f.f16386b;
            long j10 = jI0 / ((long) i10);
            if (mVarX.f17897c == j10 || (mVarX = X(j10, mVarX)) != null) {
                mVarX.c();
                if (s0(mVarX, (int) (jI0 % ((long) i10)), jI0)) {
                    return true;
                }
                f16361e.compareAndSet(this, jI0, 1 + jI0);
            } else if (((m) f16365i.get(this)).f17897c < j10) {
                return false;
            }
        }
    }

    @Override // Td.y
    public Object p(Object obj, InterfaceC4988e interfaceC4988e) {
        return Z0(this, obj, interfaceC4988e);
    }

    public final void p0(long j10) {
        if ((f16363g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f16363g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    @Override // Td.x
    public Object r(InterfaceC4988e interfaceC4988e) {
        return R0(this, interfaceC4988e);
    }

    public final void r0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16368l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!B0.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f16401q : f.f16402r));
        if (obj == null) {
            return;
        }
        ((vc.l) obj).invoke(c0());
    }

    @Override // Td.y
    public void s(vc.l lVar) {
        if (B0.b.a(f16368l, this, null, lVar)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16368l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != f.f16401q) {
                if (obj == f.f16402r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!B0.b.a(f16368l, this, f.f16401q, f.f16402r));
        lVar.invoke(c0());
    }

    public final boolean s0(m mVar, int i10, long j10) {
        Object objB;
        do {
            objB = mVar.B(i10);
            if (objB != null && objB != f.f16389e) {
                if (objB == f.f16388d) {
                    return true;
                }
                if (objB == f.f16394j || objB == f.z() || objB == f.f16393i || objB == f.f16392h) {
                    return false;
                }
                if (objB == f.f16391g) {
                    return true;
                }
                return objB != f.f16390f && j10 == i0();
            }
        } while (!mVar.v(i10, objB, f.f16392h));
        V();
        return false;
    }

    @Override // Td.x
    public Object t() {
        m mVarX;
        long j10 = f16361e.get(this);
        long j11 = f16360d.get(this);
        if (v0(j11)) {
            return k.f16409b.a(c0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.f16409b.b();
        }
        Object obj = f.f16395k;
        m mVar = (m) g0().get(this);
        while (!this.u0()) {
            long andIncrement = h0().getAndIncrement(this);
            int i10 = f.f16386b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (mVar.f17897c != j12) {
                mVarX = this.X(j12, mVar);
                if (mVarX == null) {
                    continue;
                }
            } else {
                mVarX = mVar;
            }
            e eVar = this;
            Object objH1 = eVar.h1(mVarX, i11, andIncrement, obj);
            mVar = mVarX;
            if (objH1 == f.f16397m) {
                e1 e1Var = obj instanceof e1 ? (e1) obj : null;
                if (e1Var != null) {
                    eVar.P0(e1Var, mVar, i11);
                }
                eVar.n1(andIncrement);
                mVar.t();
                return k.f16409b.b();
            }
            if (objH1 != f.f16399o) {
                if (objH1 == f.f16398n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar.c();
                return k.f16409b.c(objH1);
            }
            if (andIncrement < eVar.m0()) {
                mVar.c();
            }
            this = eVar;
        }
        return k.f16409b.a(this.c0());
    }

    public final boolean t0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            S(j10 & 1152921504606846975L);
            return (z10 && o0()) ? false : true;
        }
        if (i10 == 3) {
            R(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b2, code lost:
    
        r3 = (Td.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b9, code lost:
    
        if (r3 != null) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.e.toString():java.lang.String");
    }

    public boolean u0() {
        return v0(f16360d.get(this));
    }

    public final boolean v0(long j10) {
        return t0(j10, true);
    }

    @Override // Td.y
    public boolean w(Throwable th) {
        return Q(th, false);
    }

    public final boolean w0(long j10) {
        return t0(j10, false);
    }

    @Override // Td.x
    public Object x(InterfaceC4988e interfaceC4988e) {
        return S0(this, interfaceC4988e);
    }

    public boolean x0() {
        return false;
    }

    public final boolean y0() {
        long jA0 = a0();
        return jA0 == 0 || jA0 == Long.MAX_VALUE;
    }

    @Override // Td.y
    public boolean z() {
        return w0(f16360d.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (Td.m) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long z0(Td.m r8) {
        /*
            r7 = this;
        L0:
            int r0 = Td.f.f16386b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f17897c
            int r5 = Td.f.f16386b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.i0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            Wd.E r2 = Td.f.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            Wd.E r2 = Td.f.f16388d
            if (r1 != r2) goto L39
            return r3
        L2c:
            Wd.E r2 = Td.f.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            Wd.c r8 = r8.h()
            Td.m r8 = (Td.m) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.e.z0(Td.m):long");
    }

    public void G0() {
    }

    public void L0() {
    }

    public void M0() {
    }
}
