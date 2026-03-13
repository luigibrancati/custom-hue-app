package io.sentry;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class IpAddressUtils {
    public static final String DEFAULT_IP_ADDRESS = "{{auto}}";
    private static final List<String> DEFAULT_IP_ADDRESS_VALID_VALUES = Arrays.asList(DEFAULT_IP_ADDRESS, "{{ auto }}");

    private IpAddressUtils() {
    }

    public static boolean isDefault(String str) {
        return str != null && DEFAULT_IP_ADDRESS_VALID_VALUES.contains(str);
    }
}
