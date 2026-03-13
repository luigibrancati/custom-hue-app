package Rd;

import Wd.C2336p;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class E0 extends C2336p implements InterfaceC2127f0, InterfaceC2158v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F0 f15111d;

    @Override // Rd.InterfaceC2158v0
    public K0 a() {
        return null;
    }

    @Override // Rd.InterfaceC2158v0
    public boolean c() {
        return true;
    }

    @Override // Rd.InterfaceC2127f0
    public void dispose() {
        u().D0(this);
    }

    @Override // Wd.C2336p
    public String toString() {
        return Q.a(this) + '@' + Q.b(this) + "[job@" + Q.b(u()) + ']';
    }

    public final F0 u() {
        F0 f02 = this.f15111d;
        if (f02 != null) {
            return f02;
        }
        AbstractC4862t.p("job");
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable th);

    public final void x(F0 f02) {
        this.f15111d = f02;
    }
}
