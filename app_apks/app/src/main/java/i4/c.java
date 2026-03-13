package i4;

import Rd.C2123d0;
import Rd.I;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j4.EnumC4685d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import m4.InterfaceC5021b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f37078m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f37079n = new c(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f37080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5021b f37081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC4685d f37082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f37083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f37085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f37086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f37087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Drawable f37088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f37089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f37090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f37091l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);
    }

    public final boolean a() {
        return this.f37084e;
    }

    public final boolean b() {
        return this.f37085f;
    }

    public final Bitmap.Config c() {
        return this.f37083d;
    }

    public final b d() {
        return this.f37090k;
    }

    public final I e() {
        return this.f37080a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC4862t.a(this.f37080a, cVar.f37080a) && AbstractC4862t.a(this.f37081b, cVar.f37081b) && this.f37082c == cVar.f37082c && this.f37083d == cVar.f37083d && this.f37084e == cVar.f37084e && this.f37085f == cVar.f37085f && AbstractC4862t.a(this.f37086g, cVar.f37086g) && AbstractC4862t.a(this.f37087h, cVar.f37087h) && AbstractC4862t.a(this.f37088i, cVar.f37088i) && this.f37089j == cVar.f37089j && this.f37090k == cVar.f37090k && this.f37091l == cVar.f37091l;
    }

    public final Drawable f() {
        return this.f37087h;
    }

    public final Drawable g() {
        return this.f37088i;
    }

    public final b h() {
        return this.f37089j;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f37080a.hashCode() * 31) + this.f37081b.hashCode()) * 31) + this.f37082c.hashCode()) * 31) + this.f37083d.hashCode()) * 31) + Boolean.hashCode(this.f37084e)) * 31) + Boolean.hashCode(this.f37085f)) * 31;
        Drawable drawable = this.f37086g;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f37087h;
        int iHashCode3 = (iHashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.f37088i;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f37089j.hashCode()) * 31) + this.f37090k.hashCode()) * 31) + this.f37091l.hashCode();
    }

    public final b i() {
        return this.f37091l;
    }

    public final Drawable j() {
        return this.f37086g;
    }

    public final EnumC4685d k() {
        return this.f37082c;
    }

    public final InterfaceC5021b l() {
        return this.f37081b;
    }

    public String toString() {
        return "DefaultRequestOptions(dispatcher=" + this.f37080a + ", transition=" + this.f37081b + ", precision=" + this.f37082c + ", bitmapConfig=" + this.f37083d + ", allowHardware=" + this.f37084e + ", allowRgb565=" + this.f37085f + ", placeholder=" + this.f37086g + ", error=" + this.f37087h + ", fallback=" + this.f37088i + ", memoryCachePolicy=" + this.f37089j + ", diskCachePolicy=" + this.f37090k + ", networkCachePolicy=" + this.f37091l + ')';
    }

    public c(I dispatcher, InterfaceC5021b transition, EnumC4685d precision, Bitmap.Config bitmapConfig, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b memoryCachePolicy, b diskCachePolicy, b networkCachePolicy) {
        AbstractC4862t.e(dispatcher, "dispatcher");
        AbstractC4862t.e(transition, "transition");
        AbstractC4862t.e(precision, "precision");
        AbstractC4862t.e(bitmapConfig, "bitmapConfig");
        AbstractC4862t.e(memoryCachePolicy, "memoryCachePolicy");
        AbstractC4862t.e(diskCachePolicy, "diskCachePolicy");
        AbstractC4862t.e(networkCachePolicy, "networkCachePolicy");
        this.f37080a = dispatcher;
        this.f37081b = transition;
        this.f37082c = precision;
        this.f37083d = bitmapConfig;
        this.f37084e = z10;
        this.f37085f = z11;
        this.f37086g = drawable;
        this.f37087h = drawable2;
        this.f37088i = drawable3;
        this.f37089j = memoryCachePolicy;
        this.f37090k = diskCachePolicy;
        this.f37091l = networkCachePolicy;
    }

    public /* synthetic */ c(I i10, InterfaceC5021b interfaceC5021b, EnumC4685d enumC4685d, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? C2123d0.b() : i10, (i11 & 2) != 0 ? InterfaceC5021b.f40197b : interfaceC5021b, (i11 & 4) != 0 ? EnumC4685d.AUTOMATIC : enumC4685d, (i11 & 8) != 0 ? n4.n.f40574a.d() : config, (i11 & 16) != 0 ? true : z10, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? null : drawable, (i11 & 128) != 0 ? null : drawable2, (i11 & 256) != 0 ? null : drawable3, (i11 & 512) != 0 ? b.ENABLED : bVar, (i11 & RecognitionOptions.UPC_E) != 0 ? b.ENABLED : bVar2, (i11 & RecognitionOptions.PDF417) != 0 ? b.ENABLED : bVar3);
    }
}
