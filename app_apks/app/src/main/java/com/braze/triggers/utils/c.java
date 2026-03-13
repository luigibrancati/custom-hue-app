package com.braze.triggers.utils;

import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.s;
import com.braze.triggers.actions.f;
import com.braze.triggers.actions.h;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f28761a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28762b = BrazeLogger.getBrazeLogTag((Class<?>) c.class);

    public static InAppMessageBase a(final JSONObject jSONObject, r brazeManager) {
        AbstractC4862t.e(brazeManager, "brazeManager");
        try {
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28762b, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: x5.f
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.utils.c.a();
                    }
                }, 14, (Object) null);
                return null;
            }
            final String string = jSONObject.getString("type");
            if (!AbstractC4862t.a(string, "inapp")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28762b, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: x5.g
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.utils.c.a(string);
                    }
                }, 12, (Object) null);
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                return null;
            }
            return s.a(jSONObject2, brazeManager);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28762b, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: x5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.utils.c.a(jSONObject);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String b(JSONArray jSONArray) {
        return "Failed to deserialize triggered actions Json array: " + jSONArray;
    }

    public static final String c() {
        return "Triggered actions Json array was null. Not de-serializing triggered actions.";
    }

    public static final String c(String str) {
        return "Received unknown trigger type: " + str;
    }

    public final h b(final JSONObject actionJson, r brazeManager) {
        AbstractC4862t.e(actionJson, "actionJson");
        AbstractC4862t.e(brazeManager, "brazeManager");
        try {
            final String string = actionJson.getString("type");
            if (AbstractC4862t.a(string, "inapp")) {
                return new com.braze.triggers.actions.c(actionJson, brazeManager);
            }
            if (AbstractC4862t.a(string, "templated_iam")) {
                return new f(actionJson, brazeManager);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: x5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.utils.c.c(string);
                }
            }, 6, (Object) null);
            return null;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28762b, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: x5.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.utils.c.b(actionJson);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String a() {
        return "Templated message Json was null. Not de-serializing templated message.";
    }

    public static final String a(String str) {
        return "Received templated message Json with unknown type: " + str + ". Not parsing.";
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize triggered action Json: " + jSONObject;
    }

    public static final String a(JSONObject jSONObject) {
        return "Encountered exception processing templated message: " + jSONObject;
    }

    public static final String b() {
        return "Received null or blank trigger condition Json. Not parsing.";
    }

    public static final String b(String str) {
        return "Received triggered condition Json with unknown type: " + str + ". Not parsing.";
    }

    public final ArrayList a(final JSONArray jSONArray, r brazeManager) {
        AbstractC4862t.e(brazeManager, "brazeManager");
        try {
            if (jSONArray == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28762b, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: x5.i
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.utils.c.c();
                    }
                }, 14, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                AbstractC4862t.b(jSONObject);
                h hVarB = b(jSONObject, brazeManager);
                if (hVarB != null) {
                    arrayList.add(hVarB);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28762b, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: x5.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.utils.c.b(jSONArray);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList a(org.json.JSONArray r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.triggers.utils.c.a(org.json.JSONArray):java.util.ArrayList");
    }
}
