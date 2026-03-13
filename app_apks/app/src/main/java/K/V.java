package K;

import E.InterfaceC0787f0;
import L.k1;
import M.h;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.d;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class V implements androidx.camera.core.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f6565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d.a[] f6566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0787f0 f6567f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f6569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f6570c;

        public a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f6568a = i10;
            this.f6569b = i11;
            this.f6570c = byteBuffer;
        }

        @Override // androidx.camera.core.d.a
        public int a() {
            return this.f6568a;
        }

        @Override // androidx.camera.core.d.a
        public int b() {
            return this.f6569b;
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer e() {
            return this.f6570c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements InterfaceC0787f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f6571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f6572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Matrix f6573c;

        public b(long j10, int i10, Matrix matrix) {
            this.f6571a = j10;
            this.f6572b = i10;
            this.f6573c = matrix;
        }

        @Override // E.InterfaceC0787f0
        public void a(h.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // E.InterfaceC0787f0
        public k1 c() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // E.InterfaceC0787f0
        public int d() {
            return this.f6572b;
        }

        @Override // E.InterfaceC0787f0
        public long getTimestamp() {
            return this.f6571a;
        }
    }

    public V(U.z zVar) {
        this((Bitmap) zVar.c(), zVar.b(), zVar.f(), zVar.g(), zVar.a().getTimestamp());
    }

    public static InterfaceC0787f0 b(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    public static d.a c(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.d
    public InterfaceC0787f0 L0() {
        InterfaceC0787f0 interfaceC0787f0;
        synchronized (this.f6562a) {
            a();
            interfaceC0787f0 = this.f6567f;
        }
        return interfaceC0787f0;
    }

    @Override // androidx.camera.core.d
    public Image S0() {
        synchronized (this.f6562a) {
            a();
        }
        return null;
    }

    public final void a() {
        synchronized (this.f6562a) {
            X0.h.j(this.f6566e != null, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f6562a) {
            a();
            this.f6566e = null;
        }
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        synchronized (this.f6562a) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        int i10;
        synchronized (this.f6562a) {
            a();
            i10 = this.f6564c;
        }
        return i10;
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        int i10;
        synchronized (this.f6562a) {
            a();
            i10 = this.f6563b;
        }
        return i10;
    }

    @Override // androidx.camera.core.d
    public d.a[] n0() {
        d.a[] aVarArr;
        synchronized (this.f6562a) {
            a();
            d.a[] aVarArr2 = this.f6566e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.d
    public void setCropRect(Rect rect) {
        synchronized (this.f6562a) {
            try {
                a();
                if (rect != null) {
                    this.f6565d.set(rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public V(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(T.b.d(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public V(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f6562a = new Object();
        this.f6563b = i11;
        this.f6564c = i12;
        this.f6565d = rect;
        this.f6567f = b(j10, i13, matrix);
        byteBuffer.rewind();
        this.f6566e = new d.a[]{c(byteBuffer, i11 * i10, i10)};
    }
}
