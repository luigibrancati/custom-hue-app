package c4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import i4.m;
import j4.EnumC4688g;
import kotlin.jvm.internal.AbstractC4862t;
import pe.u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f25617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorSpace f25618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC4688g f25619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f25623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f25624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i4.b f25625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i4.b f25626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i4.b f25627l;

    public i(Context context, Bitmap.Config config, ColorSpace colorSpace, EnumC4688g scale, boolean z10, boolean z11, boolean z12, u headers, m parameters, i4.b memoryCachePolicy, i4.b diskCachePolicy, i4.b networkCachePolicy) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(config, "config");
        AbstractC4862t.e(scale, "scale");
        AbstractC4862t.e(headers, "headers");
        AbstractC4862t.e(parameters, "parameters");
        AbstractC4862t.e(memoryCachePolicy, "memoryCachePolicy");
        AbstractC4862t.e(diskCachePolicy, "diskCachePolicy");
        AbstractC4862t.e(networkCachePolicy, "networkCachePolicy");
        this.f25616a = context;
        this.f25617b = config;
        this.f25618c = colorSpace;
        this.f25619d = scale;
        this.f25620e = z10;
        this.f25621f = z11;
        this.f25622g = z12;
        this.f25623h = headers;
        this.f25624i = parameters;
        this.f25625j = memoryCachePolicy;
        this.f25626k = diskCachePolicy;
        this.f25627l = networkCachePolicy;
    }

    public final boolean a() {
        return this.f25620e;
    }

    public final boolean b() {
        return this.f25621f;
    }

    public final ColorSpace c() {
        return this.f25618c;
    }

    public final Bitmap.Config d() {
        return this.f25617b;
    }

    public final Context e() {
        return this.f25616a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC4862t.a(this.f25616a, iVar.f25616a) && this.f25617b == iVar.f25617b && AbstractC4862t.a(this.f25618c, iVar.f25618c) && this.f25619d == iVar.f25619d && this.f25620e == iVar.f25620e && this.f25621f == iVar.f25621f && this.f25622g == iVar.f25622g && AbstractC4862t.a(this.f25623h, iVar.f25623h) && AbstractC4862t.a(this.f25624i, iVar.f25624i) && this.f25625j == iVar.f25625j && this.f25626k == iVar.f25626k && this.f25627l == iVar.f25627l;
    }

    public final i4.b f() {
        return this.f25626k;
    }

    public final u g() {
        return this.f25623h;
    }

    public final i4.b h() {
        return this.f25627l;
    }

    public int hashCode() {
        int iHashCode = ((this.f25616a.hashCode() * 31) + this.f25617b.hashCode()) * 31;
        ColorSpace colorSpace = this.f25618c;
        return ((((((((((((((((((iHashCode + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31) + this.f25619d.hashCode()) * 31) + Boolean.hashCode(this.f25620e)) * 31) + Boolean.hashCode(this.f25621f)) * 31) + Boolean.hashCode(this.f25622g)) * 31) + this.f25623h.hashCode()) * 31) + this.f25624i.hashCode()) * 31) + this.f25625j.hashCode()) * 31) + this.f25626k.hashCode()) * 31) + this.f25627l.hashCode();
    }

    public final boolean i() {
        return this.f25622g;
    }

    public final EnumC4688g j() {
        return this.f25619d;
    }

    public String toString() {
        return "Options(context=" + this.f25616a + ", config=" + this.f25617b + ", colorSpace=" + this.f25618c + ", scale=" + this.f25619d + ", allowInexactSize=" + this.f25620e + ", allowRgb565=" + this.f25621f + ", premultipliedAlpha=" + this.f25622g + ", headers=" + this.f25623h + ", parameters=" + this.f25624i + ", memoryCachePolicy=" + this.f25625j + ", diskCachePolicy=" + this.f25626k + ", networkCachePolicy=" + this.f25627l + ')';
    }
}
