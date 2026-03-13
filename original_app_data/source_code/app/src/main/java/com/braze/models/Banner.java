package com.braze.models;

import Od.v;
import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\b\u0007\u0018\u0000 '2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001(BA\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\f\u0010\u0016R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u0011R$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/braze/models/Banner;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "", "trackingId", "placementId", "html", "", "isControl", "", "expirationTimestampSeconds", "isTestSend", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJZLorg/json/JSONObject;)V", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/Banner;", "deepcopy", "isExpired", "()Z", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTrackingId", "getPlacementId", "getHtml", "Z", "J", "getExpirationTimestampSeconds", "()J", "Lorg/json/JSONObject;", "getProperties", Constants.USER_ID, "getUserId", "setUserId", "(Ljava/lang/String;)V", "Companion", "com/braze/models/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Banner implements IPutIntoJson<JSONObject> {
    public static final a Companion = new a();
    private final long expirationTimestampSeconds;
    private final String html;
    private final boolean isControl;
    private final boolean isTestSend;
    private final String placementId;
    private final JSONObject properties;
    private final String trackingId;
    private String userId;

    public Banner(String trackingId, String placementId, String html, boolean z10, long j10, boolean z11, JSONObject properties) {
        AbstractC4862t.e(trackingId, "trackingId");
        AbstractC4862t.e(placementId, "placementId");
        AbstractC4862t.e(html, "html");
        AbstractC4862t.e(properties, "properties");
        this.trackingId = trackingId;
        this.placementId = placementId;
        this.html = html;
        this.isControl = z10;
        this.expirationTimestampSeconds = j10;
        this.isTestSend = z11;
        this.properties = properties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0() {
        return "Caught exception creating Banner Json.";
    }

    public final Banner deepcopy$android_sdk_base_release() {
        return new Banner(this.trackingId, this.placementId, this.html, this.isControl, this.expirationTimestampSeconds, this.isTestSend, getProperties());
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public JSONObject getProperties() {
        return this.properties;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: isControl, reason: from getter */
    public final boolean getIsControl() {
        return this.isControl;
    }

    public final boolean isExpired() {
        long j10 = this.expirationTimestampSeconds;
        return j10 != -1 && j10 < DateTimeUtils.nowInSeconds();
    }

    /* JADX INFO: renamed from: isTestSend, reason: from getter */
    public final boolean getIsTestSend() {
        return this.isTestSend;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return v.n("\n            Banner{\n            trackingId='" + this.trackingId + "'\n            placementId='" + this.placementId + "'\n            html='" + this.html + "'\n            isControl=" + this.isControl + "\n            expirationTimestampSeconds=" + this.expirationTimestampSeconds + "\n            isTestSend=" + this.isTestSend + "\n            properties=" + getProperties() + "\n            }\n        ");
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getValue() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", this.trackingId);
            jSONObject2.put("placement_id", this.placementId);
            jSONObject2.put("html", this.html);
            jSONObject2.put("is_control", this.isControl);
            jSONObject2.put("expires_at", this.expirationTimestampSeconds);
            jSONObject2.put("is_test_send", this.isTestSend);
            jSONObject2.put("properties", getProperties());
            jSONObject.put("banner", jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: d5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return Banner.forJsonPut$lambda$0();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }
}
