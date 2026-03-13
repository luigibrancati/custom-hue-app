package com.braze.models;

import Od.v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import fe.InterfaceC4048d;
import ge.AbstractC4232e0;
import ge.s0;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b,\b\u0007\u0018\u0000 U2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0002VWBk\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u0012\u0004\b2\u00103R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010&R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b:\u00103\u001a\u0004\b8\u00109R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b<\u00103\u001a\u0004\b;\u00109R \u0010\u000b\u001a\u00020\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b?\u00103\u001a\u0004\b>\u00100R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\bA\u00103\u001a\u0004\b@\u00100R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\bC\u00103\u001a\u0004\bB\u00100R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010D\u0012\u0004\bG\u00103\u001a\u0004\bE\u0010FR \u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bI\u00103\u001a\u0004\bH\u0010FR \u0010\u0011\u001a\u00020\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010D\u0012\u0004\bK\u00103\u001a\u0004\bJ\u0010FR \u0010\u0012\u001a\u00020\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010D\u0012\u0004\bM\u00103\u001a\u0004\bL\u0010FR \u0010\u0013\u001a\u00020\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010=\u0012\u0004\bO\u00103\u001a\u0004\bN\u00100R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00107\u001a\u0004\bP\u00109\"\u0004\bQ\u0010RR\u0011\u0010T\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bS\u00109¨\u0006X"}, d2 = {"Lcom/braze/models/BrazeGeofence;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "jsonObject", "", "id", "", "latitude", "longitude", "", "radiusMeter", "cooldownEnterSeconds", "cooldownExitSeconds", "", "analyticsEnabledEnter", "analyticsEnabledExit", "enterEvents", "exitEvents", "notificationResponsivenessMs", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;DDIIIZZZZI)V", "(Lorg/json/JSONObject;)V", "seen0", "distanceFromGeofenceRefresh", "Lge/s0;", "serializationConstructorMarker", "(ILjava/lang/String;DDIIIZZZZIDLge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "write$Self$android_sdk_base_release", "(Lcom/braze/models/BrazeGeofence;Lfe/d;Lee/e;)V", "write$Self", "toString", "()Ljava/lang/String;", "forJsonPut", "()Lorg/json/JSONObject;", Request.JsonKeys.OTHER, "compareTo", "(Lcom/braze/models/BrazeGeofence;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getJsonObject$annotations", "()V", "Ljava/lang/String;", "getId", "getId$annotations", "D", "getLatitude", "()D", "getLatitude$annotations", "getLongitude", "getLongitude$annotations", "I", "getRadiusMeter", "getRadiusMeter$annotations", "getCooldownEnterSeconds", "getCooldownEnterSeconds$annotations", "getCooldownExitSeconds", "getCooldownExitSeconds$annotations", "Z", "getAnalyticsEnabledEnter", "()Z", "getAnalyticsEnabledEnter$annotations", "getAnalyticsEnabledExit", "getAnalyticsEnabledExit$annotations", "getEnterEvents", "getEnterEvents$annotations", "getExitEvents", "getExitEvents$annotations", "getNotificationResponsivenessMs", "getNotificationResponsivenessMs$annotations", "getDistanceFromGeofenceRefresh", "setDistanceFromGeofenceRefresh", "(D)V", "getRadiusMeters", "radiusMeters", "Companion", "com/braze/models/d", "com/braze/models/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    public static final d Companion = new d();
    private final boolean analyticsEnabledEnter;
    private final boolean analyticsEnabledExit;
    private final int cooldownEnterSeconds;
    private final int cooldownExitSeconds;
    private double distanceFromGeofenceRefresh;
    private final boolean enterEvents;
    private final boolean exitEvents;
    private final String id;
    private final JSONObject jsonObject;
    private final double latitude;
    private final double longitude;
    private final int notificationResponsivenessMs;
    private final int radiusMeter;

    public /* synthetic */ BrazeGeofence(int i10, String str, double d10, double d11, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, double d12, s0 s0Var) {
        if (2047 != (i10 & 2047)) {
            AbstractC4232e0.a(i10, 2047, c.f28036a.getDescriptor());
        }
        this.jsonObject = new JSONObject();
        this.id = str;
        this.latitude = d10;
        this.longitude = d11;
        this.radiusMeter = i11;
        this.cooldownEnterSeconds = i12;
        this.cooldownExitSeconds = i13;
        this.analyticsEnabledEnter = z10;
        this.analyticsEnabledExit = z11;
        this.enterEvents = z12;
        this.exitEvents = z13;
        this.notificationResponsivenessMs = i14;
        this.distanceFromGeofenceRefresh = (i10 & RecognitionOptions.PDF417) == 0 ? -1.0d : d12;
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(BrazeGeofence self, InterfaceC4048d output, ee.e serialDesc) {
        output.e(serialDesc, 0, self.id);
        output.v(serialDesc, 1, self.latitude);
        output.v(serialDesc, 2, self.longitude);
        output.F(serialDesc, 3, self.radiusMeter);
        output.F(serialDesc, 4, self.cooldownEnterSeconds);
        output.F(serialDesc, 5, self.cooldownExitSeconds);
        output.n(serialDesc, 6, self.analyticsEnabledEnter);
        output.n(serialDesc, 7, self.analyticsEnabledExit);
        output.n(serialDesc, 8, self.enterEvents);
        output.n(serialDesc, 9, self.exitEvents);
        output.F(serialDesc, 10, self.notificationResponsivenessMs);
        if (!output.i(serialDesc, 11) && Double.compare(self.distanceFromGeofenceRefresh, -1.0d) == 0) {
            return;
        }
        output.v(serialDesc, 11, self.distanceFromGeofenceRefresh);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AbstractC4862t.a(BrazeGeofence.class, other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC4862t.c(other, "null cannot be cast to non-null type com.braze.models.BrazeGeofence");
        BrazeGeofence brazeGeofence = (BrazeGeofence) other;
        return AbstractC4862t.a(this.id, brazeGeofence.id) && this.latitude == brazeGeofence.latitude && this.longitude == brazeGeofence.longitude && this.radiusMeter == brazeGeofence.radiusMeter && this.cooldownEnterSeconds == brazeGeofence.cooldownEnterSeconds && this.cooldownExitSeconds == brazeGeofence.cooldownExitSeconds && this.analyticsEnabledEnter == brazeGeofence.analyticsEnabledEnter && this.analyticsEnabledExit == brazeGeofence.analyticsEnabledExit && this.enterEvents == brazeGeofence.enterEvents && this.exitEvents == brazeGeofence.exitEvents && this.notificationResponsivenessMs == brazeGeofence.notificationResponsivenessMs;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final double getRadiusMeters() {
        return this.radiusMeter;
    }

    public int hashCode() {
        return Double.hashCode(getRadiusMeters()) + ((((Boolean.hashCode(this.exitEvents) + ((Boolean.hashCode(this.enterEvents) + ((Boolean.hashCode(this.analyticsEnabledExit) + ((Boolean.hashCode(this.analyticsEnabledEnter) + ((((((((Double.hashCode(this.longitude) + ((Double.hashCode(this.latitude) + ((this.id.hashCode() + (this.jsonObject.hashCode() * 31)) * 31)) * 31)) * 31) + this.radiusMeter) * 31) + this.cooldownEnterSeconds) * 31) + this.cooldownExitSeconds) * 31)) * 31)) * 31)) * 31)) * 31) + this.notificationResponsivenessMs) * 31);
    }

    public final void setDistanceFromGeofenceRefresh(double d10) {
        this.distanceFromGeofenceRefresh = d10;
    }

    public String toString() {
        return v.p("BrazeGeofence{id=" + this.id + ", \n            |latitude, longitude=(" + this.latitude + ", " + this.longitude + "),\n            |radiusMeters=" + this.radiusMeter + ", \n            |cooldownEnterSeconds=" + this.cooldownEnterSeconds + ", \n            |cooldownExitSeconds=" + this.cooldownExitSeconds + ", \n            |analyticsEnabledEnter=" + this.analyticsEnabledEnter + ", \n            |analyticsEnabledExit=" + this.analyticsEnabledExit + ", \n            |enterEvents=" + this.enterEvents + ", \n            |exitEvents=" + this.exitEvents + ", \n            |notificationResponsivenessMs=" + this.notificationResponsivenessMs + ", \n            |distanceFromGeofenceRefresh=" + this.distanceFromGeofenceRefresh + " }\n            |\n        ", null, 1, null);
    }

    @Override // java.lang.Comparable
    public int compareTo(BrazeGeofence other) {
        AbstractC4862t.e(other, "other");
        double d10 = this.distanceFromGeofenceRefresh;
        return (d10 != -1.0d && d10 < other.distanceFromGeofenceRefresh) ? -1 : 1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public BrazeGeofence(JSONObject jsonObject, String id2, double d10, double d11, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, int i13) {
        AbstractC4862t.e(jsonObject, "jsonObject");
        AbstractC4862t.e(id2, "id");
        this.jsonObject = jsonObject;
        this.id = id2;
        this.latitude = d10;
        this.longitude = d11;
        this.radiusMeter = i10;
        this.cooldownEnterSeconds = i11;
        this.cooldownExitSeconds = i12;
        this.analyticsEnabledEnter = z10;
        this.analyticsEnabledExit = z11;
        this.enterEvents = z12;
        this.exitEvents = z13;
        this.notificationResponsivenessMs = i13;
        this.distanceFromGeofenceRefresh = -1.0d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BrazeGeofence(JSONObject jsonObject) throws JSONException {
        AbstractC4862t.e(jsonObject, "jsonObject");
        String string = jsonObject.getString("id");
        AbstractC4862t.d(string, "getString(...)");
        this(jsonObject, string, jsonObject.getDouble("latitude"), jsonObject.getDouble("longitude"), jsonObject.getInt("radius"), jsonObject.getInt("cooldown_enter"), jsonObject.getInt("cooldown_exit"), jsonObject.getBoolean("analytics_enabled_enter"), jsonObject.getBoolean("analytics_enabled_exit"), jsonObject.optBoolean("enter_events", true), jsonObject.optBoolean("exit_events", true), jsonObject.optInt("notification_responsiveness", 30000));
    }
}
