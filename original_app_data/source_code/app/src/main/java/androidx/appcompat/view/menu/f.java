package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f21587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.a f21588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f21589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i.a f21590d;

    public f(e eVar) {
        this.f21587a = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.f21588b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f21587a) {
            a();
        }
        i.a aVar = this.f21590d;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean c(e eVar) {
        i.a aVar = this.f21590d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f21587a;
        a.C0270a c0270a = new a.C0270a(eVar.u());
        c cVar = new c(c0270a.b(), h.g.f35917j);
        this.f21589c = cVar;
        cVar.d(this);
        this.f21587a.b(this.f21589c);
        c0270a.c(this.f21589c.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            c0270a.d(viewY);
        } else {
            c0270a.e(eVar.w()).k(eVar.x());
        }
        c0270a.h(this);
        androidx.appcompat.app.a aVarA = c0270a.a();
        this.f21588b = aVarA;
        aVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f21588b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f21588b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f21587a.M((g) this.f21589c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f21589c.b(this.f21587a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f21588b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f21588b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f21587a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f21587a.performShortcut(i10, keyEvent, 0);
    }
}
