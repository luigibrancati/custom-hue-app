package q8;

import android.content.Context;
import android.content.pm.PackageManager;
import b7.InterfaceC2873g;
import com.google.android.gms.tasks.Task;
import h8.C4288f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import q9.C5509b;
import r8.C5675d;
import r8.C5677f;
import r8.k;
import u8.C5983B;
import u8.C5984a;
import u8.C5989f;
import u8.C5992i;
import u8.C5996m;
import u8.H;
import u8.M;
import z8.C6552b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5983B f43310a;

    public h(C5983B c5983b) {
        this.f43310a = c5983b;
    }

    public static h e() {
        h hVar = (h) C4288f.o().k(h.class);
        if (hVar != null) {
            return hVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static h f(C4288f c4288f, P8.h hVar, O8.a aVar, O8.a aVar2, O8.a aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context contextM = c4288f.m();
        String packageName = contextM.getPackageName();
        r8.g.f().g("Initializing Firebase Crashlytics " + C5983B.s() + " for " + packageName);
        v8.i iVar = new v8.i(executorService, executorService2);
        A8.g gVar = new A8.g(contextM);
        H h10 = new H(c4288f);
        M m10 = new M(contextM, packageName, hVar, h10);
        C5675d c5675d = new C5675d(aVar);
        C5507d c5507d = new C5507d(aVar2);
        C5996m c5996m = new C5996m(h10, gVar);
        C5509b.e(c5996m);
        C5983B c5983b = new C5983B(c4288f, m10, c5675d, h10, c5507d.e(), c5507d.d(), gVar, c5996m, new k(aVar3), iVar);
        String strC = c4288f.r().c();
        String strM = C5992i.m(contextM);
        List<C5989f> listJ = C5992i.j(contextM);
        r8.g.f().b("Mapping file ID is: " + strM);
        for (C5989f c5989f : listJ) {
            r8.g.f().b(String.format("Build id for %s on %s: %s", c5989f.c(), c5989f.a(), c5989f.b()));
        }
        try {
            C5984a c5984aA = C5984a.a(contextM, m10, strC, strM, listJ, new C5677f(contextM));
            r8.g.f().i("Installer package name is: " + c5984aA.f45316d);
            C8.g gVarL = C8.g.l(contextM, strC, m10, new C6552b(), c5984aA.f45318f, c5984aA.f45319g, gVar, h10);
            gVarL.p(iVar).f(executorService3, new InterfaceC2873g() { // from class: q8.g
                @Override // b7.InterfaceC2873g
                public final void c(Exception exc) {
                    r8.g.f().e("Error fetching settings.", exc);
                }
            });
            if (c5983b.z(c5984aA, gVarL)) {
                c5983b.q(gVarL);
            }
            return new h(c5983b);
        } catch (PackageManager.NameNotFoundException e10) {
            r8.g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    public Task b() {
        return this.f43310a.l();
    }

    public void c() {
        this.f43310a.m();
    }

    public boolean d() {
        return this.f43310a.n();
    }

    public void g(String str) {
        this.f43310a.u(str);
    }

    public void h(Throwable th) {
        if (th == null) {
            r8.g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f43310a.v(th, Collections.EMPTY_MAP);
        }
    }

    public void i() {
        this.f43310a.A();
    }

    public void j(Boolean bool) {
        this.f43310a.B(bool);
    }

    public void k(String str, String str2) {
        this.f43310a.C(str, str2);
    }

    public void l(String str) {
        this.f43310a.E(str);
    }
}
