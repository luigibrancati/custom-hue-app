package p9;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5425a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f42425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f42426f;

    public C5425a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, C currentProcessDetails, List appProcessDetails) {
        AbstractC4862t.e(packageName, "packageName");
        AbstractC4862t.e(versionName, "versionName");
        AbstractC4862t.e(appBuildVersion, "appBuildVersion");
        AbstractC4862t.e(deviceManufacturer, "deviceManufacturer");
        AbstractC4862t.e(currentProcessDetails, "currentProcessDetails");
        AbstractC4862t.e(appProcessDetails, "appProcessDetails");
        this.f42421a = packageName;
        this.f42422b = versionName;
        this.f42423c = appBuildVersion;
        this.f42424d = deviceManufacturer;
        this.f42425e = currentProcessDetails;
        this.f42426f = appProcessDetails;
    }

    public final String a() {
        return this.f42423c;
    }

    public final List b() {
        return this.f42426f;
    }

    public final C c() {
        return this.f42425e;
    }

    public final String d() {
        return this.f42424d;
    }

    public final String e() {
        return this.f42421a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5425a)) {
            return false;
        }
        C5425a c5425a = (C5425a) obj;
        return AbstractC4862t.a(this.f42421a, c5425a.f42421a) && AbstractC4862t.a(this.f42422b, c5425a.f42422b) && AbstractC4862t.a(this.f42423c, c5425a.f42423c) && AbstractC4862t.a(this.f42424d, c5425a.f42424d) && AbstractC4862t.a(this.f42425e, c5425a.f42425e) && AbstractC4862t.a(this.f42426f, c5425a.f42426f);
    }

    public final String f() {
        return this.f42422b;
    }

    public int hashCode() {
        return (((((((((this.f42421a.hashCode() * 31) + this.f42422b.hashCode()) * 31) + this.f42423c.hashCode()) * 31) + this.f42424d.hashCode()) * 31) + this.f42425e.hashCode()) * 31) + this.f42426f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f42421a + ", versionName=" + this.f42422b + ", appBuildVersion=" + this.f42423c + ", deviceManufacturer=" + this.f42424d + ", currentProcessDetails=" + this.f42425e + ", appProcessDetails=" + this.f42426f + ')';
    }
}
