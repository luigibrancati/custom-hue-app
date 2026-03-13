package a4;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC4862t;
import n4.AbstractC5085a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC2641a {
    @Override // a4.InterfaceC2641a
    public void b(Bitmap bitmap) {
        AbstractC4862t.e(bitmap, "bitmap");
        bitmap.recycle();
    }

    @Override // a4.InterfaceC2641a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        AbstractC4862t.e(config, "config");
        return d(i10, i11, config);
    }

    @Override // a4.InterfaceC2641a
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        AbstractC4862t.e(config, "config");
        e(config);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        AbstractC4862t.d(bitmapCreateBitmap, "createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    public final void e(Bitmap.Config config) {
        if (AbstractC5085a.d(config)) {
            throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.");
        }
    }

    @Override // a4.InterfaceC2641a
    public void a(int i10) {
    }
}
