package com.eddamghi.eddamghi.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FirstEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "first_attribute")
    public String firstAttribute;

    @ColumnInfo(name = "second_attribute")
    public String secondAttribute;
    @ColumnInfo(name = "date")
    public String date;

    public FirstEntity() {
    }
    public FirstEntity(String firstAttribute, String secondAttribute, String date) {
        this.firstAttribute = firstAttribute;
        this.secondAttribute = secondAttribute;
        this.date = date;
    }

    @Override
    public String toString() {
        return "FirstEntity{" +
                "id=" + id +
                ", firstAttribute='" + firstAttribute + '\'' +
                ", secondAttribute='" + secondAttribute + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
