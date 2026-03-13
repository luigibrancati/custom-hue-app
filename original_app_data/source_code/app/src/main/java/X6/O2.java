package X6;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import io.sentry.SentryLockReason;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.Q f18458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f18459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P2 f18460c;

    public O2(P2 p22, com.google.android.gms.internal.measurement.Q q10, ServiceConnection serviceConnection) {
        this.f18458a = q10;
        this.f18459b = serviceConnection;
        Objects.requireNonNull(p22);
        this.f18460c = p22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleQ;
        P2 p22 = this.f18460c;
        Q2 q22 = p22.f18471b;
        C2416j3 c2416j3 = q22.f18480a;
        c2416j3.b().h();
        Bundle bundle = new Bundle();
        String strA = p22.a();
        bundle.putString(SentryLockReason.JsonKeys.PACKAGE_NAME, strA);
        try {
            bundleQ = this.f18458a.Q(bundle);
        } catch (Exception e10) {
            q22.f18480a.a().o().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundleQ == null) {
            c2416j3.a().o().a("Install Referrer Service returned a null response");
            bundleQ = null;
        }
        C2416j3 c2416j32 = q22.f18480a;
        c2416j32.b().h();
        C2416j3.q();
        if (bundleQ != null) {
            long j10 = bundleQ.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                c2416j32.a().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleQ.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c2416j32.a().o().a("No referrer defined in Install Referrer response");
                } else {
                    c2416j32.a().w().b("InstallReferrer API result", string);
                    Bundle bundleS0 = c2416j32.C().s0(Uri.parse("?".concat(string)));
                    if (bundleS0 == null) {
                        c2416j32.a().o().a("No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) AbstractC2383f2.f18892h1.b(null)).split(","));
                        Iterator<String> it = bundleS0.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (listAsList.contains(it.next())) {
                                long j11 = bundleQ.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 > 0) {
                                    bundleS0.putLong("click_timestamp", j11);
                                }
                            }
                        }
                        if (j10 == c2416j32.x().f18426g.a()) {
                            c2416j32.a().w().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c2416j32.g()) {
                            c2416j32.x().f18426g.b(j10);
                            c2416j32.a().w().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleS0.putString("_cis", "referrer API v2");
                            c2416j32.B().w("auto", "_cmp", bundleS0, strA);
                        }
                    }
                }
            }
        }
        A6.a.b().c(c2416j32.d(), this.f18459b);
    }
}
