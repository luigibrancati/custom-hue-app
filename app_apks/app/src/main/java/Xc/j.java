package Xc;

import Lc.InterfaceC1177e;
import bd.InterfaceC2915g;
import kotlin.jvm.internal.AbstractC4862t;
import td.C5880c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5880c f19504a;

    @Override // Xc.i
    public InterfaceC1177e a(InterfaceC2915g javaClass) {
        AbstractC4862t.e(javaClass, "javaClass");
        return b().b(javaClass);
    }

    public final C5880c b() {
        C5880c c5880c = this.f19504a;
        if (c5880c != null) {
            return c5880c;
        }
        AbstractC4862t.p("resolver");
        return null;
    }

    public final void c(C5880c c5880c) {
        AbstractC4862t.e(c5880c, "<set-?>");
        this.f19504a = c5880c;
    }
}
