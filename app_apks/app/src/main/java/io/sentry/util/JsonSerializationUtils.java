package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.ISerializer;
import io.sentry.JsonSerializable;
import io.sentry.SentryLevel;
import io.sentry.metrics.MetricsUnit;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonSerializationUtils {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ByteCountingWriter extends Writer {
        private long byteCount;

        private ByteCountingWriter() {
            this.byteCount = 0L;
        }

        private static int utf8ByteCount(char c10) {
            if (c10 <= 127) {
                return 1;
            }
            return (c10 > 2047 && !Character.isSurrogate(c10)) ? 3 : 2;
        }

        public long getByteCount() {
            return this.byteCount;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                this.byteCount += (long) utf8ByteCount(cArr[i12]);
            }
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.byteCount += (long) utf8ByteCount((char) i10);
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                this.byteCount += (long) utf8ByteCount(str.charAt(i12));
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public static List<Object> atomicIntegerArrayToList(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
        }
        return arrayList;
    }

    public static long byteSizeOf(ISerializer iSerializer, ILogger iLogger, JsonSerializable jsonSerializable) {
        if (jsonSerializable == null) {
            return 0L;
        }
        try {
            ByteCountingWriter byteCountingWriter = new ByteCountingWriter();
            iSerializer.serialize(jsonSerializable, byteCountingWriter);
            return byteCountingWriter.getByteCount();
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Could not calculate size of serializable", th);
            return 0L;
        }
    }

    public static byte[] bytesFrom(ISerializer iSerializer, ILogger iLogger, JsonSerializable jsonSerializable) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                try {
                    iSerializer.serialize(jsonSerializable, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Could not serialize serializable", th);
            return null;
        }
    }

    public static Map<String, Object> calendarToMap(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put(MetricsUnit.Duration.MINUTE, Integer.valueOf(calendar.get(12)));
        map.put(MetricsUnit.Duration.SECOND, Integer.valueOf(calendar.get(13)));
        return map;
    }
}
