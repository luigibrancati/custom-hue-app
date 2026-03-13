package org.apache.tika.detect;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class CompositeDetector implements Detector {
    private static final long serialVersionUID = 5980683158436430252L;
    private final List<Detector> detectors;
    private final MediaTypeRegistry registry;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeDetector(MediaTypeRegistry mediaTypeRegistry, List<Detector> list, Collection<Class<? extends Detector>> collection) {
        if (collection == null || collection.isEmpty()) {
            this.detectors = list;
        } else {
            this.detectors = new ArrayList();
            for (Detector detector : list) {
                if (!isExcluded(collection, detector.getClass())) {
                    this.detectors.add(detector);
                }
            }
        }
        this.registry = mediaTypeRegistry;
    }

    private boolean assignableFrom(Collection<Class<? extends Detector>> collection, Class<? extends Detector> cls) {
        Iterator<Class<? extends Detector>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    private static MediaType detectOverrides(Metadata metadata) {
        MediaType mediaType;
        MediaType mediaType2;
        String str = metadata.get(TikaCoreProperties.CONTENT_TYPE_USER_OVERRIDE);
        if (!StringUtils.isBlank(str) && (mediaType2 = MediaType.parse(str)) != null) {
            return mediaType2;
        }
        String str2 = metadata.get(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE);
        if (StringUtils.isBlank(str2) || (mediaType = MediaType.parse(str2)) == null) {
            return null;
        }
        return mediaType;
    }

    private boolean isExcluded(Collection<Class<? extends Detector>> collection, Class<? extends Detector> cls) {
        return collection.contains(cls) || assignableFrom(collection, cls);
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        MediaType mediaTypeDetectOverrides = detectOverrides(metadata);
        if (mediaTypeDetectOverrides != null) {
            return mediaTypeDetectOverrides;
        }
        MediaType mediaType = MediaType.OCTET_STREAM;
        Iterator<Detector> it = getDetectors().iterator();
        while (it.hasNext()) {
            MediaType mediaTypeDetect = it.next().detect(inputStream, metadata);
            if (this.registry.isSpecializationOf(mediaTypeDetect, mediaType)) {
                mediaType = mediaTypeDetect;
            }
        }
        return mediaType;
    }

    public List<Detector> getDetectors() {
        return Collections.unmodifiableList(this.detectors);
    }

    public CompositeDetector(MediaTypeRegistry mediaTypeRegistry, List<Detector> list) {
        this(mediaTypeRegistry, list, null);
    }

    public CompositeDetector(List<Detector> list) {
        this(new MediaTypeRegistry(), list);
    }

    public CompositeDetector(Detector... detectorArr) {
        this((List<Detector>) Arrays.asList(detectorArr));
    }
}
