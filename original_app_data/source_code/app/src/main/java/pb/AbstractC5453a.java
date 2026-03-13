package pb;

import com.google.android.filament.Engine;
import com.google.ar.core.Camera;
import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import kotlin.jvm.internal.AbstractC4862t;
import mb.AbstractC5039d;
import mb.AbstractC5042g;

/* JADX INFO: renamed from: pb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5453a extends Ab.b {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Pose f42516Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TrackingState f42517a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Session f42518b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Frame f42519c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5453a(Engine engine) {
        super(engine, null, 2, null);
        AbstractC4862t.e(engine, "engine");
        this.f42517a0 = TrackingState.STOPPED;
    }

    public void Q0(Camera camera) {
        AbstractC4862t.e(camera, "camera");
        TrackingState trackingState = camera.getTrackingState();
        AbstractC4862t.d(trackingState, "getTrackingState(...)");
        T0(trackingState);
        S0(camera.getDisplayOrientedPose());
        C(AbstractC5039d.a(camera, u(), A()));
    }

    public void R0(TrackingState trackingState) {
        AbstractC4862t.e(trackingState, "trackingState");
    }

    public void S0(Pose pose) {
        if (AbstractC4862t.a(this.f42516Z, pose)) {
            return;
        }
        this.f42516Z = pose;
        if (pose != null) {
            E0(AbstractC5042g.c(pose));
        }
    }

    public void T0(TrackingState value) {
        AbstractC4862t.e(value, "value");
        if (this.f42517a0 != value) {
            this.f42517a0 = value;
            R0(value);
        }
    }

    public void U0(Session session, Frame frame) {
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(frame, "frame");
        this.f42518b0 = session;
        this.f42519c0 = frame;
        Camera camera = frame.getCamera();
        AbstractC4862t.d(camera, "getCamera(...)");
        Q0(camera);
    }
}
