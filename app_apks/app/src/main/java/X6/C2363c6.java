package X6;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C3323u1;
import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2363c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18737a;

    public C2363c6(Context context) {
        AbstractC6056k.l(context);
        this.f18737a = context;
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public static final boolean j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    public final void a() {
        Log.v("FA", this.f18737a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void b() {
        Log.v("FA", this.f18737a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final int c(final Intent intent, int i10, final int i11) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f18737a;
        C2416j3 c2416j3O = C2416j3.O(context, null, null);
        final C2542z2 c2542z2A = c2416j3O.a();
        String action = intent.getAction();
        c2416j3O.c();
        c2542z2A.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(R6.F(context), new Runnable() { // from class: X6.b6
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f18713a.f(i11, c2542z2A, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzjd(R6.F(this.f18737a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final boolean e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) AbstractC6056k.l(string);
            R6 r6F = R6.F(this.f18737a);
            final C2542z2 c2542z2A = r6F.a();
            r6F.c();
            c2542z2A.w().b("Local AppMeasurementJobService called. action", str);
            k(r6F, new Runnable() { // from class: X6.Z5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f18676a.g(c2542z2A, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        C3323u1.s(this.f18737a, null).K(new Runnable() { // from class: X6.a6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18697a.h(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void f(int i10, C2542z2 c2542z2, Intent intent) {
        Context context = this.f18737a;
        Y5 y52 = (Y5) context;
        if (y52.o(i10)) {
            c2542z2.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            C2416j3.O(context, null, null).a().w().a("Completed wakeful intent.");
            y52.p(intent);
        }
    }

    public final /* synthetic */ void g(C2542z2 c2542z2, JobParameters jobParameters) {
        c2542z2.w().a("AppMeasurementJobService processed last upload request.");
        ((Y5) this.f18737a).q(jobParameters, false);
    }

    public final /* synthetic */ void h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((Y5) this.f18737a).q(jobParameters, false);
    }

    public final void k(R6 r62, Runnable runnable) {
        r62.b().t(new X5(this, r62, runnable));
    }
}
