package X6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.metadata.TikaCoreProperties;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U5 extends AbstractC2399h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O5 f18594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2407i2 f18595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f18596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC2539z f18597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f18598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2475q6 f18599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f18600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC2539z f18601j;

    public U5(C2416j3 c2416j3) {
        super(c2416j3);
        this.f18600i = new ArrayList();
        this.f18599h = new C2475q6(c2416j3.e());
        this.f18594c = new O5(this);
        this.f18597f = new C2505u5(this, c2416j3);
        this.f18601j = new C2537y5(this, c2416j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.f18599h.a();
        this.f18400a.w();
        this.f18597f.b(((Long) AbstractC2383f2.f18867Z.b(null)).longValue());
    }

    public final void A() {
        h();
        j();
        O5 o52 = this.f18594c;
        o52.b();
        try {
            A6.a.b().c(this.f18400a.d(), o52);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f18595d = null;
    }

    public final void B(InterfaceC3304s0 interfaceC3304s0, I i10, String str) {
        h();
        j();
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.C().X(12451000) == 0) {
            T(new RunnableC2529x5(this, i10, str, interfaceC3304s0));
        } else {
            c2416j3.a().r().a("Not bundling data. Service unavailable or out of date");
            c2416j3.C().d0(interfaceC3304s0, new byte[0]);
        }
    }

    public final boolean C() {
        h();
        j();
        return !y() || this.f18400a.C().W() >= ((Integer) AbstractC2383f2.f18838K0.b(null)).intValue();
    }

    public final boolean D() {
        h();
        j();
        return !y() || this.f18400a.C().W() >= 241200;
    }

    public final /* synthetic */ void E() {
        InterfaceC2407i2 interfaceC2407i2 = this.f18595d;
        if (interfaceC2407i2 == null) {
            this.f18400a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            c7 c7VarV = V(false);
            AbstractC6056k.l(c7VarV);
            interfaceC2407i2.E1(c7VarV);
            J();
        } catch (RemoteException e10) {
            this.f18400a.a().o().b("Failed to send storage consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void F() {
        InterfaceC2407i2 interfaceC2407i2 = this.f18595d;
        if (interfaceC2407i2 == null) {
            this.f18400a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            c7 c7VarV = V(false);
            AbstractC6056k.l(c7VarV);
            interfaceC2407i2.V5(c7VarV);
            J();
        } catch (RemoteException e10) {
            this.f18400a.a().o().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void G(AtomicReference atomicReference, c7 c7Var, Bundle bundle) {
        InterfaceC2407i2 interfaceC2407i2;
        synchronized (atomicReference) {
            try {
                interfaceC2407i2 = this.f18595d;
            } catch (RemoteException e10) {
                this.f18400a.a().o().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC2407i2 == null) {
                this.f18400a.a().o().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            AbstractC6056k.l(c7Var);
            interfaceC2407i2.D6(c7Var, bundle, new BinderC2442m5(this, atomicReference));
            J();
        }
    }

    public final /* synthetic */ void H(AtomicReference atomicReference, c7 c7Var, C2538y6 c2538y6) {
        InterfaceC2407i2 interfaceC2407i2;
        synchronized (atomicReference) {
            try {
                interfaceC2407i2 = this.f18595d;
            } catch (RemoteException e10) {
                this.f18400a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC2407i2 == null) {
                this.f18400a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            AbstractC6056k.l(c7Var);
            interfaceC2407i2.k4(c7Var, c2538y6, new BinderC2450n5(this, atomicReference));
            J();
        }
    }

    public final /* synthetic */ void I(c7 c7Var, C2388g c2388g) {
        InterfaceC2407i2 interfaceC2407i2 = this.f18595d;
        if (interfaceC2407i2 == null) {
            this.f18400a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC2407i2.G3(c7Var, c2388g);
            J();
        } catch (RemoteException e10) {
            this.f18400a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c2388g.f18947a), e10);
        }
    }

    public final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.f18595d != null) {
            this.f18595d = null;
            this.f18400a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    public final /* synthetic */ O5 M() {
        return this.f18594c;
    }

    public final /* synthetic */ InterfaceC2407i2 N() {
        return this.f18595d;
    }

    public final /* synthetic */ void O(InterfaceC2407i2 interfaceC2407i2) {
        this.f18595d = null;
    }

    public final /* synthetic */ ScheduledExecutorService P() {
        return this.f18598g;
    }

    public final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.f18598g = scheduledExecutorService;
    }

    public final boolean R() {
        this.f18400a.c();
        return true;
    }

    public final void T(Runnable runnable) {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.f18600i;
        long size = list.size();
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.w();
        if (size >= 1000) {
            c2416j3.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f18601j.b(60000L);
        w();
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        C2526x2 c2526x2W = this.f18400a.a().w();
        List list = this.f18600i;
        c2526x2W.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f18400a.a().o().b("Task exception while flushing queue", e10);
            }
        }
        this.f18600i.clear();
        this.f18601j.d();
    }

    public final c7 V(boolean z10) {
        Pair pairB;
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.c();
        C2447n2 c2447n2L = this.f18400a.L();
        String string = null;
        if (z10) {
            C2416j3 c2416j32 = c2416j3.a().f18400a;
            if (c2416j32.x().f18424e != null && (pairB = c2416j32.x().f18424e.b()) != null && pairB != N2.f18421A) {
                String strValueOf = String.valueOf(pairB.second);
                String str = (String) pairB.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return c2447n2L.o(string);
    }

    public final boolean W() {
        h();
        j();
        return this.f18595d != null;
    }

    public final void X() {
        h();
        j();
        T(new RunnableC2545z5(this, V(true)));
    }

    public final void Y(boolean z10) {
        h();
        j();
        if (C()) {
            T(new A5(this, V(false)));
        }
    }

    public final void Z(boolean z10) {
        h();
        j();
        T(new Runnable() { // from class: X6.T5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18571a.E();
            }
        });
    }

    public final void a0() {
        h();
        j();
        T(new Runnable() { // from class: X6.P5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18473a.F();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(X6.InterfaceC2407i2 r59, w6.AbstractC6157a r60, X6.c7 r61) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.U5.b0(X6.i2, w6.a, X6.c7):void");
    }

    public final void c0(I i10, String str) {
        AbstractC6056k.l(i10);
        h();
        j();
        R();
        T(new B5(this, true, V(true), this.f18400a.E().p(i10), i10, str));
    }

    public final void d0(C2404i c2404i) {
        AbstractC6056k.l(c2404i);
        h();
        j();
        this.f18400a.c();
        T(new C5(this, true, V(true), this.f18400a.E().r(c2404i), new C2404i(c2404i), c2404i));
    }

    public final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new D5(this, atomicReference, null, str2, str3, V(false)));
    }

    public final void f0(InterfaceC3304s0 interfaceC3304s0, String str, String str2) {
        h();
        j();
        T(new E5(this, str, str2, V(false), interfaceC3304s0));
    }

    public final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        j();
        T(new F5(this, atomicReference, null, str2, str3, V(false), z10));
    }

    public final void h0(InterfaceC3304s0 interfaceC3304s0, String str, String str2, boolean z10) {
        h();
        j();
        T(new RunnableC2434l5(this, str, str2, V(false), z10, interfaceC3304s0));
    }

    public final void i0(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        j();
        final c7 c7VarV = V(false);
        T(new Runnable() { // from class: X6.Q5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18483a.G(atomicReference, c7VarV, bundle);
            }
        });
    }

    public final void j0(final AtomicReference atomicReference, final C2538y6 c2538y6) {
        h();
        j();
        final c7 c7VarV = V(false);
        T(new Runnable() { // from class: X6.R5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18511a.H(atomicReference, c7VarV, c2538y6);
            }
        });
    }

    public final void k0(final C2388g c2388g) {
        h();
        j();
        final c7 c7VarV = V(true);
        AbstractC6056k.l(c7VarV);
        T(new Runnable() { // from class: X6.S5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18559a.I(c7VarV, c2388g);
            }
        });
    }

    public final C2460p l0() {
        h();
        j();
        InterfaceC2407i2 interfaceC2407i2 = this.f18595d;
        if (interfaceC2407i2 == null) {
            w();
            this.f18400a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        c7 c7VarV = V(false);
        AbstractC6056k.l(c7VarV);
        try {
            C2460p c2460pG0 = interfaceC2407i2.G0(c7VarV);
            J();
            return c2460pG0;
        } catch (RemoteException e10) {
            this.f18400a.a().o().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    @Override // X6.AbstractC2399h2
    public final boolean m() {
        return false;
    }

    public final void o(W6 w62) {
        h();
        j();
        R();
        T(new RunnableC2458o5(this, V(true), this.f18400a.E().q(w62), w62));
    }

    public final void p() {
        h();
        j();
        c7 c7VarV = V(false);
        R();
        this.f18400a.E().o();
        T(new RunnableC2466p5(this, c7VarV));
    }

    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new RunnableC2474q5(this, atomicReference, V(false)));
    }

    public final void r(InterfaceC3304s0 interfaceC3304s0) {
        h();
        j();
        T(new RunnableC2481r5(this, V(false), interfaceC3304s0));
    }

    public final void s() {
        h();
        j();
        c7 c7VarV = V(true);
        R();
        this.f18400a.w().H(null, AbstractC2383f2.f18877c1);
        this.f18400a.E().u();
        T(new RunnableC2489s5(this, c7VarV, true));
    }

    public final void t() {
        h();
        j();
        T(new RunnableC2497t5(this, V(true)));
    }

    public final void u(C2362c5 c2362c5) {
        h();
        j();
        T(new RunnableC2513v5(this, c2362c5));
    }

    public final void v(Bundle bundle) {
        h();
        j();
        G g10 = new G(bundle);
        R();
        T(new RunnableC2521w5(this, true, V(false), this.f18400a.w().H(null, AbstractC2383f2.f18877c1) && this.f18400a.E().s(g10), g10, bundle));
    }

    public final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.f18594c.c();
            return;
        }
        C2416j3 c2416j3 = this.f18400a;
        if (c2416j3.w().m()) {
            return;
        }
        c2416j3.c();
        List<ResolveInfo> listQueryIntentServices = c2416j3.d().getPackageManager().queryIntentServices(new Intent().setClassName(c2416j3.d(), "com.google.android.gms.measurement.AppMeasurementService"), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            c2416j3.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextD = c2416j3.d();
        c2416j3.c();
        intent.setComponent(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f18594c.a(intent);
    }

    public final Boolean x() {
        return this.f18596e;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.U5.y():boolean");
    }

    public final void z(InterfaceC2407i2 interfaceC2407i2) {
        h();
        AbstractC6056k.l(interfaceC2407i2);
        this.f18595d = interfaceC2407i2;
        J();
        L();
    }
}
