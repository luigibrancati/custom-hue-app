package M6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O8.b f9319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O8.b f9320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f9321c;

    public N(Context context, E e10) {
        this.f9321c = e10;
        Z5.a aVar = Z5.a.f20273g;
        b6.u.f(context);
        final Y5.j jVarG = b6.u.c().g(aVar);
        if (aVar.a().contains(Y5.c.b("json"))) {
            this.f9319a = new o8.w(new O8.b() { // from class: M6.K
                @Override // O8.b
                public final Object get() {
                    return jVarG.a("FIREBASE_ML_SDK", byte[].class, Y5.c.b("json"), new Y5.h() { // from class: M6.M
                        @Override // Y5.h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f9320b = new o8.w(new O8.b() { // from class: M6.L
            @Override // O8.b
            public final Object get() {
                return jVarG.a("FIREBASE_ML_SDK", byte[].class, Y5.c.b("proto"), new Y5.h() { // from class: M6.J
                    @Override // Y5.h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
