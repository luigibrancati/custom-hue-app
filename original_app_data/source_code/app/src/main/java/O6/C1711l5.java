package O6;

/* JADX INFO: renamed from: O6.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1711l5 extends AbstractC1752r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f11738d;

    @Override // O6.AbstractC1752r5
    public final AbstractC1752r5 a(boolean z10) {
        this.f11736b = true;
        this.f11738d = (byte) (1 | this.f11738d);
        return this;
    }

    @Override // O6.AbstractC1752r5
    public final AbstractC1752r5 b(int i10) {
        this.f11737c = 1;
        this.f11738d = (byte) (this.f11738d | 2);
        return this;
    }

    @Override // O6.AbstractC1752r5
    public final AbstractC1759s5 c() {
        String str;
        if (this.f11738d == 3 && (str = this.f11735a) != null) {
            return new C1732o5(str, this.f11736b, this.f11737c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f11735a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f11738d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f11738d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final AbstractC1752r5 d(String str) {
        this.f11735a = "vision-common";
        return this;
    }
}
