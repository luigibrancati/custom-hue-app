package ge;

import ee.d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4214C implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4214C f35637a = new C4214C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35638b = new p0("kotlin.Float", d.e.f33945a);

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return Float.valueOf(decoder.u());
    }

    public void d(InterfaceC4050f encoder, float f10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.w(f10);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35638b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((Number) obj).floatValue());
    }
}
