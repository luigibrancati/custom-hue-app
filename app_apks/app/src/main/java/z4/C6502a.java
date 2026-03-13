package z4;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: z4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6502a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f48743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC6503b f48744b;

    public C6502a(WeakReference activity, EnumC6503b type) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(type, "type");
        this.f48743a = activity;
        this.f48744b = type;
    }

    public final WeakReference a() {
        return this.f48743a;
    }

    public final EnumC6503b b() {
        return this.f48744b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6502a)) {
            return false;
        }
        C6502a c6502a = (C6502a) obj;
        return AbstractC4862t.a(this.f48743a, c6502a.f48743a) && this.f48744b == c6502a.f48744b;
    }

    public int hashCode() {
        return (this.f48743a.hashCode() * 31) + this.f48744b.hashCode();
    }

    public String toString() {
        return "ActivityCallbackEvent(activity=" + this.f48743a + ", type=" + this.f48744b + ')';
    }
}
