package org.apache.tika.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.xml.sax.ContentHandler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class RegexCaptureParser implements Parser, Initializable {
    private static final Set<MediaType> SUPPORTED_TYPES = Collections.singleton(MediaType.TEXT_PLAIN);
    private Map<String, Pattern> captureMap = new HashMap();
    private Map<String, Pattern> matchMap = new HashMap();
    private boolean writeContent = false;

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return SUPPORTED_TYPES;
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            HashMap map = new HashMap();
            for (Map.Entry<String, Pattern> entry : this.captureMap.entrySet()) {
                map.put(entry.getKey(), entry.getValue().matcher(""));
            }
            HashMap map2 = new HashMap();
            for (Map.Entry<String, Pattern> entry2 : this.matchMap.entrySet()) {
                map2.put(entry2.getKey(), entry2.getValue().matcher(""));
            }
            HashMap map3 = new HashMap();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                for (Map.Entry entry3 : map.entrySet()) {
                    Matcher matcher = (Matcher) entry3.getValue();
                    if (matcher.reset(line).find()) {
                        String strGroup = matcher.group(1);
                        Set linkedHashSet = (Set) map3.get(entry3.getKey());
                        if (linkedHashSet == null) {
                            linkedHashSet = new LinkedHashSet();
                            map3.put((String) entry3.getKey(), linkedHashSet);
                        }
                        linkedHashSet.add(strGroup);
                    }
                }
                for (Map.Entry entry4 : map2.entrySet()) {
                    if (((Matcher) entry4.getValue()).reset(line).find()) {
                        metadata.set((String) entry4.getKey(), "true");
                    }
                }
                if (this.writeContent) {
                    char[] charArray = line.toCharArray();
                    contentHandler.characters(charArray, 0, charArray.length);
                }
            }
            for (Map.Entry entry5 : map3.entrySet()) {
                Iterator it = ((Set) entry5.getValue()).iterator();
                while (it.hasNext()) {
                    metadata.add((String) entry5.getKey(), (String) it.next());
                }
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Field
    public void setCaptureMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.captureMap.put(entry.getKey(), Pattern.compile(entry.getValue()));
        }
    }

    @Field
    public void setMatchMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.matchMap.put(entry.getKey(), Pattern.compile(entry.getValue()));
        }
    }

    @Field
    public void setWriteContent(boolean z10) {
        this.writeContent = z10;
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) {
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
    }
}
