package w4;

import com.fasterxml.jackson.core.JsonPointer;
import fc.C4015H;
import io.sentry.TraceContext;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.protocol.DebugImage;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;
import org.json.JSONException;
import org.json.JSONObject;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46197c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.a f46198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f46199b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46200j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f46201k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46202l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46204n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46202l = obj;
            this.f46204n |= Integer.MIN_VALUE;
            return g.this.g(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46205j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f46206k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46207l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46209n;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46207l = obj;
            this.f46209n |= Integer.MIN_VALUE;
            return g.this.i(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46210j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f46211k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46212l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46214n;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46212l = obj;
            this.f46214n |= Integer.MIN_VALUE;
            return g.this.j(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class e extends AbstractC4860q implements l {
        public e(Object obj) {
            super(1, obj, w4.c.class, "removeEvent", "removeEvent(J)V", 0);
        }

        public final void i(long j10) {
            ((w4.c) this.receiver).o(j10);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i(((Number) obj).longValue());
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46215j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f46216k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46217l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46219n;

        public f(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46217l = obj;
            this.f46219n |= Integer.MIN_VALUE;
            return g.this.k(this);
        }
    }

    /* JADX INFO: renamed from: w4.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class C0634g extends AbstractC4860q implements l {
        public C0634g(Object obj) {
            super(1, obj, w4.c.class, "removeIdentify", "removeIdentify(J)V", 0);
        }

        public final void i(long j10) {
            ((w4.c) this.receiver).u(j10);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i(((Number) obj).longValue());
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46220j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f46221k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46222l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46224n;

        public h(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46222l = obj;
            this.f46224n |= Integer.MIN_VALUE;
            return g.this.l(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class i extends AbstractC4860q implements l {
        public i(Object obj) {
            super(1, obj, w4.c.class, "removeInterceptedIdentify", "removeInterceptedIdentify(J)V", 0);
        }

        public final void i(long j10) {
            ((w4.c) this.receiver).C(j10);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i(((Number) obj).longValue());
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46225j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f46226k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f46227l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f46228m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f46229n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f46230o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f46232q;

        public j(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46230o = obj;
            this.f46232q |= Integer.MIN_VALUE;
            return g.this.m(this);
        }
    }

    public g(D4.a amplitude, w4.c databaseStorage) {
        AbstractC4862t.e(amplitude, "amplitude");
        AbstractC4862t.e(databaseStorage, "databaseStorage");
        this.f46198a = amplitude;
        this.f46199b = databaseStorage;
    }

    public final long f(JSONObject jSONObject) throws JSONException {
        long j10 = jSONObject.getLong("$rowId");
        jSONObject.put("event_id", j10);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("library");
        if (jSONObjectOptJSONObject != null) {
            jSONObject.put("library", jSONObjectOptJSONObject.getString("name") + JsonPointer.SEPARATOR + jSONObjectOptJSONObject.getString("version"));
        }
        Object objOpt = jSONObject.opt("timestamp");
        if (objOpt != null) {
            jSONObject.put("time", objOpt);
        }
        Object objOpt2 = jSONObject.opt(DebugImage.JsonKeys.UUID);
        if (objOpt2 != null) {
            jSONObject.put("insert_id", objOpt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("api_properties");
        if (jSONObjectOptJSONObject2 != null) {
            Object objOpt3 = jSONObjectOptJSONObject2.opt("androidADID");
            if (objOpt3 != null) {
                AbstractC4862t.b(objOpt3);
                jSONObject.put("adid", objOpt3);
            }
            Object objOpt4 = jSONObjectOptJSONObject2.opt("android_app_set_id");
            if (objOpt4 != null) {
                AbstractC4862t.b(objOpt4);
                jSONObject.put("android_app_set_id", objOpt4);
            }
            Object objOpt5 = jSONObjectOptJSONObject2.opt("productId");
            if (objOpt5 != null) {
                AbstractC4862t.b(objOpt5);
                jSONObject.put("productId", objOpt5);
            }
            Object objOpt6 = jSONObjectOptJSONObject2.opt(DiscardedEvent.JsonKeys.QUANTITY);
            if (objOpt6 != null) {
                AbstractC4862t.b(objOpt6);
                jSONObject.put(DiscardedEvent.JsonKeys.QUANTITY, objOpt6);
            }
            Object objOpt7 = jSONObjectOptJSONObject2.opt("price");
            if (objOpt7 != null) {
                AbstractC4862t.b(objOpt7);
                jSONObject.put("price", objOpt7);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("location");
            if (jSONObjectOptJSONObject3 != null) {
                AbstractC4862t.b(jSONObjectOptJSONObject3);
                Object objOpt8 = jSONObjectOptJSONObject3.opt("lat");
                if (objOpt8 != null) {
                    AbstractC4862t.b(objOpt8);
                    jSONObject.put("location_lat", objOpt8);
                }
                Object objOpt9 = jSONObjectOptJSONObject3.opt("lng");
                if (objOpt9 != null) {
                    AbstractC4862t.b(objOpt9);
                    jSONObject.put("location_lng", objOpt9);
                }
            }
        }
        Object objOpt10 = jSONObject.opt("$productId");
        if (objOpt10 != null) {
            jSONObject.put("productId", objOpt10);
        }
        Object objOpt11 = jSONObject.opt("$quantity");
        if (objOpt11 != null) {
            jSONObject.put(DiscardedEvent.JsonKeys.QUANTITY, objOpt11);
        }
        Object objOpt12 = jSONObject.opt("$price");
        if (objOpt12 != null) {
            jSONObject.put("price", objOpt12);
        }
        Object objOpt13 = jSONObject.opt("$revenueType");
        if (objOpt13 != null) {
            jSONObject.put("revenueType", objOpt13);
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r4.k(r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        if (r4.c(r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[PHI: r2
      0x00a8: PHI (r2v8 w4.g) = (r2v5 w4.g), (r2v9 w4.g) binds: [B:30:0x008c, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[PHI: r4
      0x00c7: PHI (r4v19 w4.g) = (r4v16 w4.g), (r4v24 w4.g) binds: [B:44:0x00c4, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(lc.InterfaceC4988e r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.g(lc.e):java.lang.Object");
    }

    public final void h() {
        try {
            String strD = this.f46199b.d("device_id");
            String strD2 = this.f46199b.d(TraceContext.JsonKeys.USER_ID);
            if (strD == null && strD2 == null) {
                return;
            }
            M4.e eVarLoad = this.f46198a.q().load();
            if (eVarLoad.a() == null && strD != null) {
                this.f46198a.q().b(strD);
            }
            if (eVarLoad.b() != null || strD2 == null) {
                return;
            }
            this.f46198a.q().a(strD2);
        } catch (Exception e10) {
            B4.b.f644c.a().d("device/user id migration failed: " + e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(org.json.JSONObject r7, D4.f r8, vc.l r9, lc.InterfaceC4988e r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof w4.g.c
            if (r0 == 0) goto L13
            r0 = r10
            w4.g$c r0 = (w4.g.c) r0
            int r1 = r0.f46209n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46209n = r1
            goto L18
        L13:
            w4.g$c r0 = new w4.g$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f46207l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f46209n
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r6 = r0.f46206k
            java.lang.Object r8 = r0.f46205j
            r9 = r8
            vc.l r9 = (vc.l) r9
            fc.AbstractC4036s.b(r10)     // Catch: java.lang.Exception -> L59
            goto L51
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            fc.AbstractC4036s.b(r10)
            long r4 = r6.f(r7)     // Catch: java.lang.Exception -> L59
            E4.a r6 = J4.p.g(r7)     // Catch: java.lang.Exception -> L59
            r0.f46205j = r9     // Catch: java.lang.Exception -> L59
            r0.f46206k = r4     // Catch: java.lang.Exception -> L59
            r0.f46209n = r3     // Catch: java.lang.Exception -> L59
            java.lang.Object r6 = r8.l(r6, r0)     // Catch: java.lang.Exception -> L59
            if (r6 != r1) goto L50
            return r1
        L50:
            r6 = r4
        L51:
            java.lang.Long r6 = nc.AbstractC5158b.d(r6)     // Catch: java.lang.Exception -> L59
            r9.invoke(r6)     // Catch: java.lang.Exception -> L59
            goto L78
        L59:
            r6 = move-exception
            B4.b$a r7 = B4.b.f644c
            B4.b r7 = r7.a()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "event migration failed: "
            r8.append(r9)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.d(r6)
        L78:
            fc.H r6 = fc.C4015H.f34254a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.i(org.json.JSONObject, D4.f, vc.l, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof w4.g.d
            if (r0 == 0) goto L13
            r0 = r9
            w4.g$d r0 = (w4.g.d) r0
            int r1 = r0.f46214n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46214n = r1
            goto L18
        L13:
            w4.g$d r0 = new w4.g$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46212l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f46214n
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.f46211k
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.f46210j
            w4.g r2 = (w4.g) r2
            fc.AbstractC4036s.b(r9)     // Catch: java.lang.Exception -> L70
            r9 = r2
            goto L4a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            fc.AbstractC4036s.b(r9)
            w4.c r9 = r8.f46199b     // Catch: java.lang.Exception -> L70
            java.util.List r9 = r9.i()     // Catch: java.lang.Exception -> L70
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L70
            r7 = r9
            r9 = r8
            r8 = r7
        L4a:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Exception -> L70
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Exception -> L70
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Exception -> L70
            D4.a r4 = r9.f46198a     // Catch: java.lang.Exception -> L70
            D4.f r4 = r4.u()     // Catch: java.lang.Exception -> L70
            w4.g$e r5 = new w4.g$e     // Catch: java.lang.Exception -> L70
            w4.c r6 = r9.f46199b     // Catch: java.lang.Exception -> L70
            r5.<init>(r6)     // Catch: java.lang.Exception -> L70
            r0.f46210j = r9     // Catch: java.lang.Exception -> L70
            r0.f46211k = r8     // Catch: java.lang.Exception -> L70
            r0.f46214n = r3     // Catch: java.lang.Exception -> L70
            java.lang.Object r2 = r9.i(r2, r4, r5, r0)     // Catch: java.lang.Exception -> L70
            if (r2 != r1) goto L4a
            return r1
        L70:
            r8 = move-exception
            B4.b$a r9 = B4.b.f644c
            B4.b r9 = r9.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "events migration failed: "
            r0.append(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.d(r8)
        L8f:
            fc.H r8 = fc.C4015H.f34254a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.j(lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof w4.g.f
            if (r0 == 0) goto L13
            r0 = r9
            w4.g$f r0 = (w4.g.f) r0
            int r1 = r0.f46219n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46219n = r1
            goto L18
        L13:
            w4.g$f r0 = new w4.g$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46217l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f46219n
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.f46216k
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.f46215j
            w4.g r2 = (w4.g) r2
            fc.AbstractC4036s.b(r9)     // Catch: java.lang.Exception -> L70
            r9 = r2
            goto L4a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            fc.AbstractC4036s.b(r9)
            w4.c r9 = r8.f46199b     // Catch: java.lang.Exception -> L70
            java.util.List r9 = r9.k()     // Catch: java.lang.Exception -> L70
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L70
            r7 = r9
            r9 = r8
            r8 = r7
        L4a:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Exception -> L70
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Exception -> L70
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Exception -> L70
            D4.a r4 = r9.f46198a     // Catch: java.lang.Exception -> L70
            D4.f r4 = r4.u()     // Catch: java.lang.Exception -> L70
            w4.g$g r5 = new w4.g$g     // Catch: java.lang.Exception -> L70
            w4.c r6 = r9.f46199b     // Catch: java.lang.Exception -> L70
            r5.<init>(r6)     // Catch: java.lang.Exception -> L70
            r0.f46215j = r9     // Catch: java.lang.Exception -> L70
            r0.f46216k = r8     // Catch: java.lang.Exception -> L70
            r0.f46219n = r3     // Catch: java.lang.Exception -> L70
            java.lang.Object r2 = r9.i(r2, r4, r5, r0)     // Catch: java.lang.Exception -> L70
            if (r2 != r1) goto L4a
            return r1
        L70:
            r8 = move-exception
            B4.b$a r9 = B4.b.f644c
            B4.b r9 = r9.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "identifies migration failed: "
            r0.append(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.d(r8)
        L8f:
            fc.H r8 = fc.C4015H.f34254a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.k(lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof w4.g.h
            if (r0 == 0) goto L13
            r0 = r9
            w4.g$h r0 = (w4.g.h) r0
            int r1 = r0.f46224n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46224n = r1
            goto L18
        L13:
            w4.g$h r0 = new w4.g$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46222l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f46224n
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.f46221k
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.f46220j
            w4.g r2 = (w4.g) r2
            fc.AbstractC4036s.b(r9)     // Catch: java.lang.Exception -> L70
            r9 = r2
            goto L4a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            fc.AbstractC4036s.b(r9)
            w4.c r9 = r8.f46199b     // Catch: java.lang.Exception -> L70
            java.util.List r9 = r9.m()     // Catch: java.lang.Exception -> L70
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L70
            r7 = r9
            r9 = r8
            r8 = r7
        L4a:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Exception -> L70
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Exception -> L70
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Exception -> L70
            D4.a r4 = r9.f46198a     // Catch: java.lang.Exception -> L70
            D4.f r4 = r4.p()     // Catch: java.lang.Exception -> L70
            w4.g$i r5 = new w4.g$i     // Catch: java.lang.Exception -> L70
            w4.c r6 = r9.f46199b     // Catch: java.lang.Exception -> L70
            r5.<init>(r6)     // Catch: java.lang.Exception -> L70
            r0.f46220j = r9     // Catch: java.lang.Exception -> L70
            r0.f46221k = r8     // Catch: java.lang.Exception -> L70
            r0.f46224n = r3     // Catch: java.lang.Exception -> L70
            java.lang.Object r2 = r9.i(r2, r4, r5, r0)     // Catch: java.lang.Exception -> L70
            if (r2 != r1) goto L4a
            return r1
        L70:
            r8 = move-exception
            B4.b$a r9 = B4.b.f644c
            B4.b r9 = r9.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "intercepted identifies migration failed: "
            r0.append(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.d(r8)
        L8f:
            fc.H r8 = fc.C4015H.f34254a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.l(lc.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
    
        if (r1.k(r4, r6, r2) != r3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c A[PHI: r0 r4 r8
      0x011c: PHI (r0v8 w4.g) = (r0v5 w4.g), (r0v5 w4.g), (r0v10 w4.g) binds: [B:46:0x00f0, B:47:0x00f2, B:52:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r4v7 java.lang.Long) = (r4v4 java.lang.Long), (r4v4 java.lang.Long), (r4v9 java.lang.Long) binds: [B:46:0x00f0, B:47:0x00f2, B:52:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r8v5 java.lang.Long) = (r8v3 java.lang.Long), (r8v3 java.lang.Long), (r8v6 java.lang.Long) binds: [B:46:0x00f0, B:47:0x00f2, B:52:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(lc.InterfaceC4988e r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.m(lc.e):java.lang.Object");
    }
}
