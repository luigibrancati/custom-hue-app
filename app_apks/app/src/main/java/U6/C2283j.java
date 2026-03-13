package U6;

/* JADX INFO: renamed from: U6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2283j extends C2292t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16685c;

    public C2283j(float f10) {
        super(0, Float.valueOf(Math.max(f10, 0.0f)));
        this.f16685c = Math.max(f10, 0.0f);
    }

    @Override // U6.C2292t
    public String toString() {
        return "[Dash: length=" + this.f16685c + "]";
    }
}
