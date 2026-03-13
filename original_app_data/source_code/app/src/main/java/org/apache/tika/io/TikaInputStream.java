package org.apache.tika.io;

import Ne.f;
import Ne.h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.SentryOptions;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Blob;
import java.sql.SQLException;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TikaInputStream extends f {
    private static final int BLOB_SIZE_THRESHOLD = 1048576;
    private static final int MAX_CONSECUTIVE_EOFS = 1000;
    private int consecutiveEOFs;
    private long length;
    private long mark;
    private Object openContainer;
    private Path path;
    private long position;
    private byte[] skipBuffer;
    private InputStreamFactory streamFactory;
    private String suffix;
    private final TemporaryResources tmp;

    private TikaInputStream(Path path) {
        super(new BufferedInputStream(Files.newInputStream(path, new OpenOption[0])));
        this.position = 0L;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
        this.suffix = null;
        this.path = path;
        this.tmp = new TemporaryResources();
        this.length = Files.size(path);
        this.suffix = FilenameUtils.getSuffixFromPath(path.getFileName().toString());
    }

    public static TikaInputStream cast(InputStream inputStream) {
        if (inputStream instanceof TikaInputStream) {
            return (TikaInputStream) inputStream;
        }
        return null;
    }

    public static TikaInputStream get(InputStream inputStream, TemporaryResources temporaryResources, Metadata metadata) {
        if (inputStream == null) {
            throw new NullPointerException("The Stream must not be null");
        }
        if (inputStream instanceof TikaInputStream) {
            return (TikaInputStream) inputStream;
        }
        return new TikaInputStream(!inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream, temporaryResources, -1L, getExtension(metadata));
    }

    private static String getExtension(Metadata metadata) {
        return metadata == null ? "" : FilenameUtils.getSuffixFromPath(metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY));
    }

    public static boolean isTikaInputStream(InputStream inputStream) {
        return inputStream instanceof TikaInputStream;
    }

    public void addCloseableResource(Closeable closeable) {
        this.tmp.addResource(closeable);
    }

    @Override // Ne.e
    public void afterRead(int i10) throws IOException {
        if (i10 != -1) {
            this.position += (long) i10;
            return;
        }
        int i11 = this.consecutiveEOFs + 1;
        this.consecutiveEOFs = i11;
        if (i11 > 1000) {
            throw new IOException("Read too many -1 (EOFs); there could be an infinite loop.If you think your file is not corrupt, please open an issue on Tika's JIRA");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.path = null;
        this.mark = -1L;
        this.tmp.addResource(((FilterInputStream) this).in);
        this.tmp.close();
    }

    public File getFile() {
        return getPath().toFile();
    }

    public FileChannel getFileChannel() throws IOException {
        FileChannel fileChannelOpen = FileChannel.open(getPath(), new OpenOption[0]);
        this.tmp.addResource(fileChannelOpen);
        return fileChannelOpen;
    }

    public InputStreamFactory getInputStreamFactory() {
        return this.streamFactory;
    }

    public long getLength() {
        if (this.length == -1) {
            getPath();
        }
        return this.length;
    }

    public Object getOpenContainer() {
        return this.openContainer;
    }

    public Path getPath() {
        return getPath(-1);
    }

    public long getPosition() {
        return this.position;
    }

    public boolean hasFile() {
        return this.path != null;
    }

    public boolean hasInputStreamFactory() {
        return this.streamFactory != null;
    }

    public boolean hasLength() {
        return this.length != -1;
    }

    @Override // Ne.e, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        super.mark(i10);
        this.mark = this.position;
    }

    @Override // Ne.e, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public int peek(byte[] bArr) {
        mark(bArr.length);
        int i10 = read(bArr);
        int i11 = 0;
        while (i10 != -1) {
            i11 += i10;
            i10 = i11 < bArr.length ? read(bArr, i11, bArr.length - i11) : -1;
        }
        reset();
        return i11;
    }

    @Override // Ne.e, java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        this.position = this.mark;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
    }

    public void setOpenContainer(Object obj) {
        this.openContainer = obj;
        if (obj instanceof Closeable) {
            this.tmp.addResource((Closeable) obj);
        }
    }

    @Override // Ne.e, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        if (this.skipBuffer == null) {
            this.skipBuffer = new byte[RecognitionOptions.AZTEC];
        }
        long jSkip = IOUtils.skip(((FilterInputStream) this).in, j10, this.skipBuffer);
        this.position += jSkip;
        return jSkip;
    }

    public String toString() {
        String str;
        if (hasFile()) {
            str = "TikaInputStream of " + this.path.toString();
        } else {
            str = "TikaInputStream of " + ((FilterInputStream) this).in.toString();
        }
        Object obj = this.openContainer;
        if (obj == null) {
            return str;
        }
        return str + " (in " + String.valueOf(obj) + ")";
    }

    public Path getPath(int i10) throws IOException {
        Path path = this.path;
        if (path != null) {
            return path;
        }
        if (this.position > 0) {
            throw new IOException("Stream is already being read");
        }
        Path pathCreateTempFile = this.tmp.createTempFile(this.suffix);
        if (i10 > -1) {
            BoundedInputStream boundedInputStream = new BoundedInputStream(i10, this);
            try {
                boundedInputStream.mark(i10);
                try {
                    Files.copy(boundedInputStream, pathCreateTempFile, StandardCopyOption.REPLACE_EXISTING);
                    if (boundedInputStream.hasHitBound()) {
                        boundedInputStream.close();
                        return null;
                    }
                    boundedInputStream.close();
                } finally {
                    boundedInputStream.reset();
                }
            } catch (Throwable th) {
                try {
                    boundedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            Files.copy(this, pathCreateTempFile, StandardCopyOption.REPLACE_EXISTING);
        }
        this.path = pathCreateTempFile;
        InputStream inputStreamNewInputStream = Files.newInputStream(pathCreateTempFile, new OpenOption[0]);
        this.tmp.addResource(inputStreamNewInputStream);
        final InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = new BufferedInputStream(inputStreamNewInputStream) { // from class: org.apache.tika.io.TikaInputStream.1
            @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                inputStream.close();
            }
        };
        this.length = Files.size(this.path);
        this.position = 0L;
        this.mark = -1L;
        return this.path;
    }

    public static TikaInputStream get(InputStream inputStream) {
        return get(inputStream, new TemporaryResources(), (Metadata) null);
    }

    public static TikaInputStream get(byte[] bArr) {
        return get(bArr, new Metadata());
    }

    public static TikaInputStream get(byte[] bArr, Metadata metadata) {
        metadata.set(HttpHeaders.CONTENT_LENGTH, Integer.toString(bArr.length));
        return new TikaInputStream(new h(bArr), new TemporaryResources(), bArr.length, getExtension(metadata));
    }

    private TikaInputStream(Path path, TemporaryResources temporaryResources, long j10) {
        super(new BufferedInputStream(Files.newInputStream(path, new OpenOption[0])));
        this.position = 0L;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
        this.suffix = null;
        this.path = path;
        this.tmp = temporaryResources;
        this.length = j10;
        this.suffix = FilenameUtils.getSuffixFromPath(path.getFileName().toString());
    }

    public static TikaInputStream get(Path path) {
        return get(path, new Metadata());
    }

    public static TikaInputStream get(Path path, Metadata metadata) {
        if (StringUtils.isBlank(metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY))) {
            metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, path.getFileName().toString());
        }
        metadata.set(HttpHeaders.CONTENT_LENGTH, Long.toString(Files.size(path)));
        return new TikaInputStream(path);
    }

    public static TikaInputStream get(Path path, Metadata metadata, TemporaryResources temporaryResources) throws IOException {
        long size = Files.size(path);
        if (StringUtils.isBlank(metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY))) {
            metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, path.getFileName().toString());
        }
        metadata.set(HttpHeaders.CONTENT_LENGTH, Long.toString(size));
        return new TikaInputStream(path, temporaryResources, size);
    }

    @Deprecated
    private TikaInputStream(File file) {
        super(new BufferedInputStream(new FileInputStream(file)));
        this.position = 0L;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
        this.suffix = null;
        this.path = file.toPath();
        this.tmp = new TemporaryResources();
        this.length = file.length();
        this.suffix = FilenameUtils.getSuffixFromPath(this.path.getFileName().toString());
    }

    @Deprecated
    public static TikaInputStream get(File file) {
        return get(file, new Metadata());
    }

    @Deprecated
    public static TikaInputStream get(File file, Metadata metadata) {
        if (StringUtils.isBlank(metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY))) {
            metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, file.getName());
        }
        metadata.set(HttpHeaders.CONTENT_LENGTH, Long.toString(file.length()));
        return new TikaInputStream(file);
    }

    public static TikaInputStream get(InputStreamFactory inputStreamFactory) {
        return get(inputStreamFactory, new TemporaryResources());
    }

    private TikaInputStream(InputStream inputStream, TemporaryResources temporaryResources, long j10, String str) {
        super(inputStream);
        this.position = 0L;
        this.mark = -1L;
        this.consecutiveEOFs = 0;
        this.path = null;
        this.tmp = temporaryResources;
        this.length = j10;
        this.suffix = str;
    }

    public static TikaInputStream get(InputStreamFactory inputStreamFactory, TemporaryResources temporaryResources) {
        TikaInputStream tikaInputStream = get(inputStreamFactory.getInputStream(), temporaryResources, (Metadata) null);
        tikaInputStream.streamFactory = inputStreamFactory;
        return tikaInputStream;
    }

    public static TikaInputStream get(Blob blob) {
        return get(blob, new Metadata());
    }

    public static TikaInputStream get(Blob blob, Metadata metadata) {
        long length;
        try {
            length = blob.length();
            try {
                metadata.set(HttpHeaders.CONTENT_LENGTH, Long.toString(length));
            } catch (SQLException unused) {
            }
        } catch (SQLException unused2) {
            length = -1;
        }
        long j10 = length;
        if (0 <= j10 && j10 <= SentryOptions.MAX_EVENT_SIZE_BYTES) {
            return get(blob.getBytes(1L, (int) j10), metadata);
        }
        return new TikaInputStream(new BufferedInputStream(blob.getBinaryStream()), new TemporaryResources(), j10, getExtension(metadata));
    }

    public static TikaInputStream get(URI uri) {
        return get(uri, new Metadata());
    }

    public static TikaInputStream get(URI uri, Metadata metadata) {
        if (Constants.FILE.equalsIgnoreCase(uri.getScheme())) {
            Path path = Paths.get(uri);
            if (Files.isRegularFile(path, new LinkOption[0])) {
                return get(path, metadata);
            }
        }
        return get(uri.toURL(), metadata);
    }

    public static TikaInputStream get(URL url) {
        return get(url, new Metadata());
    }

    public static TikaInputStream get(URL url, Metadata metadata) {
        if (Constants.FILE.equalsIgnoreCase(url.getProtocol())) {
            try {
                Path path = Paths.get(url.toURI());
                if (Files.isRegularFile(path, new LinkOption[0])) {
                    return get(path, metadata);
                }
            } catch (URISyntaxException unused) {
            }
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        String path2 = url.getPath();
        int iLastIndexOf = path2.lastIndexOf(47) + 1;
        if (iLastIndexOf < path2.length()) {
            metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, path2.substring(iLastIndexOf));
        }
        String contentType = uRLConnection.getContentType();
        if (contentType != null) {
            metadata.set(HttpHeaders.CONTENT_TYPE, contentType);
        }
        String contentEncoding = uRLConnection.getContentEncoding();
        if (contentEncoding != null) {
            metadata.set(HttpHeaders.CONTENT_ENCODING, contentEncoding);
        }
        int contentLength = uRLConnection.getContentLength();
        if (contentLength >= 0) {
            metadata.set(HttpHeaders.CONTENT_LENGTH, Integer.toString(contentLength));
        }
        return new TikaInputStream(new BufferedInputStream(uRLConnection.getInputStream()), new TemporaryResources(), contentLength, getExtension(metadata));
    }
}
