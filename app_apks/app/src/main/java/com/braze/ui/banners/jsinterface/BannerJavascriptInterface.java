package com.braze.ui.banners.jsinterface;

import Rd.AbstractC2132i;
import Rd.M;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8G¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/braze/ui/banners/jsinterface/BannerJavascriptInterface;", "Lcom/braze/ui/JavascriptInterfaceBase;", "Landroid/content/Context;", "context", "", "placementId", "Lkotlin/Function1;", "", "Lfc/H;", "setHeightCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lvc/l;)V", "buttonId", "logButtonClick", "(Ljava/lang/String;)V", "logClick", "()V", "height", "setBannerHeight", "(D)V", "requestPushPermission", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", "Lvc/l;", "getSetHeightCallback", "()Lvc/l;", "Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", SentryBaseEvent.JsonKeys.USER, "Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerJavascriptInterface extends JavascriptInterfaceBase {
    private final String placementId;
    private final l setHeightCallback;
    private final BannerUserJavascriptInterface user;

    /* JADX INFO: renamed from: com.braze.ui.banners.jsinterface.BannerJavascriptInterface$requestPushPermission$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.braze.ui.banners.jsinterface.BannerJavascriptInterface$requestPushPermission$2", f = "BannerJavascriptInterface.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends m implements p {
        int label;

        public AnonymousClass2(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new AnonymousClass2(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((AnonymousClass2) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.INSTANCE.getInstance().getActivity());
            return C4015H.f34254a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerJavascriptInterface(Context context, String placementId, l setHeightCallback) {
        super(context);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(placementId, "placementId");
        AbstractC4862t.e(setHeightCallback, "setHeightCallback");
        this.placementId = placementId;
        this.setHeightCallback = setHeightCallback;
        this.user = new BannerUserJavascriptInterface(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Banner logButtonClick() called. Logging banner click with button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$2() {
        return "Banner logClick() called. Logging banner click without button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermission$lambda$5() {
        return "Banner requestPushPermission() called. Requesting push permission now.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$3(double d10) {
        return "Banner setBannerHeight(" + d10 + ") called with invalid height. Height must be a finite number, not NaN, and greater or equal to 0.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$4(double d10) {
        return "Banner setBannerHeight(" + d10 + ") called.";
    }

    @JavascriptInterface
    public final BannerUserJavascriptInterface getUser() {
        return this.user;
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(String buttonId) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: D5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BannerJavascriptInterface.logButtonClick$lambda$1();
            }
        }, 6, (Object) null);
        Braze.INSTANCE.getInstance(getContext()).logBannerClick(this.placementId, buttonId);
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: D5.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BannerJavascriptInterface.logClick$lambda$2();
            }
        }, 6, (Object) null);
        Braze.INSTANCE.getInstance(getContext()).logBannerClick(this.placementId, null);
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: D5.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BannerJavascriptInterface.requestPushPermission$lambda$5();
            }
        }, 6, (Object) null);
        AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass2(null), 3, null);
    }

    @JavascriptInterface
    public final void setBannerHeight(final double height) {
        if (Double.isInfinite(height) || Double.isNaN(height) || height < 0.0d) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: D5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BannerJavascriptInterface.setBannerHeight$lambda$3(height);
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: D5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BannerJavascriptInterface.setBannerHeight$lambda$4(height);
                }
            }, 6, (Object) null);
            this.setHeightCallback.invoke(Double.valueOf(height));
        }
    }
}
