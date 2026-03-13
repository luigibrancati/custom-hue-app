package Y0;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: Y0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2548b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f19640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0246b f19641c;

    /* JADX INFO: renamed from: Y0.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
    }

    /* JADX INFO: renamed from: Y0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0246b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC2548b(Context context) {
        this.f19639a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f19641c = null;
        this.f19640b = null;
    }

    public void h(a aVar) {
        this.f19640b = aVar;
    }

    public abstract void i(InterfaceC0246b interfaceC0246b);
}
