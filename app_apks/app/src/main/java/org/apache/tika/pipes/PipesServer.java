package org.apache.tika.pipes;

import Je.f;
import Ne.h;
import af.e;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.extractor.BasicEmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.EmbeddedDocumentByteStoreExtractorFactory;
import org.apache.tika.extractor.EmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.EmbeddedDocumentExtractor;
import org.apache.tika.extractor.EmbeddedDocumentExtractorFactory;
import org.apache.tika.extractor.RUnpackExtractor;
import org.apache.tika.extractor.RUnpackExtractorFactory;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.listfilter.MetadataListFilter;
import org.apache.tika.metadata.listfilter.NoOpListFilter;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.RecursiveParserWrapper;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.StreamEmitter;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.pipes.extractor.EmittingEmbeddedDocumentBytesHandler;
import org.apache.tika.pipes.fetcher.Fetcher;
import org.apache.tika.pipes.fetcher.FetcherManager;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PipesServer implements Runnable {
    private static final af.c LOG = e.l(PipesServer.class);
    public static final int TIMEOUT_EXIT_CODE = 17;
    private Parser autoDetectParser;
    private Detector detector;
    private DigestingParser.Digester digester;
    private EmitterManager emitterManager;
    private FetcherManager fetcherManager;
    private final DataInputStream input;
    private final long maxForEmitBatchBytes;
    private final DataOutputStream output;
    private Parser rMetaParser;
    private final long serverParseTimeoutMillis;
    private final long serverWaitTimeoutMillis;
    private TikaConfig tikaConfig;
    private final Path tikaConfigPath;
    private final Object[] lock = new Object[0];
    private long checkForTimeoutMs = 1000;
    private volatile boolean parsing = false;
    private volatile long since = System.currentTimeMillis();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class MetadataListAndEmbeddedBytes {
        final Optional<EmbeddedDocumentBytesHandler> embeddedDocumentBytesHandler;
        List<Metadata> metadataList;

        public MetadataListAndEmbeddedBytes(List<Metadata> list, EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler) {
            this.metadataList = list;
            this.embeddedDocumentBytesHandler = Optional.ofNullable(embeddedDocumentBytesHandler);
        }

        public void filter(MetadataListFilter metadataListFilter) {
            this.metadataList = metadataListFilter.filter(this.metadataList);
        }

        public EmbeddedDocumentBytesHandler getEmbeddedDocumentBytesHandler() {
            return this.embeddedDocumentBytesHandler.get();
        }

        public List<Metadata> getMetadataList() {
            return this.metadataList;
        }

        public boolean hasEmbeddedDocumentByteStore() {
            return this.embeddedDocumentBytesHandler.isPresent();
        }

        public boolean toBePackagedForStreamEmitter() {
            return !(this.embeddedDocumentBytesHandler.get() instanceof EmittingEmbeddedDocumentBytesHandler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum STATUS {
        READY,
        CALL,
        PING,
        FAILED_TO_START,
        FETCHER_NOT_FOUND,
        EMITTER_NOT_FOUND,
        FETCHER_INITIALIZATION_EXCEPTION,
        FETCH_EXCEPTION,
        PARSE_SUCCESS,
        PARSE_EXCEPTION_NO_EMIT,
        EMIT_SUCCESS,
        EMIT_SUCCESS_PARSE_EXCEPTION,
        EMIT_EXCEPTION,
        OOM,
        TIMEOUT,
        EMPTY_OUTPUT,
        INTERMEDIATE_RESULT;

        public static STATUS lookup(int i10) {
            int i11 = i10 - 1;
            if (i11 < 0) {
                throw new IllegalArgumentException("byte must be > 0");
            }
            STATUS[] statusArrValues = values();
            if (i11 < statusArrValues.length) {
                return statusArrValues[i11];
            }
            throw new IllegalArgumentException("byte with index " + i11 + " must be < " + statusArrValues.length);
        }

        public byte getByte() {
            return (byte) (ordinal() + 1);
        }
    }

    public PipesServer(Path path, InputStream inputStream, PrintStream printStream, long j10, long j11, long j12) {
        this.tikaConfigPath = path;
        this.input = new DataInputStream(inputStream);
        this.output = new DataOutputStream(printStream);
        this.maxForEmitBatchBytes = j10;
        this.serverParseTimeoutMillis = j11;
        this.serverWaitTimeoutMillis = j12;
    }

    private void _preParse(FetchEmitTuple fetchEmitTuple, TikaInputStream tikaInputStream, Metadata metadata, ParseContext parseContext) {
        DigestingParser.Digester digester = this.digester;
        if (digester != null) {
            try {
                digester.digest(tikaInputStream, metadata, parseContext);
            } catch (IOException e10) {
                LOG.l("problem digesting: " + fetchEmitTuple.getId(), e10);
            }
        }
        try {
            MediaType mediaTypeDetect = this.detector.detect(tikaInputStream, metadata);
            metadata.set(HttpHeaders.CONTENT_TYPE, mediaTypeDetect.toString());
            metadata.set(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE, mediaTypeDetect.toString());
        } catch (IOException e11) {
            LOG.l("problem detecting: " + fetchEmitTuple.getId(), e11);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null || !embeddedDocumentBytesConfig.isIncludeOriginal()) {
            return;
        }
        EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler = (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class);
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(tikaInputStream.getPath(), new OpenOption[0]);
            try {
                embeddedDocumentBytesHandler.add(0, metadata, inputStreamNewInputStream);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } finally {
            }
        } catch (IOException e12) {
            LOG.l("problem reading source file into embedded document byte store", e12);
        }
    }

    private void actuallyParse(FetchEmitTuple fetchEmitTuple) throws Throwable {
        MetadataListAndEmbeddedBytes fromTuple;
        EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Fetcher fetcher = getFetcher(fetchEmitTuple);
        if (fetcher == null) {
            return;
        }
        af.c cVar = LOG;
        if (cVar.k()) {
            cVar.p("timer -- got fetcher: {}ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        try {
            fromTuple = parseFromTuple(fetchEmitTuple, fetcher);
        } catch (Throwable th) {
            th = th;
            fromTuple = null;
        }
        try {
            if (cVar.k()) {
                cVar.p("timer -- to parse: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
            }
            try {
                if (fromTuple == null || metadataIsEmpty(fromTuple.getMetadataList())) {
                    write(STATUS.EMPTY_OUTPUT);
                    if (fromTuple == null || !fromTuple.hasEmbeddedDocumentByteStore() || fromTuple.getEmbeddedDocumentBytesHandler() == null) {
                        return;
                    } else {
                        embeddedDocumentBytesHandler = fromTuple.getEmbeddedDocumentBytesHandler();
                    }
                } else {
                    emitParseData(fetchEmitTuple, fromTuple);
                    if (!fromTuple.hasEmbeddedDocumentByteStore() || fromTuple.getEmbeddedDocumentBytesHandler() == null) {
                        return;
                    } else {
                        embeddedDocumentBytesHandler = fromTuple.getEmbeddedDocumentBytesHandler();
                    }
                }
                embeddedDocumentBytesHandler.close();
            } catch (IOException e10) {
                LOG.l("problem closing embedded document byte store", e10);
            }
        } catch (Throwable th2) {
            th = th2;
            if (fromTuple != null && fromTuple.hasEmbeddedDocumentByteStore() && fromTuple.getEmbeddedDocumentBytesHandler() != null) {
                try {
                    fromTuple.getEmbeddedDocumentBytesHandler().close();
                } catch (IOException e11) {
                    LOG.l("problem closing embedded document byte store", e11);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[Catch: IOException | TikaEmitterException -> 0x0016, TRY_LEAVE, TryCatch #1 {IOException | TikaEmitterException -> 0x0016, blocks: (B:4:0x000c, B:6:0x0012, B:9:0x0018), top: B:22:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emit(java.lang.String r3, org.apache.tika.pipes.emitter.EmitKey r4, boolean r5, org.apache.tika.pipes.PipesServer.MetadataListAndEmbeddedBytes r6, java.lang.String r7, org.apache.tika.parser.ParseContext r8) {
        /*
            r2 = this;
            org.apache.tika.pipes.emitter.EmitterManager r0 = r2.emitterManager     // Catch: java.lang.IllegalArgumentException -> L52
            java.lang.String r1 = r4.getEmitterName()     // Catch: java.lang.IllegalArgumentException -> L52
            org.apache.tika.pipes.emitter.Emitter r3 = r0.getEmitter(r1)     // Catch: java.lang.IllegalArgumentException -> L52
            if (r5 == 0) goto L18
            boolean r5 = r6.toBePackagedForStreamEmitter()     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L18
            r2.emitContentsAndBytes(r3, r4, r6)     // Catch: java.lang.Throwable -> L16
            goto L23
        L16:
            r3 = move-exception
            goto L3b
        L18:
            java.lang.String r4 = r4.getEmitKey()     // Catch: java.lang.Throwable -> L16
            java.util.List r5 = r6.getMetadataList()     // Catch: java.lang.Throwable -> L16
            r3.emit(r4, r5, r8)     // Catch: java.lang.Throwable -> L16
        L23:
            boolean r3 = org.apache.tika.utils.StringUtils.isBlank(r7)
            if (r3 == 0) goto L2f
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS
            r2.write(r3)
            return
        L2f:
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r7.getBytes(r4)
            r2.write(r3, r4)
            return
        L3b:
            af.c r4 = org.apache.tika.pipes.PipesServer.LOG
            java.lang.String r5 = "emit exception"
            r4.l(r5, r3)
            java.lang.String r3 = org.apache.tika.utils.ExceptionUtils.getStackTrace(r3)
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r4)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_EXCEPTION
            r2.write(r4, r3)
            return
        L52:
            java.lang.String r3 = r2.getNoEmitterMsg(r3)
            af.c r4 = org.apache.tika.pipes.PipesServer.LOG
            r4.c(r3)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMITTER_NOT_FOUND
            r2.write(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.emit(java.lang.String, org.apache.tika.pipes.emitter.EmitKey, boolean, org.apache.tika.pipes.PipesServer$MetadataListAndEmbeddedBytes, java.lang.String, org.apache.tika.parser.ParseContext):void");
    }

    private void emitContentsAndBytes(Emitter emitter, EmitKey emitKey, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        if (emitter instanceof StreamEmitter) {
            throw new UnsupportedOperationException("this is not yet implemented");
        }
        throw new IllegalArgumentException("The emitter for embedded document byte store must be a StreamEmitter. I see: " + String.valueOf(emitter.getClass()));
    }

    private void emitParseData(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        EmitKey emitKey;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String containerStacktrace = getContainerStacktrace(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadata(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadataList(fetchEmitTuple, metadataListAndEmbeddedBytes);
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        FetchEmitTuple.ON_PARSE_EXCEPTION onParseException = fetchEmitTuple.getOnParseException();
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (!StringUtils.isBlank(containerStacktrace) && onParseException != FetchEmitTuple.ON_PARSE_EXCEPTION.EMIT) {
            write(STATUS.PARSE_EXCEPTION_NO_EMIT, containerStacktrace);
            return;
        }
        injectUserMetadata(fetchEmitTuple.getMetadata(), metadataListAndEmbeddedBytes.getMetadataList());
        EmitKey emitKey2 = fetchEmitTuple.getEmitKey();
        if (StringUtils.isBlank(emitKey2.getEmitKey())) {
            EmitKey emitKey3 = new EmitKey(emitKey2.getEmitterName(), fetchEmitTuple.getFetchKey().getFetchKey());
            fetchEmitTuple.setEmitKey(emitKey3);
            emitKey = emitKey3;
        } else {
            emitKey = emitKey2;
        }
        EmitData emitData = new EmitData(fetchEmitTuple.getEmitKey(), metadataListAndEmbeddedBytes.getMetadataList(), containerStacktrace);
        if (embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes() && metadataListAndEmbeddedBytes.toBePackagedForStreamEmitter()) {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        } else if (this.maxForEmitBatchBytes < 0 || emitData.getEstimatedSizeBytes() < this.maxForEmitBatchBytes) {
            write(emitData);
        } else {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        }
        af.c cVar = LOG;
        if (cVar.k()) {
            cVar.p("timer -- emitted: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    private void exit(int i10) {
        if (i10 != 0) {
            LOG.u("exiting: {}", Integer.valueOf(i10));
        } else {
            LOG.n("exiting: {}", Integer.valueOf(i10));
        }
        System.exit(i10);
    }

    private void filterMetadata(FetchEmitTuple fetchEmitTuple, List<Metadata> list) {
        MetadataFilter metadataFilter = (MetadataFilter) fetchEmitTuple.getParseContext().get(MetadataFilter.class);
        if (metadataFilter == null) {
            metadataFilter = this.tikaConfig.getMetadataFilter();
        }
        Iterator<Metadata> it = list.iterator();
        while (it.hasNext()) {
            try {
                metadataFilter.filter(it.next());
            } catch (TikaException e10) {
                LOG.l("failed to filter metadata", e10);
            }
        }
    }

    private void filterMetadataList(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        MetadataListFilter metadataListFilter = (MetadataListFilter) fetchEmitTuple.getParseContext().get(MetadataListFilter.class);
        if (metadataListFilter == null) {
            metadataListFilter = this.tikaConfig.getMetadataListFilter();
        }
        if (metadataListFilter instanceof NoOpListFilter) {
            return;
        }
        try {
            metadataListAndEmbeddedBytes.filter(metadataListFilter);
        } catch (TikaException e10) {
            LOG.l("failed to filter metadata list", e10);
        }
    }

    private String getContainerStacktrace(FetchEmitTuple fetchEmitTuple, List<Metadata> list) {
        String str;
        return (metadataIsEmpty(list) || (str = list.get(0).get(TikaCoreProperties.CONTAINER_EXCEPTION)) == null) ? "" : str;
    }

    private Fetcher getFetcher(FetchEmitTuple fetchEmitTuple) {
        try {
            return this.fetcherManager.getFetcher(fetchEmitTuple.getFetchKey().getFetcherName());
        } catch (IOException | TikaException e10) {
            LOG.l("Couldn't initialize fetcher for fetch id '" + fetchEmitTuple.getId() + "'", e10);
            this.write(STATUS.FETCHER_INITIALIZATION_EXCEPTION, ExceptionUtils.getStackTrace(e10));
            return null;
        } catch (IllegalArgumentException unused) {
            String noFetcherMsg = this.getNoFetcherMsg(fetchEmitTuple.getFetchKey().getFetcherName());
            LOG.c(noFetcherMsg);
            this.write(STATUS.FETCHER_NOT_FOUND, noFetcherMsg);
            return null;
        }
    }

    private String getNoEmitterMsg(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Emitter '");
        sb2.append(str);
        sb2.append("'");
        sb2.append(" not found.");
        sb2.append("\nThe configured emitterManager supports:");
        int i10 = 0;
        for (String str2 : this.emitterManager.getSupported()) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(str2);
            i10 = i11;
        }
        return sb2.toString();
    }

    private String getNoFetcherMsg(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fetcher '");
        sb2.append(str);
        sb2.append("'");
        sb2.append(" not found.");
        sb2.append("\nThe configured FetcherManager supports:");
        int i10 = 0;
        for (String str2 : this.fetcherManager.getSupported()) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(str2);
            i10 = i11;
        }
        return sb2.toString();
    }

    private void handleOOM(String str, OutOfMemoryError outOfMemoryError) {
        write(STATUS.OOM);
        LOG.q("oom: " + str, outOfMemoryError);
        exit(1);
    }

    private void injectUserMetadata(Metadata metadata, List<Metadata> list) {
        for (String str : metadata.names()) {
            list.get(0).set(str, (String) null);
            for (String str2 : metadata.getValues(str)) {
                list.get(0).add(str, str2);
            }
        }
    }

    public static void main(String[] strArr) {
        try {
            PipesServer pipesServer = new PipesServer(Paths.get(strArr[0], new String[0]), System.in, System.out, Long.parseLong(strArr[1]), Long.parseLong(strArr[2]), Long.parseLong(strArr[3]));
            System.setIn(h.a().p(new byte[0]).o());
            System.setOut(System.err);
            Thread thread = new Thread(pipesServer, "Tika Watchdog");
            thread.setDaemon(true);
            thread.start();
            pipesServer.processRequests();
        } finally {
            LOG.b("server shutting down");
        }
    }

    private boolean metadataIsEmpty(List<Metadata> list) {
        return list == null || list.size() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d A[PHI: r8
      0x008d: PHI (r8v3 af.c) = (r8v1 af.c), (r8v2 af.c), (r8v4 af.c) binds: [B:38:0x011d, B:31:0x00e8, B:22:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<org.apache.tika.metadata.Metadata> parseConcatenated(org.apache.tika.pipes.FetchEmitTuple r6, org.apache.tika.pipes.HandlerConfig r7, java.io.InputStream r8, org.apache.tika.metadata.Metadata r9, org.apache.tika.parser.ParseContext r10) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseConcatenated(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private void parseOne() {
        synchronized (this.lock) {
            this.parsing = true;
            this.since = System.currentTimeMillis();
        }
        FetchEmitTuple fetchEmitTuple = null;
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                fetchEmitTuple = readFetchEmitTuple();
                af.c cVar = LOG;
                if (cVar.k()) {
                    cVar.p("timer -- read fetchEmitTuple: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                actuallyParse(fetchEmitTuple);
                if (cVar.k()) {
                    cVar.p("timer -- actually parsed: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                }
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            } catch (OutOfMemoryError e10) {
                handleOOM(fetchEmitTuple.getId(), e10);
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            synchronized (this.lock) {
                this.parsing = false;
                this.since = System.currentTimeMillis();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[PHI: r8
      0x0069: PHI (r8v4 af.c) = (r8v2 af.c), (r8v3 af.c), (r8v5 af.c) binds: [B:19:0x0067, B:25:0x00af, B:29:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<org.apache.tika.metadata.Metadata> parseRecursive(org.apache.tika.pipes.FetchEmitTuple r7, org.apache.tika.pipes.HandlerConfig r8, java.io.InputStream r9, org.apache.tika.metadata.Metadata r10, org.apache.tika.parser.ParseContext r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseRecursive(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private MetadataListAndEmbeddedBytes parseWithStream(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata) throws TikaConfigException {
        ParseContext parseContext = setupParseContext(fetchEmitTuple);
        HandlerConfig handlerConfig = (HandlerConfig) parseContext.get(HandlerConfig.class);
        return new MetadataListAndEmbeddedBytes(handlerConfig.getParseMode() == HandlerConfig.PARSE_MODE.RMETA ? parseRecursive(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext) : parseConcatenated(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext), (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class));
    }

    private void preParse(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata, ParseContext parseContext) {
        try {
            TikaInputStream tikaInputStreamCast = TikaInputStream.cast(inputStream);
            if (tikaInputStreamCast == null) {
                tikaInputStreamCast = TikaInputStream.get(inputStream, (TemporaryResources) null, metadata);
            }
            _preParse(fetchEmitTuple, tikaInputStreamCast, metadata, parseContext);
            f.i(null);
            writeIntermediate(fetchEmitTuple.getEmitKey(), metadata);
        } catch (Throwable th) {
            f.i(null);
            throw th;
        }
    }

    private FetchEmitTuple readFetchEmitTuple() {
        try {
            byte[] bArr = new byte[this.input.readInt()];
            this.input.readFully(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(h.a().p(bArr).o());
            try {
                FetchEmitTuple fetchEmitTuple = (FetchEmitTuple) objectInputStream.readObject();
                objectInputStream.close();
                return fetchEmitTuple;
            } finally {
            }
        } catch (IOException e10) {
            LOG.q("problem reading tuple", e10);
            exit(1);
            return null;
        } catch (ClassNotFoundException e11) {
            LOG.q("can't find class?!", e11);
            exit(1);
            return null;
        }
    }

    private ParseContext setupParseContext(FetchEmitTuple fetchEmitTuple) throws TikaConfigException {
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        if (parseContext.get(HandlerConfig.class) == null) {
            parseContext.set(HandlerConfig.class, HandlerConfig.DEFAULT_HANDLER_CONFIG);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null) {
            parseContext.set(EmbeddedDocumentBytesConfig.class, EmbeddedDocumentBytesConfig.SKIP);
            return parseContext;
        }
        EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory();
        if (embeddedDocumentExtractorFactory == null) {
            parseContext.set(EmbeddedDocumentExtractor.class, new RUnpackExtractor(parseContext, RUnpackExtractorFactory.DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION));
        } else if (!(embeddedDocumentExtractorFactory instanceof EmbeddedDocumentByteStoreExtractorFactory)) {
            throw new TikaConfigException("EmbeddedDocumentExtractorFactory must be an instance of EmbeddedDocumentByteStoreExtractorFactory if you wantto extract embedded bytes! I see this embedded doc factory: " + String.valueOf(embeddedDocumentExtractorFactory.getClass()) + "and a request: " + String.valueOf(embeddedDocumentBytesConfig));
        }
        if (StringUtils.isBlank(embeddedDocumentBytesConfig.getEmitter())) {
            parseContext.set(EmbeddedDocumentBytesHandler.class, new BasicEmbeddedDocumentBytesHandler(embeddedDocumentBytesConfig));
            return parseContext;
        }
        parseContext.set(EmbeddedDocumentBytesHandler.class, new EmittingEmbeddedDocumentBytesHandler(fetchEmitTuple, this.emitterManager));
        return parseContext;
    }

    private void write(EmitData emitData) {
        try {
            Oe.e eVarK = Oe.e.i().k();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(eVarK);
            try {
                objectOutputStream.writeObject(emitData);
                objectOutputStream.close();
                write(STATUS.PARSE_SUCCESS, eVarK.b());
            } finally {
            }
        } catch (IOException e10) {
            LOG.q("problem writing emit data (forking process shutdown?)", e10);
            exit(1);
        }
    }

    private void writeIntermediate(EmitKey emitKey, Metadata metadata) {
        try {
            Oe.e eVarK = Oe.e.i().k();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(eVarK);
            try {
                objectOutputStream.writeObject(metadata);
                objectOutputStream.close();
                write(STATUS.INTERMEDIATE_RESULT, eVarK.b());
            } finally {
            }
        } catch (IOException e10) {
            LOG.q("problem writing intermediate data (forking process shutdown?)", e10);
            exit(1);
        }
    }

    public void initializeResources() {
        this.tikaConfig = new TikaConfig(this.tikaConfigPath);
        this.fetcherManager = FetcherManager.load(this.tikaConfigPath);
        if (this.maxForEmitBatchBytes > -1) {
            this.emitterManager = EmitterManager.load(this.tikaConfigPath);
        } else {
            LOG.a("'maxForEmitBatchBytes' < 0. Not initializing emitters in PipesServer");
            this.emitterManager = null;
        }
        AutoDetectParser autoDetectParser = new AutoDetectParser(this.tikaConfig);
        this.autoDetectParser = autoDetectParser;
        if (autoDetectParser.getAutoDetectParserConfig().getDigesterFactory() != null) {
            this.digester = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().build();
            ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().setSkipContainerDocument(true);
            if (((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory() == null) {
                ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().setEmbeddedDocumentExtractorFactory(new RUnpackExtractorFactory());
            }
        }
        this.detector = ((AutoDetectParser) this.autoDetectParser).getDetector();
        this.rMetaParser = new RecursiveParserWrapper(this.autoDetectParser);
    }

    public MetadataListAndEmbeddedBytes parseFromTuple(FetchEmitTuple fetchEmitTuple, Fetcher fetcher) {
        Metadata metadata = new Metadata();
        try {
            try {
                InputStream inputStreamFetch = fetcher.fetch(fetchEmitTuple.getFetchKey().getFetchKey(), metadata, fetchEmitTuple.getParseContext());
                try {
                    MetadataListAndEmbeddedBytes withStream = parseWithStream(fetchEmitTuple, inputStreamFetch, metadata);
                    if (inputStreamFetch == null) {
                        return withStream;
                    }
                    inputStreamFetch.close();
                    return withStream;
                } catch (Throwable th) {
                    if (inputStreamFetch != null) {
                        try {
                            inputStreamFetch.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException | TikaException e10) {
                LOG.l("fetch exception " + fetchEmitTuple.getId(), e10);
                write(STATUS.FETCH_EXCEPTION, ExceptionUtils.getStackTrace(e10));
                return null;
            }
        } catch (SecurityException e11) {
            LOG.q("security exception " + fetchEmitTuple.getId(), e11);
            throw e11;
        }
    }

    public void processRequests() {
        af.c cVar = LOG;
        cVar.a("processing requests");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            initializeResources();
            if (cVar.k()) {
                cVar.p("timer -- initialize parser and other resources: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
            cVar.a("pipes server initialized");
            try {
                write(STATUS.READY);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                while (true) {
                    int i10 = this.input.read();
                    if (i10 != -1) {
                        STATUS status = STATUS.PING;
                        if (i10 != status.getByte()) {
                            if (i10 != STATUS.CALL.getByte()) {
                                break;
                            }
                            parseOne();
                            af.c cVar2 = LOG;
                            if (cVar2.k()) {
                                cVar2.p("timer -- parse one: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        } else {
                            af.c cVar3 = LOG;
                            if (cVar3.k()) {
                                cVar3.p("timer -- ping: {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                            }
                            write(status);
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        }
                    } else {
                        LOG.c("received -1 from client; shutting down");
                        exit(1);
                    }
                    this.output.flush();
                }
                throw new IllegalStateException("Unexpected request");
            } catch (Throwable th) {
                LOG.q("main loop error (did the forking process shut down?)", th);
                exit(1);
                System.err.flush();
            }
        } catch (Throwable th2) {
            LOG.q("couldn't initialize parser", th2);
            try {
                this.output.writeByte(STATUS.FAILED_TO_START.getByte());
                this.output.flush();
            } catch (IOException e10) {
                LOG.l("couldn't notify of failure to start", e10);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                synchronized (this.lock) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.since;
                        if (this.parsing && jCurrentTimeMillis > this.serverParseTimeoutMillis) {
                            LOG.i("timeout server; elapsed {}  with {}", Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.serverParseTimeoutMillis));
                            exit(17);
                        } else if (!this.parsing) {
                            long j10 = this.serverWaitTimeoutMillis;
                            if (j10 > 0 && jCurrentTimeMillis > j10) {
                                LOG.b("closing down from inactivity");
                                exit(0);
                            }
                        }
                    } finally {
                    }
                }
                Thread.sleep(this.checkForTimeoutMs);
            } catch (InterruptedException unused) {
                LOG.a("interrupted");
                return;
            }
        }
    }

    private void write(STATUS status, String str) {
        write(status, str.getBytes(StandardCharsets.UTF_8));
    }

    private void write(STATUS status, byte[] bArr) {
        try {
            int length = bArr.length;
            this.output.write(status.getByte());
            this.output.writeInt(length);
            this.output.write(bArr);
            this.output.flush();
        } catch (IOException e10) {
            LOG.q("problem writing data (forking process shutdown?)", e10);
            exit(1);
        }
    }

    private void write(STATUS status) {
        try {
            this.output.write(status.getByte());
            this.output.flush();
        } catch (IOException e10) {
            LOG.q("problem writing data (forking process shutdown?)", e10);
            exit(1);
        }
    }
}
