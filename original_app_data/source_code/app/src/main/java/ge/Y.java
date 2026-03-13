package ge;

import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Y implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.b f35690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee.e f35691b;

    public Y(ce.b serializer) {
        AbstractC4862t.e(serializer, "serializer");
        this.f35690a = serializer;
        this.f35691b = new r0(serializer.getDescriptor());
    }

    @Override // ce.InterfaceC3118a
    public Object deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return decoder.F() ? decoder.n(this.f35690a) : decoder.i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Y.class == obj.getClass() && AbstractC4862t.a(this.f35690a, ((Y) obj).f35690a);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return this.f35691b;
    }

    public int hashCode() {
        return this.f35690a.hashCode();
    }

    @Override // ce.g
    public void serialize(InterfaceC4050f encoder, Object obj) {
        AbstractC4862t.e(encoder, "encoder");
        if (obj == null) {
            encoder.r();
        } else {
            encoder.z();
            encoder.x(this.f35690a, obj);
        }
    }
}
