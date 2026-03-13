package org.apache.tika.pipes.fetcher;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface RangeFetcher extends Fetcher {
    default InputStream fetch(String str, long j10, long j11, Metadata metadata) {
        return fetch(str, j10, j11, metadata, new ParseContext());
    }

    InputStream fetch(String str, long j10, long j11, Metadata metadata, ParseContext parseContext);
}
