package ge;

import ee.d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4256u implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4256u f35748a = new C4256u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35749b = new p0("kotlin.time.Duration", d.i.f33949a);

    public long c(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return Pd.a.f13294b.c(decoder.D());
    }

    public void d(InterfaceC4050f encoder, long j10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.G(Pd.a.S(j10));
    }

    @Override // ce.InterfaceC3118a
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC4049e interfaceC4049e) {
        return Pd.a.q(c(interfaceC4049e));
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35749b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((Pd.a) obj).W());
    }
}
