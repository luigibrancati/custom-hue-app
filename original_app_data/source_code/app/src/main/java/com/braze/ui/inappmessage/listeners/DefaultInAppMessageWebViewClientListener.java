package com.braze.ui.inappmessage.listeners;

import Od.F;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "<init>", "()V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "", "url", "Landroid/os/Bundle;", "queryBundle", "Lfc/H;", "onCloseAction", "(Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;Landroid/os/Bundle;)V", "onCustomEventAction", "onOtherUrlAction", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "inAppMessageManager", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener$Companion;", "", "<init>", "()V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Landroid/os/Bundle;", "queryBundle", "", "parseUseWebViewFromQueryBundle", "(Lcom/braze/models/inappmessage/IInAppMessage;Landroid/os/Bundle;)Z", "Lfc/H;", "logHtmlInAppMessageClick", "(Lcom/braze/models/inappmessage/IInAppMessage;Landroid/os/Bundle;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void logHtmlInAppMessageClick(IInAppMessage inAppMessage, Bundle queryBundle) {
            AbstractC4862t.e(inAppMessage, "inAppMessage");
            AbstractC4862t.e(queryBundle, "queryBundle");
            if (!queryBundle.containsKey("abButtonId")) {
                if (inAppMessage.getMessageType() == MessageType.HTML_FULL) {
                    inAppMessage.logClick();
                }
            } else {
                IInAppMessageHtml iInAppMessageHtml = (IInAppMessageHtml) inAppMessage;
                String string = queryBundle.getString("abButtonId");
                if (string != null) {
                    iInAppMessageHtml.logButtonClick(string);
                }
            }
        }

        public final boolean parseUseWebViewFromQueryBundle(IInAppMessage inAppMessage, Bundle queryBundle) {
            boolean z10;
            boolean z11;
            boolean z12;
            AbstractC4862t.e(inAppMessage, "inAppMessage");
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
            return z11 ? (z10 || z12) ? false : true : inAppMessage.getOpenUriInWebView();
        }

        private Companion() {
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$0() {
        return "IInAppMessageWebViewClientListener.onCloseAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$1() {
        return "IInAppMessageWebViewClientListener.onCloseAction finished.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$2() {
        return "IInAppMessageWebViewClientListener.onCustomEventAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$3() {
        return "Can't perform custom event action because the activity is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$5() {
        return "IInAppMessageWebViewClientListener.onOtherUrlAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$6(String str) {
        return "Can't perform other url action because the cached activity is null. Url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$7(String str) {
        return "HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$8(String str) {
        return "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$9(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str;
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCloseAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.p
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$0();
            }
        }, 7, (Object) null);
        INSTANCE.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(inAppMessage, url, queryBundle);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.q
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$1();
            }
        }, 7, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCustomEventAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        BrazeWebViewClient.Companion companion;
        String customEventNameFromQueryBundle;
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.r
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$2();
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.s
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$3();
                }
            }, 6, (Object) null);
            return;
        }
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(inAppMessage, url, queryBundle) || (customEventNameFromQueryBundle = (companion = BrazeWebViewClient.INSTANCE).parseCustomEventNameFromQueryBundle(queryBundle)) == null || F.k0(customEventNameFromQueryBundle)) {
            return;
        }
        BrazeProperties propertiesFromQueryBundle = companion.parsePropertiesFromQueryBundle(queryBundle);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            Braze.INSTANCE.getInstance(activity).logCustomEvent(customEventNameFromQueryBundle, propertiesFromQueryBundle);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onOtherUrlAction(IInAppMessage inAppMessage, final String url, Bundle queryBundle) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$5();
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.l
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$6(url);
                }
            }, 6, (Object) null);
            return;
        }
        Companion companion = INSTANCE;
        companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(inAppMessage, url, queryBundle)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.m
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$7(url);
                }
            }, 6, (Object) null);
            return;
        }
        boolean useWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(inAppMessage, queryBundle);
        Bundle bundle = BundleUtils.toBundle(inAppMessage.getExtras());
        bundle.putAll(queryBundle);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.INSTANCE;
        UriAction uriActionCreateUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(url, bundle, useWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (uriActionCreateUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$8(url);
                }
            }, 6, (Object) null);
            return;
        }
        final Uri uri = uriActionCreateUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.o
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$9(uri, url);
                }
            }, 6, (Object) null);
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            companion2.getInstance().gotoUri(activity, uriActionCreateUriActionFromUrlString);
        }
    }
}
