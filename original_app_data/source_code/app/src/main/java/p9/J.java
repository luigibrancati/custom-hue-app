package p9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import h8.C4288f;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import q9.InterfaceC5510c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f42331a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.a f42332b;

    static {
        H8.a aVarI = new J8.d().j(C5427c.f42434a).k(true).i();
        AbstractC4862t.d(aVarI, "build(...)");
        f42332b = aVarI;
    }

    public final I a(C4288f firebaseApp, SessionDetails sessionDetails, s9.j sessionsSettings, Map subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC4862t.e(firebaseApp, "firebaseApp");
        AbstractC4862t.e(sessionDetails, "sessionDetails");
        AbstractC4862t.e(sessionsSettings, "sessionsSettings");
        AbstractC4862t.e(subscribers, "subscribers");
        AbstractC4862t.e(firebaseInstallationId, "firebaseInstallationId");
        AbstractC4862t.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new I(EnumC5434j.SESSION_START, new P(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new C5429e(d((InterfaceC5510c) subscribers.get(InterfaceC5510c.a.PERFORMANCE)), d((InterfaceC5510c) subscribers.get(InterfaceC5510c.a.CRASHLYTICS)), sessionsSettings.a()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
    }

    public final C5426b b(C4288f firebaseApp) throws PackageManager.NameNotFoundException {
        AbstractC4862t.e(firebaseApp, "firebaseApp");
        Context contextM = firebaseApp.m();
        AbstractC4862t.d(contextM, "getApplicationContext(...)");
        String packageName = contextM.getPackageName();
        PackageInfo packageInfo = contextM.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        String strC = firebaseApp.r().c();
        AbstractC4862t.d(strC, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        AbstractC4862t.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC4862t.d(RELEASE, "RELEASE");
        EnumC5444u enumC5444u = EnumC5444u.LOG_ENVIRONMENT_PROD;
        AbstractC4862t.b(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC4862t.d(MANUFACTURER, "MANUFACTURER");
        D d10 = D.f42315a;
        Context contextM2 = firebaseApp.m();
        AbstractC4862t.d(contextM2, "getApplicationContext(...)");
        C cB = d10.b(contextM2);
        Context contextM3 = firebaseApp.m();
        AbstractC4862t.d(contextM3, "getApplicationContext(...)");
        return new C5426b(strC, MODEL, "3.0.3", RELEASE, enumC5444u, new C5425a(packageName, str2, strValueOf, MANUFACTURER, cB, d10.a(contextM3)));
    }

    public final H8.a c() {
        return f42332b;
    }

    public final EnumC5428d d(InterfaceC5510c interfaceC5510c) {
        return interfaceC5510c == null ? EnumC5428d.COLLECTION_SDK_NOT_INSTALLED : interfaceC5510c.a() ? EnumC5428d.COLLECTION_ENABLED : EnumC5428d.COLLECTION_DISABLED;
    }
}
