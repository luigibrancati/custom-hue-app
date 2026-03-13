package Fc;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ClassLoader f3855c;

    public M(ClassLoader classLoader) {
        AbstractC4862t.e(classLoader, "classLoader");
        this.f3853a = new WeakReference(classLoader);
        this.f3854b = System.identityHashCode(classLoader);
        this.f3855c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f3855c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof M) && this.f3853a.get() == ((M) obj).f3853a.get();
    }

    public int hashCode() {
        return this.f3854b;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f3853a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
