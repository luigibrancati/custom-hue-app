package Ud;

import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: renamed from: Ud.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C2311c extends Vd.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.p f17015d;

    public /* synthetic */ C2311c(vc.p pVar, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar, int i11, AbstractC4854k abstractC4854k) {
        this(pVar, (i11 & 2) != 0 ? C4993j.f40088a : interfaceC4992i, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Td.a.SUSPEND : aVar);
    }

    public static /* synthetic */ Object j(C2311c c2311c, Td.v vVar, InterfaceC4988e interfaceC4988e) {
        Object objInvoke = c2311c.f17015d.invoke(vVar, interfaceC4988e);
        return objInvoke == C5046c.f() ? objInvoke : C4015H.f34254a;
    }

    @Override // Vd.e
    public Object e(Td.v vVar, InterfaceC4988e interfaceC4988e) {
        return j(this, vVar, interfaceC4988e);
    }

    @Override // Vd.e
    public Vd.e f(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return new C2311c(this.f17015d, interfaceC4992i, i10, aVar);
    }

    @Override // Vd.e
    public String toString() {
        return "block[" + this.f17015d + "] -> " + super.toString();
    }

    public C2311c(vc.p pVar, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        super(interfaceC4992i, i10, aVar);
        this.f17015d = pVar;
    }
}
