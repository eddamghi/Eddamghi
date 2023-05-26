package com.eddamghi.eddamghi.entities;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface FirstEntityDAO {
    @Query("SELECT * FROM firstentity")
    List<FirstEntity> getAll();

    @Query("SELECT * FROM firstentity WHERE id IN (:ids)")
    List<FirstEntity> getAllByIds(int[] ids);

    @Query("SELECT * FROM firstentity WHERE first_attribute LIKE :first AND " +
            "second_attribute LIKE :second LIMIT 1")
    FirstEntity findByFirstAttribute(String first, String second);

    @Insert
    void insertAll(FirstEntity... entities);

    @Delete
    void delete(FirstEntity entity);

    @Query("DELETE FROM firstentity")
    void deleteAll();
}
