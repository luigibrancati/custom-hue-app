package X6;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f18152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f18153b;

    public A4(R4 r42, A a10) {
        this.f18152a = a10;
        Objects.requireNonNull(r42);
        this.f18153b = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R4 r42 = this.f18153b;
        C2416j3 c2416j3 = r42.f18400a;
        N2 n2X = c2416j3.x();
        C2416j3 c2416j32 = n2X.f18400a;
        n2X.h();
        A aU = n2X.u();
        A a10 = this.f18152a;
        if (!S3.u(a10.b(), aU.b())) {
            c2416j3.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(a10.b()));
            return;
        }
        SharedPreferences.Editor editorEdit = n2X.p().edit();
        editorEdit.putString("dma_consent_settings", a10.e());
        editorEdit.apply();
        c2416j3.a().w().b("Setting DMA consent(FE)", a10);
        C2416j3 c2416j33 = r42.f18400a;
        if (c2416j33.J().D()) {
            c2416j33.J().a0();
        } else {
            c2416j33.J().Y(false);
        }
    }
}
