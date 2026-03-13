package com.braze.brazeplugin;

import android.app.Activity;
import android.content.Context;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/braze/brazeplugin/BrazeBannerViewFactory;", "Lio/flutter/plugin/platform/PlatformViewFactory;", "Lcom/braze/brazeplugin/BrazeUIHandler;", "uiHandler", "Landroid/app/Activity;", "activity", "<init>", "(Lcom/braze/brazeplugin/BrazeUIHandler;Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "", "id", "", "args", "Lio/flutter/plugin/platform/PlatformView;", "create", "(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/PlatformView;", "Lcom/braze/brazeplugin/BrazeUIHandler;", "getUiHandler", "()Lcom/braze/brazeplugin/BrazeUIHandler;", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "braze_plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrazeBannerViewFactory extends PlatformViewFactory {
    private final Activity activity;
    private final BrazeUIHandler uiHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeBannerViewFactory(BrazeUIHandler uiHandler, Activity activity) {
        super(StandardMessageCodec.INSTANCE);
        AbstractC4862t.e(uiHandler, "uiHandler");
        AbstractC4862t.e(activity, "activity");
        this.uiHandler = uiHandler;
        this.activity = activity;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int id2, Object args) {
        AbstractC4862t.e(context, "context");
        return new BrazeBannerView(context, args instanceof Map ? (Map) args : null, this.uiHandler, this.activity);
    }
}
