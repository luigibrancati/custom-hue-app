package Ga;

import ce.InterfaceC3118a;
import de.AbstractC3918a;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4221J;
import ge.C4237h;
import ge.C4240i0;
import ge.C4261z;
import ge.InterfaceC4215D;
import ge.s0;
import ge.w0;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: Ga.k, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0002#&B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019JN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b+\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"LGa/k;", "", "", "id", "", "nativeId", "title", "subtitle", "LGa/m;", "type", "", "shouldTurnOff", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LGa/m;Z)V", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;LGa/m;ZLge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "l", "(LGa/k;Lfe/d;Lee/e;)V", "d", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LGa/m;Z)LGa/k;", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "I", "g", "c", "j", "i", "e", "LGa/m;", "k", "()LGa/m;", "Z", "h", "()Z", "Companion", "native_widgets_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC4028k[] f4654g = {null, null, null, null, C4029l.a(EnumC4031n.PUBLICATION, new InterfaceC6082a() { // from class: Ga.j
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WidgetItem.b();
        }
    }), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final int nativeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String subtitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final m type;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean shouldTurnOff;

    /* JADX INFO: renamed from: Ga.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4661a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f4661a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.signify.widgets.WidgetItem", aVar, 6);
            c4240i0.o("id", false);
            c4240i0.o("nativeId", false);
            c4240i0.o("title", false);
            c4240i0.o("subtitle", false);
            c4240i0.o("type", true);
            c4240i0.o("shouldTurnOff", true);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return InterfaceC4215D.a.a(this);
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final WidgetItem deserialize(InterfaceC4049e decoder) {
            boolean zL;
            int i10;
            int i11;
            String str;
            String str2;
            String str3;
            m mVar;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            InterfaceC4028k[] interfaceC4028kArr = WidgetItem.f4654g;
            if (interfaceC4047cA.q()) {
                String strV = interfaceC4047cA.v(eVar, 0);
                int I10 = interfaceC4047cA.I(eVar, 1);
                String strV2 = interfaceC4047cA.v(eVar, 2);
                String strV3 = interfaceC4047cA.v(eVar, 3);
                mVar = (m) interfaceC4047cA.A(eVar, 4, (InterfaceC3118a) interfaceC4028kArr[4].getValue(), null);
                str = strV;
                zL = interfaceC4047cA.l(eVar, 5);
                str3 = strV3;
                str2 = strV2;
                i10 = 63;
                i11 = I10;
            } else {
                boolean z10 = true;
                boolean zL2 = false;
                int I11 = 0;
                String strV4 = null;
                String strV5 = null;
                String strV6 = null;
                m mVar2 = null;
                int i12 = 0;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    switch (iJ) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            strV4 = interfaceC4047cA.v(eVar, 0);
                            i12 |= 1;
                            continue;
                        case 1:
                            I11 = interfaceC4047cA.I(eVar, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            strV5 = interfaceC4047cA.v(eVar, 2);
                            i12 |= 4;
                            break;
                        case 3:
                            strV6 = interfaceC4047cA.v(eVar, 3);
                            i12 |= 8;
                            break;
                        case 4:
                            mVar2 = (m) interfaceC4047cA.A(eVar, 4, (InterfaceC3118a) interfaceC4028kArr[4].getValue(), mVar2);
                            i12 |= 16;
                            break;
                        case 5:
                            zL2 = interfaceC4047cA.l(eVar, 5);
                            i12 |= 32;
                            break;
                        default:
                            throw new ce.h(iJ);
                    }
                }
                zL = zL2;
                i10 = i12;
                i11 = I11;
                str = strV4;
                str2 = strV5;
                str3 = strV6;
                mVar = mVar2;
            }
            interfaceC4047cA.c(eVar);
            return new WidgetItem(i10, str, i11, str2, str3, mVar, zL, null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            ce.b bVarP = AbstractC3918a.p((ce.b) WidgetItem.f4654g[4].getValue());
            w0 w0Var = w0.f35762a;
            return new ce.b[]{w0Var, C4221J.f35658a, w0Var, w0Var, bVarP, C4237h.f35705a};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, WidgetItem value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            WidgetItem.l(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Ga.k$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f4661a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ WidgetItem(int i10, String str, int i11, String str2, String str3, m mVar, boolean z10, s0 s0Var) {
        if (15 != (i10 & 15)) {
            AbstractC4232e0.a(i10, 15, a.f4661a.getDescriptor());
        }
        this.id = str;
        this.nativeId = i11;
        this.title = str2;
        this.subtitle = str3;
        if ((i10 & 16) == 0) {
            this.type = m.groupControl;
        } else {
            this.type = mVar;
        }
        if ((i10 & 32) == 0) {
            this.shouldTurnOff = false;
        } else {
            this.shouldTurnOff = z10;
        }
    }

    public static final /* synthetic */ ce.b b() {
        return new C4261z("com.signify.widgets.WidgetItemType", m.values());
    }

    public static /* synthetic */ WidgetItem e(WidgetItem widgetItem, String str, int i10, String str2, String str3, m mVar, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = widgetItem.id;
        }
        if ((i11 & 2) != 0) {
            i10 = widgetItem.nativeId;
        }
        if ((i11 & 4) != 0) {
            str2 = widgetItem.title;
        }
        if ((i11 & 8) != 0) {
            str3 = widgetItem.subtitle;
        }
        if ((i11 & 16) != 0) {
            mVar = widgetItem.type;
        }
        if ((i11 & 32) != 0) {
            z10 = widgetItem.shouldTurnOff;
        }
        m mVar2 = mVar;
        boolean z11 = z10;
        return widgetItem.d(str, i10, str2, str3, mVar2, z11);
    }

    public static final /* synthetic */ void l(WidgetItem self, InterfaceC4048d output, ee.e serialDesc) {
        InterfaceC4028k[] interfaceC4028kArr = f4654g;
        output.e(serialDesc, 0, self.id);
        output.F(serialDesc, 1, self.nativeId);
        output.e(serialDesc, 2, self.title);
        output.e(serialDesc, 3, self.subtitle);
        if (output.i(serialDesc, 4) || self.type != m.groupControl) {
            output.l(serialDesc, 4, (ce.g) interfaceC4028kArr[4].getValue(), self.type);
        }
        if (output.i(serialDesc, 5) || self.shouldTurnOff) {
            output.n(serialDesc, 5, self.shouldTurnOff);
        }
    }

    public final WidgetItem d(String id2, int nativeId, String title, String subtitle, m type, boolean shouldTurnOff) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(title, "title");
        AbstractC4862t.e(subtitle, "subtitle");
        return new WidgetItem(id2, nativeId, title, subtitle, type, shouldTurnOff);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetItem)) {
            return false;
        }
        WidgetItem widgetItem = (WidgetItem) other;
        return AbstractC4862t.a(this.id, widgetItem.id) && this.nativeId == widgetItem.nativeId && AbstractC4862t.a(this.title, widgetItem.title) && AbstractC4862t.a(this.subtitle, widgetItem.subtitle) && this.type == widgetItem.type && this.shouldTurnOff == widgetItem.shouldTurnOff;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getNativeId() {
        return this.nativeId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShouldTurnOff() {
        return this.shouldTurnOff;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + Integer.hashCode(this.nativeId)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
        m mVar = this.type;
        return ((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31) + Boolean.hashCode(this.shouldTurnOff);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final m getType() {
        return this.type;
    }

    public String toString() {
        return "WidgetItem(id=" + this.id + ", nativeId=" + this.nativeId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", type=" + this.type + ", shouldTurnOff=" + this.shouldTurnOff + ')';
    }

    public WidgetItem(String id2, int i10, String title, String subtitle, m mVar, boolean z10) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(title, "title");
        AbstractC4862t.e(subtitle, "subtitle");
        this.id = id2;
        this.nativeId = i10;
        this.title = title;
        this.subtitle = subtitle;
        this.type = mVar;
        this.shouldTurnOff = z10;
    }
}
