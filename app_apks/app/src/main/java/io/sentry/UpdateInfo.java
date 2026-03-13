package io.sentry;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class UpdateInfo {
    private final String appName;
    private final int buildNumber;
    private final String buildVersion;
    private final String createdDate;
    private final String downloadUrl;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f38459id;
    private final List<String> installGroups;

    public UpdateInfo(String str, String str2, int i10, String str3, String str4, String str5, List<String> list) {
        this.f38459id = str;
        this.buildVersion = str2;
        this.buildNumber = i10;
        this.downloadUrl = str3;
        this.appName = str4;
        this.createdDate = str5;
        this.installGroups = list;
    }

    public String getAppName() {
        return this.appName;
    }

    public int getBuildNumber() {
        return this.buildNumber;
    }

    public String getBuildVersion() {
        return this.buildVersion;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getId() {
        return this.f38459id;
    }

    public List<String> getInstallGroups() {
        return this.installGroups;
    }

    public String toString() {
        return "UpdateInfo{id='" + this.f38459id + "', buildVersion='" + this.buildVersion + "', buildNumber=" + this.buildNumber + ", downloadUrl='" + this.downloadUrl + "', appName='" + this.appName + "', createdDate='" + this.createdDate + "', installGroups=" + this.installGroups + '}';
    }
}
