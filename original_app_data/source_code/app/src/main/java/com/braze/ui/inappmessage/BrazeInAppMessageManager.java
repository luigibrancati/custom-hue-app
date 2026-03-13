package com.braze.ui.inappmessage;

import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.M;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4032o;
import gc.y;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import nc.f;
import nc.m;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J \u0010!\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0019H\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010&\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020\rH\u0000¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010,\u001a\u00020\rH\u0000¢\u0006\u0004\b+\u0010\u0003R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010\u0003R&\u00105\u001a\b\u0012\u0004\u0012\u00020\u0015048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010\u0003\u001a\u0004\b7\u00108R#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010MR*\u0010N\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bS\u0010\u0003\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010\u0018R*\u0010T\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bT\u0010O\u0012\u0004\bW\u0010\u0003\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010\u0018R\u0011\u0010X\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bX\u0010\u001b¨\u0006Z"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "<init>", "()V", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "createInAppMessageEventSubscriber", "()Lcom/braze/events/IEventSubscriber;", "Landroid/content/Context;", "context", "Lcom/braze/events/BrazeUserChangeEvent;", "createBrazeUserChangeEventSubscriber", "(Landroid/content/Context;)Lcom/braze/events/IEventSubscriber;", "Lfc/H;", "ensureSubscribedToInAppMessageEvents", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "registerInAppMessageManager", "(Landroid/app/Activity;)V", "unregisterInAppMessageManager", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "addInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "", "requestDisplayInAppMessage", "()Z", "dismissed", "hideCurrentlyDisplayingInAppMessage", "(Z)V", "resetAfterInAppMessageClose", "isCarryOver", "displayInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;ZLlc/e;)Ljava/lang/Object;", "verifyOrientationStatus", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "", "currentUserId", "isInAppMessageForTheSameUser", "(Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;)Z", "pauseWebviewIfNecessary$android_sdk_ui_release", "pauseWebviewIfNecessary", "resumeWebviewIfNecessary$android_sdk_ui_release", "resumeWebviewIfNecessary", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "displayingInAppMessage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDisplayingInAppMessage$annotations", "Ljava/util/Stack;", "inAppMessageStack", "Ljava/util/Stack;", "getInAppMessageStack", "()Ljava/util/Stack;", "getInAppMessageStack$annotations", "", "inAppMessageEventMap", "Ljava/util/Map;", "getInAppMessageEventMap", "()Ljava/util/Map;", "inAppMessageEventSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "brazeUserChangeEventSubscriber", "", "originalOrientation", "Ljava/lang/Integer;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "inAppMessageViewWrapper", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "Ljava/lang/String;", "carryoverInAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getCarryoverInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "setCarryoverInAppMessage", "getCarryoverInAppMessage$annotations", "unregisteredInAppMessage", "getUnregisteredInAppMessage", "setUnregisteredInAppMessage", "getUnregisteredInAppMessage$annotations", "isCurrentlyDisplayingInAppMessage", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public class BrazeInAppMessageManager extends InAppMessageManagerBase {
    private static volatile BrazeInAppMessageManager instance;
    private IEventSubscriber<BrazeUserChangeEvent> brazeUserChangeEventSubscriber;
    private IInAppMessage carryoverInAppMessage;
    private BrazeConfigurationProvider configurationProvider;
    private String currentUserId;
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;
    private IInAppMessageViewWrapper inAppMessageViewWrapper;
    private Integer originalOrientation;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private IInAppMessage unregisteredInAppMessage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock instanceLock = new ReentrantLock();
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager$Companion;", "", "<init>", "()V", "Lcom/braze/models/inappmessage/IInAppMessage;", "", "containsPushPermissionPrompt", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInstance", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Ljava/util/concurrent/locks/ReentrantLock;", "instanceLock", "Ljava/util/concurrent/locks/ReentrantLock;", "instance", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            return iInAppMessage instanceof InAppMessageHtml ? ((InAppMessageHtml) iInAppMessage).isPushPrimer() : BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }

        public final BrazeInAppMessageManager getInstance() {
            if (BrazeInAppMessageManager.instance != null) {
                BrazeInAppMessageManager brazeInAppMessageManager = BrazeInAppMessageManager.instance;
                AbstractC4862t.c(brazeInAppMessageManager, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager;
            }
            ReentrantLock reentrantLock = BrazeInAppMessageManager.instanceLock;
            reentrantLock.lock();
            try {
                if (BrazeInAppMessageManager.instance == null) {
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                C4015H c4015h = C4015H.f34254a;
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                AbstractC4862t.c(brazeInAppMessageManager2, "null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
                return brazeInAppMessageManager2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            try {
                iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppMessageOperation.REENQUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MessageType.values().length];
            try {
                iArr2[MessageType.HTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MessageType.HTML_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @f(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager", f = "BrazeInAppMessageManager.kt", l = {590}, m = "displayInAppMessage$suspendImpl")
    public static final class AnonymousClass1 extends AbstractC5160d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrazeInAppMessageManager.displayInAppMessage$suspendImpl(BrazeInAppMessageManager.this, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1", f = "BrazeInAppMessageManager.kt", l = {}, m = "invokeSuspend")
    public static final class C31361 extends m implements p {
        final /* synthetic */ IInAppMessageViewWrapper $inAppMessageWrapperView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31361(IInAppMessageViewWrapper iInAppMessageViewWrapper, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$inAppMessageWrapperView = iInAppMessageViewWrapper;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C31361(this.$inAppMessageWrapperView, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C31361) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            this.$inAppMessageWrapperView.close();
            return C4015H.f34254a;
        }
    }

    private final IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber(Context context) {
        return new IEventSubscriber() { // from class: J5.K
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57(this.f6236a, (BrazeUserChangeEvent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBrazeUserChangeEventSubscriber$lambda$57(final BrazeInAppMessageManager brazeInAppMessageManager, final BrazeUserChangeEvent event) {
        AbstractC4862t.e(event, "event");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.Y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$54(event);
            }
        }, 6, (Object) null);
        final String currentUserId = event.getCurrentUserId();
        brazeInAppMessageManager.currentUserId = currentUserId;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.Z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$55(currentUserId);
            }
        }, 7, (Object) null);
        y.I(brazeInAppMessageManager.inAppMessageStack, new l() { // from class: J5.a0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$56(this.f6244a, currentUserId, (IInAppMessage) obj));
            }
        });
        if (!brazeInAppMessageManager.isInAppMessageForTheSameUser(brazeInAppMessageManager.carryoverInAppMessage, currentUserId)) {
            brazeInAppMessageManager.carryoverInAppMessage = null;
        }
        if (!brazeInAppMessageManager.isInAppMessageForTheSameUser(brazeInAppMessageManager.unregisteredInAppMessage, currentUserId)) {
            brazeInAppMessageManager.unregisteredInAppMessage = null;
        }
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$57$lambda$54(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "InAppMessage manager handling new current user id: '" + brazeUserChangeEvent + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$57$lambda$55(String str) {
        return "Removing in-app messages not from user " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createBrazeUserChangeEventSubscriber$lambda$57$lambda$56(BrazeInAppMessageManager brazeInAppMessageManager, String str, IInAppMessage iInAppMessage) {
        return !brazeInAppMessageManager.isInAppMessageForTheSameUser(iInAppMessage, str);
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new IEventSubscriber() { // from class: J5.U
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.createInAppMessageEventSubscriber$lambda$53(this.f6240a, (InAppMessageEvent) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageEventSubscriber$lambda$53(BrazeInAppMessageManager brazeInAppMessageManager, InAppMessageEvent event) {
        AbstractC4862t.e(event, "event");
        IInAppMessage inAppMessage = event.getInAppMessage();
        brazeInAppMessageManager.inAppMessageEventMap.put(inAppMessage, event);
        brazeInAppMessageManager.addInAppMessage(inAppMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$37(IInAppMessage iInAppMessage) {
        return "Attempting to display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$38() {
        return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$39() {
        return "Expiration timestamp not defined. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$40() {
        return "Not displaying control in-app message. Logging impression and ending display execution.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$41() {
        return "Cannot show message containing an invalid Braze Action.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$42() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$43() {
        return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$44() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$45() {
        return "Creating view wrapper for immersive in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$46() {
        return "Creating view wrapper for base in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$47() {
        return "Creating view wrapper for in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$48() {
        return "In-app message view includes HTML. Delaying display until the content has finished loading.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayInAppMessage$lambda$51(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager brazeInAppMessageManager, Activity activity) {
        if (iInAppMessageViewWrapper != null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.W
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.displayInAppMessage$lambda$51$lambda$49();
                    }
                }, 7, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: J5.X
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.displayInAppMessage$lambda$51$lambda$50();
                    }
                }, 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$51$lambda$49() {
        return "Page has finished loading. Opening in-app message view wrapper.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$51$lambda$50() {
        return "Failed to open view wrapper in page finished listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$52(IInAppMessage iInAppMessage) {
        return "Could not display in-app message with payload: " + JsonUtils.getPrettyPrintedString(iInAppMessage.getKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f4 A[Catch: all -> 0x0267, TryCatch #3 {all -> 0x0267, blocks: (B:90:0x0203, B:92:0x0208, B:94:0x020e, B:96:0x0226, B:103:0x02af, B:105:0x02b5, B:108:0x02da, B:110:0x02de, B:112:0x02e4, B:107:0x02d7, B:99:0x026d, B:101:0x0271, B:102:0x0294, B:113:0x02ec, B:114:0x02f3, B:115:0x02f4, B:116:0x02fb), top: B:132:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0208 A[Catch: all -> 0x0267, TryCatch #3 {all -> 0x0267, blocks: (B:90:0x0203, B:92:0x0208, B:94:0x020e, B:96:0x0226, B:103:0x02af, B:105:0x02b5, B:108:0x02da, B:110:0x02de, B:112:0x02e4, B:107:0x02d7, B:99:0x026d, B:101:0x0271, B:102:0x0294, B:113:0x02ec, B:114:0x02f3, B:115:0x02f4, B:116:0x02fb), top: B:132:0x0203 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object displayInAppMessage$suspendImpl(com.braze.ui.inappmessage.BrazeInAppMessageManager r23, com.braze.models.inappmessage.IInAppMessage r24, boolean r25, lc.InterfaceC4988e r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage$suspendImpl(com.braze.ui.inappmessage.BrazeInAppMessageManager, com.braze.models.inappmessage.IInAppMessage, boolean, lc.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$0() {
        return "Removing existing in-app message event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$1() {
        return "Subscribing in-app message event subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$3() {
        return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$4() {
        return "Subscribing sdk data wipe subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureSubscribedToInAppMessageEvents$lambda$5(BrazeInAppMessageManager brazeInAppMessageManager, SdkDataWipeEvent it) {
        AbstractC4862t.e(it, "it");
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$7() {
        return "Removing existing user change event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pauseWebviewIfNecessary$lambda$62() {
        return "Pausing InAppMessage WebView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$10(Activity activity) {
        return "Registering InAppMessageManager with activity: " + activity.getLocalClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$11() {
        return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$14$lambda$13() {
        return "Requesting display of carryover in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$16$lambda$15() {
        return "Adding previously unregistered in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$18() {
        return "Error while calling attempting to register the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$9() {
        return "Null Activity passed to registerInAppMessageManager. Doing nothing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$24() {
        return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$25() {
        return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$26() {
        return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$27() {
        return "The in-app message stack is empty. No in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$28() {
        return "Using the control in-app message manager listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$29() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$30() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$31() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$32() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned REENQUEUE. The in-app message will not be displayed and will be marked as eligible for next time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$33(IInAppMessage iInAppMessage) {
        return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$34() {
        return "Error running requestDisplayInAppMessage";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$35() {
        return "Resetting after in-app message close.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$36(Integer num) {
        return "Setting requested orientation to original orientation " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resumeWebviewIfNecessary$lambda$63() {
        return "Resuming InAppMessage WebView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$19(Activity activity) {
        return "Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: " + (activity != null ? activity.getLocalClassName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$20() {
        return "Null Activity passed to unregisterInAppMessageManager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$21(Activity activity) {
        return "Unregistering InAppMessageManager from activity: " + activity.getLocalClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$22() {
        return "In-app message view includes HTML. Removing the page finished listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$23() {
        return "Error while calling attempting to unregister the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$58() {
        return "Cannot verify orientation status with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$59() {
        return "Running on tablet. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$60() {
        return "Any orientation specified. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$61() {
        return "Requesting orientation lock.";
    }

    public void addInAppMessage(IInAppMessage inAppMessage) {
        if (inAppMessage != null) {
            this.inAppMessageStack.push(inAppMessage);
            requestDisplayInAppMessage();
        }
    }

    public Object displayInAppMessage(IInAppMessage iInAppMessage, boolean z10, InterfaceC4988e interfaceC4988e) {
        return displayInAppMessage$suspendImpl(this, iInAppMessage, z10, interfaceC4988e);
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        AbstractC4862t.e(context, "context");
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.D
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$0();
                }
            }, 7, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.E
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$1();
            }
        }, 7, (Object) null);
        IEventSubscriber<InAppMessageEvent> iEventSubscriberCreateInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.Companion companion = Braze.INSTANCE;
        companion.getInstance(context).subscribeToNewInAppMessages(iEventSubscriberCreateInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = iEventSubscriberCreateInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.F
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$3();
                }
            }, 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.G
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$4();
            }
        }, 6, (Object) null);
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber = new IEventSubscriber() { // from class: J5.I
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$5(this.f6235a, (SdkDataWipeEvent) obj);
            }
        };
        companion.getInstance(context).addSingleSynchronousSubscription(iEventSubscriber, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
        if (this.brazeUserChangeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.J
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$7();
                }
            }, 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.brazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        }
        IEventSubscriber<BrazeUserChangeEvent> iEventSubscriberCreateBrazeUserChangeEventSubscriber = createBrazeUserChangeEventSubscriber(context);
        companion.getInstance(context).subscribeToChangeUserEvents(iEventSubscriberCreateBrazeUserChangeEventSubscriber);
        this.brazeUserChangeEventSubscriber = iEventSubscriberCreateBrazeUserChangeEventSubscriber;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean dismissed) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (dismissed) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            if (AbstractC4862t.a(Looper.myLooper(), Looper.getMainLooper())) {
                iInAppMessageViewWrapper.close();
            } else {
                AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, C2123d0.c(), null, new C31361(iInAppMessageViewWrapper, null), 2, null);
            }
        }
    }

    public final boolean isCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public boolean isInAppMessageForTheSameUser(IInAppMessage inAppMessage, String currentUserId) {
        if (inAppMessage != null && currentUserId != null) {
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(inAppMessage);
            String userId = inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null;
            if (userId != null && !AbstractC4862t.a(userId, currentUserId)) {
                return false;
            }
        }
        return true;
    }

    public final void pauseWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.V
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeInAppMessageManager.pauseWebviewIfNecessary$lambda$62();
            }
        }, 7, (Object) null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) == null) {
                return;
            }
            messageWebView.onPause();
        }
    }

    public void registerInAppMessageManager(final Activity activity) {
        try {
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.b0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.registerInAppMessageManager$lambda$9();
                    }
                }, 6, (Object) null);
                return;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.c0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.registerInAppMessageManager$lambda$10(activity);
                }
            }, 6, (Object) null);
            this.mActivity = new WeakReference<>(activity);
            if (this.mApplicationContext == null) {
                Context applicationContext = activity.getApplicationContext();
                this.mApplicationContext = applicationContext;
                if (applicationContext == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.d0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeInAppMessageManager.registerInAppMessageManager$lambda$11();
                        }
                    }, 6, (Object) null);
                    return;
                }
            }
            if (this.configurationProvider == null) {
                Context context = this.mApplicationContext;
                this.configurationProvider = context != null ? new BrazeConfigurationProvider(context) : null;
            }
            IInAppMessage iInAppMessage = this.carryoverInAppMessage;
            if (iInAppMessage != null) {
                if (iInAppMessage != null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.e0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeInAppMessageManager.registerInAppMessageManager$lambda$14$lambda$13();
                        }
                    }, 7, (Object) null);
                    iInAppMessage.setAnimateIn(false);
                    AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, C2123d0.c(), null, new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this, iInAppMessage, null), 2, null);
                }
                this.carryoverInAppMessage = null;
            } else {
                IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
                if (iInAppMessage2 != null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.f0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeInAppMessageManager.registerInAppMessageManager$lambda$16$lambda$15();
                        }
                    }, 7, (Object) null);
                    addInAppMessage(iInAppMessage2);
                    this.unregisteredInAppMessage = null;
                }
            }
            Context context2 = this.mApplicationContext;
            if (context2 != null) {
                ensureSubscribedToInAppMessageEvents(context2);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: J5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.registerInAppMessageManager$lambda$18();
                }
            }, 4, (Object) null);
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation inAppMessageOperationBeforeInAppMessageDisplayed;
        try {
            WeakReference<Activity> weakReference = this.mActivity;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null) {
                if (this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.e
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$25();
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.c
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$24();
                        }
                    }, 6, (Object) null);
                    this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                }
                return false;
            }
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.f
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$26();
                    }
                }, 7, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.g
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$27();
                    }
                }, 7, (Object) null);
                return false;
            }
            final IInAppMessage iInAppMessagePop = this.inAppMessageStack.pop();
            if (iInAppMessagePop.isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.h
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$28();
                    }
                }, 7, (Object) null);
                IInAppMessageManagerListener controlInAppMessageManagerListener = getControlInAppMessageManagerListener();
                AbstractC4862t.b(iInAppMessagePop);
                inAppMessageOperationBeforeInAppMessageDisplayed = controlInAppMessageManagerListener.beforeInAppMessageDisplayed(iInAppMessagePop);
            } else {
                IInAppMessageManagerListener inAppMessageManagerListener = getInAppMessageManagerListener();
                AbstractC4862t.b(iInAppMessagePop);
                inAppMessageOperationBeforeInAppMessageDisplayed = inAppMessageManagerListener.beforeInAppMessageDisplayed(iInAppMessagePop);
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[inAppMessageOperationBeforeInAppMessageDisplayed.ordinal()];
            if (i10 == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.i
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$29();
                    }
                }, 7, (Object) null);
                BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(iInAppMessagePop);
                return true;
            }
            if (i10 == 2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.j
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$30();
                    }
                }, 7, (Object) null);
                this.inAppMessageStack.push(iInAppMessagePop);
                return false;
            }
            if (i10 == 3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.k
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$31();
                    }
                }, 7, (Object) null);
                return false;
            }
            if (i10 != 4) {
                throw new C4032o();
            }
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(iInAppMessagePop);
            if (inAppMessageEvent != null) {
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context applicationContext = activity.getApplicationContext();
                AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
                brazeInternal.reenqueueInAppMessage(applicationContext, inAppMessageEvent);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.m
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$32();
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.n
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$33(iInAppMessagePop);
                    }
                }, 7, (Object) null);
            }
            return false;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: J5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$34();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.M
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$35();
            }
        }, 6, (Object) null);
        this.inAppMessageViewWrapper = null;
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        final Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.N
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$36(num);
            }
        }, 7, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
        this.originalOrientation = null;
    }

    public final void resumeWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.L
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeInAppMessageManager.resumeWebviewIfNecessary$lambda$63();
            }
        }, 7, (Object) null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) == null) {
                return;
            }
            messageWebView.onResume();
        }
    }

    public void unregisterInAppMessageManager(final Activity activity) {
        IInAppMessage inAppMessage;
        try {
            if (getShouldNextUnregisterBeSkipped()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.a
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$19(activity);
                    }
                }, 7, (Object) null);
                setShouldNextUnregisterBeSkipped(false);
                return;
            }
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.l
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$20();
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.w
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$21(activity);
                    }
                }, 6, (Object) null);
            }
            IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
            if (iInAppMessageViewWrapper != null) {
                View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
                if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.H
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$22();
                        }
                    }, 7, (Object) null);
                    ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener(null);
                }
                ViewUtils.removeViewFromParent(inAppMessageView);
                if (iInAppMessageViewWrapper.getIsAnimatingClose()) {
                    this.inAppMessageViewLifecycleListener.afterClosed(iInAppMessageViewWrapper.getInAppMessage());
                    inAppMessage = null;
                } else {
                    inAppMessage = iInAppMessageViewWrapper.getInAppMessage();
                }
                this.carryoverInAppMessage = inAppMessage;
                this.inAppMessageViewWrapper = null;
            } else {
                this.carryoverInAppMessage = null;
            }
            this.mActivity = null;
            this.displayingInAppMessage.set(false);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: J5.T
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$23();
                }
            }, 4, (Object) null);
        }
    }

    @SuppressLint({"InlinedApi"})
    public boolean verifyOrientationStatus(IInAppMessage inAppMessage) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Orientation orientation = inAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.O
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.verifyOrientationStatus$lambda$58();
                }
            }, 6, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.P
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.verifyOrientationStatus$lambda$59();
                }
            }, 7, (Object) null);
        } else {
            if (orientation != Orientation.ANY) {
                if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
                    return false;
                }
                if (this.originalOrientation == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.S
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeInAppMessageManager.verifyOrientationStatus$lambda$61();
                        }
                    }, 7, (Object) null);
                    this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
                    ViewUtils.setActivityRequestedOrientation(activity, 14);
                }
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: J5.Q
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeInAppMessageManager.verifyOrientationStatus$lambda$60();
                }
            }, 7, (Object) null);
        }
        return true;
    }
}
