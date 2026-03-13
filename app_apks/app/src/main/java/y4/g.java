package y4;

import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import q4.C5485a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5485a f48417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.c f48418b;

    public g(C5485a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        this.f48417a = amplitude;
        this.f48418b = w4.d.f46182a.b(amplitude);
    }

    public final Object a(InterfaceC4988e interfaceC4988e) throws Throwable {
        Object objG = new w4.g(this.f48417a, this.f48418b).g(interfaceC4988e);
        return objG == C5046c.f() ? objG : C4015H.f34254a;
    }
}
