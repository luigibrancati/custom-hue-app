package ge;

import de.AbstractC3918a;
import fc.C4009B;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class I0 implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I0 f35656a = new I0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35657b = AbstractC4217F.a("kotlin.ULong", AbstractC3918a.E(kotlin.jvm.internal.w.f39797a));

    public long c(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return C4009B.b(decoder.x(getDescriptor()).m());
    }

    public void d(InterfaceC4050f encoder, long j10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.q(getDescriptor()).o(j10);
    }

    @Override // ce.InterfaceC3118a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC4049e interfaceC4049e) {
        return C4009B.a(c(interfaceC4049e));
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35657b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((C4009B) obj).s());
    }
}
