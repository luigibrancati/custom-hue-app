package p9;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5426b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC5444u f42432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5425a f42433f;

    public C5426b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, EnumC5444u logEnvironment, C5425a androidAppInfo) {
        AbstractC4862t.e(appId, "appId");
        AbstractC4862t.e(deviceModel, "deviceModel");
        AbstractC4862t.e(sessionSdkVersion, "sessionSdkVersion");
        AbstractC4862t.e(osVersion, "osVersion");
        AbstractC4862t.e(logEnvironment, "logEnvironment");
        AbstractC4862t.e(androidAppInfo, "androidAppInfo");
        this.f42428a = appId;
        this.f42429b = deviceModel;
        this.f42430c = sessionSdkVersion;
        this.f42431d = osVersion;
        this.f42432e = logEnvironment;
        this.f42433f = androidAppInfo;
    }

    public final C5425a a() {
        return this.f42433f;
    }

    public final String b() {
        return this.f42428a;
    }

    public final String c() {
        return this.f42429b;
    }

    public final EnumC5444u d() {
        return this.f42432e;
    }

    public final String e() {
        return this.f42431d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5426b)) {
            return false;
        }
        C5426b c5426b = (C5426b) obj;
        return AbstractC4862t.a(this.f42428a, c5426b.f42428a) && AbstractC4862t.a(this.f42429b, c5426b.f42429b) && AbstractC4862t.a(this.f42430c, c5426b.f42430c) && AbstractC4862t.a(this.f42431d, c5426b.f42431d) && this.f42432e == c5426b.f42432e && AbstractC4862t.a(this.f42433f, c5426b.f42433f);
    }

    public final String f() {
        return this.f42430c;
    }

    public int hashCode() {
        return (((((((((this.f42428a.hashCode() * 31) + this.f42429b.hashCode()) * 31) + this.f42430c.hashCode()) * 31) + this.f42431d.hashCode()) * 31) + this.f42432e.hashCode()) * 31) + this.f42433f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f42428a + ", deviceModel=" + this.f42429b + ", sessionSdkVersion=" + this.f42430c + ", osVersion=" + this.f42431d + ", logEnvironment=" + this.f42432e + ", androidAppInfo=" + this.f42433f + ')';
    }
}
