package org.apache.tika.pipes.fetcher;

import org.apache.tika.config.Field;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractFetcher implements Fetcher {
    private String name;

    public AbstractFetcher() {
    }

    @Override // org.apache.tika.pipes.fetcher.Fetcher
    public String getName() {
        return this.name;
    }

    @Field
    public void setName(String str) {
        this.name = str;
    }

    public AbstractFetcher(String str) {
        this.name = str;
    }
}
