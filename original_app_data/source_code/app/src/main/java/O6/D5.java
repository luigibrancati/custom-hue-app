package O6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D5 implements InterfaceC1746q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O8.b f11266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O8.b f11267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1759s5 f11268c;

    public D5(Context context, AbstractC1759s5 abstractC1759s5) {
        this.f11268c = abstractC1759s5;
        Z5.a aVar = Z5.a.f20273g;
        b6.u.f(context);
        final Y5.j jVarG = b6.u.c().g(aVar);
        if (aVar.a().contains(Y5.c.b("json"))) {
            this.f11266a = new o8.w(new O8.b() { // from class: O6.A5
                @Override // O8.b
                public final Object get() {
                    return jVarG.a("FIREBASE_ML_SDK", byte[].class, Y5.c.b("json"), new Y5.h() { // from class: O6.C5
                        @Override // Y5.h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f11267b = new o8.w(new O8.b() { // from class: O6.B5
            @Override // O8.b
            public final Object get() {
                return jVarG.a("FIREBASE_ML_SDK", byte[].class, Y5.c.b("proto"), new Y5.h() { // from class: O6.z5
                    @Override // Y5.h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static Y5.d b(AbstractC1759s5 abstractC1759s5, InterfaceC1739p5 interfaceC1739p5) {
        return Y5.d.h(interfaceC1739p5.a(abstractC1759s5.a(), false));
    }

    @Override // O6.InterfaceC1746q5
    public final void a(InterfaceC1739p5 interfaceC1739p5) {
        if (this.f11268c.a() != 0) {
            ((Y5.i) this.f11267b.get()).a(b(this.f11268c, interfaceC1739p5));
            return;
        }
        O8.b bVar = this.f11266a;
        if (bVar != null) {
            ((Y5.i) bVar.get()).a(b(this.f11268c, interfaceC1739p5));
        }
    }
}
