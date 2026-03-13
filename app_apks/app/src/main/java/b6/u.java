package b6;

import android.content.Context;
import b6.AbstractC2840i;
import h6.InterfaceC4280e;
import java.util.Collections;
import java.util.Set;
import l6.InterfaceC4957a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class u implements InterfaceC2851t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile v f25373e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4957a f25374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4957a f25375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4280e f25376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i6.r f25377d;

    public u(InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2, InterfaceC4280e interfaceC4280e, i6.r rVar, i6.v vVar) {
        this.f25374a = interfaceC4957a;
        this.f25375b = interfaceC4957a2;
        this.f25376c = interfaceC4280e;
        this.f25377d = rVar;
        vVar.c();
    }

    public static u c() {
        v vVar = f25373e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(InterfaceC2837f interfaceC2837f) {
        return interfaceC2837f instanceof InterfaceC2838g ? Collections.unmodifiableSet(((InterfaceC2838g) interfaceC2837f).a()) : Collections.singleton(Y5.c.b("proto"));
    }

    public static void f(Context context) {
        if (f25373e == null) {
            synchronized (u.class) {
                try {
                    if (f25373e == null) {
                        f25373e = AbstractC2836e.a().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // b6.InterfaceC2851t
    public void a(AbstractC2846o abstractC2846o, Y5.k kVar) {
        this.f25376c.a(abstractC2846o.f().f(abstractC2846o.c().d()), b(abstractC2846o), kVar);
    }

    public final AbstractC2840i b(AbstractC2846o abstractC2846o) {
        AbstractC2840i.a aVarG = AbstractC2840i.a().i(this.f25374a.a()).o(this.f25375b.a()).n(abstractC2846o.g()).h(new C2839h(abstractC2846o.b(), abstractC2846o.d())).g(abstractC2846o.c().a());
        if (abstractC2846o.c().e() != null && abstractC2846o.c().e().a() != null) {
            aVarG.l(abstractC2846o.c().e().a());
        }
        if (abstractC2846o.c().b() != null) {
            Y5.e eVarB = abstractC2846o.c().b();
            if (eVarB.c() != null) {
                aVarG.m(eVarB.c());
            }
            if (eVarB.a() != null) {
                aVarG.j(eVarB.a());
            }
            if (eVarB.b() != null) {
                aVarG.k(eVarB.b());
            }
        }
        return aVarG.d();
    }

    public i6.r e() {
        return this.f25377d;
    }

    public Y5.j g(InterfaceC2837f interfaceC2837f) {
        return new C2848q(d(interfaceC2837f), AbstractC2847p.a().b(interfaceC2837f.getName()).c(interfaceC2837f.getExtras()).a(), this);
    }
}
