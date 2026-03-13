package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.DataOutputAsStream;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class TokenStreamFactory implements Versioned, Serializable {
    private static final long serialVersionUID = 2;

    public OutputStream _createDataOutputWrapper(DataOutput dataOutput) {
        return new DataOutputAsStream(dataOutput);
    }

    public InputStream _optimizedStreamFromURL(URL url) {
        String host;
        return (!Constants.FILE.equals(url.getProtocol()) || !((host = url.getHost()) == null || host.length() == 0) || url.getPath().indexOf(37) >= 0) ? FirebasePerfUrlConnection.openStream(url) : new FileInputStream(url.getPath());
    }

    public abstract boolean canHandleBinaryNatively();

    public abstract boolean canParseAsync();

    public abstract boolean canUseSchema(FormatSchema formatSchema);

    public abstract JsonGenerator createGenerator(DataOutput dataOutput);

    public abstract JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding);

    public abstract JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding);

    public abstract JsonGenerator createGenerator(OutputStream outputStream);

    public abstract JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding);

    public abstract JsonGenerator createGenerator(Writer writer);

    public abstract JsonParser createNonBlockingByteArrayParser();

    public abstract JsonParser createParser(DataInput dataInput);

    public abstract JsonParser createParser(File file);

    public abstract JsonParser createParser(InputStream inputStream);

    public abstract JsonParser createParser(Reader reader);

    public abstract JsonParser createParser(String str);

    public abstract JsonParser createParser(URL url);

    public abstract JsonParser createParser(byte[] bArr);

    public abstract JsonParser createParser(byte[] bArr, int i10, int i11);

    public abstract JsonParser createParser(char[] cArr);

    public abstract JsonParser createParser(char[] cArr, int i10, int i11);

    public abstract int getFormatGeneratorFeatures();

    public abstract String getFormatName();

    public abstract int getFormatParserFeatures();

    public abstract Class<? extends FormatFeature> getFormatReadFeatureType();

    public abstract Class<? extends FormatFeature> getFormatWriteFeatureType();

    public abstract int getGeneratorFeatures();

    public abstract int getParserFeatures();

    public abstract boolean isEnabled(JsonGenerator.Feature feature);

    public abstract boolean isEnabled(JsonParser.Feature feature);

    public abstract boolean requiresPropertyOrdering();
}
