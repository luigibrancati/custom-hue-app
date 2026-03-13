package org.apache.tika.sax;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.tika.parser.ParseContext;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class BasicContentHandlerFactory implements ContentHandlerFactory, WriteLimiter {
    private final ParseContext parseContext;
    private final boolean throwOnWriteLimitReached;
    private final HANDLER_TYPE type;
    private final int writeLimit;

    /* JADX INFO: renamed from: org.apache.tika.sax.BasicContentHandlerFactory$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE;

        static {
            int[] iArr = new int[HANDLER_TYPE.values().length];
            $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE = iArr;
            try {
                iArr[HANDLER_TYPE.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[HANDLER_TYPE.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[HANDLER_TYPE.XML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[HANDLER_TYPE.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum HANDLER_TYPE {
        BODY,
        IGNORE,
        TEXT,
        HTML,
        XML
    }

    public BasicContentHandlerFactory(HANDLER_TYPE handler_type, int i10) {
        this(handler_type, i10, true, null);
    }

    private ContentHandler getFormatHandler() {
        int i10 = AnonymousClass1.$SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[this.type.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? new ToTextContentHandler() : new ToXMLContentHandler() : new ToHTMLContentHandler() : new ToTextContentHandler();
    }

    public static HANDLER_TYPE parseHandlerType(String str, HANDLER_TYPE handler_type) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase) {
                case "ignore":
                    return HANDLER_TYPE.IGNORE;
                case "txt":
                    return HANDLER_TYPE.TEXT;
                case "xml":
                    return HANDLER_TYPE.XML;
                case "body":
                    return HANDLER_TYPE.BODY;
                case "html":
                    return HANDLER_TYPE.HTML;
                case "text":
                    return HANDLER_TYPE.TEXT;
            }
        }
        return handler_type;
    }

    @Override // org.apache.tika.sax.ContentHandlerFactory
    public ContentHandler getNewContentHandler() {
        HANDLER_TYPE handler_type = this.type;
        if (handler_type == HANDLER_TYPE.BODY) {
            return new BodyContentHandler(new WriteOutContentHandler(new ToTextContentHandler(), this.writeLimit, this.throwOnWriteLimitReached, this.parseContext));
        }
        if (handler_type == HANDLER_TYPE.IGNORE) {
            return new DefaultHandler();
        }
        ContentHandler formatHandler = getFormatHandler();
        return this.writeLimit < 0 ? formatHandler : new WriteOutContentHandler(formatHandler, this.writeLimit, this.throwOnWriteLimitReached, this.parseContext);
    }

    public HANDLER_TYPE getType() {
        return this.type;
    }

    @Override // org.apache.tika.sax.WriteLimiter
    public int getWriteLimit() {
        return this.writeLimit;
    }

    @Override // org.apache.tika.sax.WriteLimiter
    public boolean isThrowOnWriteLimitReached() {
        return this.throwOnWriteLimitReached;
    }

    public BasicContentHandlerFactory(HANDLER_TYPE handler_type, int i10, boolean z10, ParseContext parseContext) {
        this.type = handler_type;
        this.writeLimit = i10;
        this.throwOnWriteLimitReached = z10;
        this.parseContext = parseContext;
        if (!z10 && parseContext == null) {
            throw new IllegalArgumentException("parse context must not be null if throwOnWriteLimitReached is false");
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerFactory
    public ContentHandler getNewContentHandler(OutputStream outputStream, Charset charset) {
        HANDLER_TYPE handler_type = this.type;
        if (handler_type == HANDLER_TYPE.IGNORE) {
            return new DefaultHandler();
        }
        try {
            if (this.writeLimit > -1) {
                int i10 = AnonymousClass1.$SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[handler_type.ordinal()];
                if (i10 == 1) {
                    return new WriteOutContentHandler(new ToTextContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                if (i10 == 2) {
                    return new WriteOutContentHandler(new ToHTMLContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                if (i10 == 3) {
                    return new WriteOutContentHandler(new ToXMLContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                if (i10 != 4) {
                    return new WriteOutContentHandler(new ToTextContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                return new WriteOutContentHandler(new BodyContentHandler(new OutputStreamWriter(outputStream, charset)), this.writeLimit);
            }
            int i11 = AnonymousClass1.$SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE[handler_type.ordinal()];
            if (i11 == 1) {
                return new ToTextContentHandler(outputStream, charset.name());
            }
            if (i11 == 2) {
                return new ToHTMLContentHandler(outputStream, charset.name());
            }
            if (i11 == 3) {
                return new ToXMLContentHandler(outputStream, charset.name());
            }
            if (i11 != 4) {
                return new ToTextContentHandler(outputStream, charset.name());
            }
            return new BodyContentHandler(new OutputStreamWriter(outputStream, charset));
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("couldn't find charset for name: " + String.valueOf(charset));
        }
    }
}
