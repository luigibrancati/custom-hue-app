package X9;

import N6.AbstractC1304eb;
import N6.Sa;
import R9.AbstractC2107e;
import R9.C2111i;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends AbstractC2107e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2111i f19398b;

    public i(C2111i c2111i) {
        this.f19398b = c2111i;
    }

    @Override // R9.AbstractC2107e
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        T9.b bVar = (T9.b) obj;
        Context contextB = this.f19398b.b();
        Sa saB = AbstractC1304eb.b(b.d());
        return new l(this.f19398b, bVar, (o.c(contextB) || com.google.android.gms.common.a.f().a(contextB) >= 204500000) ? new o(contextB, bVar, saB) : new q(contextB, bVar, saB), saB);
    }
}
