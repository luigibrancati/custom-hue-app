package O0;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f10745e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10749d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f10746a = i10;
        this.f10747b = i11;
        this.f10748c = i12;
        this.f10749d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10746a, bVar2.f10746a), Math.max(bVar.f10747b, bVar2.f10747b), Math.max(bVar.f10748c, bVar2.f10748c), Math.max(bVar.f10749d, bVar2.f10749d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f10745e : new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets d() {
        return a.a(this.f10746a, this.f10747b, this.f10748c, this.f10749d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10749d == bVar.f10749d && this.f10746a == bVar.f10746a && this.f10748c == bVar.f10748c && this.f10747b == bVar.f10747b;
    }

    public int hashCode() {
        return (((((this.f10746a * 31) + this.f10747b) * 31) + this.f10748c) * 31) + this.f10749d;
    }

    public String toString() {
        return "Insets{left=" + this.f10746a + ", top=" + this.f10747b + ", right=" + this.f10748c + ", bottom=" + this.f10749d + '}';
    }
}
