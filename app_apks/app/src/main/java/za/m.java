package za;

import I3.M;
import I3.x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.signify.geofence.GeofenceRecreationService;
import com.signify.geofence.GeofenceRecreationWorker;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48860b;

    public m(String logTag, boolean z10) {
        AbstractC4862t.e(logTag, "logTag");
        this.f48859a = logTag;
        this.f48860b = z10;
    }

    public abstract boolean a(Intent intent);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        if (!a(intent)) {
            Log.w(this.f48859a, "Called with unexpected action " + intent.getAction() + " (extras: " + intent.getExtras() + ')');
            return;
        }
        if (new com.signify.geofence.b(context).d().isEmpty()) {
            return;
        }
        if (this.f48860b) {
            M.f5571a.a(context).c((I3.x) ((x.a) new x.a(GeofenceRecreationWorker.class).l(1L, TimeUnit.MINUTES)).b());
        } else {
            Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) GeofenceRecreationService.class);
            intent2.putExtra("geofence_recreate_action", intent.getAction());
            context.startForegroundService(intent2);
        }
    }
}
