package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface MAPI {
    public static final String PREFIX_MAPI_ATTACH_META = "mapi:attach:";
    public static final String PREFIX_MAPI_META = "mapi:";
    public static final String PREFIX_MAPI_PROPERTY = "mapi:property:";
    public static final Property MESSAGE_CLASS = Property.internalText("mapi:message-class");
    public static final Property MESSAGE_CLASS_RAW = Property.internalText("mapi:message-class-raw");
    public static final Property SENT_BY_SERVER_TYPE = Property.internalText("mapi:sent-by-server-type");
    public static final Property FROM_REPRESENTING_NAME = Property.internalText("mapi:from-representing-name");
    public static final Property FROM_REPRESENTING_EMAIL = Property.internalText("mapi:from-representing-email");
    public static final Property SUBMISSION_ACCEPTED_AT_TIME = Property.internalDate("mapi:msg-submission-accepted-at-time");
    public static final Property SUBMISSION_ID = Property.internalText("mapi:msg-submission-id");
    public static final Property INTERNET_MESSAGE_ID = Property.internalText("mapi:internet-message-id");
    public static final Property INTERNET_REFERENCES = Property.internalTextBag("mapi:internet-references");
    public static final Property CONVERSATION_TOPIC = Property.internalText("mapi:conversation-topic");
    public static final Property CONVERSATION_INDEX = Property.internalText("mapi:conversation-index");
    public static final Property IN_REPLY_TO_ID = Property.internalText("mapi:in-reply-to-id");
    public static final Property RECIPIENTS_STRING = Property.internalText("mapi:recipients-string");
    public static final Property IMPORTANCE = Property.internalInteger("mapi:importance");
    public static final Property PRIORTY = Property.internalInteger("mapi:priority");
    public static final Property IS_FLAGGED = Property.internalBoolean("mapi:is-flagged");
    public static final Property BODY_TYPES_PROCESSED = Property.internalTextBag("mapi:body-types-processed");
    public static final Property ATTACH_LONG_PATH_NAME = Property.internalText("mapi:attach:long-path-name");
    public static final Property ATTACH_LONG_FILE_NAME = Property.internalText("mapi:attach:long-file-name");
    public static final Property ATTACH_FILE_NAME = Property.internalText("mapi:attach:file-name");
    public static final Property ATTACH_CONTENT_ID = Property.internalText("mapi:attach:content-id");
    public static final Property ATTACH_CONTENT_LOCATION = Property.internalText("mapi:attach:content-location");
    public static final Property ATTACH_DISPLAY_NAME = Property.internalText("mapi:attach:display-name");
    public static final Property ATTACH_EXTENSION = Property.internalText("mapi:attach:extension");
    public static final Property ATTACH_MIME = Property.internalText("mapi:attach:mime");
    public static final Property ATTACH_LANGUAGE = Property.internalText("mapi:attach:language");
}
