package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class NotificationChannelGroupDetails implements Serializable {
    private static final String DESCRIPTION = "description";
    private static final String ID = "id";
    private static final String NAME = "name";
    public String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f28885id;
    public String name;

    public static NotificationChannelGroupDetails from(Map<String, Object> map) {
        NotificationChannelGroupDetails notificationChannelGroupDetails = new NotificationChannelGroupDetails();
        notificationChannelGroupDetails.f28885id = (String) map.get("id");
        notificationChannelGroupDetails.name = (String) map.get("name");
        notificationChannelGroupDetails.description = (String) map.get("description");
        return notificationChannelGroupDetails;
    }
}
