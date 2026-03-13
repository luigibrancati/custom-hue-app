package Q;

import M.m;
import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void c(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image d(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter e(Surface surface, int i10) {
        return ImageWriter.newInstance(surface, i10);
    }

    public static void f(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }

    public static void g(ImageWriter imageWriter, final ImageWriter.OnImageReleasedListener onImageReleasedListener, final Executor executor) {
        imageWriter.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: Q.b
            @Override // android.media.ImageWriter.OnImageReleasedListener
            public final void onImageReleased(ImageWriter imageWriter2) {
                executor.execute(new Runnable() { // from class: Q.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        onImageReleasedListener.onImageReleased(imageWriter2);
                    }
                });
            }
        }, m.a());
    }
}
