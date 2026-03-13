package Yd;

import Rd.I;
import Wd.AbstractC2333m;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f20070b = new k();

    @Override // Rd.I
    public I C0(int i10, String str) {
        AbstractC2333m.a(i10);
        return i10 >= j.f20067d ? AbstractC2333m.b(this, str) : super.C0(i10, str);
    }

    @Override // Rd.I
    public void k0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        c.f20054h.Q0(runnable, true, false);
    }

    @Override // Rd.I
    public void p0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        c.f20054h.Q0(runnable, true, true);
    }

    @Override // Rd.I
    public String toString() {
        return "Dispatchers.IO";
    }
}
