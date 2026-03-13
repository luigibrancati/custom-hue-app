package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import io.sentry.android.core.internal.util.ContentProviderSecurityChecker;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
abstract class EmptySecureContentProvider extends ContentProvider {
    private final ContentProviderSecurityChecker securityChecker = new ContentProviderSecurityChecker();

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        this.securityChecker.checkPrivilegeEscalation(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        this.securityChecker.checkPrivilegeEscalation(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.securityChecker.checkPrivilegeEscalation(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.securityChecker.checkPrivilegeEscalation(this);
        return 0;
    }
}
