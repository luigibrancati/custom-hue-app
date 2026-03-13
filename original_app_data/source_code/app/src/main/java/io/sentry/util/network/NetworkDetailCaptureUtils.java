package io.sentry.util.network;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NetworkDetailCaptureUtils {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface NetworkBodyExtractor<T> {
        NetworkBody extract(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface NetworkHeaderExtractor<T> {
        Map<String, String> extract(T t10);
    }

    private NetworkDetailCaptureUtils() {
    }

    public static <T> ReplayNetworkRequestOrResponse createRequest(T t10, Long l10, boolean z10, NetworkBodyExtractor<T> networkBodyExtractor, List<String> list, NetworkHeaderExtractor<T> networkHeaderExtractor) {
        return createRequestOrResponseInternal(t10, l10, z10, networkBodyExtractor, list, networkHeaderExtractor);
    }

    private static <T> ReplayNetworkRequestOrResponse createRequestOrResponseInternal(T t10, Long l10, boolean z10, NetworkBodyExtractor<T> networkBodyExtractor, List<String> list, NetworkHeaderExtractor<T> networkHeaderExtractor) {
        return new ReplayNetworkRequestOrResponse(l10, z10 ? networkBodyExtractor.extract(t10) : null, getCaptureHeaders(networkHeaderExtractor.extract(t10), list));
    }

    public static <T> ReplayNetworkRequestOrResponse createResponse(T t10, Long l10, boolean z10, NetworkBodyExtractor<T> networkBodyExtractor, List<String> list, NetworkHeaderExtractor<T> networkHeaderExtractor) {
        return createRequestOrResponseInternal(t10, l10, z10, networkBodyExtractor, list, networkHeaderExtractor);
    }

    public static Map<String, String> getCaptureHeaders(Map<String, String> map, List<String> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            HashSet hashSet = new HashSet();
            for (String str : list) {
                if (str != null) {
                    hashSet.add(str.toLowerCase(Locale.ROOT));
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (hashSet.contains(entry.getKey().toLowerCase(Locale.ROOT))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    public static NetworkRequestData initializeForUrl(String str, String str2, List<String> list, List<String> list2) {
        if (shouldCaptureUrl(str, list, list2)) {
            return new NetworkRequestData(str2);
        }
        return null;
    }

    private static boolean shouldCaptureUrl(String str, List<String> list, List<String> list2) {
        if (list2 != null) {
            for (String str2 : list2) {
                if (str2 != null && str.matches(str2)) {
                    return false;
                }
            }
        }
        if (list == null) {
            return false;
        }
        for (String str3 : list) {
            if (str3 != null && str.matches(str3)) {
                return true;
            }
        }
        return false;
    }
}
