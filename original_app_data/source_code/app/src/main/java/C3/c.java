package C3;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface c extends C3.a {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0027a f1101b = new C0027a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f1102c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f1103d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1104a;

        /* JADX INFO: renamed from: C3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0027a {
            public /* synthetic */ C0027a(AbstractC4854k abstractC4854k) {
                this();
            }

            public C0027a() {
            }
        }

        public a(String str) {
            this.f1104a = str;
        }

        public String toString() {
            return this.f1104a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f1105b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f1106c = new b("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f1107d = new b("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1108a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.f1108a = str;
        }

        public String toString() {
            return this.f1108a;
        }
    }

    a a();

    b getState();
}
