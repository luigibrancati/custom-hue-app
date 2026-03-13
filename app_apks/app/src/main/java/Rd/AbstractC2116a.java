package Rd;

import com.fasterxml.jackson.core.JsonFactory;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Rd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2116a extends F0 implements InterfaceC2166z0, InterfaceC4988e, M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4992i f15159c;

    public AbstractC2116a(InterfaceC4992i interfaceC4992i, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            m0((InterfaceC2166z0) interfaceC4992i.get(InterfaceC2166z0.f15218M));
        }
        this.f15159c = interfaceC4992i.plus(this);
    }

    public void P0(Object obj) {
        H(obj);
    }

    @Override // Rd.F0
    public String Q() {
        return Q.a(this) + " was cancelled";
    }

    public final void S0(O o10, Object obj, vc.p pVar) {
        o10.b(pVar, obj, this);
    }

    @Override // Rd.F0, Rd.InterfaceC2166z0
    public boolean c() {
        return super.c();
    }

    @Override // lc.InterfaceC4988e
    public final InterfaceC4992i getContext() {
        return this.f15159c;
    }

    @Override // Rd.M
    public InterfaceC4992i getCoroutineContext() {
        return this.f15159c;
    }

    @Override // Rd.F0
    public final void l0(Throwable th) {
        K.a(this.f15159c, th);
    }

    @Override // lc.InterfaceC4988e
    public final void resumeWith(Object obj) {
        Object objT0 = t0(C.b(obj));
        if (objT0 == G0.f15129b) {
            return;
        }
        P0(objT0);
    }

    @Override // Rd.F0
    public String u0() {
        String strG = G.g(this.f15159c);
        if (strG == null) {
            return super.u0();
        }
        return JsonFactory.DEFAULT_QUOTE_CHAR + strG + "\":" + super.u0();
    }

    @Override // Rd.F0
    public final void z0(Object obj) {
        if (!(obj instanceof A)) {
            R0(obj);
        } else {
            A a10 = (A) obj;
            Q0(a10.f15106a, a10.a());
        }
    }

    public void R0(Object obj) {
    }

    public void Q0(Throwable th, boolean z10) {
    }
}
