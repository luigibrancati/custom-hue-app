package mb;

import com.google.ar.core.Camera;
import com.google.ar.core.DepthPoint;
import com.google.ar.core.HitResult;
import com.google.ar.core.InstantPlacementPoint;
import com.google.ar.core.Plane;
import com.google.ar.core.Point;
import com.google.ar.core.Pose;
import com.google.ar.core.Trackable;
import com.google.ar.core.TrackingState;
import fc.C4034q;
import gc.T;
import gc.U;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: renamed from: mb.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5041f {
    public static final HitResult a(List list, Set planeTypes, boolean z10, boolean z11, boolean z12, Set set, Set set2, boolean z13, C4034q c4034q, l lVar) {
        Object next;
        AbstractC4862t.e(list, "<this>");
        AbstractC4862t.e(planeTypes, "planeTypes");
        Set trackingStates = set;
        AbstractC4862t.e(trackingStates, "trackingStates");
        Set pointOrientationModes = set2;
        AbstractC4862t.e(pointOrientationModes, "pointOrientationModes");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (c((HitResult) next, planeTypes, z10, z11, z12, trackingStates, pointOrientationModes, z13, c4034q, lVar)) {
                break;
            }
            trackingStates = set;
            pointOrientationModes = set2;
        }
        return (HitResult) next;
    }

    public static /* synthetic */ HitResult b(List list, Set set, boolean z10, boolean z11, boolean z12, Set set2, Set set3, boolean z13, C4034q c4034q, l lVar, int i10, Object obj) {
        l lVar2;
        C4034q c4034q2;
        Set set4;
        boolean z14;
        boolean z15;
        Set set5;
        boolean z16;
        boolean z17;
        List list2;
        Set set6;
        if ((i10 & 1) != 0) {
            set = U.d();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        if ((i10 & 16) != 0) {
            set2 = T.c(TrackingState.TRACKING);
        }
        if ((i10 & 32) != 0) {
            set3 = T.c(Point.OrientationMode.ESTIMATED_SURFACE_NORMAL);
        }
        if ((i10 & 64) != 0) {
            z13 = true;
        }
        if ((i10 & 128) != 0) {
            c4034q = null;
        }
        if ((i10 & 256) != 0) {
            lVar2 = null;
            z14 = z13;
            c4034q2 = c4034q;
            set5 = set2;
            set4 = set3;
            z17 = z11;
            z15 = z12;
            set6 = set;
            z16 = z10;
            list2 = list;
        } else {
            lVar2 = lVar;
            c4034q2 = c4034q;
            set4 = set3;
            z14 = z13;
            z15 = z12;
            set5 = set2;
            z16 = z10;
            z17 = z11;
            list2 = list;
            set6 = set;
        }
        return a(list2, set6, z16, z17, z15, set5, set4, z14, c4034q2, lVar2);
    }

    public static final boolean c(HitResult hitResult, Set planeTypes, boolean z10, boolean z11, boolean z12, Set trackingStates, Set pointOrientationModes, boolean z13, C4034q c4034q, l lVar) {
        AbstractC4862t.e(hitResult, "<this>");
        AbstractC4862t.e(planeTypes, "planeTypes");
        AbstractC4862t.e(trackingStates, "trackingStates");
        AbstractC4862t.e(pointOrientationModes, "pointOrientationModes");
        Trackable trackable = hitResult.getTrackable();
        if (!trackingStates.contains(trackable.getTrackingState())) {
            trackable = null;
        }
        if (trackable instanceof Plane) {
            Plane plane = (Plane) trackable;
            if (planeTypes.contains(plane.getType()) && (!z13 || plane.isPoseInPolygon(hitResult.getHitPose()))) {
                if (c4034q != null) {
                    Camera camera = (Camera) c4034q.a();
                    float fFloatValue = ((Number) c4034q.b()).floatValue();
                    Pose hitPose = hitResult.getHitPose();
                    AbstractC4862t.d(hitPose, "getHitPose(...)");
                    Pose pose = camera.getPose();
                    AbstractC4862t.d(pose, "getPose(...)");
                    if (AbstractC5042g.a(hitPose, pose) > fFloatValue) {
                    }
                }
                z11 = true;
            }
            z11 = false;
        } else {
            if (trackable instanceof Point) {
                if (z10 && pointOrientationModes.contains(((Point) trackable).getOrientationMode())) {
                    z11 = true;
                }
            } else if (!(trackable instanceof DepthPoint)) {
                if (trackable instanceof InstantPlacementPoint) {
                    z11 = z12;
                }
            }
            z11 = false;
        }
        return lVar != null ? ((Boolean) lVar.invoke(hitResult)).booleanValue() : z11;
    }
}
