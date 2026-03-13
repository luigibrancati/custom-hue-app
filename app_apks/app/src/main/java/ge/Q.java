package ge;

import ee.d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Q implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f35675a = new Q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f35676b = new p0("kotlin.Long", d.g.f33947a);

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return Long.valueOf(decoder.m());
    }

    public void d(InterfaceC4050f encoder, long j10) {
        AbstractC4862t.e(encoder, "encoder");
        encoder.o(j10);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f35676b;
    }

    @Override // ce.g
    public /* bridge */ /* synthetic */ void serialize(InterfaceC4050f interfaceC4050f, Object obj) {
        d(interfaceC4050f, ((Number) obj).longValue());
    }
}
