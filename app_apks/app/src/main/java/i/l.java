package i;

import Y0.AbstractC2555i;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import d.w;
import h.AbstractC4262a;
import n.AbstractC5057b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends w implements InterfaceC4310c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC4312e f36741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC2555i.a f36742f;

    public l(Context context, int i10) {
        super(context, o(context, i10));
        this.f36742f = new AbstractC2555i.a() { // from class: i.k
            @Override // Y0.AbstractC2555i.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f36740a.p(keyEvent);
            }
        };
        AbstractC4312e abstractC4312eN = n();
        abstractC4312eN.K(o(context, i10));
        abstractC4312eN.w(null);
    }

    public static int o(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC4262a.f35814w, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // d.w, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        n().e(view, layoutParams);
    }

    @Override // i.InterfaceC4310c
    public AbstractC5057b b(AbstractC5057b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        n().x();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC2555i.b(this.f36742f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return n().j(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        n().t();
    }

    public AbstractC4312e n() {
        if (this.f36741e == null) {
            this.f36741e = AbstractC4312e.i(this, this);
        }
        return this.f36741e;
    }

    @Override // d.w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        n().s();
        super.onCreate(bundle);
        n().w(bundle);
    }

    @Override // d.w, android.app.Dialog
    public void onStop() {
        super.onStop();
        n().C();
    }

    public boolean p(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean q(int i10) {
        return n().F(i10);
    }

    @Override // d.w, android.app.Dialog
    public void setContentView(int i10) {
        j();
        n().G(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        n().L(charSequence);
    }

    @Override // d.w, android.app.Dialog
    public void setContentView(View view) {
        j();
        n().H(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        n().L(getContext().getString(i10));
    }

    @Override // d.w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        n().I(view, layoutParams);
    }

    @Override // i.InterfaceC4310c
    public void c(AbstractC5057b abstractC5057b) {
    }

    @Override // i.InterfaceC4310c
    public void d(AbstractC5057b abstractC5057b) {
    }
}
