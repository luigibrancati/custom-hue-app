package com.braze.models;

import com.google.android.libraries.barhopper.RecognitionOptions;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.C4221J;
import ge.C4237h;
import ge.C4240i0;
import ge.C4255t;
import ge.InterfaceC4215D;
import ge.w0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC4215D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f28036a;
    private static final ee.e descriptor;

    static {
        c cVar = new c();
        f28036a = cVar;
        C4240i0 c4240i0 = new C4240i0("com.braze.models.BrazeGeofence", cVar, 12);
        c4240i0.o("id", false);
        c4240i0.o("latitude", false);
        c4240i0.o("longitude", false);
        c4240i0.o("radius", false);
        c4240i0.o("cooldown_enter", false);
        c4240i0.o("cooldown_exit", false);
        c4240i0.o("analytics_enabled_enter", false);
        c4240i0.o("analytics_enabled_exit", false);
        c4240i0.o("enter_events", false);
        c4240i0.o("exit_events", false);
        c4240i0.o("notification_responsiveness", false);
        c4240i0.o("distanceFromGeofenceRefresh", true);
        descriptor = c4240i0;
    }

    @Override // ge.InterfaceC4215D
    public final ce.b[] childSerializers() {
        C4255t c4255t = C4255t.f35744a;
        C4221J c4221j = C4221J.f35658a;
        C4237h c4237h = C4237h.f35705a;
        return new ce.b[]{w0.f35762a, c4255t, c4255t, c4221j, c4221j, c4221j, c4237h, c4237h, c4237h, c4237h, c4221j, c4255t};
    }

    @Override // ce.InterfaceC3118a
    public final Object deserialize(InterfaceC4049e decoder) {
        String strV;
        int i10;
        int I10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        int i13;
        double d10;
        double d11;
        double dB;
        AbstractC4862t.e(decoder, "decoder");
        ee.e eVar = descriptor;
        InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
        if (interfaceC4047cA.q()) {
            strV = interfaceC4047cA.v(eVar, 0);
            double dB2 = interfaceC4047cA.B(eVar, 1);
            double dB3 = interfaceC4047cA.B(eVar, 2);
            int I11 = interfaceC4047cA.I(eVar, 3);
            int I12 = interfaceC4047cA.I(eVar, 4);
            int I13 = interfaceC4047cA.I(eVar, 5);
            boolean zL = interfaceC4047cA.l(eVar, 6);
            boolean zL2 = interfaceC4047cA.l(eVar, 7);
            boolean zL3 = interfaceC4047cA.l(eVar, 8);
            boolean zL4 = interfaceC4047cA.l(eVar, 9);
            i10 = 4095;
            I10 = interfaceC4047cA.I(eVar, 10);
            z10 = zL4;
            z11 = zL2;
            z12 = zL;
            i11 = I13;
            i12 = I11;
            z13 = zL3;
            i13 = I12;
            d10 = dB2;
            d11 = dB3;
            dB = interfaceC4047cA.B(eVar, 11);
        } else {
            strV = null;
            boolean z14 = true;
            boolean zL5 = false;
            boolean zL6 = false;
            boolean zL7 = false;
            int I14 = 0;
            int I15 = 0;
            boolean zL8 = false;
            int I16 = 0;
            double dB4 = 0.0d;
            double dB5 = 0.0d;
            double dB6 = 0.0d;
            int i14 = 0;
            int I17 = 0;
            while (z14) {
                int iJ = interfaceC4047cA.j(eVar);
                switch (iJ) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        strV = interfaceC4047cA.v(eVar, 0);
                        i14 |= 1;
                        continue;
                    case 1:
                        dB4 = interfaceC4047cA.B(eVar, 1);
                        i14 |= 2;
                        break;
                    case 2:
                        dB5 = interfaceC4047cA.B(eVar, 2);
                        i14 |= 4;
                        break;
                    case 3:
                        I15 = interfaceC4047cA.I(eVar, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        I16 = interfaceC4047cA.I(eVar, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        I14 = interfaceC4047cA.I(eVar, 5);
                        i14 |= 32;
                        break;
                    case 6:
                        zL7 = interfaceC4047cA.l(eVar, 6);
                        i14 |= 64;
                        break;
                    case 7:
                        zL6 = interfaceC4047cA.l(eVar, 7);
                        i14 |= 128;
                        break;
                    case 8:
                        zL8 = interfaceC4047cA.l(eVar, 8);
                        i14 |= 256;
                        break;
                    case 9:
                        zL5 = interfaceC4047cA.l(eVar, 9);
                        i14 |= 512;
                        break;
                    case 10:
                        I17 = interfaceC4047cA.I(eVar, 10);
                        i14 |= RecognitionOptions.UPC_E;
                        break;
                    case 11:
                        dB6 = interfaceC4047cA.B(eVar, 11);
                        i14 |= RecognitionOptions.PDF417;
                        break;
                    default:
                        throw new ce.h(iJ);
                }
            }
            i10 = i14;
            I10 = I17;
            z10 = zL5;
            z11 = zL6;
            z12 = zL7;
            i11 = I14;
            i12 = I15;
            z13 = zL8;
            i13 = I16;
            d10 = dB4;
            d11 = dB5;
            dB = dB6;
        }
        String str = strV;
        interfaceC4047cA.c(eVar);
        return new BrazeGeofence(i10, str, d10, d11, i12, i13, i11, z12, z11, z13, z10, I10, dB, null);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public final ee.e getDescriptor() {
        return descriptor;
    }

    @Override // ce.g
    public final void serialize(InterfaceC4050f encoder, Object obj) {
        BrazeGeofence value = (BrazeGeofence) obj;
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        ee.e eVar = descriptor;
        InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
        BrazeGeofence.write$Self$android_sdk_base_release(value, interfaceC4048dA, eVar);
        interfaceC4048dA.c(eVar);
    }
}
