package D7;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f2301c;

    public /* synthetic */ e(Integer num, Map map, d dVar) {
        this.f2300b = num;
        this.f2301c = map;
    }

    @Override // D7.i
    public final Integer a() {
        return this.f2300b;
    }

    @Override // D7.i
    public final Map b() {
        return this.f2301c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            Integer num = this.f2300b;
            if (num != null ? num.equals(iVar.a()) : iVar.a() == null) {
                if (this.f2301c.equals(iVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f2300b;
        return this.f2301c.hashCode() ^ (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f2300b + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f2301c) + "}";
    }
}
