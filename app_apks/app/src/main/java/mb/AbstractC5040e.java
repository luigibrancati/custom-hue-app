package mb;

import com.google.ar.core.Frame;
import com.google.ar.core.Plane;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: mb.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5040e {
    public static final double a(Frame frame, Frame frame2) {
        AbstractC4862t.e(frame, "<this>");
        return Cb.b.a(frame.getTimestamp(), frame2 != null ? Long.valueOf(frame2.getTimestamp()) : null);
    }

    public static final Collection b(Frame frame) {
        AbstractC4862t.e(frame, "<this>");
        Collection updatedTrackables = frame.getUpdatedTrackables(Plane.class);
        AbstractC4862t.d(updatedTrackables, "getUpdatedTrackables(...)");
        return updatedTrackables;
    }
}
