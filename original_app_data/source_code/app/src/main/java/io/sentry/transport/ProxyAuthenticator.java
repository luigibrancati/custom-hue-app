package io.sentry.transport;

import io.sentry.util.Objects;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class ProxyAuthenticator extends Authenticator {
    private final String password;
    private final String user;

    public ProxyAuthenticator(String str, String str2) {
        this.user = (String) Objects.requireNonNull(str, "user is required");
        this.password = (String) Objects.requireNonNull(str2, "password is required");
    }

    public String getPassword() {
        return this.password;
    }

    @Override // java.net.Authenticator
    public PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.user, this.password.toCharArray());
        }
        return null;
    }

    public String getUser() {
        return this.user;
    }
}
