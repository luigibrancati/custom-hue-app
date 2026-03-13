package ed;

import Lc.a0;
import Uc.B;
import dd.InterfaceC3913r;
import ed.C3979a;
import io.sentry.protocol.FeatureFlag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jd.AbstractC4760a;
import jd.C4764e;
import qd.f;

/* JADX INFO: renamed from: ed.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C3980b implements InterfaceC3913r.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f33913j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f33914k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f33915a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33916b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33917c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33918d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f33919e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f33920f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f33921g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3979a.EnumC0429a f33922h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f33923i = null;

    /* JADX INFO: renamed from: ed.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0431b implements InterfaceC3913r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f33924a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // dd.InterfaceC3913r.b
        public void a() {
            g((String[]) this.f33924a.toArray(new String[0]));
        }

        @Override // dd.InterfaceC3913r.b
        public void b(f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        @Override // dd.InterfaceC3913r.b
        public void c(kd.b bVar, kd.f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // dd.InterfaceC3913r.b
        public void d(Object obj) {
            if (obj instanceof String) {
                this.f33924a.add((String) obj);
            }
        }

        @Override // dd.InterfaceC3913r.b
        public InterfaceC3913r.a e(kd.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        public abstract void g(String[] strArr);
    }

    static {
        HashMap map = new HashMap();
        f33914k = map;
        map.put(kd.b.m(new kd.c("kotlin.jvm.internal.KotlinClass")), C3979a.EnumC0429a.CLASS);
        map.put(kd.b.m(new kd.c("kotlin.jvm.internal.KotlinFileFacade")), C3979a.EnumC0429a.FILE_FACADE);
        map.put(kd.b.m(new kd.c("kotlin.jvm.internal.KotlinMultifileClass")), C3979a.EnumC0429a.MULTIFILE_CLASS);
        map.put(kd.b.m(new kd.c("kotlin.jvm.internal.KotlinMultifileClassPart")), C3979a.EnumC0429a.MULTIFILE_CLASS_PART);
        map.put(kd.b.m(new kd.c("kotlin.jvm.internal.KotlinSyntheticClass")), C3979a.EnumC0429a.SYNTHETIC_CLASS);
    }

    public static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // dd.InterfaceC3913r.c
    public InterfaceC3913r.a c(kd.b bVar, a0 a0Var) {
        C3979a.EnumC0429a enumC0429a;
        if (bVar == null) {
            d(0);
        }
        if (a0Var == null) {
            d(1);
        }
        kd.c cVarB = bVar.b();
        if (cVarB.equals(B.f16839a)) {
            return new c();
        }
        if (cVarB.equals(B.f16857s)) {
            return new d();
        }
        if (f33913j || this.f33922h != null || (enumC0429a = (C3979a.EnumC0429a) f33914k.get(bVar)) == null) {
            return null;
        }
        this.f33922h = enumC0429a;
        return new e();
    }

    public C3979a m() {
        if (this.f33922h == null || this.f33915a == null) {
            return null;
        }
        C4764e c4764e = new C4764e(this.f33915a, (this.f33917c & 8) != 0);
        if (!c4764e.h()) {
            this.f33921g = this.f33919e;
            this.f33919e = null;
        } else if (n() && this.f33919e == null) {
            return null;
        }
        String[] strArr = this.f33923i;
        return new C3979a(this.f33922h, c4764e, this.f33919e, this.f33921g, this.f33920f, this.f33916b, this.f33917c, this.f33918d, strArr != null ? AbstractC4760a.e(strArr) : null);
    }

    public final boolean n() {
        C3979a.EnumC0429a enumC0429a = this.f33922h;
        return enumC0429a == C3979a.EnumC0429a.CLASS || enumC0429a == C3979a.EnumC0429a.FILE_FACADE || enumC0429a == C3979a.EnumC0429a.MULTIFILE_CLASS_PART;
    }

    /* JADX INFO: renamed from: ed.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements InterfaceC3913r.a {

        /* JADX INFO: renamed from: ed.b$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends AbstractC0431b {
            public a() {
            }

            public static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", FeatureFlag.JsonKeys.RESULT, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // ed.C3980b.AbstractC0431b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C3980b.this.f33919e = strArr;
            }
        }

        /* JADX INFO: renamed from: ed.b$c$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0432b extends AbstractC0431b {
            public C0432b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", FeatureFlag.JsonKeys.RESULT, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // ed.C3980b.AbstractC0431b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C3980b.this.f33920f = strArr;
            }
        }

        public c() {
        }

        public static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // dd.InterfaceC3913r.a
        public InterfaceC3913r.b b(kd.f fVar) {
            String strB = fVar != null ? fVar.b() : null;
            if ("d1".equals(strB)) {
                return h();
            }
            if ("d2".equals(strB)) {
                return i();
            }
            return null;
        }

        @Override // dd.InterfaceC3913r.a
        public InterfaceC3913r.a c(kd.f fVar, kd.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // dd.InterfaceC3913r.a
        public void d(kd.f fVar, kd.b bVar, kd.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // dd.InterfaceC3913r.a
        public void e(kd.f fVar, f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // dd.InterfaceC3913r.a
        public void f(kd.f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strB = fVar.b();
            if ("k".equals(strB)) {
                if (obj instanceof Integer) {
                    C3980b.this.f33922h = C3979a.EnumC0429a.j(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strB)) {
                if (obj instanceof int[]) {
                    C3980b.this.f33915a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    C3980b.this.f33916b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strB)) {
                if (obj instanceof Integer) {
                    C3980b.this.f33917c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strB) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                C3980b.this.f33918d = str2;
            }
        }

        public final InterfaceC3913r.b h() {
            return new a();
        }

        public final InterfaceC3913r.b i() {
            return new C0432b();
        }

        @Override // dd.InterfaceC3913r.a
        public void a() {
        }
    }

    /* JADX INFO: renamed from: ed.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements InterfaceC3913r.a {

        /* JADX INFO: renamed from: ed.b$d$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends AbstractC0431b {
            public a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", FeatureFlag.JsonKeys.RESULT, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // ed.C3980b.AbstractC0431b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C3980b.this.f33923i = strArr;
            }
        }

        public d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // dd.InterfaceC3913r.a
        public InterfaceC3913r.b b(kd.f fVar) {
            if ("b".equals(fVar != null ? fVar.b() : null)) {
                return h();
            }
            return null;
        }

        @Override // dd.InterfaceC3913r.a
        public InterfaceC3913r.a c(kd.f fVar, kd.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // dd.InterfaceC3913r.a
        public void d(kd.f fVar, kd.b bVar, kd.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // dd.InterfaceC3913r.a
        public void e(kd.f fVar, f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        public final InterfaceC3913r.b h() {
            return new a();
        }

        @Override // dd.InterfaceC3913r.a
        public void a() {
        }

        @Override // dd.InterfaceC3913r.a
        public void f(kd.f fVar, Object obj) {
        }
    }

    /* JADX INFO: renamed from: ed.b$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements InterfaceC3913r.a {

        /* JADX INFO: renamed from: ed.b$e$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends AbstractC0431b {
            public a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // ed.C3980b.AbstractC0431b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C3980b.this.f33919e = strArr;
            }
        }

        /* JADX INFO: renamed from: ed.b$e$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0433b extends AbstractC0431b {
            public C0433b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // ed.C3980b.AbstractC0431b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C3980b.this.f33920f = strArr;
            }
        }

        public e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private InterfaceC3913r.b h() {
            return new a();
        }

        private InterfaceC3913r.b i() {
            return new C0433b();
        }

        @Override // dd.InterfaceC3913r.a
        public InterfaceC3913r.b b(kd.f fVar) {
            String strB = fVar != null ? fVar.b() : null;
            if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
                return h();
            }
            if ("strings".equals(strB)) {
                return i();
            }
            return null;
        }

        @Override // dd.InterfaceC3913r.a
        public InterfaceC3913r.a c(kd.f fVar, kd.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // dd.InterfaceC3913r.a
        public void d(kd.f fVar, kd.b bVar, kd.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // dd.InterfaceC3913r.a
        public void e(kd.f fVar, f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // dd.InterfaceC3913r.a
        public void f(kd.f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strB = fVar.b();
            if ("version".equals(strB)) {
                if (obj instanceof int[]) {
                    C3980b.this.f33915a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strB)) {
                C3980b.this.f33916b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // dd.InterfaceC3913r.a
        public void a() {
        }
    }

    @Override // dd.InterfaceC3913r.c
    public void a() {
    }
}
