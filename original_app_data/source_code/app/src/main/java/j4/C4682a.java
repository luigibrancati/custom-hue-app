package j4;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: j4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4682a implements InterfaceC4690i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f38975c;

    public C4682a(Context context) {
        AbstractC4862t.e(context, "context");
        this.f38975c = context;
    }

    @Override // j4.InterfaceC4690i
    public Object a(InterfaceC4988e interfaceC4988e) {
        DisplayMetrics displayMetrics = this.f38975c.getResources().getDisplayMetrics();
        return new C4684c(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C4682a) && AbstractC4862t.a(this.f38975c, ((C4682a) obj).f38975c);
        }
        return true;
    }

    public int hashCode() {
        return this.f38975c.hashCode();
    }

    public String toString() {
        return "DisplaySizeResolver(context=" + this.f38975c + ')';
    }
}
