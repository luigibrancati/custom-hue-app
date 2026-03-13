package he;

import ee.d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;

/* JADX INFO: renamed from: he.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4301D implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4301D f36580a = new C4301D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f36581b = ee.j.e("kotlinx.serialization.json.JsonPrimitive", d.i.f33949a, new ee.e[0], null, 8, null);

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC4300C deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        h hVarG = q.d(decoder).g();
        if (hVarG instanceof AbstractC4300C) {
            return (AbstractC4300C) hVarG;
        }
        throw ie.u.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + M.b(hVarG.getClass()), hVarG.toString());
    }

    @Override // ce.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, AbstractC4300C value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        q.h(encoder);
        if (value instanceof x) {
            encoder.x(y.f36618a, x.INSTANCE);
        } else {
            encoder.x(u.f36615a, (t) value);
        }
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f36581b;
    }
}
