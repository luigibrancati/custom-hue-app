package c4;

import a4.InterfaceC2641a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j4.AbstractC4689h;
import j4.C4683b;
import j4.C4684c;
import j4.EnumC4688g;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import n4.AbstractC5085a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25609b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2641a f25610a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public f(InterfaceC2641a bitmapPool) {
        AbstractC4862t.e(bitmapPool, "bitmapPool");
        this.f25610a = bitmapPool;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, AbstractC4689h size, EnumC4688g scale, boolean z10) {
        AbstractC4862t.e(drawable, "drawable");
        AbstractC4862t.e(config, "config");
        AbstractC4862t.e(size, "size");
        AbstractC4862t.e(scale, "scale");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            AbstractC4862t.d(bitmap, "bitmap");
            if (b(bitmap, config) && c(z10, size, bitmap, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        AbstractC4862t.d(drawableMutate, "drawable.mutate()");
        int i10 = n4.e.i(drawableMutate);
        if (i10 <= 0) {
            i10 = 512;
        }
        int iD = n4.e.d(drawableMutate);
        C4684c c4684cB = d.b(i10, iD > 0 ? iD : 512, size, scale);
        int iA = c4684cB.a();
        int iB = c4684cB.b();
        Bitmap bitmapC = this.f25610a.c(iA, iB, AbstractC5085a.e(config));
        Rect bounds = drawableMutate.getBounds();
        AbstractC4862t.d(bounds, "bounds");
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iA, iB);
        drawableMutate.draw(new Canvas(bitmapC));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapC;
    }

    public final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == AbstractC5085a.e(config);
    }

    public final boolean c(boolean z10, AbstractC4689h abstractC4689h, Bitmap bitmap, EnumC4688g enumC4688g) {
        return z10 || (abstractC4689h instanceof C4683b) || AbstractC4862t.a(abstractC4689h, d.b(bitmap.getWidth(), bitmap.getHeight(), abstractC4689h, enumC4688g));
    }
}
