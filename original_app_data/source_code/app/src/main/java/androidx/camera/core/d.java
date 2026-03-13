package androidx.camera.core;

import E.InterfaceC0787f0;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface d extends AutoCloseable {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        int a();

        int b();

        ByteBuffer e();
    }

    InterfaceC0787f0 L0();

    default Bitmap N0() {
        return T.b.a(this);
    }

    Image S0();

    @Override // java.lang.AutoCloseable
    void close();

    int getFormat();

    int getHeight();

    int getWidth();

    a[] n0();

    void setCropRect(Rect rect);
}
