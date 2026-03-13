package org.apache.tika.pipes.fetcher.fs.config;

import org.apache.tika.pipes.fetcher.config.AbstractConfig;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FileSystemFetcherConfig extends AbstractConfig {
    private String basePath;
    private boolean extractFileSystemMetadata;

    public String getBasePath() {
        return this.basePath;
    }

    public boolean isExtractFileSystemMetadata() {
        return this.extractFileSystemMetadata;
    }

    public FileSystemFetcherConfig setBasePath(String str) {
        this.basePath = str;
        return this;
    }

    public FileSystemFetcherConfig setExtractFileSystemMetadata(boolean z10) {
        this.extractFileSystemMetadata = z10;
        return this;
    }
}
