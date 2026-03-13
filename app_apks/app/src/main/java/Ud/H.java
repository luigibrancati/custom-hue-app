package Ud;

import Rd.C2142n;
import Wd.AbstractC2324d;
import fc.C4015H;
import fc.C4035r;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5045b;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class H extends Vd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f17004a = new AtomicReference(null);

    @Override // Vd.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(F f10) {
        if (AbstractC2324d.a(this.f17004a) != null) {
            return false;
        }
        AbstractC2324d.b(this.f17004a, G.f17002a);
        return true;
    }

    public final Object e(InterfaceC4988e interfaceC4988e) {
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        if (!T1.e.a(this.f17004a, G.f17002a, c2142n)) {
            C4035r.a aVar = C4035r.f34274b;
            c2142n.resumeWith(C4035r.b(C4015H.f34254a));
        }
        Object objW = c2142n.w();
        if (objW == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objW == C5046c.f() ? objW : C4015H.f34254a;
    }

    @Override // Vd.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4988e[] b(F f10) {
        AbstractC2324d.b(this.f17004a, null);
        return Vd.c.f17520a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f17004a;
        while (true) {
            Object objA = AbstractC2324d.a(atomicReference);
            if (objA == null || objA == G.f17003b) {
                return;
            }
            if (objA == G.f17002a) {
                if (T1.e.a(this.f17004a, objA, G.f17003b)) {
                    return;
                }
            } else if (T1.e.a(this.f17004a, objA, G.f17002a)) {
                C4035r.a aVar = C4035r.f34274b;
                ((C2142n) objA).resumeWith(C4035r.b(C4015H.f34254a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f17004a.getAndSet(G.f17002a);
        AbstractC4862t.b(andSet);
        return andSet == G.f17003b;
    }
}
