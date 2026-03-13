package com.braze.ui.inappmessage.utils;

import Od.F;
import Rd.AbstractC2128g;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.M;
import android.content.Context;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.MessageType;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.google.protobuf.DescriptorProtos$FileOptions;
import fc.AbstractC4036s;
import fc.C4015H;
import java.io.File;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/braze/ui/inappmessage/utils/BackgroundInAppMessagePreparer;", "", "<init>", "()V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageToPrepare", "Lfc/H;", "prepareInAppMessageForDisplay", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "prepareInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;", "inAppMessageHtml", "", "prepareInAppMessageWithZippedAssetHtml", "(Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;)Z", "inAppMessage", "prepareInAppMessageWithBitmapDownload", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "", "localImageUrl", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "inAppMessageWithImage", "Lcom/braze/images/IBrazeImageLoader;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "handleLocalImage", "(Ljava/lang/String;Lcom/braze/models/inappmessage/IInAppMessageWithImage;Lcom/braze/images/IBrazeImageLoader;Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/enums/BrazeViewBounds;)Z", "getViewBoundsByType", "(Lcom/braze/models/inappmessage/IInAppMessage;)Lcom/braze/enums/BrazeViewBounds;", "displayPreparedInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;Llc/e;)Ljava/lang/Object;", "Lcom/braze/models/inappmessage/InAppMessageHtml;", "prepareInAppMessageWithHtml", "(Lcom/braze/models/inappmessage/InAppMessageHtml;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackgroundInAppMessagePreparer {
    public static final BackgroundInAppMessagePreparer INSTANCE = new BackgroundInAppMessagePreparer();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2", f = "BackgroundInAppMessagePreparer.kt", l = {276}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends m implements p {
        final /* synthetic */ IInAppMessage $inAppMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IInAppMessage iInAppMessage, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$inAppMessage = iInAppMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Displaying in-app message.";
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new AnonymousClass2(this.$inAppMessage, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((AnonymousClass2) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BackgroundInAppMessagePreparer.INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: com.braze.ui.inappmessage.utils.a
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BackgroundInAppMessagePreparer.AnonymousClass2.invokeSuspend$lambda$0();
                    }
                }, 7, (Object) null);
                BrazeInAppMessageManager companion = BrazeInAppMessageManager.INSTANCE.getInstance();
                IInAppMessage iInAppMessage = this.$inAppMessage;
                this.label = 1;
                if (companion.displayInAppMessage(iInAppMessage, false, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", f = "BackgroundInAppMessagePreparer.kt", l = {DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends m implements p {
        final /* synthetic */ IInAppMessage $inAppMessageToPrepare;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IInAppMessage iInAppMessage, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$inAppMessageToPrepare = iInAppMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Cannot display the in-app message because the in-app message was null.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1() {
            return "Caught error while preparing in app message in background";
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inAppMessageToPrepare, interfaceC4988e);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((AnonymousClass1) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc;
            M m10;
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                M m11 = (M) this.L$0;
                try {
                    BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = BackgroundInAppMessagePreparer.INSTANCE;
                    IInAppMessage iInAppMessagePrepareInAppMessage = backgroundInAppMessagePreparer.prepareInAppMessage(this.$inAppMessageToPrepare);
                    if (iInAppMessagePrepareInAppMessage == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m11, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: com.braze.ui.inappmessage.utils.b
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return BackgroundInAppMessagePreparer.AnonymousClass1.invokeSuspend$lambda$0();
                            }
                        }, 6, (Object) null);
                    } else {
                        this.L$0 = m11;
                        this.label = 1;
                        if (backgroundInAppMessagePreparer.displayPreparedInAppMessage(iInAppMessagePrepareInAppMessage, this) == objF) {
                            return objF;
                        }
                    }
                } catch (Exception e10) {
                    exc = e10;
                    m10 = m11;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m10, BrazeLogger.Priority.f28625E, (Throwable) exc, false, new InterfaceC6082a() { // from class: com.braze.ui.inappmessage.utils.c
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BackgroundInAppMessagePreparer.AnonymousClass1.invokeSuspend$lambda$1();
                        }
                    }, 4, (Object) null);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                M m12 = (M) this.L$0;
                try {
                    AbstractC4036s.b(obj);
                } catch (Exception e11) {
                    m10 = m12;
                    exc = e11;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m10, BrazeLogger.Priority.f28625E, (Throwable) exc, false, new InterfaceC6082a() { // from class: com.braze.ui.inappmessage.utils.c
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BackgroundInAppMessagePreparer.AnonymousClass1.invokeSuspend$lambda$1();
                        }
                    }, 4, (Object) null);
                }
            }
            return C4015H.f34254a;
        }
    }

    private BackgroundInAppMessagePreparer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object displayPreparedInAppMessage(IInAppMessage iInAppMessage, InterfaceC4988e interfaceC4988e) {
        Object objG = AbstractC2128g.g(C2123d0.c(), new AnonymousClass2(iInAppMessage, null), interfaceC4988e);
        return objG == C5046c.f() ? objG : C4015H.f34254a;
    }

    private final BrazeViewBounds getViewBoundsByType(IInAppMessage inAppMessage) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
        return i10 != 3 ? i10 != 4 ? BrazeViewBounds.NO_BOUNDS : BrazeViewBounds.IN_APP_MESSAGE_MODAL : BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP;
    }

    private final boolean handleLocalImage(final String localImageUrl, IInAppMessageWithImage inAppMessageWithImage, IBrazeImageLoader imageLoader, Context applicationContext, IInAppMessage inAppMessage, BrazeViewBounds viewBounds) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BackgroundInAppMessagePreparer.handleLocalImage$lambda$15(localImageUrl);
            }
        }, 6, (Object) null);
        inAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, inAppMessage, localImageUrl, viewBounds));
        if (inAppMessageWithImage.getBitmap() != null) {
            inAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BackgroundInAppMessagePreparer.handleLocalImage$lambda$16(localImageUrl);
            }
        }, 7, (Object) null);
        inAppMessageWithImage.setLocalImageUrl(null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLocalImage$lambda$15(String str) {
        return "Passing in-app message local image url to image loader: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLocalImage$lambda$16(String str) {
        return "Removing local image url from IAM since it could not be loaded. URL: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInAppMessage prepareInAppMessage(IInAppMessage inAppMessageToPrepare) {
        if (inAppMessageToPrepare.isControl()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessage$lambda$0();
                }
            }, 7, (Object) null);
            return inAppMessageToPrepare;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BackgroundInAppMessagePreparer.prepareInAppMessage$lambda$1();
            }
        }, 7, (Object) null);
        int i10 = WhenMappings.$EnumSwitchMapping$0[inAppMessageToPrepare.getMessageType().ordinal()];
        if (i10 == 1) {
            AbstractC4862t.c(inAppMessageToPrepare, "null cannot be cast to non-null type com.braze.models.inappmessage.IInAppMessageZippedAssetHtml");
            if (!prepareInAppMessageWithZippedAssetHtml((IInAppMessageZippedAssetHtml) inAppMessageToPrepare)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.l
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BackgroundInAppMessagePreparer.prepareInAppMessage$lambda$2();
                    }
                }, 6, (Object) null);
                return null;
            }
        } else {
            if (i10 == 2) {
                AbstractC4862t.c(inAppMessageToPrepare, "null cannot be cast to non-null type com.braze.models.inappmessage.InAppMessageHtml");
                prepareInAppMessageWithHtml((InAppMessageHtml) inAppMessageToPrepare);
                return inAppMessageToPrepare;
            }
            if (!prepareInAppMessageWithBitmapDownload(inAppMessageToPrepare)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.m
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BackgroundInAppMessagePreparer.prepareInAppMessage$lambda$3();
                    }
                }, 6, (Object) null);
                return null;
            }
        }
        return inAppMessageToPrepare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$0() {
        return "Skipping in-app message preparation for control in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$1() {
        return "Starting asynchronous in-app message preparation for message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$2() {
        return "Html in-app message zip asset download failed. Cannot display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$3() {
        return "In-app message image download failed. Cannot display in-app message.";
    }

    public static final void prepareInAppMessageForDisplay(IInAppMessage inAppMessageToPrepare) {
        AbstractC4862t.e(inAppMessageToPrepare, "inAppMessageToPrepare");
        AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass1(inAppMessageToPrepare, null), 3, null);
    }

    public static final boolean prepareInAppMessageWithBitmapDownload(IInAppMessage inAppMessage) {
        if (!(inAppMessage instanceof IInAppMessageWithImage)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.s
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$9();
                }
            }, 7, (Object) null);
            return false;
        }
        IInAppMessageWithImage iInAppMessageWithImage = (IInAppMessageWithImage) inAppMessage;
        if (iInAppMessageWithImage.getBitmap() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$10();
                }
            }, 6, (Object) null);
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = INSTANCE;
        BrazeViewBounds viewBoundsByType = backgroundInAppMessagePreparer.getViewBoundsByType(inAppMessage);
        Context mApplicationContext = BrazeInAppMessageManager.INSTANCE.getInstance().getMApplicationContext();
        if (mApplicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$11();
                }
            }, 6, (Object) null);
            return false;
        }
        IBrazeImageLoader imageLoader = Braze.INSTANCE.getInstance(mApplicationContext).getImageLoader();
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        if (localImageUrl != null && !F.k0(localImageUrl) && backgroundInAppMessagePreparer.handleLocalImage(localImageUrl, iInAppMessageWithImage, imageLoader, mApplicationContext, inAppMessage, viewBoundsByType)) {
            return true;
        }
        final String remoteImageUrl = iInAppMessageWithImage.getRemoteImageUrl();
        if (remoteImageUrl != null && !F.k0(remoteImageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$12(remoteImageUrl);
                }
            }, 6, (Object) null);
            iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(mApplicationContext, inAppMessage, remoteImageUrl, viewBoundsByType));
            if (iInAppMessageWithImage.getBitmap() == null) {
                return false;
            }
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28628W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) backgroundInAppMessagePreparer, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$13();
            }
        }, 6, (Object) null);
        if (!(iInAppMessageWithImage instanceof InAppMessageFull)) {
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) backgroundInAppMessagePreparer, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$14();
            }
        }, 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$10() {
        return "In-app message already contains image bitmap. Not downloading image from URL.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$11() {
        return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$12(String str) {
        return "In-app message has remote image url. Downloading image at url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$13() {
        return "In-app message has no remote image url. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$14() {
        return "In-app message full has no remote image url yet is required to have an image. Failing message display.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$9() {
        return "Cannot prepare non IInAppMessageWithImage object with bitmap download.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithHtml$lambda$17() {
        return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithHtml$lambda$18() {
        return "HTML in-app message does not have message. Not performing any substitutions.";
    }

    public static final boolean prepareInAppMessageWithZippedAssetHtml(final IInAppMessageZippedAssetHtml inAppMessageHtml) {
        AbstractC4862t.e(inAppMessageHtml, "inAppMessageHtml");
        final String localAssetsDirectoryUrl = inAppMessageHtml.getLocalAssetsDirectoryUrl();
        if (localAssetsDirectoryUrl != null && !F.k0(localAssetsDirectoryUrl) && new File(localAssetsDirectoryUrl).exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$4(localAssetsDirectoryUrl);
                }
            }, 6, (Object) null);
            return true;
        }
        String assetsZipRemoteUrl = inAppMessageHtml.getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl == null || F.k0(assetsZipRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.o
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$5();
                }
            }, 6, (Object) null);
            return true;
        }
        Context mApplicationContext = BrazeInAppMessageManager.INSTANCE.getInstance().getMApplicationContext();
        if (mApplicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.p
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$6();
                }
            }, 6, (Object) null);
            return false;
        }
        final String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(mApplicationContext), assetsZipRemoteUrl);
        if (localHtmlUrlFromRemoteUrl == null || F.k0(localHtmlUrlFromRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.r
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$8(inAppMessageHtml, localHtmlUrlFromRemoteUrl);
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.q
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$7(localHtmlUrlFromRemoteUrl);
            }
        }, 7, (Object) null);
        inAppMessageHtml.setLocalAssetsDirectoryUrl(localHtmlUrlFromRemoteUrl);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$4(String str) {
        return "Local assets for html in-app message are already populated. Not downloading assets. Location = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$5() {
        return "Html in-app message has no remote asset zip. Continuing with in-app message preparation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$6() {
        return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$7(String str) {
        return "Local url for html in-app message assets is " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$8(IInAppMessageZippedAssetHtml iInAppMessageZippedAssetHtml, String str) {
        return "Download of html content to local directory failed for remote url: " + iInAppMessageZippedAssetHtml.getAssetsZipRemoteUrl() + " . Returned local url is: " + str;
    }

    public final void prepareInAppMessageWithHtml(InAppMessageHtml inAppMessage) {
        AbstractC4862t.e(inAppMessage, "inAppMessage");
        if (inAppMessage.getLocalPrefetchedAssetPaths().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithHtml$lambda$17();
                }
            }, 7, (Object) null);
            return;
        }
        String message = inAppMessage.getMessage();
        if (message == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: M5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BackgroundInAppMessagePreparer.prepareInAppMessageWithHtml$lambda$18();
                }
            }, 7, (Object) null);
        } else {
            inAppMessage.setMessage(WebContentUtils.replacePrefetchedUrlsWithLocalAssets(message, inAppMessage.getLocalPrefetchedAssetPaths()));
        }
    }
}
