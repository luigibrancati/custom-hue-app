package com.braze.support;

import Od.C1823c;
import Od.F;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import io.flutter.plugins.firebase.analytics.Constants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0017\u001a\u00020\u0015*\u0004\u0018\u00010\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "reference", "", "isNullOrBlank", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", Constants.USER_ID, "apiKey", "getCacheFileSuffix", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getByteSize", "(Ljava/lang/String;)J", "", "desiredByteLength", "truncateToByteLength", "(Ljava/lang/String;I)Ljava/lang/String;", "getMd5Hash", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "Lfc/H;", "block", "ifNonEmpty", "(Ljava/lang/String;Lvc/l;)V", "userIdHash", "getSuffixFromUserIdHashAndApiKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class StringUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("StringUtils");

    public static final long getByteSize(String str) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.d(str.getBytes(C1823c.f12394b), "getBytes(...)");
        return r2.length;
    }

    public static final String getCacheFileSuffix(Context context, String str, final String str2) throws NoSuchAlgorithmException {
        AbstractC4862t.e(context, "context");
        final String str3 = str == null ? "null" : str;
        if (AbstractC4862t.a(str3, "null")) {
            return getSuffixFromUserIdHashAndApiKey("37a6259cc0c1dae299a7866489dff0bd", str2);
        }
        i3 i3Var = new i3(context);
        DataStoreKey dataStoreKey = DataStoreKey.SUFFIX_CACHE_USER_ID_KEY;
        String string = i3Var.readString(dataStoreKey, null);
        if (string != null && AbstractC4862t.a(string, str3)) {
            String string2 = i3Var.readString(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, null);
            if (string2 != null && string2.length() != 0) {
                return getSuffixFromUserIdHashAndApiKey(string2, str2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.o0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return StringUtils.getCacheFileSuffix$lambda$1();
                }
            }, 14, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.p0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return StringUtils.getCacheFileSuffix$lambda$2(str3, str2);
            }
        }, 12, (Object) null);
        String md5Hash = getMd5Hash(str3);
        i3Var.writeData(dataStoreKey, str3);
        i3Var.writeData(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, md5Hash);
        return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$1() {
        return "The saved user id hash was null or empty.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$2(String str, String str2) {
        return "Generating MD5 for user id: " + str + " apiKey: " + str2;
    }

    public static final String getMd5Hash(String str) throws NoSuchAlgorithmException {
        AbstractC4862t.e(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(C1823c.f12394b);
        AbstractC4862t.d(bytes, "getBytes(...)");
        BigInteger bigInteger = new BigInteger(1, messageDigest.digest(bytes));
        S s10 = S.f39781a;
        String str2 = String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{bigInteger}, 1));
        AbstractC4862t.d(str2, "format(...)");
        return str2;
    }

    private static final String getSuffixFromUserIdHashAndApiKey(String str, String str2) {
        if (str2 == null || F.k0(str2)) {
            return "." + str;
        }
        return "." + str + "." + str2;
    }

    public static final void ifNonEmpty(String str, vc.l block) {
        AbstractC4862t.e(block, "block");
        if (str == null || str.length() == 0) {
            return;
        }
        block.invoke(str);
    }

    public static final boolean isNullOrBlank(String str) {
        return str == null || F.k0(str);
    }

    public static final String truncateToByteLength(String str, int i10) {
        AbstractC4862t.e(str, "<this>");
        if (getByteSize(str) <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        AbstractC4862t.d(charArray, "toCharArray(...)");
        int byteSize = 0;
        for (char c10 : charArray) {
            byteSize += (int) getByteSize(String.valueOf(c10));
            if (byteSize > i10) {
                break;
            }
            sb2.append(c10);
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
