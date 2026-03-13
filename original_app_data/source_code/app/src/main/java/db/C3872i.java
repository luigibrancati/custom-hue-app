package db;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: db.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3872i extends OrientationEventListener implements EventChannel.StreamHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f33248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EventChannel.EventSink f33249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlatformChannel.DeviceOrientation f33250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3872i(Activity activity) {
        super(activity, 3);
        AbstractC4862t.e(activity, "activity");
        this.f33248a = activity;
    }

    public static final void c(C3872i c3872i, PlatformChannel.DeviceOrientation deviceOrientation) {
        EventChannel.EventSink eventSink = c3872i.f33249b;
        if (eventSink != null) {
            eventSink.success(fb.b.a(deviceOrientation));
        }
    }

    public final PlatformChannel.DeviceOrientation b() {
        PlatformChannel.DeviceOrientation deviceOrientation = this.f33250c;
        return deviceOrientation == null ? PlatformChannel.DeviceOrientation.PORTRAIT_UP : deviceOrientation;
    }

    public final void d() {
        if (canDetectOrientation()) {
            enable();
        }
    }

    public final void e() {
        disable();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f33249b = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f33249b = eventSink;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i10) {
        if (i10 == -1) {
            return;
        }
        final PlatformChannel.DeviceOrientation deviceOrientation = (45 > i10 || i10 >= 135) ? (135 > i10 || i10 >= 225) ? (225 > i10 || i10 >= 315) ? PlatformChannel.DeviceOrientation.PORTRAIT_UP : PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT : PlatformChannel.DeviceOrientation.PORTRAIT_DOWN : PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT;
        if (deviceOrientation != this.f33250c) {
            this.f33250c = deviceOrientation;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: db.h
                @Override // java.lang.Runnable
                public final void run() {
                    C3872i.c(this.f33246a, deviceOrientation);
                }
            });
        }
    }
}
