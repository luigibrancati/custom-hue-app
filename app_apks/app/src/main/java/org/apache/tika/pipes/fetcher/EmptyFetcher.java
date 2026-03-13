package org.apache.tika.pipes.fetcher;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EmptyFetcher implements Fetcher {
    @Override // org.apache.tika.pipes.fetcher.Fetcher
    public InputStream fetch(String str, Metadata metadata, ParseContext parseContext) {
        return null;
    }

    @Override // org.apache.tika.pipes.fetcher.Fetcher
    public String getName() {
        return "empty";
    }
}
