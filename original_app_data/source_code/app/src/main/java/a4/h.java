package a4;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import b0.K;
import g4.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import n4.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20954e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Handler f20955f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f20956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2641a f20957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K f20958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20959d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f20960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f20962c;

        public b(WeakReference bitmap, int i10, boolean z10) {
            AbstractC4862t.e(bitmap, "bitmap");
            this.f20960a = bitmap;
            this.f20961b = i10;
            this.f20962c = z10;
        }

        public final WeakReference a() {
            return this.f20960a;
        }

        public final int b() {
            return this.f20961b;
        }

        public final boolean c() {
            return this.f20962c;
        }

        public final void d(int i10) {
            this.f20961b = i10;
        }

        public final void e(boolean z10) {
            this.f20962c = z10;
        }
    }

    public h(x weakMemoryCache, InterfaceC2641a bitmapPool, l lVar) {
        AbstractC4862t.e(weakMemoryCache, "weakMemoryCache");
        AbstractC4862t.e(bitmapPool, "bitmapPool");
        this.f20956a = weakMemoryCache;
        this.f20957b = bitmapPool;
        this.f20958c = new K();
    }

    public static final void g(h this$0, Bitmap bitmap) {
        AbstractC4862t.e(this$0, "this$0");
        AbstractC4862t.e(bitmap, "$bitmap");
        this$0.f20957b.b(bitmap);
    }

    @Override // a4.c
    public synchronized void a(Bitmap bitmap, boolean z10) {
        try {
            AbstractC4862t.e(bitmap, "bitmap");
            int iIdentityHashCode = System.identityHashCode(bitmap);
            if (!z10) {
                h(iIdentityHashCode, bitmap).e(false);
            } else if (i(iIdentityHashCode, bitmap) == null) {
                this.f20958c.n(iIdentityHashCode, new b(new WeakReference(bitmap), 0, true));
            }
            f();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // a4.c
    public synchronized boolean b(final Bitmap bitmap) {
        try {
            AbstractC4862t.e(bitmap, "bitmap");
            int iIdentityHashCode = System.identityHashCode(bitmap);
            b bVarI = i(iIdentityHashCode, bitmap);
            boolean z10 = false;
            if (bVarI == null) {
                return false;
            }
            bVarI.d(bVarI.b() - 1);
            if (bVarI.b() <= 0 && bVarI.c()) {
                z10 = true;
            }
            if (z10) {
                this.f20958c.o(iIdentityHashCode);
                this.f20956a.d(bitmap);
                f20955f.post(new Runnable() { // from class: a4.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.g(this.f20952a, bitmap);
                    }
                });
            }
            f();
            return z10;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // a4.c
    public synchronized void c(Bitmap bitmap) {
        AbstractC4862t.e(bitmap, "bitmap");
        b bVarH = h(System.identityHashCode(bitmap), bitmap);
        bVarH.d(bVarH.b() + 1);
        f();
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        int iQ = this.f20958c.q();
        int i10 = 0;
        if (iQ > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (((b) this.f20958c.r(i11)).a().get() == null) {
                    arrayList.add(Integer.valueOf(i11));
                }
                if (i12 >= iQ) {
                    break;
                } else {
                    i11 = i12;
                }
            }
        }
        K k10 = this.f20958c;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i13 = i10 + 1;
            k10.p(((Number) arrayList.get(i10)).intValue());
            if (i13 > size) {
                return;
            } else {
                i10 = i13;
            }
        }
    }

    public final void f() {
        int i10 = this.f20959d;
        this.f20959d = i10 + 1;
        if (i10 >= 50) {
            e();
        }
    }

    public final b h(int i10, Bitmap bitmap) {
        b bVarI = i(i10, bitmap);
        if (bVarI != null) {
            return bVarI;
        }
        b bVar = new b(new WeakReference(bitmap), 0, false);
        this.f20958c.n(i10, bVar);
        return bVar;
    }

    public final b i(int i10, Bitmap bitmap) {
        b bVar = (b) this.f20958c.i(i10);
        if (bVar != null && bVar.a().get() == bitmap) {
            return bVar;
        }
        return null;
    }
}
