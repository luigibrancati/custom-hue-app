package a4;

import android.graphics.Bitmap;
import gc.T;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import n4.AbstractC5085a;
import n4.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC2641a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f20941j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set f20942k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f20944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f20945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f20946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20951i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    static {
        Set setB = T.b();
        setB.add(Bitmap.Config.ALPHA_8);
        setB.add(Bitmap.Config.RGB_565);
        setB.add(Bitmap.Config.ARGB_4444);
        setB.add(Bitmap.Config.ARGB_8888);
        setB.add(Bitmap.Config.RGBA_F16);
        f20942k = T.a(setB);
    }

    public f(int i10, Set allowedConfigs, b strategy, l lVar) {
        AbstractC4862t.e(allowedConfigs, "allowedConfigs");
        AbstractC4862t.e(strategy, "strategy");
        this.f20943a = i10;
        this.f20944b = allowedConfigs;
        this.f20945c = strategy;
        this.f20946d = new HashSet();
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("maxSize must be >= 0.");
        }
    }

    @Override // a4.InterfaceC2641a
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                e();
            } else if (10 <= i10 && i10 < 20) {
                i(this.f20947e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // a4.InterfaceC2641a
    public synchronized void b(Bitmap bitmap) {
        AbstractC4862t.e(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            return;
        }
        int iA = AbstractC5085a.a(bitmap);
        if (bitmap.isMutable() && iA <= this.f20943a && this.f20944b.contains(bitmap.getConfig())) {
            if (this.f20946d.contains(bitmap)) {
                return;
            }
            this.f20945c.b(bitmap);
            this.f20946d.add(bitmap);
            this.f20947e += iA;
            this.f20950h++;
            i(this.f20943a);
            return;
        }
        bitmap.recycle();
    }

    @Override // a4.InterfaceC2641a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        AbstractC4862t.e(config, "config");
        Bitmap bitmapG = g(i10, i11, config);
        if (bitmapG != null) {
            return bitmapG;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        AbstractC4862t.d(bitmapCreateBitmap, "createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    @Override // a4.InterfaceC2641a
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        AbstractC4862t.e(config, "config");
        Bitmap bitmapF = f(i10, i11, config);
        if (bitmapF != null) {
            return bitmapF;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        AbstractC4862t.d(bitmapCreateBitmap, "createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    public final void e() {
        i(-1);
    }

    public synchronized Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapC;
        try {
            AbstractC4862t.e(config, "config");
            if (AbstractC5085a.d(config)) {
                throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.");
            }
            bitmapC = this.f20945c.c(i10, i11, config);
            if (bitmapC == null) {
                this.f20949g++;
            } else {
                this.f20946d.remove(bitmapC);
                this.f20947e -= AbstractC5085a.a(bitmapC);
                this.f20948f++;
                h(bitmapC);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapC;
    }

    public Bitmap g(int i10, int i11, Bitmap.Config config) {
        AbstractC4862t.e(config, "config");
        Bitmap bitmapF = f(i10, i11, config);
        if (bitmapF == null) {
            return null;
        }
        bitmapF.eraseColor(0);
        return bitmapF;
    }

    public final void h(Bitmap bitmap) {
        bitmap.setDensity(0);
        bitmap.setHasAlpha(true);
        bitmap.setPremultiplied(true);
    }

    public final synchronized void i(int i10) {
        while (this.f20947e > i10) {
            Bitmap bitmapRemoveLast = this.f20945c.removeLast();
            if (bitmapRemoveLast == null) {
                this.f20947e = 0;
                return;
            }
            this.f20946d.remove(bitmapRemoveLast);
            this.f20947e -= AbstractC5085a.a(bitmapRemoveLast);
            this.f20951i++;
            bitmapRemoveLast.recycle();
        }
    }

    public /* synthetic */ f(int i10, Set set, b bVar, l lVar, int i11, AbstractC4854k abstractC4854k) {
        this(i10, (i11 & 2) != 0 ? f20942k : set, (i11 & 4) != 0 ? b.f20938a.a() : bVar, (i11 & 8) != 0 ? null : lVar);
    }
}
