package io.sentry.android.core;

import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryEvent;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.cache.EnvelopeCache;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeEventCollector {
    private static final String NATIVE_PLATFORM = "native";
    private static final long TIMESTAMP_TOLERANCE_MS = 5000;
    private final SentryAndroidOptions options;
    private final List<NativeEnvelopeMetadata> nativeEnvelopes = new ArrayList();
    private boolean collected = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ItemHeaderInfo {
        final int length;
        final String type;

        public ItemHeaderInfo(String str, int i10) {
            this.type = str;
            this.length = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NativeEnvelopeMetadata {
        private final File file;
        private final long timestampMs;

        public NativeEnvelopeMetadata(File file, long j10) {
            this.file = file;
            this.timestampMs = j10;
        }

        public File getFile() {
            return this.file;
        }

        public long getTimestampMs() {
            return this.timestampMs;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NativeEventData {
        private final SentryEnvelope envelope;
        private final SentryEvent event;
        private final File file;

        public NativeEventData(SentryEvent sentryEvent, File file, SentryEnvelope sentryEnvelope) {
            this.event = sentryEvent;
            this.file = file;
            this.envelope = sentryEnvelope;
        }

        public SentryEnvelope getEnvelope() {
            return this.envelope;
        }

        public SentryEvent getEvent() {
            return this.event;
        }

        public File getFile() {
            return this.file;
        }
    }

    public NativeEventCollector(SentryAndroidOptions sentryAndroidOptions) {
        this.options = sentryAndroidOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:5:0x000d, B:6:0x0017, B:8:0x001f, B:21:0x0054, B:13:0x0032, B:15:0x003a, B:18:0x0041, B:20:0x0049, B:24:0x005b, B:27:0x0065), top: B:54:0x000d, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private io.sentry.android.core.NativeEventCollector.NativeEnvelopeMetadata extractMetadataFromEventPayload(java.io.InputStream r8, int r9, java.io.File r10) {
        /*
            r7 = this;
            r0 = 0
            io.sentry.android.core.NativeEventCollector$BoundedInputStream r1 = new io.sentry.android.core.NativeEventCollector$BoundedInputStream     // Catch: java.lang.Throwable -> L76
            r1.<init>(r8, r9)     // Catch: java.lang.Throwable -> L76
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L78
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L78
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> L78
            io.sentry.JsonObjectReader r9 = new io.sentry.JsonObjectReader     // Catch: java.lang.Throwable -> L3f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L3f
            r9.beginObject()     // Catch: java.lang.Throwable -> L3f
            r2 = r0
            r3 = r2
        L17:
            io.sentry.vendor.gson.stream.JsonToken r4 = r9.peek()     // Catch: java.lang.Throwable -> L3f
            io.sentry.vendor.gson.stream.JsonToken r5 = io.sentry.vendor.gson.stream.JsonToken.NAME     // Catch: java.lang.Throwable -> L3f
            if (r4 != r5) goto L5b
            java.lang.String r4 = r9.nextName()     // Catch: java.lang.Throwable -> L3f
            int r5 = r4.hashCode()     // Catch: java.lang.Throwable -> L3f
            r6 = 55126294(0x3492916, float:5.9115755E-37)
            if (r5 == r6) goto L41
            r6 = 1874684019(0x6fbd6873, float:1.1723788E29)
            if (r5 == r6) goto L32
            goto L54
        L32:
            java.lang.String r5 = "platform"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L54
            java.lang.String r2 = r9.nextStringOrNull()     // Catch: java.lang.Throwable -> L3f
            goto L57
        L3f:
            r9 = move-exception
            goto L7a
        L41:
            java.lang.String r5 = "timestamp"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L54
            io.sentry.android.core.SentryAndroidOptions r3 = r7.options     // Catch: java.lang.Throwable -> L3f
            io.sentry.ILogger r3 = r3.getLogger()     // Catch: java.lang.Throwable -> L3f
            java.util.Date r3 = r9.nextDateOrNull(r3)     // Catch: java.lang.Throwable -> L3f
            goto L57
        L54:
            r9.skipValue()     // Catch: java.lang.Throwable -> L3f
        L57:
            if (r2 == 0) goto L17
            if (r3 == 0) goto L17
        L5b:
            java.lang.String r9 = "native"
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L6f
            if (r3 == 0) goto L6f
            io.sentry.android.core.NativeEventCollector$NativeEnvelopeMetadata r9 = new io.sentry.android.core.NativeEventCollector$NativeEnvelopeMetadata     // Catch: java.lang.Throwable -> L3f
            long r2 = r3.getTime()     // Catch: java.lang.Throwable -> L3f
            r9.<init>(r10, r2)     // Catch: java.lang.Throwable -> L3f
            r0 = r9
        L6f:
            r8.close()     // Catch: java.lang.Throwable -> L78
            r1.close()     // Catch: java.lang.Throwable -> L76
            return r0
        L76:
            r8 = move-exception
            goto L8c
        L78:
            r8 = move-exception
            goto L83
        L7a:
            r8.close()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch: java.lang.Throwable -> L78
        L82:
            throw r9     // Catch: java.lang.Throwable -> L78
        L83:
            r1.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L76
        L8b:
            throw r8     // Catch: java.lang.Throwable -> L76
        L8c:
            io.sentry.android.core.SentryAndroidOptions r7 = r7.options
            io.sentry.ILogger r7 = r7.getLogger()
            io.sentry.SentryLevel r9 = io.sentry.SentryLevel.DEBUG
            java.lang.String r10 = r10.getName()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r1 = "Error parsing event JSON from: %s"
            r7.log(r9, r8, r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.NativeEventCollector.extractMetadataFromEventPayload(java.io.InputStream, int, java.io.File):io.sentry.android.core.NativeEventCollector$NativeEnvelopeMetadata");
    }

    private NativeEnvelopeMetadata extractNativeEnvelopeMetadata(File file) {
        BufferedInputStream bufferedInputStream;
        int iSkipLine;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                iSkipLine = skipLine(bufferedInputStream);
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
        }
        if (iSkipLine < 0) {
            bufferedInputStream.close();
            return null;
        }
        long j10 = iSkipLine;
        while (j10 < 209715200) {
            String line = readLine(bufferedInputStream);
            if (line != null && !line.isEmpty()) {
                long length = j10 + ((long) (line.length() + 1));
                ItemHeaderInfo itemHeader = parseItemHeader(line);
                if (itemHeader == null) {
                    break;
                }
                if ("event".equals(itemHeader.type)) {
                    NativeEnvelopeMetadata nativeEnvelopeMetadataExtractMetadataFromEventPayload = extractMetadataFromEventPayload(bufferedInputStream, itemHeader.length, file);
                    if (nativeEnvelopeMetadataExtractMetadataFromEventPayload != null) {
                        bufferedInputStream.close();
                        return nativeEnvelopeMetadataExtractMetadataFromEventPayload;
                    }
                } else {
                    skipBytes(bufferedInputStream, itemHeader.length);
                }
                long j11 = length + ((long) itemHeader.length);
                int i10 = bufferedInputStream.read();
                if (i10 == -1) {
                    break;
                }
                j10 = j11 + 1;
                if (i10 != 10) {
                    break;
                }
            } else {
                break;
            }
        }
        bufferedInputStream.close();
        return null;
        this.options.getLogger().log(SentryLevel.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
        return null;
    }

    private boolean isRelevantFileName(String str) {
        return (str == null || str.startsWith(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE) || str.startsWith(EnvelopeCache.PREFIX_PREVIOUS_SESSION_FILE) || str.startsWith(EnvelopeCache.STARTUP_CRASH_MARKER_FILE)) ? false : true;
    }

    private NativeEventData loadFullNativeEventData(File file) {
        BufferedInputStream bufferedInputStream;
        SentryEnvelope sentryEnvelope;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                sentryEnvelope = this.options.getEnvelopeReader().read(bufferedInputStream);
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, th, "Error loading envelope file: %s", file.getAbsolutePath());
        }
        if (sentryEnvelope == null) {
            bufferedInputStream.close();
            return null;
        }
        for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            if (SentryItemType.Event.equals(sentryEnvelopeItem.getHeader().getType())) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.getData()), StandardCharsets.UTF_8));
                try {
                    SentryEvent sentryEvent = (SentryEvent) this.options.getSerializer().deserialize(bufferedReader, SentryEvent.class);
                    if (sentryEvent != null && "native".equals(sentryEvent.getPlatform())) {
                        NativeEventData nativeEventData = new NativeEventData(sentryEvent, file, sentryEnvelope);
                        bufferedReader.close();
                        bufferedInputStream.close();
                        return nativeEventData;
                    }
                    bufferedReader.close();
                } finally {
                }
            }
        }
        bufferedInputStream.close();
        return null;
        this.options.getLogger().log(SentryLevel.DEBUG, th, "Error loading envelope file: %s", file.getAbsolutePath());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0011, B:5:0x001b, B:7:0x0023, B:20:0x0052, B:12:0x0036, B:14:0x003e, B:17:0x0045, B:19:0x004d, B:24:0x005b), top: B:38:0x0011, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private io.sentry.android.core.NativeEventCollector.ItemHeaderInfo parseItemHeader(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L64
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L64
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L64
            byte[] r8 = r8.getBytes(r3)     // Catch: java.lang.Throwable -> L64
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L64
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L64
            io.sentry.JsonObjectReader r8 = new io.sentry.JsonObjectReader     // Catch: java.lang.Throwable -> L43
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L43
            r8.beginObject()     // Catch: java.lang.Throwable -> L43
            r2 = -1
            r3 = r0
        L1b:
            io.sentry.vendor.gson.stream.JsonToken r4 = r8.peek()     // Catch: java.lang.Throwable -> L43
            io.sentry.vendor.gson.stream.JsonToken r5 = io.sentry.vendor.gson.stream.JsonToken.NAME     // Catch: java.lang.Throwable -> L43
            if (r4 != r5) goto L59
            java.lang.String r4 = r8.nextName()     // Catch: java.lang.Throwable -> L43
            int r5 = r4.hashCode()     // Catch: java.lang.Throwable -> L43
            r6 = -1106363674(0xffffffffbe0e3ae6, float:-0.13889655)
            if (r5 == r6) goto L45
            r6 = 3575610(0x368f3a, float:5.010497E-39)
            if (r5 == r6) goto L36
            goto L52
        L36:
            java.lang.String r5 = "type"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L52
            java.lang.String r3 = r8.nextStringOrNull()     // Catch: java.lang.Throwable -> L43
            goto L55
        L43:
            r8 = move-exception
            goto L6a
        L45:
            java.lang.String r5 = "length"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L52
            int r2 = r8.nextInt()     // Catch: java.lang.Throwable -> L43
            goto L55
        L52:
            r8.skipValue()     // Catch: java.lang.Throwable -> L43
        L55:
            if (r3 == 0) goto L1b
            if (r2 < 0) goto L1b
        L59:
            if (r2 < 0) goto L66
            io.sentry.android.core.NativeEventCollector$ItemHeaderInfo r8 = new io.sentry.android.core.NativeEventCollector$ItemHeaderInfo     // Catch: java.lang.Throwable -> L43
            r8.<init>(r3, r2)     // Catch: java.lang.Throwable -> L43
            r1.close()     // Catch: java.lang.Throwable -> L64
            return r8
        L64:
            r8 = move-exception
            goto L73
        L66:
            r1.close()     // Catch: java.lang.Throwable -> L64
            goto L83
        L6a:
            r1.close()     // Catch: java.lang.Throwable -> L6e
            goto L72
        L6e:
            r1 = move-exception
            r8.addSuppressed(r1)     // Catch: java.lang.Throwable -> L64
        L72:
            throw r8     // Catch: java.lang.Throwable -> L64
        L73:
            io.sentry.android.core.SentryAndroidOptions r7 = r7.options
            io.sentry.ILogger r7 = r7.getLogger()
            io.sentry.SentryLevel r1 = io.sentry.SentryLevel.DEBUG
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Error parsing item header"
            r7.log(r1, r8, r3, r2)
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.NativeEventCollector.parseItemHeader(java.lang.String):io.sentry.android.core.NativeEventCollector$ItemHeaderInfo");
    }

    private String readLine(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = inputStream.read();
            if (i10 == -1) {
                if (sb2.length() > 0) {
                    return sb2.toString();
                }
                return null;
            }
            if (i10 == 10) {
                return sb2.toString();
            }
            sb2.append((char) i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void skipBytes(InputStream inputStream, long j10) throws IOException {
        while (j10 > 0) {
            long jSkip = inputStream.skip(j10);
            if (jSkip != 0) {
                j10 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j10--;
            }
        }
    }

    private int skipLine(InputStream inputStream) throws IOException {
        int i10;
        int i11 = 0;
        do {
            i10 = inputStream.read();
            if (i10 == -1) {
                if (i11 > 0) {
                    return i11;
                }
                return -1;
            }
            i11++;
        } while (i10 != 10);
        return i11;
    }

    public void collect() {
        NativeEnvelopeMetadata nativeEnvelopeMetadataExtractNativeEnvelopeMetadata;
        if (this.collected) {
            return;
        }
        this.collected = true;
        String outboxPath = this.options.getOutboxPath();
        if (outboxPath == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
            return;
        }
        File[] fileArrListFiles = new File(outboxPath).listFiles();
        if (fileArrListFiles == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
            return;
        }
        if (fileArrListFiles.length == 0) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No envelope files found in outbox.", new Object[0]);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(fileArrListFiles.length));
        for (File file : fileArrListFiles) {
            if (file.isFile() && isRelevantFileName(file.getName()) && (nativeEnvelopeMetadataExtractNativeEnvelopeMetadata = extractNativeEnvelopeMetadata(file)) != null) {
                this.nativeEnvelopes.add(nativeEnvelopeMetadataExtractNativeEnvelopeMetadata);
                this.options.getLogger().log(SentryLevel.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(nativeEnvelopeMetadataExtractNativeEnvelopeMetadata.getTimestampMs()));
            }
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(this.nativeEnvelopes.size()));
    }

    public boolean deleteNativeEventFile(NativeEventData nativeEventData) {
        File file = nativeEventData.getFile();
        try {
            if (file.delete()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Deleted native event file from outbox: %s", file.getName());
                return true;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to delete native event file: %s", file.getAbsolutePath());
            return false;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Error deleting native event file: %s", file.getAbsolutePath());
            return false;
        }
    }

    public NativeEventData findAndRemoveMatchingNativeEvent(long j10) {
        collect();
        for (NativeEnvelopeMetadata nativeEnvelopeMetadata : this.nativeEnvelopes) {
            long jAbs = Math.abs(j10 - nativeEnvelopeMetadata.getTimestampMs());
            if (jAbs <= TIMESTAMP_TOLERANCE_MS) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(jAbs));
                this.nativeEnvelopes.remove(nativeEnvelopeMetadata);
                return loadFullNativeEventData(nativeEnvelopeMetadata.getFile());
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class BoundedInputStream extends InputStream {
        private final InputStream inner;
        private long remaining;

        public BoundedInputStream(InputStream inputStream, int i10) {
            this.inner = inputStream;
            this.remaining = i10;
        }

        @Override // java.io.InputStream
        public int available() {
            return Math.min(this.inner.available(), (int) this.remaining);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            NativeEventCollector.skipBytes(this.inner, this.remaining);
            this.remaining = 0L;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.remaining <= 0) {
                return -1;
            }
            int i10 = this.inner.read();
            if (i10 != -1) {
                this.remaining--;
            }
            return i10;
        }

        @Override // java.io.InputStream
        public long skip(long j10) throws IOException {
            long jSkip = this.inner.skip(Math.min(j10, this.remaining));
            this.remaining -= jSkip;
            return jSkip;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            long j10 = this.remaining;
            if (j10 <= 0) {
                return -1;
            }
            int i12 = this.inner.read(bArr, i10, Math.min(i11, (int) j10));
            if (i12 > 0) {
                this.remaining -= (long) i12;
            }
            return i12;
        }
    }
}
