package Uc;

import java.util.EnumMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f16962a;

    public y(EnumMap defaultQualifiers) {
        AbstractC4862t.e(defaultQualifiers, "defaultQualifiers");
        this.f16962a = defaultQualifiers;
    }

    public final r a(EnumC2300b enumC2300b) {
        return (r) this.f16962a.get(enumC2300b);
    }

    public final EnumMap b() {
        return this.f16962a;
    }
}
