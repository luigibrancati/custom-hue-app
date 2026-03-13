package B7;

import android.content.res.AssetManager;
import io.flutter.embedding.android.KeyboardMap;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z7.C6531c;

/* JADX INFO: renamed from: B7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0700h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6531c f741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public XmlPullParser f742b;

    public C0700h(C6531c c6531c) {
        this.f741a = c6531c;
    }

    public final long a() throws XmlPullParserException, IOException {
        if (this.f742b == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        while (true) {
            int next = this.f742b.next();
            if (next != 2) {
                if (next == 1) {
                    break;
                }
            } else if (this.f742b.getName().equals("manifest")) {
                String attributeValue = this.f742b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.f742b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i10 = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i10;
                    }
                    try {
                        return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) i10) & KeyboardMap.kValueMask);
                    } catch (NumberFormatException e10) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e10.getMessage()));
                    }
                } catch (NumberFormatException e11) {
                    throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e11.getMessage()));
                }
            }
        }
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void b(AssetManager assetManager, File file) {
        this.f742b = assetManager.openXmlResourceParser(C6531c.b(assetManager, file), "AndroidManifest.xml");
    }
}
