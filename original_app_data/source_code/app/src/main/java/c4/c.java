package c4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f25596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25597b;

    public c(Drawable drawable, boolean z10) {
        AbstractC4862t.e(drawable, "drawable");
        this.f25596a = drawable;
        this.f25597b = z10;
    }

    public final Drawable a() {
        return this.f25596a;
    }

    public final boolean b() {
        return this.f25597b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC4862t.a(this.f25596a, cVar.f25596a) && this.f25597b == cVar.f25597b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = this.f25596a.hashCode() * 31;
        boolean z10 = this.f25597b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return "DecodeResult(drawable=" + this.f25596a + ", isSampled=" + this.f25597b + ')';
    }
}
