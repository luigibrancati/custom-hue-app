package org.apache.tika.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.exception.WriteLimitReachedException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.sax.TaggedContentHandler;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.ParserUtils;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CompositeParser implements Parser {
    private static final long serialVersionUID = 2192845797749627824L;
    private Parser fallback;
    private List<Parser> parsers;
    private MediaTypeRegistry registry;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeParser(MediaTypeRegistry mediaTypeRegistry, List<Parser> list, Collection<Class<? extends Parser>> collection) {
        this.fallback = new EmptyParser();
        if (collection == null || collection.isEmpty()) {
            this.parsers = list;
        } else {
            this.parsers = new ArrayList();
            for (Parser parser : list) {
                if (!isExcluded(collection, parser.getClass())) {
                    this.parsers.add(parser);
                }
            }
        }
        this.registry = mediaTypeRegistry;
    }

    private boolean assignableFrom(Collection<Class<? extends Parser>> collection, Class<? extends Parser> cls) {
        Iterator<Class<? extends Parser>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean isExcluded(Collection<Class<? extends Parser>> collection, Class<? extends Parser> cls) {
        return collection.contains(cls) || assignableFrom(collection, cls);
    }

    private void recordEmbeddedMetadata(Metadata metadata, ParseContext parseContext) {
        ParseRecord parseRecord = (ParseRecord) parseContext.get(ParseRecord.class);
        if (parseRecord == null) {
            return;
        }
        Iterator<Exception> it = parseRecord.getExceptions().iterator();
        while (it.hasNext()) {
            metadata.add(TikaCoreProperties.EMBEDDED_EXCEPTION, ExceptionUtils.getStackTrace(it.next()));
        }
        Iterator<String> it2 = parseRecord.getWarnings().iterator();
        while (it2.hasNext()) {
            metadata.add(TikaCoreProperties.EMBEDDED_WARNING, it2.next());
        }
        if (parseRecord.isWriteLimitReached()) {
            metadata.set(TikaCoreProperties.WRITE_LIMIT_REACHED, true);
        }
        for (Metadata metadata2 : parseRecord.getMetadataList()) {
            for (String str : metadata2.names()) {
                for (String str2 : metadata2.getValues(str)) {
                    metadata.add(str, str2);
                }
            }
        }
    }

    public Map<MediaType, List<Parser>> findDuplicateParsers(ParseContext parseContext) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (Parser parser : this.parsers) {
            Iterator<MediaType> it = parser.getSupportedTypes(parseContext).iterator();
            while (it.hasNext()) {
                MediaType mediaTypeNormalize = this.registry.normalize(it.next());
                if (map.containsKey(mediaTypeNormalize)) {
                    List arrayList = (List) map2.get(mediaTypeNormalize);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        arrayList.add((Parser) map.get(mediaTypeNormalize));
                        map2.put(mediaTypeNormalize, arrayList);
                    }
                    arrayList.add(parser);
                } else {
                    map.put(mediaTypeNormalize, parser);
                }
            }
        }
        return map2;
    }

    public List<Parser> getAllComponentParsers() {
        return Collections.unmodifiableList(this.parsers);
    }

    public Parser getFallback() {
        return this.fallback;
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.registry;
    }

    public Parser getParser(Metadata metadata) {
        return getParser(metadata, new ParseContext());
    }

    public Map<MediaType, Parser> getParsers(ParseContext parseContext) {
        HashMap map = new HashMap();
        for (Parser parser : this.parsers) {
            Iterator<MediaType> it = parser.getSupportedTypes(parseContext).iterator();
            while (it.hasNext()) {
                map.put(this.registry.normalize(it.next()), parser);
            }
        }
        return map;
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return getParsers(parseContext).keySet();
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        Parser parser = getParser(metadata, parseContext);
        TemporaryResources temporaryResources = new TemporaryResources();
        ParseRecord parseRecord = (ParseRecord) parseContext.get(ParseRecord.class);
        if (parseRecord == null) {
            parseRecord = new ParseRecord();
            parseContext.set(ParseRecord.class, parseRecord);
        }
        try {
            TikaInputStream tikaInputStream = TikaInputStream.get(inputStream, temporaryResources, metadata);
            TaggedContentHandler taggedContentHandler = contentHandler != null ? new TaggedContentHandler(contentHandler) : null;
            String parserClassname = ParserUtils.getParserClassname(parser);
            parseRecord.addParserClass(parserClassname);
            ParserUtils.recordParserDetails(parserClassname, metadata);
            parseRecord.beforeParse();
            try {
                try {
                    parser.parse(tikaInputStream, taggedContentHandler, metadata, parseContext);
                    temporaryResources.dispose();
                    parseRecord.afterParse();
                    if (parseRecord.getDepth() == 0) {
                        metadata.set(TikaCoreProperties.TIKA_PARSED_BY_FULL_SET, parseRecord.getParsers());
                        recordEmbeddedMetadata(metadata, parseContext);
                    }
                } catch (IOException e10) {
                    tikaInputStream.throwIfCauseOf(e10);
                    throw new TikaException("TIKA-198: Illegal IOException from " + String.valueOf(parser), e10);
                } catch (RuntimeException e11) {
                    throw new TikaException("Unexpected RuntimeException from " + String.valueOf(parser), e11);
                }
            } catch (SecurityException e12) {
                throw e12;
            } catch (SAXException e13) {
                WriteLimitReachedException.throwIfWriteLimitReached(e13);
                if (taggedContentHandler != null) {
                    taggedContentHandler.throwIfCauseOf(e13);
                }
                throw new TikaException("TIKA-237: Illegal SAXException from " + String.valueOf(parser), e13);
            }
        } catch (Throwable th) {
            temporaryResources.dispose();
            parseRecord.afterParse();
            if (parseRecord.getDepth() == 0) {
                metadata.set(TikaCoreProperties.TIKA_PARSED_BY_FULL_SET, parseRecord.getParsers());
                recordEmbeddedMetadata(metadata, parseContext);
            }
            throw th;
        }
    }

    public void setFallback(Parser parser) {
        this.fallback = parser;
    }

    public void setMediaTypeRegistry(MediaTypeRegistry mediaTypeRegistry) {
        this.registry = mediaTypeRegistry;
    }

    public void setParsers(Map<MediaType, Parser> map) {
        this.parsers = new ArrayList(map.size());
        for (Map.Entry<MediaType, Parser> entry : map.entrySet()) {
            this.parsers.add(ParserDecorator.withTypes(entry.getValue(), Collections.singleton(entry.getKey())));
        }
    }

    public Parser getParser(Metadata metadata, ParseContext parseContext) {
        Map<MediaType, Parser> parsers = getParsers(parseContext);
        String str = metadata.get(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE);
        if (str == null) {
            str = metadata.get(HttpHeaders.CONTENT_TYPE);
        }
        MediaType supertype = MediaType.parse(str);
        if (supertype != null) {
            supertype = this.registry.normalize(supertype);
        }
        while (supertype != null) {
            Parser parser = parsers.get(supertype);
            if (parser != null) {
                return parser;
            }
            supertype = this.registry.getSupertype(supertype);
        }
        return this.fallback;
    }

    public Map<MediaType, Parser> getParsers() {
        return getParsers(new ParseContext());
    }

    public CompositeParser(MediaTypeRegistry mediaTypeRegistry, List<Parser> list) {
        this(mediaTypeRegistry, list, null);
    }

    public CompositeParser(MediaTypeRegistry mediaTypeRegistry, Parser... parserArr) {
        this(mediaTypeRegistry, (List<Parser>) Arrays.asList(parserArr));
    }

    public CompositeParser() {
        this(new MediaTypeRegistry(), new Parser[0]);
    }
}
