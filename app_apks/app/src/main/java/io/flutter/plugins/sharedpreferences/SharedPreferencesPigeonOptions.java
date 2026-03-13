package io.flutter.plugins.sharedpreferences;

import gc.C4206t;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "", "fileName", "", "useDataStore", "", "<init>", "(Ljava/lang/String;Z)V", "getFileName", "()Ljava/lang/String;", "getUseDataStore", "()Z", "toList", "", "equals", Request.JsonKeys.OTHER, "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "shared_preferences_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedPreferencesPigeonOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fileName;
    private final boolean useDataStore;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "pigeonVar_list", "", "shared_preferences_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final SharedPreferencesPigeonOptions fromList(List<? extends Object> pigeonVar_list) {
            AbstractC4862t.e(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new SharedPreferencesPigeonOptions(str, ((Boolean) obj).booleanValue());
        }

        private Companion() {
        }
    }

    public SharedPreferencesPigeonOptions(String str, boolean z10) {
        this.fileName = str;
        this.useDataStore = z10;
    }

    public static /* synthetic */ SharedPreferencesPigeonOptions copy$default(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sharedPreferencesPigeonOptions.fileName;
        }
        if ((i10 & 2) != 0) {
            z10 = sharedPreferencesPigeonOptions.useDataStore;
        }
        return sharedPreferencesPigeonOptions.copy(str, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUseDataStore() {
        return this.useDataStore;
    }

    public final SharedPreferencesPigeonOptions copy(String fileName, boolean useDataStore) {
        return new SharedPreferencesPigeonOptions(fileName, useDataStore);
    }

    public boolean equals(Object other) {
        if (!(other instanceof SharedPreferencesPigeonOptions)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return MessagesAsyncPigeonUtils.INSTANCE.deepEquals(toList(), ((SharedPreferencesPigeonOptions) other).toList());
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getUseDataStore() {
        return this.useDataStore;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return C4206t.n(this.fileName, Boolean.valueOf(this.useDataStore));
    }

    public String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.fileName + ", useDataStore=" + this.useDataStore + ")";
    }

    public /* synthetic */ SharedPreferencesPigeonOptions(String str, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : str, z10);
    }
}
