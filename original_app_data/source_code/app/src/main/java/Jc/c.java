package Jc;

import Ic.j;
import Od.C;
import kd.f;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'KFunction' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c KFunction;
    public static final c KSuspendFunction;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final kd.c packageFqName;
    public static final c Function = new c("Function", 0, j.f5739u, "Function", false, false);
    public static final c SuspendFunction = new c("SuspendFunction", 1, j.f5731m, "SuspendFunction", true, false);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: Jc.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0109a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f6390a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f6391b;

            public C0109a(c kind, int i10) {
                AbstractC4862t.e(kind, "kind");
                this.f6390a = kind;
                this.f6391b = i10;
            }

            public final c a() {
                return this.f6390a;
            }

            public final int b() {
                return this.f6391b;
            }

            public final c c() {
                return this.f6390a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0109a)) {
                    return false;
                }
                C0109a c0109a = (C0109a) obj;
                return this.f6390a == c0109a.f6390a && this.f6391b == c0109a.f6391b;
            }

            public int hashCode() {
                return (this.f6390a.hashCode() * 31) + Integer.hashCode(this.f6391b);
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f6390a + ", arity=" + this.f6391b + ')';
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final c a(kd.c packageFqName, String className) {
            AbstractC4862t.e(packageFqName, "packageFqName");
            AbstractC4862t.e(className, "className");
            for (c cVar : c.values()) {
                if (AbstractC4862t.a(cVar.j(), packageFqName) && C.P(className, cVar.b(), false, 2, null)) {
                    return cVar;
                }
            }
            return null;
        }

        public final c b(String className, kd.c packageFqName) {
            AbstractC4862t.e(className, "className");
            AbstractC4862t.e(packageFqName, "packageFqName");
            C0109a c0109aC = c(className, packageFqName);
            if (c0109aC != null) {
                return c0109aC.c();
            }
            return null;
        }

        public final C0109a c(String className, kd.c packageFqName) {
            AbstractC4862t.e(className, "className");
            AbstractC4862t.e(packageFqName, "packageFqName");
            c cVarA = a(packageFqName, className);
            if (cVarA == null) {
                return null;
            }
            String strSubstring = className.substring(cVarA.b().length());
            AbstractC4862t.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            Integer numD = d(strSubstring);
            if (numD != null) {
                return new C0109a(cVarA, numD.intValue());
            }
            return null;
        }

        public final Integer d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                int iCharAt = str.charAt(i11) - '0';
                if (iCharAt < 0 || iCharAt >= 10) {
                    return null;
                }
                i10 = (i10 * 10) + iCharAt;
            }
            return Integer.valueOf(i10);
        }

        public a() {
        }
    }

    static {
        kd.c cVar = j.f5736r;
        KFunction = new c("KFunction", 2, cVar, "KFunction", false, true);
        KSuspendFunction = new c("KSuspendFunction", 3, cVar, "KSuspendFunction", true, true);
        $VALUES = a();
        Companion = new a(null);
    }

    public c(String str, int i10, kd.c cVar, String str2, boolean z10, boolean z11) {
        this.packageFqName = cVar;
        this.classNamePrefix = str2;
        this.isSuspendType = z10;
        this.isReflectType = z11;
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{Function, SuspendFunction, KFunction, KSuspendFunction};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String b() {
        return this.classNamePrefix;
    }

    public final kd.c j() {
        return this.packageFqName;
    }

    public final f p(int i10) {
        f fVarS = f.s(this.classNamePrefix + i10);
        AbstractC4862t.d(fVarS, "identifier(\"$classNamePrefix$arity\")");
        return fVarS;
    }
}
