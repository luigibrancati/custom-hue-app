package com.braze.managers;

import android.app.AlarmManager;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.storage.b3;
import com.braze.storage.h3;
import com.braze.storage.k1;
import com.braze.storage.m2;
import com.braze.storage.n3;
import com.braze.storage.s2;
import com.braze.storage.v2;
import com.braze.storage.w1;
import com.braze.storage.w2;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements r0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p f27905A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final k0 f27906B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final j f27907C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final com.braze.storage.p f27908D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final com.braze.requests.i f27909E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final com.braze.requests.framework.g f27910F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final com.braze.triggers.managers.f f27911G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f27913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f27914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f27915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f27916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v2 f27920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.braze.storage.t0 f27921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.braze.requests.util.a f27922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n3 f27923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.braze.storage.v0 f27924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.braze.events.d f27925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b3 f27926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f27927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.braze.events.a f27928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.braze.dispatch.f f27929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f27930s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h0 f27931t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y0 f27932u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s2 f27933v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m2 f27934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w2 f27935x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r f27936y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final BrazeGeofenceManager f27937z;

    public j1(Context applicationContext, com.braze.configuration.e offlineUserStorageProvider, BrazeConfigurationProvider configurationProvider, com.braze.events.e externalEventPublisher, o0 deviceIdProvider, q0 registrationDataProvider, v0 pushDeliveryManager, boolean z10, boolean z11, n0 deviceDataProvider, boolean z12) {
        com.braze.storage.v0 v0Var;
        Context context;
        com.braze.storage.v0 v0Var2;
        AbstractC4862t.e(applicationContext, "applicationContext");
        AbstractC4862t.e(offlineUserStorageProvider, "offlineUserStorageProvider");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        AbstractC4862t.e(externalEventPublisher, "externalEventPublisher");
        AbstractC4862t.e(deviceIdProvider, "deviceIdProvider");
        AbstractC4862t.e(registrationDataProvider, "registrationDataProvider");
        AbstractC4862t.e(pushDeliveryManager, "pushDeliveryManager");
        AbstractC4862t.e(deviceDataProvider, "deviceDataProvider");
        this.f27912a = applicationContext;
        this.f27913b = configurationProvider;
        this.f27914c = deviceIdProvider;
        this.f27915d = pushDeliveryManager;
        this.f27916e = deviceDataProvider;
        this.f27917f = z12;
        String strA = offlineUserStorageProvider.a();
        this.f27918g = strA;
        String str = configurationProvider.getBrazeApiKey().f28070a;
        this.f27919h = str;
        v2 v2Var = new v2(applicationContext);
        this.f27920i = v2Var;
        com.braze.storage.t0 t0Var = new com.braze.storage.t0(applicationContext);
        this.f27921j = t0Var;
        com.braze.requests.util.a aVar = new com.braze.requests.util.a(applicationContext);
        this.f27922k = aVar;
        com.braze.events.d dVar = new com.braze.events.d(v2Var, t0Var, true);
        this.f27925n = dVar;
        b3 b3Var = new b3(applicationContext, str, dVar);
        this.f27926o = b3Var;
        this.f27927p = new g0(applicationContext, strA, str, b3Var, dVar, new com.braze.communication.dust.i(), new com.braze.requests.util.b(b3Var.j(), b3Var.k(), b3Var.k(), b3Var.l()));
        new h1(b3Var, dVar, applicationContext);
        k1 k1Var = new k1(new h3(applicationContext, strA, str), dVar);
        com.braze.dispatch.f fVar = new com.braze.dispatch.f(applicationContext, dVar, new com.braze.dispatch.a(applicationContext));
        this.f27929r = fVar;
        Object systemService = applicationContext.getSystemService("alarm");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        w wVar = new w(applicationContext, k1Var, dVar, externalEventPublisher, (AlarmManager) systemService, configurationProvider.getSessionTimeoutSeconds(), configurationProvider.isSessionStartBasedTimeoutEnabled());
        this.f27930s = wVar;
        h0 h0Var = new h0(new w1(new com.braze.storage.j(applicationContext, strA, str), dVar));
        this.f27931t = h0Var;
        y0 y0Var = new y0(applicationContext, str, strA, dVar, b3Var);
        this.f27932u = y0Var;
        this.f27933v = new s2(applicationContext, strA, str);
        s sVar = new s(applicationContext, dVar, b3Var);
        m2 m2Var = new m2(applicationContext, str, strA);
        this.f27934w = m2Var;
        w2 w2Var = new w2(applicationContext, strA, str);
        this.f27935x = w2Var;
        r rVar = new r(applicationContext, strA, str, wVar, dVar, configurationProvider, b3Var, h0Var, sVar, v2Var, y0Var, pushDeliveryManager, m2Var, t0Var);
        this.f27936y = rVar;
        BrazeGeofenceManager brazeGeofenceManager = new BrazeGeofenceManager(applicationContext, str, rVar, configurationProvider, b3Var, dVar);
        this.f27937z = brazeGeofenceManager;
        p pVar = new p(applicationContext, rVar, configurationProvider);
        this.f27905A = pVar;
        k0 k0Var = new k0(applicationContext, str, strA, dVar, externalEventPublisher, b3Var, rVar);
        this.f27906B = k0Var;
        j jVar = new j(applicationContext, str, strA, dVar, externalEventPublisher, b3Var, rVar);
        this.f27907C = jVar;
        com.braze.storage.p pVar2 = new com.braze.storage.p(applicationContext, strA, str, rVar, "41.0.0");
        this.f27908D = pVar2;
        int i10 = com.braze.communication.c.f27520a;
        com.braze.requests.v vVar = new com.braze.requests.v(new com.braze.communication.e(new com.braze.communication.b(com.braze.communication.c.f27520a)), dVar, externalEventPublisher, b3Var, pVar2, rVar, aVar);
        this.f27909E = new com.braze.requests.i(dVar, rVar);
        com.braze.requests.framework.g gVar = new com.braze.requests.framework.g(new com.braze.dispatch.h(this), vVar, z10, z12);
        this.f27910F = gVar;
        com.braze.triggers.managers.f fVar2 = new com.braze.triggers.managers.f(applicationContext, rVar, dVar, externalEventPublisher, configurationProvider, strA, str, gVar);
        this.f27911G = fVar2;
        if (AbstractC4862t.a(strA, "")) {
            v0Var = null;
            context = applicationContext;
            n3 n3Var = new n3(context, registrationDataProvider, v2Var, t0Var, null, null);
            AbstractC4862t.e(n3Var, "<set-?>");
            this.f27923l = n3Var;
            com.braze.storage.v0 v0Var3 = new com.braze.storage.v0(context, null, null);
            AbstractC4862t.e(v0Var3, "<set-?>");
            this.f27924m = v0Var3;
        } else {
            v0Var = null;
            context = applicationContext;
            n3 n3Var2 = new n3(context, registrationDataProvider, v2Var, t0Var, strA, str);
            AbstractC4862t.e(n3Var2, "<set-?>");
            this.f27923l = n3Var2;
            com.braze.storage.v0 v0Var4 = new com.braze.storage.v0(context, strA, str);
            AbstractC4862t.e(v0Var4, "<set-?>");
            this.f27924m = v0Var4;
        }
        synchronized (fVar) {
            try {
                fVar.f27610l = z11;
                fVar.b();
                if (z11) {
                    fVar.f();
                } else {
                    fVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        n3 n3VarD = d();
        com.braze.storage.v0 v0Var5 = this.f27924m;
        if (v0Var5 != null) {
            v0Var2 = v0Var5;
        } else {
            AbstractC4862t.p("deviceCache");
            v0Var2 = v0Var;
        }
        this.f27928q = new com.braze.events.a(context, pVar, dVar, rVar, n3VarD, v0Var2, fVar2, fVar2.f28745h, h0Var, brazeGeofenceManager, externalEventPublisher, configurationProvider, pVar2, w2Var, b3Var, k0Var, pushDeliveryManager, jVar);
    }

    public final String a() {
        return this.f27919h;
    }

    public final Context b() {
        return this.f27912a;
    }

    public final String c() {
        return this.f27918g;
    }

    public final n3 d() {
        n3 n3Var = this.f27923l;
        if (n3Var != null) {
            return n3Var;
        }
        AbstractC4862t.p("userCache");
        return null;
    }
}
