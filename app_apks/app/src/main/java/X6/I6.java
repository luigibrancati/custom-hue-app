package X6;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I6 extends AbstractC2539z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R6 f18361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I6(R6 r62, N3 n32) {
        super(n32);
        Objects.requireNonNull(r62);
        this.f18361e = r62;
    }

    @Override // X6.AbstractC2539z
    public final void a() {
        R6 r62 = this.f18361e;
        r62.b().h();
        String str = (String) r62.y0().pollFirst();
        if (str != null) {
            r62.z0(r62.e().c());
            r62.a().w().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            R6.W(r62.d(), intent);
        }
        r62.v0();
    }
}
