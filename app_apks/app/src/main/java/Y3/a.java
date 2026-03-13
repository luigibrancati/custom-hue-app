package Y3;

import d4.InterfaceC3824g;
import f4.InterfaceC3991b;
import fc.AbstractC4040w;
import gc.C4179C;
import gc.C4206t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19711d;

    public /* synthetic */ a(List list, List list2, List list3, List list4, AbstractC4854k abstractC4854k) {
        this(list, list2, list3, list4);
    }

    public final List a() {
        return this.f19711d;
    }

    public final List b() {
        return this.f19710c;
    }

    public final List c() {
        return this.f19708a;
    }

    public final List d() {
        return this.f19709b;
    }

    public final C0247a e() {
        return new C0247a(this);
    }

    public a(List list, List list2, List list3, List list4) {
        this.f19708a = list;
        this.f19709b = list2;
        this.f19710c = list3;
        this.f19711d = list4;
    }

    /* JADX INFO: renamed from: Y3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0247a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f19712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f19713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f19714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f19715d;

        public C0247a() {
            this.f19712a = new ArrayList();
            this.f19713b = new ArrayList();
            this.f19714c = new ArrayList();
            this.f19715d = new ArrayList();
        }

        public final C0247a a(c4.e decoder) {
            AbstractC4862t.e(decoder, "decoder");
            this.f19715d.add(decoder);
            return this;
        }

        public final C0247a b(InterfaceC3824g fetcher, Class type) {
            AbstractC4862t.e(fetcher, "fetcher");
            AbstractC4862t.e(type, "type");
            this.f19714c.add(AbstractC4040w.a(fetcher, type));
            return this;
        }

        public final C0247a c(InterfaceC3991b mapper, Class type) {
            AbstractC4862t.e(mapper, "mapper");
            AbstractC4862t.e(type, "type");
            this.f19713b.add(AbstractC4040w.a(mapper, type));
            return this;
        }

        public final a d() {
            return new a(C4179C.V0(this.f19712a), C4179C.V0(this.f19713b), C4179C.V0(this.f19714c), C4179C.V0(this.f19715d), null);
        }

        public C0247a(a registry) {
            AbstractC4862t.e(registry, "registry");
            this.f19712a = C4179C.X0(registry.c());
            this.f19713b = C4179C.X0(registry.d());
            this.f19714c = C4179C.X0(registry.b());
            this.f19715d = C4179C.X0(registry.a());
        }
    }

    public a() {
        this(C4206t.k(), C4206t.k(), C4206t.k(), C4206t.k());
    }
}
