package Lc;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class H extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(List underlyingPropertyNamesToTypes) {
        super(null);
        AbstractC4862t.e(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f8718a = underlyingPropertyNamesToTypes;
        Map mapS = gc.Q.s(a());
        if (mapS.size() != a().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f8719b = mapS;
    }

    @Override // Lc.h0
    public List a() {
        return this.f8718a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + a() + ')';
    }
}
