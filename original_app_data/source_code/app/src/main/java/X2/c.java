package X2;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context) {
        AbstractC4862t.e(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        AbstractC4862t.d(measurementManager, "get(context)");
        super(measurementManager);
    }
}
