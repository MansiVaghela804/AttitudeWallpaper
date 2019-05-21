package com.example.attitudewallpaper.Api_Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryResponse extends CommonResponse {
    @SerializedName("image_list")
    @Expose
    private List<ImageList> imageList = null;
    
    public List<ImageList> getImageList() {
        return imageList;
    }

    public void setImageList(List<ImageList> imageList) {
        this.imageList = imageList;
    }
    public class ImageList {

        @SerializedName("category_id")
        @Expose
        private String categoryId;
        @SerializedName("image")
        @Expose
        private String image;

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }
}
