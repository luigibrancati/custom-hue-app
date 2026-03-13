package z3;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48704e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f48705f = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48709d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f48706a = i10;
        this.f48707b = i11;
        this.f48708c = i12;
        this.f48709d = i13;
        if (i10 > i12) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i10 + ", right: " + i12).toString());
        }
        if (i11 <= i13) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i11 + ", bottom: " + i13).toString());
    }

    public final int a() {
        return this.f48709d - this.f48707b;
    }

    public final int b() {
        return this.f48706a;
    }

    public final int c() {
        return this.f48707b;
    }

    public final int d() {
        return this.f48708c - this.f48706a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC4862t.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f48706a == bVar.f48706a && this.f48707b == bVar.f48707b && this.f48708c == bVar.f48708c && this.f48709d == bVar.f48709d;
    }

    public final Rect f() {
        return new Rect(this.f48706a, this.f48707b, this.f48708c, this.f48709d);
    }

    public int hashCode() {
        return (((((this.f48706a * 31) + this.f48707b) * 31) + this.f48708c) * 31) + this.f48709d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f48706a + ',' + this.f48707b + ',' + this.f48708c + ',' + this.f48709d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        AbstractC4862t.e(rect, "rect");
    }
}
