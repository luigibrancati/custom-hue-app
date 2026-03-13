package g4;

import Rd.InterfaceC2166z0;
import Y0.E;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2757m;
import k4.InterfaceC4796b;
import k4.InterfaceC4797c;
import k4.InterfaceC4798d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4140b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3.d f35440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.c f35441b;

    public C4140b(Y3.d imageLoader, a4.c referenceCounter, n4.l lVar) {
        AbstractC4862t.e(imageLoader, "imageLoader");
        AbstractC4862t.e(referenceCounter, "referenceCounter");
        this.f35440a = imageLoader;
        this.f35441b = referenceCounter;
    }

    public final r a(i4.i request, u targetDelegate, InterfaceC2166z0 job) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(targetDelegate, "targetDelegate");
        AbstractC4862t.e(job, "job");
        AbstractC2754j abstractC2754jW = request.w();
        InterfaceC4797c interfaceC4797cI = request.I();
        if (!(interfaceC4797cI instanceof InterfaceC4798d)) {
            C4139a c4139a = new C4139a(abstractC2754jW, job);
            abstractC2754jW.a(c4139a);
            return c4139a;
        }
        v vVar = new v(this.f35440a, request, targetDelegate, job);
        abstractC2754jW.a(vVar);
        if (interfaceC4797cI instanceof InterfaceC2757m) {
            InterfaceC2757m interfaceC2757m = (InterfaceC2757m) interfaceC4797cI;
            abstractC2754jW.c(interfaceC2757m);
            abstractC2754jW.a(interfaceC2757m);
        }
        InterfaceC4798d interfaceC4798d = (InterfaceC4798d) interfaceC4797cI;
        n4.e.g(interfaceC4798d.getView()).c(vVar);
        if (!E.K(interfaceC4798d.getView())) {
            n4.e.g(interfaceC4798d.getView()).onViewDetachedFromWindow(interfaceC4798d.getView());
        }
        return vVar;
    }

    public final u b(InterfaceC4797c interfaceC4797c, int i10, Y3.b eventListener) {
        AbstractC4862t.e(eventListener, "eventListener");
        if (i10 == 0) {
            return interfaceC4797c == null ? C4142d.f35443a : interfaceC4797c instanceof InterfaceC4796b ? new n((InterfaceC4796b) interfaceC4797c, this.f35441b, eventListener, null) : new k(interfaceC4797c, this.f35441b, eventListener, null);
        }
        if (i10 == 1) {
            return interfaceC4797c == null ? new j(this.f35441b) : new k(interfaceC4797c, this.f35441b, eventListener, null);
        }
        throw new IllegalStateException("Invalid type.");
    }
}
