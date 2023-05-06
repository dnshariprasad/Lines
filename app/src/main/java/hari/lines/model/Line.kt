package hari.lines.model

import com.google.gson.annotations.SerializedName

class Line(
    @SerializedName("id") val id: String,
    @SerializedName("userId") val userId: String,
    @SerializedName("title") val title: String,
    @SerializedName("completed") val completed: String
)
