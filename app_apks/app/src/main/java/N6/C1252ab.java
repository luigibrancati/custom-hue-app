package N6;

import android.content.Context;

/* JADX INFO: renamed from: N6.ab, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1252ab implements Ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O8.b f10172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O8.b f10173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ka f10174c;

    public C1252ab(Context context, Ka ka2) {
        this.f10174c = ka2;
        Z5.a aVar = Z5.a.f20273g;
        b6.u.f(context);
        final Y5.j jVarG = b6.u.c().g(aVar);
        if (aVar.a().contains(Y5.c.b("json"))) {
            this.f10172a = new o8.w(new O8.b() { // from class: N6.Xa
                @Override // O8.b
                public final Object get() {
                    return jVarG.a("FIREBASE_ML_SDK", byte[].class, Y5.c.b("json"), new Y5.h() { // from class: N6.Za
                        @Override // Y5.h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f10173b = new o8.w(new O8.b() { // from class: N6.Ya
            @Override // O8.b
            public final Object get() {
                return jVarG.a("FIREBASE_ML_SDK", byte[].class, Y5.c.b("proto"), new Y5.h() { // from class: N6.Wa
                    @Override // Y5.h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static Y5.d b(Ka ka2, Ha ha2) {
        int iA = ka2.a();
        return ha2.zza() != 0 ? Y5.d.f(ha2.a(iA, false)) : Y5.d.h(ha2.a(iA, false));
    }

    @Override // N6.Ia
    public final void a(Ha ha2) {
        if (this.f10174c.a() != 0) {
            ((Y5.i) this.f10173b.get()).a(b(this.f10174c, ha2));
            return;
        }
        O8.b bVar = this.f10172a;
        if (bVar != null) {
            ((Y5.i) bVar.get()).a(b(this.f10174c, ha2));
        }
    }
}
