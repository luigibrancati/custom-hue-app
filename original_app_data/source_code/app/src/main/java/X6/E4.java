package X6;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f18238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f18239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F4 f18242e;

    public E4(F4 f42, boolean z10, Uri uri, String str, String str2) {
        this.f18238a = z10;
        this.f18239b = uri;
        this.f18240c = str;
        this.f18241d = str2;
        Objects.requireNonNull(f42);
        this.f18242e = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleS0;
        Bundle bundleS02;
        F4 f42 = this.f18242e;
        R4 r42 = f42.f18302a;
        r42.h();
        String str = this.f18241d;
        Uri uri = this.f18239b;
        try {
            C2416j3 c2416j3 = r42.f18400a;
            a7 a7VarC = c2416j3.C();
            if (TextUtils.isEmpty(str)) {
                bundleS0 = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleS0 = a7VarC.s0(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleS0 != null) {
                    bundleS0.putString("_cis", "referrer");
                }
            } else {
                a7VarC.f18400a.a().v().a("Activity created with data 'referrer' without required params");
                bundleS0 = null;
            }
            String str2 = this.f18240c;
            if (this.f18238a && (bundleS02 = c2416j3.C().s0(uri)) != null) {
                bundleS02.putString("_cis", "intent");
                if (!bundleS02.containsKey("gclid") && bundleS0 != null && bundleS0.containsKey("gclid")) {
                    bundleS02.putString("_cer", String.format("gclid=%s", bundleS0.getString("gclid")));
                }
                r42.t(str2, "_cmp", bundleS02);
                r42.f18505r.b(str2, bundleS02);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c2416j3.a().v().b("Activity created with referrer", str);
            if (c2416j3.w().H(null, AbstractC2383f2.f18832H0)) {
                if (bundleS0 != null) {
                    r42.t(str2, "_cmp", bundleS0);
                    r42.f18505r.b(str2, bundleS0);
                } else {
                    c2416j3.a().v().b("Referrer does not contain valid parameters", str);
                }
                r42.y("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                c2416j3.a().v().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                r42.y("auto", "_ldl", str, true);
            }
        } catch (RuntimeException e10) {
            f42.f18302a.f18400a.a().o().b("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }
}
