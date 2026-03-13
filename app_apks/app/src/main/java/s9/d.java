package s9;

import Pd.a;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import android.util.Log;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import org.json.JSONObject;
import p9.C5426b;
import p9.X;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f44330g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Od.o f44332i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f44333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P8.h f44334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5426b f44335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5812a f44336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f44337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2687a f44338f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int a() {
            return d.f44331h;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f44339j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f44340k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f44341l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f44343n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f44341l = obj;
            this.f44343n |= Integer.MIN_VALUE;
            return d.this.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f44344j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f44345k;

        public c(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, InterfaceC4988e interfaceC4988e) {
            return ((c) create(jSONObject, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            c cVar = d.this.new c(interfaceC4988e);
            cVar.f44345k = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f0 A[RETURN] */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s9.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: s9.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0594d extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f44347j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f44348k;

        public C0594d(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, InterfaceC4988e interfaceC4988e) {
            return ((C0594d) create(str, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            C0594d c0594d = new C0594d(interfaceC4988e);
            c0594d.f44348k = obj;
            return c0594d;
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f44347j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f44348k));
            return C4015H.f34254a;
        }
    }

    static {
        a.C0170a c0170a = Pd.a.f13294b;
        f44331h = (int) Pd.a.D(Pd.c.s(24, Pd.d.HOURS));
        f44332i = new Od.o("/");
    }

    public d(X timeProvider, P8.h firebaseInstallationsApi, C5426b appInfo, InterfaceC5812a configsFetcher, l settingsCache) {
        AbstractC4862t.e(timeProvider, "timeProvider");
        AbstractC4862t.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC4862t.e(appInfo, "appInfo");
        AbstractC4862t.e(configsFetcher, "configsFetcher");
        AbstractC4862t.e(settingsCache, "settingsCache");
        this.f44333a = timeProvider;
        this.f44334b = firebaseInstallationsApi;
        this.f44335c = appInfo;
        this.f44336d = configsFetcher;
        this.f44337e = settingsCache;
        this.f44338f = AbstractC2693g.b(false, 1, null);
    }

    @Override // s9.o
    public Boolean a() {
        return this.f44337e.c();
    }

    @Override // s9.o
    public Pd.a b() {
        Integer numD = this.f44337e.d();
        if (numD == null) {
            return null;
        }
        a.C0170a c0170a = Pd.a.f13294b;
        return Pd.a.q(Pd.c.s(numD.intValue(), Pd.d.SECONDS));
    }

    @Override // s9.o
    public Double c() {
        return this.f44337e.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x013f, code lost:
    
        if (r4.a(r13, r5, r2, r0) == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:52:0x0142, B:21:0x004a, B:44:0x00b2, B:46:0x00c0, B:49:0x00cb), top: B:58:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:52:0x0142, B:21:0x004a, B:44:0x00b2, B:46:0x00c0, B:49:0x00cb), top: B:58:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, s9.d] */
    /* JADX WARN: Type inference failed for: r12v1, types: [ae.a] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, s9.d] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [s9.d] */
    @Override // s9.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(lc.InterfaceC4988e r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.d.d(lc.e):java.lang.Object");
    }

    public final String i(String str) {
        return f44332i.j(str, "");
    }
}
