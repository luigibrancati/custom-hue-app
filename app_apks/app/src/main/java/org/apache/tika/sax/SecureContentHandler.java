package org.apache.tika.sax;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.util.LinkedList;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TikaInputStream;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class SecureContentHandler extends ContentHandlerDecorator {
    private long characterCount;
    private int currentDepth;
    private int maxDepth;
    private int maxPackageEntryDepth;
    private final LinkedList<Integer> packageEntryDepths;
    private long ratio;
    private final TikaInputStream stream;
    private long threshold;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class SecureSAXException extends SAXException {
        private static final long serialVersionUID = 2285245380321771445L;

        public SecureSAXException(String str) {
            super(str);
        }

        public boolean isCausedBy(SecureContentHandler secureContentHandler) {
            return SecureContentHandler.this == secureContentHandler;
        }
    }

    public SecureContentHandler(ContentHandler contentHandler, TikaInputStream tikaInputStream) {
        super(contentHandler);
        this.packageEntryDepths = new LinkedList<>();
        this.characterCount = 0L;
        this.currentDepth = 0;
        this.threshold = 1000000L;
        this.ratio = 100L;
        this.maxDepth = 100;
        this.maxPackageEntryDepth = 10;
        this.stream = tikaInputStream;
    }

    private long getByteCount() throws SAXException {
        try {
            return this.stream.hasLength() ? this.stream.getLength() : this.stream.getPosition();
        } catch (IOException e10) {
            throw new SAXException("Unable to get stream length", e10);
        }
    }

    public void advance(int i10) throws SAXException {
        this.characterCount += (long) i10;
        long byteCount = getByteCount();
        long j10 = this.characterCount;
        if (j10 <= this.threshold || j10 <= this.ratio * byteCount) {
            return;
        }
        throw new SecureSAXException("Suspected zip bomb: " + byteCount + " input bytes produced " + this.characterCount + " output characters");
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        advance(i11);
        super.characters(cArr, i10, i11);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
        if (!this.packageEntryDepths.isEmpty() && this.packageEntryDepths.getLast().intValue() == this.currentDepth) {
            this.packageEntryDepths.removeLast();
        }
        this.currentDepth--;
    }

    public long getMaximumCompressionRatio() {
        return this.ratio;
    }

    public int getMaximumDepth() {
        return this.maxDepth;
    }

    public int getMaximumPackageEntryDepth() {
        return this.maxPackageEntryDepth;
    }

    public long getOutputThreshold() {
        return this.threshold;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        advance(i11);
        super.ignorableWhitespace(cArr, i10, i11);
    }

    public void setMaximumCompressionRatio(long j10) {
        this.ratio = j10;
    }

    public void setMaximumDepth(int i10) {
        this.maxDepth = i10;
    }

    public void setMaximumPackageEntryDepth(int i10) {
        this.maxPackageEntryDepth = i10;
    }

    public void setOutputThreshold(long j10) {
        this.threshold = j10;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        int i10 = this.currentDepth + 1;
        this.currentDepth = i10;
        if (i10 >= this.maxDepth) {
            throw new SecureSAXException("Suspected zip bomb: " + this.currentDepth + " levels of XML element nesting");
        }
        if ("div".equals(str3) && "package-entry".equals(attributes.getValue(Constants.CLASS))) {
            this.packageEntryDepths.addLast(Integer.valueOf(this.currentDepth));
            if (this.packageEntryDepths.size() >= this.maxPackageEntryDepth) {
                throw new SecureSAXException("Suspected zip bomb: " + this.packageEntryDepths.size() + " levels of package entry nesting");
            }
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void throwIfCauseOf(SAXException sAXException) throws TikaException {
        if ((sAXException instanceof SecureSAXException) && ((SecureSAXException) sAXException).isCausedBy(this)) {
            throw new TikaException("Zip bomb detected!", sAXException);
        }
    }
}
