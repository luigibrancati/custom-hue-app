package org.apache.tika.pipes.fetcher.fs;

import af.c;
import af.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.config.a;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.FileSystem;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.fetcher.AbstractFetcher;
import org.apache.tika.pipes.fetcher.fs.config.FileSystemFetcherConfig;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FileSystemFetcher extends AbstractFetcher implements Initializable {
    private static final c LOG = e.l(FileSystemFetcher.class);
    private Path basePath = null;
    private boolean extractFileSystemMetadata = false;

    public FileSystemFetcher() {
    }

    public static boolean isDescendant(Path path, Path path2) {
        return path2.toAbsolutePath().normalize().startsWith(path.toAbsolutePath().normalize());
    }

    private void updateFileSystemMetadata(Path path, Metadata metadata) throws IOException {
        if (this.extractFileSystemMetadata) {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, new LinkOption[0]);
            updateFileTime(FileSystem.CREATED, attributes.creationTime(), metadata);
            updateFileTime(FileSystem.MODIFIED, attributes.lastModifiedTime(), metadata);
            updateFileTime(FileSystem.ACCESSED, attributes.lastAccessTime(), metadata);
        }
    }

    private void updateFileTime(Property property, FileTime fileTime, Metadata metadata) {
        if (fileTime == null) {
            return;
        }
        metadata.set(property, new Date(fileTime.toMillis()));
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
        Path path = this.basePath;
        if (path == null || a.a(path.toString())) {
            LOG.c("'basePath' has not been set. This means that client code or clients can read from any file that this process has permissions to read. If you are running tika-server, make absolutely certain that you've locked down access to tika-server and file-permissions for the tika-server process.");
            return;
        }
        if (this.basePath.toString().startsWith("http://")) {
            throw new TikaConfigException("FileSystemFetcher only works with local file systems.  Please use the tika-fetcher-http module for http calls");
        }
        if (this.basePath.toString().startsWith("ftp://")) {
            throw new TikaConfigException("FileSystemFetcher only works with local file systems.  Please consider contributing an ftp fetcher module");
        }
        if (this.basePath.toString().startsWith("s3://")) {
            throw new TikaConfigException("FileSystemFetcher only works with local file systems.  Please use the tika-fetcher-s3 module");
        }
        if (this.basePath.toAbsolutePath().toString().contains(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            throw new TikaConfigException("base path must not contain \u0000. Seriously, what were you thinking?");
        }
    }

    @Override // org.apache.tika.pipes.fetcher.Fetcher
    public InputStream fetch(String str, Metadata metadata, ParseContext parseContext) throws IOException {
        Path pathResolve;
        if (str.contains(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            throw new IllegalArgumentException("Path must not contain 'u0000'. Please review the life decisions that led you to requesting a file name with this character in it.");
        }
        Path path = this.basePath;
        if (path != null) {
            pathResolve = path.resolve(str);
            if (!pathResolve.toRealPath(new LinkOption[0]).startsWith(this.basePath.toRealPath(new LinkOption[0]))) {
                throw new IllegalArgumentException("fetchKey must resolve to be a descendant of the 'basePath'");
            }
        } else {
            pathResolve = Paths.get(str, new String[0]);
        }
        metadata.set(TikaCoreProperties.SOURCE_PATH, str);
        updateFileSystemMetadata(pathResolve, metadata);
        if (Files.isRegularFile(pathResolve, new LinkOption[0])) {
            return TikaInputStream.get(pathResolve, metadata);
        }
        Path path2 = this.basePath;
        if (path2 == null || Files.isDirectory(path2, new LinkOption[0])) {
            throw new FileNotFoundException(pathResolve.toAbsolutePath().toString());
        }
        throw new IOException("BasePath is not a directory: " + String.valueOf(this.basePath));
    }

    public Path getBasePath() {
        return this.basePath;
    }

    @Field
    public void setBasePath(String str) {
        this.basePath = Paths.get(str, new String[0]);
    }

    @Field
    public void setExtractFileSystemMetadata(boolean z10) {
        this.extractFileSystemMetadata = z10;
    }

    public FileSystemFetcher(FileSystemFetcherConfig fileSystemFetcherConfig) {
        setBasePath(fileSystemFetcherConfig.getBasePath());
        setExtractFileSystemMetadata(fileSystemFetcherConfig.isExtractFileSystemMetadata());
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
    }
}
