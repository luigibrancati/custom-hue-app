package Ea;

import android.content.Context;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements EventChannel.StreamHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3377a;

    public b(Context context) {
        AbstractC4862t.e(context, "context");
        this.f3377a = context;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        if (eventSink != null) {
            eventSink.success(0);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
    }
}
