package ge;

import fc.C4015H;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class M0 implements ce.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M0 f35666b = new M0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4226b0 f35667a = new C4226b0("kotlin.Unit", C4015H.f34254a);

    public void c(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        this.f35667a.deserialize(decoder);
    }

    @Override // ce.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, C4015H value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        this.f35667a.serialize(encoder, value);
    }

    @Override // ce.InterfaceC3118a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC4049e interfaceC4049e) {
        c(interfaceC4049e);
        return C4015H.f34254a;
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return this.f35667a.getDescriptor();
    }
}
