package d3;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC4992i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32997b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f32998a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC4992i.c {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public d(o connectionWrapper) {
        AbstractC4862t.e(connectionWrapper, "connectionWrapper");
        this.f32998a = connectionWrapper;
    }

    public final o b() {
        return this.f32998a;
    }

    @Override // lc.InterfaceC4992i
    public Object fold(Object obj, vc.p pVar) {
        return InterfaceC4992i.b.a.a(this, obj, pVar);
    }

    @Override // lc.InterfaceC4992i.b, lc.InterfaceC4992i
    public InterfaceC4992i.b get(InterfaceC4992i.c cVar) {
        return InterfaceC4992i.b.a.b(this, cVar);
    }

    @Override // lc.InterfaceC4992i.b
    public InterfaceC4992i.c getKey() {
        return f32997b;
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i minusKey(InterfaceC4992i.c cVar) {
        return InterfaceC4992i.b.a.c(this, cVar);
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i plus(InterfaceC4992i interfaceC4992i) {
        return InterfaceC4992i.b.a.d(this, interfaceC4992i);
    }
}
