package org.apache.tika.config;

import af.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface LoadErrorHandler {
    public static final LoadErrorHandler IGNORE = new LoadErrorHandler() { // from class: org.apache.tika.config.LoadErrorHandler.1
        public String toString() {
            return "IGNORE";
        }

        @Override // org.apache.tika.config.LoadErrorHandler
        public void handleLoadError(String str, Throwable th) {
        }
    };
    public static final LoadErrorHandler WARN = new LoadErrorHandler() { // from class: org.apache.tika.config.LoadErrorHandler.2
        @Override // org.apache.tika.config.LoadErrorHandler
        public void handleLoadError(String str, Throwable th) {
            e.m(str).i("Unable to load {}", str, th);
        }

        public String toString() {
            return "WARN";
        }
    };
    public static final LoadErrorHandler THROW = new LoadErrorHandler() { // from class: org.apache.tika.config.LoadErrorHandler.3
        @Override // org.apache.tika.config.LoadErrorHandler
        public void handleLoadError(String str, Throwable th) {
            throw new RuntimeException("Unable to load " + str, th);
        }

        public String toString() {
            return "THROW";
        }
    };

    void handleLoadError(String str, Throwable th);
}
