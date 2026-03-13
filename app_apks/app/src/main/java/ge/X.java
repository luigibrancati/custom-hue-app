package ge;

import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class X implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X f35688a = new X();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35689b = W.f35685a;

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        throw new ce.f("'kotlin.Nothing' does not have instances");
    }

    @Override // ce.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, Void value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        throw new ce.f("'kotlin.Nothing' cannot be serialized");
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35689b;
    }
}
