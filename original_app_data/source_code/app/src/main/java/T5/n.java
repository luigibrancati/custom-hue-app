package T5;

import android.content.Context;
import androidx.lifecycle.AbstractC2754j;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n extends PlatformViewFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BinaryMessenger f16242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6082a f16243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC6082a f16244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BinaryMessenger messenger, InterfaceC6082a activityProvider, InterfaceC6082a lifecycleProvider) {
        super(StandardMessageCodec.INSTANCE);
        AbstractC4862t.e(messenger, "messenger");
        AbstractC4862t.e(activityProvider, "activityProvider");
        AbstractC4862t.e(lifecycleProvider, "lifecycleProvider");
        this.f16242a = messenger;
        this.f16243b = activityProvider;
        this.f16244c = lifecycleProvider;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        AbstractC4862t.e(context, "context");
        Object objInvoke = this.f16243b.invoke();
        return new m(context, objInvoke instanceof d.p ? (d.p) objInvoke : null, (AbstractC2754j) this.f16244c.invoke(), this.f16242a, i10);
    }
}
