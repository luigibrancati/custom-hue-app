package com.braze.models.dust;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f28046a = new e();

    public static final String b(JSONObject jSONObject) {
        return "Failed to parse json. Returning unknown.\n" + jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.braze.models.dust.g a(final org.json.JSONObject r14) throws org.json.JSONException {
        /*
            r13 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.AbstractC4862t.e(r14, r0)
            java.lang.String r1 = "type"
            java.lang.String r1 = r14.getString(r1)
            com.braze.models.dust.f r2 = com.braze.models.dust.f.f28047a
            java.lang.String r2 = "ccr"
            boolean r2 = kotlin.jvm.internal.AbstractC4862t.a(r1, r2)
            if (r2 == 0) goto L1b
            com.braze.models.dust.a r13 = new com.braze.models.dust.a
            r13.<init>()
            return r13
        L1b:
            java.lang.String r2 = "ttl"
            boolean r2 = kotlin.jvm.internal.AbstractC4862t.a(r1, r2)
            java.lang.String r3 = "body"
            r4 = 0
            if (r2 == 0) goto L5a
            kotlin.jvm.internal.AbstractC4862t.e(r14, r0)
            org.json.JSONObject r13 = r14.optJSONObject(r3)
            if (r13 == 0) goto L42
            java.lang.String r14 = "t_ms"
            r0 = -1
            long r0 = r13.optLong(r14, r0)
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L42
            goto L43
        L42:
            r14 = r4
        L43:
            if (r13 == 0) goto L54
            java.lang.String r0 = "rcs"
            java.lang.String r13 = r13.optString(r0)
            if (r13 == 0) goto L54
            int r0 = r13.length()
            if (r0 <= 0) goto L54
            r4 = r13
        L54:
            com.braze.models.dust.c r13 = new com.braze.models.dust.c
            r13.<init>(r14, r4)
            return r13
        L5a:
            java.lang.String r2 = "ddr"
            boolean r1 = kotlin.jvm.internal.AbstractC4862t.a(r1, r2)
            if (r1 == 0) goto L8a
            kotlin.jvm.internal.AbstractC4862t.e(r14, r0)
            org.json.JSONObject r13 = r14.optJSONObject(r3)
            r0 = 500(0x1f4, double:2.47E-321)
            if (r13 == 0) goto L73
            java.lang.String r14 = "r_ms"
            long r0 = r13.optLong(r14, r0)
        L73:
            if (r13 == 0) goto L84
            java.lang.String r14 = "e"
            java.lang.String r13 = r13.optString(r14)
            if (r13 == 0) goto L84
            int r14 = r13.length()
            if (r14 <= 0) goto L84
            r4 = r13
        L84:
            com.braze.models.dust.b r13 = new com.braze.models.dust.b
            r13.<init>(r0, r4)
            return r13
        L8a:
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            f5.a r10 = new f5.a
            r10.<init>()
            r11 = 7
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            com.braze.models.dust.d r13 = new com.braze.models.dust.d
            r13.<init>()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.dust.e.a(org.json.JSONObject):com.braze.models.dust.g");
    }
}
