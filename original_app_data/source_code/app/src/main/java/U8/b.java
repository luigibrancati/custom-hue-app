package U8;

import com.google.firebase.messaging.N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f16798b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U8.a f16799a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public U8.a f16800a = null;

        public b a() {
            return new b(this.f16800a);
        }

        public a b(U8.a aVar) {
            this.f16800a = aVar;
            return this;
        }
    }

    public b(U8.a aVar) {
        this.f16799a = aVar;
    }

    public static a b() {
        return new a();
    }

    public U8.a a() {
        return this.f16799a;
    }

    public byte[] c() {
        return N.a(this);
    }
}
