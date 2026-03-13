package O6;

/* JADX INFO: renamed from: O6.o5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1732o5 extends AbstractC1759s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11793c;

    public /* synthetic */ C1732o5(String str, boolean z10, int i10, AbstractC1718m5 abstractC1718m5) {
        this.f11791a = str;
        this.f11792b = z10;
        this.f11793c = i10;
    }

    @Override // O6.AbstractC1759s5
    public final int a() {
        return this.f11793c;
    }

    @Override // O6.AbstractC1759s5
    public final String b() {
        return this.f11791a;
    }

    @Override // O6.AbstractC1759s5
    public final boolean c() {
        return this.f11792b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1759s5) {
            AbstractC1759s5 abstractC1759s5 = (AbstractC1759s5) obj;
            if (this.f11791a.equals(abstractC1759s5.b()) && this.f11792b == abstractC1759s5.c() && this.f11793c == abstractC1759s5.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11791a.hashCode() ^ 1000003;
        return this.f11793c ^ (((iHashCode * 1000003) ^ (true != this.f11792b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f11791a + ", enableFirelog=" + this.f11792b + ", firelogEventType=" + this.f11793c + "}";
    }
}
