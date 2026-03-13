package X6;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: X6.l6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2435l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2443m6 f19091a;

    public C2435l6(C2443m6 c2443m6) {
        Objects.requireNonNull(c2443m6);
        this.f19091a = c2443m6;
    }

    public final void a() {
        C2443m6 c2443m6 = this.f19091a;
        c2443m6.h();
        C2416j3 c2416j3 = c2443m6.f18400a;
        if (c2416j3.x().A(c2416j3.e().a())) {
            c2416j3.x().f18432m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c2416j3.a().w().a("Detected application was in foreground");
                c(c2416j3.e().a(), false);
            }
        }
    }

    public final void b(long j10, boolean z10) {
        C2443m6 c2443m6 = this.f19091a;
        c2443m6.h();
        c2443m6.q();
        C2416j3 c2416j3 = c2443m6.f18400a;
        if (c2416j3.x().A(j10)) {
            c2416j3.x().f18432m.b(true);
            c2443m6.f18400a.L().p();
        }
        c2416j3.x().f18436q.b(j10);
        if (c2416j3.x().f18432m.a()) {
            c(j10, z10);
        }
    }

    public final void c(long j10, boolean z10) {
        C2443m6 c2443m6 = this.f19091a;
        c2443m6.h();
        if (c2443m6.f18400a.g()) {
            C2416j3 c2416j3 = c2443m6.f18400a;
            c2416j3.x().f18436q.b(j10);
            c2416j3.a().w().b("Session started, time", Long.valueOf(c2416j3.e().c()));
            long j11 = j10 / 1000;
            C2416j3 c2416j32 = c2443m6.f18400a;
            c2416j32.B().B("auto", "_sid", Long.valueOf(j11), j10);
            c2416j3.x().f18437r.b(j11);
            c2416j3.x().f18432m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            c2416j32.B().u("auto", "_s", j10, bundle);
            String strA = c2416j3.x().f18442w.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            c2416j32.B().u("auto", "_ssr", j10, bundle2);
        }
    }
}
