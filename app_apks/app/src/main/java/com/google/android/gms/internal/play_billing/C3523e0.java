package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3523e0 extends AbstractC3647z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3541h0 f30154c;

    public C3523e0(AbstractC3541h0 abstractC3541h0, int i10) {
        super(abstractC3541h0.size(), i10);
        this.f30154c = abstractC3541h0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3647z
    public final Object a(int i10) {
        return this.f30154c.get(i10);
    }
}
