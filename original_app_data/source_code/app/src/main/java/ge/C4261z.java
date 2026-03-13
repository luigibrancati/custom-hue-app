package ge;

import fc.C4029l;
import fc.InterfaceC4028k;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import gc.C4204q;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: ge.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4261z implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f35774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ee.e f35775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f35776c;

    public C4261z(final String serialName, Enum[] values) {
        AbstractC4862t.e(serialName, "serialName");
        AbstractC4862t.e(values, "values");
        this.f35774a = values;
        this.f35776c = C4029l.b(new InterfaceC6082a() { // from class: ge.y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4261z.e(this.f35769a, serialName);
            }
        });
    }

    public static final ee.e e(C4261z c4261z, String str) {
        ee.e eVar = c4261z.f35775b;
        return eVar == null ? c4261z.d(str) : eVar;
    }

    public final ee.e d(String str) {
        C4259x c4259x = new C4259x(str, this.f35774a.length);
        for (Enum r02 : this.f35774a) {
            C4240i0.p(c4259x, r02.name(), false, 2, null);
        }
        return c4259x;
    }

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        int iF = decoder.f(getDescriptor());
        if (iF >= 0) {
            Enum[] enumArr = this.f35774a;
            if (iF < enumArr.length) {
                return enumArr[iF];
            }
        }
        throw new ce.f(iF + " is not among valid " + getDescriptor().i() + " enum values, values size is " + this.f35774a.length);
    }

    @Override // ce.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, Enum value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        int iI0 = C4204q.i0(this.f35774a, value);
        if (iI0 != -1) {
            encoder.p(getDescriptor(), iI0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().i());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f35774a);
        AbstractC4862t.d(string, "toString(...)");
        sb2.append(string);
        throw new ce.f(sb2.toString());
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return (ee.e) this.f35776c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().i() + '>';
    }
}
