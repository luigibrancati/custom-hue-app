package io.sentry;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface MeasurementUnit {
    public static final String NONE = "none";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Custom implements MeasurementUnit {
        private final String name;

        public Custom(String str) {
            this.name = str;
        }

        @Override // io.sentry.MeasurementUnit
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }

        @Override // io.sentry.MeasurementUnit
        public String name() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Duration implements MeasurementUnit {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        @Override // io.sentry.MeasurementUnit
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Fraction implements MeasurementUnit {
        RATIO,
        PERCENT;

        @Override // io.sentry.MeasurementUnit
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Information implements MeasurementUnit {
        BIT,
        BYTE,
        KILOBYTE,
        KIBIBYTE,
        MEGABYTE,
        MEBIBYTE,
        GIGABYTE,
        GIBIBYTE,
        TERABYTE,
        TEBIBYTE,
        PETABYTE,
        PEBIBYTE,
        EXABYTE,
        EXBIBYTE;

        @Override // io.sentry.MeasurementUnit
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    String apiName();

    String name();
}
