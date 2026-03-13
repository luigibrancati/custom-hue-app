package Ga;

import Ga.WidgetModel;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.s0;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Ga.g, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001c\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"LGa/g;", "", "LGa/p;", "configuration", "<init>", "(LGa/p;)V", "", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILGa/p;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "b", "(LGa/g;Lfe/d;Lee/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "LGa/p;", "()LGa/p;", "Companion", "native_widgets_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavedWidgetConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final WidgetModel configuration;

    /* JADX INFO: renamed from: Ga.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4651a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f4651a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.signify.widgets.SavedWidgetConfig", aVar, 1);
            c4240i0.o("configuration", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return InterfaceC4215D.a.a(this);
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SavedWidgetConfig deserialize(InterfaceC4049e decoder) {
            WidgetModel pVar;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            int i10 = 1;
            s0 s0Var = null;
            if (interfaceC4047cA.q()) {
                pVar = (WidgetModel) interfaceC4047cA.H(eVar, 0, WidgetModel.a.f4666a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                pVar = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else {
                        if (iJ != 0) {
                            throw new ce.h(iJ);
                        }
                        pVar = (WidgetModel) interfaceC4047cA.H(eVar, 0, WidgetModel.a.f4666a, pVar);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            interfaceC4047cA.c(eVar);
            return new SavedWidgetConfig(i10, pVar, s0Var);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            return new ce.b[]{WidgetModel.a.f4666a};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, SavedWidgetConfig value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            SavedWidgetConfig.b(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Ga.g$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f4651a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ SavedWidgetConfig(int i10, WidgetModel pVar, s0 s0Var) {
        if (1 != (i10 & 1)) {
            AbstractC4232e0.a(i10, 1, a.f4651a.getDescriptor());
        }
        this.configuration = pVar;
    }

    public static final /* synthetic */ void b(SavedWidgetConfig self, InterfaceC4048d output, ee.e serialDesc) {
        output.E(serialDesc, 0, WidgetModel.a.f4666a, self.configuration);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final WidgetModel getConfiguration() {
        return this.configuration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SavedWidgetConfig) && AbstractC4862t.a(this.configuration, ((SavedWidgetConfig) other).configuration);
    }

    public int hashCode() {
        return this.configuration.hashCode();
    }

    public String toString() {
        return "SavedWidgetConfig(configuration=" + this.configuration + ')';
    }

    public SavedWidgetConfig(WidgetModel configuration) {
        AbstractC4862t.e(configuration, "configuration");
        this.configuration = configuration;
    }
}
