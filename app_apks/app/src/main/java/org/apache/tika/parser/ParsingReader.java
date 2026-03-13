package org.apache.tika.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.concurrent.Executor;
import org.apache.tika.exception.ZeroByteFileException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.sax.BodyContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ParsingReader extends Reader {
    private final ParseContext context;
    private final Metadata metadata;
    private final Parser parser;
    private final Reader reader;
    private final InputStream stream;
    private transient Throwable throwable;
    private final Writer writer;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class ParsingTask implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                ParsingReader.this.parser.parse(ParsingReader.this.stream, new BodyContentHandler(ParsingReader.this.writer), ParsingReader.this.metadata, ParsingReader.this.context);
            } catch (Throwable th) {
                ParsingReader.this.throwable = th;
            }
            try {
                ParsingReader.this.stream.close();
            } catch (Throwable th2) {
                if (ParsingReader.this.throwable == null) {
                    ParsingReader.this.throwable = th2;
                }
            }
            try {
                ParsingReader.this.writer.close();
            } catch (Throwable th3) {
                if (ParsingReader.this.throwable == null) {
                    ParsingReader.this.throwable = th3;
                }
            }
        }

        private ParsingTask() {
        }
    }

    public ParsingReader(InputStream inputStream) {
        this(new AutoDetectParser(), inputStream, new Metadata(), new ParseContext());
        this.context.set(Parser.class, this.parser);
    }

    public static /* synthetic */ void a(Metadata metadata, Runnable runnable) {
        String str;
        String str2 = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        if (str2 != null) {
            str = "Apache Tika: " + str2;
        } else {
            str = "Apache Tika";
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        thread.start();
    }

    private static Metadata getMetadata(String str) {
        Metadata metadata = new Metadata();
        if (str != null && str.length() > 0) {
            metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, str);
        }
        return metadata;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        Throwable th = this.throwable;
        if (th instanceof ZeroByteFileException) {
            return -1;
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th == null) {
            return this.reader.read(cArr, i10, i11);
        }
        throw new IOException("", this.throwable);
    }

    public ParsingReader(InputStream inputStream, String str) {
        this(new AutoDetectParser(), inputStream, getMetadata(str), new ParseContext());
        this.context.set(Parser.class, this.parser);
    }

    public ParsingReader(Path path) {
        this(Files.newInputStream(path, new OpenOption[0]), path.getFileName().toString());
    }

    public ParsingReader(File file) {
        this(new FileInputStream(file), file.getName());
    }

    public ParsingReader(Parser parser, InputStream inputStream, final Metadata metadata, ParseContext parseContext) {
        this(parser, inputStream, metadata, parseContext, new Executor() { // from class: org.apache.tika.parser.c
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ParsingReader.a(metadata, runnable);
            }
        });
    }

    public ParsingReader(Parser parser, InputStream inputStream, Metadata metadata, ParseContext parseContext, Executor executor) throws IOException {
        this.parser = parser;
        PipedReader pipedReader = new PipedReader();
        BufferedReader bufferedReader = new BufferedReader(pipedReader);
        this.reader = bufferedReader;
        try {
            this.writer = new PipedWriter(pipedReader);
            this.stream = inputStream;
            this.metadata = metadata;
            this.context = parseContext;
            executor.execute(new ParsingTask());
            bufferedReader.mark(1);
            bufferedReader.read();
            bufferedReader.reset();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
