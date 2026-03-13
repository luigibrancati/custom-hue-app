package Q4;

import ee.C3981a;
import fc.C4015H;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import gc.C4206t;
import ge.C4221J;
import ge.w0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f13831a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f13832b = ee.j.c("TaskException", new ee.e[0], new vc.l() { // from class: Q4.Z
        @Override // vc.l
        public final Object invoke(Object obj) {
            return a0.d((C3981a) obj);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13833a;

        static {
            int[] iArr = new int[EnumC1903x.values().length];
            try {
                iArr[EnumC1903x.fileSystem.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1903x.url.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1903x.connection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1903x.resume.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1903x.httpResponse.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13833a = iArr;
        }
    }

    public static final C4015H d(C3981a buildClassSerialDescriptor) {
        AbstractC4862t.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List listK = C4206t.k();
        w0 w0Var = w0.f35762a;
        buildClassSerialDescriptor.a("type", w0Var.getDescriptor(), listK, false);
        buildClassSerialDescriptor.a("httpResponseCode", C4221J.f35658a.getDescriptor(), C4206t.k(), false);
        buildClassSerialDescriptor.a("description", w0Var.getDescriptor(), C4206t.k(), false);
        return C4015H.f34254a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Y deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        ee.e descriptor = getDescriptor();
        InterfaceC4047c interfaceC4047cA = decoder.a(descriptor);
        EnumC1903x enumC1903x = null;
        String strV = "";
        int I10 = -1;
        while (true) {
            a0 a0Var = f13831a;
            int iJ = interfaceC4047cA.j(a0Var.getDescriptor());
            if (iJ == -1) {
                AbstractC4862t.b(enumC1903x);
                Y y10 = new Y(enumC1903x, I10, strV);
                interfaceC4047cA.c(descriptor);
                return y10;
            }
            if (iJ == 0) {
                String strV2 = interfaceC4047cA.v(a0Var.getDescriptor(), 0);
                switch (strV2.hashCode()) {
                    case -1620706755:
                        enumC1903x = !strV2.equals("TaskResumeException") ? EnumC1903x.general : EnumC1903x.resume;
                        break;
                    case -1014773793:
                        if (strV2.equals("TaskFileSystemException")) {
                            enumC1903x = EnumC1903x.fileSystem;
                        }
                        break;
                    case -858000084:
                        if (strV2.equals("TaskConnectionException")) {
                            enumC1903x = EnumC1903x.connection;
                        }
                        break;
                    case -235502107:
                        if (strV2.equals("TaskUrlException")) {
                            enumC1903x = EnumC1903x.url;
                        }
                        break;
                    case 1847794434:
                        if (strV2.equals("TaskHttpException")) {
                            enumC1903x = EnumC1903x.httpResponse;
                        }
                        break;
                    default:
                        break;
                }
            } else if (iJ == 1) {
                I10 = interfaceC4047cA.I(a0Var.getDescriptor(), 1);
            } else {
                if (iJ != 2) {
                    throw new IllegalStateException(("Unexpected index: " + iJ).toString());
                }
                strV = interfaceC4047cA.v(a0Var.getDescriptor(), 2);
            }
        }
    }

    @Override // ce.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, Y value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        ee.e descriptor = getDescriptor();
        InterfaceC4048d interfaceC4048dA = encoder.a(descriptor);
        a0 a0Var = f13831a;
        ee.e descriptor2 = a0Var.getDescriptor();
        int i10 = a.f13833a[value.getType().ordinal()];
        interfaceC4048dA.e(descriptor2, 0, i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "TaskException" : "TaskHttpException" : "TaskResumeException" : "TaskConnectionException" : "TaskUrlException" : "TaskFileSystemException");
        interfaceC4048dA.F(a0Var.getDescriptor(), 1, value.getHttpResponseCode());
        interfaceC4048dA.e(a0Var.getDescriptor(), 2, value.getDescription());
        interfaceC4048dA.c(descriptor);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f13832b;
    }
}
