package com.braze.models;

import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.C4237h;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.w0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC4215D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f28056a;
    private static final ee.e descriptor;

    static {
        i iVar = new i();
        f28056a = iVar;
        C4240i0 c4240i0 = new C4240i0("com.braze.models.FeatureFlag", iVar, 4);
        c4240i0.o("id", false);
        c4240i0.o("enabled", false);
        c4240i0.o("properties", false);
        c4240i0.o("fts", true);
        descriptor = c4240i0;
    }

    @Override // ge.InterfaceC4215D
    public final ce.b[] childSerializers() {
        w0 w0Var = w0.f35762a;
        return new ce.b[]{w0Var, C4237h.f35705a, w0Var, AbstractC3918a.p(w0Var)};
    }

    @Override // ce.InterfaceC3118a
    public final Object deserialize(InterfaceC4049e decoder) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        AbstractC4862t.e(decoder, "decoder");
        ee.e eVar = descriptor;
        InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
        if (interfaceC4047cA.q()) {
            String strV = interfaceC4047cA.v(eVar, 0);
            boolean zL = interfaceC4047cA.l(eVar, 1);
            String strV2 = interfaceC4047cA.v(eVar, 2);
            str = strV;
            str3 = (String) interfaceC4047cA.A(eVar, 3, w0.f35762a, null);
            str2 = strV2;
            z10 = zL;
            i10 = 15;
        } else {
            boolean z11 = true;
            boolean zL2 = false;
            String strV3 = null;
            String strV4 = null;
            String str4 = null;
            int i11 = 0;
            while (z11) {
                int iJ = interfaceC4047cA.j(eVar);
                if (iJ == -1) {
                    z11 = false;
                } else if (iJ == 0) {
                    strV3 = interfaceC4047cA.v(eVar, 0);
                    i11 |= 1;
                } else if (iJ == 1) {
                    zL2 = interfaceC4047cA.l(eVar, 1);
                    i11 |= 2;
                } else if (iJ == 2) {
                    strV4 = interfaceC4047cA.v(eVar, 2);
                    i11 |= 4;
                } else {
                    if (iJ != 3) {
                        throw new ce.h(iJ);
                    }
                    str4 = (String) interfaceC4047cA.A(eVar, 3, w0.f35762a, str4);
                    i11 |= 8;
                }
            }
            z10 = zL2;
            i10 = i11;
            str = strV3;
            str2 = strV4;
            str3 = str4;
        }
        interfaceC4047cA.c(eVar);
        return new FeatureFlag(i10, str, z10, str2, str3, null);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public final ee.e getDescriptor() {
        return descriptor;
    }

    @Override // ce.g
    public final void serialize(InterfaceC4050f encoder, Object obj) {
        FeatureFlag value = (FeatureFlag) obj;
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        ee.e eVar = descriptor;
        InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
        FeatureFlag.write$Self$android_sdk_base_release(value, interfaceC4048dA, eVar);
        interfaceC4048dA.c(eVar);
    }
}
