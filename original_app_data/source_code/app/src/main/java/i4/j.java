package i4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g4.l f37179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f37180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c4.b f37181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f37182d;

        public a(g4.l lVar, boolean z10, c4.b dataSource, boolean z11) {
            AbstractC4862t.e(dataSource, "dataSource");
            this.f37179a = lVar;
            this.f37180b = z10;
            this.f37181c = dataSource;
            this.f37182d = z11;
        }

        public final c4.b a() {
            return this.f37181c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(this.f37179a, aVar.f37179a) && this.f37180b == aVar.f37180b && this.f37181c == aVar.f37181c && this.f37182d == aVar.f37182d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            g4.l lVar = this.f37179a;
            int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
            boolean z10 = this.f37180b;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            int iHashCode2 = (((iHashCode + r12) * 31) + this.f37181c.hashCode()) * 31;
            boolean z11 = this.f37182d;
            return iHashCode2 + (z11 ? 1 : z11);
        }

        public String toString() {
            return "Metadata(memoryCacheKey=" + this.f37179a + ", isSampled=" + this.f37180b + ", dataSource=" + this.f37181c + ", isPlaceholderMemoryCacheKeyPresent=" + this.f37182d + ')';
        }
    }

    public /* synthetic */ j(AbstractC4854k abstractC4854k) {
        this();
    }

    public abstract Drawable a();

    public abstract i b();

    public j() {
    }
}
