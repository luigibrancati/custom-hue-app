package com.braze.ui.banners.listeners;

import Od.F;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener;", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "Landroid/os/Bundle;", "queryBundle", "Lfc/H;", "onCloseAction", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "onCustomEventAction", "onOtherUrlAction", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultBannerWebViewClientListener implements IBannerWebViewClientListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener$Companion;", "", "<init>", "()V", "parseUseWebViewFromQueryBundle", "", "queryBundle", "Landroid/os/Bundle;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final boolean parseUseWebViewFromQueryBundle(Bundle queryBundle) {
            boolean z10;
            boolean z11;
            boolean z12;
            AbstractC4862t.e(queryBundle, "queryBundle");
            if (queryBundle.containsKey("abDeepLink")) {
                z10 = Boolean.parseBoolean(queryBundle.getString("abDeepLink"));
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            if (queryBundle.containsKey("abExternalOpen")) {
                z12 = Boolean.parseBoolean(queryBundle.getString("abExternalOpen"));
                z11 = true;
            } else {
                z12 = false;
            }
            if (z11) {
                return (z10 || z12) ? false : true;
            }
            return true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$0() {
        return "Close action not available on Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$1() {
        return "DefaultBannerWebViewClientListener.onCustomEventAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$2() {
        return "DefaultBannerWebViewClientListener.onOtherUrlAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$3(String str) {
        return "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$4(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str + ".";
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onCloseAction(Context context, String url, Bundle queryBundle) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: E5.d
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultBannerWebViewClientListener.onCloseAction$lambda$0();
            }
        }, 6, (Object) null);
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onCustomEventAction(Context context, String url, Bundle queryBundle) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: E5.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultBannerWebViewClientListener.onCustomEventAction$lambda$1();
            }
        }, 7, (Object) null);
        BrazeWebViewClient.Companion companion = BrazeWebViewClient.INSTANCE;
        String customEventNameFromQueryBundle = companion.parseCustomEventNameFromQueryBundle(queryBundle);
        if (customEventNameFromQueryBundle == null || F.k0(customEventNameFromQueryBundle)) {
            return;
        }
        Braze.INSTANCE.getInstance(context).logCustomEvent(customEventNameFromQueryBundle, companion.parsePropertiesFromQueryBundle(queryBundle));
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onOtherUrlAction(Context context, final String url, Bundle queryBundle) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: E5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$2();
            }
        }, 7, (Object) null);
        boolean useWebViewFromQueryBundle = INSTANCE.parseUseWebViewFromQueryBundle(queryBundle);
        BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
        UriAction uriActionCreateUriActionFromUrlString = companion.getInstance().createUriActionFromUrlString(url, queryBundle, useWebViewFromQueryBundle, Channel.BANNER);
        if (uriActionCreateUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: E5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$3(url);
                }
            }, 6, (Object) null);
            return;
        }
        final Uri uri = uriActionCreateUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: E5.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$4(uri, url);
                }
            }, 6, (Object) null);
        } else {
            companion.getInstance().gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }
}
