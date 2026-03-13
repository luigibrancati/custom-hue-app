package com.braze.support;

import Od.F;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.ValidationUtils;
import gc.U;
import io.flutter.plugins.firebase.analytics.Constants;
import io.sentry.clientreport.DiscardedEvent;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0016\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b%\u0010\bJ\u0019\u0010(\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b'\u0010\bR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100¨\u00063"}, d2 = {"Lcom/braze/support/ValidationUtils;", "", "<init>", "()V", "", "emailAddress", "", "isValidEmailAddress", "(Ljava/lang/String;)Z", "phoneNumber", "isValidPhoneNumber", "field", "ensureBrazeFieldLength", "(Ljava/lang/String;)Ljava/lang/String;", "productId", "currencyCode", "Ljava/math/BigDecimal;", "price", "", DiscardedEvent.JsonKeys.QUANTITY, "Lcom/braze/storage/b3;", "serverConfigStorageProvider", "isValidLogPurchaseInput", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/storage/b3;)Z", Constants.EVENT_NAME, "isValidLogCustomEventInput", "(Ljava/lang/String;Lcom/braze/storage/b3;)Z", "campaignId", "pageId", "isValidPushStoryClickInput", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "latitude", "longitude", "isValidLocation", "(DD)Z", "lineId", "isValidLineId", "customEndpoint", "isInvalidCustomEndpoint$android_sdk_base_release", "isInvalidCustomEndpoint", "", "VALID_CURRENCY_CODES", "Ljava/util/Set;", "getVALID_CURRENCY_CODES", "()Ljava/util/Set;", "LOd/o;", "EMAIL_ADDRESS_REGEX", "LOd/o;", "PHONE_NUMBER_REGEX", "ENDPOINT_REGEX", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidationUtils {
    public static final ValidationUtils INSTANCE = new ValidationUtils();
    private static final Set<String> VALID_CURRENCY_CODES = U.h("AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL");
    private static final Od.o EMAIL_ADDRESS_REGEX = new Od.o(".+@.+\\..+");
    private static final Od.o PHONE_NUMBER_REGEX = new Od.o("^[0-9 .\\(\\)\\+\\-]+$");
    private static final Od.o ENDPOINT_REGEX = new Od.o("rest\\.[a-z]+-[0-9]+\\.braze\\.");

    private ValidationUtils() {
    }

    public static final String ensureBrazeFieldLength(String field) {
        if (field == null || F.k0(field)) {
            return "";
        }
        final L l10 = new L();
        String string = F.e1(field).toString();
        l10.f39776a = string;
        if (string.length() > 255) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.q0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ValidationUtils.ensureBrazeFieldLength$lambda$0(l10);
                }
            }, 6, (Object) null);
            String strSubstring = ((String) l10.f39776a).substring(0, 255);
            AbstractC4862t.d(strSubstring, "substring(...)");
            l10.f39776a = strSubstring;
        }
        return (String) l10.f39776a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureBrazeFieldLength$lambda$0(L l10) {
        return "Provided string field is too long [" + ((String) l10.f39776a).length() + "]. The max length is 255, truncating provided field.";
    }

    public static final boolean isInvalidCustomEndpoint$android_sdk_base_release(String customEndpoint) {
        if (customEndpoint != null) {
            return ENDPOINT_REGEX.b(customEndpoint);
        }
        return false;
    }

    public static final boolean isValidEmailAddress(String emailAddress) {
        if (emailAddress == null || emailAddress.length() == 0 || emailAddress.length() > 255) {
            return false;
        }
        return EMAIL_ADDRESS_REGEX.i(emailAddress);
    }

    public static final boolean isValidLineId(String lineId) {
        return lineId != null && lineId.length() <= 33;
    }

    public static final boolean isValidLocation(double latitude, double longitude) {
        return latitude < 90.0d && latitude > -90.0d && longitude < 180.0d && longitude > -180.0d;
    }

    public static final boolean isValidLogCustomEventInput(final String eventName, b3 serverConfigStorageProvider) {
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (eventName == null || F.k0(eventName)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.u0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ValidationUtils.isValidLogCustomEventInput$lambda$8();
                }
            }, 6, (Object) null);
            return false;
        }
        if (!serverConfigStorageProvider.f().contains(eventName)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.t0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return ValidationUtils.isValidLogCustomEventInput$lambda$9(eventName);
            }
        }, 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$8() {
        return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$9(String str) {
        return "The custom event is a blocklisted custom event: " + str + ". Invalid custom event.";
    }

    public static final boolean isValidLogPurchaseInput(final String productId, final String currencyCode, BigDecimal price, final int quantity, b3 serverConfigStorageProvider) {
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (productId == null || F.k0(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.B0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ValidationUtils.isValidLogPurchaseInput$lambda$1();
                }
            }, 6, (Object) null);
            return false;
        }
        if (serverConfigStorageProvider.g().contains(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.v0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ValidationUtils.isValidLogPurchaseInput$lambda$2(productId);
                }
            }, 6, (Object) null);
            return false;
        }
        if (currencyCode == null || F.k0(currencyCode)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.A0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ValidationUtils.isValidLogPurchaseInput$lambda$3();
                }
            }, 6, (Object) null);
            return false;
        }
        Set<String> set = VALID_CURRENCY_CODES;
        String string = F.e1(currencyCode).toString();
        Locale US = Locale.US;
        AbstractC4862t.d(US, "US");
        String upperCase = string.toUpperCase(US);
        AbstractC4862t.d(upperCase, "toUpperCase(...)");
        if (!set.contains(upperCase)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.w0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ValidationUtils.isValidLogPurchaseInput$lambda$4(currencyCode);
                }
            }, 6, (Object) null);
            return false;
        }
        if (price == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.x0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ValidationUtils.isValidLogPurchaseInput$lambda$5();
                }
            }, 6, (Object) null);
            return false;
        }
        if (quantity <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.y0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ValidationUtils.isValidLogPurchaseInput$lambda$6(quantity);
                }
            }, 6, (Object) null);
            return false;
        }
        if (quantity <= 100) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.z0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return ValidationUtils.isValidLogPurchaseInput$lambda$7(quantity);
            }
        }, 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$1() {
        return "The productId is empty, not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$2(String str) {
        return "The productId is a blocklisted productId: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$3() {
        return "The currencyCode is empty. Expected one of " + VALID_CURRENCY_CODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$4(String str) {
        return "The currencyCode " + str + " is invalid. Expected one of " + VALID_CURRENCY_CODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$5() {
        return "The price is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$6(int i10) {
        return "The requested purchase quantity of " + i10 + " is less than one. Invalid purchase";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$7(int i10) {
        return "The requested purchase quantity of " + i10 + " is greater than the maximum of 100";
    }

    public static final boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && PHONE_NUMBER_REGEX.i(phoneNumber);
    }

    public static final boolean isValidPushStoryClickInput(String campaignId, String pageId) {
        if (campaignId == null || F.k0(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.s0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return ValidationUtils.isValidPushStoryClickInput$lambda$10();
                }
            }, 6, (Object) null);
            return false;
        }
        if (pageId != null && !F.k0(pageId)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.r0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return ValidationUtils.isValidPushStoryClickInput$lambda$11();
            }
        }, 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$10() {
        return "Campaign ID cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$11() {
        return "Push story page ID cannot be null or blank";
    }
}
