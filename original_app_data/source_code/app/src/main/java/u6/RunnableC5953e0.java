package u6;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Objects;
import s6.C5783b;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: u6.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5953e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5949c0 f45172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC5955f0 f45173b;

    public RunnableC5953e0(AbstractDialogInterfaceOnCancelListenerC5955f0 abstractDialogInterfaceOnCancelListenerC5955f0, C5949c0 c5949c0) {
        Objects.requireNonNull(abstractDialogInterfaceOnCancelListenerC5955f0);
        this.f45173b = abstractDialogInterfaceOnCancelListenerC5955f0;
        this.f45172a = c5949c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractDialogInterfaceOnCancelListenerC5955f0 abstractDialogInterfaceOnCancelListenerC5955f0 = this.f45173b;
        if (abstractDialogInterfaceOnCancelListenerC5955f0.f45175b) {
            C5949c0 c5949c0 = this.f45172a;
            C5783b c5783bB = c5949c0.b();
            if (c5783bB.k()) {
                abstractDialogInterfaceOnCancelListenerC5955f0.f45179a.startActivityForResult(GoogleApiActivity.a(abstractDialogInterfaceOnCancelListenerC5955f0.b(), (PendingIntent) AbstractC6056k.l(c5783bB.h()), c5949c0.a(), false), 1);
                return;
            }
            Activity activityB = abstractDialogInterfaceOnCancelListenerC5955f0.b();
            int iE = c5783bB.e();
            GoogleApiAvailability googleApiAvailability = abstractDialogInterfaceOnCancelListenerC5955f0.f45178e;
            if (googleApiAvailability.b(activityB, iE, null) != null) {
                googleApiAvailability.q(abstractDialogInterfaceOnCancelListenerC5955f0.b(), abstractDialogInterfaceOnCancelListenerC5955f0.f45179a, c5783bB.e(), 2, abstractDialogInterfaceOnCancelListenerC5955f0);
            } else if (c5783bB.e() != 18) {
                abstractDialogInterfaceOnCancelListenerC5955f0.s(c5783bB, c5949c0.a());
            } else {
                googleApiAvailability.u(abstractDialogInterfaceOnCancelListenerC5955f0.b().getApplicationContext(), new C5951d0(this, googleApiAvailability.t(abstractDialogInterfaceOnCancelListenerC5955f0.b(), abstractDialogInterfaceOnCancelListenerC5955f0)));
            }
        }
    }
}
