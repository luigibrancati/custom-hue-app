package Uc;

import Lc.InterfaceC1185m;
import kotlin.jvm.internal.AbstractC4862t;
import rd.AbstractC5699c;
import rd.EnumC5698b;

/* JADX INFO: renamed from: Uc.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2308j extends AbstractC5699c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1185m f16926a;

    public C2308j(InterfaceC1185m target) {
        AbstractC4862t.e(target, "target");
        this.f16926a = target;
    }

    @Override // rd.AbstractC5697a
    public EnumC5698b b() {
        return EnumC5698b.ERROR;
    }
}
