package mb;

import com.google.ar.core.Trackable;
import com.google.ar.core.TrackingState;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: mb.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5043h {
    public static final boolean a(Trackable trackable) {
        AbstractC4862t.e(trackable, "<this>");
        return trackable.getTrackingState() == TrackingState.TRACKING;
    }
}
