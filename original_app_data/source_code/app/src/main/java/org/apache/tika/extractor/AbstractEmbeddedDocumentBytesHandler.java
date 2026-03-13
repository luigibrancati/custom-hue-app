package org.apache.tika.extractor;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.tika.io.FilenameUtils;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.utils.StringUtils;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractEmbeddedDocumentBytesHandler implements EmbeddedDocumentBytesHandler {
    List<Integer> ids = new ArrayList();

    @Override // org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i10, Metadata metadata, InputStream inputStream) {
        this.ids.add(Integer.valueOf(i10));
    }

    public String getEmitKey(String str, int i10, EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig, Metadata metadata) {
        String strLeftPad = embeddedDocumentBytesConfig.getZeroPadName() > 0 ? StringUtils.leftPad(Integer.toString(i10), embeddedDocumentBytesConfig.getZeroPadName(), WebrtcBuildVersion.maint_version) : Integer.toString(i10);
        StringBuilder sb2 = new StringBuilder();
        if (StringUtils.isBlank(embeddedDocumentBytesConfig.getEmitKeyBase())) {
            sb2.append(str);
            sb2.append("/");
            sb2.append(FilenameUtils.getName(str));
        } else {
            sb2.append(embeddedDocumentBytesConfig.getEmitKeyBase());
        }
        sb2.append(embeddedDocumentBytesConfig.getEmbeddedIdPrefix());
        sb2.append(strLeftPad);
        if (embeddedDocumentBytesConfig.getSuffixStrategy().equals(EmbeddedDocumentBytesConfig.SUFFIX_STRATEGY.EXISTING)) {
            sb2.append(FilenameUtils.getSuffixFromPath(metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY)).toLowerCase(Locale.US));
        }
        return sb2.toString();
    }

    @Override // org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public List<Integer> getIds() {
        return this.ids;
    }
}
