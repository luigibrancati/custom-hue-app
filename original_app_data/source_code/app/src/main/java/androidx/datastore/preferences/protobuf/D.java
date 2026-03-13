package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f22718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22720c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0.b f22721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f22722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l0.b f22723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f22724d;

        public a(l0.b bVar, Object obj, l0.b bVar2, Object obj2) {
            this.f22721a = bVar;
            this.f22722b = obj;
            this.f22723c = bVar2;
            this.f22724d = obj2;
        }
    }

    public D(l0.b bVar, Object obj, l0.b bVar2, Object obj2) {
        this.f22718a = new a(bVar, obj, bVar2, obj2);
        this.f22719b = obj;
        this.f22720c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C2711q.b(aVar.f22721a, 1, obj) + C2711q.b(aVar.f22723c, 2, obj2);
    }

    public static D d(l0.b bVar, Object obj, l0.b bVar2, Object obj2) {
        return new D(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC2703i abstractC2703i, a aVar, Object obj, Object obj2) {
        C2711q.w(abstractC2703i, aVar.f22721a, 1, obj);
        C2711q.w(abstractC2703i, aVar.f22723c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC2703i.R(i10) + AbstractC2703i.B(b(this.f22718a, obj, obj2));
    }

    public a c() {
        return this.f22718a;
    }
}
