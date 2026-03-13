package Wd;

import Rd.AbstractC2116a;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import nc.InterfaceC5161e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class A extends AbstractC2116a implements InterfaceC5161e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4988e f17895d;

    public A(InterfaceC4992i interfaceC4992i, InterfaceC4988e interfaceC4988e) {
        super(interfaceC4992i, true, true);
        this.f17895d = interfaceC4988e;
    }

    @Override // Rd.F0
    public void H(Object obj) {
        AbstractC2330j.b(C5045b.c(this.f17895d), Rd.C.a(obj, this.f17895d));
    }

    @Override // Rd.AbstractC2116a
    public void P0(Object obj) {
        InterfaceC4988e interfaceC4988e = this.f17895d;
        interfaceC4988e.resumeWith(Rd.C.a(obj, interfaceC4988e));
    }

    @Override // nc.InterfaceC5161e
    public final InterfaceC5161e getCallerFrame() {
        InterfaceC4988e interfaceC4988e = this.f17895d;
        if (interfaceC4988e instanceof InterfaceC5161e) {
            return (InterfaceC5161e) interfaceC4988e;
        }
        return null;
    }

    @Override // Rd.F0
    public final boolean o0() {
        return true;
    }

    public void T0() {
    }
}
