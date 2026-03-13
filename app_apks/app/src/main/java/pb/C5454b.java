package pb;

import android.view.MotionEvent;
import com.google.android.filament.Engine;
import com.google.ar.core.Anchor;
import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import gc.T;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vb.C6079c;
import vc.l;

/* JADX INFO: renamed from: pb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5454b extends AbstractC5456d {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public l f42520b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public l f42521c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public l f42522d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f42523e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Anchor f42524f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public TrackingState f42525g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Set f42526h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f42527i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f42528j0;

    public /* synthetic */ C5454b(Engine engine, Anchor anchor, l lVar, l lVar2, l lVar3, l lVar4, int i10, AbstractC4854k abstractC4854k) {
        this(engine, anchor, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : lVar2, (i10 & 16) != 0 ? null : lVar3, (i10 & 32) != 0 ? null : lVar4);
    }

    @Override // Ab.f
    public void H() {
        T0();
        super.H();
    }

    @Override // pb.AbstractC5456d
    public void S0(Session session, Frame frame) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(frame, "frame");
        super.S0(session, frame);
        if (!this.f42528j0 && frame.getUpdatedAnchors().contains(this.f42524f0)) {
            TrackingState trackingState = this.f42524f0.getTrackingState();
            AbstractC4862t.d(trackingState, "getTrackingState(...)");
            W0(trackingState);
            if (U0() == TrackingState.TRACKING && this.f42523e0) {
                Pose pose = this.f42524f0.getPose();
                AbstractC4862t.d(pose, "getPose(...)");
                R0(pose);
            }
            l lVar = this.f42522d0;
            if (lVar != null) {
                lVar.invoke(this.f42524f0);
            }
        }
    }

    public void T0() {
        this.f42524f0.detach();
    }

    public TrackingState U0() {
        TrackingState trackingState = this.f42524f0.getTrackingState();
        AbstractC4862t.d(trackingState, "getTrackingState(...)");
        return trackingState;
    }

    public final void V0(Anchor value) {
        AbstractC4862t.e(value, "value");
        this.f42524f0 = value;
        TrackingState trackingState = value.getTrackingState();
        AbstractC4862t.d(trackingState, "getTrackingState(...)");
        W0(trackingState);
        Pose pose = value.getPose();
        AbstractC4862t.d(pose, "getPose(...)");
        R0(pose);
        l lVar = this.f42521c0;
        if (lVar != null) {
            lVar.invoke(value);
        }
    }

    public void W0(TrackingState value) {
        AbstractC4862t.e(value, "value");
        if (this.f42525g0 != value) {
            this.f42525g0 = value;
            G0();
            l lVar = this.f42520b0;
            if (lVar != null) {
                lVar.invoke(value);
            }
        }
    }

    @Override // Ab.f, vb.C6079c.a
    public boolean a(C6079c detector, MotionEvent e10) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        super.a(detector, e10);
        if (d0()) {
            T0();
            this.f42528j0 = true;
        }
        return true;
    }

    @Override // Ab.f
    public boolean d0() {
        return this.f42527i0;
    }

    @Override // Ab.f, vb.C6079c.a
    public void e(C6079c detector, MotionEvent e10) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        super.e(detector, e10);
        if (d0()) {
            Anchor anchorL0 = L0();
            if (anchorL0 != null) {
                V0(anchorL0);
            }
            this.f42528j0 = false;
        }
    }

    @Override // pb.AbstractC5456d, Ab.f
    public boolean h0() {
        if (super.h0()) {
            return this.f42526h0.contains(U0()) || this.f42528j0;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5454b(Engine engine, Anchor anchor, l lVar, l lVar2, l lVar3, l lVar4) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(anchor, "anchor");
        Pose pose = anchor.getPose();
        AbstractC4862t.d(pose, "getPose(...)");
        super(engine, pose, null, lVar2, 4, null);
        this.f42520b0 = lVar;
        this.f42521c0 = lVar3;
        this.f42522d0 = lVar4;
        this.f42523e0 = true;
        this.f42524f0 = anchor;
        TrackingState trackingState = anchor.getTrackingState();
        AbstractC4862t.d(trackingState, "getTrackingState(...)");
        this.f42525g0 = trackingState;
        this.f42526h0 = T.c(TrackingState.TRACKING);
        this.f42527i0 = true;
        G0();
    }
}
