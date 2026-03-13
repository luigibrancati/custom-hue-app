package u6;

import android.app.Dialog;
import java.util.Objects;

/* JADX INFO: renamed from: u6.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5951d0 extends AbstractC5926H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f45150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RunnableC5953e0 f45151b;

    public C5951d0(RunnableC5953e0 runnableC5953e0, Dialog dialog) {
        this.f45150a = dialog;
        Objects.requireNonNull(runnableC5953e0);
        this.f45151b = runnableC5953e0;
    }

    @Override // u6.AbstractC5926H
    public final void a() {
        this.f45151b.f45173b.r();
        Dialog dialog = this.f45150a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
