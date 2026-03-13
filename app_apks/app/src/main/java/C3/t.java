package C3;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3.b f1144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1145b;

    public t(z3.b _bounds, float f10) {
        AbstractC4862t.e(_bounds, "_bounds");
        this.f1144a = _bounds;
        this.f1145b = f10;
    }

    public final Rect a() {
        return this.f1144a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC4862t.a(t.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        t tVar = (t) obj;
        return AbstractC4862t.a(this.f1144a, tVar.f1144a) && this.f1145b == tVar.f1145b;
    }

    public int hashCode() {
        return (this.f1144a.hashCode() * 31) + Float.hashCode(this.f1145b);
    }

    public String toString() {
        return "WindowMetrics(_bounds=" + this.f1144a + ", density=" + this.f1145b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(Rect bounds, float f10) {
        this(new z3.b(bounds), f10);
        AbstractC4862t.e(bounds, "bounds");
    }
}
