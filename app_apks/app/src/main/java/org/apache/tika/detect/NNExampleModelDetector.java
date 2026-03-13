package org.apache.tika.detect;

import af.c;
import af.e;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Objects;
import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class NNExampleModelDetector extends TrainedModelDetector {
    private static final String EXAMPLE_NNMODEL_FILE = "tika-example.nnmodel";
    private static final c LOG = e.l(NNExampleModelDetector.class);
    private static final long serialVersionUID = 1;

    public NNExampleModelDetector() {
    }

    private void readDescription(NNTrainedModelBuilder nNTrainedModelBuilder, String str) {
        String[] strArrSplit = str.split("\t");
        try {
            MediaType mediaType = MediaType.parse(strArrSplit[1]);
            int i10 = Integer.parseInt(strArrSplit[2]);
            int i11 = Integer.parseInt(strArrSplit[3]);
            int i12 = Integer.parseInt(strArrSplit[4]);
            nNTrainedModelBuilder.setNumOfInputs(i10);
            nNTrainedModelBuilder.setNumOfHidden(i11);
            nNTrainedModelBuilder.setNumOfOutputs(i12);
            nNTrainedModelBuilder.setType(mediaType);
        } catch (Exception e10) {
            LOG.l("Unable to parse the model configuration", e10);
            throw new RuntimeException("Unable to parse the model configuration", e10);
        }
    }

    private void readNNParams(NNTrainedModelBuilder nNTrainedModelBuilder, String str) {
        String[] strArrSplit = str.split("\t");
        float[] fArr = new float[strArrSplit.length];
        try {
            int i10 = 0;
            for (String str2 : strArrSplit) {
                fArr[i10] = Float.parseFloat(str2);
                i10++;
            }
            nNTrainedModelBuilder.setParams(fArr);
        } catch (Exception e10) {
            LOG.l("Unable to parse the model configuration", e10);
            throw new RuntimeException("Unable to parse the model configuration", e10);
        }
    }

    @Override // org.apache.tika.detect.TrainedModelDetector
    public void loadDefaultModels(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        NNTrainedModelBuilder nNTrainedModelBuilder = new NNTrainedModelBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                String strTrim = line.trim();
                if (strTrim.startsWith("#")) {
                    readDescription(nNTrainedModelBuilder, strTrim);
                } else {
                    readNNParams(nNTrainedModelBuilder, strTrim);
                    super.registerModels(nNTrainedModelBuilder.getType(), nNTrainedModelBuilder.build());
                }
            } catch (IOException e10) {
                throw new RuntimeException("Unable to read the default media type registry", e10);
            }
        }
    }

    public NNExampleModelDetector(Path path) {
        loadDefaultModels(path);
    }

    public NNExampleModelDetector(File file) {
        loadDefaultModels(file);
    }

    @Override // org.apache.tika.detect.TrainedModelDetector
    public void loadDefaultModels(ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = TrainedModelDetector.class.getClassLoader();
        }
        String str = TrainedModelDetector.class.getPackage().getName().replace('.', JsonPointer.SEPARATOR) + "/";
        URL resource = classLoader.getResource(str + EXAMPLE_NNMODEL_FILE);
        Objects.requireNonNull(resource, "required resource " + str + "tika-example.nnmodel not found");
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(resource);
            try {
                loadDefaultModels(inputStreamOpenStream);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new RuntimeException("Unable to read the default media type registry", e10);
        }
    }
}
