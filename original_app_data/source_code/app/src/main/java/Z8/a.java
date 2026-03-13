package Z8;

import W8.e;
import a9.C2656a;
import a9.C2657b;
import a9.C2658c;
import a9.C2659d;
import a9.f;
import a9.g;
import a9.h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C2656a f20399a;

        public Z8.b a() {
            Sa.b.a(this.f20399a, C2656a.class);
            return new c(this.f20399a);
        }

        public b b(C2656a c2656a) {
            this.f20399a = (C2656a) Sa.b.b(c2656a);
            return this;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Z8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f20400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Sa.c f20401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Sa.c f20402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Sa.c f20403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Sa.c f20404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Sa.c f20405f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Sa.c f20406g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Sa.c f20407h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Sa.c f20408i;

        @Override // Z8.b
        public e a() {
            return (e) this.f20408i.get();
        }

        public final void b(C2656a c2656a) {
            this.f20401b = C2658c.a(c2656a);
            this.f20402c = a9.e.a(c2656a);
            this.f20403d = C2659d.a(c2656a);
            this.f20404e = h.a(c2656a);
            this.f20405f = f.a(c2656a);
            this.f20406g = C2657b.a(c2656a);
            g gVarA = g.a(c2656a);
            this.f20407h = gVarA;
            this.f20408i = Sa.a.a(W8.g.a(this.f20401b, this.f20402c, this.f20403d, this.f20404e, this.f20405f, this.f20406g, gVarA));
        }

        public c(C2656a c2656a) {
            this.f20400a = this;
            b(c2656a);
        }
    }

    public static b a() {
        return new b();
    }
}
