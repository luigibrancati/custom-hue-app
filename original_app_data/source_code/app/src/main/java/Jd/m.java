package Jd;

import Jd.f;
import Lc.InterfaceC1196y;
import Lc.j0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f6421a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f6422b = "should not have varargs or parameters with default values";

    @Override // Jd.f
    public boolean a(InterfaceC1196y functionDescriptor) {
        AbstractC4862t.e(functionDescriptor, "functionDescriptor");
        List<j0> listI = functionDescriptor.i();
        AbstractC4862t.d(listI, "functionDescriptor.valueParameters");
        if (listI != null && listI.isEmpty()) {
            return true;
        }
        for (j0 it : listI) {
            AbstractC4862t.d(it, "it");
            if (AbstractC5823c.c(it) || it.s0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // Jd.f
    public String b(InterfaceC1196y interfaceC1196y) {
        return f.a.a(this, interfaceC1196y);
    }

    @Override // Jd.f
    public String getDescription() {
        return f6422b;
    }
}
