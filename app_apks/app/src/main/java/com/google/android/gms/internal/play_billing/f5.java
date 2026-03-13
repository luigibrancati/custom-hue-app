package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f5 extends c5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g5 f30168h;

    public f5(g5 g5Var) {
        this.f30168h = g5Var;
    }

    @Override // com.google.android.gms.internal.play_billing.c5
    public final String c() {
        d5 d5Var = (d5) this.f30168h.f30175a.get();
        if (d5Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(d5Var.f30150a) + "]";
    }
}
