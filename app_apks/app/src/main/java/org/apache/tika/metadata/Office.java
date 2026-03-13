package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Office {
    public static final String NAMESPACE_URI_DOC_META = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0";
    public static final String PREFIX_DOC_META = "meta";
    public static final String USER_DEFINED_METADATA_NAME_PREFIX = "custom:";
    public static final Property KEYWORDS = Property.composite(Property.internalTextBag("meta:keyword"), new Property[]{DublinCore.SUBJECT});
    public static final Property INITIAL_AUTHOR = Property.internalText("meta:initial-author");
    public static final Property LAST_AUTHOR = Property.internalText("meta:last-author");
    public static final Property AUTHOR = Property.internalTextBag("meta:author");
    public static final Property CREATION_DATE = Property.internalDate("meta:creation-date");
    public static final Property SAVE_DATE = Property.internalDate("meta:save-date");
    public static final Property PRINT_DATE = Property.internalDate("meta:print-date");
    public static final Property SLIDE_COUNT = Property.internalInteger("meta:slide-count");
    public static final Property PAGE_COUNT = Property.internalInteger("meta:page-count");
    public static final Property PARAGRAPH_COUNT = Property.internalInteger("meta:paragraph-count");
    public static final Property LINE_COUNT = Property.internalInteger("meta:line-count");
    public static final Property WORD_COUNT = Property.internalInteger("meta:word-count");
    public static final Property CHARACTER_COUNT = Property.internalInteger("meta:character-count");
    public static final Property CHARACTER_COUNT_WITH_SPACES = Property.internalInteger("meta:character-count-with-spaces");
    public static final Property TABLE_COUNT = Property.internalInteger("meta:table-count");
    public static final Property IMAGE_COUNT = Property.internalInteger("meta:image-count");
    public static final Property OBJECT_COUNT = Property.internalInteger("meta:object-count");
    public static final Property MAPI_MESSAGE_CLASS = Property.internalClosedChoise("meta:mapi-message-class", "APPOINTMENT", "CONTACT", "NOTE", "STICKY_NOTE", "POST", "TASK", "UNKNOWN", "UNSPECIFIED");
    public static final Property MAPI_SENT_BY_SERVER_TYPE = Property.internalText("meta:mapi-sent-by-server-type");
    public static final Property MAPI_FROM_REPRESENTING_NAME = Property.internalText("meta:mapi-from-representing-name");
    public static final Property MAPI_FROM_REPRESENTING_EMAIL = Property.internalText("meta:mapi-from-representing-email");
    public static final Property MAPI_MESSAGE_CLIENT_SUBMIT_TIME = Property.internalDate("meta:mapi-msg-client-submit-time");
    public static final Property PROG_ID = Property.internalText("msoffice:progID");
    public static final Property OCX_NAME = Property.internalText("msoffice:ocxName");
    public static final Property MAPI_RECIPIENTS_STRING = Property.internalText("meta:mapi-recipients-string");
    public static final Property MAPI_IMPORTANCE = Property.internalInteger("meta:mapi-importance");
    public static final Property MAPI_PRIORTY = Property.internalInteger("meta:mapi-importance");
    public static final Property MAPI_IS_FLAGGED = Property.internalBoolean("meta:mapi-is-flagged");
    public static final Property HAS_HIDDEN_SHEETS = Property.internalBoolean("msoffice:excel:has-hidden-sheets");
    public static final Property HAS_HIDDEN_COLUMNS = Property.internalBoolean("msoffice:excel:has-hidden-cols");
    public static final Property HAS_HIDDEN_ROWS = Property.internalBoolean("msoffice:excel:has-hidden-rows");
    public static final Property HAS_VERY_HIDDEN_SHEETS = Property.internalBoolean("msoffice:excel:has-very-hidden-sheets");
    public static final Property HIDDEN_SHEET_NAMES = Property.internalTextBag("msoffice:excel:hidden-sheet-names");
    public static final Property VERY_HIDDEN_SHEET_NAMES = Property.internalTextBag("msoffice:excel:very-hidden-sheet-names");
    public static final Property PROTECTED_WORKSHEET = Property.internalBoolean("msoffice:excel:protected-worksheet");
    public static final Property WORKBOOK_CODENAME = Property.internalText("msoffice:excel:workbook-codename");
    public static final Property HAS_COMMENTS = Property.internalBoolean("msoffice:has-comments");
    public static final Property COMMENT_PERSONS = Property.internalTextBag("msoffice:comment-person-display-name");
}
