package io.flutter.plugins.sharedpreferences;

import gc.C4206t;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/flutter/plugins/sharedpreferences/StringListResult;", "", "jsonEncodedValue", "", "type", "Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "<init>", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;)V", "getJsonEncodedValue", "()Ljava/lang/String;", "getType", "()Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;", "toList", "", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "shared_preferences_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StringListResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String jsonEncodedValue;
    private final StringListLookupResultType type;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/sharedpreferences/StringListResult$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "pigeonVar_list", "", "shared_preferences_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final StringListResult fromList(List<? extends Object> pigeonVar_list) {
            AbstractC4862t.e(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
            return new StringListResult(str, (StringListLookupResultType) obj);
        }

        private Companion() {
        }
    }

    public StringListResult(String str, StringListLookupResultType type) {
        AbstractC4862t.e(type, "type");
        this.jsonEncodedValue = str;
        this.type = type;
    }

    public static /* synthetic */ StringListResult copy$default(StringListResult stringListResult, String str, StringListLookupResultType stringListLookupResultType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stringListResult.jsonEncodedValue;
        }
        if ((i10 & 2) != 0) {
            stringListLookupResultType = stringListResult.type;
        }
        return stringListResult.copy(str, stringListLookupResultType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJsonEncodedValue() {
        return this.jsonEncodedValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StringListLookupResultType getType() {
        return this.type;
    }

    public final StringListResult copy(String jsonEncodedValue, StringListLookupResultType type) {
        AbstractC4862t.e(type, "type");
        return new StringListResult(jsonEncodedValue, type);
    }

    public boolean equals(Object other) {
        if (!(other instanceof StringListResult)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return MessagesAsyncPigeonUtils.INSTANCE.deepEquals(toList(), ((StringListResult) other).toList());
    }

    public final String getJsonEncodedValue() {
        return this.jsonEncodedValue;
    }

    public final StringListLookupResultType getType() {
        return this.type;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return C4206t.n(this.jsonEncodedValue, this.type);
    }

    public String toString() {
        return "StringListResult(jsonEncodedValue=" + this.jsonEncodedValue + ", type=" + this.type + ")";
    }

    public /* synthetic */ StringListResult(String str, StringListLookupResultType stringListLookupResultType, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : str, stringListLookupResultType);
    }
}
