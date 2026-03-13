package io.sentry;

import java.io.StringReader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EnvelopeReader implements IEnvelopeReader {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final ISerializer serializer;

    public EnvelopeReader(ISerializer iSerializer) {
        this.serializer = iSerializer;
    }

    private SentryEnvelopeHeader deserializeEnvelopeHeader(byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, UTF_8));
        try {
            SentryEnvelopeHeader sentryEnvelopeHeader = (SentryEnvelopeHeader) this.serializer.deserialize(stringReader, SentryEnvelopeHeader.class);
            stringReader.close();
            return sentryEnvelopeHeader;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SentryEnvelopeItemHeader deserializeEnvelopeItemHeader(byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, UTF_8));
        try {
            SentryEnvelopeItemHeader sentryEnvelopeItemHeader = (SentryEnvelopeItemHeader) this.serializer.deserialize(stringReader, SentryEnvelopeItemHeader.class);
            stringReader.close();
            return sentryEnvelopeItemHeader;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        r10 = new io.sentry.SentryEnvelope(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        return r10;
     */
    @Override // io.sentry.IEnvelopeReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.SentryEnvelope read(java.io.InputStream r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.EnvelopeReader.read(java.io.InputStream):io.sentry.SentryEnvelope");
    }
}
