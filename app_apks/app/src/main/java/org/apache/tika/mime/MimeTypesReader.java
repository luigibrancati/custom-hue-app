package org.apache.tika.mime;

import Ne.h;
import af.c;
import af.e;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
import org.apache.tika.exception.TikaException;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class MimeTypesReader extends DefaultHandler implements MimeTypesReaderMetKeys {
    protected int priority;
    protected final MimeTypes types;
    private static final ReentrantReadWriteLock READ_WRITE_LOCK = new ReentrantReadWriteLock();
    private static int POOL_SIZE = 10;
    private static ArrayBlockingQueue<SAXParser> SAX_PARSERS = new ArrayBlockingQueue<>(POOL_SIZE);
    static c LOG = e.l(MimeTypesReader.class);
    protected MimeType type = null;
    protected StringBuilder characters = null;
    private ClauseRecord current = new ClauseRecord(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class ClauseRecord {
        private Clause clause;
        private final ClauseRecord parent;
        private List<Clause> subclauses = null;

        public ClauseRecord(Clause clause) {
            this.parent = MimeTypesReader.this.current;
            this.clause = clause;
        }

        public List<Clause> getClauses() {
            return this.subclauses;
        }

        public void stop() {
            Clause clause = this.clause;
            if (clause instanceof MinShouldMatchVal) {
                this.clause = new MinShouldMatchClause(((MinShouldMatchVal) clause).getVal(), this.subclauses);
            } else {
                List<Clause> list = this.subclauses;
                if (list != null) {
                    this.clause = new AndClause(this.clause, list.size() == 1 ? this.subclauses.get(0) : new OrClause(this.subclauses));
                }
            }
            ClauseRecord clauseRecord = this.parent;
            List<Clause> list2 = clauseRecord.subclauses;
            if (list2 == null) {
                clauseRecord.subclauses = Collections.singletonList(this.clause);
            } else {
                if (list2.size() == 1) {
                    this.parent.subclauses = new ArrayList(this.parent.subclauses);
                }
                this.parent.subclauses.add(this.clause);
            }
            MimeTypesReader mimeTypesReader = MimeTypesReader.this;
            mimeTypesReader.current = mimeTypesReader.current.parent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class MinShouldMatchVal implements Clause {
        private final int val;

        public MinShouldMatchVal(int i10) {
            this.val = i10;
        }

        @Override // org.apache.tika.mime.Clause
        public boolean eval(byte[] bArr) {
            throw new IllegalStateException("This should never be used on this placeholder class");
        }

        public int getVal() {
            return this.val;
        }

        @Override // org.apache.tika.mime.Clause
        public int size() {
            return 0;
        }
    }

    static {
        try {
            setPoolSize(POOL_SIZE);
        } catch (TikaException e10) {
            throw new RuntimeException("problem initializing SAXParser pool", e10);
        }
    }

    public MimeTypesReader(MimeTypes mimeTypes) {
        this.types = mimeTypes;
    }

    private static SAXParser acquireSAXParser() {
        SAXParser sAXParserPoll;
        do {
            try {
                try {
                    ReentrantReadWriteLock reentrantReadWriteLock = READ_WRITE_LOCK;
                    reentrantReadWriteLock.readLock().lock();
                    sAXParserPoll = SAX_PARSERS.poll(10L, TimeUnit.MILLISECONDS);
                    reentrantReadWriteLock.readLock().unlock();
                } catch (InterruptedException e10) {
                    throw new TikaException("interrupted while waiting for SAXParser", e10);
                }
            } catch (Throwable th) {
                READ_WRITE_LOCK.readLock().unlock();
                throw th;
            }
        } while (sAXParserPoll == null);
        return sAXParserPoll;
    }

    private static SAXParser newSAXParser() throws TikaException {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setNamespaceAware(false);
        try {
            sAXParserFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (ParserConfigurationException | SAXException unused) {
            LOG.c("can't set secure processing feature on: " + String.valueOf(sAXParserFactoryNewInstance.getClass()) + ". User assumes responsibility for consequences.");
        }
        try {
            return sAXParserFactoryNewInstance.newSAXParser();
        } catch (ParserConfigurationException | SAXException e10) {
            throw new TikaException("Can't create new sax parser", e10);
        }
    }

    private static void releaseParser(SAXParser sAXParser) {
        try {
            sAXParser.reset();
        } catch (UnsupportedOperationException unused) {
        }
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = READ_WRITE_LOCK;
            reentrantReadWriteLock.readLock().lock();
            SAX_PARSERS.offer(sAXParser);
            reentrantReadWriteLock.readLock().unlock();
        } catch (Throwable th) {
            READ_WRITE_LOCK.readLock().unlock();
            throw th;
        }
    }

    public static void setPoolSize(int i10) {
        try {
            READ_WRITE_LOCK.writeLock().lock();
            SAX_PARSERS = new ArrayBlockingQueue<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                SAX_PARSERS.offer(newSAXParser());
            }
            POOL_SIZE = i10;
        } finally {
            READ_WRITE_LOCK.writeLock().unlock();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) {
        StringBuilder sb2 = this.characters;
        if (sb2 != null) {
            sb2.append(cArr, i10, i11);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (this.type != null) {
            if ("mime-type".equals(str3)) {
                this.type = null;
                return;
            }
            if (MimeTypesReaderMetKeys.COMMENT_TAG.equals(str3)) {
                this.type.setDescription(this.characters.toString().trim());
                this.characters = null;
                return;
            }
            if (MimeTypesReaderMetKeys.ACRONYM_TAG.equals(str3)) {
                this.type.setAcronym(this.characters.toString().trim());
                this.characters = null;
                return;
            }
            if (MimeTypesReaderMetKeys.TIKA_UTI_TAG.equals(str3)) {
                this.type.setUniformTypeIdentifier(this.characters.toString().trim());
                this.characters = null;
                return;
            }
            if (MimeTypesReaderMetKeys.TIKA_LINK_TAG.equals(str3)) {
                try {
                    this.type.addLink(new URI(this.characters.toString().trim()));
                    this.characters = null;
                    return;
                } catch (URISyntaxException e10) {
                    throw new IllegalArgumentException("unable to parse link: " + String.valueOf(this.characters), e10);
                }
            }
            if ("match".equals(str3)) {
                this.current.stop();
                return;
            }
            if (MimeTypesReaderMetKeys.MAGIC_TAG.equals(str3)) {
                for (Clause clause : this.current.getClauses()) {
                    MimeType mimeType = this.type;
                    mimeType.addMagic(new Magic(mimeType, this.priority, clause));
                }
                this.current = null;
            }
        }
    }

    public void handleGlobError(MimeType mimeType, String str, MimeTypeException mimeTypeException, String str2, Attributes attributes) throws SAXException {
        throw new SAXException(mimeTypeException);
    }

    public void handleMimeError(String str, MimeTypeException mimeTypeException, String str2, Attributes attributes) throws SAXException {
        throw new SAXException(mimeTypeException);
    }

    public void read(InputStream inputStream) {
        SAXParser sAXParserAcquireSAXParser = null;
        try {
            try {
                sAXParserAcquireSAXParser = acquireSAXParser();
                sAXParserAcquireSAXParser.parse(inputStream, this);
                releaseParser(sAXParserAcquireSAXParser);
            } catch (TikaException e10) {
                throw new MimeTypeException("Unable to create an XML parser", e10);
            } catch (SAXException e11) {
                throw new MimeTypeException("Invalid type configuration", e11);
            }
        } catch (Throwable th) {
            if (sAXParserAcquireSAXParser != null) {
                releaseParser(sAXParserAcquireSAXParser);
            }
            throw th;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) {
        return new InputSource(new h(new byte[0]));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (this.type == null) {
            if ("mime-type".equals(str3)) {
                String value = attributes.getValue("type");
                boolean zEquals = "true".equals(attributes.getValue(MimeTypesReaderMetKeys.INTERPRETED_ATTR));
                try {
                    MimeType mimeTypeForName = this.types.forName(value);
                    this.type = mimeTypeForName;
                    mimeTypeForName.setInterpreted(zEquals);
                    return;
                } catch (MimeTypeException e10) {
                    handleMimeError(value, e10, str3, attributes);
                    return;
                }
            }
            return;
        }
        if (MimeTypesReaderMetKeys.ALIAS_TAG.equals(str3)) {
            this.types.addAlias(this.type, MediaType.parse(attributes.getValue("type")));
            return;
        }
        if (MimeTypesReaderMetKeys.SUB_CLASS_OF_TAG.equals(str3)) {
            this.types.setSuperType(this.type, MediaType.parse(attributes.getValue("type")));
            return;
        }
        if (MimeTypesReaderMetKeys.ACRONYM_TAG.equals(str3) || MimeTypesReaderMetKeys.COMMENT_TAG.equals(str3) || MimeTypesReaderMetKeys.TIKA_LINK_TAG.equals(str3) || MimeTypesReaderMetKeys.TIKA_UTI_TAG.equals(str3)) {
            this.characters = new StringBuilder();
            return;
        }
        if (MimeTypesReaderMetKeys.GLOB_TAG.equals(str3)) {
            String value2 = attributes.getValue(MimeTypesReaderMetKeys.PATTERN_ATTR);
            String value3 = attributes.getValue(MimeTypesReaderMetKeys.ISREGEX_ATTR);
            if (value2 != null) {
                try {
                    this.types.addPattern(this.type, value2, Boolean.parseBoolean(value3));
                    return;
                } catch (MimeTypeException e11) {
                    handleGlobError(this.type, value2, e11, str3, attributes);
                    return;
                }
            }
            return;
        }
        if (MimeTypesReaderMetKeys.ROOT_XML_TAG.equals(str3)) {
            this.type.addRootXML(attributes.getValue(MimeTypesReaderMetKeys.NS_URI_ATTR), attributes.getValue(MimeTypesReaderMetKeys.LOCAL_NAME_ATTR));
            return;
        }
        if (!"match".equals(str3)) {
            if (MimeTypesReaderMetKeys.MAGIC_TAG.equals(str3)) {
                String value4 = attributes.getValue("priority");
                if (value4 == null || value4.length() <= 0) {
                    this.priority = 50;
                } else {
                    this.priority = Integer.parseInt(value4);
                }
                this.current = new ClauseRecord(null);
                return;
            }
            return;
        }
        if (attributes.getValue(MimeTypesReaderMetKeys.MATCH_MINSHOULDMATCH_ATTR) != null) {
            this.current = new ClauseRecord(new MinShouldMatchVal(Integer.parseInt(attributes.getValue(MimeTypesReaderMetKeys.MATCH_MINSHOULDMATCH_ATTR))));
            return;
        }
        String value5 = attributes.getValue("type");
        String value6 = attributes.getValue(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        String value7 = attributes.getValue("value");
        String value8 = attributes.getValue(MimeTypesReaderMetKeys.MATCH_MASK_ATTR);
        if (value5 == null) {
            value5 = "string";
        }
        this.current = new ClauseRecord(new MagicMatch(this.type.getType(), value5, value6, value7, value8));
    }

    public void read(Document document) {
        try {
            XMLReaderUtils.getTransformer().transform(new DOMSource(document), new SAXResult(this));
        } catch (TransformerException | TikaException e10) {
            throw new MimeTypeException("Failed to parse type registry", e10);
        }
    }
}
