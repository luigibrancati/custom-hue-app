package org.apache.tika.pipes.fetcher.config;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FetcherConfigContainer {
    private String configClassName;
    private String json;

    public String getConfigClassName() {
        return this.configClassName;
    }

    public String getJson() {
        return this.json;
    }

    public FetcherConfigContainer setConfigClassName(String str) {
        this.configClassName = str;
        return this;
    }

    public FetcherConfigContainer setJson(String str) {
        this.json = str;
        return this;
    }
}
