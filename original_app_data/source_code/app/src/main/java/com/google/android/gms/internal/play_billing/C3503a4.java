package com.google.android.gms.internal.play_billing;

import io.flutter.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3503a4 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q2 f30125a = new C3503a4();

    @Override // com.google.android.gms.internal.play_billing.Q2
    public final boolean o(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                switch (i10) {
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case Build.API_LEVELS.API_30 /* 30 */:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
