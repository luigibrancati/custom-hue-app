package Vd;

import Rd.M;
import Rd.N;
import Rd.O;
import Rd.Q;
import Ud.AbstractC2315g;
import Ud.InterfaceC2314f;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4179C;
import java.util.ArrayList;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4992i f17521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Td.a f17523c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17524j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17525k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2314f f17526l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f17527m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2314f interfaceC2314f, e eVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f17526l = interfaceC2314f;
            this.f17527m = eVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f17526l, this.f17527m, interfaceC4988e);
            aVar.f17525k = obj;
            return aVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f17524j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                M m10 = (M) this.f17525k;
                InterfaceC2314f interfaceC2314f = this.f17526l;
                Td.x xVarI = this.f17527m.i(m10);
                this.f17524j = 1;
                if (AbstractC2315g.n(interfaceC2314f, xVarI, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17528j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17529k;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Td.v vVar, InterfaceC4988e interfaceC4988e) {
            return ((b) create(vVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            b bVar = e.this.new b(interfaceC4988e);
            bVar.f17529k = obj;
            return bVar;
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f17528j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                Td.v vVar = (Td.v) this.f17529k;
                e eVar = e.this;
                this.f17528j = 1;
                if (eVar.e(vVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    public e(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        this.f17521a = interfaceC4992i;
        this.f17522b = i10;
        this.f17523c = aVar;
    }

    public static /* synthetic */ Object d(e eVar, InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        Object objD = N.d(new a(interfaceC2314f, eVar, null), interfaceC4988e);
        return objD == C5046c.f() ? objD : C4015H.f34254a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // Vd.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Ud.InterfaceC2313e a(lc.InterfaceC4992i r2, int r3, Td.a r4) {
        /*
            r1 = this;
            lc.i r0 = r1.f17521a
            lc.i r2 = r2.plus(r0)
            Td.a r0 = Td.a.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f17522b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            Td.a r4 = r1.f17523c
        L25:
            lc.i r0 = r1.f17521a
            boolean r0 = kotlin.jvm.internal.AbstractC4862t.a(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f17522b
            if (r3 != r0) goto L36
            Td.a r0 = r1.f17523c
            if (r4 != r0) goto L36
            return r1
        L36:
            Vd.e r1 = r1.f(r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Vd.e.a(lc.i, int, Td.a):Ud.e");
    }

    public String b() {
        return null;
    }

    @Override // Ud.InterfaceC2313e
    public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        return d(this, interfaceC2314f, interfaceC4988e);
    }

    public abstract Object e(Td.v vVar, InterfaceC4988e interfaceC4988e);

    public abstract e f(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar);

    public final vc.p g() {
        return new b(null);
    }

    public final int h() {
        int i10 = this.f17522b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public Td.x i(M m10) {
        return Td.t.d(m10, this.f17521a, h(), this.f17523c, O.ATOMIC, null, g(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        if (this.f17521a != C4993j.f40088a) {
            arrayList.add("context=" + this.f17521a);
        }
        if (this.f17522b != -3) {
            arrayList.add("capacity=" + this.f17522b);
        }
        if (this.f17523c != Td.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f17523c);
        }
        return Q.a(this) + '[' + C4179C.q0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
