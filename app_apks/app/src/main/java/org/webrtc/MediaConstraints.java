package org.webrtc;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class MediaConstraints {
    public final List<KeyValuePair> mandatory = new ArrayList();
    public final List<KeyValuePair> optional = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class KeyValuePair {
        private final String key;
        private final String value;

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                KeyValuePair keyValuePair = (KeyValuePair) obj;
                if (this.key.equals(keyValuePair.key) && this.value.equals(keyValuePair.value)) {
                    return true;
                }
            }
            return false;
        }

        @CalledByNative("KeyValuePair")
        public String getKey() {
            return this.key;
        }

        @CalledByNative("KeyValuePair")
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.key.hashCode() + this.value.hashCode();
        }

        public String toString() {
            return this.key + ": " + this.value;
        }
    }

    private static String stringifyKeyValuePairList(List<KeyValuePair> list) {
        StringBuilder sb2 = new StringBuilder("[");
        for (KeyValuePair keyValuePair : list) {
            if (sb2.length() > 1) {
                sb2.append(", ");
            }
            sb2.append(keyValuePair.toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @CalledByNative
    public List<KeyValuePair> getMandatory() {
        return this.mandatory;
    }

    @CalledByNative
    public List<KeyValuePair> getOptional() {
        return this.optional;
    }

    public String toString() {
        return "mandatory: " + stringifyKeyValuePairList(this.mandatory) + ", optional: " + stringifyKeyValuePairList(this.optional);
    }
}
