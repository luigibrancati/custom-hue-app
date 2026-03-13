package ge;

import ee.d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f35762a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35763b = new p0("kotlin.String", d.i.f33949a);

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return decoder.D();
    }

    @Override // ce.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, String value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        encoder.G(value);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35763b;
    }
}
