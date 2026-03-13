package io.sentry;

import io.sentry.protocol.ViewHierarchy;
import java.io.File;
import java.util.concurrent.Callable;
import org.apache.tika.mime.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Attachment {
    private static final String DEFAULT_ATTACHMENT_TYPE = "event.attachment";
    private static final String VIEW_HIERARCHY_ATTACHMENT_TYPE = "event.view_hierarchy";
    private final boolean addToTransactions;
    private String attachmentType;
    private final Callable<byte[]> byteProvider;
    private byte[] bytes;
    private final String contentType;
    private final String filename;
    private String pathname;
    private final JsonSerializable serializable;

    public Attachment(byte[] bArr, String str) {
        this(bArr, str, (String) null);
    }

    public static Attachment fromByteProvider(Callable<byte[]> callable, String str, String str2, boolean z10) {
        return new Attachment(callable, str, str2, DEFAULT_ATTACHMENT_TYPE, z10);
    }

    public static Attachment fromScreenshot(byte[] bArr) {
        return new Attachment(bArr, "screenshot.png", "image/png", false);
    }

    public static Attachment fromThreadDump(byte[] bArr) {
        return new Attachment(bArr, "thread-dump.txt", MimeTypes.PLAIN_TEXT, false);
    }

    public static Attachment fromViewHierarchy(ViewHierarchy viewHierarchy) {
        return new Attachment((JsonSerializable) viewHierarchy, "view-hierarchy.json", "application/json", VIEW_HIERARCHY_ATTACHMENT_TYPE, false);
    }

    public String getAttachmentType() {
        return this.attachmentType;
    }

    public Callable<byte[]> getByteProvider() {
        return this.byteProvider;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getPathname() {
        return this.pathname;
    }

    public JsonSerializable getSerializable() {
        return this.serializable;
    }

    public boolean isAddToTransactions() {
        return this.addToTransactions;
    }

    public Attachment(byte[] bArr, String str, String str2) {
        this(bArr, str, str2, false);
    }

    public Attachment(byte[] bArr, String str, String str2, boolean z10) {
        this(bArr, str, str2, DEFAULT_ATTACHMENT_TYPE, z10);
    }

    public Attachment(byte[] bArr, String str, String str2, String str3, boolean z10) {
        this.bytes = bArr;
        this.serializable = null;
        this.byteProvider = null;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z10;
    }

    public Attachment(JsonSerializable jsonSerializable, String str, String str2, String str3, boolean z10) {
        this.bytes = null;
        this.serializable = jsonSerializable;
        this.byteProvider = null;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z10;
    }

    public Attachment(Callable<byte[]> callable, String str, String str2, String str3, boolean z10) {
        this.bytes = null;
        this.serializable = null;
        this.byteProvider = callable;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z10;
    }

    public Attachment(String str) {
        this(str, new File(str).getName());
    }

    public Attachment(String str, String str2) {
        this(str, str2, (String) null);
    }

    public Attachment(String str, String str2, String str3) {
        this(str, str2, str3, DEFAULT_ATTACHMENT_TYPE, false);
    }

    public Attachment(String str, String str2, String str3, String str4, boolean z10) {
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.byteProvider = null;
        this.contentType = str3;
        this.attachmentType = str4;
        this.addToTransactions = z10;
    }

    public Attachment(String str, String str2, String str3, boolean z10) {
        this.attachmentType = DEFAULT_ATTACHMENT_TYPE;
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.byteProvider = null;
        this.contentType = str3;
        this.addToTransactions = z10;
    }

    public Attachment(String str, String str2, String str3, boolean z10, String str4) {
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.byteProvider = null;
        this.contentType = str3;
        this.addToTransactions = z10;
        this.attachmentType = str4;
    }
}
