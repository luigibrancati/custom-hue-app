package org.apache.tika.fork;

import java.io.Serializable;
import java.util.Map;
import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.ParserFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ParserFactoryFactory implements Serializable {
    private static final long serialVersionUID = 4710974869988895410L;
    private final Map<String, String> args;
    private final String className;

    public ParserFactoryFactory(String str, Map<String, String> map) {
        this.className = str;
        this.args = map;
    }

    public ParserFactory build() throws TikaException {
        try {
            return (ParserFactory) Class.forName(this.className).getConstructor(Map.class).newInstance(this.args);
        } catch (IllegalStateException | ReflectiveOperationException e10) {
            throw new TikaException("Couldn't create factory", e10);
        }
    }
}
