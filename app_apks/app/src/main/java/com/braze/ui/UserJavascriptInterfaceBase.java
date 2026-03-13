package com.braze.ui;

import Od.A;
import Od.B;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.UserJavascriptInterfaceBase;
import fc.C4015H;
import io.sentry.SentryBaseEvent;
import io.sentry.metrics.MetricsUnit;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONObject;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 K2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\nJ'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\nJ\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\nJ\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\nJ\u0019\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b \u0010\nJ\u0019\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\"\u0010\nJ'\u0010'\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010+J\u001f\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007¢\u0006\u0004\b0\u0010+J'\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0007¢\u0006\u0004\b3\u0010\u0015J\u001f\u00106\u001a\u00020\b2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u0010+J\u0017\u00108\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0006H\u0007¢\u0006\u0004\b8\u0010\nJ\u0017\u00109\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0006H\u0007¢\u0006\u0004\b9\u0010\nJ\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b>\u0010?J/\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020@2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\bB\u0010CJ#\u0010E\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010D2\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010J¨\u0006L"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "firstName", "Lfc/H;", "setFirstName", "(Ljava/lang/String;)V", "lastName", "setLastName", "email", "setEmail", "genderString", "setGender", "year", "month", MetricsUnit.Duration.DAY, "setDateOfBirth", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "country", "setCountry", "language", "setLanguage", "homeCity", "setHomeCity", "subscriptionType", "setEmailNotificationSubscriptionType", "setPushNotificationSubscriptionType", "phoneNumber", "setPhoneNumber", "lineId", "setLineId", "key", "jsonStringValue", "", "merge", "setCustomUserAttributeJSON", "(Ljava/lang/String;Ljava/lang/String;Z)V", "jsonArrayString", "setCustomUserAttributeArray", "(Ljava/lang/String;Ljava/lang/String;)V", "value", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "attribute", "incrementCustomUserAttribute", "latitude", "longitude", "setCustomLocationAttribute", MimeTypesReaderMetKeys.ALIAS_TAG, "label", "addAlias", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "Lcom/braze/enums/Month;", "monthFromInt", "(Ljava/lang/String;)Lcom/braze/enums/Month;", "Lcom/braze/enums/NotificationSubscriptionType;", "subscriptionTypeFromJavascriptString", "(Ljava/lang/String;)Lcom/braze/enums/NotificationSubscriptionType;", "Lcom/braze/BrazeUser;", SentryBaseEvent.JsonKeys.USER, "setCustomAttribute", "(Lcom/braze/BrazeUser;Ljava/lang/String;Ljava/lang/String;Z)V", "", "parseStringArrayFromJsonString", "(Ljava/lang/String;)[Ljava/lang/String;", "Lcom/braze/enums/Gender;", "parseGender", "(Ljava/lang/String;)Lcom/braze/enums/Gender;", "Landroid/content/Context;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UserJavascriptInterfaceBase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u0007*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase$Companion;", "", "<init>", "()V", "Lcom/braze/Braze;", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lfc/H;", "block", "runOnUser", "(Lcom/braze/Braze;Lvc/l;)V", "", "JS_BRIDGE_ATTRIBUTE_VALUE", "Ljava/lang/String;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runOnUser(Braze braze, final l lVar) {
            braze.getCurrentUser(new IValueCallback() { // from class: y5.Z
                @Override // com.braze.events.IValueCallback
                public final void onSuccess(Object obj) {
                    UserJavascriptInterfaceBase.Companion.runOnUser$lambda$0(lVar, (BrazeUser) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runOnUser$lambda$0(l lVar, BrazeUser it) {
            AbstractC4862t.e(it, "it");
            lVar.invoke(it);
        }

        private Companion() {
        }
    }

    public UserJavascriptInterfaceBase(Context context) {
        AbstractC4862t.e(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H addAlias$lambda$28(String str, String str2, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.addAlias(str, str2);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H addToCustomAttributeArray$lambda$21(String str, String str2, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.addToCustomAttributeArray(str, str2);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H addToSubscriptionGroup$lambda$29(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.addToSubscriptionGroup(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$23(String str) {
        return "Failed to parse incrementCustomUserAttribute increment value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H incrementCustomUserAttribute$lambda$24(String str, Integer num, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.incrementCustomUserAttribute(str, num.intValue());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseStringArrayFromJsonString$lambda$34() {
        return "Failed to parse custom attribute array";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H removeFromCustomAttributeArray$lambda$22(String str, String str2, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.removeFromCustomAttributeArray(str, str2);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H removeFromSubscriptionGroup$lambda$30(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.removeFromSubscriptionGroup(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setCountry$lambda$9(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setCountry(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$31(String str, String str2) {
        return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$32(String str, String str2) {
        return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$25(String str) {
        return "Failed to parse setCustomLocationAttribute latitude value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$26(String str) {
        return "Failed to parse setCustomLocationAttribute longitude value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setCustomLocationAttribute$lambda$27(String str, Double d10, Double d11, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setLocationCustomAttribute(str, d10.doubleValue(), d11.doubleValue());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeArray$lambda$19(String str) {
        return "Failed to set custom attribute array for key " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setCustomUserAttributeArray$lambda$20(String str, String[] strArr, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setCustomAttributeArray(str, strArr);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setCustomUserAttributeJSON$lambda$18(UserJavascriptInterfaceBase userJavascriptInterfaceBase, String str, String str2, boolean z10, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        userJavascriptInterfaceBase.setCustomAttribute(it, str, str2, z10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$5(String str) {
        return "Failed to parse setDateOfBirth year value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$6(String str) {
        return "Failed to parse setDateOfBirth month for value " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$7(String str) {
        return "Failed to parse setDateOfBirth day value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setDateOfBirth$lambda$8(Integer num, Month month, Integer num2, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setDateOfBirth(num.intValue(), month, num2.intValue());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setEmail$lambda$2(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setEmail(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$12(String str) {
        return "Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setEmailNotificationSubscriptionType$lambda$13(NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setFirstName$lambda$0(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setFirstName(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$3(String str) {
        return "Failed to parse gender in Braze HTML in-app message javascript interface with gender: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setGender$lambda$4(Gender gender, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setGender(gender);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setHomeCity$lambda$11(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setHomeCity(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setLanguage$lambda$10(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setLanguage(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setLastName$lambda$1(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setLastName(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setLineId$lambda$17(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setLineId(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setPhoneNumber$lambda$16(String str, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setPhoneNumber(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$14(String str) {
        return "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H setPushNotificationSubscriptionType$lambda$15(NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        it.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return C4015H.f34254a;
    }

    @JavascriptInterface
    public final void addAlias(final String alias, final String label) {
        AbstractC4862t.e(alias, "alias");
        AbstractC4862t.e(label, "label");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.U
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.addAlias$lambda$28(alias, label, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(final String key, final String value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.x
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.addToCustomAttributeArray$lambda$21(key, value, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(final String subscriptionGroupId) {
        AbstractC4862t.e(subscriptionGroupId, "subscriptionGroupId");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.G
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.addToSubscriptionGroup$lambda$29(subscriptionGroupId, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(final String attribute, final String value) {
        AbstractC4862t.e(attribute, "attribute");
        AbstractC4862t.e(value, "value");
        final Integer numU = B.u(value);
        if (numU == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.y
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$23(value);
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.z
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$24(attribute, numU, (BrazeUser) obj);
                }
            });
        }
    }

    public final Month monthFromInt(String month) {
        int iIntValue;
        AbstractC4862t.e(month, "month");
        Integer numU = B.u(month);
        if (numU == null || (iIntValue = numU.intValue()) < 1 || iIntValue > 12) {
            return null;
        }
        return Month.INSTANCE.getMonth(iIntValue - 1);
    }

    public final Gender parseGender(String genderString) {
        AbstractC4862t.e(genderString, "genderString");
        Locale US = Locale.US;
        AbstractC4862t.d(US, "US");
        String lowerCase = genderString.toLowerCase(US);
        AbstractC4862t.d(lowerCase, "toLowerCase(...)");
        Gender gender = Gender.MALE;
        if (AbstractC4862t.a(lowerCase, gender.getKey())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (AbstractC4862t.a(lowerCase, gender2.getKey())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (AbstractC4862t.a(lowerCase, gender3.getKey())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (AbstractC4862t.a(lowerCase, gender4.getKey())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (AbstractC4862t.a(lowerCase, gender5.getKey())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (AbstractC4862t.a(lowerCase, gender6.getKey())) {
            return gender6;
        }
        return null;
    }

    public final String[] parseStringArrayFromJsonString(String jsonArrayString) {
        try {
            JSONArray jSONArray = new JSONArray(jsonArrayString);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: y5.O
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.parseStringArrayFromJsonString$lambda$34();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(final String key, final String value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.t
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.removeFromCustomAttributeArray$lambda$22(key, value, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(final String subscriptionGroupId) {
        AbstractC4862t.e(subscriptionGroupId, "subscriptionGroupId");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.I
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.removeFromSubscriptionGroup$lambda$30(subscriptionGroupId, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void setCountry(final String country) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.J
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.setCountry$lambda$9(country, (BrazeUser) obj);
            }
        });
    }

    public final void setCustomAttribute(BrazeUser user, final String key, final String jsonStringValue, boolean merge) {
        AbstractC4862t.e(user, "user");
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(jsonStringValue, "jsonStringValue");
        try {
            Object obj = new JSONObject(jsonStringValue).get("value");
            if (obj instanceof String) {
                user.setCustomUserAttribute(key, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                user.setCustomUserAttribute(key, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Integer) {
                user.setCustomUserAttribute(key, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Double) {
                user.setCustomUserAttribute(key, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                user.setCustomUserAttribute(key, (JSONObject) obj, merge);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.P
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return UserJavascriptInterfaceBase.setCustomAttribute$lambda$31(key, jsonStringValue);
                    }
                }, 6, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: y5.Q
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setCustomAttribute$lambda$32(key, jsonStringValue);
                }
            }, 4, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(final String attribute, final String latitude, final String longitude) {
        AbstractC4862t.e(attribute, "attribute");
        AbstractC4862t.e(latitude, "latitude");
        AbstractC4862t.e(longitude, "longitude");
        final Double dS = A.s(latitude);
        if (dS == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.u
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$25(latitude);
                }
            }, 6, (Object) null);
            return;
        }
        final Double dS2 = A.s(longitude);
        if (dS2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.v
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$26(longitude);
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.w
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$27(attribute, dS, dS2, (BrazeUser) obj);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(final String key, String jsonArrayString) {
        AbstractC4862t.e(key, "key");
        final String[] stringArrayFromJsonString = parseStringArrayFromJsonString(jsonArrayString);
        if (stringArrayFromJsonString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.E
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$19(key);
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.F
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$20(key, stringArrayFromJsonString, (BrazeUser) obj);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(final String key, final String jsonStringValue, final boolean merge) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(jsonStringValue, "jsonStringValue");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.H
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.setCustomUserAttributeJSON$lambda$18(this.f48428a, key, jsonStringValue, merge, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void setDateOfBirth(final String year, final String month, final String day) {
        AbstractC4862t.e(year, "year");
        AbstractC4862t.e(month, "month");
        AbstractC4862t.e(day, "day");
        final Integer numU = B.u(year);
        if (numU == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.X
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setDateOfBirth$lambda$5(year);
                }
            }, 6, (Object) null);
            return;
        }
        final Month monthMonthFromInt = monthFromInt(month);
        if (monthMonthFromInt == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.Y
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setDateOfBirth$lambda$6(month);
                }
            }, 6, (Object) null);
            return;
        }
        final Integer numU2 = B.u(day);
        if (numU2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.r
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setDateOfBirth$lambda$7(day);
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.s
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return UserJavascriptInterfaceBase.setDateOfBirth$lambda$8(numU, monthMonthFromInt, numU2, (BrazeUser) obj);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setEmail(final String email) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.T
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.setEmail$lambda$2(email, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(final String subscriptionType) {
        AbstractC4862t.e(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.q
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$12(subscriptionType);
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.B
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$13(notificationSubscriptionTypeSubscriptionTypeFromJavascriptString, (BrazeUser) obj);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setFirstName(final String firstName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.K
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.setFirstName$lambda$0(firstName, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void setGender(final String genderString) {
        AbstractC4862t.e(genderString, "genderString");
        final Gender gender = parseGender(genderString);
        if (gender == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.A
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setGender$lambda$3(genderString);
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.C
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return UserJavascriptInterfaceBase.setGender$lambda$4(gender, (BrazeUser) obj);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setHomeCity(final String homeCity) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.L
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.setHomeCity$lambda$11(homeCity, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void setLanguage(final String language) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.D
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.setLanguage$lambda$10(language, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void setLastName(final String lastName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.W
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.setLastName$lambda$1(lastName, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void setLineId(final String lineId) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.V
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.setLineId$lambda$17(lineId, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void setPhoneNumber(final String phoneNumber) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.N
            @Override // vc.l
            public final Object invoke(Object obj) {
                return UserJavascriptInterfaceBase.setPhoneNumber$lambda$16(phoneNumber, (BrazeUser) obj);
            }
        });
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(final String subscriptionType) {
        AbstractC4862t.e(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: y5.M
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$14(subscriptionType);
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new l() { // from class: y5.S
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$15(notificationSubscriptionTypeSubscriptionTypeFromJavascriptString, (BrazeUser) obj);
                }
            });
        }
    }

    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(String subscriptionType) {
        return NotificationSubscriptionType.INSTANCE.fromValue(subscriptionType);
    }
}
