package d3;

import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import b3.t;
import fc.C4015H;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f33035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f33036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f33037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ vc.l f33038d;

        /* JADX INFO: renamed from: d3.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0396a implements InterfaceC2314f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2314f f33039a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f33040b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f33041c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ vc.l f33042d;

            /* JADX INFO: renamed from: d3.m$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0397a extends AbstractC5160d {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public /* synthetic */ Object f33043j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public int f33044k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public Object f33045l;

                public C0397a(InterfaceC4988e interfaceC4988e) {
                    super(interfaceC4988e);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) {
                    this.f33043j = obj;
                    this.f33044k |= Integer.MIN_VALUE;
                    return C0396a.this.emit(null, this);
                }
            }

            public C0396a(InterfaceC2314f interfaceC2314f, t tVar, boolean z10, vc.l lVar) {
                this.f33039a = interfaceC2314f;
                this.f33040b = tVar;
                this.f33041c = z10;
                this.f33042d = lVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r6.emit(r8, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Ud.InterfaceC2314f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof d3.m.a.C0396a.C0397a
                    if (r0 == 0) goto L13
                    r0 = r8
                    d3.m$a$a$a r0 = (d3.m.a.C0396a.C0397a) r0
                    int r1 = r0.f33044k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33044k = r1
                    goto L18
                L13:
                    d3.m$a$a$a r0 = new d3.m$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f33043j
                    java.lang.Object r1 = mc.C5046c.f()
                    int r2 = r0.f33044k
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    fc.AbstractC4036s.b(r8)
                    goto L63
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f33045l
                    Ud.f r6 = (Ud.InterfaceC2314f) r6
                    fc.AbstractC4036s.b(r8)
                    goto L57
                L3c:
                    fc.AbstractC4036s.b(r8)
                    Ud.f r8 = r6.f33039a
                    java.util.Set r7 = (java.util.Set) r7
                    b3.t r7 = r6.f33040b
                    boolean r2 = r6.f33041c
                    vc.l r6 = r6.f33042d
                    r0.f33045l = r8
                    r0.f33044k = r4
                    java.lang.Object r6 = h3.AbstractC4270a.d(r7, r4, r2, r6, r0)
                    if (r6 != r1) goto L54
                    goto L62
                L54:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L57:
                    r7 = 0
                    r0.f33045l = r7
                    r0.f33044k = r3
                    java.lang.Object r6 = r6.emit(r8, r0)
                    if (r6 != r1) goto L63
                L62:
                    return r1
                L63:
                    fc.H r6 = fc.C4015H.f34254a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: d3.m.a.C0396a.emit(java.lang.Object, lc.e):java.lang.Object");
            }
        }

        public a(InterfaceC2313e interfaceC2313e, t tVar, boolean z10, vc.l lVar) {
            this.f33035a = interfaceC2313e;
            this.f33036b = tVar;
            this.f33037c = z10;
            this.f33038d = lVar;
        }

        @Override // Ud.InterfaceC2313e
        public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            Object objCollect = this.f33035a.collect(new C0396a(interfaceC2314f, this.f33036b, this.f33037c, this.f33038d), interfaceC4988e);
            return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
        }
    }

    public static final InterfaceC2313e a(t db2, boolean z10, String[] tableNames, vc.l block) {
        AbstractC4862t.e(db2, "db");
        AbstractC4862t.e(tableNames, "tableNames");
        AbstractC4862t.e(block, "block");
        return new a(AbstractC2315g.k(db2.u().j((String[]) Arrays.copyOf(tableNames, tableNames.length), true)), db2, z10, block);
    }
}
