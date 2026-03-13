package he;

import ee.k;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f36618a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f36619b = ee.j.e("kotlinx.serialization.json.JsonNull", k.b.f33970a, new ee.e[0], null, 8, null);

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public x deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        q.g(decoder);
        if (decoder.F()) {
            throw new ie.q("Expected 'null' literal");
        }
        decoder.i();
        return x.INSTANCE;
    }

    @Override // ce.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, x value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        q.h(encoder);
        encoder.r();
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f36619b;
    }
}
