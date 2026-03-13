package a4;

import android.graphics.Bitmap;
import b4.C2811a;
import gc.Q;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import n4.AbstractC5085a;
import n4.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20963d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2811a f20964b = new C2811a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeMap f20965c = new TreeMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public final void a(int i10) {
        int iIntValue = ((Number) Q.j(this.f20965c, Integer.valueOf(i10))).intValue();
        if (iIntValue == 1) {
            this.f20965c.remove(Integer.valueOf(i10));
        } else {
            this.f20965c.put(Integer.valueOf(i10), Integer.valueOf(iIntValue - 1));
        }
    }

    @Override // a4.b
    public void b(Bitmap bitmap) {
        AbstractC4862t.e(bitmap, "bitmap");
        int iA = AbstractC5085a.a(bitmap);
        this.f20964b.d(Integer.valueOf(iA), bitmap);
        Integer num = (Integer) this.f20965c.get(Integer.valueOf(iA));
        this.f20965c.put(Integer.valueOf(iA), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // a4.b
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        AbstractC4862t.e(config, "config");
        int iA = n.f40574a.a(i10, i11, config);
        Integer num = (Integer) this.f20965c.ceilingKey(Integer.valueOf(iA));
        if (num != null) {
            if (num.intValue() > iA * 4) {
                num = null;
            }
            if (num != null) {
                iA = num.intValue();
            }
        }
        Bitmap bitmap = (Bitmap) this.f20964b.g(Integer.valueOf(iA));
        if (bitmap != null) {
            a(iA);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // a4.b
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f20964b.f();
        if (bitmap != null) {
            a(bitmap.getAllocationByteCount());
        }
        return bitmap;
    }

    public String toString() {
        return "SizeStrategy: entries=" + this.f20964b + ", sizes=" + this.f20965c;
    }
}
