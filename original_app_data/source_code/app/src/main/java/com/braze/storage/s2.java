package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t2 f28568d;

    public s2(Context context, String str, String str2) {
        AbstractC4862t.e(context, "context");
        this.f28565a = context;
        this.f28566b = str;
        this.f28567c = str2;
        this.f28568d = new t2(context, str, str2);
    }

    public final String a() {
        return String.valueOf(this.f28568d.readData(DataStoreKey.SDK_AUTH, ""));
    }

    public final void b(final String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.X2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.s2.a(str);
            }
        }, 6, (Object) null);
        t2 t2Var = this.f28568d;
        DataStoreKey dataStoreKey = DataStoreKey.SDK_AUTH;
        if (str == null) {
            str = "";
        }
        t2Var.writeData(dataStoreKey, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return AbstractC4862t.a(this.f28565a, s2Var.f28565a) && AbstractC4862t.a(this.f28566b, s2Var.f28566b) && AbstractC4862t.a(this.f28567c, s2Var.f28567c);
    }

    public final int hashCode() {
        int iHashCode = this.f28565a.hashCode() * 31;
        String str = this.f28566b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28567c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SdkAuthenticationCache(context=" + this.f28565a + ", userId=" + this.f28566b + ", apiKey=" + this.f28567c + ")";
    }

    public static final String a(String str) {
        return "Setting signature to: " + str;
    }
}
