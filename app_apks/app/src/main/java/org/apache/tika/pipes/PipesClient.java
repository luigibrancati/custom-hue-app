package org.apache.tika.pipes;

import Ne.h;
import af.e;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ProcessBuilder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.utils.ProcessUtils;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PipesClient implements Closeable {
    private static final int MAX_BYTES_BEFORE_READY = 20000;
    private static final long WAIT_ON_DESTROY_MS = 10000;
    private DataInputStream input;
    private DataOutputStream output;
    private final PipesConfigBase pipesConfig;
    private Process process;
    private static final af.c LOG = e.l(PipesClient.class);
    private static AtomicInteger CLIENT_COUNTER = new AtomicInteger(0);
    private final Object[] executorServiceLock = new Object[0];
    private volatile boolean closed = false;
    private ExecutorService executorService = Executors.newFixedThreadPool(1);
    private int filesProcessed = 0;
    private final int pipesClientId = CLIENT_COUNTER.getAndIncrement();

    /* JADX INFO: renamed from: org.apache.tika.pipes.PipesClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS;

        static {
            int[] iArr = new int[PipesServer.STATUS.values().length];
            $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS = iArr;
            try {
                iArr[PipesServer.STATUS.OOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMITTER_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCHER_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCHER_INITIALIZATION_EXCEPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCH_EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.INTERMEDIATE_RESULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PARSE_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PARSE_EXCEPTION_NO_EMIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMPTY_OUTPUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.READY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.CALL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FAILED_TO_START.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public PipesClient(PipesConfigBase pipesConfigBase) {
        this.pipesConfig = pipesConfigBase;
    }

    public static /* synthetic */ Integer a(PipesClient pipesClient, Oe.e eVar) throws IOException {
        int i10 = pipesClient.input.read();
        int i11 = 1;
        while (i11 < MAX_BYTES_BEFORE_READY && i10 != PipesServer.STATUS.READY.getByte()) {
            if (i10 == -1) {
                throw new RuntimeException(getMsg("pipesClientId=" + pipesClient.pipesClientId + ": Couldn't start server -- read EOF before 'ready' byte.\n process isAlive=" + pipesClient.process.isAlive(), eVar));
            }
            eVar.write(i10);
            i10 = pipesClient.input.read();
            i11++;
        }
        if (i11 < MAX_BYTES_BEFORE_READY) {
            if (eVar.j() > 0) {
                LOG.i("pipesClientId={}: From forked process before start byte: {}", Integer.valueOf(pipesClient.pipesClientId), eVar.f(StandardCharsets.UTF_8));
            }
            return 1;
        }
        throw new RuntimeException(getMsg("pipesClientId=" + pipesClient.pipesClientId + ": Couldn't start server: read too many bytes before 'ready' byte.\n Make absolutely certain that your logger is not writing to stdout.\n", eVar));
    }

    private PipesResult actuallyProcess(final FetchEmitTuple fetchEmitTuple) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final PipesResult[] pipesResultArr = new PipesResult[1];
        FutureTask futureTask = new FutureTask(new Callable() { // from class: org.apache.tika.pipes.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PipesClient.b(this.f41591a, fetchEmitTuple, jCurrentTimeMillis, pipesResultArr);
            }
        });
        try {
            try {
                try {
                    try {
                        if (!this.closed) {
                            this.executorService.execute(futureTask);
                            PipesResult pipesResult = (PipesResult) futureTask.get(this.pipesConfig.getTimeoutMillis(), TimeUnit.MILLISECONDS);
                            futureTask.cancel(true);
                            return pipesResult;
                        }
                        throw new IllegalArgumentException("pipesClientId=" + this.pipesClientId + ": PipesClient closed");
                    } catch (InterruptedException e10) {
                        destroyForcibly();
                        throw e10;
                    }
                } catch (TimeoutException unused) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    destroyForcibly();
                    LOG.warn("pipesClientId={} client timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis2));
                    PipesResult pipesResultBuildFatalResult = buildFatalResult(PipesResult.TIMEOUT, pipesResultArr);
                    futureTask.cancel(true);
                    return pipesResultBuildFatalResult;
                }
            } catch (ExecutionException e11) {
                af.c cVar = LOG;
                cVar.q("pipesClientId=" + this.pipesClientId + ": execution exception", e11);
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                pauseThenDestroy();
                if (!this.process.isAlive() && 17 == this.process.exitValue()) {
                    cVar.warn("pipesClientId={} server timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis3));
                    PipesResult pipesResultBuildFatalResult2 = buildFatalResult(PipesResult.TIMEOUT, pipesResultArr);
                    futureTask.cancel(true);
                    return pipesResultBuildFatalResult2;
                }
                this.process.waitFor(500L, TimeUnit.MILLISECONDS);
                if (this.process.isAlive()) {
                    cVar.warn("pipesClientId={} crash: {} in {} ms with no exit code available", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis3));
                } else {
                    cVar.warn("pipesClientId={} crash: {} in {} ms with exit code {}", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis3), Integer.valueOf(this.process.exitValue()));
                }
                PipesResult pipesResultBuildFatalResult3 = buildFatalResult(PipesResult.UNSPECIFIED_CRASH, pipesResultArr);
                futureTask.cancel(true);
                return pipesResultBuildFatalResult3;
            }
        } catch (Throwable th) {
            futureTask.cancel(true);
            throw th;
        }
    }

    public static /* synthetic */ PipesResult b(PipesClient pipesClient, FetchEmitTuple fetchEmitTuple, long j10, PipesResult[] pipesResultArr) throws InterruptedException, IOException {
        pipesClient.getClass();
        Oe.e eVarK = Oe.e.i().k();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(eVarK);
        try {
            objectOutputStream.writeObject(fetchEmitTuple);
            objectOutputStream.close();
            byte[] bArrB = eVarK.b();
            pipesClient.output.write(PipesServer.STATUS.CALL.getByte());
            pipesClient.output.writeInt(bArrB.length);
            pipesClient.output.write(bArrB);
            pipesClient.output.flush();
            af.c cVar = LOG;
            if (cVar.k()) {
                cVar.g("pipesClientId={}: timer -- write tuple: {} ms", Integer.valueOf(pipesClient.pipesClientId), Long.valueOf(System.currentTimeMillis() - j10));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException("thread interrupt");
            }
            PipesResult results = pipesClient.readResults(fetchEmitTuple, j10);
            while (results.getStatus().equals(PipesResult.STATUS.INTERMEDIATE_RESULT)) {
                pipesResultArr[0] = results;
                results = pipesClient.readResults(fetchEmitTuple, j10);
            }
            af.c cVar2 = LOG;
            if (cVar2.f()) {
                cVar2.t("finished reading result in {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
            if (cVar2.k()) {
                cVar2.g("pipesClientId={}: timer -- read result: {} ms", Integer.valueOf(pipesClient.pipesClientId), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
            return results.getStatus() == PipesResult.STATUS.OOM ? pipesClient.buildFatalResult(results, pipesResultArr) : results;
        } catch (Throwable th) {
            try {
                objectOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private PipesResult buildFatalResult(PipesResult pipesResult, PipesResult[] pipesResultArr) {
        if (pipesResultArr[0] == null) {
            return pipesResult;
        }
        af.c cVar = LOG;
        if (cVar.k()) {
            cVar.p("intermediate result: {}", pipesResultArr[0].getEmitData());
        }
        pipesResultArr[0].getEmitData().getMetadataList().get(0).set(TikaCoreProperties.PIPES_RESULT, pipesResult.getStatus().toString());
        return new PipesResult(pipesResult.getStatus(), pipesResultArr[0].getEmitData(), true);
    }

    private PipesResult deserializeEmitData() throws IOException {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(h.a().p(bArr).o());
            try {
                EmitData emitData = (EmitData) objectInputStream.readObject();
                String containerStackTrace = emitData.getContainerStackTrace();
                if (StringUtils.isBlank(containerStackTrace)) {
                    PipesResult pipesResult = new PipesResult(emitData);
                    objectInputStream.close();
                    return pipesResult;
                }
                PipesResult pipesResult2 = new PipesResult(emitData, containerStackTrace);
                objectInputStream.close();
                return pipesResult2;
            } finally {
            }
        } catch (ClassNotFoundException e10) {
            LOG.q("class not found exception deserializing data", e10);
            throw new RuntimeException(e10);
        }
    }

    private PipesResult deserializeIntermediateResult(EmitKey emitKey, ParseContext parseContext) throws IOException {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(h.a().p(bArr).o());
            try {
                PipesResult pipesResult = new PipesResult(PipesResult.STATUS.INTERMEDIATE_RESULT, new EmitData(emitKey, Collections.singletonList((Metadata) objectInputStream.readObject())), true);
                objectInputStream.close();
                return pipesResult;
            } finally {
            }
        } catch (ClassNotFoundException e10) {
            LOG.q("class not found exception deserializing data", e10);
            throw new RuntimeException(e10);
        }
    }

    private void destroyForcibly() throws InterruptedException {
        this.process.destroyForcibly();
        this.process.waitFor(WAIT_ON_DESTROY_MS, TimeUnit.MILLISECONDS);
        try {
            this.input.close();
        } catch (IOException unused) {
        }
        try {
            this.output.close();
        } catch (IOException unused2) {
        }
        if (this.process.isAlive()) {
            LOG.u("Process still alive after {}ms", Long.valueOf(WAIT_ON_DESTROY_MS));
        }
    }

    private String[] getCommandline() {
        List<String> forkedJvmArgs = this.pipesConfig.getForkedJvmArgs();
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String strReplace = null;
        for (String str2 : forkedJvmArgs) {
            if (str2.startsWith("-Djava.awt.headless")) {
                z11 = true;
            }
            if (str2.equals("-cp") || str2.equals("--classpath")) {
                z10 = true;
            }
            if (str2.equals("-XX:+ExitOnOutOfMemoryError") || str2.equals("-XX:+CrashOnOutOfMemoryError")) {
                z12 = true;
            }
            if (str2.startsWith("-Dlog4j.configuration")) {
                z13 = true;
            }
            if (str2.startsWith("-Xloggc:")) {
                strReplace = str2.replace("${pipesClientId}", "id-" + this.pipesClientId);
                str = str2;
            }
        }
        if (str != null && strReplace != null) {
            forkedJvmArgs.remove(str);
            forkedJvmArgs.add(strReplace);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProcessUtils.escapeCommandLine(this.pipesConfig.getJavaPath()));
        if (!z10) {
            arrayList.add("-cp");
            arrayList.add(System.getProperty("java.class.path"));
        }
        if (!z11) {
            arrayList.add("-Djava.awt.headless=true");
        }
        if (z12) {
            LOG.c("I notice that you have an exit/crash on OOM. If you run heavy external processes like tesseract, this setting may result in orphaned processes which could be disastrous for performance.");
        }
        if (!z13) {
            arrayList.add("-Dlog4j.configurationFile=classpath:pipes-fork-server-default-log4j2.xml");
        }
        arrayList.add("-DpipesClientId=" + this.pipesClientId);
        arrayList.addAll(forkedJvmArgs);
        arrayList.add("org.apache.tika.pipes.PipesServer");
        arrayList.add(ProcessUtils.escapeCommandLine(this.pipesConfig.getTikaConfig().toAbsolutePath().toString()));
        arrayList.add(Long.toString(this.pipesConfig.getMaxForEmitBatchBytes()));
        arrayList.add(Long.toString(this.pipesConfig.getTimeoutMillis()));
        arrayList.add(Long.toString(this.pipesConfig.getShutdownClientAfterMillis()));
        LOG.e("pipesClientId={}: commandline: {}", Integer.valueOf(this.pipesClientId), arrayList);
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static String getMsg(String str, Oe.e eVar) {
        String strF = eVar.f(StandardCharsets.UTF_8);
        if (StringUtils.isBlank(strF)) {
            return str;
        }
        return str + "So far, I've read: >" + strF + "<";
    }

    private void pauseThenDestroy() throws InterruptedException {
        try {
            this.process.waitFor(200L, TimeUnit.MILLISECONDS);
        } finally {
            destroyForcibly();
        }
    }

    private boolean ping() {
        Process process = this.process;
        if (process != null && process.isAlive()) {
            try {
                DataOutputStream dataOutputStream = this.output;
                PipesServer.STATUS status = PipesServer.STATUS.PING;
                dataOutputStream.write(status.getByte());
                this.output.flush();
                if (this.input.read() == status.getByte()) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private PipesResult readMessage(PipesResult.STATUS status) throws IOException {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        return new PipesResult(status, new String(bArr, StandardCharsets.UTF_8));
    }

    private PipesResult readResults(FetchEmitTuple fetchEmitTuple, long j10) throws IOException {
        int i10 = this.input.read();
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        try {
            PipesServer.STATUS statusLookup = PipesServer.STATUS.lookup(i10);
            switch (AnonymousClass1.$SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[statusLookup.ordinal()]) {
                case 1:
                    LOG.warn("pipesClientId={} oom: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return PipesResult.OOM;
                case 2:
                    LOG.warn("pipesClientId={} server response timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return PipesResult.TIMEOUT;
                case 3:
                    LOG.warn("pipesClientId={} emit exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.EMIT_EXCEPTION);
                case 4:
                    LOG.warn("pipesClientId={} emitter not found: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.NO_EMITTER_FOUND);
                case 5:
                    LOG.warn("pipesClientId={} fetcher not found: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.NO_FETCHER_FOUND);
                case 6:
                    LOG.warn("pipesClientId={} fetcher initialization exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.FETCHER_INITIALIZATION_EXCEPTION);
                case 7:
                    LOG.warn("pipesClientId={} fetch exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return readMessage(PipesResult.STATUS.FETCH_EXCEPTION);
                case 8:
                    LOG.debug("pipesClientId={} intermediate success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return deserializeIntermediateResult(fetchEmitTuple.getEmitKey(), fetchEmitTuple.getParseContext());
                case 9:
                    LOG.debug("pipesClientId={} parse success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return deserializeEmitData();
                case 10:
                    return readMessage(PipesResult.STATUS.PARSE_EXCEPTION_NO_EMIT);
                case 11:
                    LOG.debug("pipesClientId={} emit success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(jCurrentTimeMillis));
                    return PipesResult.EMIT_SUCCESS;
                case 12:
                    return readMessage(PipesResult.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION);
                case 13:
                    return PipesResult.EMPTY_OUTPUT;
                case 14:
                case 15:
                case 16:
                case 17:
                    throw new IOException("Not expecting this status: " + String.valueOf(statusLookup));
                default:
                    throw new IOException("Need to handle procesing for: " + String.valueOf(statusLookup));
            }
        } catch (IllegalArgumentException e10) {
            throw new IOException("problem reading response from server: " + (i10 > -1 ? String.format(Locale.US, "%02x", Byte.valueOf((byte) i10)) : "-1"), e10);
        }
    }

    private void restart() throws InterruptedException {
        if (this.process != null) {
            af.c cVar = LOG;
            cVar.a("process still alive; trying to destroy it");
            destroyForcibly();
            Process process = this.process;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!process.waitFor(30L, timeUnit)) {
                cVar.o("pipesClientId={}: process has not yet ended", Integer.valueOf(this.pipesClientId));
            }
            this.executorService.shutdownNow();
            if (!this.executorService.awaitTermination(30L, timeUnit)) {
                cVar.o("pipesClientId={}: executorService has not yet shutdown", Integer.valueOf(this.pipesClientId));
            }
            synchronized (this.executorServiceLock) {
                if (this.closed) {
                    throw new IllegalArgumentException("pipesClientId=" + this.pipesClientId + ": PipesClient closed");
                }
                this.executorService = Executors.newFixedThreadPool(1);
            }
            cVar.n("pipesClientId={}: restarting process", Integer.valueOf(this.pipesClientId));
        } else {
            LOG.n("pipesClientId={}: starting process", Integer.valueOf(this.pipesClientId));
        }
        ProcessBuilder processBuilder = new ProcessBuilder(getCommandline());
        processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
        try {
            this.process = processBuilder.start();
            this.input = new DataInputStream(this.process.getInputStream());
            this.output = new DataOutputStream(this.process.getOutputStream());
            final Oe.e eVarK = Oe.e.i().k();
            FutureTask futureTask = new FutureTask(new Callable() { // from class: org.apache.tika.pipes.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return PipesClient.a(this.f41598a, eVarK);
                }
            });
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.executorService.submit(futureTask);
            try {
                try {
                    futureTask.get(this.pipesConfig.getStartupTimeoutMillis(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    destroyForcibly();
                    throw e10;
                } catch (ExecutionException e11) {
                    LOG.q("pipesClientId=" + this.pipesClientId + ": couldn't start server", e11);
                    destroyForcibly();
                    throw new RuntimeException(e11);
                } catch (TimeoutException e12) {
                    LOG.error("pipesClientId={} didn't receive ready byte from server within StartupTimeoutMillis {}; ms elapsed {}; did read >{}<", Integer.valueOf(this.pipesClientId), Long.valueOf(this.pipesConfig.getStartupTimeoutMillis()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), eVarK.f(StandardCharsets.UTF_8));
                    destroyForcibly();
                    throw e12;
                }
            } finally {
                futureTask.cancel(true);
            }
        } catch (Exception e13) {
            LOG.q("failed to start client", e13);
            throw new FailedToStartClientException(e13);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.process != null) {
            try {
                destroyForcibly();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.executorServiceLock) {
            try {
                ExecutorService executorService = this.executorService;
                if (executorService != null) {
                    executorService.shutdownNow();
                }
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getFilesProcessed() {
        return this.filesProcessed;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.tika.pipes.PipesResult process(org.apache.tika.pipes.FetchEmitTuple r6) throws java.lang.InterruptedException {
        /*
            r5 = this;
            boolean r0 = r5.ping()
            if (r0 != 0) goto L7
            goto L2c
        L7:
            org.apache.tika.pipes.PipesConfigBase r0 = r5.pipesConfig
            int r0 = r0.getMaxFilesProcessedPerProcess()
            if (r0 <= 0) goto L55
            int r0 = r5.filesProcessed
            org.apache.tika.pipes.PipesConfigBase r1 = r5.pipesConfig
            int r1 = r1.getMaxFilesProcessedPerProcess()
            if (r0 < r1) goto L55
            af.c r0 = org.apache.tika.pipes.PipesClient.LOG
            int r1 = r5.pipesClientId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.filesProcessed
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "pipesClientId={}: restarting server after hitting max files: {}"
            r0.m(r3, r1, r2)
        L2c:
            r0 = 0
        L2d:
            if (r0 != 0) goto L55
            r5.restart()     // Catch: java.util.concurrent.TimeoutException -> L34
            r0 = 1
            goto L2d
        L34:
            af.c r1 = org.apache.tika.pipes.PipesClient.LOG
            int r2 = r5.pipesClientId
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.apache.tika.pipes.PipesConfigBase r3 = r5.pipesConfig
            long r3 = r3.getStartupTimeoutMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "pipesClientId={}: couldn't restart within {} ms (startupTimeoutMillis)"
            r1.i(r4, r2, r3)
            org.apache.tika.pipes.PipesConfigBase r1 = r5.pipesConfig
            long r1 = r1.getSleepOnStartupTimeoutMillis()
            java.lang.Thread.sleep(r1)
            goto L2d
        L55:
            org.apache.tika.pipes.PipesResult r5 = r5.actuallyProcess(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesClient.process(org.apache.tika.pipes.FetchEmitTuple):org.apache.tika.pipes.PipesResult");
    }
}
