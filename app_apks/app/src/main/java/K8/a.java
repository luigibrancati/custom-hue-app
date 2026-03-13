package K8;

import K8.d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d.a f7751b = d.a.DEFAULT;

    /* JADX INFO: renamed from: K8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0121a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d.a f7753b;

        public C0121a(int i10, d.a aVar) {
            this.f7752a = i10;
            this.f7753b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f7752a == dVar.tag() && this.f7753b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f7752a) + (this.f7753b.hashCode() ^ 2041407134);
        }

        @Override // K8.d
        public d.a intEncoding() {
            return this.f7753b;
        }

        @Override // K8.d
        public int tag() {
            return this.f7752a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7752a + "intEncoding=" + this.f7753b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0121a(this.f7750a, this.f7751b);
    }

    public a c(int i10) {
        this.f7750a = i10;
        return this;
    }
}
