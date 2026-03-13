package org.apache.tika.parser.digest;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.BoundedInputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class InputStreamDigester implements DigestingParser.Digester {
    private final String algorithm;
    private final String algorithmKeyName;
    private final DigestingParser.Encoder encoder;
    private final int markLimit;

    public InputStreamDigester(int i10, String str, DigestingParser.Encoder encoder) {
        this(i10, str, str, encoder);
    }

    private void digestFile(File file, long j10, Metadata metadata) throws IOException {
        if (StringUtils.isBlank(metadata.get(HttpHeaders.CONTENT_LENGTH))) {
            if (j10 < 0) {
                j10 = file.length();
            }
            setContentLength(j10, metadata);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            digestStream(fileInputStream, metadata);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private boolean digestStream(InputStream inputStream, Metadata metadata) throws IOException {
        MessageDigest messageDigestNewMessageDigest = newMessageDigest();
        updateDigest(messageDigestNewMessageDigest, inputStream, metadata);
        byte[] bArrDigest = messageDigestNewMessageDigest.digest();
        if ((inputStream instanceof BoundedInputStream) && ((BoundedInputStream) inputStream).hasHitBound()) {
            return false;
        }
        metadata.set(getMetadataKey(), this.encoder.encode(bArrDigest));
        return true;
    }

    private String getMetadataKey() {
        return "X-TIKA:digest:" + this.algorithmKeyName;
    }

    private MessageDigest newMessageDigest() {
        try {
            Provider provider = getProvider();
            return provider == null ? MessageDigest.getInstance(this.algorithm) : MessageDigest.getInstance(this.algorithm, provider);
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private static void setContentLength(long j10, Metadata metadata) {
        if (StringUtils.isBlank(metadata.get(HttpHeaders.CONTENT_LENGTH))) {
            metadata.set(HttpHeaders.CONTENT_LENGTH, Long.toString(j10));
        }
    }

    private static MessageDigest updateDigest(MessageDigest messageDigest, InputStream inputStream, Metadata metadata) throws IOException {
        byte[] bArr = new byte[RecognitionOptions.UPC_E];
        int i10 = inputStream.read(bArr, 0, RecognitionOptions.UPC_E);
        long j10 = 0;
        while (i10 > -1) {
            messageDigest.update(bArr, 0, i10);
            j10 += (long) i10;
            i10 = inputStream.read(bArr, 0, RecognitionOptions.UPC_E);
        }
        setContentLength(j10, metadata);
        return messageDigest;
    }

    @Override // org.apache.tika.parser.DigestingParser.Digester
    public void digest(InputStream inputStream, Metadata metadata, ParseContext parseContext) throws IOException {
        TikaInputStream tikaInputStreamCast = TikaInputStream.cast(inputStream);
        if (tikaInputStreamCast != null && tikaInputStreamCast.hasFile()) {
            long length = tikaInputStreamCast.hasFile() ? tikaInputStreamCast.getLength() : -1L;
            if (length > this.markLimit) {
                digestFile(tikaInputStreamCast.getFile(), length, metadata);
                return;
            }
        }
        BoundedInputStream boundedInputStream = new BoundedInputStream(this.markLimit, inputStream);
        boundedInputStream.mark(this.markLimit + 1);
        boolean zDigestStream = digestStream(boundedInputStream, metadata);
        boundedInputStream.reset();
        if (zDigestStream) {
            return;
        }
        if (tikaInputStreamCast != null) {
            digestFile(tikaInputStreamCast.getFile(), -1L, metadata);
            return;
        }
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            digestFile(TikaInputStream.get(inputStream, temporaryResources, metadata).getFile(), -1L, metadata);
            try {
                temporaryResources.dispose();
            } catch (TikaException e10) {
                throw new IOException(e10);
            }
        } catch (Throwable th) {
            try {
                temporaryResources.dispose();
                throw th;
            } catch (TikaException e11) {
                throw new IOException(e11);
            }
        }
    }

    public Provider getProvider() {
        return null;
    }

    public InputStreamDigester(int i10, String str, String str2, DigestingParser.Encoder encoder) {
        this.algorithm = str;
        this.algorithmKeyName = str2;
        this.encoder = encoder;
        this.markLimit = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException("markLimit must be >= 0");
        }
    }
}
