package fb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4007a {
    public static final Bitmap a(Bitmap bitmap) {
        AbstractC4862t.e(bitmap, "bitmap");
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        AbstractC4862t.b(config);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static final Bitmap b(Bitmap bitmap, int i10) {
        AbstractC4862t.e(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        AbstractC4862t.d(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
