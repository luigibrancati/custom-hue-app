package mb;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import fc.C4015H;
import fc.C4029l;
import fc.InterfaceC4028k;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;

/* JADX INFO: renamed from: mb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5037b extends Session {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f40270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f40271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f40272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f40273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Frame f40279j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5037b(final Context context, Set features, l onResumed, l onPaused, p onConfigChanged) {
        super(context, features);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(features, "features");
        AbstractC4862t.e(onResumed, "onResumed");
        AbstractC4862t.e(onPaused, "onPaused");
        AbstractC4862t.e(onConfigChanged, "onConfigChanged");
        this.f40270a = onResumed;
        this.f40271b = onPaused;
        this.f40272c = onConfigChanged;
        this.f40273d = C4029l.b(new InterfaceC6082a() { // from class: mb.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C5037b.b(context);
            }
        });
        this.f40274e = c().getRotation();
        this.f40275f = c().getWidth();
        this.f40276g = c().getHeight();
    }

    public static final Display b(Context context) {
        Object systemService = context.getSystemService("window");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return ((WindowManager) systemService).getDefaultDisplay();
    }

    public final Display c() {
        Object value = this.f40273d.getValue();
        AbstractC4862t.d(value, "getValue(...)");
        return (Display) value;
    }

    @Override // com.google.ar.core.Session
    public void configure(Config config) {
        AbstractC4862t.e(config, "config");
        super.configure(config);
        Config.DepthMode depthMode = config.getDepthMode();
        Config.DepthMode depthMode2 = Config.DepthMode.DISABLED;
        if (depthMode != depthMode2 && !isDepthModeSupported(config.getDepthMode())) {
            config.setDepthMode(depthMode2);
        }
        if (getCameraConfig().getFacingDirection() == CameraConfig.FacingDirection.FRONT) {
            Config.LightEstimationMode lightEstimationMode = config.getLightEstimationMode();
            Config.LightEstimationMode lightEstimationMode2 = Config.LightEstimationMode.DISABLED;
            if (lightEstimationMode != lightEstimationMode2) {
                config.setLightEstimationMode(lightEstimationMode2);
            }
        }
        this.f40278i = config.getAugmentedImageDatabase().getNumImages() > 0;
        this.f40272c.invoke(this, config);
    }

    public final Frame d() {
        if (this.f40277h) {
            Frame frameUpdate = super.update();
            frame = frameUpdate.getTimestamp() != 0 ? frameUpdate : null;
            this.f40279j = frame;
        }
        return frame;
    }

    @Override // com.google.ar.core.Session
    public void pause() {
        super.pause();
        C4015H c4015h = C4015H.f34254a;
        this.f40277h = false;
        this.f40271b.invoke(this);
    }

    @Override // com.google.ar.core.Session
    public void resume() {
        this.f40277h = true;
        super.resume();
        setDisplayGeometry(this.f40274e, this.f40275f, this.f40276g);
        this.f40270a.invoke(this);
    }

    @Override // com.google.ar.core.Session
    public void setDisplayGeometry(int i10, int i11, int i12) {
        this.f40274e = i10;
        this.f40275f = i11;
        this.f40276g = i12;
        if (this.f40277h) {
            super.setDisplayGeometry(i10, i11, i12);
        }
    }
}
