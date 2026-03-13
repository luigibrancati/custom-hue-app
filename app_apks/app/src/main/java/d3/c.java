package d3;

import b3.C;
import b3.D;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import n3.C5081a;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import tc.AbstractC5877a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements D, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5081a f32988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D.a f32989b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements C, p {
        public a() {
        }

        @Override // b3.m
        public Object a(String str, vc.l lVar, InterfaceC4988e interfaceC4988e) {
            return c.this.a(str, lVar, interfaceC4988e);
        }

        @Override // d3.p
        public InterfaceC4792b d() {
            return c.this.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32991a;

        static {
            int[] iArr = new int[D.a.values().length];
            try {
                iArr[D.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[D.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32991a = iArr;
        }
    }

    /* JADX INFO: renamed from: d3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0395c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f32992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f32993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f32994l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f32996n;

        public C0395c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f32994l = obj;
            this.f32996n |= Integer.MIN_VALUE;
            return c.this.g(null, null, this);
        }
    }

    public c(C5081a delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f32988a = delegate;
    }

    @Override // b3.m
    public Object a(String str, vc.l lVar, InterfaceC4988e interfaceC4988e) throws Exception {
        InterfaceC4794d interfaceC4794dA1 = this.f32988a.a1(str);
        try {
            Object objInvoke = lVar.invoke(interfaceC4794dA1);
            AbstractC5877a.a(interfaceC4794dA1, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // b3.D
    public Object b(D.a aVar, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        return g(aVar, pVar, interfaceC4988e);
    }

    @Override // b3.D
    public Object c(InterfaceC4988e interfaceC4988e) {
        return AbstractC5158b.a(this.f32988a.a().inTransaction());
    }

    @Override // d3.p
    public InterfaceC4792b d() {
        return this.f32988a;
    }

    public final C5081a f() {
        return this.f32988a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(b3.D.a r7, vc.p r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof d3.c.C0395c
            if (r0 == 0) goto L13
            r0 = r9
            d3.c$c r0 = (d3.c.C0395c) r0
            int r1 = r0.f32996n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32996n = r1
            goto L18
        L13:
            d3.c$c r0 = new d3.c$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f32994l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f32996n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r6 = r0.f32993k
            android.database.sqlite.SQLiteDatabase r6 = (android.database.sqlite.SQLiteDatabase) r6
            java.lang.Object r7 = r0.f32992j
            d3.c r7 = (d3.c) r7
            fc.AbstractC4036s.b(r9)     // Catch: java.lang.Throwable -> L32
            goto L84
        L32:
            r8 = move-exception
            goto L96
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            fc.AbstractC4036s.b(r9)
            n3.a r9 = r6.f32988a
            android.database.sqlite.SQLiteDatabase r9 = r9.a()
            boolean r2 = r9.inTransaction()
            if (r2 != 0) goto L4d
            r6.f32989b = r7
        L4d:
            int[] r2 = d3.c.b.f32991a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r4) goto L6b
            r2 = 2
            if (r7 == r2) goto L67
            r2 = 3
            if (r7 != r2) goto L61
            r9.beginTransaction()
            goto L6e
        L61:
            fc.o r6 = new fc.o
            r6.<init>()
            throw r6
        L67:
            r9.beginTransactionNonExclusive()
            goto L6e
        L6b:
            r9.beginTransactionNonExclusive()
        L6e:
            d3.c$a r7 = new d3.c$a     // Catch: java.lang.Throwable -> L93
            r7.<init>()     // Catch: java.lang.Throwable -> L93
            r0.f32992j = r6     // Catch: java.lang.Throwable -> L93
            r0.f32993k = r9     // Catch: java.lang.Throwable -> L93
            r0.f32996n = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r7 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L93
            if (r7 != r1) goto L80
            return r1
        L80:
            r5 = r7
            r7 = r6
            r6 = r9
            r9 = r5
        L84:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L32
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto L92
            r7.f32989b = r3
        L92:
            return r9
        L93:
            r8 = move-exception
            r7 = r6
            r6 = r9
        L96:
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto La1
            r7.f32989b = r3
        La1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.c.g(b3.D$a, vc.p, lc.e):java.lang.Object");
    }
}
