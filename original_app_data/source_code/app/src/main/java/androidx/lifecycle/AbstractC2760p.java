package androidx.lifecycle;

import androidx.lifecycle.AbstractC2754j;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2760p {
    public static final void a(InterfaceC2758n interfaceC2758n, AbstractC2754j.b current, AbstractC2754j.b next) {
        AbstractC4862t.e(current, "current");
        AbstractC4862t.e(next, "next");
        if (current == AbstractC2754j.b.INITIALIZED && next == AbstractC2754j.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + AbstractC2754j.b.CREATED + "' to be moved to '" + next + "' in component " + interfaceC2758n).toString());
        }
        AbstractC2754j.b bVar = AbstractC2754j.b.DESTROYED;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + interfaceC2758n).toString());
    }
}
