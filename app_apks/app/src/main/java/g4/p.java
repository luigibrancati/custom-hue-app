package g4;

import android.graphics.Bitmap;
import g4.o;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import n4.AbstractC5085a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f35492e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f35493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.c f35494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f35495d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f35496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f35497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35498c;

        public b(Bitmap bitmap, boolean z10, int i10) {
            AbstractC4862t.e(bitmap, "bitmap");
            this.f35496a = bitmap;
            this.f35497b = z10;
            this.f35498c = i10;
        }

        public final int a() {
            return this.f35498c;
        }

        @Override // g4.o.a
        public Bitmap getBitmap() {
            return this.f35496a;
        }

        @Override // g4.o.a
        public boolean isSampled() {
            return this.f35497b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends b0.t {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f35500k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10) {
            super(i10);
            this.f35500k = i10;
        }

        @Override // b0.t
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void b(boolean z10, l key, b oldValue, b bVar) {
            AbstractC4862t.e(key, "key");
            AbstractC4862t.e(oldValue, "oldValue");
            if (p.this.f35494c.b(oldValue.getBitmap())) {
                return;
            }
            p.this.f35493b.c(key, oldValue.getBitmap(), oldValue.isSampled(), oldValue.a());
        }

        @Override // b0.t
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int j(l key, b value) {
            AbstractC4862t.e(key, "key");
            AbstractC4862t.e(value, "value");
            return value.a();
        }
    }

    public p(x weakMemoryCache, a4.c referenceCounter, int i10, n4.l lVar) {
        AbstractC4862t.e(weakMemoryCache, "weakMemoryCache");
        AbstractC4862t.e(referenceCounter, "referenceCounter");
        this.f35493b = weakMemoryCache;
        this.f35494c = referenceCounter;
        this.f35495d = new c(i10);
    }

    @Override // g4.t
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                f();
            } else if (10 <= i10 && i10 < 20) {
                this.f35495d.l(h() / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g4.t
    public synchronized o.a b(l key) {
        AbstractC4862t.e(key, "key");
        return (o.a) this.f35495d.d(key);
    }

    @Override // g4.t
    public synchronized void c(l key, Bitmap bitmap, boolean z10) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(bitmap, "bitmap");
        int iA = AbstractC5085a.a(bitmap);
        if (iA > g()) {
            if (((b) this.f35495d.g(key)) == null) {
                this.f35493b.c(key, bitmap, z10, iA);
            }
        } else {
            this.f35494c.c(bitmap);
            this.f35495d.f(key, new b(bitmap, z10, iA));
        }
    }

    public synchronized void f() {
        this.f35495d.l(-1);
    }

    public int g() {
        return this.f35495d.e();
    }

    public int h() {
        return this.f35495d.i();
    }
}
