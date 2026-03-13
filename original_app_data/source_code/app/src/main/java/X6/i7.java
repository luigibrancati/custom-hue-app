package X6;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import io.sentry.protocol.App;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2416j3 f18998a;

    public i7(C2416j3 c2416j3) {
        this.f18998a = c2416j3;
    }

    public final void a() {
        C2416j3 c2416j3 = this.f18998a;
        c2416j3.b().h();
        if (e()) {
            if (d()) {
                c2416j3.x().f18443x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                c2416j3.B().t("auto", "_cmpx", bundle);
            } else {
                String strA = c2416j3.x().f18443x.a();
                if (TextUtils.isEmpty(strA)) {
                    c2416j3.a().p().a("Cache still valid but referrer not found");
                } else {
                    long jA = c2416j3.x().f18444y.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    c2416j3.B().t(obj == null ? App.TYPE : (String) obj, "_cmp", (Bundle) pair.second);
                }
                c2416j3.x().f18443x.b(null);
            }
            c2416j3.x().f18444y.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        String string;
        C2416j3 c2416j3 = this.f18998a;
        c2416j3.b().h();
        if (c2416j3.g()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        c2416j3.x().f18443x.b(string);
        c2416j3.x().f18444y.b(c2416j3.e().a());
    }

    public final void c() {
        if (e() && d()) {
            this.f18998a.x().f18443x.b(null);
        }
    }

    public final boolean d() {
        if (!e()) {
            return false;
        }
        C2416j3 c2416j3 = this.f18998a;
        return c2416j3.e().a() - c2416j3.x().f18444y.a() > c2416j3.w().D(null, AbstractC2383f2.f18900k0);
    }

    public final boolean e() {
        return this.f18998a.x().f18444y.a() > 0;
    }
}
