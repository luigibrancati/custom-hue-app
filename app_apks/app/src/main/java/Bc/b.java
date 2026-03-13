package Bc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f790b;

    public b(float f10, float f11) {
        this.f789a = f10;
        this.f790b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Bc.c
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    public boolean b(float f10) {
        return f10 >= this.f789a && f10 <= this.f790b;
    }

    public boolean c() {
        return this.f789a > this.f790b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (c() && ((b) obj).c()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f789a == bVar.f789a && this.f790b == bVar.f790b;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (Float.hashCode(this.f789a) * 31) + Float.hashCode(this.f790b);
    }

    public String toString() {
        return this.f789a + ".." + this.f790b;
    }
}
