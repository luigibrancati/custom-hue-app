package org.apache.tika.renderer;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.utils.ServiceLoaderUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CompositeRenderer implements Renderer, Initializable {
    private Map<MediaType, Renderer> rendererMap;

    public CompositeRenderer(ServiceLoader serviceLoader) {
        this(getDefaultRenderers(serviceLoader));
    }

    private static List<Renderer> getDefaultRenderers(ServiceLoader serviceLoader) {
        List<Renderer> listLoadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(Renderer.class);
        ServiceLoaderUtils.sortLoadedClasses(listLoadStaticServiceProviders);
        return listLoadStaticServiceProviders;
    }

    public Renderer getLeafRenderer(MediaType mediaType) {
        return this.rendererMap.get(mediaType);
    }

    @Override // org.apache.tika.renderer.Renderer
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return this.rendererMap.keySet();
    }

    @Override // org.apache.tika.renderer.Renderer
    public RenderResults render(InputStream inputStream, Metadata metadata, ParseContext parseContext, RenderRequest... renderRequestArr) throws TikaException {
        String str = metadata.get(TikaCoreProperties.TYPE);
        if (str == null) {
            throw new TikaException("need to specify file type in metadata");
        }
        MediaType mediaType = MediaType.parse(str);
        if (mediaType == null) {
            throw new TikaException("can't parse mediaType: " + str);
        }
        Renderer renderer = this.rendererMap.get(mediaType);
        if (renderer != null) {
            return renderer.render(inputStream, metadata, parseContext, renderRequestArr);
        }
        throw new TikaException("I regret I can't find a renderer for " + String.valueOf(mediaType));
    }

    public CompositeRenderer(List<Renderer> list) {
        this.rendererMap = new HashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ParseContext parseContext = new ParseContext();
        for (Renderer renderer : list) {
            Iterator<MediaType> it = renderer.getSupportedTypes(parseContext).iterator();
            while (it.hasNext()) {
                concurrentHashMap.put(it.next(), renderer);
            }
        }
        this.rendererMap = Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) {
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
    }
}
