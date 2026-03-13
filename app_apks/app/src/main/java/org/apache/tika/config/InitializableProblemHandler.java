package org.apache.tika.config;

import af.e;
import org.apache.tika.exception.TikaConfigException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InitializableProblemHandler {
    public static final InitializableProblemHandler DEFAULT;
    public static final InitializableProblemHandler IGNORE = new InitializableProblemHandler() { // from class: org.apache.tika.config.InitializableProblemHandler.1
        public String toString() {
            return "IGNORE";
        }

        @Override // org.apache.tika.config.InitializableProblemHandler
        public void handleInitializableProblem(String str, String str2) {
        }
    };
    public static final InitializableProblemHandler INFO = new InitializableProblemHandler() { // from class: org.apache.tika.config.InitializableProblemHandler.2
        @Override // org.apache.tika.config.InitializableProblemHandler
        public void handleInitializableProblem(String str, String str2) {
            e.m(str).b(str2);
        }

        public String toString() {
            return "INFO";
        }
    };
    public static final InitializableProblemHandler THROW;
    public static final InitializableProblemHandler WARN;

    static {
        InitializableProblemHandler initializableProblemHandler = new InitializableProblemHandler() { // from class: org.apache.tika.config.InitializableProblemHandler.3
            @Override // org.apache.tika.config.InitializableProblemHandler
            public void handleInitializableProblem(String str, String str2) {
                e.m(str).c(str2);
            }

            public String toString() {
                return "WARN";
            }
        };
        WARN = initializableProblemHandler;
        THROW = new InitializableProblemHandler() { // from class: org.apache.tika.config.InitializableProblemHandler.4
            @Override // org.apache.tika.config.InitializableProblemHandler
            public void handleInitializableProblem(String str, String str2) throws TikaConfigException {
                throw new TikaConfigException(str2);
            }

            public String toString() {
                return "THROW";
            }
        };
        DEFAULT = initializableProblemHandler;
    }

    void handleInitializableProblem(String str, String str2);
}
