package com.google.protobuf;

import com.google.protobuf.Q0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f32208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32210c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q0.b f32211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f32212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Q0.b f32213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f32214d;

        public a(Q0.b bVar, Object obj, Q0.b bVar2, Object obj2) {
            this.f32211a = bVar;
            this.f32212b = obj;
            this.f32213c = bVar2;
            this.f32214d = obj2;
        }
    }

    public Z(Q0.b bVar, Object obj, Q0.b bVar2, Object obj2) {
        this.f32208a = new a(bVar, obj, bVar2, obj2);
        this.f32209b = obj;
        this.f32210c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return I.d(aVar.f32211a, 1, obj) + I.d(aVar.f32213c, 2, obj2);
    }

    public static Z d(Q0.b bVar, Object obj, Q0.b bVar2, Object obj2) {
        return new Z(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC3728m abstractC3728m, a aVar, Object obj, Object obj2) {
        I.E(abstractC3728m, aVar.f32211a, 1, obj);
        I.E(abstractC3728m, aVar.f32213c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC3728m.U(i10) + AbstractC3728m.C(b(this.f32208a, obj, obj2));
    }

    public a c() {
        return this.f32208a;
    }
}
