package com.braze.models;

import Od.F;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import fc.C4029l;
import fc.InterfaceC4028k;
import fe.InterfaceC4048d;
import ge.AbstractC4232e0;
import ge.s0;
import ge.w0;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 62\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u000278B-\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\rBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u0010(\u0012\u0004\b0\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010(\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\"R\u001b\u0010\f\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001d¨\u00069"}, d2 = {"Lcom/braze/models/FeatureFlag;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "", "id", "", "enabled", "propertiesJson", "trackingString", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "properties", "(Ljava/lang/String;ZLorg/json/JSONObject;Ljava/lang/String;)V", "", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "write$Self$android_sdk_base_release", "(Lcom/braze/models/FeatureFlag;Lfe/d;Lee/e;)V", "write$Self", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/FeatureFlag;", "deepcopy", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Z", "getEnabled", "()Z", "getEnabled$annotations", "getPropertiesJson$annotations", "getTrackingString$android_sdk_base_release", "getTrackingString$android_sdk_base_release$annotations", "properties$delegate", "Lfc/k;", "getProperties", "Companion", "com/braze/models/j", "com/braze/models/i", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeatureFlag implements IPutIntoJson<JSONObject> {
    public static final j Companion = new j();
    private final boolean enabled;
    private final String id;

    /* JADX INFO: renamed from: properties$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k properties;
    private final String propertiesJson;
    private final String trackingString;

    public /* synthetic */ FeatureFlag(int i10, String str, boolean z10, String str2, String str3, s0 s0Var) {
        if (7 != (i10 & 7)) {
            AbstractC4232e0.a(i10, 7, i.f28056a.getDescriptor());
        }
        this.id = str;
        this.enabled = z10;
        this.propertiesJson = str2;
        if ((i10 & 8) == 0) {
            this.trackingString = null;
        } else {
            this.trackingString = str3;
        }
        this.properties = C4029l.b(new InterfaceC6082a() { // from class: d5.d
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return FeatureFlag._init_$lambda$4(this.f33129a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject _init_$lambda$4(final FeatureFlag featureFlag) {
        try {
            return F.k0(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: d5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return FeatureFlag._init_$lambda$4$lambda$3(this.f33131a);
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$4$lambda$3(FeatureFlag featureFlag) {
        return "Failed to parse properties JSON: " + featureFlag.propertiesJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$2() {
        return "Caught exception creating FeatureFlag Json.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject properties_delegate$lambda$1(final FeatureFlag featureFlag) {
        try {
            return F.k0(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: d5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return FeatureFlag.properties_delegate$lambda$1$lambda$0(this.f33130a);
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String properties_delegate$lambda$1$lambda$0(FeatureFlag featureFlag) {
        return "Failed to parse properties JSON: " + featureFlag.propertiesJson;
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(FeatureFlag self, InterfaceC4048d output, ee.e serialDesc) {
        output.e(serialDesc, 0, self.id);
        output.n(serialDesc, 1, self.enabled);
        output.e(serialDesc, 2, self.propertiesJson);
        if (!output.i(serialDesc, 3) && self.trackingString == null) {
            return;
        }
        output.l(serialDesc, 3, w0.f35762a, self.trackingString);
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(getProperties()), this.trackingString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlag)) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) other;
        return AbstractC4862t.a(this.id, featureFlag.id) && this.enabled == featureFlag.enabled && AbstractC4862t.a(this.propertiesJson, featureFlag.propertiesJson) && AbstractC4862t.a(this.trackingString, featureFlag.trackingString);
    }

    public final String getId() {
        return this.id;
    }

    public JSONObject getProperties() {
        return (JSONObject) this.properties.getValue();
    }

    /* JADX INFO: renamed from: getTrackingString$android_sdk_base_release, reason: from getter */
    public final String getTrackingString() {
        return this.trackingString;
    }

    public int hashCode() {
        int iHashCode = (this.propertiesJson.hashCode() + ((Boolean.hashCode(this.enabled) + (this.id.hashCode() * 31)) * 31)) * 31;
        String str = this.trackingString;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FeatureFlag(id=" + this.id + ", enabled=" + this.enabled + ", propertiesJson=" + this.propertiesJson + ", trackingString=" + this.trackingString + ")";
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("enabled", this.enabled);
            jSONObject.put("properties", getProperties());
            jSONObject.put("fts", this.trackingString);
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: d5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return FeatureFlag.forJsonPut$lambda$2();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }

    public FeatureFlag(String id2, boolean z10, String propertiesJson, String str) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(propertiesJson, "propertiesJson");
        this.id = id2;
        this.enabled = z10;
        this.propertiesJson = propertiesJson;
        this.trackingString = str;
        this.properties = C4029l.b(new InterfaceC6082a() { // from class: d5.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return FeatureFlag.properties_delegate$lambda$1(this.f33128a);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureFlag(String id2, boolean z10, JSONObject properties, String str) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(properties, "properties");
        String string = properties.toString();
        AbstractC4862t.d(string, "toString(...)");
        this(id2, z10, string, str);
    }
}
