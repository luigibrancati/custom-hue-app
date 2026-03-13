package N7;

import J7.n;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f10583d = new f(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f10585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10586c;

    public f(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static f a(int[] iArr) {
        return iArr.length == 0 ? f10583d : new f(Arrays.copyOf(iArr, iArr.length));
    }

    public static f e() {
        return f10583d;
    }

    public int b(int i10) {
        n.h(i10, d());
        return this.f10584a[this.f10585b + i10];
    }

    public boolean c() {
        return this.f10586c == this.f10585b;
    }

    public int d() {
        return this.f10586c - this.f10585b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (d() != fVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (b(i10) != fVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iJ = 1;
        for (int i10 = this.f10585b; i10 < this.f10586c; i10++) {
            iJ = (iJ * 31) + g.j(this.f10584a[i10]);
        }
        return iJ;
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(d() * 5);
        sb2.append('[');
        sb2.append(this.f10584a[this.f10585b]);
        int i10 = this.f10585b;
        while (true) {
            i10++;
            if (i10 >= this.f10586c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f10584a[i10]);
        }
    }

    public f(int[] iArr, int i10, int i11) {
        this.f10584a = iArr;
        this.f10585b = i10;
        this.f10586c = i11;
    }
}
