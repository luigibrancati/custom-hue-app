package ge;

import de.AbstractC3918a;
import fc.C4043z;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4861s;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class F0 implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0 f35646a = new F0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35647b = AbstractC4217F.a("kotlin.UInt", AbstractC3918a.D(C4861s.f39796a));

    public int c(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return C4043z.b(decoder.x(getDescriptor()).h());
    }

    public void d(InterfaceC4050f encoder, int i10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.q(getDescriptor()).D(i10);
    }

    @Override // ce.InterfaceC3118a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC4049e interfaceC4049e) {
        return C4043z.a(c(interfaceC4049e));
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35647b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((C4043z) obj).s());
    }
}
