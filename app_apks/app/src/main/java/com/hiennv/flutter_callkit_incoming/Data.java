package com.hiennv.flutter_callkit_incoming;

import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonProperty;
import gc.Q;
import io.sentry.ProfileChunk;
import io.sentry.SentryBaseEvent;
import io.sentry.TransactionOptions;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.Request;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\bT\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0097\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\t\u0010\u008f\u0001\u001a\u00020\u001fH\u0016J\u0015\u0010\u0090\u0001\u001a\u00020>2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001J\u0018\u0010\u0094\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003HÆ\u0003J\"\u0010\u0095\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003HÆ\u0001J\n\u0010\u0096\u0001\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR>\u00100\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000101j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001`28\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R>\u00107\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000101j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001`28\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001e\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u000eR\u001e\u0010=\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010?\"\u0004\bC\u0010AR\u001e\u0010D\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\u001e\u0010F\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\u001e\u0010I\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010?\"\u0004\bJ\u0010AR\u001e\u0010K\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000eR\u001e\u0010N\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\f\"\u0004\bP\u0010\u000eR\u001e\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR\u001e\u0010T\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010\u000eR\u001e\u0010W\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\f\"\u0004\bY\u0010\u000eR \u0010Z\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\f\"\u0004\b\\\u0010\u000eR \u0010]\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\f\"\u0004\b_\u0010\u000eR\"\u0010`\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010e\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010f\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010?\"\u0004\bg\u0010AR\u001e\u0010h\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010!\"\u0004\bj\u0010#R \u0010k\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\f\"\u0004\bm\u0010\u000eR \u0010n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\f\"\u0004\bp\u0010\u000eR\u001e\u0010q\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010?\"\u0004\br\u0010AR\u001e\u0010s\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010?\"\u0004\bt\u0010AR \u0010u\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\f\"\u0004\bw\u0010\u000eR\u001e\u0010x\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010?\"\u0004\by\u0010AR \u0010z\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\f\"\u0004\b|\u0010\u000eR \u0010}\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\f\"\u0004\b\u007f\u0010\u000eR!\u0010\u0080\u0001\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010?\"\u0005\b\u0081\u0001\u0010AR!\u0010\u0082\u0001\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010?\"\u0005\b\u0083\u0001\u0010AR!\u0010\u0084\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010!\"\u0005\b\u0086\u0001\u0010#R!\u0010\u0087\u0001\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010?\"\u0005\b\u0088\u0001\u0010AR!\u0010\u0089\u0001\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010?\"\u0005\b\u008a\u0001\u0010AR!\u0010\u008b\u0001\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010?\"\u0005\b\u008c\u0001\u0010AR!\u0010\u008d\u0001\u001a\u00020>8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010?\"\u0005\b\u008e\u0001\u0010A¨\u0006\u0098\u0001"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/Data;", "", "args", "", "", "<init>", "(Ljava/util/Map;)V", "()V", "getArgs", "()Ljava/util/Map;", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", DebugImage.JsonKeys.UUID, "getUuid", "setUuid", "nameCaller", "getNameCaller", "setNameCaller", "appName", "getAppName", "setAppName", "handle", "getHandle", "setHandle", "avatar", "getAvatar", "setAvatar", "type", "", "getType", "()I", "setType", "(I)V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "textAccept", "getTextAccept", "setTextAccept", "textDecline", "getTextDecline", "setTextDecline", SentryBaseEvent.JsonKeys.EXTRA, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getExtra", "()Ljava/util/HashMap;", "setExtra", "(Ljava/util/HashMap;)V", "headers", "getHeaders", "setHeaders", "from", "getFrom", "setFrom", "isCustomNotification", "", "()Z", "setCustomNotification", "(Z)V", "isCustomSmallExNotification", "setCustomSmallExNotification", "isShowLogo", "setShowLogo", "logoUrl", "getLogoUrl", "setLogoUrl", "isShowCallID", "setShowCallID", "ringtonePath", "getRingtonePath", "setRingtonePath", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "backgroundUrl", "getBackgroundUrl", "setBackgroundUrl", "textColor", "getTextColor", "setTextColor", "actionColor", "getActionColor", "setActionColor", "incomingCallNotificationChannelName", "getIncomingCallNotificationChannelName", "setIncomingCallNotificationChannelName", "missedCallNotificationChannelName", "getMissedCallNotificationChannelName", "setMissedCallNotificationChannelName", "missedNotificationId", "getMissedNotificationId", "()Ljava/lang/Integer;", "setMissedNotificationId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isShowMissedCallNotification", "setShowMissedCallNotification", "missedNotificationCount", "getMissedNotificationCount", "setMissedNotificationCount", "missedNotificationSubtitle", "getMissedNotificationSubtitle", "setMissedNotificationSubtitle", "missedNotificationCallbackText", "getMissedNotificationCallbackText", "setMissedNotificationCallbackText", "isShowCallback", "setShowCallback", "isAccepted", "setAccepted", "callingNotificationId", "getCallingNotificationId", "setCallingNotificationId", "isShowCallingNotification", "setShowCallingNotification", "callingNotificationSubtitle", "getCallingNotificationSubtitle", "setCallingNotificationSubtitle", "callingNotificationHangupText", "getCallingNotificationHangupText", "setCallingNotificationHangupText", "isShowHangup", "setShowHangup", "isOnHold", "setOnHold", "audioRoute", "getAudioRoute", "setAudioRoute", "isMuted", "setMuted", "isShowFullLockedScreen", "setShowFullLockedScreen", "isImportant", "setImportant", "isBot", "setBot", "hashCode", "equals", Request.JsonKeys.OTHER, "toBundle", "Landroid/os/Bundle;", "component1", "copy", "toString", "Companion", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Data {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JsonProperty("actionColor")
    private String actionColor;

    @JsonProperty("appName")
    private String appName;
    private final Map<String, Object> args;

    @JsonProperty("audioRoute")
    private int audioRoute;

    @JsonProperty("avatar")
    private String avatar;

    @JsonProperty("backgroundColor")
    private String backgroundColor;

    @JsonProperty("backgroundUrl")
    private String backgroundUrl;

    @JsonProperty("callingNotificationCallbackText")
    private String callingNotificationHangupText;

    @JsonProperty("callingNotificationId")
    private String callingNotificationId;

    @JsonProperty("callingNotificationSubtitle")
    private String callingNotificationSubtitle;

    @JsonProperty("duration")
    private long duration;

    @JsonProperty(SentryBaseEvent.JsonKeys.EXTRA)
    private HashMap<String, Object> extra;

    @JsonProperty("from")
    private String from;

    @JsonProperty("handle")
    private String handle;

    @JsonProperty("headers")
    private HashMap<String, Object> headers;

    @JsonProperty("id")
    private String id;

    @JsonProperty("incomingCallNotificationChannelName")
    private String incomingCallNotificationChannelName;

    @JsonProperty("isAccepted")
    private boolean isAccepted;

    @JsonProperty("isBot")
    private boolean isBot;

    @JsonProperty("isCustomNotification")
    private boolean isCustomNotification;

    @JsonProperty("isCustomSmallExNotification")
    private boolean isCustomSmallExNotification;

    @JsonProperty("isImportant")
    private boolean isImportant;

    @JsonProperty("isMuted")
    private boolean isMuted;

    @JsonProperty("isOnHold")
    private boolean isOnHold;

    @JsonProperty("isShowCallID")
    private boolean isShowCallID;

    @JsonProperty("isShowCallback")
    private boolean isShowCallback;

    @JsonProperty("isShowCallingNotification")
    private boolean isShowCallingNotification;

    @JsonProperty("isShowFullLockedScreen")
    private boolean isShowFullLockedScreen;

    @JsonProperty("isShowHangup")
    private boolean isShowHangup;

    @JsonProperty("isShowLogo")
    private boolean isShowLogo;

    @JsonProperty("isShowMissedCallNotification")
    private boolean isShowMissedCallNotification;

    @JsonProperty("logoUrl")
    private String logoUrl;

    @JsonProperty("missedCallNotificationChannelName")
    private String missedCallNotificationChannelName;

    @JsonProperty("missedNotificationCallbackText")
    private String missedNotificationCallbackText;

    @JsonProperty("missedNotificationCount")
    private int missedNotificationCount;

    @JsonProperty("missedNotificationId")
    private Integer missedNotificationId;

    @JsonProperty("missedNotificationSubtitle")
    private String missedNotificationSubtitle;

    @JsonProperty("nameCaller")
    private String nameCaller;

    @JsonProperty("ringtonePath")
    private String ringtonePath;

    @JsonProperty("textAccept")
    private String textAccept;

    @JsonProperty("textColor")
    private String textColor;

    @JsonProperty("textDecline")
    private String textDecline;

    @JsonProperty("type")
    private int type;

    @JsonProperty(DebugImage.JsonKeys.UUID)
    private String uuid;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/Data$Companion;", "", "<init>", "()V", "fromBundle", "Lcom/hiennv/flutter_callkit_incoming/Data;", "bundle", "Landroid/os/Bundle;", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Data fromBundle(Bundle bundle) {
            AbstractC4862t.e(bundle, "bundle");
            Data data = new Data(Q.i());
            String string = bundle.getString(CallkitConstants.EXTRA_CALLKIT_ID, "");
            AbstractC4862t.d(string, "getString(...)");
            data.setId(string);
            String string2 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, "");
            AbstractC4862t.d(string2, "getString(...)");
            data.setNameCaller(string2);
            String string3 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_APP_NAME, "");
            AbstractC4862t.d(string3, "getString(...)");
            data.setAppName(string3);
            String string4 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, "");
            AbstractC4862t.d(string4, "getString(...)");
            data.setHandle(string4);
            String string5 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "");
            AbstractC4862t.d(string5, "getString(...)");
            data.setAvatar(string5);
            data.setType(bundle.getInt(CallkitConstants.EXTRA_CALLKIT_TYPE, 0));
            data.setDuration(bundle.getLong(CallkitConstants.EXTRA_CALLKIT_DURATION, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION));
            String string6 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_ACCEPT, "");
            AbstractC4862t.d(string6, "getString(...)");
            data.setTextAccept(string6);
            String string7 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_DECLINE, "");
            AbstractC4862t.d(string7, "getString(...)");
            data.setTextDecline(string7);
            data.setImportant(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_IMPORTANT, false));
            data.setBot(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_BOT, false));
            data.setMissedNotificationId(Integer.valueOf(bundle.getInt(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_ID)));
            data.setShowMissedCallNotification(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_SHOW, true));
            data.setMissedNotificationCount(bundle.getInt(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_COUNT, 1));
            data.setMissedNotificationSubtitle(bundle.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_SUBTITLE, ""));
            data.setShowCallback(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_SHOW, false));
            data.setMissedNotificationCallbackText(bundle.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_TEXT, ""));
            data.setCallingNotificationId(bundle.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_ID));
            data.setShowCallingNotification(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_SHOW, true));
            data.setCallingNotificationSubtitle(bundle.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_SUBTITLE, ""));
            data.setShowHangup(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_SHOW, false));
            data.setCallingNotificationHangupText(bundle.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_TEXT, ""));
            Serializable serializable = bundle.getSerializable(CallkitConstants.EXTRA_CALLKIT_EXTRA);
            AbstractC4862t.c(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
            data.setExtra((HashMap) serializable);
            Serializable serializable2 = bundle.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS);
            AbstractC4862t.c(serializable2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
            data.setHeaders((HashMap) serializable2);
            data.setCustomNotification(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_NOTIFICATION, false));
            data.setCustomSmallExNotification(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_SMALL_EX_NOTIFICATION, false));
            data.setShowLogo(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_LOGO, false));
            String string8 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_LOGO_URL, "");
            AbstractC4862t.d(string8, "getString(...)");
            data.setLogoUrl(string8);
            data.setShowCallID(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_CALL_ID, false));
            String string9 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_RINGTONE_PATH, "");
            AbstractC4862t.d(string9, "getString(...)");
            data.setRingtonePath(string9);
            String string10 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_BACKGROUND_COLOR, "#0955fa");
            AbstractC4862t.d(string10, "getString(...)");
            data.setBackgroundColor(string10);
            String string11 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_BACKGROUND_URL, "");
            AbstractC4862t.d(string11, "getString(...)");
            data.setBackgroundUrl(string11);
            String string12 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_ACTION_COLOR, "#4CAF50");
            AbstractC4862t.d(string12, "getString(...)");
            data.setActionColor(string12);
            String string13 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_COLOR, "#FFFFFF");
            AbstractC4862t.d(string13, "getString(...)");
            data.setTextColor(string13);
            String string14 = bundle.getString(CallkitConstants.EXTRA_CALLKIT_ACTION_FROM, "");
            AbstractC4862t.d(string14, "getString(...)");
            data.setFrom(string14);
            data.setIncomingCallNotificationChannelName(bundle.getString(CallkitConstants.EXTRA_CALLKIT_INCOMING_CALL_NOTIFICATION_CHANNEL_NAME));
            data.setMissedCallNotificationChannelName(bundle.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_NOTIFICATION_CHANNEL_NAME));
            data.setShowFullLockedScreen(bundle.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_FULL_LOCKED_SCREEN, true));
            return data;
        }

        private Companion() {
        }
    }

    public Data(Map<String, ? extends Object> args) {
        long jIntValue;
        AbstractC4862t.e(args, "args");
        this.args = args;
        Object obj = args.get("id");
        String str = obj instanceof String ? (String) obj : null;
        this.id = str == null ? "" : str;
        Object obj2 = args.get("id");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        this.uuid = str2 == null ? "" : str2;
        Object obj3 = args.get("nameCaller");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        this.nameCaller = str3 == null ? "" : str3;
        Object obj4 = args.get("appName");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        this.appName = str4 == null ? "" : str4;
        Object obj5 = args.get("handle");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        this.handle = str5 == null ? "" : str5;
        Object obj6 = args.get("avatar");
        String str6 = obj6 instanceof String ? (String) obj6 : null;
        this.avatar = str6 == null ? "" : str6;
        Object obj7 = args.get("type");
        Integer num = obj7 instanceof Integer ? (Integer) obj7 : null;
        this.type = num != null ? num.intValue() : 0;
        Object obj8 = args.get("duration");
        Long l10 = obj8 instanceof Long ? (Long) obj8 : null;
        if (l10 != null) {
            jIntValue = l10.longValue();
        } else {
            Object obj9 = args.get("duration");
            jIntValue = (obj9 instanceof Integer ? (Integer) obj9 : null) != null ? r1.intValue() : TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        }
        this.duration = jIntValue;
        Object obj10 = args.get("textAccept");
        String str7 = obj10 instanceof String ? (String) obj10 : null;
        this.textAccept = str7 == null ? "" : str7;
        Object obj11 = args.get("textDecline");
        String str8 = obj11 instanceof String ? (String) obj11 : null;
        this.textDecline = str8 == null ? "" : str8;
        Object obj12 = args.get(SentryBaseEvent.JsonKeys.EXTRA);
        this.extra = (HashMap) (obj12 == null ? new HashMap() : obj12);
        Object obj13 = args.get("headers");
        this.headers = (HashMap) (obj13 == null ? new HashMap() : obj13);
        this.from = "";
        this.isShowMissedCallNotification = true;
        this.missedNotificationCount = 1;
        this.isShowCallback = true;
        this.isShowCallingNotification = true;
        this.isShowHangup = true;
        Object obj14 = args.get("isOnHold");
        Boolean bool = obj14 instanceof Boolean ? (Boolean) obj14 : null;
        this.isOnHold = bool != null ? bool.booleanValue() : false;
        Object obj15 = args.get("audioRoute");
        Integer num2 = obj15 instanceof Integer ? (Integer) obj15 : null;
        this.audioRoute = num2 != null ? num2.intValue() : 1;
        Object obj16 = args.get("isMuted");
        Boolean bool2 = obj16 instanceof Boolean ? (Boolean) obj16 : null;
        this.isMuted = bool2 != null ? bool2.booleanValue() : false;
        this.isShowFullLockedScreen = true;
        Object obj17 = args.get(ProfileChunk.PLATFORM_ANDROID);
        Map<String, ? extends Object> map = obj17 instanceof HashMap ? (HashMap) obj17 : null;
        map = map == null ? args : map;
        Object obj18 = map.get("isCustomNotification");
        Boolean bool3 = obj18 instanceof Boolean ? (Boolean) obj18 : null;
        this.isCustomNotification = bool3 != null ? bool3.booleanValue() : false;
        Object obj19 = map.get("isCustomSmallExNotification");
        Boolean bool4 = obj19 instanceof Boolean ? (Boolean) obj19 : null;
        this.isCustomSmallExNotification = bool4 != null ? bool4.booleanValue() : false;
        Object obj20 = map.get("isShowLogo");
        Boolean bool5 = obj20 instanceof Boolean ? (Boolean) obj20 : null;
        this.isShowLogo = bool5 != null ? bool5.booleanValue() : false;
        Object obj21 = map.get("logoUrl");
        String str9 = obj21 instanceof String ? (String) obj21 : null;
        this.logoUrl = str9 == null ? "" : str9;
        Object obj22 = map.get("isShowCallID");
        Boolean bool6 = obj22 instanceof Boolean ? (Boolean) obj22 : null;
        this.isShowCallID = bool6 != null ? bool6.booleanValue() : false;
        Object obj23 = map.get("ringtonePath");
        String str10 = obj23 instanceof String ? (String) obj23 : null;
        this.ringtonePath = str10 == null ? "" : str10;
        Object obj24 = map.get("backgroundColor");
        String str11 = obj24 instanceof String ? (String) obj24 : null;
        this.backgroundColor = str11 == null ? "#0955fa" : str11;
        Object obj25 = map.get("backgroundUrl");
        String str12 = obj25 instanceof String ? (String) obj25 : null;
        this.backgroundUrl = str12 == null ? "" : str12;
        Object obj26 = map.get("actionColor");
        String str13 = obj26 instanceof String ? (String) obj26 : null;
        this.actionColor = str13 == null ? "#4CAF50" : str13;
        Object obj27 = map.get("textColor");
        String str14 = obj27 instanceof String ? (String) obj27 : null;
        this.textColor = str14 == null ? "#ffffff" : str14;
        Object obj28 = map.get("incomingCallNotificationChannelName");
        this.incomingCallNotificationChannelName = obj28 instanceof String ? (String) obj28 : null;
        Object obj29 = map.get("missedCallNotificationChannelName");
        this.missedCallNotificationChannelName = obj29 instanceof String ? (String) obj29 : null;
        Object obj30 = map.get("isShowFullLockedScreen");
        Boolean bool7 = obj30 instanceof Boolean ? (Boolean) obj30 : null;
        this.isShowFullLockedScreen = bool7 != null ? bool7.booleanValue() : true;
        Object obj31 = map.get("isImportant");
        Boolean bool8 = obj31 instanceof Boolean ? (Boolean) obj31 : null;
        this.isImportant = bool8 != null ? bool8.booleanValue() : false;
        Object obj32 = map.get("isBot");
        Boolean bool9 = obj32 instanceof Boolean ? (Boolean) obj32 : null;
        this.isBot = bool9 != null ? bool9.booleanValue() : false;
        Object obj33 = args.get("missedCallNotification");
        Map map2 = obj33 instanceof Map ? (Map) obj33 : null;
        if (map2 != null) {
            Object obj34 = map2.get("id");
            this.missedNotificationId = obj34 instanceof Integer ? (Integer) obj34 : null;
            Object obj35 = map2.get("subtitle");
            this.missedNotificationSubtitle = obj35 instanceof String ? (String) obj35 : null;
            Object obj36 = map2.get("count");
            Integer num3 = obj36 instanceof Integer ? (Integer) obj36 : null;
            this.missedNotificationCount = num3 != null ? num3.intValue() : 1;
            Object obj37 = map2.get("callbackText");
            this.missedNotificationCallbackText = obj37 instanceof String ? (String) obj37 : null;
            Object obj38 = map2.get("isShowCallback");
            Boolean bool10 = obj38 instanceof Boolean ? (Boolean) obj38 : null;
            this.isShowCallback = bool10 != null ? bool10.booleanValue() : true;
            Object obj39 = map2.get("showNotification");
            Boolean bool11 = obj39 instanceof Boolean ? (Boolean) obj39 : null;
            this.isShowMissedCallNotification = bool11 != null ? bool11.booleanValue() : true;
        } else {
            Object obj40 = args.get("textMissedCall");
            String str15 = obj40 instanceof String ? (String) obj40 : null;
            this.missedNotificationSubtitle = str15 == null ? "" : str15;
            Object obj41 = args.get("textCallback");
            String str16 = obj41 instanceof String ? (String) obj41 : null;
            this.missedNotificationCallbackText = str16 != null ? str16 : "";
            Object obj42 = map.get("isShowCallback");
            Boolean bool12 = obj42 instanceof Boolean ? (Boolean) obj42 : null;
            this.isShowCallback = bool12 != null ? bool12.booleanValue() : true;
            Object obj43 = map.get("isShowMissedCallNotification");
            Boolean bool13 = obj43 instanceof Boolean ? (Boolean) obj43 : null;
            this.isShowMissedCallNotification = bool13 != null ? bool13.booleanValue() : true;
        }
        Object obj44 = args.get("callingNotification");
        Map map3 = obj44 instanceof Map ? (Map) obj44 : null;
        if (map3 != null) {
            Object obj45 = map3.get("id");
            this.callingNotificationId = obj45 instanceof String ? (String) obj45 : null;
            Object obj46 = map3.get("subtitle");
            this.callingNotificationSubtitle = obj46 instanceof String ? (String) obj46 : null;
            Object obj47 = map3.get("callbackText");
            this.callingNotificationHangupText = obj47 instanceof String ? (String) obj47 : null;
            Object obj48 = map3.get("isShowCallback");
            Boolean bool14 = obj48 instanceof Boolean ? (Boolean) obj48 : null;
            this.isShowHangup = bool14 != null ? bool14.booleanValue() : true;
            Object obj49 = map3.get("showNotification");
            Boolean bool15 = obj49 instanceof Boolean ? (Boolean) obj49 : null;
            this.isShowCallingNotification = bool15 != null ? bool15.booleanValue() : true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = data.args;
        }
        return data.copy(map);
    }

    public final Map<String, Object> component1() {
        return this.args;
    }

    public final Data copy(Map<String, ? extends Object> args) {
        AbstractC4862t.e(args, "args");
        return new Data(args);
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        return AbstractC4862t.a(this.id, ((Data) other).id);
    }

    public final String getActionColor() {
        return this.actionColor;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final Map<String, Object> getArgs() {
        return this.args;
    }

    public final int getAudioRoute() {
        return this.audioRoute;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final String getCallingNotificationHangupText() {
        return this.callingNotificationHangupText;
    }

    public final String getCallingNotificationId() {
        return this.callingNotificationId;
    }

    public final String getCallingNotificationSubtitle() {
        return this.callingNotificationSubtitle;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final HashMap<String, Object> getExtra() {
        return this.extra;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final HashMap<String, Object> getHeaders() {
        return this.headers;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIncomingCallNotificationChannelName() {
        return this.incomingCallNotificationChannelName;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getMissedCallNotificationChannelName() {
        return this.missedCallNotificationChannelName;
    }

    public final String getMissedNotificationCallbackText() {
        return this.missedNotificationCallbackText;
    }

    public final int getMissedNotificationCount() {
        return this.missedNotificationCount;
    }

    public final Integer getMissedNotificationId() {
        return this.missedNotificationId;
    }

    public final String getMissedNotificationSubtitle() {
        return this.missedNotificationSubtitle;
    }

    public final String getNameCaller() {
        return this.nameCaller;
    }

    public final String getRingtonePath() {
        return this.ringtonePath;
    }

    public final String getTextAccept() {
        return this.textAccept;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextDecline() {
        return this.textDecline;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    /* JADX INFO: renamed from: isAccepted, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    /* JADX INFO: renamed from: isBot, reason: from getter */
    public final boolean getIsBot() {
        return this.isBot;
    }

    /* JADX INFO: renamed from: isCustomNotification, reason: from getter */
    public final boolean getIsCustomNotification() {
        return this.isCustomNotification;
    }

    /* JADX INFO: renamed from: isCustomSmallExNotification, reason: from getter */
    public final boolean getIsCustomSmallExNotification() {
        return this.isCustomSmallExNotification;
    }

    /* JADX INFO: renamed from: isImportant, reason: from getter */
    public final boolean getIsImportant() {
        return this.isImportant;
    }

    /* JADX INFO: renamed from: isMuted, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* JADX INFO: renamed from: isOnHold, reason: from getter */
    public final boolean getIsOnHold() {
        return this.isOnHold;
    }

    /* JADX INFO: renamed from: isShowCallID, reason: from getter */
    public final boolean getIsShowCallID() {
        return this.isShowCallID;
    }

    /* JADX INFO: renamed from: isShowCallback, reason: from getter */
    public final boolean getIsShowCallback() {
        return this.isShowCallback;
    }

    /* JADX INFO: renamed from: isShowCallingNotification, reason: from getter */
    public final boolean getIsShowCallingNotification() {
        return this.isShowCallingNotification;
    }

    /* JADX INFO: renamed from: isShowFullLockedScreen, reason: from getter */
    public final boolean getIsShowFullLockedScreen() {
        return this.isShowFullLockedScreen;
    }

    /* JADX INFO: renamed from: isShowHangup, reason: from getter */
    public final boolean getIsShowHangup() {
        return this.isShowHangup;
    }

    /* JADX INFO: renamed from: isShowLogo, reason: from getter */
    public final boolean getIsShowLogo() {
        return this.isShowLogo;
    }

    /* JADX INFO: renamed from: isShowMissedCallNotification, reason: from getter */
    public final boolean getIsShowMissedCallNotification() {
        return this.isShowMissedCallNotification;
    }

    public final void setAccepted(boolean z10) {
        this.isAccepted = z10;
    }

    public final void setActionColor(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.actionColor = str;
    }

    public final void setAppName(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.appName = str;
    }

    public final void setAudioRoute(int i10) {
        this.audioRoute = i10;
    }

    public final void setAvatar(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.avatar = str;
    }

    public final void setBackgroundColor(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.backgroundColor = str;
    }

    public final void setBackgroundUrl(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.backgroundUrl = str;
    }

    public final void setBot(boolean z10) {
        this.isBot = z10;
    }

    public final void setCallingNotificationHangupText(String str) {
        this.callingNotificationHangupText = str;
    }

    public final void setCallingNotificationId(String str) {
        this.callingNotificationId = str;
    }

    public final void setCallingNotificationSubtitle(String str) {
        this.callingNotificationSubtitle = str;
    }

    public final void setCustomNotification(boolean z10) {
        this.isCustomNotification = z10;
    }

    public final void setCustomSmallExNotification(boolean z10) {
        this.isCustomSmallExNotification = z10;
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setExtra(HashMap<String, Object> map) {
        AbstractC4862t.e(map, "<set-?>");
        this.extra = map;
    }

    public final void setFrom(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.from = str;
    }

    public final void setHandle(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.handle = str;
    }

    public final void setHeaders(HashMap<String, Object> map) {
        AbstractC4862t.e(map, "<set-?>");
        this.headers = map;
    }

    public final void setId(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.id = str;
    }

    public final void setImportant(boolean z10) {
        this.isImportant = z10;
    }

    public final void setIncomingCallNotificationChannelName(String str) {
        this.incomingCallNotificationChannelName = str;
    }

    public final void setLogoUrl(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.logoUrl = str;
    }

    public final void setMissedCallNotificationChannelName(String str) {
        this.missedCallNotificationChannelName = str;
    }

    public final void setMissedNotificationCallbackText(String str) {
        this.missedNotificationCallbackText = str;
    }

    public final void setMissedNotificationCount(int i10) {
        this.missedNotificationCount = i10;
    }

    public final void setMissedNotificationId(Integer num) {
        this.missedNotificationId = num;
    }

    public final void setMissedNotificationSubtitle(String str) {
        this.missedNotificationSubtitle = str;
    }

    public final void setMuted(boolean z10) {
        this.isMuted = z10;
    }

    public final void setNameCaller(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.nameCaller = str;
    }

    public final void setOnHold(boolean z10) {
        this.isOnHold = z10;
    }

    public final void setRingtonePath(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.ringtonePath = str;
    }

    public final void setShowCallID(boolean z10) {
        this.isShowCallID = z10;
    }

    public final void setShowCallback(boolean z10) {
        this.isShowCallback = z10;
    }

    public final void setShowCallingNotification(boolean z10) {
        this.isShowCallingNotification = z10;
    }

    public final void setShowFullLockedScreen(boolean z10) {
        this.isShowFullLockedScreen = z10;
    }

    public final void setShowHangup(boolean z10) {
        this.isShowHangup = z10;
    }

    public final void setShowLogo(boolean z10) {
        this.isShowLogo = z10;
    }

    public final void setShowMissedCallNotification(boolean z10) {
        this.isShowMissedCallNotification = z10;
    }

    public final void setTextAccept(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.textAccept = str;
    }

    public final void setTextColor(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.textColor = str;
    }

    public final void setTextDecline(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.textDecline = str;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    public final void setUuid(String str) {
        AbstractC4862t.e(str, "<set-?>");
        this.uuid = str;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_ID, this.id);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, this.nameCaller);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_HANDLE, this.handle);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_AVATAR, this.avatar);
        bundle.putInt(CallkitConstants.EXTRA_CALLKIT_TYPE, this.type);
        bundle.putLong(CallkitConstants.EXTRA_CALLKIT_DURATION, this.duration);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_TEXT_ACCEPT, this.textAccept);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_TEXT_DECLINE, this.textDecline);
        Integer num = this.missedNotificationId;
        if (num != null) {
            bundle.putInt(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_ID, num.intValue());
        }
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_SHOW, this.isShowMissedCallNotification);
        bundle.putInt(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_COUNT, this.missedNotificationCount);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_SUBTITLE, this.missedNotificationSubtitle);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_SHOW, this.isShowCallback);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_TEXT, this.missedNotificationCallbackText);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_CALLING_ID, this.callingNotificationId);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_SHOW, this.isShowCallingNotification);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_CALLING_SUBTITLE, this.callingNotificationSubtitle);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_SHOW, this.isShowHangup);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_TEXT, this.callingNotificationHangupText);
        bundle.putSerializable(CallkitConstants.EXTRA_CALLKIT_EXTRA, this.extra);
        bundle.putSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS, this.headers);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_NOTIFICATION, this.isCustomNotification);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_SMALL_EX_NOTIFICATION, this.isCustomSmallExNotification);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_LOGO, this.isShowLogo);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_LOGO_URL, this.logoUrl);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_CALL_ID, this.isShowCallID);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_RINGTONE_PATH, this.ringtonePath);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_BACKGROUND_COLOR, this.backgroundColor);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_BACKGROUND_URL, this.backgroundUrl);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_TEXT_COLOR, this.textColor);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_ACTION_COLOR, this.actionColor);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_ACTION_FROM, this.from);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_INCOMING_CALL_NOTIFICATION_CHANNEL_NAME, this.incomingCallNotificationChannelName);
        bundle.putString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_NOTIFICATION_CHANNEL_NAME, this.missedCallNotificationChannelName);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_FULL_LOCKED_SCREEN, this.isShowFullLockedScreen);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_IS_IMPORTANT, this.isImportant);
        bundle.putBoolean(CallkitConstants.EXTRA_CALLKIT_IS_BOT, this.isBot);
        return bundle;
    }

    public String toString() {
        return "Data(args=" + this.args + ')';
    }

    public Data() {
        this(Q.i());
    }
}
