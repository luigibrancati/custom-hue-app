package Uc;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f16956d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f16957e = new x(v.b(null, 1, null), a.f16961a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f16958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f16959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16960c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4859p implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16961a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.d(v.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final G invoke(kd.c p02) {
            AbstractC4862t.e(p02, "p0");
            return v.d(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final x a() {
            return x.f16957e;
        }

        public b() {
        }
    }

    public x(z jsr305, vc.l getReportLevelForAnnotation) {
        AbstractC4862t.e(jsr305, "jsr305");
        AbstractC4862t.e(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f16958a = jsr305;
        this.f16959b = getReportLevelForAnnotation;
        this.f16960c = jsr305.d() || getReportLevelForAnnotation.invoke(v.e()) == G.IGNORE;
    }

    public final boolean b() {
        return this.f16960c;
    }

    public final vc.l c() {
        return this.f16959b;
    }

    public final z d() {
        return this.f16958a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f16958a + ", getReportLevelForAnnotation=" + this.f16959b + ')';
    }
}
