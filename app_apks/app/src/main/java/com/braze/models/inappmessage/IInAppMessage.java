package com.braze.models.inappmessage;

import android.net.Uri;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.models.IPutIntoJson;
import io.sentry.protocol.Device;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\bR\u001c\u0010\u001b\u001a\u00020\u00168&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\f8&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u00020\f8&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b#\u0010\u0011\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u001eR\u0014\u0010%\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000eR\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001c\u00103\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00109\u001a\u0002048&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010?\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010D\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010J\u001a\u00020E8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020\f8&@&X¦\u000e¢\u0006\u0012\u0012\u0004\bM\u0010\u0011\u001a\u0004\bK\u0010\u000e\"\u0004\bL\u0010\u001eR\u0014\u0010R\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001c\u0010S\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\bS\u0010\u000e\"\u0004\bT\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006UÀ\u0006\u0001"}, d2 = {"Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "", "remotePathToLocalAssetMap", "Lfc/H;", "setLocalPrefetchedAssetPaths", "(Ljava/util/Map;)V", "", "getRemoteAssetPathsForPrefetch", "()Ljava/util/List;", "", "logImpression", "()Z", "logClick", "onAfterClosed", "()V", "getExtras", "()Ljava/util/Map;", "setExtras", "extras", "", "getDurationInMilliseconds", "()I", "setDurationInMilliseconds", "(I)V", "durationInMilliseconds", "getAnimateOut", "setAnimateOut", "(Z)V", "getAnimateOut$annotations", "animateOut", "getAnimateIn", "setAnimateIn", "getAnimateIn$annotations", "animateIn", "isControl", "Lcom/braze/enums/inappmessage/ClickAction;", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lcom/braze/enums/inappmessage/DismissType;", "getDismissType", "()Lcom/braze/enums/inappmessage/DismissType;", "setDismissType", "(Lcom/braze/enums/inappmessage/DismissType;)V", "dismissType", "Lcom/braze/enums/inappmessage/Orientation;", "getOrientation", "()Lcom/braze/enums/inappmessage/Orientation;", "setOrientation", "(Lcom/braze/enums/inappmessage/Orientation;)V", Device.JsonKeys.ORIENTATION, "Lcom/braze/enums/inappmessage/CropType;", "getCropType", "()Lcom/braze/enums/inappmessage/CropType;", "setCropType", "(Lcom/braze/enums/inappmessage/CropType;)V", "cropType", "getAltImageText", "()Ljava/lang/String;", "setAltImageText", "(Ljava/lang/String;)V", "altImageText", "", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "expirationTimestamp", "getOpenUriInWebView", "setOpenUriInWebView", "getOpenUriInWebView$annotations", "openUriInWebView", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "isTestSend", "setTestSend", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IInAppMessage extends IPutIntoJson<JSONObject> {
    String getAltImageText();

    boolean getAnimateIn();

    boolean getAnimateOut();

    ClickAction getClickAction();

    CropType getCropType();

    DismissType getDismissType();

    int getDurationInMilliseconds();

    long getExpirationTimestamp();

    Map<String, String> getExtras();

    MessageType getMessageType();

    boolean getOpenUriInWebView();

    Orientation getOrientation();

    List<String> getRemoteAssetPathsForPrefetch();

    Uri getUri();

    boolean isControl();

    boolean logClick();

    boolean logImpression();

    void onAfterClosed();

    void setAnimateIn(boolean z10);

    void setAnimateOut(boolean z10);

    void setExpirationTimestamp(long j10);

    void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap);

    void setTestSend(boolean z10);
}
