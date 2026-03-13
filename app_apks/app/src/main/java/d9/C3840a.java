package d9;

import b9.C2898a;
import com.google.firebase.perf.v1.ApplicationInfo;

/* JADX INFO: renamed from: d9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3840a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2898a f33166c = C2898a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f33167b;

    public C3840a(ApplicationInfo applicationInfo) {
        this.f33167b = applicationInfo;
    }

    @Override // d9.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f33166c.j("ApplicationInfo is invalid");
        return false;
    }

    public final boolean g() {
        ApplicationInfo applicationInfo = this.f33167b;
        if (applicationInfo == null) {
            f33166c.j("ApplicationInfo is null");
            return false;
        }
        if (!applicationInfo.hasGoogleAppId()) {
            f33166c.j("GoogleAppId is null");
            return false;
        }
        if (!this.f33167b.hasAppInstanceId()) {
            f33166c.j("AppInstanceId is null");
            return false;
        }
        if (!this.f33167b.hasApplicationProcessState()) {
            f33166c.j("ApplicationProcessState is null");
            return false;
        }
        if (!this.f33167b.hasAndroidAppInfo()) {
            return true;
        }
        if (!this.f33167b.getAndroidAppInfo().hasPackageName()) {
            f33166c.j("AndroidAppInfo.packageName is null");
            return false;
        }
        if (this.f33167b.getAndroidAppInfo().hasSdkVersion()) {
            return true;
        }
        f33166c.j("AndroidAppInfo.sdkVersion is null");
        return false;
    }
}
