package d;

import androidx.lifecycle.InterfaceC2758n;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: d.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3786E extends S2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3785D f32715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2758n f32716b;

    public C3786E(AbstractC3785D callback, InterfaceC2758n interfaceC2758n) {
        AbstractC4862t.e(callback, "callback");
        this.f32715a = callback;
        this.f32716b = interfaceC2758n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3786E)) {
            return false;
        }
        C3786E c3786e = (C3786E) obj;
        return AbstractC4862t.a(this.f32715a, c3786e.f32715a) && AbstractC4862t.a(this.f32716b, c3786e.f32716b);
    }

    public int hashCode() {
        int iHashCode = this.f32715a.hashCode() * 31;
        InterfaceC2758n interfaceC2758n = this.f32716b;
        return iHashCode + (interfaceC2758n == null ? 0 : interfaceC2758n.hashCode());
    }

    public String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f32715a + ", owner=" + this.f32716b + ')';
    }

    public /* synthetic */ C3786E(AbstractC3785D abstractC3785D, InterfaceC2758n interfaceC2758n, int i10, AbstractC4854k abstractC4854k) {
        this(abstractC3785D, (i10 & 2) != 0 ? null : interfaceC2758n);
    }
}
