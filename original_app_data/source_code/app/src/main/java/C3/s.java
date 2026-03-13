package C3;

import gc.C4179C;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1143a;

    public s(List displayFeatures) {
        AbstractC4862t.e(displayFeatures, "displayFeatures");
        this.f1143a = displayFeatures;
    }

    public final List a() {
        return this.f1143a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC4862t.a(s.class, obj.getClass())) {
            return false;
        }
        return AbstractC4862t.a(this.f1143a, ((s) obj).f1143a);
    }

    public int hashCode() {
        return this.f1143a.hashCode();
    }

    public String toString() {
        return C4179C.q0(this.f1143a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
