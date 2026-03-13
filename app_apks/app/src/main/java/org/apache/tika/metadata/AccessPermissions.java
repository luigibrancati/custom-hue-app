package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface AccessPermissions {
    public static final String PREFIX = "access_permission:";
    public static final Property CAN_MODIFY = Property.externalTextBag("access_permission:can_modify");
    public static final Property EXTRACT_CONTENT = Property.externalText("access_permission:extract_content");
    public static final Property EXTRACT_FOR_ACCESSIBILITY = Property.externalText("access_permission:extract_for_accessibility");
    public static final Property ASSEMBLE_DOCUMENT = Property.externalText("access_permission:assemble_document");
    public static final Property FILL_IN_FORM = Property.externalText("access_permission:fill_in_form");
    public static final Property CAN_MODIFY_ANNOTATIONS = Property.externalText("access_permission:modify_annotations");
    public static final Property CAN_PRINT = Property.externalText("access_permission:can_print");
    public static final Property CAN_PRINT_FAITHFUL = Property.externalText("access_permission:can_print_faithful");
}
