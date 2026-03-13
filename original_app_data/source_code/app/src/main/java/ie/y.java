package ie;

import he.AbstractC4304b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends AbstractC4381c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final he.h f37552h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AbstractC4304b json, he.h value, String str) {
        super(json, value, str, null);
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(value, "value");
        this.f37552h = value;
        f0("primitive");
    }

    @Override // ie.AbstractC4381c
    public he.h D0() {
        return this.f37552h;
    }

    @Override // fe.InterfaceC4047c
    public int j(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        return 0;
    }

    @Override // ie.AbstractC4381c
    public he.h o0(String tag) {
        AbstractC4862t.e(tag, "tag");
        if (tag == "primitive") {
            return D0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }
}
