package org.apache.tika.sax;

import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ContentHandlerFactory extends Serializable {
    ContentHandler getNewContentHandler();

    ContentHandler getNewContentHandler(OutputStream outputStream, Charset charset);
}
