package com.braze.managers;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static final String b() {
        return "Error getting required SDK debugging fields in SdkDebugManager. Disabling SDK debugging.";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: JSONException -> 0x001f, TryCatch #0 {JSONException -> 0x001f, blocks: (B:4:0x0014, B:11:0x0025, B:13:0x002d, B:14:0x0033, B:16:0x0039, B:17:0x0043, B:19:0x0069, B:24:0x0085, B:26:0x0089, B:28:0x0095, B:23:0x0073), top: B:35:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: JSONException -> 0x001f, TryCatch #0 {JSONException -> 0x001f, blocks: (B:4:0x0014, B:11:0x0025, B:13:0x002d, B:14:0x0033, B:16:0x0039, B:17:0x0043, B:19:0x0069, B:24:0x0085, B:26:0x0089, B:28:0x0095, B:23:0x0073), top: B:35:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[Catch: JSONException -> 0x001f, TryCatch #0 {JSONException -> 0x001f, blocks: (B:4:0x0014, B:11:0x0025, B:13:0x002d, B:14:0x0033, B:16:0x0039, B:17:0x0043, B:19:0x0069, B:24:0x0085, B:26:0x0089, B:28:0x0095, B:23:0x0073), top: B:35:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[Catch: JSONException -> 0x001f, TryCatch #0 {JSONException -> 0x001f, blocks: (B:4:0x0014, B:11:0x0025, B:13:0x002d, B:14:0x0033, B:16:0x0039, B:17:0x0043, B:19:0x0069, B:24:0x0085, B:26:0x0089, B:28:0x0095, B:23:0x0073), top: B:35:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.braze.managers.d1 a(final org.json.JSONObject r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.c1.a(org.json.JSONObject, boolean):com.braze.managers.d1");
    }

    public static final String a(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public static final String a() {
        return "SDK Debugger expiration time is in the past. Disabling SDK debugging.";
    }
}
