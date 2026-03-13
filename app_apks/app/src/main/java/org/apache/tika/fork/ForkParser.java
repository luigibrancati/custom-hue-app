package org.apache.tika.fork;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.TeeContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ForkParser implements Parser, Closeable {
    private static final long serialVersionUID = -4962742892274663950L;
    private int currentlyInUse;
    private List<String> java;
    private final ClassLoader loader;

    @Field
    private int maxFilesProcessedPerClient;
    private final Parser parser;
    private final ParserFactoryFactory parserFactoryFactory;
    private final Queue<ForkClient> pool;

    @Field
    private int poolSize;

    @Field
    private long serverParseTimeoutMillis;

    @Field
    private long serverPulseMillis;

    @Field
    private long serverWaitTimeoutMillis;
    private final Path tikaBin;

    public ForkParser(Path path, ParserFactoryFactory parserFactoryFactory) {
        this.pool = new LinkedList();
        this.java = Arrays.asList("java", "-Xmx32m", "-Djava.awt.headless=true");
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        this.loader = null;
        this.parser = null;
        this.tikaBin = path;
        this.parserFactoryFactory = parserFactoryFactory;
    }

    private synchronized ForkClient acquireClient() {
        ForkClient forkClientPoll;
        while (true) {
            try {
                forkClientPoll = this.pool.poll();
                if (forkClientPoll == null && this.currentlyInUse < this.poolSize) {
                    forkClientPoll = newClient();
                }
                if (forkClientPoll != null && !forkClientPoll.ping()) {
                    forkClientPoll.close();
                    forkClientPoll = null;
                }
                if (forkClientPoll != null) {
                    this.currentlyInUse++;
                } else if (this.currentlyInUse >= this.poolSize) {
                    try {
                        wait();
                    } catch (InterruptedException e10) {
                        throw new TikaException("Interrupted while waiting for a fork parser", e10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return forkClientPoll;
    }

    private ForkClient newClient() {
        TimeoutLimits timeoutLimits = new TimeoutLimits(this.serverPulseMillis, this.serverParseTimeoutMillis, this.serverWaitTimeoutMillis);
        ClassLoader classLoader = this.loader;
        if (classLoader == null && this.parser == null && this.tikaBin != null && this.parserFactoryFactory != null) {
            return new ForkClient(this.tikaBin, this.parserFactoryFactory, this.java, timeoutLimits);
        }
        if (classLoader != null && this.parser != null && this.tikaBin == null && this.parserFactoryFactory == null) {
            return new ForkClient(this.loader, this.parser, this.java, timeoutLimits);
        }
        if (classLoader == null || this.parser != null || this.tikaBin == null || this.parserFactoryFactory == null) {
            throw new IllegalStateException("Unexpected combination of state items");
        }
        return new ForkClient(this.tikaBin, this.parserFactoryFactory, this.loader, this.java, timeoutLimits);
    }

    private synchronized void releaseClient(ForkClient forkClient, boolean z10) {
        try {
            int i10 = this.currentlyInUse - 1;
            this.currentlyInUse = i10;
            if (i10 + this.pool.size() >= this.poolSize || !z10) {
                forkClient.close();
            } else {
                if (this.maxFilesProcessedPerClient <= 0 || forkClient.getFilesProcessed() < this.maxFilesProcessedPerClient) {
                    this.pool.offer(forkClient);
                } else {
                    forkClient.close();
                }
                notifyAll();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            Iterator<ForkClient> it = this.pool.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.pool.clear();
            this.poolSize = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<String> getJavaCommandAsList() {
        return Collections.unmodifiableList(this.java);
    }

    public synchronized int getPoolSize() {
        return this.poolSize;
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return this.parser.getSupportedTypes(parseContext);
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws Throwable {
        if (inputStream == null) {
            throw new NullPointerException("null stream");
        }
        ForkClient forkClientAcquireClient = acquireClient();
        boolean z10 = false;
        try {
            try {
                if (!(contentHandler instanceof AbstractRecursiveParserWrapperHandler)) {
                    contentHandler = new TeeContentHandler(contentHandler, new MetadataContentHandler(metadata));
                }
                Throwable thCall = forkClientAcquireClient.call("parse", inputStream, contentHandler, metadata, parseContext);
                releaseClient(forkClientAcquireClient, true);
                if (thCall instanceof IOException) {
                    throw ((IOException) thCall);
                }
                if (thCall instanceof SAXException) {
                    throw ((SAXException) thCall);
                }
                if (thCall instanceof TikaException) {
                    throw ((TikaException) thCall);
                }
                if (thCall != null) {
                    throw new TikaException("Unexpected error in forked server process", thCall);
                }
            } catch (IOException e10) {
                throw new TikaException("Failed to communicate with a forked parser process. The process has most likely crashed due to some error like running out of memory. A new process will be started for the next parsing request.", e10);
            } catch (TikaException e11) {
                try {
                    throw e11;
                } catch (Throwable th) {
                    th = th;
                    z10 = true;
                    releaseClient(forkClientAcquireClient, z10);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            releaseClient(forkClientAcquireClient, z10);
            throw th;
        }
    }

    public void setJavaCommand(List<String> list) {
        this.java = new ArrayList(list);
    }

    public void setMaxFilesProcessedPerServer(int i10) {
        this.maxFilesProcessedPerClient = i10;
    }

    public synchronized void setPoolSize(int i10) {
        this.poolSize = i10;
    }

    public void setServerParseTimeoutMillis(long j10) {
        this.serverParseTimeoutMillis = j10;
    }

    public void setServerPulseMillis(long j10) {
        this.serverPulseMillis = j10;
    }

    public void setServerWaitTimeoutMillis(long j10) {
        this.serverWaitTimeoutMillis = j10;
    }

    public ForkParser(Path path, ParserFactoryFactory parserFactoryFactory, ClassLoader classLoader) {
        this.pool = new LinkedList();
        this.java = Arrays.asList("java", "-Xmx32m", "-Djava.awt.headless=true");
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        this.parser = null;
        this.loader = classLoader;
        this.tikaBin = path;
        this.parserFactoryFactory = parserFactoryFactory;
    }

    public ForkParser(ClassLoader classLoader, Parser parser) {
        this.pool = new LinkedList();
        this.java = Arrays.asList("java", "-Xmx32m", "-Djava.awt.headless=true");
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        if (!(parser instanceof ForkParser)) {
            this.tikaBin = null;
            this.parserFactoryFactory = null;
            this.loader = classLoader;
            this.parser = parser;
            return;
        }
        throw new IllegalArgumentException("The underlying parser of a ForkParser should not be a ForkParser, but a specific implementation.");
    }

    public ForkParser(ClassLoader classLoader) {
        this(classLoader, new AutoDetectParser());
    }

    public ForkParser() {
        this(ForkParser.class.getClassLoader());
    }
}
