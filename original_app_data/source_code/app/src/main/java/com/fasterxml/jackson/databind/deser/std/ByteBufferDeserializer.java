package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    private static final long serialVersionUID = 1;

    public ByteBufferDeserializer() {
        super((Class<?>) ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ByteBuffer.wrap(jsonParser.getBinaryValue());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ByteBuffer byteBuffer) throws IOException {
        ByteBufferBackedOutputStream byteBufferBackedOutputStream = new ByteBufferBackedOutputStream(byteBuffer);
        jsonParser.readBinaryValue(deserializationContext.getBase64Variant(), byteBufferBackedOutputStream);
        byteBufferBackedOutputStream.close();
        return byteBuffer;
    }
}
