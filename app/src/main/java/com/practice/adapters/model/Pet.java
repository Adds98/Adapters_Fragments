package com.practice.adapters.model;

import android.net.Uri;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;
import com.practice.adapters.utils.Convert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@IgnoreExtraProperties
public class Pet {
    private String name, information, uid;
    private List<String> images;
    private List<String> badges;
    private List<Behavioral> behaviors;
    private User user;
    private Category category;
    private Sex sex;
    private Location location;

    @Exclude
    private List<Uri> photos;

    public Pet() {
        //DataSnapshot.getValue(Pet.class)
        photos = new ArrayList<>();
    }

    public Pet(String name, String information, List<Uri> photos, List<String> badges, List<Behavioral> behaviors) {
        this.name = name;
        this.information = information;
        this.photos = photos;
        this.badges = badges;
        this.behaviors = behaviors;
    }

    public Pet(String name, String information, List<Uri> photos, List<String> badges, List<Behavioral> behaviors, User user) {
        this.name = name;
        this.information = information;
        this.photos = photos;
        this.badges = badges;
        this.behaviors = behaviors;
        this.user = user;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public List<String> getBadges() {
        return badges;
    }

    public void setBadges(List<String> badges) {
        this.badges = badges;
    }

    public List<Behavioral> getBehaviors() {
        return behaviors;
    }

    public void setBehaviors(List<Behavioral> behaviors) {
        this.behaviors = behaviors;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uidPet) {
        this.uid = uidPet;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getImages() {
        return images;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }


    @Exclude
    public List<Uri> getPhotos() {
        if(photos.size() != images.size())
            photos = Convert.stringsToUris(images);
        return photos;
    }
    @Exclude
    public void setPhotos(List<Uri> photos) {
        this.photos = photos;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid",uid);
        map.put("name",name);
        map.put("information",information);
        map.put("category",category);
        map.put("user", user);
        map.put("sex", sex);
        map.put("badges", badges);
        map.put("behaviors", behaviors);
        map.put("images", Convert.urisToStrings(photos));
        map.put("location", location);
        return map;
    }


    @Exclude
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return uid.equals(pet.uid);
    }

    @Exclude
    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
}
