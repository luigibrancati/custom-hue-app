package Wd;

import Rd.InterfaceC2127f0;
import Rd.InterfaceC2138l;
import Rd.W;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends Rd.I implements W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f17956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rd.I f17957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17958d;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Rd.I i10, String str) {
        W w10 = i10 instanceof W ? (W) i10 : null;
        this.f17956b = w10 == null ? Rd.T.a() : w10;
        this.f17957c = i10;
        this.f17958d = str;
    }

    @Override // Rd.W
    public void G(long j10, InterfaceC2138l interfaceC2138l) {
        this.f17956b.G(j10, interfaceC2138l);
    }

    @Override // Rd.W
    public InterfaceC2127f0 H(long j10, Runnable runnable, InterfaceC4992i interfaceC4992i) {
        return this.f17956b.H(j10, runnable, interfaceC4992i);
    }

    @Override // Rd.I
    public void k0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        this.f17957c.k0(interfaceC4992i, runnable);
    }

    @Override // Rd.I
    public void p0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        this.f17957c.p0(interfaceC4992i, runnable);
    }

    @Override // Rd.I
    public String toString() {
        return this.f17958d;
    }

    @Override // Rd.I
    public boolean v0(InterfaceC4992i interfaceC4992i) {
        return this.f17957c.v0(interfaceC4992i);
    }
}
