package o8;

import O8.a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C implements O8.b, O8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.InterfaceC0156a f41226c = new a.InterfaceC0156a() { // from class: o8.z
        @Override // O8.a.InterfaceC0156a
        public final void a(O8.b bVar) {
            C.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O8.b f41227d = new O8.b() { // from class: o8.A
        @Override // O8.b
        public final Object get() {
            return C.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.InterfaceC0156a f41228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile O8.b f41229b;

    public C(a.InterfaceC0156a interfaceC0156a, O8.b bVar) {
        this.f41228a = interfaceC0156a;
        this.f41229b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(a.InterfaceC0156a interfaceC0156a, a.InterfaceC0156a interfaceC0156a2, O8.b bVar) {
        interfaceC0156a.a(bVar);
        interfaceC0156a2.a(bVar);
    }

    public static C e() {
        return new C(f41226c, f41227d);
    }

    public static C f(O8.b bVar) {
        return new C(null, bVar);
    }

    @Override // O8.a
    public void a(final a.InterfaceC0156a interfaceC0156a) {
        O8.b bVar;
        O8.b bVar2;
        O8.b bVar3 = this.f41229b;
        O8.b bVar4 = f41227d;
        if (bVar3 != bVar4) {
            interfaceC0156a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f41229b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0156a interfaceC0156a2 = this.f41228a;
                this.f41228a = new a.InterfaceC0156a() { // from class: o8.B
                    @Override // O8.a.InterfaceC0156a
                    public final void a(O8.b bVar5) {
                        C.c(interfaceC0156a2, interfaceC0156a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0156a.a(bVar);
        }
    }

    public void g(O8.b bVar) {
        a.InterfaceC0156a interfaceC0156a;
        if (this.f41229b != f41227d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0156a = this.f41228a;
            this.f41228a = null;
            this.f41229b = bVar;
        }
        interfaceC0156a.a(bVar);
    }

    @Override // O8.b
    public Object get() {
        return this.f41229b.get();
    }

    public static /* synthetic */ void d(O8.b bVar) {
    }
}
