package androidx.lifecycle;

import fc.C4032o;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2754j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2746b f23460a = new C2746b(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.lifecycle.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C0296a Companion;
        public static final a ON_CREATE = new a("ON_CREATE", 0);
        public static final a ON_START = new a("ON_START", 1);
        public static final a ON_RESUME = new a("ON_RESUME", 2);
        public static final a ON_PAUSE = new a("ON_PAUSE", 3);
        public static final a ON_STOP = new a("ON_STOP", 4);
        public static final a ON_DESTROY = new a("ON_DESTROY", 5);
        public static final a ON_ANY = new a("ON_ANY", 6);

        /* JADX INFO: renamed from: androidx.lifecycle.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0296a {

            /* JADX INFO: renamed from: androidx.lifecycle.j$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public /* synthetic */ class C0297a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f23461a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f23461a = iArr;
                }
            }

            public /* synthetic */ C0296a(AbstractC4854k abstractC4854k) {
                this();
            }

            public final a a(b state) {
                AbstractC4862t.e(state, "state");
                int i10 = C0297a.f23461a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b state) {
                AbstractC4862t.e(state, "state");
                int i10 = C0297a.f23461a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b state) {
                AbstractC4862t.e(state, "state");
                int i10 = C0297a.f23461a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            public C0296a() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.j$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23462a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f23462a = iArr;
            }
        }

        static {
            a[] aVarArrA = a();
            $VALUES = aVarArrA;
            $ENTRIES = AbstractC5277b.a(aVarArrA);
            Companion = new C0296a(null);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static final a b(b bVar) {
            return Companion.a(bVar);
        }

        public static final a p(b bVar) {
            return Companion.c(bVar);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final b j() {
            switch (b.f23462a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new C4032o();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.lifecycle.j$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DESTROYED = new b("DESTROYED", 0);
        public static final b INITIALIZED = new b("INITIALIZED", 1);
        public static final b CREATED = new b("CREATED", 2);
        public static final b STARTED = new b("STARTED", 3);
        public static final b RESUMED = new b("RESUMED", 4);

        static {
            b[] bVarArrA = a();
            $VALUES = bVarArrA;
            $ENTRIES = AbstractC5277b.a(bVarArrA);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final boolean b(b state) {
            AbstractC4862t.e(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(InterfaceC2757m interfaceC2757m);

    public abstract b b();

    public abstract void c(InterfaceC2757m interfaceC2757m);
}
