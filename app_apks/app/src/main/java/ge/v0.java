package ge;

import ee.d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f35757a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35758b = new p0("kotlin.Short", d.h.f33948a);

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Short deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return Short.valueOf(decoder.t());
    }

    public void d(InterfaceC4050f encoder, short s10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.s(s10);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35758b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((Number) obj).shortValue());
    }
}
