package h1;

import g1.C4094d;
import g1.InterfaceC4095e;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import vc.l;

/* JADX INFO: renamed from: h1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4268b implements InterfaceC4095e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f36176a;

    public C4268b(l produceNewData) {
        AbstractC4862t.e(produceNewData, "produceNewData");
        this.f36176a = produceNewData;
    }

    @Override // g1.InterfaceC4095e
    public Object a(C4094d c4094d, InterfaceC4988e interfaceC4988e) {
        return this.f36176a.invoke(c4094d);
    }
}
