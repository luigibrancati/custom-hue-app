package N6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Ea extends Ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f9712d;

    @Override // N6.Ja
    public final Ja a(boolean z10) {
        this.f9710b = true;
        this.f9712d = (byte) (1 | this.f9712d);
        return this;
    }

    @Override // N6.Ja
    public final Ja b(int i10) {
        this.f9711c = 1;
        this.f9712d = (byte) (this.f9712d | 2);
        return this;
    }

    @Override // N6.Ja
    public final Ka c() {
        String str;
        if (this.f9712d == 3 && (str = this.f9709a) != null) {
            return new Ga(str, this.f9710b, this.f9711c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f9709a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f9712d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f9712d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final Ja d(String str) {
        this.f9709a = str;
        return this;
    }
}
