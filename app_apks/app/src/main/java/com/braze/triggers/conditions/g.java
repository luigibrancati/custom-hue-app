package com.braze.triggers.conditions;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28680e = BrazeLogger.getBrazeLogTag((Class<?>) g.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.enums.a f28681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f28684d;

    public g(JSONObject jSONObject) throws JSONException {
        com.braze.triggers.enums.a aVar = (com.braze.triggers.enums.a) JsonUtils.optEnum(jSONObject, "property_type", com.braze.triggers.enums.a.class, com.braze.triggers.enums.a.UNKNOWN);
        String string = jSONObject.getString("property_key");
        int i10 = jSONObject.getInt("comparator");
        this.f28681a = aVar;
        this.f28682b = string;
        this.f28683c = i10;
        if (jSONObject.has("property_value")) {
            if (aVar.equals(com.braze.triggers.enums.a.STRING)) {
                this.f28684d = jSONObject.getString("property_value");
                return;
            }
            if (aVar.equals(com.braze.triggers.enums.a.BOOLEAN)) {
                this.f28684d = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (aVar.equals(com.braze.triggers.enums.a.NUMBER)) {
                this.f28684d = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (aVar.equals(com.braze.triggers.enums.a.DATE)) {
                this.f28684d = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        Object objOpt;
        if (!(bVar instanceof com.braze.triggers.events.c)) {
            return false;
        }
        BrazeProperties brazeProperties = ((com.braze.triggers.events.j) ((com.braze.triggers.events.c) bVar)).f28721e;
        Date date = null;
        if (brazeProperties != null) {
            try {
                objOpt = brazeProperties.getJsonObject().opt(this.f28682b);
            } catch (Exception e10) {
                BrazeLogger.e(f28680e, "Caught exception checking property filter condition.", e10);
                return false;
            }
        } else {
            objOpt = null;
        }
        if (objOpt == null) {
            int i10 = this.f28683c;
            return i10 == 12 || i10 == 17 || i10 == 2;
        }
        int i11 = this.f28683c;
        if (i11 == 11) {
            return true;
        }
        if (i11 == 12) {
            return false;
        }
        int iOrdinal = this.f28681a.ordinal();
        if (iOrdinal == 0) {
            return a(objOpt);
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return false;
                }
                if (objOpt instanceof Boolean) {
                    int i12 = this.f28683c;
                    if (i12 == 1) {
                        return objOpt.equals(this.f28684d);
                    }
                    if (i12 == 2) {
                        return !objOpt.equals(this.f28684d);
                    }
                } else if (this.f28683c == 2) {
                    return true;
                }
                return false;
            }
            if (!(objOpt instanceof Integer) && !(objOpt instanceof Double)) {
                if (this.f28683c == 2) {
                }
            }
            double dDoubleValue = ((Number) objOpt).doubleValue();
            double dDoubleValue2 = ((Number) this.f28684d).doubleValue();
            int i13 = this.f28683c;
            if (i13 == 1) {
                return dDoubleValue == dDoubleValue2;
            }
            if (i13 == 2) {
                if (dDoubleValue != dDoubleValue2) {
                }
            }
            if (i13 == 3) {
                if (dDoubleValue > dDoubleValue2) {
                }
            }
            if (i13 == 5 && dDoubleValue < dDoubleValue2) {
            }
        }
        long j10 = ((com.braze.triggers.events.i) bVar).f28718a;
        if (objOpt instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) objOpt, BrazeDateFormat.LONG);
            } catch (Exception e11) {
                BrazeLogger.e(f28680e, "Caught exception trying to parse date in compareTimestamps", e11);
            }
        }
        if (date != null) {
            long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
            long jLongValue = ((Number) this.f28684d).longValue();
            int i14 = this.f28683c;
            if (i14 != 15) {
                if (i14 != 16) {
                    switch (i14) {
                        case 1:
                            if (timeFromEpochInSeconds != jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 2:
                            if (timeFromEpochInSeconds == jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 3:
                            if (timeFromEpochInSeconds <= jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 4:
                            if (timeFromEpochInSeconds < j10 - jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 5:
                            if (timeFromEpochInSeconds >= jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 6:
                            if (timeFromEpochInSeconds > j10 - jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        default:
                            return false;
                    }
                } else if (timeFromEpochInSeconds <= j10 + jLongValue) {
                    return false;
                }
            } else if (timeFromEpochInSeconds >= j10 + jLongValue) {
                return false;
            }
        } else if (this.f28683c != 2) {
            return false;
        }
        return true;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f28681a.equals(com.braze.triggers.enums.a.UNKNOWN)) {
                jSONObject.put("property_type", this.f28681a.toString());
            }
            jSONObject.put("property_key", this.f28682b);
            jSONObject.put("comparator", this.f28683c);
            jSONObject.put("property_value", this.f28684d);
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.e(f28680e, "Caught exception creating property filter Json.", e10);
            return jSONObject;
        }
    }

    public final boolean a(Object obj) {
        if (!(obj instanceof String)) {
            int i10 = this.f28683c;
            return i10 == 2 || i10 == 17;
        }
        int i11 = this.f28683c;
        if (i11 == 1) {
            return obj.equals(this.f28684d);
        }
        if (i11 == 2) {
            return !obj.equals(this.f28684d);
        }
        if (i11 == 10) {
            return Pattern.compile((String) this.f28684d, 2).matcher((String) obj).find();
        }
        if (i11 != 17) {
            return false;
        }
        return !Pattern.compile((String) this.f28684d, 2).matcher((String) obj).find();
    }
}
