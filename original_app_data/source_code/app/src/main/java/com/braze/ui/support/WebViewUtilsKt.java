package com.braze.ui.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import com.braze.support.BrazeLogger;
import com.braze.ui.support.WebViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import w3.AbstractC6120b;
import w3.AbstractC6123e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/webkit/WebSettings;", "settings", "Landroid/content/Context;", "context", "Lfc/H;", "setWebViewSettings", "(Landroid/webkit/WebSettings;Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class WebViewUtilsKt {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("WebViewUtils");

    @SuppressLint({"SetJavaScriptEnabled"})
    public static final void setWebViewSettings(WebSettings settings, Context context) {
        AbstractC4862t.e(settings, "settings");
        AbstractC4862t.e(context, "context");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        try {
            if (AbstractC6123e.a("FORCE_DARK") && ViewUtils.isDeviceInNightMode(context)) {
                AbstractC6120b.b(settings, 2);
            }
            if (AbstractC6123e.a("FORCE_DARK_STRATEGY")) {
                AbstractC6120b.c(settings, 1);
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, th, false, new InterfaceC6082a() { // from class: O5.l
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return WebViewUtilsKt.setWebViewSettings$lambda$0();
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setWebViewSettings$lambda$0() {
        return "Failed to set dark mode WebView settings.";
    }
}
