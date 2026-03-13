package he;

import ee.C3981a;
import ee.c;
import fc.C4015H;
import fc.C4032o;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f36609a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f36610b = ee.j.d("kotlinx.serialization.json.JsonElement", c.a.f33940a, new ee.e[0], new vc.l() { // from class: he.j
        @Override // vc.l
        public final Object invoke(Object obj) {
            return p.i((C3981a) obj);
        }
    });

    public static final C4015H i(C3981a buildSerialDescriptor) {
        AbstractC4862t.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C3981a.b(buildSerialDescriptor, "JsonPrimitive", q.f(new InterfaceC6082a() { // from class: he.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.j();
            }
        }), null, false, 12, null);
        C3981a.b(buildSerialDescriptor, "JsonNull", q.f(new InterfaceC6082a() { // from class: he.l
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.k();
            }
        }), null, false, 12, null);
        C3981a.b(buildSerialDescriptor, "JsonLiteral", q.f(new InterfaceC6082a() { // from class: he.m
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.l();
            }
        }), null, false, 12, null);
        C3981a.b(buildSerialDescriptor, "JsonObject", q.f(new InterfaceC6082a() { // from class: he.n
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.m();
            }
        }), null, false, 12, null);
        C3981a.b(buildSerialDescriptor, "JsonArray", q.f(new InterfaceC6082a() { // from class: he.o
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.n();
            }
        }), null, false, 12, null);
        return C4015H.f34254a;
    }

    public static final ee.e j() {
        return C4301D.f36580a.getDescriptor();
    }

    public static final ee.e k() {
        return y.f36618a.getDescriptor();
    }

    public static final ee.e l() {
        return u.f36615a.getDescriptor();
    }

    public static final ee.e m() {
        return C4299B.f36575a.getDescriptor();
    }

    public static final ee.e n() {
        return C4306d.f36587a.getDescriptor();
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f36610b;
    }

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public h deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return q.d(decoder).g();
    }

    @Override // ce.g
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, h value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        q.h(encoder);
        if (value instanceof AbstractC4300C) {
            encoder.x(C4301D.f36580a, value);
        } else if (value instanceof C4298A) {
            encoder.x(C4299B.f36575a, value);
        } else {
            if (!(value instanceof C4305c)) {
                throw new C4032o();
            }
            encoder.x(C4306d.f36587a, value);
        }
    }
}
