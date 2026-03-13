package y7;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: y7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6444a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f48494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f48495b;

    static {
        HashMap map = new HashMap();
        f48494a = map;
        HashMap map2 = new HashMap();
        f48495b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i10) {
        Map map = f48494a;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f48495b.get(numValueOf)) + ")";
    }
}
