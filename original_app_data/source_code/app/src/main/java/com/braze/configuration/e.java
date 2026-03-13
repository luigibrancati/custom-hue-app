package com.braze.configuration;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.f2;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f27579a;

    public e(Context context) {
        AbstractC4862t.e(context, "context");
        this.f27579a = new f2(context);
    }

    public static final String c(String str) {
        return "Offline user storage provider was given user ID longer than 997. Rejecting. User ID: " + str;
    }

    public final String a() {
        String string = this.f27579a.readString(DataStoreKey.LAST_USER_ID, "");
        final String str = string != null ? string : "";
        if (StringUtils.getByteSize(str) <= 997) {
            return str;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.configuration.e.a(str);
            }
        }, 6, (Object) null);
        String strTruncateToByteLength = StringUtils.truncateToByteLength(str, 997);
        b(strTruncateToByteLength);
        return strTruncateToByteLength;
    }

    public final void b(final String userId) {
        AbstractC4862t.e(userId, "userId");
        if (userId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.z
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.configuration.e.b();
                }
            }, 6, (Object) null);
        } else if (StringUtils.getByteSize(userId) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.A
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.configuration.e.c(userId);
                }
            }, 6, (Object) null);
        } else {
            this.f27579a.writeData(DataStoreKey.LAST_USER_ID, userId);
        }
    }

    public static final String a(String str) {
        return "Stored user ID is longer than 997 bytes. Truncating. Original user ID: " + str;
    }

    public static final String b() {
        return "userId is empty in updateLastUserId. Rejecting.";
    }
}
