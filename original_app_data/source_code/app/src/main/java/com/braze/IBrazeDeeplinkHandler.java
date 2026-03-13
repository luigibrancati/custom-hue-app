package com.braze;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.enums.Channel;
import com.braze.ui.actions.UriAction;
import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u001cJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lcom/braze/IBrazeDeeplinkHandler;", "", "Landroid/content/Context;", "context", "Lcom/braze/ui/actions/UriAction;", "uriAction", "Lfc/H;", "gotoUri", "(Landroid/content/Context;Lcom/braze/ui/actions/UriAction;)V", "Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "intentFlagPurpose", "", "getIntentFlags", "(Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;)I", "", "url", "Landroid/os/Bundle;", "extras", "", "openInWebView", "Lcom/braze/enums/Channel;", "channel", "createUriActionFromUrlString", "(Ljava/lang/String;Landroid/os/Bundle;ZLcom/braze/enums/Channel;)Lcom/braze/ui/actions/UriAction;", "Landroid/net/Uri;", "uri", "createUriActionFromUri", "(Landroid/net/Uri;Landroid/os/Bundle;ZLcom/braze/enums/Channel;)Lcom/braze/ui/actions/UriAction;", "IntentFlagPurpose", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBrazeDeeplinkHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "", "<init>", "(Ljava/lang/String;I)V", "NOTIFICATION_ACTION_WITH_DEEPLINK", "NOTIFICATION_PUSH_STORY_PAGE_CLICK", "URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY", "URI_ACTION_OPEN_WITH_ACTION_VIEW", "URI_ACTION_BACK_STACK_GET_ROOT_INTENT", "URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT", "URI_UTILS_GET_MAIN_ACTIVITY_INTENT", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IntentFlagPurpose {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ IntentFlagPurpose[] $VALUES;
        public static final IntentFlagPurpose NOTIFICATION_ACTION_WITH_DEEPLINK = new IntentFlagPurpose("NOTIFICATION_ACTION_WITH_DEEPLINK", 0);
        public static final IntentFlagPurpose NOTIFICATION_PUSH_STORY_PAGE_CLICK = new IntentFlagPurpose("NOTIFICATION_PUSH_STORY_PAGE_CLICK", 1);
        public static final IntentFlagPurpose URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY = new IntentFlagPurpose("URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY", 2);
        public static final IntentFlagPurpose URI_ACTION_OPEN_WITH_ACTION_VIEW = new IntentFlagPurpose("URI_ACTION_OPEN_WITH_ACTION_VIEW", 3);
        public static final IntentFlagPurpose URI_ACTION_BACK_STACK_GET_ROOT_INTENT = new IntentFlagPurpose("URI_ACTION_BACK_STACK_GET_ROOT_INTENT", 4);
        public static final IntentFlagPurpose URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT = new IntentFlagPurpose("URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT", 5);
        public static final IntentFlagPurpose URI_UTILS_GET_MAIN_ACTIVITY_INTENT = new IntentFlagPurpose("URI_UTILS_GET_MAIN_ACTIVITY_INTENT", 6);

        private static final /* synthetic */ IntentFlagPurpose[] $values() {
            return new IntentFlagPurpose[]{NOTIFICATION_ACTION_WITH_DEEPLINK, NOTIFICATION_PUSH_STORY_PAGE_CLICK, URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY, URI_ACTION_OPEN_WITH_ACTION_VIEW, URI_ACTION_BACK_STACK_GET_ROOT_INTENT, URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT, URI_UTILS_GET_MAIN_ACTIVITY_INTENT};
        }

        static {
            IntentFlagPurpose[] intentFlagPurposeArr$values = $values();
            $VALUES = intentFlagPurposeArr$values;
            $ENTRIES = AbstractC5277b.a(intentFlagPurposeArr$values);
        }

        private IntentFlagPurpose(String str, int i10) {
        }

        public static IntentFlagPurpose valueOf(String str) {
            return (IntentFlagPurpose) Enum.valueOf(IntentFlagPurpose.class, str);
        }

        public static IntentFlagPurpose[] values() {
            return (IntentFlagPurpose[]) $VALUES.clone();
        }
    }

    UriAction createUriActionFromUri(Uri uri, Bundle extras, boolean openInWebView, Channel channel);

    UriAction createUriActionFromUrlString(String url, Bundle extras, boolean openInWebView, Channel channel);

    int getIntentFlags(IntentFlagPurpose intentFlagPurpose);

    void gotoUri(Context context, UriAction uriAction);
}
