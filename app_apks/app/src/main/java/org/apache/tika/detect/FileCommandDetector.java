package org.apache.tika.detect;

import af.c;
import af.e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.apache.tika.config.Field;
import org.apache.tika.io.BoundedInputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.ExternalProcess;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.utils.FileProcessResult;
import org.apache.tika.utils.ProcessUtils;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FileCommandDetector implements Detector {
    private static final String DEFAULT_FILE_COMMAND_PATH = "file";
    private static final long DEFAULT_TIMEOUT_MS = 6000;
    public static Property FILE_MIME = Property.externalText("file:mime");
    private static final c LOGGER = e.l(FileCommandDetector.class);
    private static boolean HAS_WARNED = false;
    private Boolean hasFileCommand = null;
    private String fileCommandPath = "file";
    private int maxBytes = 1000000;
    private long timeoutMs = DEFAULT_TIMEOUT_MS;
    private boolean useMime = false;

    public static boolean checkHasFile() {
        return checkHasFile("file");
    }

    private MediaType detectOnPath(Path path, Metadata metadata) throws Throwable {
        FileProcessResult fileProcessResultExecute = ProcessUtils.execute(new ProcessBuilder(ProcessUtils.escapeCommandLine(this.fileCommandPath), "-b", "--mime-type", ProcessUtils.escapeCommandLine(path.toAbsolutePath().toString())), this.timeoutMs, 10000, 10000);
        if (fileProcessResultExecute.isTimeout()) {
            metadata.set(ExternalProcess.IS_TIMEOUT, true);
            return MediaType.OCTET_STREAM;
        }
        if (fileProcessResultExecute.getExitValue() != 0) {
            metadata.set(ExternalProcess.EXIT_VALUE, fileProcessResultExecute.getExitValue());
            return MediaType.OCTET_STREAM;
        }
        String stdout = fileProcessResultExecute.getStdout();
        if (StringUtils.isBlank(stdout)) {
            return MediaType.OCTET_STREAM;
        }
        metadata.set(FILE_MIME, stdout);
        if (!this.useMime) {
            return MediaType.OCTET_STREAM;
        }
        MediaType mediaType = MediaType.parse(stdout);
        return mediaType == null ? MediaType.OCTET_STREAM : mediaType;
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (this.hasFileCommand == null) {
            this.hasFileCommand = Boolean.valueOf(checkHasFile(this.fileCommandPath));
        }
        if (!this.hasFileCommand.booleanValue()) {
            if (!HAS_WARNED) {
                LOGGER.c("'file' command isn't working: '" + this.fileCommandPath + "'");
                HAS_WARNED = true;
            }
            return MediaType.OCTET_STREAM;
        }
        TikaInputStream tikaInputStreamCast = TikaInputStream.cast(inputStream);
        if (tikaInputStreamCast != null) {
            return detectOnPath(tikaInputStreamCast.getPath(), metadata);
        }
        inputStream.mark(this.maxBytes);
        try {
            TemporaryResources temporaryResources = new TemporaryResources();
            try {
                Path pathCreateTempFile = temporaryResources.createTempFile(metadata);
                Files.copy(new BoundedInputStream(this.maxBytes, inputStream), pathCreateTempFile, StandardCopyOption.REPLACE_EXISTING);
                MediaType mediaTypeDetectOnPath = detectOnPath(pathCreateTempFile, metadata);
                temporaryResources.close();
                return mediaTypeDetectOnPath;
            } finally {
            }
        } finally {
            inputStream.reset();
        }
    }

    public boolean isUseMime() {
        return this.useMime;
    }

    @Field
    public void setFilePath(String str) {
        this.fileCommandPath = str;
        checkHasFile(str);
    }

    @Field
    public void setMaxBytes(int i10) {
        this.maxBytes = i10;
    }

    @Field
    public void setTimeoutMs(long j10) {
        this.timeoutMs = j10;
    }

    @Field
    public void setUseMime(boolean z10) {
        this.useMime = z10;
    }

    public static boolean checkHasFile(String str) {
        return ExternalParser.check(new String[]{str, "-v"}, new int[0]);
    }
}
