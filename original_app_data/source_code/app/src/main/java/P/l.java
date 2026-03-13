package P;

import gc.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f12525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12526b;

    public l() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final int a() {
        return this.f12526b;
    }

    public final Map b() {
        return this.f12525a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC4862t.a(this.f12525a, lVar.f12525a) && this.f12526b == lVar.f12526b;
    }

    public int hashCode() {
        return (this.f12525a.hashCode() * 31) + Integer.hashCode(this.f12526b);
    }

    public String toString() {
        return "StreamSpecQueryResult(streamSpecs=" + this.f12525a + ", maxSupportedFrameRate=" + this.f12526b + ')';
    }

    public l(Map streamSpecs, int i10) {
        AbstractC4862t.e(streamSpecs, "streamSpecs");
        this.f12525a = streamSpecs;
        this.f12526b = i10;
    }

    public /* synthetic */ l(Map map, int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? Q.i() : map, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10);
    }
}
