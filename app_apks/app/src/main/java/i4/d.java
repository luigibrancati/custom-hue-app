package i4;

import Rd.I;
import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC2754j;
import j4.EnumC4685d;
import j4.EnumC4688g;
import j4.InterfaceC4690i;
import kotlin.jvm.internal.AbstractC4862t;
import m4.InterfaceC5021b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2754j f37092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4690i f37093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC4688g f37094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f37095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC5021b f37096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EnumC4685d f37097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f37098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f37099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f37100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f37101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f37102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f37103l;

    public d(AbstractC2754j abstractC2754j, InterfaceC4690i interfaceC4690i, EnumC4688g enumC4688g, I i10, InterfaceC5021b interfaceC5021b, EnumC4685d enumC4685d, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar, b bVar2, b bVar3) {
        this.f37092a = abstractC2754j;
        this.f37093b = interfaceC4690i;
        this.f37094c = enumC4688g;
        this.f37095d = i10;
        this.f37096e = interfaceC5021b;
        this.f37097f = enumC4685d;
        this.f37098g = config;
        this.f37099h = bool;
        this.f37100i = bool2;
        this.f37101j = bVar;
        this.f37102k = bVar2;
        this.f37103l = bVar3;
    }

    public final Boolean a() {
        return this.f37099h;
    }

    public final Boolean b() {
        return this.f37100i;
    }

    public final Bitmap.Config c() {
        return this.f37098g;
    }

    public final b d() {
        return this.f37102k;
    }

    public final I e() {
        return this.f37095d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC4862t.a(this.f37092a, dVar.f37092a) && AbstractC4862t.a(this.f37093b, dVar.f37093b) && this.f37094c == dVar.f37094c && AbstractC4862t.a(this.f37095d, dVar.f37095d) && AbstractC4862t.a(this.f37096e, dVar.f37096e) && this.f37097f == dVar.f37097f && this.f37098g == dVar.f37098g && AbstractC4862t.a(this.f37099h, dVar.f37099h) && AbstractC4862t.a(this.f37100i, dVar.f37100i) && this.f37101j == dVar.f37101j && this.f37102k == dVar.f37102k && this.f37103l == dVar.f37103l;
    }

    public final AbstractC2754j f() {
        return this.f37092a;
    }

    public final b g() {
        return this.f37101j;
    }

    public final b h() {
        return this.f37103l;
    }

    public int hashCode() {
        AbstractC2754j abstractC2754j = this.f37092a;
        int iHashCode = (abstractC2754j == null ? 0 : abstractC2754j.hashCode()) * 31;
        InterfaceC4690i interfaceC4690i = this.f37093b;
        int iHashCode2 = (iHashCode + (interfaceC4690i == null ? 0 : interfaceC4690i.hashCode())) * 31;
        EnumC4688g enumC4688g = this.f37094c;
        int iHashCode3 = (iHashCode2 + (enumC4688g == null ? 0 : enumC4688g.hashCode())) * 31;
        I i10 = this.f37095d;
        int iHashCode4 = (iHashCode3 + (i10 == null ? 0 : i10.hashCode())) * 31;
        InterfaceC5021b interfaceC5021b = this.f37096e;
        int iHashCode5 = (iHashCode4 + (interfaceC5021b == null ? 0 : interfaceC5021b.hashCode())) * 31;
        EnumC4685d enumC4685d = this.f37097f;
        int iHashCode6 = (iHashCode5 + (enumC4685d == null ? 0 : enumC4685d.hashCode())) * 31;
        Bitmap.Config config = this.f37098g;
        int iHashCode7 = (iHashCode6 + (config == null ? 0 : config.hashCode())) * 31;
        Boolean bool = this.f37099h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f37100i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        b bVar = this.f37101j;
        int iHashCode10 = (iHashCode9 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f37102k;
        int iHashCode11 = (iHashCode10 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.f37103l;
        return iHashCode11 + (bVar3 != null ? bVar3.hashCode() : 0);
    }

    public final EnumC4685d i() {
        return this.f37097f;
    }

    public final EnumC4688g j() {
        return this.f37094c;
    }

    public final InterfaceC4690i k() {
        return this.f37093b;
    }

    public final InterfaceC5021b l() {
        return this.f37096e;
    }

    public String toString() {
        return "DefinedRequestOptions(lifecycle=" + this.f37092a + ", sizeResolver=" + this.f37093b + ", scale=" + this.f37094c + ", dispatcher=" + this.f37095d + ", transition=" + this.f37096e + ", precision=" + this.f37097f + ", bitmapConfig=" + this.f37098g + ", allowHardware=" + this.f37099h + ", allowRgb565=" + this.f37100i + ", memoryCachePolicy=" + this.f37101j + ", diskCachePolicy=" + this.f37102k + ", networkCachePolicy=" + this.f37103l + ')';
    }
}
