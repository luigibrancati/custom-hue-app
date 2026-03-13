package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f30150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g5 f30151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i5 f30152c = i5.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30153d;

    public final void a() {
        this.f30150a = null;
        this.f30151b = null;
        this.f30152c.e(null);
    }

    public final boolean b(Object obj) {
        this.f30153d = true;
        g5 g5Var = this.f30151b;
        boolean z10 = g5Var != null && g5Var.c(obj);
        if (z10) {
            this.f30150a = null;
            this.f30151b = null;
            this.f30152c = null;
        }
        return z10;
    }

    public final void finalize() {
        i5 i5Var;
        g5 g5Var = this.f30151b;
        if (g5Var != null && !g5Var.isDone()) {
            g5Var.d(new e5("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f30150a))));
        }
        if (this.f30153d || (i5Var = this.f30152c) == null) {
            return;
        }
        i5Var.e(null);
    }
}
