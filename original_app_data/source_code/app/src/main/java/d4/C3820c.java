package d4;

import Fe.v;
import a4.InterfaceC2641a;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import j4.AbstractC4689h;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: d4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3820c implements InterfaceC3824g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33106a;

    public C3820c(Context context) {
        AbstractC4862t.e(context, "context");
        this.f33106a = context;
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(InterfaceC2641a interfaceC2641a, Uri uri, AbstractC4689h abstractC4689h, c4.i iVar, InterfaceC4988e interfaceC4988e) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        if (f(uri)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f33106a.getContentResolver().openAssetFileDescriptor(uri, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor == null ? null : assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else {
            inputStreamOpenInputStream = this.f33106a.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new m(v.c(v.j(inputStreamOpenInputStream)), this.f33106a.getContentResolver().getType(uri), c4.b.DISK);
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri data) {
        AbstractC4862t.e(data, "data");
        return AbstractC4862t.a(data.getScheme(), "content");
    }

    public final boolean f(Uri data) {
        AbstractC4862t.e(data, "data");
        return AbstractC4862t.a(data.getAuthority(), "com.android.contacts") && AbstractC4862t.a(data.getLastPathSegment(), "display_photo");
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String b(Uri data) {
        AbstractC4862t.e(data, "data");
        String string = data.toString();
        AbstractC4862t.d(string, "data.toString()");
        return string;
    }
}
