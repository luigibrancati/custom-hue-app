package io.sentry.android.replay.util;

import android.os.Build;
import fc.C4032o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/util/SystemProperties;", "", "()V", "get", "", "key", "Lio/sentry/android/replay/util/SystemProperties$Property;", "defaultValue", "Property", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SystemProperties {
    public static final int $stable = 0;
    public static final SystemProperties INSTANCE = new SystemProperties();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/sentry/android/replay/util/SystemProperties$Property;", "", "(Ljava/lang/String;I)V", "SOC_MODEL", "SOC_MANUFACTURER", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Property {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ Property[] $VALUES;
        public static final Property SOC_MODEL = new Property("SOC_MODEL", 0);
        public static final Property SOC_MANUFACTURER = new Property("SOC_MANUFACTURER", 1);

        private static final /* synthetic */ Property[] $values() {
            return new Property[]{SOC_MODEL, SOC_MANUFACTURER};
        }

        static {
            Property[] propertyArr$values = $values();
            $VALUES = propertyArr$values;
            $ENTRIES = AbstractC5277b.a(propertyArr$values);
        }

        private Property(String str, int i10) {
        }

        public static InterfaceC5276a getEntries() {
            return $ENTRIES;
        }

        public static Property valueOf(String str) {
            return (Property) Enum.valueOf(Property.class, str);
        }

        public static Property[] values() {
            return (Property[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Property.values().length];
            try {
                iArr[Property.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Property.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SystemProperties() {
    }

    public static /* synthetic */ String get$default(SystemProperties systemProperties, Property property, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return systemProperties.get(property, str);
    }

    public final String get(Property key, String defaultValue) {
        String str;
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(defaultValue, "defaultValue");
        int i10 = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
        if (i10 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i10 != 2) {
                throw new C4032o();
            }
            str = Build.SOC_MANUFACTURER;
        }
        AbstractC4862t.b(str);
        return str;
    }
}
