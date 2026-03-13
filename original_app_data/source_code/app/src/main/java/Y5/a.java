package Y5;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f19781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f19782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f19783e;

    public a(Integer num, Object obj, f fVar, g gVar, e eVar) {
        this.f19779a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f19780b = obj;
        if (fVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f19781c = fVar;
        this.f19782d = gVar;
        this.f19783e = eVar;
    }

    @Override // Y5.d
    public Integer a() {
        return this.f19779a;
    }

    @Override // Y5.d
    public e b() {
        return this.f19783e;
    }

    @Override // Y5.d
    public Object c() {
        return this.f19780b;
    }

    @Override // Y5.d
    public f d() {
        return this.f19781c;
    }

    @Override // Y5.d
    public g e() {
        return this.f19782d;
    }

    public boolean equals(Object obj) {
        g gVar;
        e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f19779a;
            if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
                if (this.f19780b.equals(dVar.c()) && this.f19781c.equals(dVar.d()) && ((gVar = this.f19782d) != null ? gVar.equals(dVar.e()) : dVar.e() == null) && ((eVar = this.f19783e) != null ? eVar.equals(dVar.b()) : dVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f19779a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f19780b.hashCode()) * 1000003) ^ this.f19781c.hashCode()) * 1000003;
        g gVar = this.f19782d;
        int iHashCode2 = (iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        e eVar = this.f19783e;
        return iHashCode2 ^ (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f19779a + ", payload=" + this.f19780b + ", priority=" + this.f19781c + ", productData=" + this.f19782d + ", eventContext=" + this.f19783e + "}";
    }
}
