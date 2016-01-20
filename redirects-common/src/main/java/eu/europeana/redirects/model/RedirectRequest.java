package eu.europeana.redirects.model;

import eu.europeana.redirects.params.QualifiedFieldName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

/**
 * A redirect request
 * Created by ymamakis on 1/13/16.
 */
@XmlRootElement
public class RedirectRequest {
    @XmlElement
    private String europeanaId;
    @XmlElement
    private String fieldName;
    @XmlElement
    private String fieldValue;
    @XmlElement
    private Map<String,String> parameters;

    @XmlElement

    private String collection;

    public Map<String, String> getParameters() {
        return parameters;
    }


    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }


    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getEuropeanaId() {
        return europeanaId;
    }

    public void setEuropeanaId(String europeanaId) {
        this.europeanaId = europeanaId;
    }
}
