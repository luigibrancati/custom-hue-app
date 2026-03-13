package q4;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: q4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5491g {

    /* JADX INFO: renamed from: q4.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5491g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f43179a;

        public a(long j10) {
            super(null);
            this.f43179a = j10;
        }

        public final long a() {
            return this.f43179a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f43179a == ((a) obj).f43179a;
        }

        public int hashCode() {
            return Long.hashCode(this.f43179a);
        }

        public String toString() {
            return "EnterForeground(timestamp=" + this.f43179a + ')';
        }
    }

    /* JADX INFO: renamed from: q4.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5491g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E4.a f43180a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E4.a event) {
            super(null);
            AbstractC4862t.e(event, "event");
            this.f43180a = event;
        }

        public final E4.a a() {
            return this.f43180a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC4862t.a(this.f43180a, ((b) obj).f43180a);
        }

        public int hashCode() {
            return this.f43180a.hashCode();
        }

        public String toString() {
            return "Event(event=" + this.f43180a + ')';
        }
    }

    /* JADX INFO: renamed from: q4.g$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5491g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f43181a;

        public c(long j10) {
            super(null);
            this.f43181a = j10;
        }

        public final long a() {
            return this.f43181a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f43181a == ((c) obj).f43181a;
        }

        public int hashCode() {
            return Long.hashCode(this.f43181a);
        }

        public String toString() {
            return "ExitForeground(timestamp=" + this.f43181a + ')';
        }
    }

    public /* synthetic */ AbstractC5491g(AbstractC4854k abstractC4854k) {
        this();
    }

    public AbstractC5491g() {
    }
}
