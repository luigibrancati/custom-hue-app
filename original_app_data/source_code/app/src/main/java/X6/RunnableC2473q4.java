package X6;

import android.os.Bundle;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.q4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2473q4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f19169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f19170b;

    public RunnableC2473q4(R4 r42, Bundle bundle) {
        this.f19169a = bundle;
        Objects.requireNonNull(r42);
        this.f19170b = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R4 r42 = this.f19170b;
        r42.h();
        r42.j();
        Bundle bundle = this.f19169a;
        AbstractC6056k.l(bundle);
        String strF = AbstractC6056k.f(bundle.getString("name"));
        if (!r42.f18400a.g()) {
            r42.f18400a.a().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            r42.f18400a.J().d0(new C2404i(bundle.getString("app_id"), "", new W6(strF, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), r42.f18400a.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
