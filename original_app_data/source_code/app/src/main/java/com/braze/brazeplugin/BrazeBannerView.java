package com.braze.brazeplugin;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.braze.brazeplugin.BrazeBannerView;
import com.braze.support.BrazeLogger;
import com.braze.ui.banners.BannerView;
import fc.C4015H;
import io.flutter.plugin.platform.PlatformView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/braze/brazeplugin/BrazeBannerView;", "Lio/flutter/plugin/platform/PlatformView;", "Landroid/content/Context;", "context", "", "", "", "creationParams", "Lcom/braze/brazeplugin/BrazeUIHandler;", "uiHandler", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/content/Context;Ljava/util/Map;Lcom/braze/brazeplugin/BrazeUIHandler;Landroid/app/Activity;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lfc/H;", "dispose", "()V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "bannerUIHandler", "Lcom/braze/brazeplugin/BrazeUIHandler;", "Lcom/braze/ui/banners/BannerView;", "bannerView", "Lcom/braze/ui/banners/BannerView;", "containerId", "Ljava/lang/String;", "braze_plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrazeBannerView implements PlatformView {
    private final Activity activity;
    private final BrazeUIHandler bannerUIHandler;
    private final BannerView bannerView;
    private final String containerId;

    public BrazeBannerView(Context context, Map<String, ? extends Object> map, BrazeUIHandler uiHandler, Activity activity) {
        final BrazeBannerView brazeBannerView;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uiHandler, "uiHandler");
        AbstractC4862t.e(activity, "activity");
        this.activity = activity;
        this.bannerUIHandler = uiHandler;
        BannerView bannerView = new BannerView(context);
        this.bannerView = bannerView;
        bannerView.setBackgroundColor(0);
        Object obj = map != null ? map.get("placementId") : null;
        final String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map != null ? map.get("containerId") : null;
        final String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str == null || str2 == null) {
            brazeBannerView = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeBannerView, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeBannerView._init_$lambda$0(str, str2);
                }
            }, 6, (Object) null);
        } else {
            brazeBannerView = this;
        }
        bannerView.setPlacementId(str);
        brazeBannerView.containerId = str2 == null ? "" : str2;
        bannerView.setHeightCallback(new l() { // from class: S4.c
            @Override // vc.l
            public final Object invoke(Object obj3) {
                return BrazeBannerView._init_$lambda$2(this.f15348a, ((Double) obj3).doubleValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(String str, String str2) {
        return "\n                Invalid empty parameter. Banner will not render properly:\n                - Placement id: " + str + "\n                - Banner container id: " + str2 + "\n                ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H _init_$lambda$2(final BrazeBannerView brazeBannerView, final double d10) {
        brazeBannerView.activity.runOnUiThread(new Runnable() { // from class: S4.d
            @Override // java.lang.Runnable
            public final void run() {
                BrazeBannerView.d(this.f15349a, d10);
            }
        });
        return C4015H.f34254a;
    }

    public static void d(BrazeBannerView brazeBannerView, double d10) {
        brazeBannerView.bannerUIHandler.sendResizeEvent(d10, brazeBannerView.containerId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispose$lambda$3(BrazeBannerView brazeBannerView) {
        brazeBannerView.bannerUIHandler.sendResizeEvent(0.0d, brazeBannerView.containerId);
        brazeBannerView.bannerView.destroy();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.activity.runOnUiThread(new Runnable() { // from class: S4.a
            @Override // java.lang.Runnable
            public final void run() {
                BrazeBannerView.dispose$lambda$3(this.f15343a);
            }
        });
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.bannerView;
    }
}
