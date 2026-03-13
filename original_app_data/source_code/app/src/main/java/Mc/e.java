package Mc;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(0 == true ? 1 : 0, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    private final String renderName;

    e(String str) {
        this.renderName = str == null ? Kd.a.f(name()) : str;
    }

    public final String b() {
        return this.renderName;
    }

    /* synthetic */ e(String str, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : str);
    }
}
