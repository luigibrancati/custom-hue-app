package N6;

import java.util.Map;

/* JADX INFO: renamed from: N6.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1332h0 extends T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1358j0 f10292c;

    public C1332h0(C1358j0 c1358j0, int i10) {
        this.f10292c = c1358j0;
        this.f10290a = C1358j0.j(c1358j0, i10);
        this.f10291b = i10;
    }

    public final void a() {
        int i10 = this.f10291b;
        if (i10 == -1 || i10 >= this.f10292c.size() || !AbstractC1538x.a(this.f10290a, C1358j0.j(this.f10292c, this.f10291b))) {
            this.f10291b = this.f10292c.z(this.f10290a);
        }
    }

    @Override // N6.T, java.util.Map.Entry
    public final Object getKey() {
        return this.f10290a;
    }

    @Override // N6.T, java.util.Map.Entry
    public final Object getValue() {
        Map mapO = this.f10292c.o();
        if (mapO != null) {
            return mapO.get(this.f10290a);
        }
        a();
        int i10 = this.f10291b;
        if (i10 == -1) {
            return null;
        }
        return C1358j0.m(this.f10292c, i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapO = this.f10292c.o();
        if (mapO != null) {
            return mapO.put(this.f10290a, obj);
        }
        a();
        int i10 = this.f10291b;
        if (i10 == -1) {
            this.f10292c.put(this.f10290a, obj);
            return null;
        }
        C1358j0 c1358j0 = this.f10292c;
        Object objM = C1358j0.m(c1358j0, i10);
        C1358j0.q(c1358j0, this.f10291b, obj);
        return objM;
    }
}
