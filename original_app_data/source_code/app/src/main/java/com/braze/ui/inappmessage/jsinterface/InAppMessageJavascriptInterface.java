package com.braze.ui.inappmessage.jsinterface;

import Rd.M;
import Rd.X;
import Rd.a1;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import fc.AbstractC4036s;
import fc.C4015H;
import io.sentry.SentryBaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.f;
import nc.m;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageJavascriptInterface;", "Lcom/braze/ui/JavascriptInterfaceBase;", "Landroid/content/Context;", "context", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "inAppMessage", "<init>", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessageHtml;)V", "", "buttonId", "Lfc/H;", "logButtonClick", "(Ljava/lang/String;)V", "logClick", "()V", "beforeMessageClosed", "requestPushPermission", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", SentryBaseEvent.JsonKeys.USER, "Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "", "wasCloseMessageCalled", "Z", "getWasCloseMessageCalled", "()Z", "setWasCloseMessageCalled", "(Z)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InAppMessageJavascriptInterface extends JavascriptInterfaceBase {
    private final IInAppMessageHtml inAppMessage;
    private final InAppMessageUserJavascriptInterface user;
    private boolean wasCloseMessageCalled;

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfc/H;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1", f = "InAppMessageJavascriptInterface.kt", l = {52}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends m implements l {
        int label;

        /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1", f = "InAppMessageJavascriptInterface.kt", l = {55}, m = "invokeSuspend")
        public static final class C03541 extends m implements p {
            private /* synthetic */ Object L$0;
            int label;

            public C03541(InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String invokeSuspend$lambda$0() {
                return "Waiting for IAM to be fully closed before requesting push prompt";
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C03541 c03541 = new C03541(interfaceC4988e);
                c03541.L$0 = obj;
                return c03541;
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((C03541) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.L$0, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: com.braze.ui.inappmessage.jsinterface.b
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return InAppMessageJavascriptInterface.AnonymousClass1.C03541.invokeSuspend$lambda$0();
                        }
                    }, 6, (Object) null);
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                while (BrazeInAppMessageManager.INSTANCE.getInstance().isCurrentlyDisplayingInAppMessage()) {
                    this.label = 1;
                    if (X.a(25L, this) == objF) {
                        return objF;
                    }
                }
                return C4015H.f34254a;
            }
        }

        public AnonymousClass1(InterfaceC4988e interfaceC4988e) {
            super(1, interfaceC4988e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Requesting push prompt from Braze bridge html interface";
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
            return InAppMessageJavascriptInterface.this.new AnonymousClass1(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                if (InAppMessageJavascriptInterface.this.getWasCloseMessageCalled()) {
                    C03541 c03541 = new C03541(null);
                    this.label = 1;
                    if (a1.c(2500L, c03541, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) InAppMessageJavascriptInterface.this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: com.braze.ui.inappmessage.jsinterface.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return InAppMessageJavascriptInterface.AnonymousClass1.invokeSuspend$lambda$0();
                }
            }, 6, (Object) null);
            PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.INSTANCE.getInstance().getActivity());
            return C4015H.f34254a;
        }

        @Override // vc.l
        public final Object invoke(InterfaceC4988e interfaceC4988e) {
            return ((AnonymousClass1) create(interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageJavascriptInterface(Context context, IInAppMessageHtml inAppMessage) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        this.inAppMessage = inAppMessage;
        this.user = new InAppMessageUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public final void beforeMessageClosed() {
        this.wasCloseMessageCalled = true;
    }

    @JavascriptInterface
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.user;
    }

    public final boolean getWasCloseMessageCalled() {
        return this.wasCloseMessageCalled;
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(String buttonId) {
        if (buttonId != null) {
            this.inAppMessage.logButtonClick(buttonId);
        }
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        this.inAppMessage.logClick();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeInAppMessageManager.INSTANCE.getInstance().setShouldNextUnregisterBeSkipped(true);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 75L, null, new AnonymousClass1(null), 2, null);
    }
}
