package i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import n.AbstractC5057b;

/* JADX INFO: renamed from: i.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4308a {
    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract int i();

    public Context j() {
        return null;
    }

    public boolean k() {
        return false;
    }

    public boolean n(int i10, KeyEvent keyEvent) {
        return false;
    }

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public AbstractC5057b t(AbstractC5057b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: i.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0477a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36620a;

        public C0477a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f36620a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f36141t);
            this.f36620a = typedArrayObtainStyledAttributes.getInt(h.j.f36146u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0477a(int i10, int i11) {
            super(i10, i11);
            this.f36620a = 8388627;
        }

        public C0477a(C0477a c0477a) {
            super((ViewGroup.MarginLayoutParams) c0477a);
            this.f36620a = 0;
            this.f36620a = c0477a.f36620a;
        }

        public C0477a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36620a = 0;
        }
    }

    public void m() {
    }

    public void h(boolean z10) {
    }

    public void l(Configuration configuration) {
    }

    public void q(boolean z10) {
    }

    public void r(boolean z10) {
    }

    public void s(CharSequence charSequence) {
    }
}
