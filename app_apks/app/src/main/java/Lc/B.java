package Lc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f8716a = new F("InvalidModuleNotifier");

    public static final void a(G g10) {
        AbstractC4862t.e(g10, "<this>");
        android.support.v4.media.session.a.a(g10.Y(f8716a));
        throw new A("Accessing invalid module descriptor " + g10);
    }
}
