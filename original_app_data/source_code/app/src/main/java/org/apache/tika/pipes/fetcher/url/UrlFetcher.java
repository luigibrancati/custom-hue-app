package org.apache.tika.pipes.fetcher.url;

import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.fetcher.AbstractFetcher;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class UrlFetcher extends AbstractFetcher {
    @Override // org.apache.tika.pipes.fetcher.Fetcher
    public InputStream fetch(String str, Metadata metadata, ParseContext parseContext) {
        if (str.contains(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            throw new IllegalArgumentException("URL must not contain \u0000. Please review the life decisions that led you to requesting a URL with this character in it.");
        }
        if (str.toLowerCase(Locale.US).trim().startsWith("file:")) {
            throw new IllegalArgumentException("The UrlFetcher does not fetch from file shares; please use the FileSystemFetcher");
        }
        return TikaInputStream.get(new URL(str), metadata);
    }
}
