package ge;

import ee.d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4255t implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4255t f35744a = new C4255t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35745b = new p0("kotlin.Double", d.C0434d.f33944a);

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Double deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return Double.valueOf(decoder.w());
    }

    public void d(InterfaceC4050f encoder, double d10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.f(d10);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35745b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((Number) obj).doubleValue());
    }
}
