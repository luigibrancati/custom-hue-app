package ie;

import ge.C4257v;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4257v f37542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37543b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a extends AbstractC4860q implements vc.p {
        public a(Object obj) {
            super(2, obj, r.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean i(ee.e p02, int i10) {
            AbstractC4862t.e(p02, "p0");
            return Boolean.valueOf(((r) this.receiver).e(p02, i10));
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i((ee.e) obj, ((Number) obj2).intValue());
        }
    }

    public r(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        this.f37542a = new C4257v(descriptor, new a(this));
    }

    public final boolean b() {
        return this.f37543b;
    }

    public final void c(int i10) {
        this.f37542a.a(i10);
    }

    public final int d() {
        return this.f37542a.d();
    }

    public final boolean e(ee.e eVar, int i10) {
        boolean z10 = !eVar.j(i10) && eVar.h(i10).b();
        this.f37543b = z10;
        return z10;
    }
}
