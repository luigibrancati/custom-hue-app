package org.apache.tika.pipes.pipesiterator.filelist;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.fetcher.FetchKey;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FileListPipesIterator extends PipesIterator implements Initializable {

    @Field
    private String fileList;
    private Path fileListPath;

    @Field
    private boolean hasHeader = false;

    @Override // org.apache.tika.pipes.pipesiterator.PipesIterator, org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
        TikaConfig.mustNotBeEmpty("fileList", this.fileList);
        TikaConfig.mustNotBeEmpty("fetcherName", getFetcherName());
        TikaConfig.mustNotBeEmpty("emitterName", getFetcherName());
        Path path = Paths.get(this.fileList, new String[0]);
        this.fileListPath = path;
        if (Files.isRegularFile(path, new LinkOption[0])) {
            return;
        }
        throw new TikaConfigException("file list " + this.fileList + " does not exist. Must specify an existing file");
    }

    @Override // org.apache.tika.pipes.pipesiterator.PipesIterator
    public void enqueue() throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(this.fileListPath, StandardCharsets.UTF_8);
        try {
            if (this.hasHeader) {
                bufferedReaderNewBufferedReader.readLine();
            }
            for (String line = bufferedReaderNewBufferedReader.readLine(); line != null; line = bufferedReaderNewBufferedReader.readLine()) {
                if (!line.startsWith("#") && !StringUtils.isBlank(line)) {
                    FetchKey fetchKey = new FetchKey(getFetcherName(), line);
                    EmitKey emitKey = new EmitKey(getEmitterName(), line);
                    ParseContext parseContext = new ParseContext();
                    parseContext.set(HandlerConfig.class, getHandlerConfig());
                    tryToAdd(new FetchEmitTuple(line, fetchKey, emitKey, new Metadata(), parseContext, getOnParseException()));
                }
            }
            bufferedReaderNewBufferedReader.close();
        } catch (Throwable th) {
            if (bufferedReaderNewBufferedReader == null) {
                throw th;
            }
            try {
                bufferedReaderNewBufferedReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Field
    public void setFileList(String str) {
        this.fileList = str;
    }

    @Field
    public void setHasHeader(boolean z10) {
        this.hasHeader = z10;
    }
}
