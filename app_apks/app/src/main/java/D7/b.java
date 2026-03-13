package D7;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f2295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f2296b;

    @Override // D7.h
    public final h a(int i10) {
        this.f2295a = Integer.valueOf(i10);
        return this;
    }

    @Override // D7.h
    public final h b(Map map) {
        if (map == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.f2296b = map;
        return this;
    }

    @Override // D7.h
    public final i c() {
        if (this.f2296b != null) {
            return new e(this.f2295a, this.f2296b, null);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    @Override // D7.h
    public final Map d() {
        Map map = this.f2296b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
