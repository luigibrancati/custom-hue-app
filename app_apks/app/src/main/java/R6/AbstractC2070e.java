package R6;

import t6.AbstractC5845c;

/* JADX INFO: renamed from: R6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2070e extends AbstractC5845c {
    public static String a(int i10) {
        switch (i10) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case 1003:
            default:
                return AbstractC5845c.a(i10);
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
        }
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return i10;
        }
        if (i10 < 1000 || i10 >= 1006) {
            return 13;
        }
        return i10;
    }
}
