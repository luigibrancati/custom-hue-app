package com.braze.support;

import Od.F;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28649a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    public static final InAppMessageBase a(final JSONObject inAppMessageJson, com.braze.managers.r brazeManager) {
        InAppMessageBase inAppMessageFull;
        String upperCase;
        AbstractC4862t.e(inAppMessageJson, "inAppMessageJson");
        AbstractC4862t.e(brazeManager, "brazeManager");
        try {
            AbstractC4862t.e(inAppMessageJson, "inAppMessageJson");
            if (inAppMessageJson.optBoolean("is_control", false)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28649a, BrazeLogger.Priority.f28624D, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.j1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.support.s.a();
                    }
                }, 12, (Object) null);
                return new InAppMessageControl(inAppMessageJson, brazeManager);
            }
            try {
                String string = inAppMessageJson.getString("type");
                AbstractC4862t.d(string, "getString(...)");
                Locale US = Locale.US;
                AbstractC4862t.d(US, "US");
                upperCase = string.toUpperCase(US);
                AbstractC4862t.d(upperCase, "toUpperCase(...)");
            } catch (Exception unused) {
                messageType = null;
            }
            for (MessageType messageType : MessageType.values()) {
                if (AbstractC4862t.a(messageType.name(), upperCase)) {
                    if (messageType == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28649a, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.k1
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return com.braze.support.s.a(inAppMessageJson);
                            }
                        }, 12, (Object) null);
                        return null;
                    }
                    int i10 = r.f28648a[messageType.ordinal()];
                    if (i10 == 1) {
                        inAppMessageFull = new InAppMessageFull(inAppMessageJson, brazeManager);
                    } else if (i10 == 2) {
                        inAppMessageFull = new InAppMessageModal(inAppMessageJson, brazeManager);
                    } else if (i10 == 3) {
                        inAppMessageFull = new InAppMessageSlideup(inAppMessageJson, brazeManager);
                    } else if (i10 == 4) {
                        inAppMessageFull = new InAppMessageHtmlFull(inAppMessageJson, brazeManager);
                    } else {
                        if (i10 != 5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28649a, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.l1
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return com.braze.support.s.b(inAppMessageJson);
                                }
                            }, 12, (Object) null);
                            return null;
                        }
                        inAppMessageFull = new InAppMessageHtml(inAppMessageJson, brazeManager);
                    }
                    return inAppMessageFull;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28649a, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.m1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.s.c(inAppMessageJson);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String b() {
        return "In-app message string was blank.";
    }

    public static final String c(JSONObject jSONObject) {
        return "Failed to deserialize the in-app message: " + JsonUtils.getPrettyPrintedString(jSONObject) + ". Returning null.";
    }

    public static final String b(JSONObject jSONObject) {
        return "Unknown in-app message type. Returning null: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public static final InAppMessageBase a(final String inAppMessageJsonString, com.braze.managers.r brazeManager) {
        AbstractC4862t.e(inAppMessageJsonString, "inAppMessageJsonString");
        AbstractC4862t.e(brazeManager, "brazeManager");
        if (F.k0(inAppMessageJsonString)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28649a, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.h1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.s.b();
                }
            }, 12, (Object) null);
            return null;
        }
        try {
            return a(new JSONObject(inAppMessageJsonString), brazeManager);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f28649a, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.i1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.s.a(inAppMessageJsonString);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String a(String str) {
        return "Failed to deserialize the in-app message string: " + str;
    }

    public static final String a() {
        return "Deserializing control in-app message.";
    }

    public static final String a(JSONObject jSONObject) {
        return "In-app message type was unknown for in-app message: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }
}
