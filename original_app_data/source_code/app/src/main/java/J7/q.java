package J7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6298a;

    public q(Object obj) {
        this.f6298a = obj;
    }

    @Override // J7.k
    public Object b() {
        return this.f6298a;
    }

    @Override // J7.k
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f6298a.equals(((q) obj).f6298a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6298a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f6298a + ")";
    }
}
