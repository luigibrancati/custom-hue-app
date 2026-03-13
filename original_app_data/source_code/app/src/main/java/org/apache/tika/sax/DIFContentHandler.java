package org.apache.tika.sax;

import java.util.Stack;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class DIFContentHandler extends DefaultHandler {
    private final ContentHandler delegate;
    private final Metadata metadata;
    private static final char[] NEWLINE = {'\n'};
    private static final char[] TABSPACE = {'\t'};
    private static final Attributes EMPTY_ATTRIBUTES = new AttributesImpl();
    private boolean isLeaf = false;
    private final Stack<String> treeStack = new Stack<>();
    private final Stack<String> dataStack = new Stack<>();

    public DIFContentHandler(ContentHandler contentHandler, Metadata metadata) {
        this.delegate = contentHandler;
        this.metadata = metadata;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        String str = new String(cArr, i10, i11);
        this.dataStack.push(str);
        if (this.treeStack.peek().equals("Entry_Title")) {
            ContentHandler contentHandler = this.delegate;
            char[] cArr2 = NEWLINE;
            contentHandler.characters(cArr2, 0, cArr2.length);
            ContentHandler contentHandler2 = this.delegate;
            char[] cArr3 = TABSPACE;
            contentHandler2.characters(cArr3, 0, cArr3.length);
            this.delegate.startElement("", "h3", "h3", EMPTY_ATTRIBUTES);
            String str2 = "Title: " + str;
            this.delegate.characters(str2.toCharArray(), 0, str2.length());
            this.delegate.endElement("", "h3", "h3");
        }
        if (this.treeStack.peek().equals("Southernmost_Latitude") || this.treeStack.peek().equals("Northernmost_Latitude") || this.treeStack.peek().equals("Westernmost_Longitude") || this.treeStack.peek().equals("Easternmost_Longitude")) {
            ContentHandler contentHandler3 = this.delegate;
            char[] cArr4 = NEWLINE;
            contentHandler3.characters(cArr4, 0, cArr4.length);
            ContentHandler contentHandler4 = this.delegate;
            char[] cArr5 = TABSPACE;
            contentHandler4.characters(cArr5, 0, cArr5.length);
            this.delegate.characters(cArr5, 0, cArr5.length);
            ContentHandler contentHandler5 = this.delegate;
            Attributes attributes = EMPTY_ATTRIBUTES;
            contentHandler5.startElement("", "tr", "tr", attributes);
            this.delegate.startElement("", "td", "td", attributes);
            String str3 = this.treeStack.peek() + " : ";
            this.delegate.characters(str3.toCharArray(), 0, str3.length());
            this.delegate.endElement("", "td", "td");
            this.delegate.startElement("", "td", "td", attributes);
            this.delegate.characters(str.toCharArray(), 0, str.length());
            this.delegate.endElement("", "td", "td");
            this.delegate.endElement("", "tr", "tr");
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.delegate.endDocument();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (str2.equals("Spatial_Coverage")) {
            ContentHandler contentHandler = this.delegate;
            char[] cArr = NEWLINE;
            contentHandler.characters(cArr, 0, cArr.length);
            ContentHandler contentHandler2 = this.delegate;
            char[] cArr2 = TABSPACE;
            contentHandler2.characters(cArr2, 0, cArr2.length);
            this.delegate.endElement("", "table", "table");
        }
        if (this.isLeaf) {
            Stack stack = (Stack) this.treeStack.clone();
            StringBuilder sb2 = new StringBuilder();
            while (!stack.isEmpty()) {
                if (sb2.length() == 0) {
                    sb2 = new StringBuilder((String) stack.pop());
                } else {
                    sb2.insert(0, ((String) stack.pop()) + "-");
                }
            }
            this.metadata.add(sb2.toString(), this.dataStack.peek());
            this.isLeaf = false;
        }
        this.treeStack.pop();
        this.dataStack.pop();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        this.delegate.ignorableWhitespace(cArr, i10, i11);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.delegate.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        this.delegate.startDocument();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        this.isLeaf = true;
        if (str2.equals("Spatial_Coverage")) {
            ContentHandler contentHandler = this.delegate;
            char[] cArr = NEWLINE;
            contentHandler.characters(cArr, 0, cArr.length);
            ContentHandler contentHandler2 = this.delegate;
            char[] cArr2 = TABSPACE;
            contentHandler2.characters(cArr2, 0, cArr2.length);
            ContentHandler contentHandler3 = this.delegate;
            Attributes attributes2 = EMPTY_ATTRIBUTES;
            contentHandler3.startElement("", "h3", "h3", attributes2);
            this.delegate.characters("Geographic Data: ".toCharArray(), 0, 17);
            this.delegate.endElement("", "h3", "h3");
            this.delegate.characters(cArr, 0, cArr.length);
            this.delegate.characters(cArr2, 0, cArr2.length);
            this.delegate.startElement("", "table", "table", attributes2);
        }
        this.treeStack.push(str2);
    }

    public String toString() {
        return this.delegate.toString();
    }
}
