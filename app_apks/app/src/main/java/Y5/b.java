package Y5;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19784a;

    public b(Integer num) {
        this.f19784a = num;
    }

    @Override // Y5.g
    public Integer a() {
        return this.f19784a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        Integer num = this.f19784a;
        return num == null ? gVar.a() == null : num.equals(gVar.a());
    }

    public int hashCode() {
        Integer num = this.f19784a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f19784a + "}";
    }
}
