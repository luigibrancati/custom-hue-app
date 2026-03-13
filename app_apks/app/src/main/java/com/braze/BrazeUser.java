package com.braze;

import Od.F;
import Rd.AbstractC2132i;
import com.braze.BrazeUser;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.managers.p0;
import com.braze.managers.r;
import com.braze.models.k;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.storage.b3;
import com.braze.storage.n3;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import io.sentry.metrics.MetricsUnit;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010\u0015J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020+¢\u0006\u0004\b0\u0010.J\u0015\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u0010\u0015J\u0015\u00103\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u0015J\u0017\u00105\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u0010\u0015J\u0017\u00107\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b7\u0010\u0015J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001e¢\u0006\u0004\b:\u0010<J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u0012J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020=¢\u0006\u0004\b:\u0010>J)\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020\u0010H\u0007¢\u0006\u0004\b:\u0010AJ\u001d\u0010B\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bB\u0010\u0012J\u001d\u0010C\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bC\u0010\u0012J%\u0010F\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u000e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060D¢\u0006\u0004\bF\u0010GJ\u001d\u0010J\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ!\u0010M\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\b\b\u0002\u0010L\u001a\u00020\u001eH\u0007¢\u0006\u0004\bM\u0010<J\u0015\u0010N\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\bN\u0010\u0015J\u0017\u0010Q\u001a\u00020\u00102\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bQ\u0010RJC\u0010Y\u001a\u00020X2\u0006\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u00020=2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010=H\u0007¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020X2\u0006\u00108\u001a\u00020\u00062\u0006\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u00020=¢\u0006\u0004\b[\u0010\\J)\u0010]\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u0010H\u0007¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u0010I\u001a\u00020H¢\u0006\u0004\b_\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010`R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010aR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010h\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006m"}, d2 = {"Lcom/braze/BrazeUser;", "", "Lcom/braze/storage/n3;", "userCache", "Lcom/braze/managers/m0;", "brazeManager", "", "internalUserId", "Lcom/braze/managers/p0;", "locationManager", "Lcom/braze/storage/b3;", "serverConfigStorageProvider", "<init>", "(Lcom/braze/storage/n3;Lcom/braze/managers/m0;Ljava/lang/String;Lcom/braze/managers/p0;Lcom/braze/storage/b3;)V", MimeTypesReaderMetKeys.ALIAS_TAG, "label", "", "addAlias", "(Ljava/lang/String;Ljava/lang/String;)Z", "firstName", "setFirstName", "(Ljava/lang/String;)Z", "lastName", "setLastName", "email", "setEmail", "Lcom/braze/enums/Gender;", "gender", "setGender", "(Lcom/braze/enums/Gender;)Z", "", "year", "Lcom/braze/enums/Month;", "month", MetricsUnit.Duration.DAY, "setDateOfBirth", "(ILcom/braze/enums/Month;I)Z", "country", "setCountry", "homeCity", "setHomeCity", "language", "setLanguage", "Lcom/braze/enums/NotificationSubscriptionType;", "emailNotificationSubscriptionType", "setEmailNotificationSubscriptionType", "(Lcom/braze/enums/NotificationSubscriptionType;)Z", "pushNotificationSubscriptionType", "setPushNotificationSubscriptionType", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "phoneNumber", "setPhoneNumber", "lineId", "setLineId", "key", "value", "setCustomUserAttribute", "(Ljava/lang/String;Z)Z", "(Ljava/lang/String;I)Z", "", "(Ljava/lang/String;D)Z", "Lorg/json/JSONObject;", "merge", "(Ljava/lang/String;Lorg/json/JSONObject;Z)Z", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "", "values", "setCustomAttributeArray", "(Ljava/lang/String;[Ljava/lang/String;)Z", "", "secondsFromEpoch", "setCustomUserAttributeToSecondsFromEpoch", "(Ljava/lang/String;J)Z", "incrementValue", "incrementCustomUserAttribute", "unsetCustomUserAttribute", "Lcom/braze/models/outgoing/AttributionData;", "attributionData", "setAttributionData", "(Lcom/braze/models/outgoing/AttributionData;)Z", "latitude", "longitude", "altitude", "accuracy", "verticalAccuracy", "Lfc/H;", "setLastKnownLocation", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "setLocationCustomAttribute", "(Ljava/lang/String;DD)V", "setCustomAttribute", "(Ljava/lang/String;Ljava/lang/Object;Z)Z", "setCustomAttributeToSecondsFromEpoch", "Lcom/braze/storage/n3;", "Lcom/braze/managers/m0;", "Ljava/lang/String;", "Lcom/braze/managers/p0;", "Lcom/braze/storage/b3;", "Ljava/util/concurrent/locks/ReentrantLock;", "userIdLock", "Ljava/util/concurrent/locks/ReentrantLock;", io.flutter.plugins.firebase.analytics.Constants.USER_ID, "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeUser {
    private final com.braze.managers.m0 brazeManager;
    private volatile String internalUserId;
    private final p0 locationManager;
    private final b3 serverConfigStorageProvider;
    private final n3 userCache;
    private final ReentrantLock userIdLock;

    public BrazeUser(n3 userCache, com.braze.managers.m0 brazeManager, String internalUserId, p0 locationManager, b3 serverConfigStorageProvider) {
        AbstractC4862t.e(userCache, "userCache");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(internalUserId, "internalUserId");
        AbstractC4862t.e(locationManager, "locationManager");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.userCache = userCache;
        this.brazeManager = brazeManager;
        this.internalUserId = internalUserId;
        this.locationManager = locationManager;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        this.userIdLock = new ReentrantLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$4() {
        return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$5() {
        return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$7(String str) {
        return "Failed to set alias: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$51() {
        return "Custom attribute key was invalid. Not adding to attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$52(String str) {
        return "Failed to add custom attribute with key '" + str + "'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$27() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$29(String str) {
        return "Failed to add user to subscription group " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$58(String str, int i10) {
        return "Failed to increment custom attribute " + str + " by " + i10 + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$53() {
        return "Custom attribute key was invalid. Not removing from attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$54(String str) {
        return "Failed to remove custom attribute with key '" + str + "'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$30() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$32(String str) {
        return "Failed to remove user from subscription group " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAttributionData$lambda$61() {
        return "Failed to set attribution data.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$19() {
        return "Invalid country parameter: country is required to be non-blank. Not setting country.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$20(String str) {
        return "Failed to set country to: " + str;
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$70() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$73$lambda$71(String str, Object obj) {
        return "Could not add unsupported custom attribute value with key: " + str + " and value: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$73$lambda$72(String str, Object obj) {
        return "Could not build NestedCustomAttributeEvent for key " + str + " and " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttributeArray$lambda$55(String str) {
        return "Failed to set custom attribute array with key: '" + str + "'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$43(String str) {
        return "Failed to set custom boolean attribute " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$44(String str) {
        return "Failed to set custom integer attribute " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$47(String str) {
        return "Failed to set custom string attribute " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$48(String str) {
        return "Failed to set custom double attribute " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$49(String str, JSONObject jSONObject) {
        return "Failed to set custom json attribute " + str + " with value \n" + JsonUtils.getPrettyPrintedString(jSONObject) + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeToSecondsFromEpoch$lambda$57(String str, long j10) {
        return "Failed to set custom attribute " + str + " to " + j10 + " seconds from epoch.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$18(int i10, Month month, int i11) {
        return "Failed to set date of birth to: " + i10 + "-" + month.getValue() + "-" + i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$12() {
        return "Invalid email parameter: email is required to be non-empty. Not setting email.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$15$lambda$14(String str) {
        return "Email address is not valid: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$16(String str) {
        return "Failed to set email to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$25(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set email notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$8() {
        return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$9(String str) {
        return "Failed to set first name to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$17(Gender gender) {
        return "Failed to set gender to: " + gender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$21() {
        return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$22(String str) {
        return "Failed to set home city to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$23() {
        return "Invalid language parameter: language is required to be non-empty. Not setting language.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$24(String str) {
        return "Failed to set language to: " + str;
    }

    public static /* synthetic */ void setLastKnownLocation$default(BrazeUser brazeUser, double d10, double d11, Double d12, Double d13, Double d14, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            d12 = null;
        }
        if ((i10 & 8) != 0) {
            d13 = null;
        }
        if ((i10 & 16) != 0) {
            d14 = null;
        }
        brazeUser.setLastKnownLocation(d10, d11, d12, d13, d14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastKnownLocation$lambda$62() {
        return "Failed to manually set location.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$10() {
        return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$11(String str) {
        return "Failed to set last name to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$38() {
        return "Invalid LINE ID parameter: LINE ID is required to be non-empty or null. Not setting LINE ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$41$lambda$40(String str) {
        return "LINE ID is longer than 33 characters: Failed to set LINE ID: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$42(String str) {
        return "Failed to set LINE ID to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$63() {
        return "Custom location attribute key was invalid. Not setting attribute.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$64(double d10, double d11) {
        return "Cannot set custom location attribute due with invalid latitude '" + d10 + " and longitude '" + d11 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$66(String str, double d10, double d11) {
        return "Failed to set custom location attribute with key '" + str + "' and latitude '" + d10 + "' and longitude '" + d11 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$33() {
        return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$36$lambda$35(String str) {
        return "Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$37(String str) {
        return "Failed to set phone number to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$26(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set push notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$59() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$60(String str) {
        return "Failed to unset custom attribute " + str + ".";
    }

    public final boolean addAlias(final String alias, String label) {
        BrazeUser brazeUser;
        AbstractC4862t.e(alias, "alias");
        AbstractC4862t.e(label, "label");
        if (F.k0(alias)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.b4
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.addAlias$lambda$4();
                }
            }, 6, (Object) null);
            return false;
        }
        if (F.k0(label)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.c4
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.addAlias$lambda$5();
                }
            }, 6, (Object) null);
            return false;
        }
        try {
            k kVarS = com.braze.models.outgoing.event.b.f28071g.s(alias, label);
            if (kVarS == null) {
                return false;
            }
            brazeUser = this;
            try {
                return ((r) brazeUser.brazeManager).a(kVarS);
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28625E, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.d4
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.addAlias$lambda$7(alias);
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
    }

    public final boolean addToCustomAttributeArray(final String key, String value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.P3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.addToCustomAttributeArray$lambda$51();
                    }
                }, 6, (Object) null);
                return false;
            }
            if (!com.braze.support.d.c(value)) {
                return false;
            }
            k kVarA = com.braze.models.outgoing.event.b.f28071g.a(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (kVarA == null) {
                return false;
            }
            return ((r) this.brazeManager).a(kVarA);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.Q3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.addToCustomAttributeArray$lambda$52(key);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(final String subscriptionGroupId) {
        BrazeUser brazeUser;
        AbstractC4862t.e(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (F.k0(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.w3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.addToSubscriptionGroup$lambda$27();
                    }
                }, 6, (Object) null);
                return false;
            }
            k kVarA = com.braze.models.outgoing.event.b.f28071g.a(subscriptionGroupId, com.braze.enums.g.f27662a);
            if (kVarA == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((r) brazeUser.brazeManager).a(kVarA);
                return true;
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.x3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.addToSubscriptionGroup$lambda$29(subscriptionGroupId);
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
    }

    public final String getUserId() {
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            return this.internalUserId;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean incrementCustomUserAttribute(final String key, final int incrementValue) {
        AbstractC4862t.e(key, "key");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                return false;
            }
            k kVarA = com.braze.models.outgoing.event.b.f28071g.a(ValidationUtils.ensureBrazeFieldLength(key), incrementValue);
            if (kVarA == null) {
                return false;
            }
            return ((r) this.brazeManager).a(kVarA);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.s3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.incrementCustomUserAttribute$lambda$58(key, incrementValue);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromCustomAttributeArray(final String key, String value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.m4
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.removeFromCustomAttributeArray$lambda$53();
                    }
                }, 6, (Object) null);
                return false;
            }
            if (!com.braze.support.d.c(value)) {
                return false;
            }
            k kVarQ = com.braze.models.outgoing.event.b.f28071g.q(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (kVarQ == null) {
                return false;
            }
            return ((r) this.brazeManager).a(kVarQ);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.o3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.removeFromCustomAttributeArray$lambda$54(key);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromSubscriptionGroup(final String subscriptionGroupId) {
        BrazeUser brazeUser;
        AbstractC4862t.e(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (F.k0(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.U3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.removeFromSubscriptionGroup$lambda$30();
                    }
                }, 6, (Object) null);
                return false;
            }
            k kVarA = com.braze.models.outgoing.event.b.f28071g.a(subscriptionGroupId, com.braze.enums.g.f27663b);
            if (kVarA == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((r) brazeUser.brazeManager).a(kVarA);
                return true;
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.f4
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.removeFromSubscriptionGroup$lambda$32(subscriptionGroupId);
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
    }

    public final boolean setAttributionData(AttributionData attributionData) {
        try {
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new y(this, attributionData, null), 3, null);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.X3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setAttributionData$lambda$61();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCountry(final String country) {
        BrazeUser brazeUser;
        if (country == null) {
            brazeUser = this;
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new z(brazeUser, country, null), 3, null);
            return true;
        }
        try {
            if (F.k0(country)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.z3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setCountry$lambda$19();
                    }
                }, 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new z(brazeUser, country, null), 3, null);
                return true;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.A3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeUser.setCountry$lambda$20(country);
            }
        }, 4, (Object) null);
        return false;
    }

    public final boolean setCustomAttribute(final String key, final Object value, boolean merge) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.p3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setCustomAttribute$lambda$70();
                }
            }, 6, (Object) null);
            return false;
        }
        final String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
        final Object objA = com.braze.support.d.f28633a.a(value, 0);
        if (objA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.q3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setCustomAttribute$lambda$73$lambda$71(key, value);
                }
            }, 6, (Object) null);
            return false;
        }
        if (!(objA instanceof JSONObject) || !merge) {
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new a0(this, strEnsureBrazeFieldLength, objA, null), 3, null);
            return true;
        }
        k kVarA = com.braze.models.outgoing.event.b.f28071g.a(strEnsureBrazeFieldLength, (JSONObject) objA);
        if (kVarA != null) {
            return ((r) this.brazeManager).a(kVarA);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.r3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeUser.setCustomAttribute$lambda$73$lambda$72(strEnsureBrazeFieldLength, objA);
            }
        }, 6, (Object) null);
        return false;
    }

    public final boolean setCustomAttributeArray(final String key, String[] values) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(values, "values");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                return false;
            }
            String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
            AbstractC4862t.e(values, "values");
            ArrayList arrayList = new ArrayList(values.length);
            for (String str : values) {
                arrayList.add(ValidationUtils.ensureBrazeFieldLength(str));
            }
            k kVarA = com.braze.models.outgoing.event.b.f28071g.a(strEnsureBrazeFieldLength, (String[]) arrayList.toArray(new String[0]));
            if (kVarA == null) {
                return false;
            }
            return ((r) this.brazeManager).a(kVarA);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.i4
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setCustomAttributeArray$lambda$55(key);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomAttributeToSecondsFromEpoch(String key, long secondsFromEpoch) {
        AbstractC4862t.e(key, "key");
        return setCustomAttribute$default(this, key, DateTimeUtils.createDate(secondsFromEpoch), false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, boolean value) {
        BrazeUser brazeUser;
        String str;
        AbstractC4862t.e(key, "key");
        try {
            brazeUser = this;
            str = key;
            try {
                return setCustomAttribute$default(brazeUser, str, Boolean.valueOf(value), false, 4, null);
            } catch (Exception e10) {
                e = e10;
                final String str2 = str;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.Y3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setCustomUserAttribute$lambda$43(str2);
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
            str = key;
        }
    }

    public final boolean setCustomUserAttributeToSecondsFromEpoch(final String key, final long secondsFromEpoch) {
        AbstractC4862t.e(key, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(key, secondsFromEpoch);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.O3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setCustomUserAttributeToSecondsFromEpoch$lambda$57(key, secondsFromEpoch);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setDateOfBirth(int year, final Month month, int day) {
        final int i10;
        final int i11;
        AbstractC4862t.e(month, "month");
        try {
            i10 = year;
            i11 = day;
            try {
                AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new b0(this, DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i10, month.getValue(), i11, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null), null), 3, null);
                return true;
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.W3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setDateOfBirth$lambda$18(i10, month, i11);
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            i10 = year;
            i11 = day;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0006, B:6:0x000c, B:13:0x0028, B:18:0x0036, B:25:0x004b, B:28:0x0051, B:29:0x0054, B:32:0x0061, B:35:0x0068, B:37:0x007f), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setEmail(final java.lang.String r21) {
        /*
            r20 = this;
            r1 = r21
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L25
            boolean r3 = Od.F.k0(r1)     // Catch: java.lang.Exception -> L1f
            if (r3 != r0) goto L25
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L1f
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.f28628W     // Catch: java.lang.Exception -> L1f
            R4.j4 r9 = new R4.j4     // Catch: java.lang.Exception -> L1f
            r9.<init>()     // Catch: java.lang.Exception -> L1f
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r20
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L1f
            return r2
        L1f:
            r0 = move-exception
            r13 = r20
        L22:
            r15 = r0
            goto L93
        L25:
            r3 = 0
            if (r1 == 0) goto L5e
            int r4 = r1.length()     // Catch: java.lang.Exception -> L1f
            int r4 = r4 - r0
            r5 = r2
            r6 = r5
        L2f:
            if (r5 > r4) goto L54
            if (r6 != 0) goto L35
            r7 = r5
            goto L36
        L35:
            r7 = r4
        L36:
            char r7 = r1.charAt(r7)     // Catch: java.lang.Exception -> L1f
            r8 = 32
            int r7 = kotlin.jvm.internal.AbstractC4862t.f(r7, r8)     // Catch: java.lang.Exception -> L1f
            if (r7 > 0) goto L44
            r7 = r0
            goto L45
        L44:
            r7 = r2
        L45:
            if (r6 != 0) goto L4e
            if (r7 != 0) goto L4b
            r6 = r0
            goto L2f
        L4b:
            int r5 = r5 + 1
            goto L2f
        L4e:
            if (r7 != 0) goto L51
            goto L54
        L51:
            int r4 = r4 + (-1)
            goto L2f
        L54:
            int r4 = r4 + r0
            java.lang.CharSequence r4 = r1.subSequence(r5, r4)     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L1f
            goto L5f
        L5e:
            r4 = r3
        L5f:
            if (r4 == 0) goto L7f
            boolean r5 = com.braze.support.ValidationUtils.isValidEmailAddress(r4)     // Catch: java.lang.Exception -> L1f
            if (r5 == 0) goto L68
            goto L7f
        L68:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L1f
            R4.k4 r0 = new R4.k4     // Catch: java.lang.Exception -> L1f
            r0.<init>()     // Catch: java.lang.Exception -> L1f
            r18 = 7
            r19 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r20
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L1f
            return r2
        L7f:
            com.braze.coroutine.f r5 = com.braze.coroutine.f.f27586a     // Catch: java.lang.Exception -> L1f
            com.braze.c0 r6 = new com.braze.c0     // Catch: java.lang.Exception -> L1f
            r13 = r20
            r6.<init>(r13, r4, r3)     // Catch: java.lang.Exception -> L91
            r7 = 3
            r8 = 0
            r4 = 0
            r3 = r5
            r5 = 0
            Rd.AbstractC2128g.d(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L91
            return r0
        L91:
            r0 = move-exception
            goto L22
        L93:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.f28628W
            R4.l4 r0 = new R4.l4
            r0.<init>()
            r18 = 4
            r19 = 0
            r16 = 0
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setEmail(java.lang.String):boolean");
    }

    public final boolean setEmailNotificationSubscriptionType(final NotificationSubscriptionType emailNotificationSubscriptionType) {
        AbstractC4862t.e(emailNotificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new d0(this, emailNotificationSubscriptionType, null), 3, null);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.G3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setEmailNotificationSubscriptionType$lambda$25(emailNotificationSubscriptionType);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setFirstName(final String firstName) {
        BrazeUser brazeUser;
        if (firstName == null) {
            brazeUser = this;
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new e0(brazeUser, firstName, null), 3, null);
            return true;
        }
        try {
            if (F.k0(firstName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.M3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setFirstName$lambda$8();
                    }
                }, 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new e0(brazeUser, firstName, null), 3, null);
                return true;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.N3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeUser.setFirstName$lambda$9(firstName);
            }
        }, 4, (Object) null);
        return false;
    }

    public final boolean setGender(final Gender gender) {
        try {
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new f0(this, gender, null), 3, null);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.H3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setGender$lambda$17(gender);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setHomeCity(final String homeCity) {
        BrazeUser brazeUser;
        if (homeCity == null) {
            brazeUser = this;
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new g0(brazeUser, homeCity, null), 3, null);
            return true;
        }
        try {
            if (F.k0(homeCity)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.T3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setHomeCity$lambda$21();
                    }
                }, 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new g0(brazeUser, homeCity, null), 3, null);
                return true;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.V3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeUser.setHomeCity$lambda$22(homeCity);
            }
        }, 4, (Object) null);
        return false;
    }

    public final boolean setLanguage(final String language) {
        BrazeUser brazeUser;
        if (language == null) {
            brazeUser = this;
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new h0(brazeUser, language, null), 3, null);
            return true;
        }
        try {
            if (F.k0(language)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.K3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setLanguage$lambda$23();
                    }
                }, 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new h0(brazeUser, language, null), 3, null);
                return true;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.L3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeUser.setLanguage$lambda$24(language);
            }
        }, 4, (Object) null);
        return false;
    }

    public final void setLastKnownLocation(double latitude, double longitude, Double altitude, Double accuracy, Double verticalAccuracy) {
        try {
            ((com.braze.managers.p) this.locationManager).a(new BrazeLocation(latitude, longitude, altitude, accuracy, verticalAccuracy));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.Z3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setLastKnownLocation$lambda$62();
                }
            }, 4, (Object) null);
        }
    }

    public final boolean setLastName(final String lastName) {
        BrazeUser brazeUser;
        if (lastName == null) {
            brazeUser = this;
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new i0(brazeUser, lastName, null), 3, null);
            return true;
        }
        try {
            if (F.k0(lastName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.R3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setLastName$lambda$10();
                    }
                }, 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new i0(brazeUser, lastName, null), 3, null);
                return true;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.S3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeUser.setLastName$lambda$11(lastName);
            }
        }, 4, (Object) null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0006, B:6:0x000c, B:13:0x0028, B:18:0x0036, B:25:0x004b, B:28:0x0051, B:29:0x0054, B:32:0x0061, B:35:0x0068, B:37:0x0080), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setLineId(final java.lang.String r21) {
        /*
            r20 = this;
            r1 = r21
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L25
            boolean r3 = Od.F.k0(r1)     // Catch: java.lang.Exception -> L1f
            if (r3 != r0) goto L25
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L1f
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.f28628W     // Catch: java.lang.Exception -> L1f
            R4.e4 r9 = new R4.e4     // Catch: java.lang.Exception -> L1f
            r9.<init>()     // Catch: java.lang.Exception -> L1f
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r20
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L1f
            return r2
        L1f:
            r0 = move-exception
            r13 = r20
        L22:
            r15 = r0
            goto L94
        L25:
            r3 = 0
            if (r1 == 0) goto L5e
            int r4 = r1.length()     // Catch: java.lang.Exception -> L1f
            int r4 = r4 - r0
            r5 = r2
            r6 = r5
        L2f:
            if (r5 > r4) goto L54
            if (r6 != 0) goto L35
            r7 = r5
            goto L36
        L35:
            r7 = r4
        L36:
            char r7 = r1.charAt(r7)     // Catch: java.lang.Exception -> L1f
            r8 = 32
            int r7 = kotlin.jvm.internal.AbstractC4862t.f(r7, r8)     // Catch: java.lang.Exception -> L1f
            if (r7 > 0) goto L44
            r7 = r0
            goto L45
        L44:
            r7 = r2
        L45:
            if (r6 != 0) goto L4e
            if (r7 != 0) goto L4b
            r6 = r0
            goto L2f
        L4b:
            int r5 = r5 + 1
            goto L2f
        L4e:
            if (r7 != 0) goto L51
            goto L54
        L51:
            int r4 = r4 + (-1)
            goto L2f
        L54:
            int r4 = r4 + r0
            java.lang.CharSequence r4 = r1.subSequence(r5, r4)     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L1f
            goto L5f
        L5e:
            r4 = r3
        L5f:
            if (r4 == 0) goto L80
            boolean r5 = com.braze.support.ValidationUtils.isValidLineId(r4)     // Catch: java.lang.Exception -> L1f
            if (r5 == 0) goto L68
            goto L80
        L68:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L1f
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.f28628W     // Catch: java.lang.Exception -> L1f
            R4.g4 r0 = new R4.g4     // Catch: java.lang.Exception -> L1f
            r0.<init>()     // Catch: java.lang.Exception -> L1f
            r18 = 6
            r19 = 0
            r15 = 0
            r16 = 0
            r13 = r20
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L1f
            return r2
        L80:
            com.braze.coroutine.f r5 = com.braze.coroutine.f.f27586a     // Catch: java.lang.Exception -> L1f
            com.braze.j0 r6 = new com.braze.j0     // Catch: java.lang.Exception -> L1f
            r13 = r20
            r6.<init>(r13, r4, r3)     // Catch: java.lang.Exception -> L92
            r7 = 3
            r8 = 0
            r4 = 0
            r3 = r5
            r5 = 0
            Rd.AbstractC2128g.d(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L92
            return r0
        L92:
            r0 = move-exception
            goto L22
        L94:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.f28628W
            R4.h4 r0 = new R4.h4
            r0.<init>()
            r18 = 4
            r19 = 0
            r16 = 0
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setLineId(java.lang.String):boolean");
    }

    public final void setLocationCustomAttribute(final String key, final double latitude, final double longitude) {
        AbstractC4862t.e(key, "key");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.C3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setLocationCustomAttribute$lambda$63();
                    }
                }, 6, (Object) null);
                return;
            }
            if (ValidationUtils.isValidLocation(latitude, longitude)) {
                k kVarA = com.braze.models.outgoing.event.b.f28071g.a(ValidationUtils.ensureBrazeFieldLength(key), latitude, longitude);
                if (kVarA != null) {
                    ((r) this.brazeManager).a(kVarA);
                    return;
                }
                return;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.D3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setLocationCustomAttribute$lambda$64(latitude, longitude);
                    }
                }, 6, (Object) null);
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.E3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setLocationCustomAttribute$lambda$66(key, latitude, longitude);
                    }
                }, 4, (Object) null);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0006, B:6:0x000c, B:13:0x0028, B:18:0x0036, B:25:0x004b, B:28:0x0051, B:29:0x0054, B:32:0x0061, B:35:0x0068, B:37:0x0080), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setPhoneNumber(final java.lang.String r21) {
        /*
            r20 = this;
            r1 = r21
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L25
            boolean r3 = Od.F.k0(r1)     // Catch: java.lang.Exception -> L1f
            if (r3 != r0) goto L25
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L1f
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.f28628W     // Catch: java.lang.Exception -> L1f
            R4.n3 r9 = new R4.n3     // Catch: java.lang.Exception -> L1f
            r9.<init>()     // Catch: java.lang.Exception -> L1f
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r20
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L1f
            return r2
        L1f:
            r0 = move-exception
            r13 = r20
        L22:
            r15 = r0
            goto L94
        L25:
            r3 = 0
            if (r1 == 0) goto L5e
            int r4 = r1.length()     // Catch: java.lang.Exception -> L1f
            int r4 = r4 - r0
            r5 = r2
            r6 = r5
        L2f:
            if (r5 > r4) goto L54
            if (r6 != 0) goto L35
            r7 = r5
            goto L36
        L35:
            r7 = r4
        L36:
            char r7 = r1.charAt(r7)     // Catch: java.lang.Exception -> L1f
            r8 = 32
            int r7 = kotlin.jvm.internal.AbstractC4862t.f(r7, r8)     // Catch: java.lang.Exception -> L1f
            if (r7 > 0) goto L44
            r7 = r0
            goto L45
        L44:
            r7 = r2
        L45:
            if (r6 != 0) goto L4e
            if (r7 != 0) goto L4b
            r6 = r0
            goto L2f
        L4b:
            int r5 = r5 + 1
            goto L2f
        L4e:
            if (r7 != 0) goto L51
            goto L54
        L51:
            int r4 = r4 + (-1)
            goto L2f
        L54:
            int r4 = r4 + r0
            java.lang.CharSequence r4 = r1.subSequence(r5, r4)     // Catch: java.lang.Exception -> L1f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L1f
            goto L5f
        L5e:
            r4 = r3
        L5f:
            if (r4 == 0) goto L80
            boolean r5 = com.braze.support.ValidationUtils.isValidPhoneNumber(r4)     // Catch: java.lang.Exception -> L1f
            if (r5 == 0) goto L68
            goto L80
        L68:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L1f
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.f28628W     // Catch: java.lang.Exception -> L1f
            R4.y3 r0 = new R4.y3     // Catch: java.lang.Exception -> L1f
            r0.<init>()     // Catch: java.lang.Exception -> L1f
            r18 = 6
            r19 = 0
            r15 = 0
            r16 = 0
            r13 = r20
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L1f
            return r2
        L80:
            com.braze.coroutine.f r5 = com.braze.coroutine.f.f27586a     // Catch: java.lang.Exception -> L1f
            com.braze.k0 r6 = new com.braze.k0     // Catch: java.lang.Exception -> L1f
            r13 = r20
            r6.<init>(r13, r4, r3)     // Catch: java.lang.Exception -> L92
            r7 = 3
            r8 = 0
            r4 = 0
            r3 = r5
            r5 = 0
            Rd.AbstractC2128g.d(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L92
            return r0
        L92:
            r0 = move-exception
            goto L22
        L94:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.f28628W
            R4.J3 r0 = new R4.J3
            r0.<init>()
            r18 = 4
            r19 = 0
            r16 = 0
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setPhoneNumber(java.lang.String):boolean");
    }

    public final boolean setPushNotificationSubscriptionType(final NotificationSubscriptionType pushNotificationSubscriptionType) {
        AbstractC4862t.e(pushNotificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new l0(this, pushNotificationSubscriptionType, null), 3, null);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.a4
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setPushNotificationSubscriptionType$lambda$26(pushNotificationSubscriptionType);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean unsetCustomUserAttribute(final String key) {
        AbstractC4862t.e(key, "key");
        try {
            if (com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                AbstractC2132i.d(com.braze.coroutine.f.f27586a, null, null, new m0(this, key, null), 3, null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.t3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.unsetCustomUserAttribute$lambda$59();
                }
            }, 6, (Object) null);
            return false;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.u3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.unsetCustomUserAttribute$lambda$60(key);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, int value) {
        BrazeUser brazeUser;
        String str;
        AbstractC4862t.e(key, "key");
        try {
            brazeUser = this;
            str = key;
            try {
                return setCustomAttribute$default(brazeUser, str, Integer.valueOf(value), false, 4, null);
            } catch (Exception e10) {
                e = e10;
                final String str2 = str;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.I3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setCustomUserAttribute$lambda$44(str2);
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
            str = key;
        }
    }

    public final boolean setCustomUserAttribute(final String key, String value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.B3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setCustomUserAttribute$lambda$47(key);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, double value) {
        BrazeUser brazeUser;
        String str;
        AbstractC4862t.e(key, "key");
        try {
            brazeUser = this;
            str = key;
            try {
                return setCustomAttribute$default(brazeUser, str, Double.valueOf(value), false, 4, null);
            } catch (Exception e10) {
                e = e10;
                final String str2 = str;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f28628W, (Throwable) e, false, new InterfaceC6082a() { // from class: R4.F3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeUser.setCustomUserAttribute$lambda$48(str2);
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
            str = key;
        }
    }

    public final boolean setCustomUserAttribute(final String key, final JSONObject value, boolean merge) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        try {
            return setCustomAttribute(key, value, merge);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: R4.v3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeUser.setCustomUserAttribute$lambda$49(key, value);
                }
            }, 4, (Object) null);
            return false;
        }
    }
}
