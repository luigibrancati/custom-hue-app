package androidx.camera.core;

import E.AbstractC0801m0;
import E.InterfaceC0787f0;
import L.k1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.d;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f21978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0275a[] f21979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0787f0 f21980c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0275a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image.Plane f21981a;

        public C0275a(Image.Plane plane) {
            this.f21981a = plane;
        }

        @Override // androidx.camera.core.d.a
        public int a() {
            return this.f21981a.getRowStride();
        }

        @Override // androidx.camera.core.d.a
        public int b() {
            return this.f21981a.getPixelStride();
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer e() {
            return this.f21981a.getBuffer();
        }
    }

    public a(Image image) {
        this.f21978a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f21979b = new C0275a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f21979b[i10] = new C0275a(planes[i10]);
            }
        } else {
            this.f21979b = new C0275a[0];
        }
        this.f21980c = AbstractC0801m0.e(k1.b(), image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.d
    public InterfaceC0787f0 L0() {
        return this.f21980c;
    }

    @Override // androidx.camera.core.d
    public Image S0() {
        return this.f21978a;
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        this.f21978a.close();
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        return this.f21978a.getFormat();
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        return this.f21978a.getHeight();
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        return this.f21978a.getWidth();
    }

    @Override // androidx.camera.core.d
    public d.a[] n0() {
        return this.f21979b;
    }

    @Override // androidx.camera.core.d
    public void setCropRect(Rect rect) {
        this.f21978a.setCropRect(rect);
    }
}
