package g4;

import android.graphics.Bitmap;
import g4.o;
import kotlin.jvm.internal.AbstractC4862t;
import n4.AbstractC5085a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f35445b;

    public f(x weakMemoryCache) {
        AbstractC4862t.e(weakMemoryCache, "weakMemoryCache");
        this.f35445b = weakMemoryCache;
    }

    @Override // g4.t
    public o.a b(l key) {
        AbstractC4862t.e(key, "key");
        return null;
    }

    @Override // g4.t
    public void c(l key, Bitmap bitmap, boolean z10) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(bitmap, "bitmap");
        this.f35445b.c(key, bitmap, z10, AbstractC5085a.a(bitmap));
    }

    @Override // g4.t
    public void a(int i10) {
    }
}
