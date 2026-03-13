package Jd;

import Cd.E;
import Ic.i;
import Jd.f;
import Lc.InterfaceC1196y;
import Lc.j0;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f6415a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f6416b = "second parameter must be of type KProperty<*> or its supertype";

    @Override // Jd.f
    public boolean a(InterfaceC1196y functionDescriptor) {
        AbstractC4862t.e(functionDescriptor, "functionDescriptor");
        j0 secondParameter = (j0) functionDescriptor.i().get(1);
        i.b bVar = Ic.i.f5704k;
        AbstractC4862t.d(secondParameter, "secondParameter");
        E eA = bVar.a(AbstractC5823c.p(secondParameter));
        if (eA == null) {
            return false;
        }
        E type = secondParameter.getType();
        AbstractC4862t.d(type, "secondParameter.type");
        return Hd.a.p(eA, Hd.a.t(type));
    }

    @Override // Jd.f
    public String b(InterfaceC1196y interfaceC1196y) {
        return f.a.a(this, interfaceC1196y);
    }

    @Override // Jd.f
    public String getDescription() {
        return f6416b;
    }
}
