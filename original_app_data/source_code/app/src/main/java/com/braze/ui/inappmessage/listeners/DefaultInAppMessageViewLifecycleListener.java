package com.braze.ui.inappmessage.listeners;

import Rd.AbstractC2132i;
import Rd.M;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.f;
import nc.m;
import vc.InterfaceC6082a;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0019R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageViewLifecycleListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "<init>", "()V", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lfc/H;", "performInAppMessageButtonClicked", "(Lcom/braze/models/inappmessage/MessageButton;Lcom/braze/models/inappmessage/IInAppMessage;)V", "performInAppMessageClicked", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "Landroid/net/Uri;", "clickUri", "", "openUriInWebview", "performClickAction", "(Lcom/braze/enums/inappmessage/ClickAction;Lcom/braze/models/inappmessage/IInAppMessage;Landroid/net/Uri;Z)V", "startClearHtmlInAppMessageAssetsThread", "Landroid/view/View;", "inAppMessageView", "beforeOpened", "(Landroid/view/View;Lcom/braze/models/inappmessage/IInAppMessage;)V", "afterOpened", "beforeClosed", "afterClosed", "onClicked", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "inAppMessageImmersive", "onButtonClicked", "(Lcom/braze/models/inappmessage/MessageButton;Lcom/braze/models/inappmessage/IInAppMessageImmersive;)V", "onDismissed", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "inAppMessageManager", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultInAppMessageViewLifecycleListener implements IInAppMessageViewLifecycleListener {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClickAction.values().length];
            try {
                iArr[ClickAction.URI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClickAction.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1", f = "DefaultInAppMessageViewLifecycleListener.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends m implements p {
        int label;

        public AnonymousClass1(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new AnonymousClass1(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((AnonymousClass1) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Activity activity = BrazeInAppMessageManager.INSTANCE.getInstance().getActivity();
            if (activity != null) {
                BrazeFileUtils.deleteFileOrDirectory(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(activity));
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String afterClosed$lambda$3() {
        return "IInAppMessageViewLifecycleListener.afterClosed called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String afterOpened$lambda$1() {
        return "IInAppMessageViewLifecycleListener.afterOpened called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String beforeClosed$lambda$2() {
        return "IInAppMessageViewLifecycleListener.beforeClosed called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String beforeOpened$lambda$0() {
        return "IInAppMessageViewLifecycleListener.beforeOpened called.";
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onButtonClicked$lambda$5() {
        return "IInAppMessageViewLifecycleListener.onButtonClicked called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onClicked$lambda$4() {
        return "IInAppMessageViewLifecycleListener.onClicked called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onDismissed$lambda$6() {
        return "IInAppMessageViewLifecycleListener.onDismissed called.";
    }

    private final void performClickAction(ClickAction clickAction, IInAppMessage inAppMessage, Uri clickUri, boolean openUriInWebview) {
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$7();
                }
            }, 6, (Object) null);
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[clickAction.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
                return;
            } else {
                getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
                return;
            }
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        if (clickUri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$8();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
        UriAction uriActionCreateUriActionFromUri = companion.getInstance().createUriActionFromUri(clickUri, BundleUtils.toBundle(inAppMessage.getExtras()), openUriInWebview, Channel.INAPP_MESSAGE);
        Context mApplicationContext = getInAppMessageManager().getMApplicationContext();
        if (mApplicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$9();
                }
            }, 7, (Object) null);
        } else {
            companion.getInstance().gotoUri(mApplicationContext, uriActionCreateUriActionFromUri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performClickAction$lambda$7() {
        return "Can't perform click action because the cached activity is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performClickAction$lambda$8() {
        return "clickUri is null, not performing click action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performClickAction$lambda$9() {
        return "appContext is null, not performing click action";
    }

    private final void performInAppMessageButtonClicked(MessageButton messageButton, IInAppMessage inAppMessage) {
        performClickAction(messageButton.getClickAction(), inAppMessage, messageButton.getUri(), messageButton.getOpenUriInWebview());
    }

    private final void performInAppMessageClicked(IInAppMessage inAppMessage) {
        performClickAction(inAppMessage.getInternalClickAction(), inAppMessage, inAppMessage.getInternalUri(), inAppMessage.getOpenUriInWebView());
    }

    private final void startClearHtmlInAppMessageAssetsThread() {
        AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterClosed(IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageViewLifecycleListener.afterClosed$lambda$3();
            }
        }, 7, (Object) null);
        getInAppMessageManager().resetAfterInAppMessageClose();
        if (inAppMessage instanceof IInAppMessageHtml) {
            startClearHtmlInAppMessageAssetsThread();
        }
        inAppMessage.onAfterClosed();
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewClosed(inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessageView, "inAppMessageView");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageViewLifecycleListener.afterOpened$lambda$1();
            }
        }, 7, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewOpened(inAppMessageView, inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeClosed(View inAppMessageView, IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessageView, "inAppMessageView");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewClosed(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.d
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageViewLifecycleListener.beforeClosed$lambda$2();
            }
        }, 7, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessageView, "inAppMessageView");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewOpened(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageViewLifecycleListener.beforeOpened$lambda$0();
            }
        }, 7, (Object) null);
        inAppMessage.logImpression();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onButtonClicked(MessageButton messageButton, IInAppMessageImmersive inAppMessageImmersive) {
        AbstractC4862t.e(messageButton, "messageButton");
        AbstractC4862t.e(inAppMessageImmersive, "inAppMessageImmersive");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageViewLifecycleListener.onButtonClicked$lambda$5();
            }
        }, 7, (Object) null);
        inAppMessageImmersive.logButtonClick(messageButton);
        if (getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton)) {
            return;
        }
        performInAppMessageButtonClicked(messageButton, inAppMessageImmersive);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onClicked(View inAppMessageView, IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessageView, "inAppMessageView");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageViewLifecycleListener.onClicked$lambda$4();
            }
        }, 7, (Object) null);
        inAppMessage.logClick();
        if (getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage)) {
            return;
        }
        performInAppMessageClicked(inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onDismissed(View inAppMessageView, IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessageView, "inAppMessageView");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: L5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DefaultInAppMessageViewLifecycleListener.onDismissed$lambda$6();
            }
        }, 7, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(inAppMessage);
    }
}
