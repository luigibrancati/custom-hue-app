package ie;

import ce.InterfaceC3118a;
import he.AbstractC4304b;
import he.C4298A;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class N {
    public static final Object a(AbstractC4304b abstractC4304b, String discriminator, C4298A element, InterfaceC3118a deserializer) {
        AbstractC4862t.e(abstractC4304b, "<this>");
        AbstractC4862t.e(discriminator, "discriminator");
        AbstractC4862t.e(element, "element");
        AbstractC4862t.e(deserializer, "deserializer");
        return new C4378B(abstractC4304b, element, discriminator, deserializer.getDescriptor()).n(deserializer);
    }
}
