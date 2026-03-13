package U6;

/* JADX INFO: renamed from: U6.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2286m extends C2292t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16690c;

    public C2286m(float f10) {
        super(2, Float.valueOf(Math.max(f10, 0.0f)));
        this.f16690c = Math.max(f10, 0.0f);
    }

    @Override // U6.C2292t
    public String toString() {
        return "[Gap: length=" + this.f16690c + "]";
    }
}
