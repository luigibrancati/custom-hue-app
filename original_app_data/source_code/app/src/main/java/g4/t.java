package g4;

import android.graphics.Bitmap;
import g4.o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35513a = a.f35514a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f35514a = new a();

        public final t a(x weakMemoryCache, a4.c referenceCounter, int i10, n4.l lVar) {
            AbstractC4862t.e(weakMemoryCache, "weakMemoryCache");
            AbstractC4862t.e(referenceCounter, "referenceCounter");
            return i10 > 0 ? new p(weakMemoryCache, referenceCounter, i10, lVar) : weakMemoryCache instanceof q ? new f(weakMemoryCache) : C4141c.f35442b;
        }
    }

    void a(int i10);

    o.a b(l lVar);

    void c(l lVar, Bitmap bitmap, boolean z10);
}
