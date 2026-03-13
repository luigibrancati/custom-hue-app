package ge;

import de.AbstractC3918a;
import fc.C4041x;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4848e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0 implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0 f35639a = new C0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35640b = AbstractC4217F.a("kotlin.UByte", AbstractC3918a.z(C4848e.f39787a));

    public byte c(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return C4041x.b(decoder.x(getDescriptor()).G());
    }

    public void d(InterfaceC4050f encoder, byte b10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.q(getDescriptor()).g(b10);
    }

    @Override // ce.InterfaceC3118a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC4049e interfaceC4049e) {
        return C4041x.a(c(interfaceC4049e));
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35640b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((C4041x) obj).s());
    }
}
