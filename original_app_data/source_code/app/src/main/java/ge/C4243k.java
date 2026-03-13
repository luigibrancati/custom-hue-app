package ge;

import ee.d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4243k implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4243k f35724a = new C4243k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35725b = new p0("kotlin.Byte", d.b.f33942a);

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return Byte.valueOf(decoder.G());
    }

    public void d(InterfaceC4050f encoder, byte b10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.g(b10);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35725b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((Number) obj).byteValue());
    }
}
