package ge;

import ce.InterfaceC3118a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4225b implements ce.b {
    public final Object d(InterfaceC4047c interfaceC4047c) {
        return InterfaceC4047c.C(interfaceC4047c, getDescriptor(), 1, ce.d.a(this, interfaceC4047c, interfaceC4047c.v(getDescriptor(), 0)), null, 8, null);
    }

    @Override // ce.InterfaceC3118a
    public final Object deserialize(InterfaceC4049e decoder) {
        Object objD;
        AbstractC4862t.e(decoder, "decoder");
        ee.e descriptor = getDescriptor();
        InterfaceC4047c interfaceC4047cA = decoder.a(descriptor);
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        if (interfaceC4047cA.q()) {
            objD = d(interfaceC4047cA);
        } else {
            Object objC = null;
            while (true) {
                int iJ = interfaceC4047cA.j(getDescriptor());
                if (iJ != -1) {
                    if (iJ == 0) {
                        l10.f39776a = interfaceC4047cA.v(getDescriptor(), iJ);
                    } else {
                        if (iJ != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) l10.f39776a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(iJ);
                            throw new ce.f(sb2.toString());
                        }
                        Object obj = l10.f39776a;
                        if (obj == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        l10.f39776a = obj;
                        objC = InterfaceC4047c.C(interfaceC4047cA, getDescriptor(), iJ, ce.d.a(this, interfaceC4047cA, (String) obj), null, 8, null);
                    }
                } else {
                    if (objC == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) l10.f39776a)).toString());
                    }
                    AbstractC4862t.c(objC, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    objD = objC;
                }
            }
        }
        interfaceC4047cA.c(descriptor);
        return objD;
    }

    public InterfaceC3118a e(InterfaceC4047c decoder, String str) {
        AbstractC4862t.e(decoder, "decoder");
        return decoder.b().c(g(), str);
    }

    public ce.g f(InterfaceC4050f encoder, Object value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        return encoder.b().d(g(), value);
    }

    public abstract Cc.d g();

    @Override // ce.g
    public final void serialize(InterfaceC4050f encoder, Object value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        ce.g gVarB = ce.d.b(this, encoder, value);
        ee.e descriptor = getDescriptor();
        InterfaceC4048d interfaceC4048dA = encoder.a(descriptor);
        interfaceC4048dA.e(getDescriptor(), 0, gVarB.getDescriptor().i());
        ee.e descriptor2 = getDescriptor();
        AbstractC4862t.c(gVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        interfaceC4048dA.E(descriptor2, 1, gVarB, value);
        interfaceC4048dA.c(descriptor);
    }
}
