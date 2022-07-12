package com.dapperartisancompany.a20220712_kennnaoji_nycschools;

import com.google.gson.annotations.SerializedName;

public class Results {

    //used for hide and show of scores
    private boolean expandable;
    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    //api database columns
    @SerializedName("school_name")
    private String school_name;

    @SerializedName("sat_math_avg_score")
    private String math_score;

    @SerializedName("sat_critical_reading_avg_score")
    private String read_score;

    @SerializedName("sat_writing_avg_score")
    private String writing_score;

    // retrieving and assigning values
    public String getName() { return school_name; }
    public String getMathScore() {
        return math_score;
    }
    public String getReadingScore() {
        return read_score;
    }
    public String getWritingScore() {
        return writing_score;
    }
}
