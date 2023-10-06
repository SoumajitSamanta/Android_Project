package com.example.demoapi.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

@SerializedName("results")
@Expose
private List<Result__1> results;
@SerializedName("info")
@Expose
private Info info;

public List<Result__1> getResults() {
return results;
}

public void setResults(List<Result__1> results) {
this.results = results;
}

public Info getInfo() {
return info;
}

public void setInfo(Info info) {
this.info = info;
}

}