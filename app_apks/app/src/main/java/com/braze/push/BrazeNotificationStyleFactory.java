package com.braze.push;

import Od.F;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.m;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationStyleFactory;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory;", "", "<init>", "()V", "NoOpSentinelStyle", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeNotificationStyleFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u001c2\u0006\u00100\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "pushStoryPage", "Landroid/app/PendingIntent;", "createStoryPageClickedPendingIntent", "(Landroid/content/Context;Lcom/braze/models/push/BrazeNotificationPayload;Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;)Landroid/app/PendingIntent;", "Landroid/os/Bundle;", "notificationExtras", "", "pageIndex", "createStoryTraversedPendingIntent", "(Landroid/content/Context;Landroid/os/Bundle;I)Landroid/app/PendingIntent;", "Landroid/widget/RemoteViews;", "view", "", "populatePushStoryPage", "(Landroid/widget/RemoteViews;Lcom/braze/models/push/BrazeNotificationPayload;Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;)Z", "isRemoteViewNotificationAvailableSpaceConstrained", "(Landroid/content/Context;)Z", "Landroidx/core/app/m$e;", "notificationBuilder", "Lfc/H;", "setStyleIfSupported", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroidx/core/app/m$k;", "getNotificationStyle", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/m$k;", "Landroidx/core/app/m$c;", "getBigTextNotificationStyle", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/m$c;", "Landroidx/core/app/m$g;", "getStoryStyle", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/m$g;", "getInlineImageStyle", "(Lcom/braze/models/push/BrazeNotificationPayload;Landroidx/core/app/m$e;)Landroidx/core/app/m$k;", "Landroidx/core/app/m$b;", "getBigPictureNotificationStyle", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/m$b;", "Landroidx/core/app/m$i;", "getConversationalPushStyle", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/m$i;", "bigPictureNotificationStyle", "setBigPictureSummaryAndTitle", "(Landroidx/core/app/m$b;Lcom/braze/models/push/BrazeNotificationPayload;)V", "BIG_PICTURE_STYLE_IMAGE_HEIGHT", "I", "", "STORY_SET_GRAVITY", "Ljava/lang/String;", "STORY_SET_VISIBILITY", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        private final PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent("com.braze.action.BRAZE_STORY_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            AbstractC4862t.d(intent, "setClass(...)");
            intent.setFlags(intent.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtras(payload.getNotificationExtras());
            intent.putExtra("braze_action_uri", pushStoryPage.getDeeplink());
            intent.putExtra("braze_action_use_webview", pushStoryPage.getUseWebview());
            intent.putExtra("braze_story_page_id", pushStoryPage.getStoryPageId());
            intent.putExtra("braze_campaign_id", pushStoryPage.getCampaignId());
            intent.putExtra("nid", BrazeNotificationUtils.getNotificationId(payload));
            PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags());
            AbstractC4862t.d(activity, "getActivity(...)");
            return activity;
        }

        private final PendingIntent createStoryTraversedPendingIntent(Context context, Bundle notificationExtras, int pageIndex) {
            Intent intent = new Intent("com.braze.action.STORY_TRAVERSE").setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            AbstractC4862t.d(intent, "setClass(...)");
            if (notificationExtras != null) {
                notificationExtras.putInt("braze_story_index", pageIndex);
                intent.putExtras(notificationExtras);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
            AbstractC4862t.d(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$18(String str) {
            return "Failed to download image bitmap for big picture notification style. Url: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$19() {
            return "Failed to scale image bitmap, using original.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getBigPictureNotificationStyle$lambda$20() {
            return "Failed to create Big Picture Style.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$21() {
            return "Reply person does not exist in mapping. Not rendering a style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$22(BrazeNotificationPayload.ConversationMessage conversationMessage) {
            return "Message person does not exist in mapping. Not rendering a style. " + conversationMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConversationalPushStyle$lambda$23() {
            return "Failed to create conversation push style. Returning null.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$11() {
            return "Inline Image Push cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$12() {
            return "Inline Image Push image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$13() {
            return "Inline Image Push failed to get image bitmap";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInlineImageStyle$lambda$15() {
            return "Inline Image Push application info was null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$1() {
            return "Rendering push notification with DecoratedCustomViewStyle (Story)";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$2() {
            return "Rendering conversational push";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$3() {
            return "Rendering push notification with custom inline image style";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$4() {
            return "Rendering push notification with BigPictureStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getNotificationStyle$lambda$5() {
            return "Rendering push notification with BigTextStyle";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$10() {
            return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getStoryStyle$lambda$9() {
            return "Push story page cannot render without a context";
        }

        private final boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) {
            return context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 31;
        }

        private final boolean populatePushStoryPage(RemoteViews view, BrazeNotificationPayload payload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.y
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$25();
                    }
                }, 7, (Object) null);
                return false;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.z
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$26();
                    }
                }, 7, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            if (bitmapUrl == null || F.k0(bitmapUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.B
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$27();
                    }
                }, 7, (Object) null);
                return false;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            if (pushBitmapFromUrl == null) {
                return false;
            }
            view.setImageViewBitmap(R$id.com_braze_story_image_view, pushBitmapFromUrl);
            String title = pushStoryPage.getTitle();
            if (title == null || F.k0(title)) {
                view.setInt(R$id.com_braze_story_text_view_container, "setVisibility", 8);
            } else {
                view.setTextViewText(R$id.com_braze_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(title, configurationProvider));
                view.setInt(R$id.com_braze_story_text_view_container, "setGravity", pushStoryPage.getTitleGravity());
            }
            String subtitle = pushStoryPage.getSubtitle();
            if (subtitle == null || F.k0(subtitle)) {
                view.setInt(R$id.com_braze_story_text_view_small_container, "setVisibility", 8);
            } else {
                view.setTextViewText(R$id.com_braze_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(subtitle, configurationProvider));
                view.setInt(R$id.com_braze_story_text_view_small_container, "setGravity", pushStoryPage.getSubtitleGravity());
            }
            view.setOnClickPendingIntent(R$id.com_braze_story_relative_layout, createStoryPageClickedPendingIntent(context, payload, pushStoryPage));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$25() {
            return "Push story page cannot render without a context";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$26() {
            return "Push story page cannot render without a configuration provider";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populatePushStoryPage$lambda$27() {
            return "Push story page image url invalid";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setStyleIfSupported$lambda$0() {
            return "Setting style for notification";
        }

        public final m.b getBigPictureNotificationStyle(BrazeNotificationPayload payload) {
            final String bigImageUrl;
            Companion companion;
            AbstractC4862t.e(payload, "payload");
            Context context = payload.getContext();
            if (context == null || (bigImageUrl = payload.getBigImageUrl()) == null || F.k0(bigImageUrl)) {
                return null;
            }
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.G
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$18(bigImageUrl);
                    }
                }, 7, (Object) null);
                return null;
            }
            try {
                if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                    int pixelsFromDensityAndDp = BrazeImageUtils.getPixelsFromDensityAndDp(BrazeImageUtils.getDensityDpi(context), 192);
                    int i10 = pixelsFromDensityAndDp * 2;
                    int displayWidthPixels = BrazeImageUtils.getDisplayWidthPixels(context);
                    if (i10 > displayWidthPixels) {
                        i10 = displayWidthPixels;
                    }
                    try {
                        pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i10, pixelsFromDensityAndDp, true);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.H
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$19();
                            }
                        }, 4, (Object) null);
                    }
                }
                m.b bVar = new m.b();
                bVar.d(pushBitmapFromUrl);
                companion = this;
                try {
                    companion.setBigPictureSummaryAndTitle(bVar, payload);
                    return bVar;
                } catch (Exception e11) {
                    e = e11;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.f28625E, (Throwable) e, false, new InterfaceC6082a() { // from class: l5.I
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$20();
                        }
                    }, 4, (Object) null);
                    return null;
                }
            } catch (Exception e12) {
                e = e12;
                companion = this;
            }
        }

        public final m.c getBigTextNotificationStyle(BrazeNotificationPayload payload) {
            CharSequence htmlSpannedTextIfEnabled;
            AbstractC4862t.e(payload, "payload");
            m.c cVar = new m.c();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider != null) {
                String contentText = payload.getContentText();
                if (contentText != null && (htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider)) != null) {
                    cVar.b(htmlSpannedTextIfEnabled);
                }
                String bigSummaryText = payload.getBigSummaryText();
                if (bigSummaryText != null) {
                    cVar.d(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
                }
                String bigTitleText = payload.getBigTitleText();
                if (bigTitleText != null) {
                    cVar.c(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
                }
            }
            return cVar;
        }

        public final m.i getConversationalPushStyle(m.e notificationBuilder, BrazeNotificationPayload payload) {
            AbstractC4862t.e(notificationBuilder, "notificationBuilder");
            AbstractC4862t.e(payload, "payload");
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = payload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(payload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.J
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$21();
                        }
                    }, 7, (Object) null);
                    return null;
                }
                m.i iVar = new m.i(conversationPerson.getPerson());
                for (final BrazeNotificationPayload.ConversationMessage conversationMessage : payload.getConversationMessages()) {
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(conversationMessage.getPersonId());
                    if (conversationPerson2 == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.q
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$22(conversationMessage);
                            }
                        }, 7, (Object) null);
                        return null;
                    }
                    iVar.c(conversationMessage.getMessage(), conversationMessage.getTimestamp(), conversationPerson2.getPerson());
                }
                boolean z10 = true;
                if (conversationPersonMap.size() <= 1) {
                    z10 = false;
                }
                iVar.j(z10);
                notificationBuilder.I(payload.getConversationShortcutId());
                return iVar;
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.r
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$23();
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        public final m.k getInlineImageStyle(BrazeNotificationPayload payload, m.e notificationBuilder) {
            AbstractC4862t.e(payload, "payload");
            AbstractC4862t.e(notificationBuilder, "notificationBuilder");
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.s
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$11();
                    }
                }, 7, (Object) null);
                return null;
            }
            String bigImageUrl = payload.getBigImageUrl();
            if (bigImageUrl == null || F.k0(bigImageUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.t
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$12();
                    }
                }, 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            Bitmap pushBitmapFromUrl = Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.u
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$13();
                    }
                }, 7, (Object) null);
                return null;
            }
            boolean zIsRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), zIsRemoteViewNotificationAvailableSpaceConstrained ? R$layout.com_braze_push_inline_image_constrained : R$layout.com_braze_notification_inline_image);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            Icon iconCreateWithResource = Icon.createWithResource(context, configurationProvider.getSmallNotificationIconResourceId());
            AbstractC4862t.d(iconCreateWithResource, "createWithResource(...)");
            Integer accentColor = payload.getAccentColor();
            if (accentColor != null) {
                iconCreateWithResource.setTint(accentColor.intValue());
            }
            remoteViews.setImageViewIcon(R$id.com_braze_inline_image_push_app_icon, iconCreateWithResource);
            PackageManager packageManager = context.getPackageManager();
            try {
                CharSequence applicationLabel = packageManager.getApplicationLabel(Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo(context.getPackageName(), 0));
                AbstractC4862t.c(applicationLabel, "null cannot be cast to non-null type kotlin.String");
                remoteViews.setTextViewText(R$id.com_braze_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled((String) applicationLabel, configurationProvider));
                remoteViews.setTextViewText(R$id.com_braze_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
                String string = notificationExtras.getString("t");
                if (string != null) {
                    remoteViews.setTextViewText(R$id.com_braze_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string, configurationProvider));
                }
                String string2 = notificationExtras.getString("a");
                if (string2 != null) {
                    remoteViews.setTextViewText(R$id.com_braze_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string2, configurationProvider));
                }
                notificationBuilder.q(remoteViews);
                if (zIsRemoteViewNotificationAvailableSpaceConstrained) {
                    notificationBuilder.z(pushBitmapFromUrl);
                    return new m.g();
                }
                remoteViews.setImageViewBitmap(R$id.com_braze_inline_image_push_side_image, pushBitmapFromUrl);
                return new NoOpSentinelStyle();
            } catch (PackageManager.NameNotFoundException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.v
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$15();
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        public final m.k getNotificationStyle(m.e notificationBuilder, BrazeNotificationPayload payload) {
            m.k bigPictureNotificationStyle;
            AbstractC4862t.e(notificationBuilder, "notificationBuilder");
            AbstractC4862t.e(payload, "payload");
            if (payload.getIsPushStory() && payload.getContext() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.A
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$1();
                    }
                }, 7, (Object) null);
                bigPictureNotificationStyle = getStoryStyle(notificationBuilder, payload);
            } else if (payload.getIsConversationalPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.C
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$2();
                    }
                }, 7, (Object) null);
                bigPictureNotificationStyle = getConversationalPushStyle(notificationBuilder, payload);
            } else if (payload.getBigImageUrl() == null) {
                bigPictureNotificationStyle = null;
            } else if (payload.getIsInlineImagePush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.D
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$3();
                    }
                }, 7, (Object) null);
                bigPictureNotificationStyle = getInlineImageStyle(payload, notificationBuilder);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.E
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$4();
                    }
                }, 7, (Object) null);
                bigPictureNotificationStyle = getBigPictureNotificationStyle(payload);
            }
            if (bigPictureNotificationStyle != null) {
                return bigPictureNotificationStyle;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.F
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$5();
                }
            }, 7, (Object) null);
            return getBigTextNotificationStyle(payload);
        }

        public final m.g getStoryStyle(m.e notificationBuilder, BrazeNotificationPayload payload) {
            AbstractC4862t.e(notificationBuilder, "notificationBuilder");
            AbstractC4862t.e(payload, "payload");
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.w
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$9();
                    }
                }, 7, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            int pushStoryPageIndex = payload.getPushStoryPageIndex();
            BrazeNotificationPayload.PushStoryPage pushStoryPage = pushStoryPages.get(pushStoryPageIndex);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.com_braze_push_story_one_image);
            if (!populatePushStoryPage(remoteViews, payload, pushStoryPage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.x
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$10();
                    }
                }, 6, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            m.g gVar = new m.g();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            notificationBuilder.p(remoteViews);
            notificationBuilder.E(true);
            return gVar;
        }

        public final void setBigPictureSummaryAndTitle(m.b bigPictureNotificationStyle, BrazeNotificationPayload payload) {
            String contentText;
            AbstractC4862t.e(bigPictureNotificationStyle, "bigPictureNotificationStyle");
            AbstractC4862t.e(payload, "payload");
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return;
            }
            String bigSummaryText = payload.getBigSummaryText();
            String bigTitleText = payload.getBigTitleText();
            String summaryText = payload.getSummaryText();
            if (bigSummaryText != null) {
                bigPictureNotificationStyle.g(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                bigPictureNotificationStyle.f(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = payload.getContentText()) != null) {
                bigPictureNotificationStyle.g(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
            }
        }

        public final void setStyleIfSupported(m.e notificationBuilder, BrazeNotificationPayload payload) {
            AbstractC4862t.e(notificationBuilder, "notificationBuilder");
            AbstractC4862t.e(payload, "payload");
            m.k notificationStyle = getNotificationStyle(notificationBuilder, payload);
            if (notificationStyle instanceof NoOpSentinelStyle) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.p
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationStyleFactory.Companion.setStyleIfSupported$lambda$0();
                }
            }, 7, (Object) null);
            notificationBuilder.N(notificationStyle);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$NoOpSentinelStyle;", "Landroidx/core/app/m$k;", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoOpSentinelStyle extends m.k {
    }
}
