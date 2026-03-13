package S2;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15301a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f15302b = new b();

        public b() {
            super(null);
        }

        public String toString() {
            return "Idle()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S2.b f15303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(S2.b latestEvent, int i10) {
            super(null);
            AbstractC4862t.e(latestEvent, "latestEvent");
            this.f15303b = latestEvent;
            this.f15304c = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f15304c == cVar.f15304c && AbstractC4862t.a(this.f15303b, cVar.f15303b);
        }

        public int hashCode() {
            return (this.f15304c * 31) + this.f15303b.hashCode();
        }

        public String toString() {
            return "InProgress(latestEvent=" + this.f15303b + ", direction=" + this.f15304c + ')';
        }
    }

    public /* synthetic */ j(AbstractC4854k abstractC4854k) {
        this();
    }

    public j() {
    }
}
