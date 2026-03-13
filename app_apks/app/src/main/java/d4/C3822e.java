package d4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: d4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3822e extends AbstractC3823f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f33108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4.b f33110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3822e(Drawable drawable, boolean z10, c4.b dataSource) {
        super(null);
        AbstractC4862t.e(drawable, "drawable");
        AbstractC4862t.e(dataSource, "dataSource");
        this.f33108a = drawable;
        this.f33109b = z10;
        this.f33110c = dataSource;
    }

    public static /* synthetic */ C3822e e(C3822e c3822e, Drawable drawable, boolean z10, c4.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = c3822e.f33108a;
        }
        if ((i10 & 2) != 0) {
            z10 = c3822e.f33109b;
        }
        if ((i10 & 4) != 0) {
            bVar = c3822e.f33110c;
        }
        return c3822e.d(drawable, z10, bVar);
    }

    public final Drawable a() {
        return this.f33108a;
    }

    public final boolean b() {
        return this.f33109b;
    }

    public final c4.b c() {
        return this.f33110c;
    }

    public final C3822e d(Drawable drawable, boolean z10, c4.b dataSource) {
        AbstractC4862t.e(drawable, "drawable");
        AbstractC4862t.e(dataSource, "dataSource");
        return new C3822e(drawable, z10, dataSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3822e)) {
            return false;
        }
        C3822e c3822e = (C3822e) obj;
        return AbstractC4862t.a(this.f33108a, c3822e.f33108a) && this.f33109b == c3822e.f33109b && this.f33110c == c3822e.f33110c;
    }

    public final Drawable f() {
        return this.f33108a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f33108a.hashCode() * 31;
        boolean z10 = this.f33109b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((iHashCode + r12) * 31) + this.f33110c.hashCode();
    }

    public String toString() {
        return "DrawableResult(drawable=" + this.f33108a + ", isSampled=" + this.f33109b + ", dataSource=" + this.f33110c + ')';
    }
}
