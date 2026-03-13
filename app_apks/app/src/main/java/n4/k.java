package n4;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40567c;

    public k() {
        this(false, false, false, 7, null);
    }

    public final boolean a() {
        return this.f40565a;
    }

    public final boolean b() {
        return this.f40566b;
    }

    public final boolean c() {
        return this.f40567c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f40565a == kVar.f40565a && this.f40566b == kVar.f40566b && this.f40567c == kVar.f40567c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        boolean z10 = this.f40565a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.f40566b;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        int i11 = (i10 + r22) * 31;
        boolean z12 = this.f40567c;
        return i11 + (z12 ? 1 : z12);
    }

    public String toString() {
        return "ImageLoaderOptions(addLastModifiedToFileCacheKey=" + this.f40565a + ", launchInterceptorChainOnMainThread=" + this.f40566b + ", networkObserverEnabled=" + this.f40567c + ')';
    }

    public k(boolean z10, boolean z11, boolean z12) {
        this.f40565a = z10;
        this.f40566b = z11;
        this.f40567c = z12;
    }

    public /* synthetic */ k(boolean z10, boolean z11, boolean z12, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }
}
