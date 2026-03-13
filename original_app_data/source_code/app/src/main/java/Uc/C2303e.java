package Uc;

import Lc.InterfaceC1174b;
import Lc.Z;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;

/* JADX INFO: renamed from: Uc.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2303e extends I {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2303e f16914n = new C2303e();

    /* JADX INFO: renamed from: Uc.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z f16915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z z10) {
            super(1);
            this.f16915a = z10;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(I.f16886a.j().containsKey(dd.w.d(this.f16915a)));
        }
    }

    public final kd.f i(Z functionDescriptor) {
        AbstractC4862t.e(functionDescriptor, "functionDescriptor");
        Map mapJ = I.f16886a.j();
        String strD = dd.w.d(functionDescriptor);
        if (strD == null) {
            return null;
        }
        return (kd.f) mapJ.get(strD);
    }

    public final boolean j(Z functionDescriptor) {
        AbstractC4862t.e(functionDescriptor, "functionDescriptor");
        return Ic.g.f0(functionDescriptor) && AbstractC5823c.f(functionDescriptor, false, new a(functionDescriptor), 1, null) != null;
    }

    public final boolean k(Z z10) {
        AbstractC4862t.e(z10, "<this>");
        return AbstractC4862t.a(z10.getName().b(), "removeAt") && AbstractC4862t.a(dd.w.d(z10), I.f16886a.h().b());
    }
}
