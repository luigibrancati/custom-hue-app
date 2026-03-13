package j4;

import android.view.View;
import j4.InterfaceC4691j;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: j4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4687f implements InterfaceC4691j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f38980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38981d;

    public C4687f(View view, boolean z10) {
        AbstractC4862t.e(view, "view");
        this.f38980c = view;
        this.f38981d = z10;
    }

    @Override // j4.InterfaceC4690i
    public Object a(InterfaceC4988e interfaceC4988e) {
        return InterfaceC4691j.b.h(this, interfaceC4988e);
    }

    @Override // j4.InterfaceC4691j
    public boolean b() {
        return this.f38981d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4687f)) {
            return false;
        }
        C4687f c4687f = (C4687f) obj;
        return AbstractC4862t.a(getView(), c4687f.getView()) && b() == c4687f.b();
    }

    @Override // j4.InterfaceC4691j
    public View getView() {
        return this.f38980c;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(b());
    }

    public String toString() {
        return "RealViewSizeResolver(view=" + getView() + ", subtractPadding=" + b() + ')';
    }
}
