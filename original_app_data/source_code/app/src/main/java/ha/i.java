package ha;

import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class i implements EventChannel.StreamHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f36419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EventChannel f36420b;

    public void a(f fVar) {
        this.f36419a = fVar;
    }

    public void b(BinaryMessenger binaryMessenger) {
        if (this.f36420b != null) {
            Log.wtf("StreamHandlerImpl", "Setting a method call handler before the last was disposed.");
            c();
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger, "lyokone/locationstream");
        this.f36420b = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    public void c() {
        EventChannel eventChannel = this.f36420b;
        if (eventChannel == null) {
            Log.d("StreamHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            eventChannel.setStreamHandler(null);
            this.f36420b = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        f fVar = this.f36419a;
        fVar.f36390b.d(fVar.f36394f);
        this.f36419a.f36401m = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        f fVar = this.f36419a;
        fVar.f36401m = eventSink;
        if (fVar.f36389a == null) {
            eventSink.error("NO_ACTIVITY", null, null);
        } else if (fVar.h()) {
            this.f36419a.r();
        } else {
            this.f36419a.m();
        }
    }
}
