package M6;

/* JADX INFO: renamed from: M6.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1233y extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f9363d;

    @Override // M6.D
    public final D a(boolean z10) {
        this.f9361b = true;
        this.f9363d = (byte) (1 | this.f9363d);
        return this;
    }

    @Override // M6.D
    public final D b(int i10) {
        this.f9362c = 1;
        this.f9363d = (byte) (this.f9363d | 2);
        return this;
    }

    @Override // M6.D
    public final E c() {
        String str;
        if (this.f9363d == 3 && (str = this.f9360a) != null) {
            return new A(str, this.f9361b, this.f9362c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f9360a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f9363d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f9363d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final D d(String str) {
        this.f9360a = "common";
        return this;
    }
}
