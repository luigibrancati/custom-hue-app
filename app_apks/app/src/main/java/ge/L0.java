package ge;

import de.AbstractC3918a;
import fc.C4012E;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class L0 implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L0 f35663a = new L0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35664b = AbstractC4217F.a("kotlin.UShort", AbstractC3918a.F(kotlin.jvm.internal.P.f39779a));

    public short c(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return C4012E.b(decoder.x(getDescriptor()).t());
    }

    public void d(InterfaceC4050f encoder, short s10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.q(getDescriptor()).s(s10);
    }

    @Override // ce.InterfaceC3118a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC4049e interfaceC4049e) {
        return C4012E.a(c(interfaceC4049e));
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35664b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((C4012E) obj).u());
    }
}
