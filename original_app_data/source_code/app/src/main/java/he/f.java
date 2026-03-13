package he;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f36598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f36600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f36601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f36602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f36603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f36604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f36605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f36606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EnumC4303a f36607p;

    public f() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }

    public final boolean a() {
        return this.f36606o;
    }

    public final boolean b() {
        return this.f36602k;
    }

    public final boolean c() {
        return this.f36595d;
    }

    public final boolean d() {
        return this.f36605n;
    }

    public final String e() {
        return this.f36601j;
    }

    public final EnumC4303a f() {
        return this.f36607p;
    }

    public final boolean g() {
        return this.f36599h;
    }

    public final boolean h() {
        return this.f36604m;
    }

    public final boolean i() {
        return this.f36592a;
    }

    public final boolean j() {
        return this.f36597f;
    }

    public final boolean k() {
        return this.f36593b;
    }

    public final w l() {
        return null;
    }

    public final boolean m() {
        return this.f36596e;
    }

    public final String n() {
        return this.f36598g;
    }

    public final boolean o() {
        return this.f36603l;
    }

    public final boolean p() {
        return this.f36600i;
    }

    public final boolean q() {
        return this.f36594c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f36592a + ", ignoreUnknownKeys=" + this.f36593b + ", isLenient=" + this.f36594c + ", allowStructuredMapKeys=" + this.f36595d + ", prettyPrint=" + this.f36596e + ", explicitNulls=" + this.f36597f + ", prettyPrintIndent='" + this.f36598g + "', coerceInputValues=" + this.f36599h + ", useArrayPolymorphism=" + this.f36600i + ", classDiscriminator='" + this.f36601j + "', allowSpecialFloatingPointValues=" + this.f36602k + ", useAlternativeNames=" + this.f36603l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f36604m + ", allowTrailingComma=" + this.f36605n + ", allowComments=" + this.f36606o + ", classDiscriminatorMode=" + this.f36607p + ')';
    }

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String prettyPrintIndent, boolean z16, boolean z17, String classDiscriminator, boolean z18, boolean z19, w wVar, boolean z20, boolean z21, boolean z22, EnumC4303a classDiscriminatorMode) {
        AbstractC4862t.e(prettyPrintIndent, "prettyPrintIndent");
        AbstractC4862t.e(classDiscriminator, "classDiscriminator");
        AbstractC4862t.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f36592a = z10;
        this.f36593b = z11;
        this.f36594c = z12;
        this.f36595d = z13;
        this.f36596e = z14;
        this.f36597f = z15;
        this.f36598g = prettyPrintIndent;
        this.f36599h = z16;
        this.f36600i = z17;
        this.f36601j = classDiscriminator;
        this.f36602k = z18;
        this.f36603l = z19;
        this.f36604m = z20;
        this.f36605n = z21;
        this.f36606o = z22;
        this.f36607p = classDiscriminatorMode;
    }

    public /* synthetic */ f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, w wVar, boolean z20, boolean z21, boolean z22, EnumC4303a enumC4303a, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & RecognitionOptions.UPC_E) != 0 ? false : z18, (i10 & RecognitionOptions.PDF417) == 0 ? z19 : true, (i10 & RecognitionOptions.AZTEC) != 0 ? null : wVar, (i10 & 8192) != 0 ? false : z20, (i10 & 16384) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? EnumC4303a.POLYMORPHIC : enumC4303a);
    }
}
