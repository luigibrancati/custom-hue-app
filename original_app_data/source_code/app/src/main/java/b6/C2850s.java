package b6;

/* JADX INFO: renamed from: b6.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2850s implements Y5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2847p f25368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y5.c f25370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y5.h f25371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2851t f25372e;

    public C2850s(AbstractC2847p abstractC2847p, String str, Y5.c cVar, Y5.h hVar, InterfaceC2851t interfaceC2851t) {
        this.f25368a = abstractC2847p;
        this.f25369b = str;
        this.f25370c = cVar;
        this.f25371d = hVar;
        this.f25372e = interfaceC2851t;
    }

    @Override // Y5.i
    public void a(Y5.d dVar) {
        b(dVar, new Y5.k() { // from class: b6.r
            @Override // Y5.k
            public final void a(Exception exc) {
                C2850s.c(exc);
            }
        });
    }

    @Override // Y5.i
    public void b(Y5.d dVar, Y5.k kVar) {
        this.f25372e.a(AbstractC2846o.a().e(this.f25368a).c(dVar).f(this.f25369b).d(this.f25371d).b(this.f25370c).a(), kVar);
    }

    public AbstractC2847p d() {
        return this.f25368a;
    }

    public static /* synthetic */ void c(Exception exc) {
    }
}
