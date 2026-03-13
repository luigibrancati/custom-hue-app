package com.signify.geofence;

import android.content.Context;
import android.content.Intent;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import io.sentry.protocol.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/signify/geofence/GeofenceRecreationWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", Message.JsonKeys.PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "L", "()Landroidx/work/c$a;", "geofence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeofenceRecreationWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceRecreationWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(params, "params");
    }

    @Override // androidx.work.Worker
    public c.a L() {
        Context contextZ = z();
        AbstractC4862t.d(contextZ, "getApplicationContext(...)");
        L0.a.q(contextZ, new Intent(contextZ, (Class<?>) GeofenceRecreationService.class));
        c.a aVarB = c.a.b();
        AbstractC4862t.d(aVarB, "success(...)");
        return aVarB;
    }
}
