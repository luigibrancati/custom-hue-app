package N6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K1 implements Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P1 f9797b;

    public K1(int i10, P1 p12) {
        this.f9796a = i10;
        this.f9797b = p12;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return Q1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q1)) {
            return false;
        }
        Q1 q12 = (Q1) obj;
        return this.f9796a == q12.zza() && this.f9797b.equals(q12.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f9796a ^ 14552422) + (this.f9797b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f9796a + "intEncoding=" + this.f9797b + ')';
    }

    @Override // N6.Q1
    public final int zza() {
        return this.f9796a;
    }

    @Override // N6.Q1
    public final P1 zzb() {
        return this.f9797b;
    }
}
