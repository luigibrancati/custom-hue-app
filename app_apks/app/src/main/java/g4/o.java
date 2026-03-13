package g4;

import a4.InterfaceC2641a;
import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f35488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f35489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.c f35490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2641a f35491d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        Bitmap getBitmap();

        boolean isSampled();
    }

    public o(t strongMemoryCache, x weakMemoryCache, a4.c referenceCounter, InterfaceC2641a bitmapPool) {
        AbstractC4862t.e(strongMemoryCache, "strongMemoryCache");
        AbstractC4862t.e(weakMemoryCache, "weakMemoryCache");
        AbstractC4862t.e(referenceCounter, "referenceCounter");
        AbstractC4862t.e(bitmapPool, "bitmapPool");
        this.f35488a = strongMemoryCache;
        this.f35489b = weakMemoryCache;
        this.f35490c = referenceCounter;
        this.f35491d = bitmapPool;
    }

    public final InterfaceC2641a a() {
        return this.f35491d;
    }

    public final a4.c b() {
        return this.f35490c;
    }

    public final t c() {
        return this.f35488a;
    }

    public final x d() {
        return this.f35489b;
    }
}
