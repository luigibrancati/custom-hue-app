package io.sentry.transport;

import java.net.Authenticator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class AuthenticatorWrapper {
    private static final AuthenticatorWrapper instance = new AuthenticatorWrapper();

    private AuthenticatorWrapper() {
    }

    public static AuthenticatorWrapper getInstance() {
        return instance;
    }

    public void setDefault(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
