package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3612t0 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final AbstractC3559k0 zzp;
    private final int zzr;

    static {
        C3553j0 c3553j0 = new C3553j0();
        for (EnumC3612t0 enumC3612t0 : values()) {
            c3553j0.a(Integer.valueOf(enumC3612t0.zzr), enumC3612t0);
        }
        zzp = c3553j0.b();
    }

    EnumC3612t0(int i10) {
        this.zzr = i10;
    }

    public static EnumC3612t0 a(int i10) {
        AbstractC3559k0 abstractC3559k0 = zzp;
        Integer numValueOf = Integer.valueOf(i10);
        return !abstractC3559k0.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC3612t0) abstractC3559k0.get(numValueOf);
    }
}
