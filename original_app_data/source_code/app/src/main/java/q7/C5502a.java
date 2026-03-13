package q7;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import s7.g;
import s7.k;
import s7.n;

/* JADX INFO: renamed from: q7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5502a extends Drawable implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f43285a;

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5502a mutate() {
        this.f43285a = new b(this.f43285a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f43285a;
        if (bVar.f43287b) {
            bVar.f43286a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f43285a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f43285a.f43286a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43285a.f43286a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f43285a.f43286a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = AbstractC5503b.b(iArr);
        b bVar = this.f43285a;
        if (bVar.f43287b == zB) {
            return zOnStateChange;
        }
        bVar.f43287b = zB;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f43285a.f43286a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f43285a.f43286a.setColorFilter(colorFilter);
    }

    @Override // s7.n
    public void setShapeAppearanceModel(k kVar) {
        this.f43285a.f43286a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f43285a.f43286a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f43285a.f43286a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f43285a.f43286a.setTintMode(mode);
    }

    public C5502a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* JADX INFO: renamed from: q7.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f43286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f43287b;

        public b(g gVar) {
            this.f43286a = gVar;
            this.f43287b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5502a newDrawable() {
            return new C5502a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f43286a = (g) bVar.f43286a.getConstantState().newDrawable();
            this.f43287b = bVar.f43287b;
        }
    }

    public C5502a(b bVar) {
        this.f43285a = bVar;
    }
}
