package q9;

import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: renamed from: q9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5510c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: q9.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CRASHLYTICS = new a("CRASHLYTICS", 0);
        public static final a PERFORMANCE = new a("PERFORMANCE", 1);
        public static final a MATT_SAYS_HI = new a("MATT_SAYS_HI", 2);

        static {
            a[] aVarArrA = a();
            $VALUES = aVarArrA;
            $ENTRIES = AbstractC5277b.a(aVarArrA);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{CRASHLYTICS, PERFORMANCE, MATT_SAYS_HI};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: q9.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43326a;

        public b(String sessionId) {
            AbstractC4862t.e(sessionId, "sessionId");
            this.f43326a = sessionId;
        }

        public final String a() {
            return this.f43326a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC4862t.a(this.f43326a, ((b) obj).f43326a);
        }

        public int hashCode() {
            return this.f43326a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f43326a + ')';
        }
    }

    boolean a();

    a b();

    void c(b bVar);
}
