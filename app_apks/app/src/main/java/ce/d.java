package ce;

import fc.C4025h;
import fe.InterfaceC4047c;
import fe.InterfaceC4050f;
import ge.AbstractC4225b;
import ge.AbstractC4227c;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final InterfaceC3118a a(AbstractC4225b abstractC4225b, InterfaceC4047c decoder, String str) {
        AbstractC4862t.e(abstractC4225b, "<this>");
        AbstractC4862t.e(decoder, "decoder");
        InterfaceC3118a interfaceC3118aE = abstractC4225b.e(decoder, str);
        if (interfaceC3118aE != null) {
            return interfaceC3118aE;
        }
        AbstractC4227c.b(str, abstractC4225b.g());
        throw new C4025h();
    }

    public static final g b(AbstractC4225b abstractC4225b, InterfaceC4050f encoder, Object value) {
        AbstractC4862t.e(abstractC4225b, "<this>");
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        g gVarF = abstractC4225b.f(encoder, value);
        if (gVarF != null) {
            return gVarF;
        }
        AbstractC4227c.a(M.b(value.getClass()), abstractC4225b.g());
        throw new C4025h();
    }
}
