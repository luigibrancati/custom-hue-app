package P;

import E.W0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f12482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f12483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y.f f12487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W0 f12488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f12489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f12490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f12491j;

    public b(Collection appUseCases, Collection cameraUseCases, List cameraUseCasesToAttach, List cameraUseCasesToKeep, List cameraUseCasesToDetach, Y.f fVar, W0 w02, Map useCaseConfigs, l primaryStreamSpecResult, l lVar) {
        AbstractC4862t.e(appUseCases, "appUseCases");
        AbstractC4862t.e(cameraUseCases, "cameraUseCases");
        AbstractC4862t.e(cameraUseCasesToAttach, "cameraUseCasesToAttach");
        AbstractC4862t.e(cameraUseCasesToKeep, "cameraUseCasesToKeep");
        AbstractC4862t.e(cameraUseCasesToDetach, "cameraUseCasesToDetach");
        AbstractC4862t.e(useCaseConfigs, "useCaseConfigs");
        AbstractC4862t.e(primaryStreamSpecResult, "primaryStreamSpecResult");
        this.f12482a = appUseCases;
        this.f12483b = cameraUseCases;
        this.f12484c = cameraUseCasesToAttach;
        this.f12485d = cameraUseCasesToKeep;
        this.f12486e = cameraUseCasesToDetach;
        this.f12487f = fVar;
        this.f12488g = w02;
        this.f12489h = useCaseConfigs;
        this.f12490i = primaryStreamSpecResult;
        this.f12491j = lVar;
    }

    public final Collection a() {
        return this.f12482a;
    }

    public final Collection b() {
        return this.f12483b;
    }

    public final List c() {
        return this.f12484c;
    }

    public final List d() {
        return this.f12486e;
    }

    public final List e() {
        return this.f12485d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC4862t.a(this.f12482a, bVar.f12482a) && AbstractC4862t.a(this.f12483b, bVar.f12483b) && AbstractC4862t.a(this.f12484c, bVar.f12484c) && AbstractC4862t.a(this.f12485d, bVar.f12485d) && AbstractC4862t.a(this.f12486e, bVar.f12486e) && AbstractC4862t.a(this.f12487f, bVar.f12487f) && AbstractC4862t.a(this.f12488g, bVar.f12488g) && AbstractC4862t.a(this.f12489h, bVar.f12489h) && AbstractC4862t.a(this.f12490i, bVar.f12490i) && AbstractC4862t.a(this.f12491j, bVar.f12491j);
    }

    public final W0 f() {
        return this.f12488g;
    }

    public final l g() {
        return this.f12490i;
    }

    public final l h() {
        return this.f12491j;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f12482a.hashCode() * 31) + this.f12483b.hashCode()) * 31) + this.f12484c.hashCode()) * 31) + this.f12485d.hashCode()) * 31) + this.f12486e.hashCode()) * 31;
        Y.f fVar = this.f12487f;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        W0 w02 = this.f12488g;
        int iHashCode3 = (((((iHashCode2 + (w02 == null ? 0 : w02.hashCode())) * 31) + this.f12489h.hashCode()) * 31) + this.f12490i.hashCode()) * 31;
        l lVar = this.f12491j;
        return iHashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final Y.f i() {
        return this.f12487f;
    }

    public final Map j() {
        return this.f12489h;
    }

    public String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.f12482a + ", cameraUseCases=" + this.f12483b + ", cameraUseCasesToAttach=" + this.f12484c + ", cameraUseCasesToKeep=" + this.f12485d + ", cameraUseCasesToDetach=" + this.f12486e + ", streamSharing=" + this.f12487f + ", placeholderForExtensions=" + this.f12488g + ", useCaseConfigs=" + this.f12489h + ", primaryStreamSpecResult=" + this.f12490i + ", secondaryStreamSpecResult=" + this.f12491j + ')';
    }
}
