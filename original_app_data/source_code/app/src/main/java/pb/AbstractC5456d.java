package pb;

import Ab.f;
import android.view.MotionEvent;
import com.google.android.filament.Engine;
import com.google.ar.core.Anchor;
import com.google.ar.core.Frame;
import com.google.ar.core.HitResult;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.Trackable;
import com.google.ar.core.TrackingState;
import fc.AbstractC4036s;
import fc.C4035r;
import gc.C4179C;
import gc.T;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import mb.AbstractC5042g;
import mb.AbstractC5043h;
import vb.C6079c;
import vc.l;
import vc.q;

/* JADX INFO: renamed from: pb.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5456d extends f {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public q f42529T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public l f42530U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Pose f42531V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TrackingState f42532W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Set f42533X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Session f42534Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Frame f42535Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f42536a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5456d(Engine engine, Pose pose, q moveHitTest, l lVar) {
        super(engine, 0, 2, null);
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(pose, "pose");
        AbstractC4862t.e(moveHitTest, "moveHitTest");
        this.f42529T = moveHitTest;
        this.f42530U = lVar;
        this.f42531V = pose;
        TrackingState trackingState = TrackingState.TRACKING;
        this.f42532W = trackingState;
        this.f42533X = T.c(trackingState);
        E0(AbstractC5042g.c(pose));
        G0();
    }

    public static final HitResult K0(AbstractC5456d abstractC5456d, Frame frame, MotionEvent motionEvent) {
        AbstractC4862t.e(abstractC5456d, "<this>");
        AbstractC4862t.e(frame, "frame");
        AbstractC4862t.e(motionEvent, "motionEvent");
        List<HitResult> listHitTest = frame.hitTest(motionEvent);
        AbstractC4862t.d(listHitTest, "hitTest(...)");
        HitResult hitResult = (HitResult) C4179C.j0(listHitTest);
        if (hitResult != null) {
            Trackable trackable = hitResult.getTrackable();
            AbstractC4862t.d(trackable, "getTrackable(...)");
            if (AbstractC5043h.a(trackable)) {
                return hitResult;
            }
        }
        return null;
    }

    public Anchor L0() {
        Object objB;
        try {
            C4035r.a aVar = C4035r.f34274b;
            Session session = this.f42534Y;
            objB = C4035r.b(session != null ? session.createAnchor(this.f42531V) : null);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        return (Anchor) (C4035r.g(objB) ? null : objB);
    }

    public TrackingState M0() {
        return this.f42532W;
    }

    public void N0(TrackingState trackingState) {
        AbstractC4862t.e(trackingState, "trackingState");
        G0();
    }

    public boolean O0(C6079c detector, MotionEvent e10, Pose pose) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        AbstractC4862t.e(pose, "pose");
        q qVarN = N();
        if (qVarN != null && !((Boolean) qVarN.invoke(detector, e10, AbstractC5042g.b(pose))).booleanValue()) {
            return false;
        }
        R0(pose);
        return true;
    }

    public void P0(Pose pose) {
        AbstractC4862t.e(pose, "pose");
        l lVar = this.f42530U;
        if (lVar != null) {
            lVar.invoke(pose);
        }
    }

    public void Q0(TrackingState value) {
        AbstractC4862t.e(value, "value");
        if (this.f42532W != value) {
            this.f42532W = value;
            N0(value);
        }
    }

    public final void R0(Pose value) {
        AbstractC4862t.e(value, "value");
        if (AbstractC4862t.a(this.f42531V, value)) {
            return;
        }
        this.f42531V = value;
        f.I0(this, AbstractC5042g.c(value), false, 0.0f, 6, null);
        P0(value);
    }

    public void S0(Session session, Frame frame) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(frame, "frame");
        this.f42534Y = session;
        this.f42535Z = frame;
        TrackingState trackingState = frame.getCamera().getTrackingState();
        AbstractC4862t.d(trackingState, "getTrackingState(...)");
        Q0(trackingState);
    }

    @Override // Ab.f
    public boolean e0() {
        return this.f42536a0;
    }

    @Override // Ab.f, vb.C6079c.a
    public boolean f(C6079c detector, MotionEvent e10) {
        Boolean boolValueOf;
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (!d0()) {
            super.f(detector, e10);
            f fVarO = O();
            if (fVarO != null) {
                return fVarO.f(detector, e10);
            }
            return false;
        }
        Frame frame = this.f42535Z;
        if (frame != null) {
            HitResult hitResult = (HitResult) this.f42529T.invoke(this, frame, e10);
            if (hitResult != null) {
                Pose hitPose = hitResult.getHitPose();
                AbstractC4862t.d(hitPose, "getHitPose(...)");
                boolValueOf = Boolean.valueOf(O0(detector, e10, hitPose));
            } else {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }

    @Override // Ab.f
    public boolean h0() {
        return super.h0() && this.f42533X.contains(M0());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC5456d(Engine engine, Pose IDENTITY, q qVar, l lVar, int i10, AbstractC4854k abstractC4854k) {
        if ((i10 & 2) != 0) {
            IDENTITY = Pose.IDENTITY;
            AbstractC4862t.d(IDENTITY, "IDENTITY");
        }
        this(engine, IDENTITY, (i10 & 4) != 0 ? new q() { // from class: pb.c
            @Override // vc.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AbstractC5456d.K0((AbstractC5456d) obj, (Frame) obj2, (MotionEvent) obj3);
            }
        } : qVar, (i10 & 8) != 0 ? null : lVar);
    }
}
