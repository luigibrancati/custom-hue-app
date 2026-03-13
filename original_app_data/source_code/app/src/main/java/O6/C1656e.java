package O6;

/* JADX INFO: renamed from: O6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1656e implements InterfaceC1691j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC1684i f11601b;

    public C1656e(int i10, EnumC1684i enumC1684i) {
        this.f11600a = i10;
        this.f11601b = enumC1684i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC1691j.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1691j)) {
            return false;
        }
        InterfaceC1691j interfaceC1691j = (InterfaceC1691j) obj;
        return this.f11600a == interfaceC1691j.zza() && this.f11601b.equals(interfaceC1691j.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f11600a ^ 14552422) + (this.f11601b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f11600a + "intEncoding=" + this.f11601b + ')';
    }

    @Override // O6.InterfaceC1691j
    public final int zza() {
        return this.f11600a;
    }

    @Override // O6.InterfaceC1691j
    public final EnumC1684i zzb() {
        return this.f11601b;
    }
}
