package he;

import Od.F;
import Od.I;
import de.AbstractC3918a;
import ee.d;
import fc.C4009B;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f36615a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f36616b = ee.j.b("kotlinx.serialization.json.JsonLiteral", d.i.f33949a);

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        h hVarG = q.d(decoder).g();
        if (hVarG instanceof t) {
            return (t) hVarG;
        }
        throw ie.u.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + M.b(hVarG.getClass()), hVarG.toString());
    }

    @Override // ce.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, t value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        q.h(encoder);
        if (value.e()) {
            encoder.G(value.c());
            return;
        }
        if (value.d() != null) {
            encoder.q(value.d()).G(value.c());
            return;
        }
        Long lW = Od.B.w(value.c());
        if (lW != null) {
            encoder.o(lW.longValue());
            return;
        }
        C4009B c4009bH = I.h(value.c());
        if (c4009bH != null) {
            encoder.q(AbstractC3918a.v(C4009B.f34243b).getDescriptor()).o(c4009bH.s());
            return;
        }
        Double dS = Od.A.s(value.c());
        if (dS != null) {
            encoder.f(dS.doubleValue());
            return;
        }
        Boolean boolD1 = F.d1(value.c());
        if (boolD1 != null) {
            encoder.u(boolD1.booleanValue());
        } else {
            encoder.G(value.c());
        }
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f36616b;
    }
}
