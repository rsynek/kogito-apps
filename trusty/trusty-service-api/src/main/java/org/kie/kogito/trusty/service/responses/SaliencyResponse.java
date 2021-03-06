package org.kie.kogito.trusty.service.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SaliencyResponse {

    @JsonProperty("outcomeId")
    private String outcomeId;

    @JsonProperty("outcomeName")
    private String outcomeName;

    @JsonProperty("featureImportance")
    private List<FeatureImportanceResponse> featureImportance;

    private SaliencyResponse() {
    }

    public SaliencyResponse(String outcomeId, String outcomeName, List<FeatureImportanceResponse> featureImportance) {
        this.outcomeId = outcomeId;
        this.outcomeName = outcomeName;
        this.featureImportance = featureImportance;
    }

    public String getOutcomeId() {
        return outcomeId;
    }

    public String getOutcomeName() {
        return outcomeName;
    }

    public List<FeatureImportanceResponse> getFeatureImportance() {
        return featureImportance;
    }
}
