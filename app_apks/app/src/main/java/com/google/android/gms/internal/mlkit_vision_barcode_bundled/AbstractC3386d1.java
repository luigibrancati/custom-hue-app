package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3386d1 extends AbstractC3381c1 implements K1 {
    public AbstractC3386d1(AbstractC3391e1 abstractC3391e1) {
        super(abstractC3391e1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3381c1
    public final void q() {
        super.q();
        if (((AbstractC3391e1) this.f29840b).zzb != X0.d()) {
            AbstractC3391e1 abstractC3391e1 = (AbstractC3391e1) this.f29840b;
            abstractC3391e1.zzb = abstractC3391e1.zzb.clone();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3381c1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC3391e1 h() {
        if (!((AbstractC3391e1) this.f29840b).F()) {
            return (AbstractC3391e1) this.f29840b;
        }
        ((AbstractC3391e1) this.f29840b).zzb.g();
        return (AbstractC3391e1) super.h();
    }
}
