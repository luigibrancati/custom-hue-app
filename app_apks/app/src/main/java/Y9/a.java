package Y9;

import O6.G5;
import O6.I5;
import R9.InterfaceC2110h;
import Z9.c;
import Z9.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a implements InterfaceC2110h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Bitmap f19860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ByteBuffer f19861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile b f19862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f19867h;

    public a(Bitmap bitmap, int i10) {
        this.f19860a = (Bitmap) AbstractC6056k.l(bitmap);
        this.f19863d = bitmap.getWidth();
        this.f19864e = bitmap.getHeight();
        m(i10);
        this.f19865f = i10;
        this.f19866g = -1;
        this.f19867h = null;
    }

    public static a a(Bitmap bitmap, int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(bitmap, i10);
        o(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i10);
        return aVar;
    }

    public static a b(Context context, Uri uri) throws IOException {
        AbstractC6056k.m(context, "Please provide a valid Context");
        AbstractC6056k.m(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapE = d.b().e(context.getContentResolver(), uri);
        a aVar = new a(bitmapE, 0);
        o(-1, 4, jElapsedRealtime, bitmapE.getHeight(), bitmapE.getWidth(), bitmapE.getAllocationByteCount(), 0);
        return aVar;
    }

    public static a c(Image image, int i10) {
        return n(image, i10, null);
    }

    public static int m(int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180) {
            if (i10 == 270) {
                i10 = 270;
            } else {
                z10 = false;
            }
        }
        AbstractC6056k.b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i10;
    }

    public static a n(Image image, int i10, Matrix matrix) {
        Image image2;
        int i11;
        int iLimit;
        a aVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AbstractC6056k.m(image, "Please provide a valid image");
        m(i10);
        boolean z10 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z10 = false;
        }
        AbstractC6056k.b(z10, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i11 = i10;
            aVar = new a(c.d().b(image, i10), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i11 = i10;
            a aVar2 = new a(image2, image.getWidth(), image.getHeight(), i11, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            aVar = aVar2;
        }
        o(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i11);
        return aVar;
    }

    public static void o(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        I5.a(G5.b("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    public Bitmap d() {
        return this.f19860a;
    }

    public ByteBuffer e() {
        return this.f19861b;
    }

    public Matrix f() {
        return this.f19867h;
    }

    public int g() {
        return this.f19866g;
    }

    public int h() {
        return this.f19864e;
    }

    public Image i() {
        if (this.f19862c == null) {
            return null;
        }
        return this.f19862c.a();
    }

    public Image.Plane[] j() {
        if (this.f19862c == null) {
            return null;
        }
        return this.f19862c.b();
    }

    public int k() {
        return this.f19865f;
    }

    public int l() {
        return this.f19863d;
    }

    public a(Image image, int i10, int i11, int i12, Matrix matrix) {
        AbstractC6056k.l(image);
        this.f19862c = new b(image);
        this.f19863d = i10;
        this.f19864e = i11;
        m(i12);
        this.f19865f = i12;
        this.f19866g = 35;
        this.f19867h = matrix;
    }
}
