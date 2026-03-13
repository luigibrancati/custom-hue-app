package Y;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f19508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f19509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f19510c;

    public b(Rect cropRectBeforeScaling, Size childSizeToScale, Size originalSelectedChildSize) {
        AbstractC4862t.e(cropRectBeforeScaling, "cropRectBeforeScaling");
        AbstractC4862t.e(childSizeToScale, "childSizeToScale");
        AbstractC4862t.e(originalSelectedChildSize, "originalSelectedChildSize");
        this.f19508a = cropRectBeforeScaling;
        this.f19509b = childSizeToScale;
        this.f19510c = originalSelectedChildSize;
    }

    public final Size a() {
        return this.f19509b;
    }

    public final Rect b() {
        return this.f19508a;
    }

    public final Size c() {
        return this.f19510c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC4862t.a(this.f19508a, bVar.f19508a) && AbstractC4862t.a(this.f19509b, bVar.f19509b) && AbstractC4862t.a(this.f19510c, bVar.f19510c);
    }

    public int hashCode() {
        return (((this.f19508a.hashCode() * 31) + this.f19509b.hashCode()) * 31) + this.f19510c.hashCode();
    }

    public String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f19508a + ", childSizeToScale=" + this.f19509b + ", originalSelectedChildSize=" + this.f19510c + ')';
    }
}
