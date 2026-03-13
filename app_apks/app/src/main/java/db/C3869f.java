package db;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: db.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3869f implements EventChannel.StreamHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EventChannel.EventSink f33244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventChannel f33245b;

    public C3869f(BinaryMessenger binaryMessenger) {
        AbstractC4862t.e(binaryMessenger, "binaryMessenger");
        EventChannel eventChannel = new EventChannel(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/event");
        this.f33245b = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    public static final void e(C3869f c3869f, String str, String str2, Object obj) {
        EventChannel.EventSink eventSink = c3869f.f33244a;
        if (eventSink != null) {
            eventSink.error(str, str2, obj);
        }
    }

    public static final void g(C3869f c3869f, Map map) {
        EventChannel.EventSink eventSink = c3869f.f33244a;
        if (eventSink != null) {
            eventSink.success(map);
        }
    }

    public final void c() {
        this.f33245b.setStreamHandler(null);
    }

    public final void d(final String errorCode, final String errorMessage, final Object obj) {
        AbstractC4862t.e(errorCode, "errorCode");
        AbstractC4862t.e(errorMessage, "errorMessage");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: db.e
            @Override // java.lang.Runnable
            public final void run() {
                C3869f.e(this.f33240a, errorCode, errorMessage, obj);
            }
        });
    }

    public final void f(final Map event) {
        AbstractC4862t.e(event, "event");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: db.d
            @Override // java.lang.Runnable
            public final void run() {
                C3869f.g(this.f33238a, event);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f33244a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f33244a = eventSink;
    }
}
