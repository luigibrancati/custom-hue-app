package com.braze.models.outgoing;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.IPutIntoJson;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import fc.C4015H;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0006J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/braze/models/outgoing/BrazeProperties;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "<init>", "()V", "jsonObject", "(Lorg/json/JSONObject;)V", "", "doKeyValidation", "clean", "(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;", "", "key", "", "value", "addProperty", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/braze/models/outgoing/BrazeProperties;", "clone", "()Lcom/braze/models/outgoing/BrazeProperties;", "forJsonPut", "()Lorg/json/JSONObject;", "propertiesJSONObject", "Lorg/json/JSONObject;", "", "getSize", "()I", RRWebVideoEvent.JsonKeys.SIZE, "isInvalid", "()Z", "", "getByteSize", "()J", "byteSize", "Companion", "com/braze/models/outgoing/d", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeProperties implements IPutIntoJson<JSONObject> {
    public static final d Companion = new d();
    private JSONObject propertiesJSONObject;

    public BrazeProperties() {
        this.propertiesJSONObject = new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addProperty$lambda$0(String str) {
        return "Value type is not supported. Cannot add property " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addProperty$lambda$1() {
        return "Caught json exception trying to add property.";
    }

    private final JSONObject clean(JSONObject jsonObject, boolean doKeyValidation) throws JSONException {
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            AbstractC4862t.d(next, "next(...)");
            arrayList.add(next);
        }
        for (String str : arrayList) {
            if (!doKeyValidation || Companion.a(str)) {
                Object obj = jsonObject.get(str);
                if (obj instanceof Date) {
                    jsonObject.put(str, DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
                }
                if (obj instanceof JSONArray) {
                    jsonObject.put(str, e.a((JSONArray) obj));
                }
                if (obj instanceof JSONObject) {
                    jsonObject.put(str, clean((JSONObject) obj, false));
                }
            } else {
                jsonObject.remove(str);
            }
        }
        return jsonObject;
    }

    public static /* synthetic */ JSONObject clean$default(BrazeProperties brazeProperties, JSONObject jSONObject, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return brazeProperties.clean(jSONObject, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clone$lambda$2() {
        return "Failed to clone BrazeProperties";
    }

    public final BrazeProperties addProperty(final String key, Object value) {
        AbstractC4862t.e(key, "key");
        if (!Companion.a(key)) {
            return this;
        }
        try {
            if (value instanceof Long) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) value).longValue());
                return this;
            }
            if (value instanceof Integer) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) value).intValue());
                return this;
            }
            if (value instanceof Double) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) value).doubleValue());
                return this;
            }
            if (value instanceof Boolean) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Boolean) value).booleanValue());
                return this;
            }
            if (value instanceof Date) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), DateTimeUtils.formatDate$default((Date) value, BrazeDateFormat.LONG, null, 2, null));
                return this;
            }
            if (value instanceof String) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength((String) value));
                return this;
            }
            if (value instanceof JSONArray) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), e.a((JSONArray) value));
                return this;
            }
            if (value instanceof JSONObject) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), clean$default(this, (JSONObject) value, false, 2, null));
                return this;
            }
            if (value instanceof Map) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), clean$default(this, new JSONObject(e.a((Map) value)), false, 2, null));
                return this;
            }
            if (value == null) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), JSONObject.NULL);
                return this;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: h5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeProperties.addProperty$lambda$0(key);
                }
            }, 6, (Object) null);
            C4015H c4015h = C4015H.f34254a;
            return this;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: h5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeProperties.addProperty$lambda$1();
                }
            }, 4, (Object) null);
            return this;
        }
    }

    public final BrazeProperties clone() {
        try {
            return new BrazeProperties(new JSONObject(getPropertiesJSONObject().toString()));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: h5.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeProperties.clone$lambda$2();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final long getByteSize() {
        String string = this.propertiesJSONObject.toString();
        AbstractC4862t.d(string, "toString(...)");
        return StringUtils.getByteSize(string);
    }

    public final int getSize() {
        return this.propertiesJSONObject.length();
    }

    public final boolean isInvalid() {
        return getByteSize() > 51200;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getPropertiesJSONObject() {
        return this.propertiesJSONObject;
    }

    public BrazeProperties(JSONObject jsonObject) {
        AbstractC4862t.e(jsonObject, "jsonObject");
        this.propertiesJSONObject = new JSONObject();
        this.propertiesJSONObject = clean$default(this, jsonObject, false, 2, null);
    }
}
