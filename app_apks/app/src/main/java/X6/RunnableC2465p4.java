package X6;

import android.os.Bundle;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.p4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2465p4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f19155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f19156b;

    public RunnableC2465p4(R4 r42, Bundle bundle) {
        this.f19155a = bundle;
        Objects.requireNonNull(r42);
        this.f19156b = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R4 r42 = this.f19156b;
        r42.h();
        r42.j();
        Bundle bundle = this.f19155a;
        AbstractC6056k.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC6056k.f(string);
        AbstractC6056k.f(string2);
        AbstractC6056k.l(bundle.get("value"));
        if (!r42.f18400a.g()) {
            r42.f18400a.a().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        W6 w62 = new W6(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C2416j3 c2416j3 = r42.f18400a;
            I iR = c2416j3.C().R(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            r42.f18400a.J().d0(new C2404i(bundle.getString("app_id"), string2, w62, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c2416j3.C().R(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), iR, bundle.getLong("time_to_live"), c2416j3.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
