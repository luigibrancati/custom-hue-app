package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DOMDeserializer<T> extends FromStringDeserializer<T> {
    private static final DocumentBuilderFactory DEFAULT_PARSER_FACTORY;
    private static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class DocumentDeserializer extends DOMDeserializer<Document> {
        private static final long serialVersionUID = 1;

        public DocumentDeserializer() {
            super(Document.class);
        }

        @Override // com.fasterxml.jackson.databind.ext.DOMDeserializer, com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Document _deserialize(String str, DeserializationContext deserializationContext) {
            return parse(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class NodeDeserializer extends DOMDeserializer<Node> {
        private static final long serialVersionUID = 1;

        public NodeDeserializer() {
            super(Node.class);
        }

        @Override // com.fasterxml.jackson.databind.ext.DOMDeserializer, com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Node _deserialize(String str, DeserializationContext deserializationContext) {
            return parse(str);
        }
    }

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Error | ParserConfigurationException unused) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Throwable unused2) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Throwable unused3) {
        }
        DEFAULT_PARSER_FACTORY = documentBuilderFactoryNewInstance;
    }

    public DOMDeserializer(Class<T> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public abstract T _deserialize(String str, DeserializationContext deserializationContext);

    public DocumentBuilder documentBuilder() {
        return DEFAULT_PARSER_FACTORY.newDocumentBuilder();
    }

    public final Document parse(String str) {
        try {
            return documentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e10) {
            throw new IllegalArgumentException("Failed to parse JSON String as XML: " + e10.getMessage(), e10);
        }
    }
}
