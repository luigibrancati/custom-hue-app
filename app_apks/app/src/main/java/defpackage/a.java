package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventChannel.EventSink f20457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6082a f20458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Handler handler, EventChannel.EventSink eventSink, InterfaceC6082a getAutoRotationIsUnlocked) {
        super(handler);
        AbstractC4862t.e(handler, "handler");
        AbstractC4862t.e(eventSink, "eventSink");
        AbstractC4862t.e(getAutoRotationIsUnlocked, "getAutoRotationIsUnlocked");
        this.f20457a = eventSink;
        this.f20458b = getAutoRotationIsUnlocked;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        this.f20457a.success(this.f20458b.invoke());
    }
}
