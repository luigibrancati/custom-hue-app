package org.apache.tika.parser;

import java.io.Serializable;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.extractor.EmbeddedDocumentExtractorFactory;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.writefilter.MetadataWriteFilterFactory;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.sax.ContentHandlerDecoratorFactory;
import org.w3c.dom.Element;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AutoDetectParserConfig extends ConfigBase implements Serializable {
    private ContentHandlerDecoratorFactory contentHandlerDecoratorFactory;
    private DigestingParser.DigesterFactory digesterFactory;
    private EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory;
    private Long maximumCompressionRatio;
    private Integer maximumDepth;
    private Integer maximumPackageEntryDepth;
    private MetadataWriteFilterFactory metadataWriteFilterFactory;
    private Long outputThreshold;
    private Long spoolToDisk;
    private boolean throwOnZeroBytes;
    private static ContentHandlerDecoratorFactory NOOP_CONTENT_HANDLER_DECORATOR_FACTORY = new ContentHandlerDecoratorFactory() { // from class: org.apache.tika.parser.AutoDetectParserConfig.1
        @Override // org.apache.tika.sax.ContentHandlerDecoratorFactory
        public ContentHandler decorate(ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
            return contentHandler;
        }
    };
    public static AutoDetectParserConfig DEFAULT = new AutoDetectParserConfig();

    public AutoDetectParserConfig(Long l10, Long l11, Long l12, Integer num, Integer num2) {
        this.metadataWriteFilterFactory = null;
        this.embeddedDocumentExtractorFactory = null;
        this.contentHandlerDecoratorFactory = NOOP_CONTENT_HANDLER_DECORATOR_FACTORY;
        this.digesterFactory = null;
        this.throwOnZeroBytes = true;
        this.spoolToDisk = l10;
        this.outputThreshold = l11;
        this.maximumCompressionRatio = l12;
        this.maximumDepth = num;
        this.maximumPackageEntryDepth = num2;
    }

    public static AutoDetectParserConfig load(Element element) {
        return (AutoDetectParserConfig) ConfigBase.buildSingle("autoDetectParserConfig", AutoDetectParserConfig.class, element, DEFAULT);
    }

    public ContentHandlerDecoratorFactory getContentHandlerDecoratorFactory() {
        return this.contentHandlerDecoratorFactory;
    }

    public DigestingParser.DigesterFactory getDigesterFactory() {
        return this.digesterFactory;
    }

    public EmbeddedDocumentExtractorFactory getEmbeddedDocumentExtractorFactory() {
        return this.embeddedDocumentExtractorFactory;
    }

    public Long getMaximumCompressionRatio() {
        return this.maximumCompressionRatio;
    }

    public Integer getMaximumDepth() {
        return this.maximumDepth;
    }

    public Integer getMaximumPackageEntryDepth() {
        return this.maximumPackageEntryDepth;
    }

    public MetadataWriteFilterFactory getMetadataWriteFilterFactory() {
        return this.metadataWriteFilterFactory;
    }

    public Long getOutputThreshold() {
        return this.outputThreshold;
    }

    public Long getSpoolToDisk() {
        return this.spoolToDisk;
    }

    public boolean getThrowOnZeroBytes() {
        return this.throwOnZeroBytes;
    }

    public void setContentHandlerDecoratorFactory(ContentHandlerDecoratorFactory contentHandlerDecoratorFactory) {
        this.contentHandlerDecoratorFactory = contentHandlerDecoratorFactory;
    }

    public void setDigesterFactory(DigestingParser.DigesterFactory digesterFactory) {
        this.digesterFactory = digesterFactory;
    }

    public void setEmbeddedDocumentExtractorFactory(EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory) {
        this.embeddedDocumentExtractorFactory = embeddedDocumentExtractorFactory;
    }

    public void setMaximumCompressionRatio(long j10) {
        this.maximumCompressionRatio = Long.valueOf(j10);
    }

    public void setMaximumDepth(int i10) {
        this.maximumDepth = Integer.valueOf(i10);
    }

    public void setMaximumPackageEntryDepth(int i10) {
        this.maximumPackageEntryDepth = Integer.valueOf(i10);
    }

    public void setMetadataWriteFilterFactory(MetadataWriteFilterFactory metadataWriteFilterFactory) {
        this.metadataWriteFilterFactory = metadataWriteFilterFactory;
    }

    public void setOutputThreshold(long j10) {
        this.outputThreshold = Long.valueOf(j10);
    }

    public void setSpoolToDisk(long j10) {
        this.spoolToDisk = Long.valueOf(j10);
    }

    public void setThrowOnZeroBytes(boolean z10) {
        this.throwOnZeroBytes = z10;
    }

    public String toString() {
        return "AutoDetectParserConfig{spoolToDisk=" + this.spoolToDisk + ", outputThreshold=" + this.outputThreshold + ", maximumCompressionRatio=" + this.maximumCompressionRatio + ", maximumDepth=" + this.maximumDepth + ", maximumPackageEntryDepth=" + this.maximumPackageEntryDepth + ", metadataWriteFilterFactory=" + String.valueOf(this.metadataWriteFilterFactory) + ", embeddedDocumentExtractorFactory=" + String.valueOf(this.embeddedDocumentExtractorFactory) + ", contentHandlerDecoratorFactory=" + String.valueOf(this.contentHandlerDecoratorFactory) + ", digesterFactory=" + String.valueOf(this.digesterFactory) + ", throwOnZeroBytes=" + this.throwOnZeroBytes + "}";
    }

    public AutoDetectParserConfig() {
        this.spoolToDisk = null;
        this.outputThreshold = null;
        this.maximumCompressionRatio = null;
        this.maximumDepth = null;
        this.maximumPackageEntryDepth = null;
        this.metadataWriteFilterFactory = null;
        this.embeddedDocumentExtractorFactory = null;
        this.contentHandlerDecoratorFactory = NOOP_CONTENT_HANDLER_DECORATOR_FACTORY;
        this.digesterFactory = null;
        this.throwOnZeroBytes = true;
    }
}
