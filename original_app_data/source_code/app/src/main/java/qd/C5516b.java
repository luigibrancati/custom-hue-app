package qd;

import Cd.E;
import Lc.G;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: qd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5516b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f43435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5516b(List value, vc.l computeType) {
        super(value);
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(computeType, "computeType");
        this.f43435b = computeType;
    }

    @Override // qd.g
    public E a(G module) {
        AbstractC4862t.e(module, "module");
        E e10 = (E) this.f43435b.invoke(module);
        if (!Ic.g.c0(e10) && !Ic.g.p0(e10)) {
            Ic.g.C0(e10);
        }
        return e10;
    }
}
