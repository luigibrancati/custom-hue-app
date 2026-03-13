package Lc;

import fc.AbstractC4040w;
import gc.C4205s;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Lc.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C1197z extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd.f f8791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gd.k f8792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1197z(kd.f underlyingPropertyName, Gd.k underlyingType) {
        super(null);
        AbstractC4862t.e(underlyingPropertyName, "underlyingPropertyName");
        AbstractC4862t.e(underlyingType, "underlyingType");
        this.f8791a = underlyingPropertyName;
        this.f8792b = underlyingType;
    }

    @Override // Lc.h0
    public List a() {
        return C4205s.d(AbstractC4040w.a(this.f8791a, this.f8792b));
    }

    public final kd.f c() {
        return this.f8791a;
    }

    public final Gd.k d() {
        return this.f8792b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f8791a + ", underlyingType=" + this.f8792b + ')';
    }
}
