package io.sentry.ndk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface INativeScope {
    void addBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    void removeExtra(String str);

    void removeTag(String str);

    void removeUser();

    void setExtra(String str, String str2);

    void setTag(String str, String str2);

    void setTrace(String str, String str2);

    void setUser(String str, String str2, String str3, String str4);
}
