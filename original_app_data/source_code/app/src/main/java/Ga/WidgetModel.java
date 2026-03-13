package Ga;

import Ga.WidgetItem;
import ce.InterfaceC3118a;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4231e;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.s0;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: Ga.p, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u001d\"B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"LGa/p;", "", "", "LGa/k;", "items", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILjava/util/List;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "e", "(LGa/p;Lfe/d;Lee/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "Companion", "b", "native_widgets_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC4028k[] f4664b = {C4029l.a(EnumC4031n.PUBLICATION, new InterfaceC6082a() { // from class: Ga.o
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return WidgetModel.b();
        }
    })};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final List items;

    /* JADX INFO: renamed from: Ga.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4666a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f4666a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.signify.widgets.WidgetModel", aVar, 1);
            c4240i0.o("items", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return InterfaceC4215D.a.a(this);
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final WidgetModel deserialize(InterfaceC4049e decoder) {
            List list;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            InterfaceC4028k[] interfaceC4028kArr = WidgetModel.f4664b;
            int i10 = 1;
            s0 s0Var = null;
            if (interfaceC4047cA.q()) {
                list = (List) interfaceC4047cA.H(eVar, 0, (InterfaceC3118a) interfaceC4028kArr[0].getValue(), null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else {
                        if (iJ != 0) {
                            throw new ce.h(iJ);
                        }
                        list2 = (List) interfaceC4047cA.H(eVar, 0, (InterfaceC3118a) interfaceC4028kArr[0].getValue(), list2);
                        i11 = 1;
                    }
                }
                list = list2;
                i10 = i11;
            }
            interfaceC4047cA.c(eVar);
            return new WidgetModel(i10, list, s0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            return new ce.b[]{WidgetModel.f4664b[0].getValue()};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, WidgetModel value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            WidgetModel.e(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Ga.p$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f4666a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ WidgetModel(int i10, List list, s0 s0Var) {
        if (1 != (i10 & 1)) {
            AbstractC4232e0.a(i10, 1, a.f4666a.getDescriptor());
        }
        this.items = list;
    }

    public static final /* synthetic */ ce.b b() {
        return new C4231e(WidgetItem.a.f4661a);
    }

    public static final /* synthetic */ void e(WidgetModel self, InterfaceC4048d output, ee.e serialDesc) {
        output.E(serialDesc, 0, (ce.g) f4664b[0].getValue(), self.items);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WidgetModel) && AbstractC4862t.a(this.items, ((WidgetModel) other).items);
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return "WidgetModel(items=" + this.items + ')';
    }

    public WidgetModel(List items) {
        AbstractC4862t.e(items, "items");
        this.items = items;
    }
}
