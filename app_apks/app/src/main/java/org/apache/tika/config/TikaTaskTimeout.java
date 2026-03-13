package org.apache.tika.config;

import org.apache.tika.parser.ParseContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TikaTaskTimeout {
    private final long timeoutMillis;

    public TikaTaskTimeout(long j10) {
        this.timeoutMillis = j10;
    }

    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public static long getTimeoutMillis(ParseContext parseContext, long j10) {
        TikaTaskTimeout tikaTaskTimeout = (TikaTaskTimeout) parseContext.get(TikaTaskTimeout.class);
        return tikaTaskTimeout == null ? j10 : tikaTaskTimeout.getTimeoutMillis();
    }
}
