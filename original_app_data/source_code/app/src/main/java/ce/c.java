package ce;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26579a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List missingFields, String str, Throwable th) {
        super(str, th);
        AbstractC4862t.e(missingFields, "missingFields");
        this.f26579a = missingFields;
    }

    public final List a() {
        return this.f26579a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(List missingFields, String serialName) {
        String str;
        AbstractC4862t.e(missingFields, "missingFields");
        AbstractC4862t.e(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + ((String) missingFields.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }
}
