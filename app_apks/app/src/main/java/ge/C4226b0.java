package ge;

import ee.C3981a;
import ee.l;
import fc.C4015H;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import fe.InterfaceC4047c;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: ge.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4226b0 implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f35696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f35697c;

    public C4226b0(final String serialName, Object objectInstance) {
        AbstractC4862t.e(serialName, "serialName");
        AbstractC4862t.e(objectInstance, "objectInstance");
        this.f35695a = objectInstance;
        this.f35696b = C4206t.k();
        this.f35697c = C4029l.a(EnumC4031n.PUBLICATION, new InterfaceC6082a() { // from class: ge.Z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4226b0.e(serialName, this);
            }
        });
    }

    public static final ee.e e(String str, final C4226b0 c4226b0) {
        return ee.j.d(str, l.d.f33974a, new ee.e[0], new vc.l() { // from class: ge.a0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C4226b0.f(this.f35694a, (C3981a) obj);
            }
        });
    }

    public static final C4015H f(C4226b0 c4226b0, C3981a buildSerialDescriptor) {
        AbstractC4862t.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(c4226b0.f35696b);
        return C4015H.f34254a;
    }

    @Override // ce.InterfaceC3118a
    public Object deserialize(InterfaceC4049e decoder) {
        int iJ;
        AbstractC4862t.e(decoder, "decoder");
        ee.e descriptor = getDescriptor();
        InterfaceC4047c interfaceC4047cA = decoder.a(descriptor);
        if (interfaceC4047cA.q() || (iJ = interfaceC4047cA.j(getDescriptor())) == -1) {
            C4015H c4015h = C4015H.f34254a;
            interfaceC4047cA.c(descriptor);
            return this.f35695a;
        }
        throw new ce.f("Unexpected index " + iJ);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return (ee.e) this.f35697c.getValue();
    }

    @Override // ce.g
    public void serialize(InterfaceC4050f encoder, Object value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        encoder.a(getDescriptor()).c(getDescriptor());
    }
}
