package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.i;

/* JADX INFO: renamed from: p.G, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5328G {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, i.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    int j();

    Y0.M k(int i10, long j10);

    void l(boolean z10);

    void m();

    void n(boolean z10);

    void o();

    void p(androidx.appcompat.widget.c cVar);

    void q(int i10);

    void r(int i10);

    int s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();
}
