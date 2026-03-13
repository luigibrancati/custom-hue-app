package X6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C3213h7;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h7 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2416j3 f18976a;

    public h7(C2416j3 c2416j3) {
        this.f18976a = c2416j3;
    }

    public final /* synthetic */ void a() {
        this.f18976a.N().o(((Long) AbstractC2383f2.f18823D.b(null)).longValue());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f18976a.a().r().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f18976a.a().r().a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                C2416j3 c2416j3 = this.f18976a;
                c2416j3.a().w().a("[sgtm] App Receiver notified batches are available");
                c2416j3.b().t(new Runnable() { // from class: X6.e7
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f18814a.a();
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final C2416j3 c2416j32 = this.f18976a;
            C3213h7.a();
            if (c2416j32.w().H(null, AbstractC2383f2.f18852R0)) {
                c2416j32.a().w().a("App receiver notified triggers are available");
                c2416j32.b().t(new Runnable() { // from class: X6.f7
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C2416j3 c2416j33 = c2416j32;
                        if (!c2416j33.C().G()) {
                            c2416j33.a().r().a("registerTrigger called but app not eligible");
                            return;
                        }
                        c2416j33.B().t0();
                        final R4 r4B = c2416j33.B();
                        Objects.requireNonNull(r4B);
                        new Thread(new Runnable() { // from class: X6.g7
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                r4B.u0();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        this.f18976a.a().r().a("App receiver called with unknown action");
    }
}
