package y4;

import D4.f;
import J4.j;
import K4.i;
import Rd.I;
import Rd.M;
import android.content.SharedPreferences;
import fc.C4015H;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import org.json.JSONArray;
import vc.q;
import z4.C6505d;

/* JADX INFO: renamed from: y4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6402f implements D4.f, J4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A4.a f48408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f48409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J4.g f48410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f48411d;

    /* JADX INFO: renamed from: y4.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f48412j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f48413k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f48414l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f48416n;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f48414l = obj;
            this.f48416n |= Integer.MIN_VALUE;
            return C6402f.this.l(null, this);
        }
    }

    public C6402f(String storageKey, A4.a logger, SharedPreferences sharedPreferences, File storageDirectory, J4.c diagnostics) {
        AbstractC4862t.e(storageKey, "storageKey");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(sharedPreferences, "sharedPreferences");
        AbstractC4862t.e(storageDirectory, "storageDirectory");
        AbstractC4862t.e(diagnostics, "diagnostics");
        this.f48408a = logger;
        this.f48409b = sharedPreferences;
        this.f48410c = new J4.g(storageDirectory, storageKey, new C6505d(sharedPreferences), logger, diagnostics);
        this.f48411d = new LinkedHashMap();
    }

    @Override // D4.f
    public List a() {
        return this.f48410c.o();
    }

    @Override // D4.f
    public Object b(Object obj, InterfaceC4988e interfaceC4988e) {
        J4.g gVar = this.f48410c;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
        return gVar.j((String) obj, interfaceC4988e);
    }

    @Override // D4.f
    public Object c(InterfaceC4988e interfaceC4988e) {
        Object objU = this.f48410c.u(interfaceC4988e);
        return objU == C5046c.f() ? objU : C4015H.f34254a;
    }

    @Override // D4.f
    public i d(F4.b eventPipeline, D4.b configuration, M scope, I storageDispatcher) {
        AbstractC4862t.e(eventPipeline, "eventPipeline");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(scope, "scope");
        AbstractC4862t.e(storageDispatcher, "storageDispatcher");
        return new j(this, eventPipeline, configuration, scope, storageDispatcher, this.f48408a);
    }

    @Override // J4.h
    public void e(String insertId) {
        AbstractC4862t.e(insertId, "insertId");
        this.f48411d.remove(insertId);
    }

    @Override // J4.h
    public boolean f(String filePath) {
        AbstractC4862t.e(filePath, "filePath");
        return this.f48410c.r(filePath);
    }

    @Override // J4.h
    public void g(String filePath, JSONArray events) {
        AbstractC4862t.e(filePath, "filePath");
        AbstractC4862t.e(events, "events");
        this.f48410c.v(filePath, events);
    }

    @Override // J4.h
    public q h(String insertId) {
        AbstractC4862t.e(insertId, "insertId");
        return (q) this.f48411d.get(insertId);
    }

    @Override // D4.f
    public String i(f.a key) {
        AbstractC4862t.e(key, "key");
        return this.f48409b.getString(key.b(), null);
    }

    @Override // J4.h
    public void j(String filePath) {
        AbstractC4862t.e(filePath, "filePath");
        this.f48410c.q(filePath);
    }

    @Override // D4.f
    public Object k(f.a aVar, String str, InterfaceC4988e interfaceC4988e) {
        SharedPreferences.Editor editorEdit = this.f48409b.edit();
        editorEdit.putString(aVar.b(), str);
        editorEdit.apply();
        return C4015H.f34254a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // D4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(E4.a r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y4.C6402f.a
            if (r0 == 0) goto L13
            r0 = r6
            y4.f$a r0 = (y4.C6402f.a) r0
            int r1 = r0.f48416n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48416n = r1
            goto L18
        L13:
            y4.f$a r0 = new y4.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f48414l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f48416n
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f48413k
            r5 = r4
            E4.a r5 = (E4.a) r5
            java.lang.Object r4 = r0.f48412j
            y4.f r4 = (y4.C6402f) r4
            fc.AbstractC4036s.b(r6)
            goto L52
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            fc.AbstractC4036s.b(r6)
            J4.g r6 = r4.f48410c
            J4.o r2 = J4.o.f6229a
            java.lang.String r2 = r2.b(r5)
            r0.f48412j = r4
            r0.f48413k = r5
            r0.f48416n = r3
            java.lang.Object r6 = r6.w(r2, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            vc.q r6 = r5.f()
            if (r6 == 0) goto L66
            java.lang.String r5 = r5.u()
            if (r5 == 0) goto L66
            java.util.Map r4 = r4.f48411d
            java.lang.Object r4 = r4.put(r5, r6)
            vc.q r4 = (vc.q) r4
        L66:
            fc.H r4 = fc.C4015H.f34254a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.C6402f.l(E4.a, lc.e):java.lang.Object");
    }

    public final void m() {
        this.f48410c.f();
    }

    public Object n(f.a aVar, InterfaceC4988e interfaceC4988e) {
        SharedPreferences.Editor editorEdit = this.f48409b.edit();
        editorEdit.remove(aVar.b());
        editorEdit.apply();
        return C4015H.f34254a;
    }
}
