package p9;

import kotlin.jvm.internal.AbstractC4854k;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: renamed from: p9.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5443t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f42491c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42493b;

    /* JADX INFO: renamed from: p9.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: p9.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0564a extends AbstractC5160d {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f42494j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f42495k;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f42497m;

            public C0564a(InterfaceC4988e interfaceC4988e) {
                super(interfaceC4988e);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) {
                this.f42495k = obj;
                this.f42497m |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        
            if (r7 == r9) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [P8.h] */
        /* JADX WARN: Type inference failed for: r8v0, types: [P8.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18 */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v20 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(P8.h r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p9.C5443t.a.C0564a
                if (r0 == 0) goto L13
                r0 = r9
                p9.t$a$a r0 = (p9.C5443t.a.C0564a) r0
                int r1 = r0.f42497m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f42497m = r1
                goto L18
            L13:
                p9.t$a$a r0 = new p9.t$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r7 = r0.f42495k
                java.lang.Object r9 = mc.C5046c.f()
                int r1 = r0.f42497m
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                java.lang.String r5 = ""
                if (r1 == 0) goto L48
                if (r1 == r4) goto L3e
                if (r1 != r3) goto L36
                java.lang.Object r8 = r0.f42494j
                java.lang.String r8 = (java.lang.String) r8
                fc.AbstractC4036s.b(r7)     // Catch: java.lang.Exception -> L34
                goto L85
            L34:
                r7 = move-exception
                goto L8c
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r8 = r0.f42494j
                P8.h r8 = (P8.h) r8
                fc.AbstractC4036s.b(r7)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r7 = move-exception
                goto L6a
            L48:
                fc.AbstractC4036s.b(r7)
                r7 = 0
                com.google.android.gms.tasks.Task r7 = r8.a(r7)     // Catch: java.lang.Exception -> L46
                java.lang.String r1 = "getToken(...)"
                kotlin.jvm.internal.AbstractC4862t.d(r7, r1)     // Catch: java.lang.Exception -> L46
                r0.f42494j = r8     // Catch: java.lang.Exception -> L46
                r0.f42497m = r4     // Catch: java.lang.Exception -> L46
                java.lang.Object r7 = be.AbstractC2924b.a(r7, r0)     // Catch: java.lang.Exception -> L46
                if (r7 != r9) goto L60
                goto L84
            L60:
                P8.m r7 = (P8.m) r7     // Catch: java.lang.Exception -> L46
                java.lang.String r7 = r7.b()     // Catch: java.lang.Exception -> L46
                r6 = r8
                r8 = r7
                r7 = r6
                goto L71
            L6a:
                java.lang.String r1 = "Error getting authentication token."
                android.util.Log.w(r2, r1, r7)
                r7 = r8
                r8 = r5
            L71:
                com.google.android.gms.tasks.Task r7 = r7.getId()     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = "getId(...)"
                kotlin.jvm.internal.AbstractC4862t.d(r7, r1)     // Catch: java.lang.Exception -> L34
                r0.f42494j = r8     // Catch: java.lang.Exception -> L34
                r0.f42497m = r3     // Catch: java.lang.Exception -> L34
                java.lang.Object r7 = be.AbstractC2924b.a(r7, r0)     // Catch: java.lang.Exception -> L34
                if (r7 != r9) goto L85
            L84:
                return r9
            L85:
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L34
                if (r7 != 0) goto L8a
                goto L91
            L8a:
                r5 = r7
                goto L91
            L8c:
                java.lang.String r9 = "Error getting Firebase installation id ."
                android.util.Log.w(r2, r9, r7)
            L91:
                p9.t r7 = new p9.t
                r9 = 0
                r7.<init>(r5, r8, r9)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.C5443t.a.a(P8.h, lc.e):java.lang.Object");
        }

        public a() {
        }
    }

    public /* synthetic */ C5443t(String str, String str2, AbstractC4854k abstractC4854k) {
        this(str, str2);
    }

    public final String a() {
        return this.f42493b;
    }

    public final String b() {
        return this.f42492a;
    }

    public C5443t(String str, String str2) {
        this.f42492a = str;
        this.f42493b = str2;
    }
}
