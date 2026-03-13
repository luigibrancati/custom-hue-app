package tb;

import com.google.android.filament.IndirectLight;
import com.google.android.filament.Skybox;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: tb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5872a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndirectLight f44908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Skybox f44909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f44910c;

    public C5872a() {
        this(null, null, null, 7, null);
    }

    public final IndirectLight a() {
        return this.f44908a;
    }

    public final Skybox b() {
        return this.f44909b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5872a)) {
            return false;
        }
        C5872a c5872a = (C5872a) obj;
        return AbstractC4862t.a(this.f44908a, c5872a.f44908a) && AbstractC4862t.a(this.f44909b, c5872a.f44909b) && AbstractC4862t.a(this.f44910c, c5872a.f44910c);
    }

    public int hashCode() {
        IndirectLight indirectLight = this.f44908a;
        int iHashCode = (indirectLight == null ? 0 : indirectLight.hashCode()) * 31;
        Skybox skybox = this.f44909b;
        int iHashCode2 = (iHashCode + (skybox == null ? 0 : skybox.hashCode())) * 31;
        List list = this.f44910c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "Environment(indirectLight=" + this.f44908a + ", skybox=" + this.f44909b + ", sphericalHarmonics=" + this.f44910c + ")";
    }

    public C5872a(IndirectLight indirectLight, Skybox skybox, List list) {
        this.f44908a = indirectLight;
        this.f44909b = skybox;
        this.f44910c = list;
    }

    public /* synthetic */ C5872a(IndirectLight indirectLight, Skybox skybox, List list, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : indirectLight, (i10 & 2) != 0 ? null : skybox, (i10 & 4) != 0 ? null : list);
    }
}
