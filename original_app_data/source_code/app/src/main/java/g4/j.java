package g4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.c f35450a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a4.c referenceCounter) {
        super(null);
        AbstractC4862t.e(referenceCounter, "referenceCounter");
        this.f35450a = referenceCounter;
    }

    @Override // g4.u
    public Object f(i4.n nVar, InterfaceC4988e interfaceC4988e) {
        a4.c cVar = this.f35450a;
        Drawable drawableA = nVar.a();
        BitmapDrawable bitmapDrawable = drawableA instanceof BitmapDrawable ? (BitmapDrawable) drawableA : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap != null) {
            cVar.a(bitmap, false);
        }
        return C4015H.f34254a;
    }
}
