package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import h.AbstractC4262a;
import i.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a extends l implements DialogInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AlertController f21461g;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0270a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.b f21462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21463b;

        public C0270a(Context context) {
            this(context, a.s(context, 0));
        }

        public a a() {
            a aVar = new a(this.f21462a.f21422a, this.f21463b);
            this.f21462a.a(aVar.f21461g);
            aVar.setCancelable(this.f21462a.f21439r);
            if (this.f21462a.f21439r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f21462a.f21440s);
            aVar.setOnDismissListener(this.f21462a.f21441t);
            DialogInterface.OnKeyListener onKeyListener = this.f21462a.f21442u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.f21462a.f21422a;
        }

        public C0270a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f21462a;
            bVar.f21444w = listAdapter;
            bVar.f21445x = onClickListener;
            return this;
        }

        public C0270a d(View view) {
            this.f21462a.f21428g = view;
            return this;
        }

        public C0270a e(Drawable drawable) {
            this.f21462a.f21425d = drawable;
            return this;
        }

        public C0270a f(CharSequence charSequence) {
            this.f21462a.f21429h = charSequence;
            return this;
        }

        public C0270a g(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f21462a;
            bVar.f21433l = bVar.f21422a.getText(i10);
            this.f21462a.f21435n = onClickListener;
            return this;
        }

        public C0270a h(DialogInterface.OnKeyListener onKeyListener) {
            this.f21462a.f21442u = onKeyListener;
            return this;
        }

        public C0270a i(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f21462a;
            bVar.f21430i = bVar.f21422a.getText(i10);
            this.f21462a.f21432k = onClickListener;
            return this;
        }

        public C0270a j(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f21462a;
            bVar.f21444w = listAdapter;
            bVar.f21445x = onClickListener;
            bVar.f21415I = i10;
            bVar.f21414H = true;
            return this;
        }

        public C0270a k(CharSequence charSequence) {
            this.f21462a.f21427f = charSequence;
            return this;
        }

        public C0270a(Context context, int i10) {
            this.f21462a = new AlertController.b(new ContextThemeWrapper(context, a.s(context, i10)));
            this.f21463b = i10;
        }
    }

    public a(Context context, int i10) {
        super(context, s(context, i10));
        this.f21461g = new AlertController(getContext(), this, getWindow());
    }

    public static int s(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC4262a.f35803l, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // i.l, d.w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f21461g.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f21461g.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f21461g.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public ListView r() {
        return this.f21461g.d();
    }

    @Override // i.l, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f21461g.p(charSequence);
    }
}
